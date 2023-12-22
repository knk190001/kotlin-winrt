package Windows.UI.Composition.Interactions

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IInteractionTracker3.ABI::class)
@Signature("{e6c5d7a2-5c4b-42c6-84b7-f69441b18091}")
@Guid("e6c5d7a25c4b42c684b7f69441b18091")
@WinRTInterface("e6c5d7a25c4b42c684b7f69441b18091")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTracker3.ByReference::class)
public interface IInteractionTracker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun ConfigureVector2PositionInertiaModifiers(modifiers: IIterable<InteractionTrackerVector2InertiaModifier?>?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTracker3> {
    public override fun getValue() = ABI.makeIInteractionTracker3(pointer.getPointer(0))

    public fun setValue(value: IInteractionTracker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTracker3 {
    public val __86233384_Ptr: Pointer?

    public val _86233384_VtblPtr: Pointer?
      get() = __86233384_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun ConfigureVector2PositionInertiaModifiers(modifiers: IIterable<InteractionTrackerVector2InertiaModifier?>?):
        Unit {
      val fnPtr = _86233384_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__86233384_Ptr, marshalToNative(modifiers),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTracker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __86233384_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTracker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6c5d7a25c4b42c684b7f69441b18091")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTracker3(ptr: Pointer?): WithDefault = IInteractionTracker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTracker3 {
      val address = segment.toRawLongValue()
      return makeIInteractionTracker3(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTracker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__86233384_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTracker3): Array<IInteractionTracker3?> =
        (elements as
        Array<IInteractionTracker3?>).castToImpl<IInteractionTracker3,IInteractionTracker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTracker3?> =
        arrayOfNulls<IInteractionTracker3_Impl>(size) as Array<IInteractionTracker3?>
  }
}
