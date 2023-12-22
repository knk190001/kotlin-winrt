package Windows.UI.Composition.Interactions

import Windows.Foundation.IReference
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractionTrackerInertiaStateEnteredArgs.ABI::class)
@Signature("{87108cf2-e7ff-4f7d-9ffd-d72f1e409b63}")
@Guid("87108cf2e7ff4f7d9ffdd72f1e409b63")
@WinRTInterface("87108cf2e7ff4f7d9ffdd72f1e409b63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractionTrackerInertiaStateEnteredArgs.ByReference::class)
public interface IInteractionTrackerInertiaStateEnteredArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ModifiedRestingPosition(): IReference<Vector3?>?

  @InterfaceMethod(1)
  public fun get_ModifiedRestingScale(): IReference<Float>?

  @InterfaceMethod(2)
  public fun get_NaturalRestingPosition(): Vector3?

  @InterfaceMethod(3)
  public fun get_NaturalRestingScale(): Float

  @InterfaceMethod(4)
  public fun get_PositionVelocityInPixelsPerSecond(): Vector3?

  @InterfaceMethod(5)
  public fun get_RequestId(): Int

  @InterfaceMethod(6)
  public fun get_ScaleVelocityInPercentPerSecond(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractionTrackerInertiaStateEnteredArgs> {
    public override fun getValue() =
        ABI.makeIInteractionTrackerInertiaStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: IInteractionTrackerInertiaStateEnteredArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractionTrackerInertiaStateEnteredArgs {
    public val __1854641474_Ptr: Pointer?

    public val _1854641474_VtblPtr: Pointer?
      get() = __1854641474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ModifiedRestingPosition(): IReference<Vector3?>? {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ModifiedRestingScale(): IReference<Float>? {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NaturalRestingPosition(): Vector3? {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NaturalRestingScale(): Float {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PositionVelocityInPixelsPerSecond(): Vector3? {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RequestId(): Int {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ScaleVelocityInPercentPerSecond(): Float {
      val fnPtr = _1854641474_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1854641474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractionTrackerInertiaStateEnteredArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1854641474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractionTrackerInertiaStateEnteredArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87108cf2e7ff4f7d9ffdd72f1e409b63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractionTrackerInertiaStateEnteredArgs(ptr: Pointer?): WithDefault =
        IInteractionTrackerInertiaStateEnteredArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInteractionTrackerInertiaStateEnteredArgs {
      val address = segment.toRawLongValue()
      return makeIInteractionTrackerInertiaStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: IInteractionTrackerInertiaStateEnteredArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1854641474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractionTrackerInertiaStateEnteredArgs):
        Array<IInteractionTrackerInertiaStateEnteredArgs?> = (elements as
        Array<IInteractionTrackerInertiaStateEnteredArgs?>).castToImpl<IInteractionTrackerInertiaStateEnteredArgs,IInteractionTrackerInertiaStateEnteredArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractionTrackerInertiaStateEnteredArgs?> =
        arrayOfNulls<IInteractionTrackerInertiaStateEnteredArgs_Impl>(size) as
        Array<IInteractionTrackerInertiaStateEnteredArgs?>
  }
}
