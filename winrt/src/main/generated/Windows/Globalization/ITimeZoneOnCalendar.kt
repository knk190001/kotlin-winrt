package Windows.Globalization

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

@ABIMarker(ITimeZoneOnCalendar.ABI::class)
@Signature("{bb3c25e5-46cf-4317-a3f5-02621ad54478}")
@Guid("bb3c25e546cf4317a3f502621ad54478")
@WinRTInterface("bb3c25e546cf4317a3f502621ad54478")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimeZoneOnCalendar.ByReference::class)
public interface ITimeZoneOnCalendar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTimeZone(): String?

  @InterfaceMethod(1)
  public fun ChangeTimeZone(timeZoneId: String?): Unit

  @InterfaceMethod(2)
  public fun TimeZoneAsString(): String?

  @InterfaceMethod(3)
  public fun TimeZoneAsString(idealLength: Int): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimeZoneOnCalendar> {
    public override fun getValue() = ABI.makeITimeZoneOnCalendar(pointer.getPointer(0))

    public fun setValue(value: ITimeZoneOnCalendar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimeZoneOnCalendar {
    public val __1516054359_Ptr: Pointer?

    public val _1516054359_VtblPtr: Pointer?
      get() = __1516054359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTimeZone(): String? {
      val fnPtr = _1516054359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516054359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ChangeTimeZone(timeZoneId: String?): Unit {
      val fnPtr = _1516054359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516054359_Ptr, marshalToNative(timeZoneId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TimeZoneAsString(): String? {
      val fnPtr = _1516054359_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516054359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TimeZoneAsString(idealLength: Int): String? {
      val fnPtr = _1516054359_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516054359_Ptr, idealLength, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITimeZoneOnCalendar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516054359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimeZoneOnCalendar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb3c25e546cf4317a3f502621ad54478")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimeZoneOnCalendar(ptr: Pointer?): WithDefault = ITimeZoneOnCalendar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimeZoneOnCalendar {
      val address = segment.toRawLongValue()
      return makeITimeZoneOnCalendar(Pointer(address))
    }

    public override fun toNative(obj: ITimeZoneOnCalendar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516054359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimeZoneOnCalendar): Array<ITimeZoneOnCalendar?> =
        (elements as
        Array<ITimeZoneOnCalendar?>).castToImpl<ITimeZoneOnCalendar,ITimeZoneOnCalendar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimeZoneOnCalendar?> =
        arrayOfNulls<ITimeZoneOnCalendar_Impl>(size) as Array<ITimeZoneOnCalendar?>
  }
}
