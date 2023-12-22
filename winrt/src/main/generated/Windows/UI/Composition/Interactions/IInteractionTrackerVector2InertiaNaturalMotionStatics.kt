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

@ABIMarker(IInteractionTrackerVector2InertiaNaturalMotionStatics.ABI::class)
@Signature("{82001a48-09c0-434f-8189-141c66df362f}")
@Guid("82001a4809c0434f8189141c66df362f")
@WinRTInterface("82001a4809c0434f8189141c66df362f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IInteractionTrackerVector2InertiaNaturalMotionStatics.ByReference::class)
public interface IInteractionTrackerVector2InertiaNaturalMotionStatics : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): InteractionTrackerVector2InertiaNaturalMotion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerVector2InertiaNaturalMotionStatics> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerVector2InertiaNaturalMotionStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerVector2InertiaNaturalMotionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerVector2InertiaNaturalMotionStatics {
    public val __518320980_Ptr: Pointer?

    public val _518320980_VtblPtr: Pointer?
      get() = __518320980_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?):
        InteractionTrackerVector2InertiaNaturalMotion? {
      val fnPtr = _518320980_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTrackerVector2InertiaNaturalMotion>()
      val hr = fn.invokeHR(arrayOf(__518320980_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<InteractionTrackerVector2InertiaNaturalMotion>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerVector2InertiaNaturalMotionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __518320980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerVector2InertiaNaturalMotionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82001a4809c0434f8189141c66df362f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerVector2InertiaNaturalMotionStatics(ptr: Pointer?): WithDefault
        = IInteractionTrackerVector2InertiaNaturalMotionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerVector2InertiaNaturalMotionStatics {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerVector2InertiaNaturalMotionStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerVector2InertiaNaturalMotionStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__518320980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerVector2InertiaNaturalMotionStatics):
        Array<IInteractionTrackerVector2InertiaNaturalMotionStatics?> = (elements as
        Array<IInteractionTrackerVector2InertiaNaturalMotionStatics?>).castToImpl<IInteractionTrackerVector2InertiaNaturalMotionStatics,IInteractionTrackerVector2InertiaNaturalMotionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IInteractionTrackerVector2InertiaNaturalMotionStatics?> =
        arrayOfNulls<IInteractionTrackerVector2InertiaNaturalMotionStatics_Impl>(size) as
        Array<IInteractionTrackerVector2InertiaNaturalMotionStatics?>
  }
}
