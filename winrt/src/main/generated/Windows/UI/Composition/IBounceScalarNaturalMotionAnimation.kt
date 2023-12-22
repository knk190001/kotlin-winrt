package Windows.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBounceScalarNaturalMotionAnimation.ABI::class)
@Signature("{baa30dcc-a633-4618-9b06-7f7c72c87cff}")
@Guid("baa30dcca63346189b067f7c72c87cff")
@WinRTInterface("baa30dcca63346189b067f7c72c87cff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBounceScalarNaturalMotionAnimation.ByReference::class)
public interface IBounceScalarNaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Acceleration(): Float

  @InterfaceMethod(1)
  public fun put_Acceleration(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Restitution(): Float

  @InterfaceMethod(3)
  public fun put_Restitution(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBounceScalarNaturalMotionAnimation> {
    public override fun getValue() =
        ABI.makeIBounceScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: IBounceScalarNaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBounceScalarNaturalMotionAnimation {
    public val __2027114777_Ptr: Pointer?

    public val _2027114777_VtblPtr: Pointer?
      get() = __2027114777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Acceleration(): Float {
      val fnPtr = _2027114777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2027114777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Acceleration(value: Float): Unit {
      val fnPtr = _2027114777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2027114777_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Restitution(): Float {
      val fnPtr = _2027114777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2027114777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Restitution(value: Float): Unit {
      val fnPtr = _2027114777_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2027114777_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBounceScalarNaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2027114777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBounceScalarNaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("baa30dcca63346189b067f7c72c87cff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBounceScalarNaturalMotionAnimation(ptr: Pointer?): WithDefault =
        IBounceScalarNaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBounceScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeIBounceScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IBounceScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2027114777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBounceScalarNaturalMotionAnimation):
        Array<IBounceScalarNaturalMotionAnimation?> = (elements as
        Array<IBounceScalarNaturalMotionAnimation?>).castToImpl<IBounceScalarNaturalMotionAnimation,IBounceScalarNaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBounceScalarNaturalMotionAnimation?> =
        arrayOfNulls<IBounceScalarNaturalMotionAnimation_Impl>(size) as
        Array<IBounceScalarNaturalMotionAnimation?>
  }
}
