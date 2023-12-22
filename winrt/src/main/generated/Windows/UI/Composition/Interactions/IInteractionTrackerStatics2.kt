package Windows.UI.Composition.Interactions

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

@ABIMarker(IInteractionTrackerStatics2.ABI::class)
@Signature("{35e53720-46b7-5cb0-b505-f3d6884a6163}")
@Guid("35e5372046b75cb0b505f3d6884a6163")
@WinRTInterface("35e5372046b75cb0b505f3d6884a6163")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerStatics2.ByReference::class)
public interface IInteractionTrackerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetBindingMode(
    boundTracker1: InteractionTracker?,
    boundTracker2: InteractionTracker?,
    axisMode: InteractionBindingAxisModes?
  ): Unit

  @InterfaceMethod(1)
  public fun GetBindingMode(boundTracker1: InteractionTracker?, boundTracker2: InteractionTracker?):
      InteractionBindingAxisModes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerStatics2> {
    public override fun getValue() = ABI.makeIInteractionTrackerStatics2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerStatics2 {
    public val __306469608_Ptr: Pointer?

    public val _306469608_VtblPtr: Pointer?
      get() = __306469608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetBindingMode(
      boundTracker1: InteractionTracker?,
      boundTracker2: InteractionTracker?,
      axisMode: InteractionBindingAxisModes?
    ): Unit {
      val fnPtr = _306469608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306469608_Ptr, marshalToNative(boundTracker1),
          marshalToNative(boundTracker2), marshalToNative(axisMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetBindingMode(boundTracker1: InteractionTracker?,
        boundTracker2: InteractionTracker?): InteractionBindingAxisModes? {
      val fnPtr = _306469608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionBindingAxisModes>()
      val hr = fn.invokeHR(arrayOf(__306469608_Ptr, marshalToNative(boundTracker1),
          marshalToNative(boundTracker2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionBindingAxisModes>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __306469608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35e5372046b75cb0b505f3d6884a6163")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerStatics2(ptr: Pointer?): WithDefault =
        IInteractionTrackerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerStatics2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__306469608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerStatics2):
        Array<IInteractionTrackerStatics2?> = (elements as
        Array<IInteractionTrackerStatics2?>).castToImpl<IInteractionTrackerStatics2,IInteractionTrackerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerStatics2?> =
        arrayOfNulls<IInteractionTrackerStatics2_Impl>(size) as Array<IInteractionTrackerStatics2?>
  }
}
