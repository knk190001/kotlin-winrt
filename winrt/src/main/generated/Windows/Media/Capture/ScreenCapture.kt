package Windows.Media.Capture

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

@ABIMarker(ScreenCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.ScreenCapture;{89179ef7-cd12-4e0e-a6d4-5b3de98b2e9b})")
@WinRTByReference(brClass = ScreenCapture.ByReference::class)
public class ScreenCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScreenCapture.WithDefault, IWinRTObject {
  private val __1381685150_Interface: IScreenCapture.WithDefault by lazy {
    as_1381685150()
  }


  public override val __1381685150_Ptr: JNAPointer? by lazy {
    __1381685150_Interface.__1381685150_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1381685150_Interface)

  private fun as_1381685150(): IScreenCapture.WithDefault {
    if(pointer == NULL) {
      return(IScreenCapture.ABI.makeIScreenCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScreenCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScreenCapture.ABI.makeIScreenCapture(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ScreenCapture>
      {
    public override fun getValue() = ScreenCapture(pointer.getPointer(0))

    public fun setValue(value: ScreenCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScreenCapture, MemoryAddress> {
    public val IScreenCaptureStatics_Instance: IScreenCaptureStatics by lazy {
      createIScreenCaptureStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScreenCaptureStatics(): IScreenCaptureStatics {
      val refiid = Guid.REFIID(IScreenCaptureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.ScreenCapture".toHandle(),refiid,interfacePtr)
      val result = IScreenCaptureStatics.ABI.makeIScreenCaptureStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScreenCapture {
      val address = segment.toRawLongValue()
      return ScreenCapture(Pointer(address))
    }

    public override fun toNative(obj: ScreenCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IScreenCaptureStatics_Instance.GetForCurrentView()
  }
}
