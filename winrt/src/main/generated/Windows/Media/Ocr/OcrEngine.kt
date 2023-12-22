package Windows.Media.Ocr

import Windows.Globalization.Language
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

@ABIMarker(OcrEngine.ABI::class)
@Signature("rc(Windows.Media.Ocr.OcrEngine;{5a14bc41-5b76-3140-b680-8825562683ac})")
@WinRTByReference(brClass = OcrEngine.ByReference::class)
public class OcrEngine(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOcrEngine.WithDefault, IWinRTObject {
  private val __186464640_Interface: IOcrEngine.WithDefault by lazy {
    as_186464640()
  }


  public override val __186464640_Ptr: JNAPointer? by lazy {
    __186464640_Interface.__186464640_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__186464640_Interface)

  private fun as_186464640(): IOcrEngine.WithDefault {
    if(pointer == NULL) {
      return(IOcrEngine.ABI.makeIOcrEngine(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOcrEngine>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOcrEngine.ABI.makeIOcrEngine(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<OcrEngine> {
    public override fun getValue() = OcrEngine(pointer.getPointer(0))

    public fun setValue(value: OcrEngine): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OcrEngine, MemoryAddress> {
    public val IOcrEngineStatics_Instance: IOcrEngineStatics by lazy {
      createIOcrEngineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOcrEngineStatics(): IOcrEngineStatics {
      val refiid = Guid.REFIID(IOcrEngineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Ocr.OcrEngine".toHandle(),refiid,interfacePtr)
      val result = IOcrEngineStatics.ABI.makeIOcrEngineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): OcrEngine {
      val address = segment.toRawLongValue()
      return OcrEngine(Pointer(address))
    }

    public override fun toNative(obj: OcrEngine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxImageDimension() = ABI.IOcrEngineStatics_Instance.get_MaxImageDimension()

    public fun get_AvailableRecognizerLanguages() =
        ABI.IOcrEngineStatics_Instance.get_AvailableRecognizerLanguages()

    public fun IsLanguageSupported(language: Language) =
        ABI.IOcrEngineStatics_Instance.IsLanguageSupported(language)

    public fun TryCreateFromLanguage(language: Language) =
        ABI.IOcrEngineStatics_Instance.TryCreateFromLanguage(language)

    public fun TryCreateFromUserProfileLanguages() =
        ABI.IOcrEngineStatics_Instance.TryCreateFromUserProfileLanguages()
  }
}
