package Microsoft.Windows.System.Power

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPowerManagerStatics.ABI::class)
@Signature("{fa3554cc-be1c-534c-bff8-72df78e9f4a4}")
@Guid("fa3554ccbe1c534cbff872df78e9f4a4")
@WinRTInterface("fa3554ccbe1c534cbff872df78e9f4a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerManagerStatics.ByReference::class)
public interface IPowerManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnergySaverStatus(): EnergySaverStatus?

  @InterfaceMethod(1)
  public fun add_EnergySaverStatusChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_EnergySaverStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun get_BatteryStatus(): BatteryStatus?

  @InterfaceMethod(4)
  public fun add_BatteryStatusChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_BatteryStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_PowerSupplyStatus(): PowerSupplyStatus?

  @InterfaceMethod(7)
  public fun add_PowerSupplyStatusChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PowerSupplyStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun get_RemainingChargePercent(): Int

  @InterfaceMethod(10)
  public fun add_RemainingChargePercentChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_RemainingChargePercentChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun get_RemainingDischargeTime(): TimeSpan?

  @InterfaceMethod(13)
  public fun add_RemainingDischargeTimeChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_RemainingDischargeTimeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun get_PowerSourceKind(): PowerSourceKind?

  @InterfaceMethod(16)
  public fun add_PowerSourceKindChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_PowerSourceKindChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun get_DisplayStatus(): DisplayStatus?

  @InterfaceMethod(19)
  public fun add_DisplayStatusChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_DisplayStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_SystemIdleStatusChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_SystemIdleStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun get_EffectivePowerMode(): IAsyncOperation<EffectivePowerMode?>?

  @InterfaceMethod(24)
  public fun add_EffectivePowerModeChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_EffectivePowerModeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun get_UserPresenceStatus(): UserPresenceStatus?

  @InterfaceMethod(27)
  public fun add_UserPresenceStatusChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_UserPresenceStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun get_SystemSuspendStatus(): SystemSuspendStatus?

  @InterfaceMethod(30)
  public fun add_SystemSuspendStatusChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_SystemSuspendStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPowerManagerStatics> {
    public override fun getValue() = ABI.makeIPowerManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPowerManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerManagerStatics {
    public val __72709755_Ptr: Pointer?

    public val _72709755_VtblPtr: Pointer?
      get() = __72709755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnergySaverStatus(): EnergySaverStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnergySaverStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnergySaverStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_EnergySaverStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_EnergySaverStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BatteryStatus(): BatteryStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BatteryStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BatteryStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_BatteryStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_BatteryStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PowerSupplyStatus(): PowerSupplyStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PowerSupplyStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PowerSupplyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_PowerSupplyStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PowerSupplyStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_RemainingChargePercent(): Int {
      val fnPtr = _72709755_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun add_RemainingChargePercentChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_RemainingChargePercentChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_RemainingDischargeTime(): TimeSpan? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun add_RemainingDischargeTimeChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_RemainingDischargeTimeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_PowerSourceKind(): PowerSourceKind? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PowerSourceKind>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PowerSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun add_PowerSourceKindChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_PowerSourceKindChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_DisplayStatus(): DisplayStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun add_DisplayStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_DisplayStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_SystemIdleStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_SystemIdleStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_EffectivePowerMode(): IAsyncOperation<EffectivePowerMode?>? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EffectivePowerMode?>>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EffectivePowerMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun add_EffectivePowerModeChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_EffectivePowerModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_UserPresenceStatus(): UserPresenceStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserPresenceStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserPresenceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun add_UserPresenceStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_UserPresenceStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_SystemSuspendStatus(): SystemSuspendStatus? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemSuspendStatus>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemSuspendStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun add_SystemSuspendStatusChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _72709755_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_SystemSuspendStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _72709755_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__72709755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPowerManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __72709755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa3554ccbe1c534cbff872df78e9f4a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerManagerStatics(ptr: Pointer?): WithDefault = IPowerManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPowerManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPowerManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__72709755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerManagerStatics): Array<IPowerManagerStatics?> =
        (elements as
        Array<IPowerManagerStatics?>).castToImpl<IPowerManagerStatics,IPowerManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerManagerStatics?> =
        arrayOfNulls<IPowerManagerStatics_Impl>(size) as Array<IPowerManagerStatics?>
  }
}
