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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioNodeEmitterShape.ABI::class)
@Signature("{ea0311c5-e73d-44bc-859c-45553bbc4828}")
@Guid("ea0311c5e73d44bc859c45553bbc4828")
@WinRTInterface("ea0311c5e73d44bc859c45553bbc4828")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeEmitterShape.ByReference::class)
public interface IAudioNodeEmitterShape : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): AudioNodeEmitterShapeKind?

  @InterfaceMethod(1)
  public fun get_ConeProperties(): AudioNodeEmitterConeProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeEmitterShape> {
    public override fun getValue() = ABI.makeIAudioNodeEmitterShape(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeEmitterShape_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeEmitterShape {
    public val __494823011_Ptr: Pointer?

    public val _494823011_VtblPtr: Pointer?
      get() = __494823011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): AudioNodeEmitterShapeKind? {
      val fnPtr = _494823011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterShapeKind>()
      val hr = fn.invokeHR(arrayOf(__494823011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterShapeKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConeProperties(): AudioNodeEmitterConeProperties? {
      val fnPtr = _494823011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitterConeProperties>()
      val hr = fn.invokeHR(arrayOf(__494823011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitterConeProperties>(result.getValue())
      return resultValue
    }
  }

  public class IAudioNodeEmitterShape_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __494823011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeEmitterShape, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea0311c5e73d44bc859c45553bbc4828")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeEmitterShape(ptr: Pointer?): WithDefault =
        IAudioNodeEmitterShape_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeEmitterShape {
      val address = segment.toRawLongValue()
      return makeIAudioNodeEmitterShape(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeEmitterShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__494823011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeEmitterShape): Array<IAudioNodeEmitterShape?> =
        (elements as
        Array<IAudioNodeEmitterShape?>).castToImpl<IAudioNodeEmitterShape,IAudioNodeEmitterShape_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeEmitterShape?> =
        arrayOfNulls<IAudioNodeEmitterShape_Impl>(size) as Array<IAudioNodeEmitterShape?>
  }
}
