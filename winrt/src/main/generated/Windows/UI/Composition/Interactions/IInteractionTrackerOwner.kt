package Windows.UI.Composition.Interactions

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

@ABIMarker(IInteractionTrackerOwner.ABI::class)
@Signature("{db2e8af3-4deb-4e53-b29c-b06c9f96d651}")
@Guid("db2e8af34deb4e53b29cb06c9f96d651")
@WinRTInterface("db2e8af34deb4e53b29cb06c9f96d651")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerOwner.ByReference::class)
public interface IInteractionTrackerOwner : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CustomAnimationStateEntered(sender: InteractionTracker?,
      args: InteractionTrackerCustomAnimationStateEnteredArgs?): Unit

  @InterfaceMethod(1)
  public fun IdleStateEntered(sender: InteractionTracker?,
      args: InteractionTrackerIdleStateEnteredArgs?): Unit

  @InterfaceMethod(2)
  public fun InertiaStateEntered(sender: InteractionTracker?,
      args: InteractionTrackerInertiaStateEnteredArgs?): Unit

  @InterfaceMethod(3)
  public fun InteractingStateEntered(sender: InteractionTracker?,
      args: InteractionTrackerInteractingStateEnteredArgs?): Unit

  @InterfaceMethod(4)
  public fun RequestIgnored(sender: InteractionTracker?,
      args: InteractionTrackerRequestIgnoredArgs?): Unit

  @InterfaceMethod(5)
  public fun ValuesChanged(sender: InteractionTracker?, args: InteractionTrackerValuesChangedArgs?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerOwner> {
    public override fun getValue() = ABI.makeIInteractionTrackerOwner(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerOwner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerOwner {
    public val __1027909960_Ptr: Pointer?

    public val _1027909960_VtblPtr: Pointer?
      get() = __1027909960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CustomAnimationStateEntered(sender: InteractionTracker?,
        args: InteractionTrackerCustomAnimationStateEnteredArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun IdleStateEntered(sender: InteractionTracker?,
        args: InteractionTrackerIdleStateEnteredArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InertiaStateEntered(sender: InteractionTracker?,
        args: InteractionTrackerInertiaStateEnteredArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InteractingStateEntered(sender: InteractionTracker?,
        args: InteractionTrackerInteractingStateEnteredArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RequestIgnored(sender: InteractionTracker?,
        args: InteractionTrackerRequestIgnoredArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ValuesChanged(sender: InteractionTracker?,
        args: InteractionTrackerValuesChangedArgs?): Unit {
      val fnPtr = _1027909960_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1027909960_Ptr, marshalToNative(sender),
          marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInteractionTrackerOwner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1027909960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerOwner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db2e8af34deb4e53b29cb06c9f96d651")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerOwner(ptr: Pointer?): WithDefault =
        IInteractionTrackerOwner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTrackerOwner {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerOwner(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerOwner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1027909960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerOwner):
        Array<IInteractionTrackerOwner?> = (elements as
        Array<IInteractionTrackerOwner?>).castToImpl<IInteractionTrackerOwner,IInteractionTrackerOwner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerOwner?> =
        arrayOfNulls<IInteractionTrackerOwner_Impl>(size) as Array<IInteractionTrackerOwner?>
  }
}
