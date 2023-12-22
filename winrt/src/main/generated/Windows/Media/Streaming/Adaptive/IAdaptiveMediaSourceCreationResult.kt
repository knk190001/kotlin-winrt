package Windows.Media.Streaming.Adaptive

import Windows.Web.Http.HttpResponseMessage
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

@ABIMarker(IAdaptiveMediaSourceCreationResult.ABI::class)
@Signature("{4686b6b2-800f-4e31-9093-76d4782013e7}")
@Guid("4686b6b2800f4e31909376d4782013e7")
@WinRTInterface("4686b6b2800f4e31909376d4782013e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceCreationResult.ByReference::class)
public interface IAdaptiveMediaSourceCreationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AdaptiveMediaSourceCreationStatus?

  @InterfaceMethod(1)
  public fun get_MediaSource(): AdaptiveMediaSource?

  @InterfaceMethod(2)
  public fun get_HttpResponseMessage(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceCreationResult> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceCreationResult(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceCreationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceCreationResult {
    public val __385018285_Ptr: Pointer?

    public val _385018285_VtblPtr: Pointer?
      get() = __385018285_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AdaptiveMediaSourceCreationStatus? {
      val fnPtr = _385018285_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__385018285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaSource(): AdaptiveMediaSource? {
      val fnPtr = _385018285_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSource>()
      val hr = fn.invokeHR(arrayOf(__385018285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HttpResponseMessage(): HttpResponseMessage? {
      val fnPtr = _385018285_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__385018285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceCreationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __385018285_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceCreationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4686b6b2800f4e31909376d4782013e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceCreationResult(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceCreationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceCreationResult {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceCreationResult(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__385018285_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceCreationResult):
        Array<IAdaptiveMediaSourceCreationResult?> = (elements as
        Array<IAdaptiveMediaSourceCreationResult?>).castToImpl<IAdaptiveMediaSourceCreationResult,IAdaptiveMediaSourceCreationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceCreationResult?> =
        arrayOfNulls<IAdaptiveMediaSourceCreationResult_Impl>(size) as
        Array<IAdaptiveMediaSourceCreationResult?>
  }
}
