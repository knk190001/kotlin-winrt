package Windows.Gaming.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(RacingWheel.ABI::class)
@Signature("rc(Windows.Gaming.Input.RacingWheel;{f546656f-e106-4c82-a90f-554012904b85})")
@WinRTByReference(brClass = RacingWheel.ByReference::class)
public class RacingWheel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRacingWheel.WithDefault, IGameController.WithDefault,
    IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __1496197786_Interface: IRacingWheel.WithDefault by lazy {
    as_1496197786()
  }


  private val __925471711_Interface: IGameController.WithDefault by lazy {
    as_925471711()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __1496197786_Ptr: JNAPointer? by lazy {
    __1496197786_Interface.__1496197786_Ptr
  }


  public override val __925471711_Ptr: JNAPointer? by lazy {
    __925471711_Interface.__925471711_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1496197786_Interface, __925471711_Interface, __1091749242_Interface)

  private fun as_1496197786(): IRacingWheel.WithDefault {
    if(pointer == NULL) {
      return(IRacingWheel.ABI.makeIRacingWheel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRacingWheel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRacingWheel.ABI.makeIRacingWheel(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RacingWheel> {
    public override fun getValue() = RacingWheel(pointer.getPointer(0))

    public fun setValue(value: RacingWheel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RacingWheel, MemoryAddress> {
    public val IRacingWheelStatics2_Instance: IRacingWheelStatics2 by lazy {
      createIRacingWheelStatics2()
    }


    public val IRacingWheelStatics_Instance: IRacingWheelStatics by lazy {
      createIRacingWheelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRacingWheelStatics2(): IRacingWheelStatics2 {
      val refiid = Guid.REFIID(IRacingWheelStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.RacingWheel".toHandle(),refiid,interfacePtr)
      val result = IRacingWheelStatics2.ABI.makeIRacingWheelStatics2(interfacePtr.value)
      return result
    }

    public fun createIRacingWheelStatics(): IRacingWheelStatics {
      val refiid = Guid.REFIID(IRacingWheelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.RacingWheel".toHandle(),refiid,interfacePtr)
      val result = IRacingWheelStatics.ABI.makeIRacingWheelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RacingWheel {
      val address = segment.toRawLongValue()
      return RacingWheel(Pointer(address))
    }

    public override fun toNative(obj: RacingWheel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromGameController(gameController: IGameController) =
        ABI.IRacingWheelStatics2_Instance.FromGameController(gameController)

    public fun add_RacingWheelAdded(value: EventHandler<RacingWheel?>) =
        ABI.IRacingWheelStatics_Instance.add_RacingWheelAdded(value)

    public fun remove_RacingWheelAdded(token: EventRegistrationToken) =
        ABI.IRacingWheelStatics_Instance.remove_RacingWheelAdded(token)

    public fun add_RacingWheelRemoved(value: EventHandler<RacingWheel?>) =
        ABI.IRacingWheelStatics_Instance.add_RacingWheelRemoved(value)

    public fun remove_RacingWheelRemoved(token: EventRegistrationToken) =
        ABI.IRacingWheelStatics_Instance.remove_RacingWheelRemoved(token)

    public fun get_RacingWheels() = ABI.IRacingWheelStatics_Instance.get_RacingWheels()
  }
}
