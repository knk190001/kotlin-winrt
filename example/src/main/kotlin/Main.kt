import Microsoft.UI.Xaml.*
import Windows.AI.MachineLearning.*
import Windows.Data.Json.*
import Windows.Data.Text.SelectableWordSegment
import Windows.Data.Text.SelectableWordSegmentsTokenizingHandler
import Windows.Data.Text.SelectableWordsSegmenter
import Windows.Foundation.*
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Graphics.Imaging.BitmapDecoder
import Windows.Media.VideoFrame
import Windows.Storage.FileAccessMode
import Windows.Storage.StorageFile
import com.github.knk190001.winrtbinding.runtime.WinRT
import com.sun.jna.platform.win32.WinDef
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import java.lang.ref.Reference
import java.nio.file.Path
import kotlin.io.path.pathString
import kotlin.io.path.readLines


fun main() = runBlocking {
    val pid = ProcessHandle.current().pid()
//    println("Pid: $pid")
    WinRT.RoInitialize(1)
    val initializationCallback = ApplicationInitializationCallback {
        println("Start")
        MyApplication()
    }
    Application.Start(initializationCallback)
    Reference.reachabilityFence(initializationCallback.vtbl)
    println("Finish")
}

suspend fun IAsyncAction.await() {
    var completed = false
    this.put_Completed(AsyncActionCompletedHandler { _, status ->
        if (status == AsyncStatus.Completed) {
            completed = true
        }
    })

    while (!completed) {
        if (get_Status() == AsyncStatus.Error || get_Status() == AsyncStatus.Canceled) {
            throw RuntimeException(get_Status().toString())
        }
        yield()
    }
}

private fun jsonTest() {
    val jsonObject = JsonObject()
    val jsonArray = JsonArray()

    (1..10)
        .map(Int::toDouble)
        .map(JsonValue::CreateNumberValue)
        .forEach(jsonArray::Append)

    jsonObject.SetNamedValue("array", jsonArray)
    jsonObject.SetNamedValue("string", JsonValue.CreateStringValue("Hello world!"))
    jsonObject.SetNamedValue("number", JsonValue.CreateNumberValue(10.0))
    jsonObject.SetNamedValue("boolean", JsonValue.CreateBooleanValue(true))
    jsonObject.SetNamedValue("null", JsonValue.CreateNullValue())
    jsonObject.SetNamedValue("nestedObject", JsonObject())

    println(jsonObject.Stringify())
}

private fun segmentTest() {
    val segmenter = SelectableWordsSegmenter("en-US")
    val handler = SelectableWordSegmentsTokenizingHandler { precedingWords: IIterable<SelectableWordSegment?>?,
                                                            words: IIterable<SelectableWordSegment?>? ->
        val precedingWordsIttr = precedingWords!!.First()!!
        while (precedingWordsIttr.get_HasCurrent()) {
            println("Preceding: " + precedingWordsIttr.get_Current()!!.get_Text())
            precedingWordsIttr.MoveNext()
        }

        val wordsItr = words!!.First()!!
        while (wordsItr.get_HasCurrent()) {
            println("Word: " + wordsItr.get_Current()!!.get_Text())
            wordsItr.MoveNext()
        }
    }
    segmenter.Tokenize("Hello World!", WinDef.UINT(0), handler)
}

suspend fun mlTest() {
    val cwd = Path.of(System.getProperty("user.dir"))
    val contentPath = cwd.resolve("winml_content")

    val modelPath = contentPath.resolve("SqueezeNet.onnx")
    val model = loadModel(modelPath)

    val imageFile = contentPath.resolve("kitten_224.png")
    val imageFrame = loadImageFile(imageFile)

    val (session, binding) = bindModel(model, imageFrame)
    val results = evaluateModel(session, binding)

    val labelsPath = contentPath.resolve("Labels.txt")

    val labels = loadLabels(labelsPath)

    printResults(results, labels)
}

fun printResults(results: IVectorView<Float>, labels: Map<Int, List<String>>) {
    results.toArray().zip(labels.entries)
        .map { it.first to it.second.value }
        .sortedBy(Pair<Float?, List<String>>::first)
        .reversed()
        .filterIndexed { index, _ -> index < 20 }
        .forEach {
            println("${it.second.joinToString()}: ${it.first!! * 100f}")
        }
}

inline fun <reified T> IVectorView<T>.toArray(): Array<T?> {
    val result = arrayOfNulls<T>(get_Size().toInt())
    for (i in 0 until this.get_Size().toInt()) {
        result[i] = this.GetAt(WinDef.UINT(i.toLong()))
    }
    return result
}

fun loadLabels(labelsPath: Path): Map<Int, List<String>> {
    return labelsPath.readLines()
        .map { it.split(",") }
        .associate { it[0].toInt() to it.drop(1) }
}

fun evaluateModel(session: LearningModelSession, binding: LearningModelBinding): IVectorView<Float> {
    val results = session.Evaluate(binding, "RunId")!!
    val outputs = results.get_Outputs()!!
    println("Outputs: " + outputs.get_Size())
    val kvp = outputs.First()!!.get_Current()!!
    println("Key: ${kvp.get_Key()}")
    val o = outputs.Lookup("softmaxout_1")!!
    val resultTensor = TensorFloat(o.iUnknown_Ptr)
    return resultTensor.GetAsVectorView()!!
}

suspend fun bindModel(model: LearningModel, imageFrame: VideoFrame): Pair<LearningModelSession, LearningModelBinding> {
    val device = LearningModelDevice(LearningModelDeviceKind.Default)
    val session = LearningModelSession(model, device)
    val binding = LearningModelBinding(session)
    val imageFeatureValue = ImageFeatureValue.CreateFromVideoFrame(imageFrame)!!
    binding.Bind("data_0", imageFeatureValue)
    val shape =
        TensorFloat.CreateFromShapeArrayAndDataArray(
            arrayOf(1L, 1000L, 1L, 1L),
            Array(1000) { 0f }
        )!!

    binding.Bind("softmaxout_1", shape)
    return session to binding
}

suspend fun loadImageFile(imageFile: Path): VideoFrame {
    val file = StorageFile.GetFileFromPathAsync(imageFile.pathString)!!.await()
    val stream = file!!.OpenAsync(FileAccessMode.Read)!!.await()!!
    val decoder = BitmapDecoder.CreateAsync(stream)!!.await()!!
    val softwareBitmap = decoder.GetSoftwareBitmapAsync()!!.await()!!
    return VideoFrame.CreateWithSoftwareBitmap(softwareBitmap)!!
}

suspend inline fun <reified T> IAsyncOperation<T>.await(): T {
    var completed = false
    this.put_Completed(AsyncOperationCompletedHandler<T> { _, status ->
        if (status == AsyncStatus.Completed) {
            completed = true
        }
    })

    while (!completed) {
        if (get_Status() == AsyncStatus.Error || get_Status() == AsyncStatus.Canceled) {
            throw RuntimeException(get_Status().toString())
        }
        yield()
    }

    return this.GetResults()
}

fun loadModel(modelPath: Path): LearningModel {
    return LearningModel.LoadFromFilePath(modelPath.pathString)!!
}