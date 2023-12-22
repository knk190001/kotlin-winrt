package Windows.Media.Transcoding

import Windows.Foundation.IAsyncActionWithProgress
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrepareTranscodeResult.ABI::class)
@Signature("{05f25dce-994f-4a34-9d68-97ccce1730d6}")
@Guid("05f25dce994f4a349d6897ccce1730d6")
@WinRTInterface("05f25dce994f4a349d6897ccce1730d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrepareTranscodeResult.ByReference::class)
public interface IPrepareTranscodeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanTranscode(): Boolean

  @InterfaceMethod(1)
  public fun get_FailureReason(): TranscodeFailureReason?

  @InterfaceMethod(2)
  public fun TranscodeAsync(): IAsyncActionWithProgress<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrepareTranscodeResult> {
    public override fun getValue() = ABI.makeIPrepareTranscodeResult(pointer.getPointer(0))

    public fun setValue(value: IPrepareTranscodeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrepareTranscodeResult {
    public val __1706553879_Ptr: Pointer?

    public val _1706553879_VtblPtr: Pointer?
      get() = __1706553879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanTranscode(): Boolean {
      val fnPtr = _1706553879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1706553879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_FailureReason(): TranscodeFailureReason? {
      val fnPtr = _1706553879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TranscodeFailureReason>()
      val hr = fn.invokeHR(arrayOf(__1706553879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TranscodeFailureReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TranscodeAsync(): IAsyncActionWithProgress<Double>? {
      val fnPtr = _1706553879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncActionWithProgress<Double>>()
      val hr = fn.invokeHR(arrayOf(__1706553879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncActionWithProgress<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IPrepareTranscodeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1706553879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrepareTranscodeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05f25dce994f4a349d6897ccce1730d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrepareTranscodeResult(ptr: Pointer?): WithDefault =
        IPrepareTranscodeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrepareTranscodeResult {
      val address = segment.toRawLongValue()
      return makeIPrepareTranscodeResult(Pointer(address))
    }

    public override fun toNative(obj: IPrepareTranscodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1706553879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrepareTranscodeResult): Array<IPrepareTranscodeResult?>
        = (elements as
        Array<IPrepareTranscodeResult?>).castToImpl<IPrepareTranscodeResult,IPrepareTranscodeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrepareTranscodeResult?> =
        arrayOfNulls<IPrepareTranscodeResult_Impl>(size) as Array<IPrepareTranscodeResult?>
  }
}
