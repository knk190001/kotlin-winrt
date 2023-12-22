package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(IUserDataTaskRecurrenceProperties.ABI::class)
@Signature("{73df80b0-27c6-40ce-b149-9cd41485a69e}")
@Guid("73df80b027c640ceb1499cd41485a69e")
@WinRTInterface("73df80b027c640ceb1499cd41485a69e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskRecurrenceProperties.ByReference::class)
public interface IUserDataTaskRecurrenceProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unit(): UserDataTaskRecurrenceUnit?

  @InterfaceMethod(1)
  public fun put_Unit(value: UserDataTaskRecurrenceUnit?): Unit

  @InterfaceMethod(2)
  public fun get_Occurrences(): IReference<Int>?

  @InterfaceMethod(3)
  public fun put_Occurrences(value: IReference<Int>?): Unit

  @InterfaceMethod(4)
  public fun get_Until(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_Until(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_Interval(): Int

  @InterfaceMethod(7)
  public fun put_Interval(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_DaysOfWeek(): IReference<UserDataTaskDaysOfWeek?>?

  @InterfaceMethod(9)
  public fun put_DaysOfWeek(value: IReference<UserDataTaskDaysOfWeek?>?): Unit

  @InterfaceMethod(10)
  public fun get_WeekOfMonth(): IReference<UserDataTaskWeekOfMonth?>?

  @InterfaceMethod(11)
  public fun put_WeekOfMonth(value: IReference<UserDataTaskWeekOfMonth?>?): Unit

  @InterfaceMethod(12)
  public fun get_Month(): IReference<Int>?

  @InterfaceMethod(13)
  public fun put_Month(value: IReference<Int>?): Unit

  @InterfaceMethod(14)
  public fun get_Day(): IReference<Int>?

  @InterfaceMethod(15)
  public fun put_Day(value: IReference<Int>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskRecurrenceProperties> {
    public override fun getValue() =
        ABI.makeIUserDataTaskRecurrenceProperties(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskRecurrenceProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskRecurrenceProperties {
    public val __950545097_Ptr: Pointer?

    public val _950545097_VtblPtr: Pointer?
      get() = __950545097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unit(): UserDataTaskRecurrenceUnit? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskRecurrenceUnit>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskRecurrenceUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Unit(value: UserDataTaskRecurrenceUnit?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Occurrences(): IReference<Int>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Occurrences(value: IReference<Int>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Until(): IReference<DateTime?>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Until(value: IReference<DateTime?>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Interval(): Int {
      val fnPtr = _950545097_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Interval(value: Int): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DaysOfWeek(): IReference<UserDataTaskDaysOfWeek?>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UserDataTaskDaysOfWeek?>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UserDataTaskDaysOfWeek?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DaysOfWeek(value: IReference<UserDataTaskDaysOfWeek?>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_WeekOfMonth(): IReference<UserDataTaskWeekOfMonth?>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<UserDataTaskWeekOfMonth?>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<UserDataTaskWeekOfMonth?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_WeekOfMonth(value: IReference<UserDataTaskWeekOfMonth?>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Month(): IReference<Int>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Month(value: IReference<Int>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Day(): IReference<Int>? {
      val fnPtr = _950545097_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Day(value: IReference<Int>?): Unit {
      val fnPtr = _950545097_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__950545097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTaskRecurrenceProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __950545097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskRecurrenceProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73df80b027c640ceb1499cd41485a69e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskRecurrenceProperties(ptr: Pointer?): WithDefault =
        IUserDataTaskRecurrenceProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskRecurrenceProperties {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskRecurrenceProperties(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskRecurrenceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__950545097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskRecurrenceProperties):
        Array<IUserDataTaskRecurrenceProperties?> = (elements as
        Array<IUserDataTaskRecurrenceProperties?>).castToImpl<IUserDataTaskRecurrenceProperties,IUserDataTaskRecurrenceProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskRecurrenceProperties?> =
        arrayOfNulls<IUserDataTaskRecurrenceProperties_Impl>(size) as
        Array<IUserDataTaskRecurrenceProperties?>
  }
}
