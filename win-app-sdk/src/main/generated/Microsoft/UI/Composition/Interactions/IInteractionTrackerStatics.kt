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

@ABIMarker(IInteractionTrackerStatics.ABI::class)
@Signature("{7ac9867a-e16e-56ef-9809-f6e404240f50}")
@Guid("7ac9867ae16e56ef9809f6e404240f50")
@WinRTInterface("7ac9867ae16e56ef9809f6e404240f50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerStatics.ByReference::class)
public interface IInteractionTrackerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): InteractionTracker?

  @InterfaceMethod(1)
  public fun CreateWithOwner(compositor: Compositor?, owner: IInteractionTrackerOwner?):
      InteractionTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerStatics> {
    public override fun getValue() = ABI.makeIInteractionTrackerStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerStatics {
    public val __969518773_Ptr: Pointer?

    public val _969518773_VtblPtr: Pointer?
      get() = __969518773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): InteractionTracker? {
      val fnPtr = _969518773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTracker>()
      val hr = fn.invokeHR(arrayOf(__969518773_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithOwner(compositor: Compositor?, owner: IInteractionTrackerOwner?):
        InteractionTracker? {
      val fnPtr = _969518773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionTracker>()
      val hr = fn.invokeHR(arrayOf(__969518773_Ptr, marshalToNative(compositor),
          marshalToNative(owner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionTracker>(result.getValue())
      return resultValue
    }
  }

  public class IInteractionTrackerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __969518773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ac9867ae16e56ef9809f6e404240f50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerStatics(ptr: Pointer?): WithDefault =
        IInteractionTrackerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerStatics {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__969518773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerStatics):
        Array<IInteractionTrackerStatics?> = (elements as
        Array<IInteractionTrackerStatics?>).castToImpl<IInteractionTrackerStatics,IInteractionTrackerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerStatics?> =
        arrayOfNulls<IInteractionTrackerStatics_Impl>(size) as Array<IInteractionTrackerStatics?>
  }
}
