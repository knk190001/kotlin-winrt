package Windows.Devices.PointOfService.Provider

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

@ABIMarker(IBarcodeScannerEnableScannerRequest.ABI::class)
@Signature("{c0b3e9ba-816a-452b-bd77-b7e453ec446d}")
@Guid("c0b3e9ba816a452bbd77b7e453ec446d")
@WinRTInterface("c0b3e9ba816a452bbd77b7e453ec446d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerEnableScannerRequest.ByReference::class)
public interface IBarcodeScannerEnableScannerRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerEnableScannerRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerEnableScannerRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerEnableScannerRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerEnableScannerRequest {
    public val __754035366_Ptr: Pointer?

    public val _754035366_VtblPtr: Pointer?
      get() = __754035366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _754035366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__754035366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _754035366_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__754035366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerEnableScannerRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __754035366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerEnableScannerRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0b3e9ba816a452bbd77b7e453ec446d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerEnableScannerRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerEnableScannerRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerEnableScannerRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerEnableScannerRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerEnableScannerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__754035366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerEnableScannerRequest):
        Array<IBarcodeScannerEnableScannerRequest?> = (elements as
        Array<IBarcodeScannerEnableScannerRequest?>).castToImpl<IBarcodeScannerEnableScannerRequest,IBarcodeScannerEnableScannerRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerEnableScannerRequest?> =
        arrayOfNulls<IBarcodeScannerEnableScannerRequest_Impl>(size) as
        Array<IBarcodeScannerEnableScannerRequest?>
  }
}
