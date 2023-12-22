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

@ABIMarker(IInteractionTrackerInertiaModifier.ABI::class)
@Signature("{a0e2c920-26b4-4da2-8b61-5e683979bbe2}")
@Guid("a0e2c92026b44da28b615e683979bbe2")
@WinRTInterface("a0e2c92026b44da28b615e683979bbe2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaModifier.ByReference::class)
public interface IInteractionTrackerInertiaModifier : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaModifier> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaModifier(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaModifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaModifier {
    public val __199436662_Ptr: Pointer?

    public val _199436662_VtblPtr: Pointer?
      get() = __199436662_Ptr?.getPointer(0)
  }

  public class IInteractionTrackerInertiaModifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __199436662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaModifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0e2c92026b44da28b615e683979bbe2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaModifier(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaModifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerInertiaModifier {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaModifier(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199436662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaModifier):
        Array<IInteractionTrackerInertiaModifier?> = (elements as
        Array<IInteractionTrackerInertiaModifier?>).castToImpl<IInteractionTrackerInertiaModifier,IInteractionTrackerInertiaModifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaModifier?> =
        arrayOfNulls<IInteractionTrackerInertiaModifier_Impl>(size) as
        Array<IInteractionTrackerInertiaModifier?>
  }
}
