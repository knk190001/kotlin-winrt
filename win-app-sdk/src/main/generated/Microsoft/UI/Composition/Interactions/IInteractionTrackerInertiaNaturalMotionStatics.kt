package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(IInteractionTrackerInertiaNaturalMotionStatics.ABI::class)
@Signature("{860ec143-f165-5298-abf2-47369dd07f10}")
@Guid("860ec143f1655298abf247369dd07f10")
@WinRTInterface("860ec143f1655298abf247369dd07f10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaNaturalMotionStatics.ByReference::class)
public interface IInteractionTrackerInertiaNaturalMotionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): InteractionTrackerInertiaNaturalMotion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaNaturalMotionStatics> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaNaturalMotionStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaNaturalMotionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaNaturalMotionStatics {
    public val __1951458896_Ptr: Pointer?

    public val _1951458896_VtblPtr: Pointer?
      get() = __1951458896_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): InteractionTrackerInertiaNaturalMotion? {
      val fnPtr = _1951458896_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTrackerInertiaNaturalMotion>()
      val hr = fn.invokeHR(arrayOf(__1951458896_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionTrackerInertiaNaturalMotion>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerInertiaNaturalMotionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1951458896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaNaturalMotionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("860ec143f1655298abf247369dd07f10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaNaturalMotionStatics(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaNaturalMotionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaNaturalMotionStatics {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaNaturalMotionStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaNaturalMotionStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1951458896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaNaturalMotionStatics):
        Array<IInteractionTrackerInertiaNaturalMotionStatics?> = (elements as
        Array<IInteractionTrackerInertiaNaturalMotionStatics?>).castToImpl<IInteractionTrackerInertiaNaturalMotionStatics,IInteractionTrackerInertiaNaturalMotionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaNaturalMotionStatics?> =
        arrayOfNulls<IInteractionTrackerInertiaNaturalMotionStatics_Impl>(size) as
        Array<IInteractionTrackerInertiaNaturalMotionStatics?>
  }
}
