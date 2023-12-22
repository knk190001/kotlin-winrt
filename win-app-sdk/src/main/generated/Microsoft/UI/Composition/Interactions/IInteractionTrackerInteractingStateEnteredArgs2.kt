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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTrackerInteractingStateEnteredArgs2.ABI::class)
@Signature("{2f1ff38d-2f51-5ceb-8d09-bda1519f9342}")
@Guid("2f1ff38d2f515ceb8d09bda1519f9342")
@WinRTInterface("2f1ff38d2f515ceb8d09bda1519f9342")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInteractingStateEnteredArgs2.ByReference::class)
public interface IInteractionTrackerInteractingStateEnteredArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFromBinding(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInteractingStateEnteredArgs2> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInteractingStateEnteredArgs2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInteractingStateEnteredArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInteractingStateEnteredArgs2 {
    public val __2016033421_Ptr: Pointer?

    public val _2016033421_VtblPtr: Pointer?
      get() = __2016033421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFromBinding(): Boolean {
      val fnPtr = _2016033421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2016033421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerInteractingStateEnteredArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2016033421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInteractingStateEnteredArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f1ff38d2f515ceb8d09bda1519f9342")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInteractingStateEnteredArgs2(ptr: Pointer?): WithDefault =
        IInteractionTrackerInteractingStateEnteredArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInteractingStateEnteredArgs2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInteractingStateEnteredArgs2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInteractingStateEnteredArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2016033421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInteractingStateEnteredArgs2):
        Array<IInteractionTrackerInteractingStateEnteredArgs2?> = (elements as
        Array<IInteractionTrackerInteractingStateEnteredArgs2?>).castToImpl<IInteractionTrackerInteractingStateEnteredArgs2,IInteractionTrackerInteractingStateEnteredArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInteractingStateEnteredArgs2?>
        = arrayOfNulls<IInteractionTrackerInteractingStateEnteredArgs2_Impl>(size) as
        Array<IInteractionTrackerInteractingStateEnteredArgs2?>
  }
}
