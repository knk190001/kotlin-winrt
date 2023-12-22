package Windows.Media.DialProtocol

import Windows.Devices.Enumeration.DevicePickerAppearance
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
import Windows.UI.Popups.Placement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDialDevicePicker.ABI::class)
@Signature("{ba7e520a-ff59-4f4b-bdac-d89f495ad6e1}")
@Guid("ba7e520aff594f4bbdacd89f495ad6e1")
@WinRTInterface("ba7e520aff594f4bbdacd89f495ad6e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDevicePicker.ByReference::class)
public interface IDialDevicePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Filter(): DialDevicePickerFilter?

  @InterfaceMethod(1)
  public fun get_Appearance(): DevicePickerAppearance?

  @InterfaceMethod(2)
  public fun add_DialDeviceSelected(handler: TypedEventHandler<DialDevicePicker?,
      DialDeviceSelectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DialDeviceSelected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_DisconnectButtonClicked(handler: TypedEventHandler<DialDevicePicker?,
      DialDisconnectButtonClickedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DisconnectButtonClicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_DialDevicePickerDismissed(handler: TypedEventHandler<DialDevicePicker?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DialDevicePickerDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun Show(selection: Rect?): Unit

  @InterfaceMethod(9)
  public fun Show(selection: Rect?, preferredPlacement: Placement?): Unit

  @InterfaceMethod(10)
  public fun PickSingleDialDeviceAsync(selection: Rect?): IAsyncOperation<DialDevice?>?

  @InterfaceMethod(11)
  public fun PickSingleDialDeviceAsync(selection: Rect?, preferredPlacement: Placement?):
      IAsyncOperation<DialDevice?>?

  @InterfaceMethod(12)
  public fun Hide(): Unit

  @InterfaceMethod(13)
  public fun SetDisplayStatus(device: DialDevice?, status: DialDeviceDisplayStatus?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialDevicePicker> {
    public override fun getValue() = ABI.makeIDialDevicePicker(pointer.getPointer(0))

    public fun setValue(value: IDialDevicePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDevicePicker {
    public val __1889880192_Ptr: Pointer?

    public val _1889880192_VtblPtr: Pointer?
      get() = __1889880192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Filter(): DialDevicePickerFilter? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DialDevicePickerFilter>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DialDevicePickerFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Appearance(): DevicePickerAppearance? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePickerAppearance>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePickerAppearance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_DialDeviceSelected(handler: TypedEventHandler<DialDevicePicker?,
        DialDeviceSelectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DialDeviceSelected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_DisconnectButtonClicked(handler: TypedEventHandler<DialDevicePicker?,
        DialDisconnectButtonClickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DisconnectButtonClicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_DialDevicePickerDismissed(handler: TypedEventHandler<DialDevicePicker?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DialDevicePickerDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Show(selection: Rect?): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(selection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Show(selection: Rect?, preferredPlacement: Placement?): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun PickSingleDialDeviceAsync(selection: Rect?): IAsyncOperation<DialDevice?>? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun PickSingleDialDeviceAsync(selection: Rect?, preferredPlacement: Placement?):
        IAsyncOperation<DialDevice?>? {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DialDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DialDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun Hide(): Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun SetDisplayStatus(device: DialDevice?, status: DialDeviceDisplayStatus?):
        Unit {
      val fnPtr = _1889880192_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1889880192_Ptr, marshalToNative(device),
          marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDialDevicePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1889880192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDevicePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba7e520aff594f4bbdacd89f495ad6e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDevicePicker(ptr: Pointer?): WithDefault = IDialDevicePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDevicePicker {
      val address = segment.toRawLongValue()
      return makeIDialDevicePicker(Pointer(address))
    }

    public override fun toNative(obj: IDialDevicePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1889880192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDevicePicker): Array<IDialDevicePicker?> = (elements
        as Array<IDialDevicePicker?>).castToImpl<IDialDevicePicker,IDialDevicePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDevicePicker?> =
        arrayOfNulls<IDialDevicePicker_Impl>(size) as Array<IDialDevicePicker?>
  }
}
