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

@ABIMarker(IInteractionTrackerInertiaMotionStatics.ABI::class)
@Signature("{8cc83dd6-ba7b-431a-844b-6eac9130f99a}")
@Guid("8cc83dd6ba7b431a844b6eac9130f99a")
@WinRTInterface("8cc83dd6ba7b431a844b6eac9130f99a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaMotionStatics.ByReference::class)
public interface IInteractionTrackerInertiaMotionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): InteractionTrackerInertiaMotion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaMotionStatics> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaMotionStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaMotionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaMotionStatics {
    public val __2031483920_Ptr: Pointer?

    public val _2031483920_VtblPtr: Pointer?
      get() = __2031483920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): InteractionTrackerInertiaMotion? {
      val fnPtr = _2031483920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTrackerInertiaMotion>()
      val hr = fn.invokeHR(arrayOf(__2031483920_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionTrackerInertiaMotion>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerInertiaMotionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2031483920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaMotionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8cc83dd6ba7b431a844b6eac9130f99a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaMotionStatics(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaMotionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaMotionStatics {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaMotionStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaMotionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2031483920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaMotionStatics):
        Array<IInteractionTrackerInertiaMotionStatics?> = (elements as
        Array<IInteractionTrackerInertiaMotionStatics?>).castToImpl<IInteractionTrackerInertiaMotionStatics,IInteractionTrackerInertiaMotionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaMotionStatics?> =
        arrayOfNulls<IInteractionTrackerInertiaMotionStatics_Impl>(size) as
        Array<IInteractionTrackerInertiaMotionStatics?>
  }
}
