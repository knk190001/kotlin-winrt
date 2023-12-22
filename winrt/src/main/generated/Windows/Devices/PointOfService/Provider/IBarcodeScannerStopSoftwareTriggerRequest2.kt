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

@ABIMarker(IBarcodeScannerStopSoftwareTriggerRequest2.ABI::class)
@Signature("{cb57c5dd-fe50-49f8-a0b4-bdc230814da2}")
@Guid("cb57c5ddfe5049f8a0b4bdc230814da2")
@WinRTInterface("cb57c5ddfe5049f8a0b4bdc230814da2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStopSoftwareTriggerRequest2.ByReference::class)
public interface IBarcodeScannerStopSoftwareTriggerRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportFailedAsync(reason: Int): IAsyncAction?

  @InterfaceMethod(1)
  public fun ReportFailedAsync(reason: Int, failedReasonDescription: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStopSoftwareTriggerRequest2> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerStopSoftwareTriggerRequest2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStopSoftwareTriggerRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStopSoftwareTriggerRequest2 {
    public val __806804096_Ptr: Pointer?

    public val _806804096_VtblPtr: Pointer?
      get() = __806804096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportFailedAsync(reason: Int): IAsyncAction? {
      val fnPtr = _806804096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__806804096_Ptr, reason, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportFailedAsync(reason: Int, failedReasonDescription: String?):
        IAsyncAction? {
      val fnPtr = _806804096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__806804096_Ptr, reason,
          marshalToNative(failedReasonDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerStopSoftwareTriggerRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __806804096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStopSoftwareTriggerRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb57c5ddfe5049f8a0b4bdc230814da2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStopSoftwareTriggerRequest2(ptr: Pointer?): WithDefault =
        IBarcodeScannerStopSoftwareTriggerRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerStopSoftwareTriggerRequest2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStopSoftwareTriggerRequest2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStopSoftwareTriggerRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__806804096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStopSoftwareTriggerRequest2):
        Array<IBarcodeScannerStopSoftwareTriggerRequest2?> = (elements as
        Array<IBarcodeScannerStopSoftwareTriggerRequest2?>).castToImpl<IBarcodeScannerStopSoftwareTriggerRequest2,IBarcodeScannerStopSoftwareTriggerRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerStopSoftwareTriggerRequest2?> =
        arrayOfNulls<IBarcodeScannerStopSoftwareTriggerRequest2_Impl>(size) as
        Array<IBarcodeScannerStopSoftwareTriggerRequest2?>
  }
}
