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

@ABIMarker(IInteractionTrackerCustomAnimationStateEnteredArgs2.ABI::class)
@Signature("{06b99fbc-d6a8-5ae3-88b8-e91621becbd6}")
@Guid("06b99fbcd6a85ae388b8e91621becbd6")
@WinRTInterface("06b99fbcd6a85ae388b8e91621becbd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerCustomAnimationStateEnteredArgs2.ByReference::class)
public interface IInteractionTrackerCustomAnimationStateEnteredArgs2 : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_IsFromBinding(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerCustomAnimationStateEnteredArgs2> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerCustomAnimationStateEnteredArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerCustomAnimationStateEnteredArgs2 {
    public val __1326063404_Ptr: Pointer?

    public val _1326063404_VtblPtr: Pointer?
      get() = __1326063404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFromBinding(): Boolean {
      val fnPtr = _1326063404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1326063404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerCustomAnimationStateEnteredArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1326063404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerCustomAnimationStateEnteredArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06b99fbcd6a85ae388b8e91621becbd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerCustomAnimationStateEnteredArgs2(ptr: Pointer?): WithDefault =
        IInteractionTrackerCustomAnimationStateEnteredArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerCustomAnimationStateEnteredArgs2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerCustomAnimationStateEnteredArgs2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerCustomAnimationStateEnteredArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1326063404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerCustomAnimationStateEnteredArgs2):
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs2?> = (elements as
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs2?>).castToImpl<IInteractionTrackerCustomAnimationStateEnteredArgs2,IInteractionTrackerCustomAnimationStateEnteredArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs2?> =
        arrayOfNulls<IInteractionTrackerCustomAnimationStateEnteredArgs2_Impl>(size) as
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs2?>
  }
}
