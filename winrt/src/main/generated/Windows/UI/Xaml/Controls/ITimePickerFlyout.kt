package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(ITimePickerFlyout.ABI::class)
@Signature("{bb739d75-e836-439e-86d5-506d2d18e404}")
@Guid("bb739d75e836439e86d5506d2d18e404")
@WinRTInterface("bb739d75e836439e86d5506d2d18e404")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyout.ByReference::class)
public interface ITimePickerFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClockIdentifier(): String?

  @InterfaceMethod(1)
  public fun put_ClockIdentifier(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Time(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Time(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_MinuteIncrement(): Int

  @InterfaceMethod(5)
  public fun put_MinuteIncrement(value: Int): Unit

  @InterfaceMethod(6)
  public fun add_TimePicked(handler: TypedEventHandler<TimePickerFlyout?, TimePickedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_TimePicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun ShowAtAsync(target: FrameworkElement?): IAsyncOperation<IReference<TimeSpan?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyout> {
    public override fun getValue() = ABI.makeITimePickerFlyout(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyout {
    public val __597738574_Ptr: Pointer?

    public val _597738574_VtblPtr: Pointer?
      get() = __597738574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClockIdentifier(): String? {
      val fnPtr = _597738574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ClockIdentifier(value: String?): Unit {
      val fnPtr = _597738574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Time(): TimeSpan? {
      val fnPtr = _597738574_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Time(value: TimeSpan?): Unit {
      val fnPtr = _597738574_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinuteIncrement(): Int {
      val fnPtr = _597738574_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MinuteIncrement(value: Int): Unit {
      val fnPtr = _597738574_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_TimePicked(handler: TypedEventHandler<TimePickerFlyout?,
        TimePickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _597738574_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_TimePicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _597738574_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ShowAtAsync(target: FrameworkElement?):
        IAsyncOperation<IReference<TimeSpan?>?>? {
      val fnPtr = _597738574_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IReference<TimeSpan?>?>>()
      val hr = fn.invokeHR(arrayOf(__597738574_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IReference<TimeSpan?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597738574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb739d75e836439e86d5506d2d18e404")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyout(ptr: Pointer?): WithDefault = ITimePickerFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerFlyout {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597738574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyout): Array<ITimePickerFlyout?> = (elements
        as Array<ITimePickerFlyout?>).castToImpl<ITimePickerFlyout,ITimePickerFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyout?> =
        arrayOfNulls<ITimePickerFlyout_Impl>(size) as Array<ITimePickerFlyout?>
  }
}
