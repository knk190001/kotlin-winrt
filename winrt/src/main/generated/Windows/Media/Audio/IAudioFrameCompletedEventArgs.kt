package Windows.Media.Audio

import Windows.Media.AudioFrame
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

@ABIMarker(IAudioFrameCompletedEventArgs.ABI::class)
@Signature("{dc7c829e-0208-4504-a5a8-f0f268920a65}")
@Guid("dc7c829e02084504a5a8f0f268920a65")
@WinRTInterface("dc7c829e02084504a5a8f0f268920a65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFrameCompletedEventArgs.ByReference::class)
public interface IAudioFrameCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): AudioFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFrameCompletedEventArgs> {
    public override fun getValue() = ABI.makeIAudioFrameCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAudioFrameCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFrameCompletedEventArgs {
    public val __686585515_Ptr: Pointer?

    public val _686585515_VtblPtr: Pointer?
      get() = __686585515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): AudioFrame? {
      val fnPtr = _686585515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__686585515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }
  }

  public class IAudioFrameCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __686585515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFrameCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc7c829e02084504a5a8f0f268920a65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFrameCompletedEventArgs(ptr: Pointer?): WithDefault =
        IAudioFrameCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFrameCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAudioFrameCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAudioFrameCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__686585515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFrameCompletedEventArgs):
        Array<IAudioFrameCompletedEventArgs?> = (elements as
        Array<IAudioFrameCompletedEventArgs?>).castToImpl<IAudioFrameCompletedEventArgs,IAudioFrameCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFrameCompletedEventArgs?> =
        arrayOfNulls<IAudioFrameCompletedEventArgs_Impl>(size) as
        Array<IAudioFrameCompletedEventArgs?>
  }
}
