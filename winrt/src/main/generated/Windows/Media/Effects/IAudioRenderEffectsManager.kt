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

@ABIMarker(IAudioRenderEffectsManager.ABI::class)
@Signature("{4dc98966-8751-42b2-bfcb-39ca7864bd47}")
@Guid("4dc98966875142b2bfcb39ca7864bd47")
@WinRTInterface("4dc98966875142b2bfcb39ca7864bd47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioRenderEffectsManager.ByReference::class)
public interface IAudioRenderEffectsManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AudioRenderEffectsChanged(handler: TypedEventHandler<AudioRenderEffectsManager?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AudioRenderEffectsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun GetAudioRenderEffects(): IVectorView<AudioEffect?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioRenderEffectsManager> {
    public override fun getValue() = ABI.makeIAudioRenderEffectsManager(pointer.getPointer(0))

    public fun setValue(value: IAudioRenderEffectsManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioRenderEffectsManager {
    public val __627286437_Ptr: Pointer?

    public val _627286437_VtblPtr: Pointer?
      get() = __627286437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_AudioRenderEffectsChanged(handler: TypedEventHandler<AudioRenderEffectsManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _627286437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__627286437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AudioRenderEffectsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _627286437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__627286437_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetAudioRenderEffects(): IVectorView<AudioEffect?>? {
      val fnPtr = _627286437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioEffect?>>()
      val hr = fn.invokeHR(arrayOf(__627286437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioEffect?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioRenderEffectsManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __627286437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioRenderEffectsManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dc98966875142b2bfcb39ca7864bd47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioRenderEffectsManager(ptr: Pointer?): WithDefault =
        IAudioRenderEffectsManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioRenderEffectsManager {
      val address = segment.toRawLongValue()
      return makeIAudioRenderEffectsManager(Pointer(address))
    }

    public override fun toNative(obj: IAudioRenderEffectsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__627286437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioRenderEffectsManager):
        Array<IAudioRenderEffectsManager?> = (elements as
        Array<IAudioRenderEffectsManager?>).castToImpl<IAudioRenderEffectsManager,IAudioRenderEffectsManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioRenderEffectsManager?> =
        arrayOfNulls<IAudioRenderEffectsManager_Impl>(size) as Array<IAudioRenderEffectsManager?>
  }
}
