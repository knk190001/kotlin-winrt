package Microsoft.UI.Composition

import Windows.Foundation.IReference
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

@ABIMarker(IScalarNaturalMotionAnimation.ABI::class)
@Signature("{903224b0-2dbe-56eb-b9ea-33d2e3113181}")
@Guid("903224b02dbe56ebb9ea33d2e3113181")
@WinRTInterface("903224b02dbe56ebb9ea33d2e3113181")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScalarNaturalMotionAnimation.ByReference::class)
public interface IScalarNaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FinalValue(): IReference<Float>?

  @InterfaceMethod(1)
  public fun put_FinalValue(value: IReference<Float>?): Unit

  @InterfaceMethod(2)
  public fun get_InitialValue(): IReference<Float>?

  @InterfaceMethod(3)
  public fun put_InitialValue(value: IReference<Float>?): Unit

  @InterfaceMethod(4)
  public fun get_InitialVelocity(): Float

  @InterfaceMethod(5)
  public fun put_InitialVelocity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScalarNaturalMotionAnimation> {
    public override fun getValue() = ABI.makeIScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: IScalarNaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScalarNaturalMotionAnimation {
    public val __1955341142_Ptr: Pointer?

    public val _1955341142_VtblPtr: Pointer?
      get() = __1955341142_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FinalValue(): IReference<Float>? {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FinalValue(value: IReference<Float>?): Unit {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialValue(): IReference<Float>? {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InitialValue(value: IReference<Float>?): Unit {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InitialVelocity(): Float {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_InitialVelocity(value: Float): Unit {
      val fnPtr = _1955341142_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1955341142_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScalarNaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1955341142_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScalarNaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("903224b02dbe56ebb9ea33d2e3113181")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScalarNaturalMotionAnimation(ptr: Pointer?): WithDefault =
        IScalarNaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeIScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1955341142_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScalarNaturalMotionAnimation):
        Array<IScalarNaturalMotionAnimation?> = (elements as
        Array<IScalarNaturalMotionAnimation?>).castToImpl<IScalarNaturalMotionAnimation,IScalarNaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScalarNaturalMotionAnimation?> =
        arrayOfNulls<IScalarNaturalMotionAnimation_Impl>(size) as
        Array<IScalarNaturalMotionAnimation?>
  }
}
