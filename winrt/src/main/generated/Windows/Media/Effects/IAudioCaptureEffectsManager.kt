package Windows.Media.Effects

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAudioCaptureEffectsManager.ABI::class)
@Signature("{8f85c271-038d-4393-8298-540110608eef}")
@Guid("8f85c271038d43938298540110608eef")
@WinRTInterface("8f85c271038d43938298540110608eef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioCaptureEffectsManager.ByReference::class)
public interface IAudioCaptureEffectsManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AudioCaptureEffectsChanged(handler: TypedEventHandler<AudioCaptureEffectsManager?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AudioCaptureEffectsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetAudioCaptureEffects(): IVectorView<AudioEffect?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioCaptureEffectsManager> {
    public override fun getValue() = ABI.makeIAudioCaptureEffectsManager(pointer.getPointer(0))

    public fun setValue(value: IAudioCaptureEffectsManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioCaptureEffectsManager {
    public val __349356649_Ptr: Pointer?

    public val _349356649_VtblPtr: Pointer?
      get() = __349356649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_AudioCaptureEffectsChanged(handler: TypedEventHandler<AudioCaptureEffectsManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _349356649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__349356649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AudioCaptureEffectsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _349356649_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__349356649_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetAudioCaptureEffects(): IVectorView<AudioEffect?>? {
      val fnPtr = _349356649_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioEffect?>>()
      val hr = fn.invokeHR(arrayOf(__349356649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioEffect?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioCaptureEffectsManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __349356649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioCaptureEffectsManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f85c271038d43938298540110608eef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioCaptureEffectsManager(ptr: Pointer?): WithDefault =
        IAudioCaptureEffectsManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioCaptureEffectsManager {
      val address = segment.toRawLongValue()
      return makeIAudioCaptureEffectsManager(Pointer(address))
    }

    public override fun toNative(obj: IAudioCaptureEffectsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__349356649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioCaptureEffectsManager):
        Array<IAudioCaptureEffectsManager?> = (elements as
        Array<IAudioCaptureEffectsManager?>).castToImpl<IAudioCaptureEffectsManager,IAudioCaptureEffectsManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioCaptureEffectsManager?> =
        arrayOfNulls<IAudioCaptureEffectsManager_Impl>(size) as Array<IAudioCaptureEffectsManager?>
  }
}
