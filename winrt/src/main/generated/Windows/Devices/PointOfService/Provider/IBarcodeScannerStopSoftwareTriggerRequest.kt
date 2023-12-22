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

@ABIMarker(IBarcodeScannerStopSoftwareTriggerRequest.ABI::class)
@Signature("{6f9faf35-e287-4ca8-b70d-5a91d694f668}")
@Guid("6f9faf35e2874ca8b70d5a91d694f668")
@WinRTInterface("6f9faf35e2874ca8b70d5a91d694f668")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStopSoftwareTriggerRequest.ByReference::class)
public interface IBarcodeScannerStopSoftwareTriggerRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStopSoftwareTriggerRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerStopSoftwareTriggerRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStopSoftwareTriggerRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStopSoftwareTriggerRequest {
    public val __1134404594_Ptr: Pointer?

    public val _1134404594_VtblPtr: Pointer?
      get() = __1134404594_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1134404594_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1134404594_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1134404594_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1134404594_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerStopSoftwareTriggerRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1134404594_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStopSoftwareTriggerRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f9faf35e2874ca8b70d5a91d694f668")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStopSoftwareTriggerRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerStopSoftwareTriggerRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerStopSoftwareTriggerRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStopSoftwareTriggerRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStopSoftwareTriggerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1134404594_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStopSoftwareTriggerRequest):
        Array<IBarcodeScannerStopSoftwareTriggerRequest?> = (elements as
        Array<IBarcodeScannerStopSoftwareTriggerRequest?>).castToImpl<IBarcodeScannerStopSoftwareTriggerRequest,IBarcodeScannerStopSoftwareTriggerRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerStopSoftwareTriggerRequest?> =
        arrayOfNulls<IBarcodeScannerStopSoftwareTriggerRequest_Impl>(size) as
        Array<IBarcodeScannerStopSoftwareTriggerRequest?>
  }
}
