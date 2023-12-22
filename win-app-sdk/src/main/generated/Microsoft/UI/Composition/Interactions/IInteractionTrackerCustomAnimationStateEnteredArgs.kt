package Microsoft.UI.Composition.Interactions

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

@ABIMarker(IInteractionTrackerCustomAnimationStateEnteredArgs.ABI::class)
@Signature("{7464035c-cfce-56da-9472-420f276bd0a5}")
@Guid("7464035ccfce56da9472420f276bd0a5")
@WinRTInterface("7464035ccfce56da9472420f276bd0a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerCustomAnimationStateEnteredArgs.ByReference::class)
public interface IInteractionTrackerCustomAnimationStateEnteredArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_RequestId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerCustomAnimationStateEnteredArgs> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerCustomAnimationStateEnteredArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerCustomAnimationStateEnteredArgs {
    public val __874060230_Ptr: Pointer?

    public val _874060230_VtblPtr: Pointer?
      get() = __874060230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): Int {
      val fnPtr = _874060230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__874060230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerCustomAnimationStateEnteredArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __874060230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerCustomAnimationStateEnteredArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7464035ccfce56da9472420f276bd0a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerCustomAnimationStateEnteredArgs(ptr: Pointer?): WithDefault =
        IInteractionTrackerCustomAnimationStateEnteredArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerCustomAnimationStateEnteredArgs {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerCustomAnimationStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerCustomAnimationStateEnteredArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__874060230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerCustomAnimationStateEnteredArgs):
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs?> = (elements as
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs?>).castToImpl<IInteractionTrackerCustomAnimationStateEnteredArgs,IInteractionTrackerCustomAnimationStateEnteredArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs?> =
        arrayOfNulls<IInteractionTrackerCustomAnimationStateEnteredArgs_Impl>(size) as
        Array<IInteractionTrackerCustomAnimationStateEnteredArgs?>
  }
}
