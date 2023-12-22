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

@ABIMarker(IAudioNodeEmitterConeProperties.ABI::class)
@Signature("{e99b2cee-02ca-4375-9326-0c6ae4bcdfb5}")
@Guid("e99b2cee02ca437593260c6ae4bcdfb5")
@WinRTInterface("e99b2cee02ca437593260c6ae4bcdfb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterConeProperties.ByReference::class)
public interface IAudioNodeEmitterConeProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InnerAngle(): Double

  @InterfaceMethod(1)
  public fun get_OuterAngle(): Double

  @InterfaceMethod(2)
  public fun get_OuterAngleGain(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterConeProperties> {
    public override fun getValue() = ABI.makeIAudioNodeEmitterConeProperties(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterConeProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterConeProperties {
    public val __810232884_Ptr: Pointer?

    public val _810232884_VtblPtr: Pointer?
      get() = __810232884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InnerAngle(): Double {
      val fnPtr = _810232884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__810232884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OuterAngle(): Double {
      val fnPtr = _810232884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__810232884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OuterAngleGain(): Double {
      val fnPtr = _810232884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__810232884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioNodeEmitterConeProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810232884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterConeProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e99b2cee02ca437593260c6ae4bcdfb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterConeProperties(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterConeProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitterConeProperties {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterConeProperties(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterConeProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810232884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterConeProperties):
        Array<IAudioNodeEmitterConeProperties?> = (elements as
        Array<IAudioNodeEmitterConeProperties?>).castToImpl<IAudioNodeEmitterConeProperties,IAudioNodeEmitterConeProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterConeProperties?> =
        arrayOfNulls<IAudioNodeEmitterConeProperties_Impl>(size) as
        Array<IAudioNodeEmitterConeProperties?>
  }
}
