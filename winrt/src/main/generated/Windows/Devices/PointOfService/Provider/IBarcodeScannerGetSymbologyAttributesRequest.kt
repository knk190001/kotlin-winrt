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

@ABIMarker(IBarcodeScannerGetSymbologyAttributesRequest.ABI::class)
@Signature("{9774c46a-58e4-4c5f-b8e9-e41467632700}")
@Guid("9774c46a58e44c5fb8e9e41467632700")
@WinRTInterface("9774c46a58e44c5fb8e9e41467632700")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerGetSymbologyAttributesRequest.ByReference::class)
public interface IBarcodeScannerGetSymbologyAttributesRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbology(): WinDef.UINT

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(attributes: BarcodeSymbologyAttributes?): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerGetSymbologyAttributesRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerGetSymbologyAttributesRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerGetSymbologyAttributesRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerGetSymbologyAttributesRequest {
    public val __940706861_Ptr: Pointer?

    public val _940706861_VtblPtr: Pointer?
      get() = __940706861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbology(): WinDef.UINT {
      val fnPtr = _940706861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__940706861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(attributes: BarcodeSymbologyAttributes?):
        IAsyncAction? {
      val fnPtr = _940706861_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__940706861_Ptr, marshalToNative(attributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _940706861_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__940706861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerGetSymbologyAttributesRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __940706861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerGetSymbologyAttributesRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9774c46a58e44c5fb8e9e41467632700")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerGetSymbologyAttributesRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerGetSymbologyAttributesRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerGetSymbologyAttributesRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerGetSymbologyAttributesRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerGetSymbologyAttributesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__940706861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerGetSymbologyAttributesRequest):
        Array<IBarcodeScannerGetSymbologyAttributesRequest?> = (elements as
        Array<IBarcodeScannerGetSymbologyAttributesRequest?>).castToImpl<IBarcodeScannerGetSymbologyAttributesRequest,IBarcodeScannerGetSymbologyAttributesRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerGetSymbologyAttributesRequest?> =
        arrayOfNulls<IBarcodeScannerGetSymbologyAttributesRequest_Impl>(size) as
        Array<IBarcodeScannerGetSymbologyAttributesRequest?>
  }
}
