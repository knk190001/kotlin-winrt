package Microsoft.UI.Composition.Interactions

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

@ABIMarker(IInteractionTrackerVector2InertiaModifierFactory.ABI::class)
@Signature("{1b3fd240-ba66-5296-b801-62a2a3606613}")
@Guid("1b3fd240ba665296b80162a2a3606613")
@WinRTInterface("1b3fd240ba665296b80162a2a3606613")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerVector2InertiaModifierFactory.ByReference::class)
public interface IInteractionTrackerVector2InertiaModifierFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerVector2InertiaModifierFactory> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerVector2InertiaModifierFactory(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerVector2InertiaModifierFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerVector2InertiaModifierFactory {
    public val __508198600_Ptr: Pointer?

    public val _508198600_VtblPtr: Pointer?
      get() = __508198600_Ptr?.getPointer(0)
  }

  public class IInteractionTrackerVector2InertiaModifierFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508198600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerVector2InertiaModifierFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b3fd240ba665296b80162a2a3606613")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerVector2InertiaModifierFactory(ptr: Pointer?): WithDefault =
        IInteractionTrackerVector2InertiaModifierFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerVector2InertiaModifierFactory {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerVector2InertiaModifierFactory(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerVector2InertiaModifierFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__508198600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerVector2InertiaModifierFactory):
        Array<IInteractionTrackerVector2InertiaModifierFactory?> = (elements as
        Array<IInteractionTrackerVector2InertiaModifierFactory?>).castToImpl<IInteractionTrackerVector2InertiaModifierFactory,IInteractionTrackerVector2InertiaModifierFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerVector2InertiaModifierFactory?>
        = arrayOfNulls<IInteractionTrackerVector2InertiaModifierFactory_Impl>(size) as
        Array<IInteractionTrackerVector2InertiaModifierFactory?>
  }
}
