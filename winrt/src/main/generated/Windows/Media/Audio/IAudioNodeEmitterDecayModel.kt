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

@ABIMarker(IAudioNodeEmitterDecayModel.ABI::class)
@Signature("{1d1d5af7-0d53-4fa9-bd84-d5816a86f3ff}")
@Guid("1d1d5af70d534fa9bd84d5816a86f3ff")
@WinRTInterface("1d1d5af70d534fa9bd84d5816a86f3ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterDecayModel.ByReference::class)
public interface IAudioNodeEmitterDecayModel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): AudioNodeEmitterDecayKind?

  @InterfaceMethod(1)
  public fun get_MinGain(): Double

  @InterfaceMethod(2)
  public fun get_MaxGain(): Double

  @InterfaceMethod(3)
  public fun get_NaturalProperties(): AudioNodeEmitterNaturalDecayModelProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterDecayModel> {
    public override fun getValue() = ABI.makeIAudioNodeEmitterDecayModel(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterDecayModel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterDecayModel {
    public val __675088909_Ptr: Pointer?

    public val _675088909_VtblPtr: Pointer?
      get() = __675088909_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): AudioNodeEmitterDecayKind? {
      val fnPtr = _675088909_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterDecayKind>()
      val hr = fn.invokeHR(arrayOf(__675088909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterDecayKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinGain(): Double {
      val fnPtr = _675088909_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__675088909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxGain(): Double {
      val fnPtr = _675088909_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__675088909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_NaturalProperties(): AudioNodeEmitterNaturalDecayModelProperties? {
      val fnPtr = _675088909_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterNaturalDecayModelProperties>()
      val hr = fn.invokeHR(arrayOf(__675088909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AudioNodeEmitterNaturalDecayModelProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioNodeEmitterDecayModel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675088909_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterDecayModel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d1d5af70d534fa9bd84d5816a86f3ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterDecayModel(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterDecayModel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitterDecayModel {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterDecayModel(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterDecayModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675088909_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterDecayModel):
        Array<IAudioNodeEmitterDecayModel?> = (elements as
        Array<IAudioNodeEmitterDecayModel?>).castToImpl<IAudioNodeEmitterDecayModel,IAudioNodeEmitterDecayModel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterDecayModel?> =
        arrayOfNulls<IAudioNodeEmitterDecayModel_Impl>(size) as Array<IAudioNodeEmitterDecayModel?>
  }
}
