package Windows.UI.Composition.Interactions

import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IInteractionTracker5.ABI::class)
@Signature("{d3ef5da2-a254-40e4-88d5-44e4e16b5809}")
@Guid("d3ef5da2a25440e488d544e4e16b5809")
@WinRTInterface("d3ef5da2a25440e488d544e4e16b5809")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTracker5.ByReference::class)
public interface IInteractionTracker5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryUpdatePosition(
    value: Vector3?,
    option: InteractionTrackerClampingOption?,
    posUpdateOption: InteractionTrackerPositionUpdateOption?
  ): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTracker5> {
    public override fun getValue() = ABI.makeIInteractionTracker5(pointer.getPointer(0))

    public fun setValue(value: IInteractionTracker5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTracker5 {
    public val __86233382_Ptr: Pointer?

    public val _86233382_VtblPtr: Pointer?
      get() = __86233382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryUpdatePosition(
      value: Vector3?,
      option: InteractionTrackerClampingOption?,
      posUpdateOption: InteractionTrackerPositionUpdateOption?
    ): Int {
      val fnPtr = _86233382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__86233382_Ptr, marshalToNative(value), marshalToNative(option),
          marshalToNative(posUpdateOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTracker5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __86233382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTracker5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3ef5da2a25440e488d544e4e16b5809")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTracker5(ptr: Pointer?): WithDefault = IInteractionTracker5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTracker5 {
      val address = segment.toRawLongValue()
      return makeIInteractionTracker5(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTracker5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__86233382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTracker5): Array<IInteractionTracker5?> =
        (elements as
        Array<IInteractionTracker5?>).castToImpl<IInteractionTracker5,IInteractionTracker5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTracker5?> =
        arrayOfNulls<IInteractionTracker5_Impl>(size) as Array<IInteractionTracker5?>
  }
}
