package Windows.Media.Playback

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

@ABIMarker(IMediaPlaybackSessionOutputDegradationPolicyState.ABI::class)
@Signature("{558e727d-f633-49f9-965a-abaa1db709be}")
@Guid("558e727df63349f9965aabaa1db709be")
@WinRTInterface("558e727df63349f9965aabaa1db709be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSessionOutputDegradationPolicyState.ByReference::class)
public interface IMediaPlaybackSessionOutputDegradationPolicyState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoConstrictionReason(): MediaPlaybackSessionVideoConstrictionReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSessionOutputDegradationPolicyState> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackSessionOutputDegradationPolicyState(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSessionOutputDegradationPolicyState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSessionOutputDegradationPolicyState {
    public val __1570417258_Ptr: Pointer?

    public val _1570417258_VtblPtr: Pointer?
      get() = __1570417258_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoConstrictionReason():
        MediaPlaybackSessionVideoConstrictionReason? {
      val fnPtr = _1570417258_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackSessionVideoConstrictionReason>()
      val hr = fn.invokeHR(arrayOf(__1570417258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaPlaybackSessionVideoConstrictionReason>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackSessionOutputDegradationPolicyState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1570417258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSessionOutputDegradationPolicyState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("558e727df63349f9965aabaa1db709be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSessionOutputDegradationPolicyState(ptr: Pointer?): WithDefault =
        IMediaPlaybackSessionOutputDegradationPolicyState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaPlaybackSessionOutputDegradationPolicyState {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSessionOutputDegradationPolicyState(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSessionOutputDegradationPolicyState):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1570417258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSessionOutputDegradationPolicyState):
        Array<IMediaPlaybackSessionOutputDegradationPolicyState?> = (elements as
        Array<IMediaPlaybackSessionOutputDegradationPolicyState?>).castToImpl<IMediaPlaybackSessionOutputDegradationPolicyState,IMediaPlaybackSessionOutputDegradationPolicyState_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMediaPlaybackSessionOutputDegradationPolicyState?> =
        arrayOfNulls<IMediaPlaybackSessionOutputDegradationPolicyState_Impl>(size) as
        Array<IMediaPlaybackSessionOutputDegradationPolicyState?>
  }
}
