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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeScannerSetSymbologyAttributesRequest2.ABI::class)
@Signature("{dffbbfc1-dba8-4b77-be1e-b56cd72f65b3}")
@Guid("dffbbfc1dba84b77be1eb56cd72f65b3")
@WinRTInterface("dffbbfc1dba84b77be1eb56cd72f65b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerSetSymbologyAttributesRequest2.ByReference::class)
public interface IBarcodeScannerSetSymbologyAttributesRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportFailedAsync(reason: Int): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(reason: Int, failedReasonDescription: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerSetSymbologyAttributesRequest2> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerSetSymbologyAttributesRequest2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerSetSymbologyAttributesRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerSetSymbologyAttributesRequest2 {
    public val __1038651955_Ptr: Pointer?

    public val _1038651955_VtblPtr: Pointer?
      get() = __1038651955_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportFailedAsync(reason: Int): IAsyncAction? {
      val fnPtr = _1038651955_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1038651955_Ptr, reason, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(reason: Int, failedReasonDescription: String?):
        IAsyncAction? {
      val fnPtr = _1038651955_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1038651955_Ptr, reason,
          marshalToNative(failedReasonDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerSetSymbologyAttributesRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1038651955_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerSetSymbologyAttributesRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dffbbfc1dba84b77be1eb56cd72f65b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerSetSymbologyAttributesRequest2(ptr: Pointer?): WithDefault =
        IBarcodeScannerSetSymbologyAttributesRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerSetSymbologyAttributesRequest2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerSetSymbologyAttributesRequest2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerSetSymbologyAttributesRequest2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1038651955_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerSetSymbologyAttributesRequest2):
        Array<IBarcodeScannerSetSymbologyAttributesRequest2?> = (elements as
        Array<IBarcodeScannerSetSymbologyAttributesRequest2?>).castToImpl<IBarcodeScannerSetSymbologyAttributesRequest2,IBarcodeScannerSetSymbologyAttributesRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerSetSymbologyAttributesRequest2?> =
        arrayOfNulls<IBarcodeScannerSetSymbologyAttributesRequest2_Impl>(size) as
        Array<IBarcodeScannerSetSymbologyAttributesRequest2?>
  }
}
