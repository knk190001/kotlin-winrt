package Windows.UI.Composition.Interactions

import Windows.UI.Composition.Compositor
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

@ABIMarker(IInteractionTrackerInertiaRestingValueStatics.ABI::class)
@Signature("{18ed4699-0745-4096-bcab-3a4e99569bcf}")
@Guid("18ed469907454096bcab3a4e99569bcf")
@WinRTInterface("18ed469907454096bcab3a4e99569bcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaRestingValueStatics.ByReference::class)
public interface IInteractionTrackerInertiaRestingValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): InteractionTrackerInertiaRestingValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaRestingValueStatics> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaRestingValueStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaRestingValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaRestingValueStatics {
    public val __551137219_Ptr: Pointer?

    public val _551137219_VtblPtr: Pointer?
      get() = __551137219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): InteractionTrackerInertiaRestingValue? {
      val fnPtr = _551137219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTrackerInertiaRestingValue>()
      val hr = fn.invokeHR(arrayOf(__551137219_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionTrackerInertiaRestingValue>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerInertiaRestingValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __551137219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaRestingValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18ed469907454096bcab3a4e99569bcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaRestingValueStatics(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaRestingValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaRestingValueStatics {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaRestingValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaRestingValueStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__551137219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaRestingValueStatics):
        Array<IInteractionTrackerInertiaRestingValueStatics?> = (elements as
        Array<IInteractionTrackerInertiaRestingValueStatics?>).castToImpl<IInteractionTrackerInertiaRestingValueStatics,IInteractionTrackerInertiaRestingValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaRestingValueStatics?> =
        arrayOfNulls<IInteractionTrackerInertiaRestingValueStatics_Impl>(size) as
        Array<IInteractionTrackerInertiaRestingValueStatics?>
  }
}
