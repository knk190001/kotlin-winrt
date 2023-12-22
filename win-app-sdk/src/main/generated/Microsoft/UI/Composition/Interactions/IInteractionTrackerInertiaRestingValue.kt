package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.ExpressionAnimation
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

@ABIMarker(IInteractionTrackerInertiaRestingValue.ABI::class)
@Signature("{1a2b20cd-3371-53ff-a560-f4847b467d73}")
@Guid("1a2b20cd337153ffa560f4847b467d73")
@WinRTInterface("1a2b20cd337153ffa560f4847b467d73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaRestingValue.ByReference::class)
public interface IInteractionTrackerInertiaRestingValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Condition(): ExpressionAnimation?

  @InterfaceMethod(1)
  public fun put_Condition(value: ExpressionAnimation?): Unit

  @InterfaceMethod(2)
  public fun get_RestingValue(): ExpressionAnimation?

  @InterfaceMethod(3)
  public fun put_RestingValue(value: ExpressionAnimation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaRestingValue> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaRestingValue(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaRestingValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaRestingValue {
    public val __280363699_Ptr: Pointer?

    public val _280363699_VtblPtr: Pointer?
      get() = __280363699_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Condition(): ExpressionAnimation? {
      val fnPtr = _280363699_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__280363699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Condition(value: ExpressionAnimation?): Unit {
      val fnPtr = _280363699_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__280363699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RestingValue(): ExpressionAnimation? {
      val fnPtr = _280363699_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__280363699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RestingValue(value: ExpressionAnimation?): Unit {
      val fnPtr = _280363699_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__280363699_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTrackerInertiaRestingValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __280363699_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaRestingValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a2b20cd337153ffa560f4847b467d73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaRestingValue(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaRestingValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerInertiaRestingValue {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaRestingValue(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaRestingValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__280363699_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaRestingValue):
        Array<IInteractionTrackerInertiaRestingValue?> = (elements as
        Array<IInteractionTrackerInertiaRestingValue?>).castToImpl<IInteractionTrackerInertiaRestingValue,IInteractionTrackerInertiaRestingValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaRestingValue?> =
        arrayOfNulls<IInteractionTrackerInertiaRestingValue_Impl>(size) as
        Array<IInteractionTrackerInertiaRestingValue?>
  }
}
