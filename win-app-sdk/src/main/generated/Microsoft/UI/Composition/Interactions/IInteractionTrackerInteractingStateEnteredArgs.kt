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

@ABIMarker(IInteractionTrackerInteractingStateEnteredArgs.ABI::class)
@Signature("{70d29b84-0931-5f17-a8a1-82f8f8782532}")
@Guid("70d29b8409315f17a8a182f8f8782532")
@WinRTInterface("70d29b8409315f17a8a182f8f8782532")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInteractingStateEnteredArgs.ByReference::class)
public interface IInteractionTrackerInteractingStateEnteredArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInteractingStateEnteredArgs> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInteractingStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInteractingStateEnteredArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInteractingStateEnteredArgs {
    public val __766250655_Ptr: Pointer?

    public val _766250655_VtblPtr: Pointer?
      get() = __766250655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): Int {
      val fnPtr = _766250655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__766250655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerInteractingStateEnteredArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __766250655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInteractingStateEnteredArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70d29b8409315f17a8a182f8f8782532")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInteractingStateEnteredArgs(ptr: Pointer?): WithDefault =
        IInteractionTrackerInteractingStateEnteredArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInteractingStateEnteredArgs {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInteractingStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInteractingStateEnteredArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__766250655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInteractingStateEnteredArgs):
        Array<IInteractionTrackerInteractingStateEnteredArgs?> = (elements as
        Array<IInteractionTrackerInteractingStateEnteredArgs?>).castToImpl<IInteractionTrackerInteractingStateEnteredArgs,IInteractionTrackerInteractingStateEnteredArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInteractingStateEnteredArgs?> =
        arrayOfNulls<IInteractionTrackerInteractingStateEnteredArgs_Impl>(size) as
        Array<IInteractionTrackerInteractingStateEnteredArgs?>
  }
}
