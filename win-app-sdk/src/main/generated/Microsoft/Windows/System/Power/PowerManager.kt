package Microsoft.Windows.System.Power

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(PowerManager.ABI::class)
@WinRTByReference(brClass = PowerManager.ByReference::class)
public class PowerManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PowerManager> {
    public override fun getValue() = PowerManager(pointer.getPointer(0))

    public fun setValue(value: PowerManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PowerManager, MemoryAddress> {
    public val IPowerManagerStatics2_Instance: IPowerManagerStatics2 by lazy {
      createIPowerManagerStatics2()
    }


    public val IPowerManagerStatics_Instance: IPowerManagerStatics by lazy {
      createIPowerManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPowerManagerStatics2(): IPowerManagerStatics2 {
      val refiid = Guid.REFIID(IPowerManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.System.Power.PowerManager".toHandle(),refiid,interfacePtr)
      val result = IPowerManagerStatics2.ABI.makeIPowerManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPowerManagerStatics(): IPowerManagerStatics {
      val refiid = Guid.REFIID(IPowerManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.System.Power.PowerManager".toHandle(),refiid,interfacePtr)
      val result = IPowerManagerStatics.ABI.makeIPowerManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PowerManager {
      val address = segment.toRawLongValue()
      return PowerManager(Pointer(address))
    }

    public override fun toNative(obj: PowerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EffectivePowerMode2() =
        ABI.IPowerManagerStatics2_Instance.get_EffectivePowerMode2()

    public fun get_EnergySaverStatus() = ABI.IPowerManagerStatics_Instance.get_EnergySaverStatus()

    public fun add_EnergySaverStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_EnergySaverStatusChanged(handler)

    public fun remove_EnergySaverStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_EnergySaverStatusChanged(token)

    public fun get_BatteryStatus() = ABI.IPowerManagerStatics_Instance.get_BatteryStatus()

    public fun add_BatteryStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_BatteryStatusChanged(handler)

    public fun remove_BatteryStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_BatteryStatusChanged(token)

    public fun get_PowerSupplyStatus() = ABI.IPowerManagerStatics_Instance.get_PowerSupplyStatus()

    public fun add_PowerSupplyStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_PowerSupplyStatusChanged(handler)

    public fun remove_PowerSupplyStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_PowerSupplyStatusChanged(token)

    public fun get_RemainingChargePercent() =
        ABI.IPowerManagerStatics_Instance.get_RemainingChargePercent()

    public fun add_RemainingChargePercentChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_RemainingChargePercentChanged(handler)

    public fun remove_RemainingChargePercentChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_RemainingChargePercentChanged(token)

    public fun get_RemainingDischargeTime() =
        ABI.IPowerManagerStatics_Instance.get_RemainingDischargeTime()

    public fun add_RemainingDischargeTimeChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_RemainingDischargeTimeChanged(handler)

    public fun remove_RemainingDischargeTimeChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_RemainingDischargeTimeChanged(token)

    public fun get_PowerSourceKind() = ABI.IPowerManagerStatics_Instance.get_PowerSourceKind()

    public fun add_PowerSourceKindChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_PowerSourceKindChanged(handler)

    public fun remove_PowerSourceKindChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_PowerSourceKindChanged(token)

    public fun get_DisplayStatus() = ABI.IPowerManagerStatics_Instance.get_DisplayStatus()

    public fun add_DisplayStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_DisplayStatusChanged(handler)

    public fun remove_DisplayStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_DisplayStatusChanged(token)

    public fun add_SystemIdleStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_SystemIdleStatusChanged(handler)

    public fun remove_SystemIdleStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_SystemIdleStatusChanged(token)

    public fun get_EffectivePowerMode() = ABI.IPowerManagerStatics_Instance.get_EffectivePowerMode()

    public fun add_EffectivePowerModeChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_EffectivePowerModeChanged(handler)

    public fun remove_EffectivePowerModeChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_EffectivePowerModeChanged(token)

    public fun get_UserPresenceStatus() = ABI.IPowerManagerStatics_Instance.get_UserPresenceStatus()

    public fun add_UserPresenceStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_UserPresenceStatusChanged(handler)

    public fun remove_UserPresenceStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_UserPresenceStatusChanged(token)

    public fun get_SystemSuspendStatus() =
        ABI.IPowerManagerStatics_Instance.get_SystemSuspendStatus()

    public fun add_SystemSuspendStatusChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_SystemSuspendStatusChanged(handler)

    public fun remove_SystemSuspendStatusChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_SystemSuspendStatusChanged(token)
  }
}
