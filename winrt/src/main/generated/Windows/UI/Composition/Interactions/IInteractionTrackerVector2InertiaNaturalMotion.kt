package Windows.UI.Composition.Interactions

import Windows.UI.Composition.ExpressionAnimation
import Windows.UI.Composition.Vector2NaturalMotionAnimation
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

@ABIMarker(IInteractionTrackerVector2InertiaNaturalMotion.ABI::class)
@Signature("{5f17695c-162d-4c07-9400-c282b28276ca}")
@Guid("5f17695c162d4c079400c282b28276ca")
@WinRTInterface("5f17695c162d4c079400c282b28276ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerVector2InertiaNaturalMotion.ByReference::class)
public interface IInteractionTrackerVector2InertiaNaturalMotion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Condition(): ExpressionAnimation?

  @InterfaceMethod(1)
  public fun put_Condition(value: ExpressionAnimation?): Unit

  @InterfaceMethod(2)
  public fun get_NaturalMotion(): Vector2NaturalMotionAnimation?

  @InterfaceMethod(3)
  public fun put_NaturalMotion(value: Vector2NaturalMotionAnimation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerVector2InertiaNaturalMotion> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerVector2InertiaNaturalMotion(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerVector2InertiaNaturalMotion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerVector2InertiaNaturalMotion {
    public val __1289087783_Ptr: Pointer?

    public val _1289087783_VtblPtr: Pointer?
      get() = __1289087783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Condition(): ExpressionAnimation? {
      val fnPtr = _1289087783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__1289087783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Condition(value: ExpressionAnimation?): Unit {
      val fnPtr = _1289087783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1289087783_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NaturalMotion(): Vector2NaturalMotionAnimation? {
      val fnPtr = _1289087783_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2NaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__1289087783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2NaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NaturalMotion(value: Vector2NaturalMotionAnimation?): Unit {
      val fnPtr = _1289087783_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1289087783_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTrackerVector2InertiaNaturalMotion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1289087783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerVector2InertiaNaturalMotion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f17695c162d4c079400c282b28276ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerVector2InertiaNaturalMotion(ptr: Pointer?): WithDefault =
        IInteractionTrackerVector2InertiaNaturalMotion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerVector2InertiaNaturalMotion {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerVector2InertiaNaturalMotion(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerVector2InertiaNaturalMotion): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1289087783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerVector2InertiaNaturalMotion):
        Array<IInteractionTrackerVector2InertiaNaturalMotion?> = (elements as
        Array<IInteractionTrackerVector2InertiaNaturalMotion?>).castToImpl<IInteractionTrackerVector2InertiaNaturalMotion,IInteractionTrackerVector2InertiaNaturalMotion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerVector2InertiaNaturalMotion?> =
        arrayOfNulls<IInteractionTrackerVector2InertiaNaturalMotion_Impl>(size) as
        Array<IInteractionTrackerVector2InertiaNaturalMotion?>
  }
}
