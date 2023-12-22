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

@ABIMarker(IInteractionTrackerInertiaModifierFactory.ABI::class)
@Signature("{993818fe-c94e-4b86-87f3-922665ba46b9}")
@Guid("993818fec94e4b8687f3922665ba46b9")
@WinRTInterface("993818fec94e4b8687f3922665ba46b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaModifierFactory.ByReference::class)
public interface IInteractionTrackerInertiaModifierFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaModifierFactory> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaModifierFactory(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaModifierFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaModifierFactory {
    public val __1926966964_Ptr: Pointer?

    public val _1926966964_VtblPtr: Pointer?
      get() = __1926966964_Ptr?.getPointer(0)
  }

  public class IInteractionTrackerInertiaModifierFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1926966964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaModifierFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("993818fec94e4b8687f3922665ba46b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaModifierFactory(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaModifierFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaModifierFactory {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaModifierFactory(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaModifierFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1926966964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaModifierFactory):
        Array<IInteractionTrackerInertiaModifierFactory?> = (elements as
        Array<IInteractionTrackerInertiaModifierFactory?>).castToImpl<IInteractionTrackerInertiaModifierFactory,IInteractionTrackerInertiaModifierFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaModifierFactory?> =
        arrayOfNulls<IInteractionTrackerInertiaModifierFactory_Impl>(size) as
        Array<IInteractionTrackerInertiaModifierFactory?>
  }
}
