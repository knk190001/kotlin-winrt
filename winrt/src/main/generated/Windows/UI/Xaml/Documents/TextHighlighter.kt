package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.Documents.ITextHighlighterFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TextHighlighter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.TextHighlighter;{ba6cb54b-7d75-4535-b30d-a81a00b637a4})")
@WinRTByReference(brClass = TextHighlighter.ByReference::class)
public open class TextHighlighter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextHighlighter.WithDefault, IWinRTObject {
  private val __499205580_Interface: ITextHighlighter.WithDefault by lazy {
    as_499205580()
  }


  public override val __499205580_Ptr: JNAPointer? by lazy {
    __499205580_Interface.__499205580_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__499205580_Interface)

  public constructor() : this(ABI.activate())

  private fun as_499205580(): ITextHighlighter.WithDefault {
    if(pointer == NULL) {
      return(ITextHighlighter.ABI.makeITextHighlighter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextHighlighter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextHighlighter.ABI.makeITextHighlighter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextHighlighter> {
    public override fun getValue() = TextHighlighter(pointer.getPointer(0))

    public fun setValue(value: TextHighlighter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextHighlighter, MemoryAddress> {
    public val ITextHighlighterStatics_Instance: ITextHighlighterStatics by lazy {
      createITextHighlighterStatics()
    }


    public val ITextHighlighterFactory_Instance: ITextHighlighterFactory by lazy {
      createITextHighlighterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextHighlighterStatics(): ITextHighlighterStatics {
      val refiid = Guid.REFIID(ITextHighlighterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextHighlighter".toHandle(),refiid,interfacePtr)
      val result = ITextHighlighterStatics.ABI.makeITextHighlighterStatics(interfacePtr.value)
      return result
    }

    public fun createITextHighlighterFactory(): ITextHighlighterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.TextHighlighter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextHighlighterFactory.ABI.makeITextHighlighterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITextHighlighterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextHighlighter {
      val address = segment.toRawLongValue()
      return TextHighlighter(Pointer(address))
    }

    public override fun toNative(obj: TextHighlighter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ForegroundProperty() =
        ABI.ITextHighlighterStatics_Instance.get_ForegroundProperty()

    public fun get_BackgroundProperty() =
        ABI.ITextHighlighterStatics_Instance.get_BackgroundProperty()
  }
}
