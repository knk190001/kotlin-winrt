package Windows.Media.Audio

import Windows.Foundation.IAsyncOperation
import Windows.Media.Core.MediaSource
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

@ABIMarker(IAudioGraph3.ABI::class)
@Signature("{ddcd25ae-1185-42a7-831d-6a9b0fc86820}")
@Guid("ddcd25ae118542a7831d6a9b0fc86820")
@WinRTInterface("ddcd25ae118542a7831d6a9b0fc86820")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraph3.ByReference::class)
public interface IAudioGraph3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMediaSourceAudioInputNodeAsync(mediaSource: MediaSource?):
      IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>?

  @InterfaceMethod(1)
  public fun CreateMediaSourceAudioInputNodeAsync(mediaSource: MediaSource?,
      emitter: AudioNodeEmitter?): IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioGraph3> {
    public override fun getValue() = ABI.makeIAudioGraph3(pointer.getPointer(0))

    public fun setValue(value: IAudioGraph3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraph3 {
    public val __2059253907_Ptr: Pointer?

    public val _2059253907_VtblPtr: Pointer?
      get() = __2059253907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMediaSourceAudioInputNodeAsync(mediaSource: MediaSource?):
        IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>? {
      val fnPtr = _2059253907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2059253907_Ptr, marshalToNative(mediaSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateMediaSourceAudioInputNodeAsync(mediaSource: MediaSource?,
        emitter: AudioNodeEmitter?): IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>? {
      val fnPtr = _2059253907_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2059253907_Ptr, marshalToNative(mediaSource),
          marshalToNative(emitter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateMediaSourceAudioInputNodeResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioGraph3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2059253907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraph3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddcd25ae118542a7831d6a9b0fc86820")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraph3(ptr: Pointer?): WithDefault = IAudioGraph3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraph3 {
      val address = segment.toRawLongValue()
      return makeIAudioGraph3(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraph3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059253907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraph3): Array<IAudioGraph3?> = (elements as
        Array<IAudioGraph3?>).castToImpl<IAudioGraph3,IAudioGraph3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraph3?> =
        arrayOfNulls<IAudioGraph3_Impl>(size) as Array<IAudioGraph3?>
  }
}
