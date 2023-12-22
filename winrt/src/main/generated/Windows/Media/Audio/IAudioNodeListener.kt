package Windows.Media.Audio

import Windows.Foundation.Numerics.Quaternion
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioNodeListener.ABI::class)
@Signature("{d9722e16-0c0a-41da-b755-6c77835fb1eb}")
@Guid("d9722e160c0a41dab7556c77835fb1eb")
@WinRTInterface("d9722e160c0a41dab7556c77835fb1eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeListener.ByReference::class)
public interface IAudioNodeListener : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Vector3?

  @InterfaceMethod(1)
  public fun put_Position(value: Vector3?): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Quaternion?

  @InterfaceMethod(3)
  public fun put_Orientation(value: Quaternion?): Unit

  @InterfaceMethod(4)
  public fun get_SpeedOfSound(): Double

  @InterfaceMethod(5)
  public fun put_SpeedOfSound(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_DopplerVelocity(): Vector3?

  @InterfaceMethod(7)
  public fun put_DopplerVelocity(value: Vector3?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeListener> {
    public override fun getValue() = ABI.makeIAudioNodeListener(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeListener {
    public val __530569796_Ptr: Pointer?

    public val _530569796_VtblPtr: Pointer?
      get() = __530569796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Vector3? {
      val fnPtr = _530569796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: Vector3?): Unit {
      val fnPtr = _530569796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _530569796_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Quaternion?): Unit {
      val fnPtr = _530569796_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SpeedOfSound(): Double {
      val fnPtr = _530569796_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_SpeedOfSound(value: Double): Unit {
      val fnPtr = _530569796_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DopplerVelocity(): Vector3? {
      val fnPtr = _530569796_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DopplerVelocity(value: Vector3?): Unit {
      val fnPtr = _530569796_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__530569796_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioNodeListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __530569796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9722e160c0a41dab7556c77835fb1eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeListener(ptr: Pointer?): WithDefault = IAudioNodeListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeListener {
      val address = segment.toRawLongValue()
      return makeIAudioNodeListener(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__530569796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeListener): Array<IAudioNodeListener?> =
        (elements as
        Array<IAudioNodeListener?>).castToImpl<IAudioNodeListener,IAudioNodeListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeListener?> =
        arrayOfNulls<IAudioNodeListener_Impl>(size) as Array<IAudioNodeListener?>
  }
}
