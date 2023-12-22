package Windows.Media.Audio

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

@ABIMarker(IAudioNodeEmitterFactory.ABI::class)
@Signature("{fdc8489a-6ad6-4ce4-b7f7-a99370df7ee9}")
@Guid("fdc8489a6ad64ce4b7f7a99370df7ee9")
@WinRTInterface("fdc8489a6ad64ce4b7f7a99370df7ee9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterFactory.ByReference::class)
public interface IAudioNodeEmitterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAudioNodeEmitter(
    shape: AudioNodeEmitterShape?,
    decayModel: AudioNodeEmitterDecayModel?,
    settings: AudioNodeEmitterSettings?
  ): AudioNodeEmitter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterFactory> {
    public override fun getValue() = ABI.makeIAudioNodeEmitterFactory(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterFactory {
    public val __67526836_Ptr: Pointer?

    public val _67526836_VtblPtr: Pointer?
      get() = __67526836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAudioNodeEmitter(
      shape: AudioNodeEmitterShape?,
      decayModel: AudioNodeEmitterDecayModel?,
      settings: AudioNodeEmitterSettings?
    ): AudioNodeEmitter? {
      val fnPtr = _67526836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitter>()
      val hr = fn.invokeHR(arrayOf(__67526836_Ptr, marshalToNative(shape),
          marshalToNative(decayModel), marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitter>(result.getValue())
      return resultValue
    }
  }

  public class IAudioNodeEmitterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __67526836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdc8489a6ad64ce4b7f7a99370df7ee9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterFactory(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitterFactory {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterFactory(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__67526836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterFactory):
        Array<IAudioNodeEmitterFactory?> = (elements as
        Array<IAudioNodeEmitterFactory?>).castToImpl<IAudioNodeEmitterFactory,IAudioNodeEmitterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterFactory?> =
        arrayOfNulls<IAudioNodeEmitterFactory_Impl>(size) as Array<IAudioNodeEmitterFactory?>
  }
}
