package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDevicePicker.ABI::class)
@Signature("{84997aa2-034a-4440-8813-7d0bd479bf5a}")
@Guid("84997aa2034a444088137d0bd479bf5a")
@WinRTInterface("84997aa2034a444088137d0bd479bf5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePicker.ByReference::class)
public interface IDevicePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Filter(): DevicePickerFilter?

  @InterfaceMethod(1)
  public fun get_Appearance(): DevicePickerAppearance?

  @InterfaceMethod(2)
  public fun get_RequestedProperties(): IVector<String?>?

  @InterfaceMethod(3)
  public fun add_DeviceSelected(handler: TypedEventHandler<DevicePicker?,
      DeviceSelectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_DeviceSelected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_DisconnectButtonClicked(handler: TypedEventHandler<DevicePicker?,
      DeviceDisconnectButtonClickedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_DisconnectButtonClicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_DevicePickerDismissed(handler: TypedEventHandler<DevicePicker?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_DevicePickerDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun Show(selection: Rect?): Unit

  @InterfaceMethod(10)
  public fun Show(selection: Rect?, placement: Placement?): Unit

  @InterfaceMethod(11)
  public fun PickSingleDeviceAsync(selection: Rect?): IAsyncOperation<DeviceInformation?>?

  @InterfaceMethod(12)
  public fun PickSingleDeviceAsync(selection: Rect?, placement: Placement?):
      IAsyncOperation<DeviceInformation?>?

  @InterfaceMethod(13)
  public fun Hide(): Unit

  @InterfaceMethod(14)
  public fun SetDisplayStatus(
    device: DeviceInformation?,
    status: String?,
    options: DevicePickerDisplayStatusOptions?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDevicePicker>
      {
    public override fun getValue() = ABI.makeIDevicePicker(pointer.getPointer(0))

    public fun setValue(value: IDevicePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePicker {
    public val __733739806_Ptr: Pointer?

    public val _733739806_VtblPtr: Pointer?
      get() = __733739806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Filter(): DevicePickerFilter? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePickerFilter>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePickerFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Appearance(): DevicePickerAppearance? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePickerAppearance>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePickerAppearance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RequestedProperties(): IVector<String?>? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_DeviceSelected(handler: TypedEventHandler<DevicePicker?,
        DeviceSelectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_DeviceSelected(token: EventRegistrationToken?): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_DisconnectButtonClicked(handler: TypedEventHandler<DevicePicker?,
        DeviceDisconnectButtonClickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_DisconnectButtonClicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_DevicePickerDismissed(handler: TypedEventHandler<DevicePicker?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_DevicePickerDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Show(selection: Rect?): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(selection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Show(selection: Rect?, placement: Placement?): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(selection),
          marshalToNative(placement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun PickSingleDeviceAsync(selection: Rect?):
        IAsyncOperation<DeviceInformation?>? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformation?>>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun PickSingleDeviceAsync(selection: Rect?, placement: Placement?):
        IAsyncOperation<DeviceInformation?>? {
      val fnPtr = _733739806_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceInformation?>>()
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(selection),
          marshalToNative(placement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Hide(): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun SetDisplayStatus(
      device: DeviceInformation?,
      status: String?,
      options: DevicePickerDisplayStatusOptions?
    ): Unit {
      val fnPtr = _733739806_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733739806_Ptr, marshalToNative(device),
          marshalToNative(status), marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDevicePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __733739806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84997aa2034a444088137d0bd479bf5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePicker(ptr: Pointer?): WithDefault = IDevicePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePicker {
      val address = segment.toRawLongValue()
      return makeIDevicePicker(Pointer(address))
    }

    public override fun toNative(obj: IDevicePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__733739806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePicker): Array<IDevicePicker?> = (elements as
        Array<IDevicePicker?>).castToImpl<IDevicePicker,IDevicePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePicker?> =
        arrayOfNulls<IDevicePicker_Impl>(size) as Array<IDevicePicker?>
  }
}
