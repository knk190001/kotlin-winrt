package Windows.UI.Composition.Interactions

import Windows.UI.Composition.ExpressionAnimation
import Windows.UI.Composition.ScalarNaturalMotionAnimation
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

@ABIMarker(IInteractionTrackerInertiaNaturalMotion.ABI::class)
@Signature("{70acdaae-27dc-48ed-a3c3-6d61c9a029d2}")
@Guid("70acdaae27dc48eda3c36d61c9a029d2")
@WinRTInterface("70acdaae27dc48eda3c36d61c9a029d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaNaturalMotion.ByReference::class)
public interface IInteractionTrackerInertiaNaturalMotion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Condition(): ExpressionAnimation?

  @InterfaceMethod(1)
  public fun put_Condition(value: ExpressionAnimation?): Unit

  @InterfaceMethod(2)
  public fun get_NaturalMotion(): ScalarNaturalMotionAnimation?

  @InterfaceMethod(3)
  public fun put_NaturalMotion(value: ScalarNaturalMotionAnimation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaNaturalMotion> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaNaturalMotion(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaNaturalMotion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaNaturalMotion {
    public val __600218112_Ptr: Pointer?

    public val _600218112_VtblPtr: Pointer?
      get() = __600218112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Condition(): ExpressionAnimation? {
      val fnPtr = _600218112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__600218112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Condition(value: ExpressionAnimation?): Unit {
      val fnPtr = _600218112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600218112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NaturalMotion(): ScalarNaturalMotionAnimation? {
      val fnPtr = _600218112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarNaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__600218112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarNaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NaturalMotion(value: ScalarNaturalMotionAnimation?): Unit {
      val fnPtr = _600218112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__600218112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTrackerInertiaNaturalMotion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600218112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaNaturalMotion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70acdaae27dc48eda3c36d61c9a029d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaNaturalMotion(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaNaturalMotion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaNaturalMotion {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaNaturalMotion(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaNaturalMotion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600218112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaNaturalMotion):
        Array<IInteractionTrackerInertiaNaturalMotion?> = (elements as
        Array<IInteractionTrackerInertiaNaturalMotion?>).castToImpl<IInteractionTrackerInertiaNaturalMotion,IInteractionTrackerInertiaNaturalMotion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaNaturalMotion?> =
        arrayOfNulls<IInteractionTrackerInertiaNaturalMotion_Impl>(size) as
        Array<IInteractionTrackerInertiaNaturalMotion?>
  }
}
