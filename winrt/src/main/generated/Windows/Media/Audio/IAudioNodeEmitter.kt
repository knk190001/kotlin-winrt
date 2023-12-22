package Windows.Media.Audio

import Windows.Foundation.Numerics.Vector3
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioNodeEmitter.ABI::class)
@Signature("{3676971d-880a-47b8-adf7-1323a9d965be}")
@Guid("3676971d880a47b8adf71323a9d965be")
@WinRTInterface("3676971d880a47b8adf71323a9d965be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitter.ByReference::class)
public interface IAudioNodeEmitter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun put_Position(value: Vector3?): Unit

  @InterfaceMethod(2)
  public fun get_Direction(): Vector3?

  @InterfaceMethod(3)
  public fun put_Direction(value: Vector3?): Unit

  @InterfaceMethod(4)
  public fun get_Shape(): AudioNodeEmitterShape?

  @InterfaceMethod(5)
  public fun get_DecayModel(): AudioNodeEmitterDecayModel?

  @InterfaceMethod(6)
  public fun get_Gain(): Double

  @InterfaceMethod(7)
  public fun put_Gain(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_DistanceScale(): Double

  @InterfaceMethod(9)
  public fun put_DistanceScale(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_DopplerScale(): Double

  @InterfaceMethod(11)
  public fun put_DopplerScale(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_DopplerVelocity(): Vector3?

  @InterfaceMethod(13)
  public fun put_DopplerVelocity(value: Vector3?): Unit

  @InterfaceMethod(14)
  public fun get_IsDopplerDisabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitter> {
    public override fun getValue() = ABI.makeIAudioNodeEmitter(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitter {
    public val __1391440862_Ptr: Pointer?

    public val _1391440862_VtblPtr: Pointer?
      get() = __1391440862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: Vector3?): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Direction(): Vector3? {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Direction(value: Vector3?): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Shape(): AudioNodeEmitterShape? {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterShape>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DecayModel(): AudioNodeEmitterDecayModel? {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterDecayModel>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterDecayModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Gain(): Double {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Gain(value: Double): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DistanceScale(): Double {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_DistanceScale(value: Double): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DopplerScale(): Double {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_DopplerScale(value: Double): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_DopplerVelocity(): Vector3? {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_DopplerVelocity(value: Vector3?): Unit {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsDopplerDisabled(): Boolean {
      val fnPtr = _1391440862_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1391440862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioNodeEmitter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1391440862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3676971d880a47b8adf71323a9d965be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitter(ptr: Pointer?): WithDefault = IAudioNodeEmitter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitter {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitter(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1391440862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitter): Array<IAudioNodeEmitter?> = (elements
        as Array<IAudioNodeEmitter?>).castToImpl<IAudioNodeEmitter,IAudioNodeEmitter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitter?> =
        arrayOfNulls<IAudioNodeEmitter_Impl>(size) as Array<IAudioNodeEmitter?>
  }
}
