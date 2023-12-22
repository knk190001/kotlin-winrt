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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioNodeEmitterDecayModelStatics.ABI::class)
@Signature("{c7787ca8-f178-462f-bc81-8dd5cbe5dae8}")
@Guid("c7787ca8f178462fbc818dd5cbe5dae8")
@WinRTInterface("c7787ca8f178462fbc818dd5cbe5dae8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterDecayModelStatics.ByReference::class)
public interface IAudioNodeEmitterDecayModelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateNatural(
    minGain: Double,
    maxGain: Double,
    unityGainDistance: Double,
    cutoffDistance: Double
  ): AudioNodeEmitterDecayModel?

  @InterfaceMethod(1)
  public fun CreateCustom(minGain: Double, maxGain: Double): AudioNodeEmitterDecayModel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterDecayModelStatics> {
    public override fun getValue() =
        ABI.makeIAudioNodeEmitterDecayModelStatics(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterDecayModelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterDecayModelStatics {
    public val __1921542920_Ptr: Pointer?

    public val _1921542920_VtblPtr: Pointer?
      get() = __1921542920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateNatural(
      minGain: Double,
      maxGain: Double,
      unityGainDistance: Double,
      cutoffDistance: Double
    ): AudioNodeEmitterDecayModel? {
      val fnPtr = _1921542920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterDecayModel>()
      val hr = fn.invokeHR(arrayOf(__1921542920_Ptr, minGain, maxGain, unityGainDistance,
          cutoffDistance, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterDecayModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCustom(minGain: Double, maxGain: Double):
        AudioNodeEmitterDecayModel? {
      val fnPtr = _1921542920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterDecayModel>()
      val hr = fn.invokeHR(arrayOf(__1921542920_Ptr, minGain, maxGain, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterDecayModel>(result.getValue())
      return resultValue
    }
  }

  public class IAudioNodeEmitterDecayModelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1921542920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterDecayModelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7787ca8f178462fbc818dd5cbe5dae8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterDecayModelStatics(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterDecayModelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitterDecayModelStatics {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterDecayModelStatics(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterDecayModelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1921542920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterDecayModelStatics):
        Array<IAudioNodeEmitterDecayModelStatics?> = (elements as
        Array<IAudioNodeEmitterDecayModelStatics?>).castToImpl<IAudioNodeEmitterDecayModelStatics,IAudioNodeEmitterDecayModelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterDecayModelStatics?> =
        arrayOfNulls<IAudioNodeEmitterDecayModelStatics_Impl>(size) as
        Array<IAudioNodeEmitterDecayModelStatics?>
  }
}
