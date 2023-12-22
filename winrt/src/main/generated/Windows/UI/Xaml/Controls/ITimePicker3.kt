package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(ITimePicker3.ABI::class)
@Signature("{fa6e4f91-ac32-59a4-94da-8b3d64289ed6}")
@Guid("fa6e4f91ac3259a494da8b3d64289ed6")
@WinRTInterface("fa6e4f91ac3259a494da8b3d64289ed6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePicker3.ByReference::class)
public interface ITimePicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedTime(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun put_SelectedTime(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(2)
  public fun add_SelectedTimeChanged(handler: TypedEventHandler<TimePicker?,
      TimePickerSelectedValueChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SelectedTimeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimePicker3> {
    public override fun getValue() = ABI.makeITimePicker3(pointer.getPointer(0))

    public fun setValue(value: ITimePicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePicker3 {
    public val __169687100_Ptr: Pointer?

    public val _169687100_VtblPtr: Pointer?
      get() = __169687100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedTime(): IReference<TimeSpan?>? {
      val fnPtr = _169687100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__169687100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectedTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _169687100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__169687100_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SelectedTimeChanged(handler: TypedEventHandler<TimePicker?,
        TimePickerSelectedValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _169687100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__169687100_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SelectedTimeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _169687100_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__169687100_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimePicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __169687100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa6e4f91ac3259a494da8b3d64289ed6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePicker3(ptr: Pointer?): WithDefault = ITimePicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePicker3 {
      val address = segment.toRawLongValue()
      return makeITimePicker3(Pointer(address))
    }

    public override fun toNative(obj: ITimePicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__169687100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePicker3): Array<ITimePicker3?> = (elements as
        Array<ITimePicker3?>).castToImpl<ITimePicker3,ITimePicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePicker3?> =
        arrayOfNulls<ITimePicker3_Impl>(size) as Array<ITimePicker3?>
  }
}
