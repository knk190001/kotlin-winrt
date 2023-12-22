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

@ABIMarker(IInteractionTrackerInertiaStateEnteredArgs3.ABI::class)
@Signature("{ce726ca0-1c04-531b-9951-4aec996952e4}")
@Guid("ce726ca01c04531b99514aec996952e4")
@WinRTInterface("ce726ca01c04531b99514aec996952e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaStateEnteredArgs3.ByReference::class)
public interface IInteractionTrackerInertiaStateEnteredArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFromBinding(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaStateEnteredArgs3> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaStateEnteredArgs3(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaStateEnteredArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaStateEnteredArgs3 {
    public val __603990426_Ptr: Pointer?

    public val _603990426_VtblPtr: Pointer?
      get() = __603990426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFromBinding(): Boolean {
      val fnPtr = _603990426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__603990426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerInertiaStateEnteredArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __603990426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaStateEnteredArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce726ca01c04531b99514aec996952e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaStateEnteredArgs3(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaStateEnteredArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaStateEnteredArgs3 {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaStateEnteredArgs3(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaStateEnteredArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__603990426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaStateEnteredArgs3):
        Array<IInteractionTrackerInertiaStateEnteredArgs3?> = (elements as
        Array<IInteractionTrackerInertiaStateEnteredArgs3?>).castToImpl<IInteractionTrackerInertiaStateEnteredArgs3,IInteractionTrackerInertiaStateEnteredArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaStateEnteredArgs3?> =
        arrayOfNulls<IInteractionTrackerInertiaStateEnteredArgs3_Impl>(size) as
        Array<IInteractionTrackerInertiaStateEnteredArgs3?>
  }
}
