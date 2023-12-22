package Windows.Data.Text

import Windows.Data.Text.IWordsSegmenterFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WordsSegmenter.ABI::class)
@Signature("rc(Windows.Data.Text.WordsSegmenter;{86b4d4d1-b2fe-4e34-a81d-66640300454f})")
@WinRTByReference(brClass = WordsSegmenter.ByReference::class)
public class WordsSegmenter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWordsSegmenter.WithDefault, IWinRTObject {
  private val __1702380742_Interface: IWordsSegmenter.WithDefault by lazy {
    as_1702380742()
  }


  public override val __1702380742_Ptr: JNAPointer? by lazy {
    __1702380742_Interface.__1702380742_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1702380742_Interface)

  public constructor(language: String) : this(ABI.activate(language))

  private fun as_1702380742(): IWordsSegmenter.WithDefault {
    if(pointer == NULL) {
      return(IWordsSegmenter.ABI.makeIWordsSegmenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWordsSegmenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWordsSegmenter.ABI.makeIWordsSegmenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WordsSegmenter>
      {
    public override fun getValue() = WordsSegmenter(pointer.getPointer(0))

    public fun setValue(value: WordsSegmenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WordsSegmenter, MemoryAddress> {
    public val IWordsSegmenterFactory_Instance: IWordsSegmenterFactory by lazy {
      createIWordsSegmenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWordsSegmenterFactory(): IWordsSegmenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.WordsSegmenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWordsSegmenterFactory.ABI.makeIWordsSegmenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String): JNAPointer? =
        IWordsSegmenterFactory_Instance.CreateWithLanguage(language)?.pointer

    public override fun fromNative(segment: MemoryAddress): WordsSegmenter {
      val address = segment.toRawLongValue()
      return WordsSegmenter(Pointer(address))
    }

    public override fun toNative(obj: WordsSegmenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
