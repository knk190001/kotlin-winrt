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

@ABIMarker(IBarcodeScannerGetSymbologyAttributesRequest2.ABI::class)
@Signature("{6a6a2b13-75a8-49fb-b852-bfb93d760af7}")
@Guid("6a6a2b1375a849fbb852bfb93d760af7")
@WinRTInterface("6a6a2b1375a849fbb852bfb93d760af7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerGetSymbologyAttributesRequest2.ByReference::class)
public interface IBarcodeScannerGetSymbologyAttributesRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportFailedAsync(reason: Int): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(reason: Int, failedReasonDescription: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerGetSymbologyAttributesRequest2> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerGetSymbologyAttributesRequest2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerGetSymbologyAttributesRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerGetSymbologyAttributesRequest2 {
    public val __902858431_Ptr: Pointer?

    public val _902858431_VtblPtr: Pointer?
      get() = __902858431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportFailedAsync(reason: Int): IAsyncAction? {
      val fnPtr = _902858431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__902858431_Ptr, reason, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(reason: Int, failedReasonDescription: String?):
        IAsyncAction? {
      val fnPtr = _902858431_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__902858431_Ptr, reason,
          marshalToNative(failedReasonDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerGetSymbologyAttributesRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __902858431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerGetSymbologyAttributesRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a6a2b1375a849fbb852bfb93d760af7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerGetSymbologyAttributesRequest2(ptr: Pointer?): WithDefault =
        IBarcodeScannerGetSymbologyAttributesRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerGetSymbologyAttributesRequest2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerGetSymbologyAttributesRequest2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerGetSymbologyAttributesRequest2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__902858431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerGetSymbologyAttributesRequest2):
        Array<IBarcodeScannerGetSymbologyAttributesRequest2?> = (elements as
        Array<IBarcodeScannerGetSymbologyAttributesRequest2?>).castToImpl<IBarcodeScannerGetSymbologyAttributesRequest2,IBarcodeScannerGetSymbologyAttributesRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerGetSymbologyAttributesRequest2?> =
        arrayOfNulls<IBarcodeScannerGetSymbologyAttributesRequest2_Impl>(size) as
        Array<IBarcodeScannerGetSymbologyAttributesRequest2?>
  }
}
