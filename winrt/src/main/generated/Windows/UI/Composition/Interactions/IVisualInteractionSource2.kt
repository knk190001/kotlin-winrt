package Windows.UI.Composition.Interactions

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IVisualInteractionSource2.ABI::class)
@Signature("{aa914893-a73c-414d-80d0-249bad2fbd93}")
@Guid("aa914893a73c414d80d0249bad2fbd93")
@WinRTInterface("aa914893a73c414d80d0249bad2fbd93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSource2.ByReference::class)
public interface IVisualInteractionSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeltaPosition(): Vector3?

  @InterfaceMethod(1)
  public fun get_DeltaScale(): Float

  @InterfaceMethod(2)
  public fun get_Position(): Vector3?

  @InterfaceMethod(3)
  public fun get_PositionVelocity(): Vector3?

  @InterfaceMethod(4)
  public fun get_Scale(): Float

  @InterfaceMethod(5)
  public fun get_ScaleVelocity(): Float

  @InterfaceMethod(6)
  public
      fun ConfigureCenterPointXModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  @InterfaceMethod(7)
  public
      fun ConfigureCenterPointYModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  @InterfaceMethod(8)
  public
      fun ConfigureDeltaPositionXModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  @InterfaceMethod(9)
  public
      fun ConfigureDeltaPositionYModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  @InterfaceMethod(10)
  public
      fun ConfigureDeltaScaleModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSource2> {
    public override fun getValue() = ABI.makeIVisualInteractionSource2(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSource2 {
    public val __1219357542_Ptr: Pointer?

    public val _1219357542_VtblPtr: Pointer?
      get() = __1219357542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeltaPosition(): Vector3? {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeltaScale(): Float {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Vector3? {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PositionVelocity(): Vector3? {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Scale(): Float {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ScaleVelocity(): Float {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override
        fun ConfigureCenterPointXModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override
        fun ConfigureCenterPointYModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun ConfigureDeltaPositionXModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun ConfigureDeltaPositionYModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun ConfigureDeltaScaleModifiers(conditionalValues: IIterable<CompositionConditionalValue?>?):
        Unit {
      val fnPtr = _1219357542_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219357542_Ptr, marshalToNative(conditionalValues),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualInteractionSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1219357542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa914893a73c414d80d0249bad2fbd93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSource2(ptr: Pointer?): WithDefault =
        IVisualInteractionSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSource2 {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSource2(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1219357542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSource2):
        Array<IVisualInteractionSource2?> = (elements as
        Array<IVisualInteractionSource2?>).castToImpl<IVisualInteractionSource2,IVisualInteractionSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSource2?> =
        arrayOfNulls<IVisualInteractionSource2_Impl>(size) as Array<IVisualInteractionSource2?>
  }
}
