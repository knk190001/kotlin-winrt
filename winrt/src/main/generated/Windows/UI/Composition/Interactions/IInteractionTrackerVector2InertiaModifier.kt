package Windows.UI.Composition.Interactions

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTrackerVector2InertiaModifier.ABI::class)
@Signature("{87e08ab0-3086-4853-a4b7-77882ad5d7e3}")
@Guid("87e08ab030864853a4b777882ad5d7e3")
@WinRTInterface("87e08ab030864853a4b777882ad5d7e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerVector2InertiaModifier.ByReference::class)
public interface IInteractionTrackerVector2InertiaModifier : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerVector2InertiaModifier> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerVector2InertiaModifier(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerVector2InertiaModifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerVector2InertiaModifier {
    public val __1884608253_Ptr: Pointer?

    public val _1884608253_VtblPtr: Pointer?
      get() = __1884608253_Ptr?.getPointer(0)
  }

  public class IInteractionTrackerVector2InertiaModifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1884608253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerVector2InertiaModifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87e08ab030864853a4b777882ad5d7e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerVector2InertiaModifier(ptr: Pointer?): WithDefault =
        IInteractionTrackerVector2InertiaModifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerVector2InertiaModifier {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerVector2InertiaModifier(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerVector2InertiaModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1884608253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerVector2InertiaModifier):
        Array<IInteractionTrackerVector2InertiaModifier?> = (elements as
        Array<IInteractionTrackerVector2InertiaModifier?>).castToImpl<IInteractionTrackerVector2InertiaModifier,IInteractionTrackerVector2InertiaModifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerVector2InertiaModifier?> =
        arrayOfNulls<IInteractionTrackerVector2InertiaModifier_Impl>(size) as
        Array<IInteractionTrackerVector2InertiaModifier?>
  }
}
