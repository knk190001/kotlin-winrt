package Windows.Globalization.DateTimeFormatting

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDateTimeFormatter.ABI::class)
@Signature("{95eeca10-73e0-4e4b-a183-3d6ad0ba35ec}")
@Guid("95eeca1073e04e4ba1833d6ad0ba35ec")
@WinRTInterface("95eeca1073e04e4ba1833d6ad0ba35ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDateTimeFormatter.ByReference::class)
public interface IDateTimeFormatter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Languages(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_GeographicRegion(): String?

  @InterfaceMethod(2)
  public fun get_Calendar(): String?

  @InterfaceMethod(3)
  public fun get_Clock(): String?

  @InterfaceMethod(4)
  public fun get_NumeralSystem(): String?

  @InterfaceMethod(5)
  public fun put_NumeralSystem(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Patterns(): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun get_Template(): String?

  @InterfaceMethod(8)
  public fun Format(value: DateTime?): String?

  @InterfaceMethod(9)
  public fun get_IncludeYear(): YearFormat?

  @InterfaceMethod(10)
  public fun get_IncludeMonth(): MonthFormat?

  @InterfaceMethod(11)
  public fun get_IncludeDayOfWeek(): DayOfWeekFormat?

  @InterfaceMethod(12)
  public fun get_IncludeDay(): DayFormat?

  @InterfaceMethod(13)
  public fun get_IncludeHour(): HourFormat?

  @InterfaceMethod(14)
  public fun get_IncludeMinute(): MinuteFormat?

  @InterfaceMethod(15)
  public fun get_IncludeSecond(): SecondFormat?

  @InterfaceMethod(16)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(17)
  public fun get_ResolvedGeographicRegion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDateTimeFormatter> {
    public override fun getValue() = ABI.makeIDateTimeFormatter(pointer.getPointer(0))

    public fun setValue(value: IDateTimeFormatter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDateTimeFormatter {
    public val __919545758_Ptr: Pointer?

    public val _919545758_VtblPtr: Pointer?
      get() = __919545758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Languages(): IVectorView<String?>? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_GeographicRegion(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Calendar(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Clock(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NumeralSystem(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_NumeralSystem(value: String?): Unit {
      val fnPtr = _919545758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Patterns(): IVectorView<String?>? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Template(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun Format(value: DateTime?): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IncludeYear(): YearFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<YearFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<YearFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IncludeMonth(): MonthFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MonthFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MonthFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IncludeDayOfWeek(): DayOfWeekFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayOfWeekFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayOfWeekFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IncludeDay(): DayFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IncludeHour(): HourFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HourFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HourFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IncludeMinute(): MinuteFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MinuteFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MinuteFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_IncludeSecond(): SecondFormat? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondFormat>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ResolvedGeographicRegion(): String? {
      val fnPtr = _919545758_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__919545758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDateTimeFormatter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __919545758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDateTimeFormatter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95eeca1073e04e4ba1833d6ad0ba35ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDateTimeFormatter(ptr: Pointer?): WithDefault = IDateTimeFormatter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDateTimeFormatter {
      val address = segment.toRawLongValue()
      return makeIDateTimeFormatter(Pointer(address))
    }

    public override fun toNative(obj: IDateTimeFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__919545758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDateTimeFormatter): Array<IDateTimeFormatter?> =
        (elements as
        Array<IDateTimeFormatter?>).castToImpl<IDateTimeFormatter,IDateTimeFormatter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDateTimeFormatter?> =
        arrayOfNulls<IDateTimeFormatter_Impl>(size) as Array<IDateTimeFormatter?>
  }
}
