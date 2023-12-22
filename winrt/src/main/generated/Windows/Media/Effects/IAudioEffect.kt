package Windows.Media.Effects

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

@ABIMarker(IAudioEffect.ABI::class)
@Signature("{34aafa51-9207-4055-be93-6e5734a86ae4}")
@Guid("34aafa5192074055be936e5734a86ae4")
@WinRTInterface("34aafa5192074055be936e5734a86ae4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioEffect.ByReference::class)
public interface IAudioEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioEffectType(): AudioEffectType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioEffect> {
    public override fun getValue() = ABI.makeIAudioEffect(pointer.getPointer(0))

    public fun setValue(value: IAudioEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioEffect {
    public val __1115604459_Ptr: Pointer?

    public val _1115604459_VtblPtr: Pointer?
      get() = __1115604459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioEffectType(): AudioEffectType? {
      val fnPtr = _1115604459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEffectType>()
      val hr = fn.invokeHR(arrayOf(__1115604459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEffectType>(result.getValue())
      return resultValue
    }
  }

  public class IAudioEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1115604459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34aafa5192074055be936e5734a86ae4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioEffect(ptr: Pointer?): WithDefault = IAudioEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioEffect {
      val address = segment.toRawLongValue()
      return makeIAudioEffect(Pointer(address))
    }

    public override fun toNative(obj: IAudioEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1115604459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioEffect): Array<IAudioEffect?> = (elements as
        Array<IAudioEffect?>).castToImpl<IAudioEffect,IAudioEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioEffect?> =
        arrayOfNulls<IAudioEffect_Impl>(size) as Array<IAudioEffect?>
  }
}
