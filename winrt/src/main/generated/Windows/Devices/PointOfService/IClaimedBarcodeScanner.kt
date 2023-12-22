package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedBarcodeScanner.ABI::class)
@Signature("{4a63b49c-8fa4-4332-bb26-945d11d81e0f}")
@Guid("4a63b49c8fa44332bb26945d11d81e0f")
@WinRTInterface("4a63b49c8fa44332bb26945d11d81e0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScanner.ByReference::class)
public interface IClaimedBarcodeScanner : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsDisabledOnDataReceived(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsDisabledOnDataReceived(): Boolean

  @InterfaceMethod(4)
  public fun put_IsDecodeDataEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsDecodeDataEnabled(): Boolean

  @InterfaceMethod(6)
  public fun EnableAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun DisableAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun RetainDevice(): Unit

  @InterfaceMethod(9)
  public fun SetActiveSymbologiesAsync(symbologies: IIterable<WinDef.UINT>?): IAsyncAction?

  @InterfaceMethod(10)
  public fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(11)
  public fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?, String?>?>?):
      IAsyncAction?

  @InterfaceMethod(12)
  public fun SetActiveProfileAsync(profile: String?): IAsyncAction?

  @InterfaceMethod(13)
  public fun add_DataReceived(handler: TypedEventHandler<ClaimedBarcodeScanner?,
      BarcodeScannerDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_DataReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_TriggerPressed(handler: EventHandler<ClaimedBarcodeScanner?>?):
      EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_TriggerPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_TriggerReleased(handler: EventHandler<ClaimedBarcodeScanner?>?):
      EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_TriggerReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_ReleaseDeviceRequested(handler: EventHandler<ClaimedBarcodeScanner?>?):
      EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_ImagePreviewReceived(handler: TypedEventHandler<ClaimedBarcodeScanner?,
      BarcodeScannerImagePreviewReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_ImagePreviewReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_ErrorOccurred(handler: TypedEventHandler<ClaimedBarcodeScanner?,
      BarcodeScannerErrorOccurredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScanner> {
    public override fun getValue() = ABI.makeIClaimedBarcodeScanner(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScanner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScanner {
    public val __514255450_Ptr: Pointer?

    public val _514255450_VtblPtr: Pointer?
      get() = __514255450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _514255450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsDisabledOnDataReceived(value: Boolean): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsDisabledOnDataReceived(): Boolean {
      val fnPtr = _514255450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsDecodeDataEnabled(value: Boolean): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsDecodeDataEnabled(): Boolean {
      val fnPtr = _514255450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun EnableAsync(): IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DisableAsync(): IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RetainDevice(): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetActiveSymbologiesAsync(symbologies: IIterable<WinDef.UINT>?):
        IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(symbologies), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?,
        String?>?>?): IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(statistics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SetActiveProfileAsync(profile: String?): IAsyncAction? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun add_DataReceived(handler: TypedEventHandler<ClaimedBarcodeScanner?,
        BarcodeScannerDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_DataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_TriggerPressed(handler: EventHandler<ClaimedBarcodeScanner?>?):
        EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_TriggerPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_TriggerReleased(handler: EventHandler<ClaimedBarcodeScanner?>?):
        EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_TriggerReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_ReleaseDeviceRequested(handler: EventHandler<ClaimedBarcodeScanner?>?):
        EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_ImagePreviewReceived(handler: TypedEventHandler<ClaimedBarcodeScanner?,
        BarcodeScannerImagePreviewReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_ImagePreviewReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_ErrorOccurred(handler: TypedEventHandler<ClaimedBarcodeScanner?,
        BarcodeScannerErrorOccurredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _514255450_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _514255450_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__514255450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedBarcodeScanner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __514255450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScanner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a63b49c8fa44332bb26945d11d81e0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScanner(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScanner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScanner {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScanner(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__514255450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScanner): Array<IClaimedBarcodeScanner?> =
        (elements as
        Array<IClaimedBarcodeScanner?>).castToImpl<IClaimedBarcodeScanner,IClaimedBarcodeScanner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScanner?> =
        arrayOfNulls<IClaimedBarcodeScanner_Impl>(size) as Array<IClaimedBarcodeScanner?>
  }
}
