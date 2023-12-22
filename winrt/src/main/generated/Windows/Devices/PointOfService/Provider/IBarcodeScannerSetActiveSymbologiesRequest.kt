package Windows.Devices.PointOfService.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IBarcodeScannerSetActiveSymbologiesRequest.ABI::class)
@Signature("{db3f32b9-f7da-41a1-9f79-07bcd95f0bdf}")
@Guid("db3f32b9f7da41a19f7907bcd95f0bdf")
@WinRTInterface("db3f32b9f7da41a19f7907bcd95f0bdf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerSetActiveSymbologiesRequest.ByReference::class)
public interface IBarcodeScannerSetActiveSymbologiesRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbologies(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerSetActiveSymbologiesRequest> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerSetActiveSymbologiesRequest(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerSetActiveSymbologiesRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerSetActiveSymbologiesRequest {
    public val __1569419906_Ptr: Pointer?

    public val _1569419906_VtblPtr: Pointer?
      get() = __1569419906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbologies(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1569419906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1569419906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1569419906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1569419906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1569419906_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1569419906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerSetActiveSymbologiesRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1569419906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerSetActiveSymbologiesRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db3f32b9f7da41a19f7907bcd95f0bdf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerSetActiveSymbologiesRequest(ptr: Pointer?): WithDefault =
        IBarcodeScannerSetActiveSymbologiesRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerSetActiveSymbologiesRequest {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerSetActiveSymbologiesRequest(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerSetActiveSymbologiesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1569419906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerSetActiveSymbologiesRequest):
        Array<IBarcodeScannerSetActiveSymbologiesRequest?> = (elements as
        Array<IBarcodeScannerSetActiveSymbologiesRequest?>).castToImpl<IBarcodeScannerSetActiveSymbologiesRequest,IBarcodeScannerSetActiveSymbologiesRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerSetActiveSymbologiesRequest?> =
        arrayOfNulls<IBarcodeScannerSetActiveSymbologiesRequest_Impl>(size) as
        Array<IBarcodeScannerSetActiveSymbologiesRequest?>
  }
}
