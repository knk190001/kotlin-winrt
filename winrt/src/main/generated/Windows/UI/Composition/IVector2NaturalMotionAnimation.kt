package Windows.UI.Composition

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(IVector2NaturalMotionAnimation.ABI::class)
@Signature("{0f3e0b7d-e512-479d-a00c-77c93a30a395}")
@Guid("0f3e0b7de512479da00c77c93a30a395")
@WinRTInterface("0f3e0b7de512479da00c77c93a30a395")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector2NaturalMotionAnimation.ByReference::class)
public interface IVector2NaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FinalValue(): IReference<Vector2?>?

  @InterfaceMethod(1)
  public fun put_FinalValue(value: IReference<Vector2?>?): Unit

  @InterfaceMethod(2)
  public fun get_InitialValue(): IReference<Vector2?>?

  @InterfaceMethod(3)
  public fun put_InitialValue(value: IReference<Vector2?>?): Unit

  @InterfaceMethod(4)
  public fun get_InitialVelocity(): Vector2?

  @InterfaceMethod(5)
  public fun put_InitialVelocity(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector2NaturalMotionAnimation> {
    public override fun getValue() = ABI.makeIVector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: IVector2NaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector2NaturalMotionAnimation {
    public val __1376907706_Ptr: Pointer?

    public val _1376907706_VtblPtr: Pointer?
      get() = __1376907706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FinalValue(): IReference<Vector2?>? {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector2?>>()
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector2?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FinalValue(value: IReference<Vector2?>?): Unit {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialValue(): IReference<Vector2?>? {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector2?>>()
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector2?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InitialValue(value: IReference<Vector2?>?): Unit {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InitialVelocity(): Vector2? {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InitialVelocity(value: Vector2?): Unit {
      val fnPtr = _1376907706_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376907706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector2NaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376907706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector2NaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f3e0b7de512479da00c77c93a30a395")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector2NaturalMotionAnimation(ptr: Pointer?): WithDefault =
        IVector2NaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeIVector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IVector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376907706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector2NaturalMotionAnimation):
        Array<IVector2NaturalMotionAnimation?> = (elements as
        Array<IVector2NaturalMotionAnimation?>).castToImpl<IVector2NaturalMotionAnimation,IVector2NaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector2NaturalMotionAnimation?> =
        arrayOfNulls<IVector2NaturalMotionAnimation_Impl>(size) as
        Array<IVector2NaturalMotionAnimation?>
  }
}
