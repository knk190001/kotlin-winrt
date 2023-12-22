package Windows.Devices.PointOfService.Provider

import Windows.Devices.PointOfService.BarcodeScannerReport
import Windows.Devices.PointOfService.UnifiedPosErrorData
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IBarcodeScannerProviderConnection.ABI::class)
@Signature("{b44acbed-0b3a-4fa3-86c5-491ea30780eb}")
@Guid("b44acbed0b3a4fa386c5491ea30780eb")
@WinRTInterface("b44acbed0b3a4fa386c5491ea30780eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerProviderConnection.ByReference::class)
public interface IBarcodeScannerProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_VideoDeviceId(): String?

  @InterfaceMethod(2)
  public fun get_SupportedSymbologies(): IVector<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_CompanyName(): String?

  @InterfaceMethod(4)
  public fun put_CompanyName(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Name(): String?

  @InterfaceMethod(6)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_Version(): String?

  @InterfaceMethod(8)
  public fun put_Version(value: String?): Unit

  @InterfaceMethod(9)
  public fun Start(): Unit

  @InterfaceMethod(10)
  public fun ReportScannedDataAsync(report: BarcodeScannerReport?): IAsyncAction?

  @InterfaceMethod(11)
  public fun ReportTriggerStateAsync(state: BarcodeScannerTriggerState?): IAsyncAction?

  @InterfaceMethod(12)
  public fun ReportErrorAsync(errorData: UnifiedPosErrorData?): IAsyncAction?

  @InterfaceMethod(13)
  public fun ReportErrorAsync(
    errorData: UnifiedPosErrorData?,
    isRetriable: Boolean,
    scanReport: BarcodeScannerReport?
  ): IAsyncAction?

  @InterfaceMethod(14)
  public
      fun add_EnableScannerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerEnableScannerRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_EnableScannerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public
      fun add_DisableScannerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerDisableScannerRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_DisableScannerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public
      fun add_SetActiveSymbologiesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerSetActiveSymbologiesRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_SetActiveSymbologiesRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public
      fun add_StartSoftwareTriggerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerStartSoftwareTriggerRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_StartSoftwareTriggerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public
      fun add_StopSoftwareTriggerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerStopSoftwareTriggerRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_StopSoftwareTriggerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public
      fun add_GetBarcodeSymbologyAttributesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerGetSymbologyAttributesRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_GetBarcodeSymbologyAttributesRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public
      fun add_SetBarcodeSymbologyAttributesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerSetSymbologyAttributesRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_SetBarcodeSymbologyAttributesRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public
      fun add_HideVideoPreviewRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
      BarcodeScannerHideVideoPreviewRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_HideVideoPreviewRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerProviderConnection> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerProviderConnection {
    public val __1092666305_Ptr: Pointer?

    public val _1092666305_VtblPtr: Pointer?
      get() = __1092666305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoDeviceId(): String? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedSymbologies(): IVector<WinDef.UINT>? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CompanyName(): String? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_CompanyName(value: String?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Name(): String? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Version(): String? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Version(value: String?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Start(): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun ReportScannedDataAsync(report: BarcodeScannerReport?): IAsyncAction? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(report), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun ReportTriggerStateAsync(state: BarcodeScannerTriggerState?): IAsyncAction? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(state), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReportErrorAsync(errorData: UnifiedPosErrorData?): IAsyncAction? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(errorData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun ReportErrorAsync(
      errorData: UnifiedPosErrorData?,
      isRetriable: Boolean,
      scanReport: BarcodeScannerReport?
    ): IAsyncAction? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(errorData), isRetriable,
          marshalToNative(scanReport), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override
        fun add_EnableScannerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerEnableScannerRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_EnableScannerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override
        fun add_DisableScannerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerDisableScannerRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_DisableScannerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override
        fun add_SetActiveSymbologiesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerSetActiveSymbologiesRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_SetActiveSymbologiesRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override
        fun add_StartSoftwareTriggerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerStartSoftwareTriggerRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_StartSoftwareTriggerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override
        fun add_StopSoftwareTriggerRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerStopSoftwareTriggerRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_StopSoftwareTriggerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override
        fun add_GetBarcodeSymbologyAttributesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerGetSymbologyAttributesRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override
        fun remove_GetBarcodeSymbologyAttributesRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override
        fun add_SetBarcodeSymbologyAttributesRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerSetSymbologyAttributesRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override
        fun remove_SetBarcodeSymbologyAttributesRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override
        fun add_HideVideoPreviewRequested(handler: TypedEventHandler<BarcodeScannerProviderConnection?,
        BarcodeScannerHideVideoPreviewRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_HideVideoPreviewRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1092666305_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092666305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBarcodeScannerProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1092666305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b44acbed0b3a4fa386c5491ea30780eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerProviderConnection(ptr: Pointer?): WithDefault =
        IBarcodeScannerProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerProviderConnection {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1092666305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerProviderConnection):
        Array<IBarcodeScannerProviderConnection?> = (elements as
        Array<IBarcodeScannerProviderConnection?>).castToImpl<IBarcodeScannerProviderConnection,IBarcodeScannerProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerProviderConnection?> =
        arrayOfNulls<IBarcodeScannerProviderConnection_Impl>(size) as
        Array<IBarcodeScannerProviderConnection?>
  }
}
