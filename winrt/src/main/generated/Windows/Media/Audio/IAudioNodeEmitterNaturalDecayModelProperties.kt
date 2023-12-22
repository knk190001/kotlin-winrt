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

@ABIMarker(IAudioNodeEmitterNaturalDecayModelProperties.ABI::class)
@Signature("{48934bcf-cf2c-4efc-9331-75bd22df1f0c}")
@Guid("48934bcfcf2c4efc933175bd22df1f0c")
@WinRTInterface("48934bcfcf2c4efc933175bd22df1f0c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterNaturalDecayModelProperties.ByReference::class)
public interface IAudioNodeEmitterNaturalDecayModelProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnityGainDistance(): Double

  @InterfaceMethod(1)
  public fun get_CutoffDistance(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterNaturalDecayModelProperties> {
    public override fun getValue() =
        ABI.makeIAudioNodeEmitterNaturalDecayModelProperties(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterNaturalDecayModelProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterNaturalDecayModelProperties {
    public val __175959763_Ptr: Pointer?

    public val _175959763_VtblPtr: Pointer?
      get() = __175959763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnityGainDistance(): Double {
      val fnPtr = _175959763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__175959763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CutoffDistance(): Double {
      val fnPtr = _175959763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__175959763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioNodeEmitterNaturalDecayModelProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __175959763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterNaturalDecayModelProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48934bcfcf2c4efc933175bd22df1f0c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterNaturalDecayModelProperties(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterNaturalDecayModelProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAudioNodeEmitterNaturalDecayModelProperties {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterNaturalDecayModelProperties(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterNaturalDecayModelProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__175959763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterNaturalDecayModelProperties):
        Array<IAudioNodeEmitterNaturalDecayModelProperties?> = (elements as
        Array<IAudioNodeEmitterNaturalDecayModelProperties?>).castToImpl<IAudioNodeEmitterNaturalDecayModelProperties,IAudioNodeEmitterNaturalDecayModelProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterNaturalDecayModelProperties?> =
        arrayOfNulls<IAudioNodeEmitterNaturalDecayModelProperties_Impl>(size) as
        Array<IAudioNodeEmitterNaturalDecayModelProperties?>
  }
}
