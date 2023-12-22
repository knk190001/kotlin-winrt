package Windows.Phone.Devices.Power

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IBattery.ABI::class)
@Signature("{972adbdd-6720-4702-a476-b9d38a0070e3}")
@Guid("972adbdd67204702a476b9d38a0070e3")
@WinRTInterface("972adbdd67204702a476b9d38a0070e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBattery.ByReference::class)
public interface IBattery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemainingChargePercent(): Int

  @InterfaceMethod(1)
  public fun get_RemainingDischargeTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun add_RemainingChargePercentChanged(changeHandler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RemainingChargePercentChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBattery> {
    public override fun getValue() = ABI.makeIBattery(pointer.getPointer(0))

    public fun setValue(value: IBattery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBattery {
    public val __324822963_Ptr: Pointer?

    public val _324822963_VtblPtr: Pointer?
      get() = __324822963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemainingChargePercent(): Int {
      val fnPtr = _324822963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__324822963_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_RemainingDischargeTime(): TimeSpan? {
      val fnPtr = _324822963_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__324822963_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_RemainingChargePercentChanged(changeHandler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _324822963_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__324822963_Ptr, marshalToNative(changeHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RemainingChargePercentChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _324822963_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__324822963_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBattery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __324822963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBattery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("972adbdd67204702a476b9d38a0070e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBattery(ptr: Pointer?): WithDefault = IBattery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBattery {
      val address = segment.toRawLongValue()
      return makeIBattery(Pointer(address))
    }

    public override fun toNative(obj: IBattery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324822963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBattery): Array<IBattery?> = (elements as
        Array<IBattery?>).castToImpl<IBattery,IBattery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBattery?> = arrayOfNulls<IBattery_Impl>(size) as
        Array<IBattery?>
  }
}
