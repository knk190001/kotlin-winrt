package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ICalendarDatePickerDateChangedEventArgs.ABI::class)
@Signature("{57c212d7-c2f2-54a0-9d41-f263b1e5106e}")
@Guid("57c212d7c2f254a09d41f263b1e5106e")
@WinRTInterface("57c212d7c2f254a09d41f263b1e5106e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePickerDateChangedEventArgs.ByReference::class)
public interface ICalendarDatePickerDateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewDate(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun get_OldDate(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePickerDateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICalendarDatePickerDateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePickerDateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePickerDateChangedEventArgs {
    public val __1373628046_Ptr: Pointer?

    public val _1373628046_VtblPtr: Pointer?
      get() = __1373628046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewDate(): IReference<DateTime?>? {
      val fnPtr = _1373628046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1373628046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OldDate(): IReference<DateTime?>? {
      val fnPtr = _1373628046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1373628046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarDatePickerDateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1373628046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePickerDateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57c212d7c2f254a09d41f263b1e5106e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePickerDateChangedEventArgs(ptr: Pointer?): WithDefault =
        ICalendarDatePickerDateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICalendarDatePickerDateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICalendarDatePickerDateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePickerDateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1373628046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePickerDateChangedEventArgs):
        Array<ICalendarDatePickerDateChangedEventArgs?> = (elements as
        Array<ICalendarDatePickerDateChangedEventArgs?>).castToImpl<ICalendarDatePickerDateChangedEventArgs,ICalendarDatePickerDateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePickerDateChangedEventArgs?> =
        arrayOfNulls<ICalendarDatePickerDateChangedEventArgs_Impl>(size) as
        Array<ICalendarDatePickerDateChangedEventArgs?>
  }
}
