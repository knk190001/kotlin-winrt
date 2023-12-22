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

@ABIMarker(IBarcodeScannerDisableScannerRequest2.ABI::class)
@Signature("{ccdfe625-65c3-4ccc-b457-f39c7a9ea60d}")
@Guid("ccdfe62565c34cccb457f39c7a9ea60d")
@WinRTInterface("ccdfe62565c34cccb457f39c7a9ea60d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerDisableScannerRequest2.ByReference::class)
public interface IBarcodeScannerDisableScannerRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportFailedAsync(reason: Int): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(reason: Int, failedReasonDescription: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerDisableScannerRequest2> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerDisableScannerRequest2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerDisableScannerRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerDisableScannerRequest2 {
    public val __5981867_Ptr: Pointer?

    public val _5981867_VtblPtr: Pointer?
      get() = __5981867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportFailedAsync(reason: Int): IAsyncAction? {
      val fnPtr = _5981867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__5981867_Ptr, reason, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(reason: Int, failedReasonDescription: String?):
        IAsyncAction? {
      val fnPtr = _5981867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__5981867_Ptr, reason, marshalToNative(failedReasonDescription),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerDisableScannerRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __5981867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerDisableScannerRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccdfe62565c34cccb457f39c7a9ea60d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerDisableScannerRequest2(ptr: Pointer?): WithDefault =
        IBarcodeScannerDisableScannerRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerDisableScannerRequest2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerDisableScannerRequest2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerDisableScannerRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__5981867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerDisableScannerRequest2):
        Array<IBarcodeScannerDisableScannerRequest2?> = (elements as
        Array<IBarcodeScannerDisableScannerRequest2?>).castToImpl<IBarcodeScannerDisableScannerRequest2,IBarcodeScannerDisableScannerRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerDisableScannerRequest2?> =
        arrayOfNulls<IBarcodeScannerDisableScannerRequest2_Impl>(size) as
        Array<IBarcodeScannerDisableScannerRequest2?>
  }
}
