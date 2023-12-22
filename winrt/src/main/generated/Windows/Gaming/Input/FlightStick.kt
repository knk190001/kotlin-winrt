package Windows.Gaming.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(FlightStick.ABI::class)
@Signature("rc(Windows.Gaming.Input.FlightStick;{b4a2c01c-b83b-4459-a1a9-97b03c33da7c})")
@WinRTByReference(brClass = FlightStick.ByReference::class)
public class FlightStick(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFlightStick.WithDefault, IGameController.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __1611442157_Interface: IFlightStick.WithDefault by lazy {
    as_1611442157()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __1611442157_Ptr: JNAPointer? by lazy {
    __1611442157_Interface.__1611442157_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1611442157_Interface, __925471711_Interface, __1091749242_Interface)

  private fun as_1611442157(): IFlightStick.WithDefault {
    if(pointer == NULL) {
      return(IFlightStick.ABI.makeIFlightStick(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlightStick>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlightStick.ABI.makeIFlightStick(ref.value))
  }

  private fun as_925471711(): IGameController.WithDefault {
    if(pointer == NULL) {
      return(IGameController.ABI.makeIGameController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameController.ABI.makeIGameController(ref.value))
  }

  private fun as_1091749242(): IGameControllerBatteryInfo.WithDefault {
    if(pointer == NULL) {
      return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameControllerBatteryInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlightStick> {
    public override fun getValue() = FlightStick(pointer.getPointer(0))

    public fun setValue(value: FlightStick): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlightStick, MemoryAddress> {
    public val IFlightStickStatics_Instance: IFlightStickStatics by lazy {
      createIFlightStickStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlightStickStatics(): IFlightStickStatics {
      val refiid = Guid.REFIID(IFlightStickStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.FlightStick".toHandle(),refiid,interfacePtr)
      val result = IFlightStickStatics.ABI.makeIFlightStickStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FlightStick {
      val address = segment.toRawLongValue()
      return FlightStick(Pointer(address))
    }

    public override fun toNative(obj: FlightStick): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_FlightStickAdded(value: EventHandler<FlightStick?>) =
        ABI.IFlightStickStatics_Instance.add_FlightStickAdded(value)

    public fun remove_FlightStickAdded(token: EventRegistrationToken) =
        ABI.IFlightStickStatics_Instance.remove_FlightStickAdded(token)

    public fun add_FlightStickRemoved(value: EventHandler<FlightStick?>) =
        ABI.IFlightStickStatics_Instance.add_FlightStickRemoved(value)

    public fun remove_FlightStickRemoved(token: EventRegistrationToken) =
        ABI.IFlightStickStatics_Instance.remove_FlightStickRemoved(token)

    public fun get_FlightSticks() = ABI.IFlightStickStatics_Instance.get_FlightSticks()

    public fun FromGameController(gameController: IGameController) =
        ABI.IFlightStickStatics_Instance.FromGameController(gameController)
  }
}
