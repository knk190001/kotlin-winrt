package Windows.Devices.Gpio

import Windows.Devices.Gpio.Provider.IGpioProvider
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

@ABIMarker(GpioController.ABI::class)
@Signature("rc(Windows.Devices.Gpio.GpioController;{284012e3-7461-469c-a8bc-61d69d08a53c})")
@WinRTByReference(brClass = GpioController.ByReference::class)
public class GpioController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGpioController.WithDefault, IWinRTObject {
  private val __1425545751_Interface: IGpioController.WithDefault by lazy {
    as_1425545751()
  }


  public override val __1425545751_Ptr: JNAPointer? by lazy {
    __1425545751_Interface.__1425545751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1425545751_Interface)

  private fun as_1425545751(): IGpioController.WithDefault {
    if(pointer == NULL) {
      return(IGpioController.ABI.makeIGpioController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGpioController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGpioController.ABI.makeIGpioController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GpioController>
      {
    public override fun getValue() = GpioController(pointer.getPointer(0))

    public fun setValue(value: GpioController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GpioController, MemoryAddress> {
    public val IGpioControllerStatics2_Instance: IGpioControllerStatics2 by lazy {
      createIGpioControllerStatics2()
    }


    public val IGpioControllerStatics_Instance: IGpioControllerStatics by lazy {
      createIGpioControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGpioControllerStatics2(): IGpioControllerStatics2 {
      val refiid = Guid.REFIID(IGpioControllerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Gpio.GpioController".toHandle(),refiid,interfacePtr)
      val result = IGpioControllerStatics2.ABI.makeIGpioControllerStatics2(interfacePtr.value)
      return result
    }

    public fun createIGpioControllerStatics(): IGpioControllerStatics {
      val refiid = Guid.REFIID(IGpioControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Gpio.GpioController".toHandle(),refiid,interfacePtr)
      val result = IGpioControllerStatics.ABI.makeIGpioControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GpioController {
      val address = segment.toRawLongValue()
      return GpioController(Pointer(address))
    }

    public override fun toNative(obj: GpioController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetControllersAsync(provider: IGpioProvider) =
        ABI.IGpioControllerStatics2_Instance.GetControllersAsync(provider)

    public fun GetDefaultAsync() = ABI.IGpioControllerStatics2_Instance.GetDefaultAsync()

    public fun GetDefault() = ABI.IGpioControllerStatics_Instance.GetDefault()
  }
}
