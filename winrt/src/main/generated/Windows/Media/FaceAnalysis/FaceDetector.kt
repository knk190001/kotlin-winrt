package Windows.Media.FaceAnalysis

import Windows.Graphics.Imaging.BitmapPixelFormat
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

@ABIMarker(FaceDetector.ABI::class)
@Signature("rc(Windows.Media.FaceAnalysis.FaceDetector;{16b672dc-fe6f-3117-8d95-c3f04d51630c})")
@WinRTByReference(brClass = FaceDetector.ByReference::class)
public class FaceDetector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFaceDetector.WithDefault, IWinRTObject {
  private val __523204382_Interface: IFaceDetector.WithDefault by lazy {
    as_523204382()
  }


  public override val __523204382_Ptr: JNAPointer? by lazy {
    __523204382_Interface.__523204382_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__523204382_Interface)

  private fun as_523204382(): IFaceDetector.WithDefault {
    if(pointer == NULL) {
      return(IFaceDetector.ABI.makeIFaceDetector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFaceDetector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFaceDetector.ABI.makeIFaceDetector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FaceDetector> {
    public override fun getValue() = FaceDetector(pointer.getPointer(0))

    public fun setValue(value: FaceDetector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FaceDetector, MemoryAddress> {
    public val IFaceDetectorStatics_Instance: IFaceDetectorStatics by lazy {
      createIFaceDetectorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFaceDetectorStatics(): IFaceDetectorStatics {
      val refiid = Guid.REFIID(IFaceDetectorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.FaceAnalysis.FaceDetector".toHandle(),refiid,interfacePtr)
      val result = IFaceDetectorStatics.ABI.makeIFaceDetectorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FaceDetector {
      val address = segment.toRawLongValue()
      return FaceDetector(Pointer(address))
    }

    public override fun toNative(obj: FaceDetector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync() = ABI.IFaceDetectorStatics_Instance.CreateAsync()

    public fun GetSupportedBitmapPixelFormats() =
        ABI.IFaceDetectorStatics_Instance.GetSupportedBitmapPixelFormats()

    public fun IsBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat) =
        ABI.IFaceDetectorStatics_Instance.IsBitmapPixelFormatSupported(bitmapPixelFormat)

    public fun get_IsSupported() = ABI.IFaceDetectorStatics_Instance.get_IsSupported()
  }
}
