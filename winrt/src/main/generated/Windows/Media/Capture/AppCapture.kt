package Windows.Media.Capture

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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCapture;{9749d453-a29a-45ed-8f29-22d09942cff7})")
@WinRTByReference(brClass = AppCapture.ByReference::class)
public class AppCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCapture.WithDefault, IWinRTObject {
  private val __1545149507_Interface: IAppCapture.WithDefault by lazy {
    as_1545149507()
  }


  public override val __1545149507_Ptr: JNAPointer? by lazy {
    __1545149507_Interface.__1545149507_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1545149507_Interface)

  private fun as_1545149507(): IAppCapture.WithDefault {
    if(pointer == NULL) {
      return(IAppCapture.ABI.makeIAppCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCapture.ABI.makeIAppCapture(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppCapture> {
    public override fun getValue() = AppCapture(pointer.getPointer(0))

    public fun setValue(value: AppCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCapture, MemoryAddress> {
    public val IAppCaptureStatics_Instance: IAppCaptureStatics by lazy {
      createIAppCaptureStatics()
    }


    public val IAppCaptureStatics2_Instance: IAppCaptureStatics2 by lazy {
      createIAppCaptureStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppCaptureStatics(): IAppCaptureStatics {
      val refiid = Guid.REFIID(IAppCaptureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.AppCapture".toHandle(),refiid,interfacePtr)
      val result = IAppCaptureStatics.ABI.makeIAppCaptureStatics(interfacePtr.value)
      return result
    }

    public fun createIAppCaptureStatics2(): IAppCaptureStatics2 {
      val refiid = Guid.REFIID(IAppCaptureStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.AppCapture".toHandle(),refiid,interfacePtr)
      val result = IAppCaptureStatics2.ABI.makeIAppCaptureStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppCapture {
      val address = segment.toRawLongValue()
      return AppCapture(Pointer(address))
    }

    public override fun toNative(obj: AppCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IAppCaptureStatics_Instance.GetForCurrentView()

    public fun SetAllowedAsync(allowed: Boolean) =
        ABI.IAppCaptureStatics2_Instance.SetAllowedAsync(allowed)
  }
}
