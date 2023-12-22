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

@ABIMarker(IBarcodeScannerHideVideoPreviewRequest.ABI::class)
@Signature("{fa4ebe7f-6670-40e1-b90b-bb10d8d425fa}")
@Guid("fa4ebe7f667040e1b90bbb10d8d425fa")
@WinRTInterface("fa4ebe7f667040e1b90bbb10d8d425fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerHideVideoPreviewRequest.ByReference::class)
public interface IBarcodeScannerHideVideoPreviewRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerHideVideoPreviewRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerHideVideoPreviewRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerHideVideoPreviewRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerHideVideoPreviewRequest {
    public val __1940238734_Ptr: Pointer?

    public val _1940238734_VtblPtr: Pointer?
      get() = __1940238734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1940238734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1940238734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1940238734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1940238734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerHideVideoPreviewRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1940238734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerHideVideoPreviewRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa4ebe7f667040e1b90bbb10d8d425fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerHideVideoPreviewRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerHideVideoPreviewRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerHideVideoPreviewRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerHideVideoPreviewRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerHideVideoPreviewRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1940238734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerHideVideoPreviewRequest):
        Array<IBarcodeScannerHideVideoPreviewRequest?> = (elements as
        Array<IBarcodeScannerHideVideoPreviewRequest?>).castToImpl<IBarcodeScannerHideVideoPreviewRequest,IBarcodeScannerHideVideoPreviewRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerHideVideoPreviewRequest?> =
        arrayOfNulls<IBarcodeScannerHideVideoPreviewRequest_Impl>(size) as
        Array<IBarcodeScannerHideVideoPreviewRequest?>
  }
}
