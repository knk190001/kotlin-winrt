package Windows.UI.Xaml.Controls

import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
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

@ABIMarker(IDatePicker3.ABI::class)
@Signature("{7da12a3b-a764-5ae1-abae-6affc1428e1e}")
@Guid("7da12a3ba7645ae1abae6affc1428e1e")
@WinRTInterface("7da12a3ba7645ae1abae6affc1428e1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePicker3.ByReference::class)
public interface IDatePicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDate(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun put_SelectedDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun add_SelectedDateChanged(handler: TypedEventHandler<DatePicker?,
      DatePickerSelectedValueChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SelectedDateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDatePicker3> {
    public override fun getValue() = ABI.makeIDatePicker3(pointer.getPointer(0))

    public fun setValue(value: IDatePicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePicker3 {
    public val __660966459_Ptr: Pointer?

    public val _660966459_VtblPtr: Pointer?
      get() = __660966459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDate(): IReference<DateTime?>? {
      val fnPtr = _660966459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__660966459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectedDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _660966459_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__660966459_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SelectedDateChanged(handler: TypedEventHandler<DatePicker?,
        DatePickerSelectedValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _660966459_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__660966459_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SelectedDateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _660966459_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__660966459_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatePicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __660966459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7da12a3ba7645ae1abae6affc1428e1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePicker3(ptr: Pointer?): WithDefault = IDatePicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePicker3 {
      val address = segment.toRawLongValue()
      return makeIDatePicker3(Pointer(address))
    }

    public override fun toNative(obj: IDatePicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660966459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePicker3): Array<IDatePicker3?> = (elements as
        Array<IDatePicker3?>).castToImpl<IDatePicker3,IDatePicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePicker3?> =
        arrayOfNulls<IDatePicker3_Impl>(size) as Array<IDatePicker3?>
  }
}
