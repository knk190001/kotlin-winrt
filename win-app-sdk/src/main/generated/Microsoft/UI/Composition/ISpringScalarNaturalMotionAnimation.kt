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

@ABIMarker(ISpringScalarNaturalMotionAnimation.ABI::class)
@Signature("{6f720afd-d3d0-5e78-9c2e-83092f6ea45e}")
@Guid("6f720afdd3d05e789c2e83092f6ea45e")
@WinRTInterface("6f720afdd3d05e789c2e83092f6ea45e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpringScalarNaturalMotionAnimation.ByReference::class)
public interface ISpringScalarNaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DampingRatio(): Float

  @InterfaceMethod(1)
  public fun put_DampingRatio(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Period(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_Period(value: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpringScalarNaturalMotionAnimation> {
    public override fun getValue() =
        ABI.makeISpringScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: ISpringScalarNaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpringScalarNaturalMotionAnimation {
    public val __135334249_Ptr: Pointer?

    public val _135334249_VtblPtr: Pointer?
      get() = __135334249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DampingRatio(): Float {
      val fnPtr = _135334249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__135334249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DampingRatio(value: Float): Unit {
      val fnPtr = _135334249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__135334249_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Period(): TimeSpan? {
      val fnPtr = _135334249_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__135334249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Period(value: TimeSpan?): Unit {
      val fnPtr = _135334249_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__135334249_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpringScalarNaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __135334249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpringScalarNaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f720afdd3d05e789c2e83092f6ea45e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpringScalarNaturalMotionAnimation(ptr: Pointer?): WithDefault =
        ISpringScalarNaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpringScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeISpringScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISpringScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135334249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpringScalarNaturalMotionAnimation):
        Array<ISpringScalarNaturalMotionAnimation?> = (elements as
        Array<ISpringScalarNaturalMotionAnimation?>).castToImpl<ISpringScalarNaturalMotionAnimation,ISpringScalarNaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpringScalarNaturalMotionAnimation?> =
        arrayOfNulls<ISpringScalarNaturalMotionAnimation_Impl>(size) as
        Array<ISpringScalarNaturalMotionAnimation?>
  }
}
