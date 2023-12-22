package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IBarcodeScanner.ABI::class)
@Signature("{bea33e06-b264-4f03-a9c1-45b20f01134f}")
@Guid("bea33e06b2644f03a9c145b20f01134f")
@WinRTInterface("bea33e06b2644f03a9c145b20f01134f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScanner.ByReference::class)
public interface IBarcodeScanner : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Capabilities(): BarcodeScannerCapabilities?

  @InterfaceMethod(2)
  public fun ClaimScannerAsync(): IAsyncOperation<ClaimedBarcodeScanner?>?

  @InterfaceMethod(3)
  public fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?): IAsyncOperation<String?>?

  @InterfaceMethod(4)
  public fun GetSupportedSymbologiesAsync(): IAsyncOperation<IVectorView<WinDef.UINT>?>?

  @InterfaceMethod(5)
  public fun IsSymbologySupportedAsync(barcodeSymbology: WinDef.UINT): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun RetrieveStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<IBuffer?>?

  @InterfaceMethod(7)
  public fun GetSupportedProfiles(): IVectorView<String?>?

  @InterfaceMethod(8)
  public fun IsProfileSupported(profile: String?): Boolean

  @InterfaceMethod(9)
  public fun add_StatusUpdated(handler: TypedEventHandler<BarcodeScanner?,
      BarcodeScannerStatusUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_StatusUpdated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScanner> {
    public override fun getValue() = ABI.makeIBarcodeScanner(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScanner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScanner {
    public val __1247617475_Ptr: Pointer?

    public val _1247617475_VtblPtr: Pointer?
      get() = __1247617475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): BarcodeScannerCapabilities? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClaimScannerAsync(): IAsyncOperation<ClaimedBarcodeScanner?>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedBarcodeScanner?>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ClaimedBarcodeScanner?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?):
        IAsyncOperation<String?>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSupportedSymbologiesAsync():
        IAsyncOperation<IVectorView<WinDef.UINT>?>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WinDef.UINT>?>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WinDef.UINT>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsSymbologySupportedAsync(barcodeSymbology: WinDef.UINT):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, barcodeSymbology, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RetrieveStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetSupportedProfiles(): IVectorView<String?>? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun IsProfileSupported(profile: String?): Boolean {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun add_StatusUpdated(handler: TypedEventHandler<BarcodeScanner?,
        BarcodeScannerStatusUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_StatusUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1247617475_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1247617475_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBarcodeScanner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1247617475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScanner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bea33e06b2644f03a9c145b20f01134f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScanner(ptr: Pointer?): WithDefault = IBarcodeScanner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScanner {
      val address = segment.toRawLongValue()
      return makeIBarcodeScanner(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1247617475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScanner): Array<IBarcodeScanner?> = (elements as
        Array<IBarcodeScanner?>).castToImpl<IBarcodeScanner,IBarcodeScanner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScanner?> =
        arrayOfNulls<IBarcodeScanner_Impl>(size) as Array<IBarcodeScanner?>
  }
}
