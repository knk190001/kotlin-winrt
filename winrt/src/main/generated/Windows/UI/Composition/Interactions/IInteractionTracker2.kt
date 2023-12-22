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

@ABIMarker(IInteractionTracker2.ABI::class)
@Signature("{25769a3e-ce6d-448c-8386-92620d240756}")
@Guid("25769a3ece6d448c838692620d240756")
@WinRTInterface("25769a3ece6d448c838692620d240756")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTracker2.ByReference::class)
public interface IInteractionTracker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun ConfigureCenterPointXInertiaModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  @InterfaceMethod(1)
  public
      fun ConfigureCenterPointYInertiaModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTracker2> {
    public override fun getValue() = ABI.makeIInteractionTracker2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTracker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTracker2 {
    public val __86233385_Ptr: Pointer?

    public val _86233385_VtblPtr: Pointer?
      get() = __86233385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun ConfigureCenterPointXInertiaModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _86233385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__86233385_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun ConfigureCenterPointYInertiaModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _86233385_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__86233385_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTracker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __86233385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTracker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25769a3ece6d448c838692620d240756")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTracker2(ptr: Pointer?): WithDefault = IInteractionTracker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTracker2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTracker2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTracker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__86233385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTracker2): Array<IInteractionTracker2?> =
        (elements as
        Array<IInteractionTracker2?>).castToImpl<IInteractionTracker2,IInteractionTracker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTracker2?> =
        arrayOfNulls<IInteractionTracker2_Impl>(size) as Array<IInteractionTracker2?>
  }
}
