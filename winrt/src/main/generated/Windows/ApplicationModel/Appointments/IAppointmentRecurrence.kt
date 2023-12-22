package Windows.ApplicationModel.Appointments

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAppointmentRecurrence.ABI::class)
@Signature("{d87b3e83-15a6-487b-b959-0c361e60e954}")
@Guid("d87b3e8315a6487bb9590c361e60e954")
@WinRTInterface("d87b3e8315a6487bb9590c361e60e954")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentRecurrence.ByReference::class)
public interface IAppointmentRecurrence : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unit(): AppointmentRecurrenceUnit?

  @InterfaceMethod(1)
  public fun put_Unit(value: AppointmentRecurrenceUnit?): Unit

  @InterfaceMethod(2)
  public fun get_Occurrences(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun put_Occurrences(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(4)
  public fun get_Until(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_Until(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_Interval(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_Interval(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_DaysOfWeek(): AppointmentDaysOfWeek?

  @InterfaceMethod(9)
  public fun put_DaysOfWeek(value: AppointmentDaysOfWeek?): Unit

  @InterfaceMethod(10)
  public fun get_WeekOfMonth(): AppointmentWeekOfMonth?

  @InterfaceMethod(11)
  public fun put_WeekOfMonth(value: AppointmentWeekOfMonth?): Unit

  @InterfaceMethod(12)
  public fun get_Month(): WinDef.UINT

  @InterfaceMethod(13)
  public fun put_Month(value: WinDef.UINT): Unit

  @InterfaceMethod(14)
  public fun get_Day(): WinDef.UINT

  @InterfaceMethod(15)
  public fun put_Day(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentRecurrence> {
    public override fun getValue() = ABI.makeIAppointmentRecurrence(pointer.getPointer(0))

    public fun setValue(value: IAppointmentRecurrence_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentRecurrence {
    public val __1681632412_Ptr: Pointer?

    public val _1681632412_VtblPtr: Pointer?
      get() = __1681632412_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unit(): AppointmentRecurrenceUnit? {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentRecurrenceUnit>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentRecurrenceUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Unit(value: AppointmentRecurrenceUnit?): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Occurrences(): IReference<WinDef.UINT>? {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Occurrences(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Until(): IReference<DateTime?>? {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Until(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Interval(): WinDef.UINT {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Interval(value: WinDef.UINT): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DaysOfWeek(): AppointmentDaysOfWeek? {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentDaysOfWeek>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentDaysOfWeek>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DaysOfWeek(value: AppointmentDaysOfWeek?): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_WeekOfMonth(): AppointmentWeekOfMonth? {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentWeekOfMonth>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentWeekOfMonth>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_WeekOfMonth(value: AppointmentWeekOfMonth?): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Month(): WinDef.UINT {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_Month(value: WinDef.UINT): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Day(): WinDef.UINT {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_Day(value: WinDef.UINT): Unit {
      val fnPtr = _1681632412_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1681632412_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentRecurrence_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1681632412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentRecurrence, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d87b3e8315a6487bb9590c361e60e954")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentRecurrence(ptr: Pointer?): WithDefault =
        IAppointmentRecurrence_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentRecurrence {
      val address = segment.toRawLongValue()
      return makeIAppointmentRecurrence(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentRecurrence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1681632412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentRecurrence): Array<IAppointmentRecurrence?> =
        (elements as
        Array<IAppointmentRecurrence?>).castToImpl<IAppointmentRecurrence,IAppointmentRecurrence_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentRecurrence?> =
        arrayOfNulls<IAppointmentRecurrence_Impl>(size) as Array<IAppointmentRecurrence?>
  }
}
