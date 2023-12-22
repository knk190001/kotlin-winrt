package Windows.Devices.Power

import Windows.Foundation.IReference
import Windows.System.Power.BatteryStatus
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IBatteryReport.ABI::class)
@Signature("{c9858c3a-4e13-420a-a8d0-24f18f395401}")
@Guid("c9858c3a4e13420aa8d024f18f395401")
@WinRTInterface("c9858c3a4e13420aa8d024f18f395401")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBatteryReport.ByReference::class)
public interface IBatteryReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChargeRateInMilliwatts(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_DesignCapacityInMilliwattHours(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_FullChargeCapacityInMilliwattHours(): IReference<Int>?

  @InterfaceMethod(3)
  public fun get_RemainingCapacityInMilliwattHours(): IReference<Int>?

  @InterfaceMethod(4)
  public fun get_Status(): BatteryStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBatteryReport>
      {
    public override fun getValue() = ABI.makeIBatteryReport(pointer.getPointer(0))

    public fun setValue(value: IBatteryReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBatteryReport {
    public val __445233217_Ptr: Pointer?

    public val _445233217_VtblPtr: Pointer?
      get() = __445233217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChargeRateInMilliwatts(): IReference<Int>? {
      val fnPtr = _445233217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__445233217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DesignCapacityInMilliwattHours(): IReference<Int>? {
      val fnPtr = _445233217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__445233217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FullChargeCapacityInMilliwattHours(): IReference<Int>? {
      val fnPtr = _445233217_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__445233217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RemainingCapacityInMilliwattHours(): IReference<Int>? {
      val fnPtr = _445233217_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__445233217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Status(): BatteryStatus? {
      val fnPtr = _445233217_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BatteryStatus>()
      val hr = fn.invokeHR(arrayOf(__445233217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BatteryStatus>(result.getValue())
      return resultValue
    }
  }

  public class IBatteryReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445233217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBatteryReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9858c3a4e13420aa8d024f18f395401")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBatteryReport(ptr: Pointer?): WithDefault = IBatteryReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBatteryReport {
      val address = segment.toRawLongValue()
      return makeIBatteryReport(Pointer(address))
    }

    public override fun toNative(obj: IBatteryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445233217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBatteryReport): Array<IBatteryReport?> = (elements as
        Array<IBatteryReport?>).castToImpl<IBatteryReport,IBatteryReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBatteryReport?> =
        arrayOfNulls<IBatteryReport_Impl>(size) as Array<IBatteryReport?>
  }
}
