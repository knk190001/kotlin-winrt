package Windows.Globalization

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ICalendarFactory2.ABI::class)
@Signature("{b44b378c-ca7e-4590-9e72-ea2bec1a5115}")
@Guid("b44b378cca7e45909e72ea2bec1a5115")
@WinRTInterface("b44b378cca7e45909e72ea2bec1a5115")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarFactory2.ByReference::class)
public interface ICalendarFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCalendarWithTimeZone(
    languages: IIterable<String?>?,
    calendar: String?,
    clock: String?,
    timeZoneId: String?
  ): Calendar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarFactory2> {
    public override fun getValue() = ABI.makeICalendarFactory2(pointer.getPointer(0))

    public fun setValue(value: ICalendarFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarFactory2 {
    public val __1472962553_Ptr: Pointer?

    public val _1472962553_VtblPtr: Pointer?
      get() = __1472962553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCalendarWithTimeZone(
      languages: IIterable<String?>?,
      calendar: String?,
      clock: String?,
      timeZoneId: String?
    ): Calendar? {
      val fnPtr = _1472962553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Calendar>()
      val hr = fn.invokeHR(arrayOf(__1472962553_Ptr, marshalToNative(languages),
          marshalToNative(calendar), marshalToNative(clock), marshalToNative(timeZoneId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Calendar>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1472962553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b44b378cca7e45909e72ea2bec1a5115")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarFactory2(ptr: Pointer?): WithDefault = ICalendarFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarFactory2 {
      val address = segment.toRawLongValue()
      return makeICalendarFactory2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1472962553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarFactory2): Array<ICalendarFactory2?> = (elements
        as Array<ICalendarFactory2?>).castToImpl<ICalendarFactory2,ICalendarFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarFactory2?> =
        arrayOfNulls<ICalendarFactory2_Impl>(size) as Array<ICalendarFactory2?>
  }
}
