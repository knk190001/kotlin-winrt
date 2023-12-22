package Windows.UI.Xaml.Controls

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.UI.Xaml.DataTemplate
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITimePicker.ABI::class)
@Signature("{e39099f2-3aff-4792-909e-2d9941ec0357}")
@Guid("e39099f23aff4792909e2d9941ec0357")
@WinRTInterface("e39099f23aff4792909e2d9941ec0357")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePicker.ByReference::class)
public interface ITimePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_ClockIdentifier(): String?

  @InterfaceMethod(5)
  public fun put_ClockIdentifier(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_MinuteIncrement(): Int

  @InterfaceMethod(7)
  public fun put_MinuteIncrement(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Time(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_Time(value: TimeSpan?): Unit

  @InterfaceMethod(10)
  public fun add_TimeChanged(handler: EventHandler<TimePickerValueChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_TimeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimePicker> {
    public override fun getValue() = ABI.makeITimePicker(pointer.getPointer(0))

    public fun setValue(value: ITimePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePicker {
    public val __825810217_Ptr: Pointer?

    public val _825810217_VtblPtr: Pointer?
      get() = __825810217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _825810217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _825810217_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ClockIdentifier(): String? {
      val fnPtr = _825810217_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ClockIdentifier(value: String?): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MinuteIncrement(): Int {
      val fnPtr = _825810217_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MinuteIncrement(value: Int): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Time(): TimeSpan? {
      val fnPtr = _825810217_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Time(value: TimeSpan?): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_TimeChanged(handler: EventHandler<TimePickerValueChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _825810217_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_TimeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _825810217_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__825810217_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __825810217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e39099f23aff4792909e2d9941ec0357")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePicker(ptr: Pointer?): WithDefault = ITimePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePicker {
      val address = segment.toRawLongValue()
      return makeITimePicker(Pointer(address))
    }

    public override fun toNative(obj: ITimePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__825810217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePicker): Array<ITimePicker?> = (elements as
        Array<ITimePicker?>).castToImpl<ITimePicker,ITimePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePicker?> =
        arrayOfNulls<ITimePicker_Impl>(size) as Array<ITimePicker?>
  }
}
