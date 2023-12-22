package Microsoft.UI.Composition

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

@ABIMarker(IBounceVector2NaturalMotionAnimation.ABI::class)
@Signature("{ec528d1f-22e2-573e-ab87-757071e50012}")
@Guid("ec528d1f22e2573eab87757071e50012")
@WinRTInterface("ec528d1f22e2573eab87757071e50012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBounceVector2NaturalMotionAnimation.ByReference::class)
public interface IBounceVector2NaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Acceleration(): Float

  @InterfaceMethod(1)
  public fun put_Acceleration(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Restitution(): Float

  @InterfaceMethod(3)
  public fun put_Restitution(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBounceVector2NaturalMotionAnimation> {
    public override fun getValue() =
        ABI.makeIBounceVector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: IBounceVector2NaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBounceVector2NaturalMotionAnimation {
    public val __518524627_Ptr: Pointer?

    public val _518524627_VtblPtr: Pointer?
      get() = __518524627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Acceleration(): Float {
      val fnPtr = _518524627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__518524627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Acceleration(value: Float): Unit {
      val fnPtr = _518524627_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__518524627_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Restitution(): Float {
      val fnPtr = _518524627_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__518524627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Restitution(value: Float): Unit {
      val fnPtr = _518524627_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__518524627_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBounceVector2NaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __518524627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBounceVector2NaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec528d1f22e2573eab87757071e50012")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBounceVector2NaturalMotionAnimation(ptr: Pointer?): WithDefault =
        IBounceVector2NaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBounceVector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeIBounceVector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IBounceVector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__518524627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBounceVector2NaturalMotionAnimation):
        Array<IBounceVector2NaturalMotionAnimation?> = (elements as
        Array<IBounceVector2NaturalMotionAnimation?>).castToImpl<IBounceVector2NaturalMotionAnimation,IBounceVector2NaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBounceVector2NaturalMotionAnimation?> =
        arrayOfNulls<IBounceVector2NaturalMotionAnimation_Impl>(size) as
        Array<IBounceVector2NaturalMotionAnimation?>
  }
}
