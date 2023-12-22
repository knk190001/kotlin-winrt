package Windows.Devices.PointOfService.Provider

import Windows.Devices.PointOfService.BarcodeSymbologyAttributes
import Windows.Foundation.IAsyncAction
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeScannerSetSymbologyAttributesRequest.ABI::class)
@Signature("{32fb814f-a37f-48b0-acea-dce1480f12ae}")
@Guid("32fb814fa37f48b0aceadce1480f12ae")
@WinRTInterface("32fb814fa37f48b0aceadce1480f12ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerSetSymbologyAttributesRequest.ByReference::class)
public interface IBarcodeScannerSetSymbologyAttributesRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbology(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Attributes(): BarcodeSymbologyAttributes?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerSetSymbologyAttributesRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerSetSymbologyAttributesRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerSetSymbologyAttributesRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerSetSymbologyAttributesRequest {
    public val __1213421089_Ptr: Pointer?

    public val _1213421089_VtblPtr: Pointer?
      get() = __1213421089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbology(): WinDef.UINT {
      val fnPtr = _1213421089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1213421089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Attributes(): BarcodeSymbologyAttributes? {
      val fnPtr = _1213421089_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeSymbologyAttributes>()
      val hr = fn.invokeHR(arrayOf(__1213421089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeSymbologyAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1213421089_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1213421089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1213421089_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1213421089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerSetSymbologyAttributesRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213421089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerSetSymbologyAttributesRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32fb814fa37f48b0aceadce1480f12ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerSetSymbologyAttributesRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerSetSymbologyAttributesRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerSetSymbologyAttributesRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerSetSymbologyAttributesRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerSetSymbologyAttributesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213421089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerSetSymbologyAttributesRequest):
        Array<IBarcodeScannerSetSymbologyAttributesRequest?> = (elements as
        Array<IBarcodeScannerSetSymbologyAttributesRequest?>).castToImpl<IBarcodeScannerSetSymbologyAttributesRequest,IBarcodeScannerSetSymbologyAttributesRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerSetSymbologyAttributesRequest?> =
        arrayOfNulls<IBarcodeScannerSetSymbologyAttributesRequest_Impl>(size) as
        Array<IBarcodeScannerSetSymbologyAttributesRequest?>
  }
}
