package Windows.Devices.Pwm

import Windows.Devices.Pwm.Provider.IPwmProvider
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PwmController.ABI::class)
@Signature("rc(Windows.Devices.Pwm.PwmController;{c45f5c85-d2e8-42cf-9bd6-cf5ed029e6a7})")
@WinRTByReference(brClass = PwmController.ByReference::class)
public class PwmController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPwmController.WithDefault, IWinRTObject {
  private val __1995982941_Interface: IPwmController.WithDefault by lazy {
    as_1995982941()
  }


  public override val __1995982941_Ptr: JNAPointer? by lazy {
    __1995982941_Interface.__1995982941_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1995982941_Interface)

  private fun as_1995982941(): IPwmController.WithDefault {
    if(pointer == NULL) {
      return(IPwmController.ABI.makeIPwmController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPwmController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPwmController.ABI.makeIPwmController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PwmController>
      {
    public override fun getValue() = PwmController(pointer.getPointer(0))

    public fun setValue(value: PwmController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PwmController, MemoryAddress> {
    public val IPwmControllerStatics_Instance: IPwmControllerStatics by lazy {
      createIPwmControllerStatics()
    }


    public val IPwmControllerStatics2_Instance: IPwmControllerStatics2 by lazy {
      createIPwmControllerStatics2()
    }


    public val IPwmControllerStatics3_Instance: IPwmControllerStatics3 by lazy {
      createIPwmControllerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPwmControllerStatics(): IPwmControllerStatics {
      val refiid = Guid.REFIID(IPwmControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Pwm.PwmController".toHandle(),refiid,interfacePtr)
      val result = IPwmControllerStatics.ABI.makeIPwmControllerStatics(interfacePtr.value)
      return result
    }

    public fun createIPwmControllerStatics2(): IPwmControllerStatics2 {
      val refiid = Guid.REFIID(IPwmControllerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Pwm.PwmController".toHandle(),refiid,interfacePtr)
      val result = IPwmControllerStatics2.ABI.makeIPwmControllerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPwmControllerStatics3(): IPwmControllerStatics3 {
      val refiid = Guid.REFIID(IPwmControllerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Pwm.PwmController".toHandle(),refiid,interfacePtr)
      val result = IPwmControllerStatics3.ABI.makeIPwmControllerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PwmController {
      val address = segment.toRawLongValue()
      return PwmController(Pointer(address))
    }

    public override fun toNative(obj: PwmController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetControllersAsync(provider: IPwmProvider) =
        ABI.IPwmControllerStatics_Instance.GetControllersAsync(provider)

    public fun GetDefaultAsync() = ABI.IPwmControllerStatics2_Instance.GetDefaultAsync()

    public fun GetDeviceSelector() = ABI.IPwmControllerStatics3_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(friendlyName: String) =
        ABI.IPwmControllerStatics3_Instance.GetDeviceSelector(friendlyName)

    public fun FromIdAsync(deviceId: String) =
        ABI.IPwmControllerStatics3_Instance.FromIdAsync(deviceId)
  }
}
