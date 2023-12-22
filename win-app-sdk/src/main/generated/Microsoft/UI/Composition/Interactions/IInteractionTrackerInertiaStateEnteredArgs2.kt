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

@ABIMarker(IInteractionTrackerInertiaStateEnteredArgs2.ABI::class)
@Signature("{c42d7e8f-7199-57a9-8aec-8727552b13e6}")
@Guid("c42d7e8f719957a98aec8727552b13e6")
@WinRTInterface("c42d7e8f719957a98aec8727552b13e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaStateEnteredArgs2.ByReference::class)
public interface IInteractionTrackerInertiaStateEnteredArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsInertiaFromImpulse(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaStateEnteredArgs2> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaStateEnteredArgs2(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaStateEnteredArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaStateEnteredArgs2 {
    public val __603990427_Ptr: Pointer?

    public val _603990427_VtblPtr: Pointer?
      get() = __603990427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsInertiaFromImpulse(): Boolean {
      val fnPtr = _603990427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__603990427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerInertiaStateEnteredArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __603990427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaStateEnteredArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c42d7e8f719957a98aec8727552b13e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaStateEnteredArgs2(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaStateEnteredArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaStateEnteredArgs2 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaStateEnteredArgs2(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaStateEnteredArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__603990427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaStateEnteredArgs2):
        Array<IInteractionTrackerInertiaStateEnteredArgs2?> = (elements as
        Array<IInteractionTrackerInertiaStateEnteredArgs2?>).castToImpl<IInteractionTrackerInertiaStateEnteredArgs2,IInteractionTrackerInertiaStateEnteredArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaStateEnteredArgs2?> =
        arrayOfNulls<IInteractionTrackerInertiaStateEnteredArgs2_Impl>(size) as
        Array<IInteractionTrackerInertiaStateEnteredArgs2?>
  }
}
