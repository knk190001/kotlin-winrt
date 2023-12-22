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

@ABIMarker(IBarcodeScannerDisableScannerRequest.ABI::class)
@Signature("{88ecf7c0-37b9-4275-8e77-c8e52ae5a9c8}")
@Guid("88ecf7c037b942758e77c8e52ae5a9c8")
@WinRTInterface("88ecf7c037b942758e77c8e52ae5a9c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerDisableScannerRequest.ByReference::class)
public interface IBarcodeScannerDisableScannerRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerDisableScannerRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerDisableScannerRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerDisableScannerRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerDisableScannerRequest {
    public val __1247118951_Ptr: Pointer?

    public val _1247118951_VtblPtr: Pointer?
      get() = __1247118951_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1247118951_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1247118951_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1247118951_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1247118951_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerDisableScannerRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1247118951_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerDisableScannerRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88ecf7c037b942758e77c8e52ae5a9c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerDisableScannerRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerDisableScannerRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerDisableScannerRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerDisableScannerRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerDisableScannerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1247118951_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerDisableScannerRequest):
        Array<IBarcodeScannerDisableScannerRequest?> = (elements as
        Array<IBarcodeScannerDisableScannerRequest?>).castToImpl<IBarcodeScannerDisableScannerRequest,IBarcodeScannerDisableScannerRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerDisableScannerRequest?> =
        arrayOfNulls<IBarcodeScannerDisableScannerRequest_Impl>(size) as
        Array<IBarcodeScannerDisableScannerRequest?>
  }
}
