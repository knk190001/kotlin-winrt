package Windows.Media.Effects

import Windows.Media.AudioProcessing
import Windows.Media.Capture.MediaCategory
import Windows.Media.Render.AudioRenderCategory
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

@ABIMarker(IAudioEffectsManagerStatics.ABI::class)
@Signature("{66406c04-86fa-47cc-a315-f489d8c3fe10}")
@Guid("66406c0486fa47cca315f489d8c3fe10")
@WinRTInterface("66406c0486fa47cca315f489d8c3fe10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEffectsManagerStatics.ByReference::class)
public interface IAudioEffectsManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAudioRenderEffectsManager(deviceId: String?, category: AudioRenderCategory?):
      AudioRenderEffectsManager?

  @InterfaceMethod(1)
  public fun CreateAudioRenderEffectsManager(
    deviceId: String?,
    category: AudioRenderCategory?,
    mode: AudioProcessing?
  ): AudioRenderEffectsManager?

  @InterfaceMethod(2)
  public fun CreateAudioCaptureEffectsManager(deviceId: String?, category: MediaCategory?):
      AudioCaptureEffectsManager?

  @InterfaceMethod(3)
  public fun CreateAudioCaptureEffectsManager(
    deviceId: String?,
    category: MediaCategory?,
    mode: AudioProcessing?
  ): AudioCaptureEffectsManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioEffectsManagerStatics> {
    public override fun getValue() = ABI.makeIAudioEffectsManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioEffectsManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEffectsManagerStatics {
    public val __1699006816_Ptr: Pointer?

    public val _1699006816_VtblPtr: Pointer?
      get() = __1699006816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAudioRenderEffectsManager(deviceId: String?,
        category: AudioRenderCategory?): AudioRenderEffectsManager? {
      val fnPtr = _1699006816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioRenderEffectsManager>()
      val hr = fn.invokeHR(arrayOf(__1699006816_Ptr, marshalToNative(deviceId),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioRenderEffectsManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAudioRenderEffectsManager(
      deviceId: String?,
      category: AudioRenderCategory?,
      mode: AudioProcessing?
    ): AudioRenderEffectsManager? {
      val fnPtr = _1699006816_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioRenderEffectsManager>()
      val hr = fn.invokeHR(arrayOf(__1699006816_Ptr, marshalToNative(deviceId),
          marshalToNative(category), marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioRenderEffectsManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateAudioCaptureEffectsManager(deviceId: String?,
        category: MediaCategory?): AudioCaptureEffectsManager? {
      val fnPtr = _1699006816_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioCaptureEffectsManager>()
      val hr = fn.invokeHR(arrayOf(__1699006816_Ptr, marshalToNative(deviceId),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioCaptureEffectsManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateAudioCaptureEffectsManager(
      deviceId: String?,
      category: MediaCategory?,
      mode: AudioProcessing?
    ): AudioCaptureEffectsManager? {
      val fnPtr = _1699006816_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioCaptureEffectsManager>()
      val hr = fn.invokeHR(arrayOf(__1699006816_Ptr, marshalToNative(deviceId),
          marshalToNative(category), marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioCaptureEffectsManager>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEffectsManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1699006816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEffectsManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66406c0486fa47cca315f489d8c3fe10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEffectsManagerStatics(ptr: Pointer?): WithDefault =
        IAudioEffectsManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEffectsManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAudioEffectsManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioEffectsManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1699006816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEffectsManagerStatics):
        Array<IAudioEffectsManagerStatics?> = (elements as
        Array<IAudioEffectsManagerStatics?>).castToImpl<IAudioEffectsManagerStatics,IAudioEffectsManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEffectsManagerStatics?> =
        arrayOfNulls<IAudioEffectsManagerStatics_Impl>(size) as Array<IAudioEffectsManagerStatics?>
  }
}
