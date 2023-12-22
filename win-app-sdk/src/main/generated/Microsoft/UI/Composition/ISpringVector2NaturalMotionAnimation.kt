package Microsoft.UI.Composition

import Windows.Foundation.TimeSpan
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

@ABIMarker(ISpringVector2NaturalMotionAnimation.ABI::class)
@Signature("{5b4580a4-2594-521e-b288-eaf2c2a16a66}")
@Guid("5b4580a42594521eb288eaf2c2a16a66")
@WinRTInterface("5b4580a42594521eb288eaf2c2a16a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpringVector2NaturalMotionAnimation.ByReference::class)
public interface ISpringVector2NaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DampingRatio(): Float

  @InterfaceMethod(1)
  public fun put_DampingRatio(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Period(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Period(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpringVector2NaturalMotionAnimation> {
    public override fun getValue() =
        ABI.makeISpringVector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: ISpringVector2NaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpringVector2NaturalMotionAnimation {
    public val __179434130_Ptr: Pointer?

    public val _179434130_VtblPtr: Pointer?
      get() = __179434130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DampingRatio(): Float {
      val fnPtr = _179434130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__179434130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DampingRatio(value: Float): Unit {
      val fnPtr = _179434130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179434130_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Period(): TimeSpan? {
      val fnPtr = _179434130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__179434130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Period(value: TimeSpan?): Unit {
      val fnPtr = _179434130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179434130_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpringVector2NaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179434130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpringVector2NaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b4580a42594521eb288eaf2c2a16a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpringVector2NaturalMotionAnimation(ptr: Pointer?): WithDefault =
        ISpringVector2NaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpringVector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeISpringVector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISpringVector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179434130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpringVector2NaturalMotionAnimation):
        Array<ISpringVector2NaturalMotionAnimation?> = (elements as
        Array<ISpringVector2NaturalMotionAnimation?>).castToImpl<ISpringVector2NaturalMotionAnimation,ISpringVector2NaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpringVector2NaturalMotionAnimation?> =
        arrayOfNulls<ISpringVector2NaturalMotionAnimation_Impl>(size) as
        Array<ISpringVector2NaturalMotionAnimation?>
  }
}
