package Microsoft.UI.Xaml.Controls

import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarViewDayItemChangingEventArgs.ABI::class)
@Signature("{e894fe7f-12f6-5b1a-88a2-a96764c1273f}")
@Guid("e894fe7f12f65b1a88a2a96764c1273f")
@WinRTInterface("e894fe7f12f65b1a88a2a96764c1273f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewDayItemChangingEventArgs.ByReference::class)
public interface ICalendarViewDayItemChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InRecycleQueue(): Boolean

  @InterfaceMethod(1)
  public fun get_Item(): CalendarViewDayItem?

  @InterfaceMethod(2)
  public fun get_Phase(): WinDef.UINT

  @InterfaceMethod(3)
  public fun RegisterUpdateCallback(callback: TypedEventHandler<CalendarView?,
      CalendarViewDayItemChangingEventArgs?>?): Unit

  @InterfaceMethod(4)
  public fun RegisterUpdateCallback(callbackPhase: WinDef.UINT,
      callback: TypedEventHandler<CalendarView?, CalendarViewDayItemChangingEventArgs?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewDayItemChangingEventArgs> {
    public override fun getValue() =
        ABI.makeICalendarViewDayItemChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewDayItemChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewDayItemChangingEventArgs {
    public val __292581371_Ptr: Pointer?

    public val _292581371_VtblPtr: Pointer?
      get() = __292581371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InRecycleQueue(): Boolean {
      val fnPtr = _292581371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__292581371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Item(): CalendarViewDayItem? {
      val fnPtr = _292581371_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewDayItem>()
      val hr = fn.invokeHR(arrayOf(__292581371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewDayItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Phase(): WinDef.UINT {
      val fnPtr = _292581371_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__292581371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun RegisterUpdateCallback(callback: TypedEventHandler<CalendarView?,
        CalendarViewDayItemChangingEventArgs?>?): Unit {
      val fnPtr = _292581371_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__292581371_Ptr, marshalToNative(callback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RegisterUpdateCallback(callbackPhase: WinDef.UINT,
        callback: TypedEventHandler<CalendarView?, CalendarViewDayItemChangingEventArgs?>?): Unit {
      val fnPtr = _292581371_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__292581371_Ptr, callbackPhase, marshalToNative(callback),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarViewDayItemChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __292581371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewDayItemChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e894fe7f12f65b1a88a2a96764c1273f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewDayItemChangingEventArgs(ptr: Pointer?): WithDefault =
        ICalendarViewDayItemChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewDayItemChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeICalendarViewDayItemChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewDayItemChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__292581371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewDayItemChangingEventArgs):
        Array<ICalendarViewDayItemChangingEventArgs?> = (elements as
        Array<ICalendarViewDayItemChangingEventArgs?>).castToImpl<ICalendarViewDayItemChangingEventArgs,ICalendarViewDayItemChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewDayItemChangingEventArgs?> =
        arrayOfNulls<ICalendarViewDayItemChangingEventArgs_Impl>(size) as
        Array<ICalendarViewDayItemChangingEventArgs?>
  }
}
