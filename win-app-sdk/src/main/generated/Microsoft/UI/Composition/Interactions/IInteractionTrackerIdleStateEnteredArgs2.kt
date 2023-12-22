package Microsoft.UI.Composition.Interactions

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTrackerIdleStateEnteredArgs2.ABI::class)
@Signature("{4eb213c0-931c-5164-8965-11c0186d3390}")
@Guid("4eb213c0931c5164896511c0186d3390")
@WinRTInterface("4eb213c0931c5164896511c0186d3390")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerIdleStateEnteredArgs2.ByReference::class)
public interface IInteractionTrackerIdleStateEnteredArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFromBinding(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerIdleStateEnteredArgs2> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerIdleStateEnteredArgs2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerIdleStateEnteredArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerIdleStateEnteredArgs2 {
    public val __602088555_Ptr: Pointer?

    public val _602088555_VtblPtr: Pointer?
      get() = __602088555_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFromBinding(): Boolean {
      val fnPtr = _602088555_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__602088555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerIdleStateEnteredArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __602088555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerIdleStateEnteredArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4eb213c0931c5164896511c0186d3390")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerIdleStateEnteredArgs2(ptr: Pointer?): WithDefault =
        IInteractionTrackerIdleStateEnteredArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerIdleStateEnteredArgs2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerIdleStateEnteredArgs2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerIdleStateEnteredArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__602088555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerIdleStateEnteredArgs2):
        Array<IInteractionTrackerIdleStateEnteredArgs2?> = (elements as
        Array<IInteractionTrackerIdleStateEnteredArgs2?>).castToImpl<IInteractionTrackerIdleStateEnteredArgs2,IInteractionTrackerIdleStateEnteredArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerIdleStateEnteredArgs2?> =
        arrayOfNulls<IInteractionTrackerIdleStateEnteredArgs2_Impl>(size) as
        Array<IInteractionTrackerIdleStateEnteredArgs2?>
  }
}
