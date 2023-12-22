package Windows.UI.Composition.Interactions

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector3
import Windows.UI.Composition.CompositionAnimation
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTracker.ABI::class)
@Signature("{2a8e8cb1-1000-4416-8363-cc27fb877308}")
@Guid("2a8e8cb1100044168363cc27fb877308")
@WinRTInterface("2a8e8cb1100044168363cc27fb877308")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTracker.ByReference::class)
public interface IInteractionTracker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSources(): CompositionInteractionSourceCollection?

  @InterfaceMethod(1)
  public fun get_IsPositionRoundingSuggested(): Boolean

  @InterfaceMethod(2)
  public fun get_MaxPosition(): Vector3?

  @InterfaceMethod(3)
  public fun put_MaxPosition(value: Vector3?): Unit

  @InterfaceMethod(4)
  public fun get_MaxScale(): Float

  @InterfaceMethod(5)
  public fun put_MaxScale(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_MinPosition(): Vector3?

  @InterfaceMethod(7)
  public fun put_MinPosition(value: Vector3?): Unit

  @InterfaceMethod(8)
  public fun get_MinScale(): Float

  @InterfaceMethod(9)
  public fun put_MinScale(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_NaturalRestingPosition(): Vector3?

  @InterfaceMethod(11)
  public fun get_NaturalRestingScale(): Float

  @InterfaceMethod(12)
  public fun get_Owner(): IInteractionTrackerOwner?

  @InterfaceMethod(13)
  public fun get_Position(): Vector3?

  @InterfaceMethod(14)
  public fun get_PositionInertiaDecayRate(): IReference<Vector3?>?

  @InterfaceMethod(15)
  public fun put_PositionInertiaDecayRate(value: IReference<Vector3?>?): Unit

  @InterfaceMethod(16)
  public fun get_PositionVelocityInPixelsPerSecond(): Vector3?

  @InterfaceMethod(17)
  public fun get_Scale(): Float

  @InterfaceMethod(18)
  public fun get_ScaleInertiaDecayRate(): IReference<Float>?

  @InterfaceMethod(19)
  public fun put_ScaleInertiaDecayRate(value: IReference<Float>?): Unit

  @InterfaceMethod(20)
  public fun get_ScaleVelocityInPercentPerSecond(): Float

  @InterfaceMethod(21)
  public fun AdjustPositionXIfGreaterThanThreshold(adjustment: Float, positionThreshold: Float):
      Unit

  @InterfaceMethod(22)
  public fun AdjustPositionYIfGreaterThanThreshold(adjustment: Float, positionThreshold: Float):
      Unit

  @InterfaceMethod(23)
  public
      fun ConfigurePositionXInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
      Unit

  @InterfaceMethod(24)
  public
      fun ConfigurePositionYInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
      Unit

  @InterfaceMethod(25)
  public
      fun ConfigureScaleInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
      Unit

  @InterfaceMethod(26)
  public fun TryUpdatePosition(value: Vector3?): Int

  @InterfaceMethod(27)
  public fun TryUpdatePositionBy(amount: Vector3?): Int

  @InterfaceMethod(28)
  public fun TryUpdatePositionWithAnimation(animation: CompositionAnimation?): Int

  @InterfaceMethod(29)
  public fun TryUpdatePositionWithAdditionalVelocity(velocityInPixelsPerSecond: Vector3?): Int

  @InterfaceMethod(30)
  public fun TryUpdateScale(value: Float, centerPoint: Vector3?): Int

  @InterfaceMethod(31)
  public fun TryUpdateScaleWithAnimation(animation: CompositionAnimation?, centerPoint: Vector3?):
      Int

  @InterfaceMethod(32)
  public fun TryUpdateScaleWithAdditionalVelocity(velocityInPercentPerSecond: Float,
      centerPoint: Vector3?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTracker> {
    public override fun getValue() = ABI.makeIInteractionTracker(pointer.getPointer(0))

    public fun setValue(value: IInteractionTracker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTracker {
    public val __1388255045_Ptr: Pointer?

    public val _1388255045_VtblPtr: Pointer?
      get() = __1388255045_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSources(): CompositionInteractionSourceCollection? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionInteractionSourceCollection>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionInteractionSourceCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsPositionRoundingSuggested(): Boolean {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxPosition(): Vector3? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxPosition(value: Vector3?): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxScale(): Float {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxScale(value: Float): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MinPosition(): Vector3? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_MinPosition(value: Vector3?): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MinScale(): Float {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MinScale(value: Float): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_NaturalRestingPosition(): Vector3? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_NaturalRestingScale(): Float {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_Owner(): IInteractionTrackerOwner? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInteractionTrackerOwner>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInteractionTrackerOwner>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PositionInertiaDecayRate(): IReference<Vector3?>? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PositionInertiaDecayRate(value: IReference<Vector3?>?): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PositionVelocityInPixelsPerSecond(): Vector3? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_Scale(): Float {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_ScaleInertiaDecayRate(): IReference<Float>? {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_ScaleInertiaDecayRate(value: IReference<Float>?): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ScaleVelocityInPercentPerSecond(): Float {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun AdjustPositionXIfGreaterThanThreshold(adjustment: Float,
        positionThreshold: Float): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, adjustment, positionThreshold,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun AdjustPositionYIfGreaterThanThreshold(adjustment: Float,
        positionThreshold: Float): Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, adjustment, positionThreshold,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override
        fun ConfigurePositionXInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
        Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(modifiers),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override
        fun ConfigurePositionYInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
        Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(modifiers),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override
        fun ConfigureScaleInertiaModifiers(modifiers: IIterable<InteractionTrackerInertiaModifier?>?):
        Unit {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(modifiers),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun TryUpdatePosition(value: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun TryUpdatePositionBy(amount: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(amount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun TryUpdatePositionWithAnimation(animation: CompositionAnimation?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(animation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override
        fun TryUpdatePositionWithAdditionalVelocity(velocityInPixelsPerSecond: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(velocityInPixelsPerSecond),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun TryUpdateScale(value: Float, centerPoint: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, value, marshalToNative(centerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun TryUpdateScaleWithAnimation(animation: CompositionAnimation?,
        centerPoint: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, marshalToNative(animation),
          marshalToNative(centerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun TryUpdateScaleWithAdditionalVelocity(velocityInPercentPerSecond: Float,
        centerPoint: Vector3?): Int {
      val fnPtr = _1388255045_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388255045_Ptr, velocityInPercentPerSecond,
          marshalToNative(centerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTracker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1388255045_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTracker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a8e8cb1100044168363cc27fb877308")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTracker(ptr: Pointer?): WithDefault = IInteractionTracker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractionTracker {
      val address = segment.toRawLongValue()
      return makeIInteractionTracker(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1388255045_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTracker): Array<IInteractionTracker?> =
        (elements as
        Array<IInteractionTracker?>).castToImpl<IInteractionTracker,IInteractionTracker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTracker?> =
        arrayOfNulls<IInteractionTracker_Impl>(size) as Array<IInteractionTracker?>
  }
}
