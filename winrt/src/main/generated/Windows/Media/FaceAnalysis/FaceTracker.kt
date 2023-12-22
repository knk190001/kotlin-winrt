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

@ABIMarker(FaceTracker.ABI::class)
@Signature("rc(Windows.Media.FaceAnalysis.FaceTracker;{6ba67d8c-a841-4420-93e6-2420a1884fcf})")
@WinRTByReference(brClass = FaceTracker.ByReference::class)
public class FaceTracker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFaceTracker.WithDefault, IWinRTObject {
  private val __578235616_Interface: IFaceTracker.WithDefault by lazy {
    as_578235616()
  }


  public override val __578235616_Ptr: JNAPointer? by lazy {
    __578235616_Interface.__578235616_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__578235616_Interface)

  private fun as_578235616(): IFaceTracker.WithDefault {
    if(pointer == NULL) {
      return(IFaceTracker.ABI.makeIFaceTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFaceTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFaceTracker.ABI.makeIFaceTracker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FaceTracker> {
    public override fun getValue() = FaceTracker(pointer.getPointer(0))

    public fun setValue(value: FaceTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FaceTracker, MemoryAddress> {
    public val IFaceTrackerStatics_Instance: IFaceTrackerStatics by lazy {
      createIFaceTrackerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFaceTrackerStatics(): IFaceTrackerStatics {
      val refiid = Guid.REFIID(IFaceTrackerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.FaceAnalysis.FaceTracker".toHandle(),refiid,interfacePtr)
      val result = IFaceTrackerStatics.ABI.makeIFaceTrackerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FaceTracker {
      val address = segment.toRawLongValue()
      return FaceTracker(Pointer(address))
    }

    public override fun toNative(obj: FaceTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync() = ABI.IFaceTrackerStatics_Instance.CreateAsync()

    public fun GetSupportedBitmapPixelFormats() =
        ABI.IFaceTrackerStatics_Instance.GetSupportedBitmapPixelFormats()

    public fun IsBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat) =
        ABI.IFaceTrackerStatics_Instance.IsBitmapPixelFormatSupported(bitmapPixelFormat)

    public fun get_IsSupported() = ABI.IFaceTrackerStatics_Instance.get_IsSupported()
  }
}
