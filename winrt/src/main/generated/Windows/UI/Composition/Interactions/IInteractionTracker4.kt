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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTracker4.ABI::class)
@Signature("{ebd222bc-04af-4ac7-847d-06ea36e80a16}")
@Guid("ebd222bc04af4ac7847d06ea36e80a16")
@WinRTInterface("ebd222bc04af4ac7847d06ea36e80a16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTracker4.ByReference::class)
public interface IInteractionTracker4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryUpdatePosition(value: Vector3?, option: InteractionTrackerClampingOption?): Int

  @InterfaceMethod(1)
  public fun TryUpdatePositionBy(amount: Vector3?, option: InteractionTrackerClampingOption?): Int

  @InterfaceMethod(2)
  public fun get_IsInertiaFromImpulse(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTracker4> {
    public override fun getValue() = ABI.makeIInteractionTracker4(pointer.getPointer(0))

    public fun setValue(value: IInteractionTracker4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTracker4 {
    public val __86233383_Ptr: Pointer?

    public val _86233383_VtblPtr: Pointer?
      get() = __86233383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryUpdatePosition(value: Vector3?,
        option: InteractionTrackerClampingOption?): Int {
      val fnPtr = _86233383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__86233383_Ptr, marshalToNative(value), marshalToNative(option),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryUpdatePositionBy(amount: Vector3?,
        option: InteractionTrackerClampingOption?): Int {
      val fnPtr = _86233383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__86233383_Ptr, marshalToNative(amount), marshalToNative(option),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsInertiaFromImpulse(): Boolean {
      val fnPtr = _86233383_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__86233383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTracker4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __86233383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTracker4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebd222bc04af4ac7847d06ea36e80a16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTracker4(ptr: Pointer?): WithDefault = IInteractionTracker4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTracker4 {
      val address = segment.toRawLongValue()
      return makeIInteractionTracker4(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTracker4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__86233383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTracker4): Array<IInteractionTracker4?> =
        (elements as
        Array<IInteractionTracker4?>).castToImpl<IInteractionTracker4,IInteractionTracker4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTracker4?> =
        arrayOfNulls<IInteractionTracker4_Impl>(size) as Array<IInteractionTracker4?>
  }
}
