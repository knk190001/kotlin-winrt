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

@ABIMarker(ISpringVector3NaturalMotionAnimation.ABI::class)
@Signature("{02d9e1c6-7434-5464-a1f6-d644ce1fc9a6}")
@Guid("02d9e1c674345464a1f6d644ce1fc9a6")
@WinRTInterface("02d9e1c674345464a1f6d644ce1fc9a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpringVector3NaturalMotionAnimation.ByReference::class)
public interface ISpringVector3NaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DampingRatio(): Float

  @InterfaceMethod(1)
  public fun put_DampingRatio(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Period(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Period(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpringVector3NaturalMotionAnimation> {
    public override fun getValue() =
        ABI.makeISpringVector3NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: ISpringVector3NaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpringVector3NaturalMotionAnimation {
    public val __1065330351_Ptr: Pointer?

    public val _1065330351_VtblPtr: Pointer?
      get() = __1065330351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DampingRatio(): Float {
      val fnPtr = _1065330351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1065330351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DampingRatio(value: Float): Unit {
      val fnPtr = _1065330351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1065330351_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Period(): TimeSpan? {
      val fnPtr = _1065330351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1065330351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Period(value: TimeSpan?): Unit {
      val fnPtr = _1065330351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1065330351_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpringVector3NaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065330351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpringVector3NaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02d9e1c674345464a1f6d644ce1fc9a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpringVector3NaturalMotionAnimation(ptr: Pointer?): WithDefault =
        ISpringVector3NaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpringVector3NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeISpringVector3NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISpringVector3NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1065330351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpringVector3NaturalMotionAnimation):
        Array<ISpringVector3NaturalMotionAnimation?> = (elements as
        Array<ISpringVector3NaturalMotionAnimation?>).castToImpl<ISpringVector3NaturalMotionAnimation,ISpringVector3NaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpringVector3NaturalMotionAnimation?> =
        arrayOfNulls<ISpringVector3NaturalMotionAnimation_Impl>(size) as
        Array<ISpringVector3NaturalMotionAnimation?>
  }
}
