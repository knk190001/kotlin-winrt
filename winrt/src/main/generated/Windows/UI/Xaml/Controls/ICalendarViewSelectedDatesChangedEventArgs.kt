package Windows.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarViewSelectedDatesChangedEventArgs.ABI::class)
@Signature("{ee6069f6-13ef-4896-8ffc-5302b1b17539}")
@Guid("ee6069f613ef48968ffc5302b1b17539")
@WinRTInterface("ee6069f613ef48968ffc5302b1b17539")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewSelectedDatesChangedEventArgs.ByReference::class)
public interface ICalendarViewSelectedDatesChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddedDates(): IVectorView<DateTime?>?

  @InterfaceMethod(1)
  public fun get_RemovedDates(): IVectorView<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewSelectedDatesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICalendarViewSelectedDatesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewSelectedDatesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewSelectedDatesChangedEventArgs {
    public val __939526702_Ptr: Pointer?

    public val _939526702_VtblPtr: Pointer?
      get() = __939526702_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddedDates(): IVectorView<DateTime?>? {
      val fnPtr = _939526702_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__939526702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemovedDates(): IVectorView<DateTime?>? {
      val fnPtr = _939526702_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__939526702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewSelectedDatesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __939526702_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewSelectedDatesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee6069f613ef48968ffc5302b1b17539")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewSelectedDatesChangedEventArgs(ptr: Pointer?): WithDefault =
        ICalendarViewSelectedDatesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICalendarViewSelectedDatesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICalendarViewSelectedDatesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewSelectedDatesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__939526702_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewSelectedDatesChangedEventArgs):
        Array<ICalendarViewSelectedDatesChangedEventArgs?> = (elements as
        Array<ICalendarViewSelectedDatesChangedEventArgs?>).castToImpl<ICalendarViewSelectedDatesChangedEventArgs,ICalendarViewSelectedDatesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewSelectedDatesChangedEventArgs?> =
        arrayOfNulls<ICalendarViewSelectedDatesChangedEventArgs_Impl>(size) as
        Array<ICalendarViewSelectedDatesChangedEventArgs?>
  }
}
