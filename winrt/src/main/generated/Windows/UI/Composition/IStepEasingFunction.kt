package Windows.UI.Composition

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

@ABIMarker(IStepEasingFunction.ABI::class)
@Signature("{d0caa74b-560c-4a0b-a5f6-206ca8c3ecd6}")
@Guid("d0caa74b560c4a0ba5f6206ca8c3ecd6")
@WinRTInterface("d0caa74b560c4a0ba5f6206ca8c3ecd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStepEasingFunction.ByReference::class)
public interface IStepEasingFunction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FinalStep(): Int

  @InterfaceMethod(1)
  public fun put_FinalStep(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_InitialStep(): Int

  @InterfaceMethod(3)
  public fun put_InitialStep(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_IsFinalStepSingleFrame(): Boolean

  @InterfaceMethod(5)
  public fun put_IsFinalStepSingleFrame(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsInitialStepSingleFrame(): Boolean

  @InterfaceMethod(7)
  public fun put_IsInitialStepSingleFrame(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_StepCount(): Int

  @InterfaceMethod(9)
  public fun put_StepCount(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStepEasingFunction> {
    public override fun getValue() = ABI.makeIStepEasingFunction(pointer.getPointer(0))

    public fun setValue(value: IStepEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStepEasingFunction {
    public val __127160381_Ptr: Pointer?

    public val _127160381_VtblPtr: Pointer?
      get() = __127160381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FinalStep(): Int {
      val fnPtr = _127160381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FinalStep(value: Int): Unit {
      val fnPtr = _127160381_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialStep(): Int {
      val fnPtr = _127160381_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_InitialStep(value: Int): Unit {
      val fnPtr = _127160381_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsFinalStepSingleFrame(): Boolean {
      val fnPtr = _127160381_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsFinalStepSingleFrame(value: Boolean): Unit {
      val fnPtr = _127160381_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsInitialStepSingleFrame(): Boolean {
      val fnPtr = _127160381_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsInitialStepSingleFrame(value: Boolean): Unit {
      val fnPtr = _127160381_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_StepCount(): Int {
      val fnPtr = _127160381_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_StepCount(value: Int): Unit {
      val fnPtr = _127160381_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__127160381_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStepEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __127160381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStepEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0caa74b560c4a0ba5f6206ca8c3ecd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStepEasingFunction(ptr: Pointer?): WithDefault = IStepEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStepEasingFunction {
      val address = segment.toRawLongValue()
      return makeIStepEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: IStepEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__127160381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStepEasingFunction): Array<IStepEasingFunction?> =
        (elements as
        Array<IStepEasingFunction?>).castToImpl<IStepEasingFunction,IStepEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStepEasingFunction?> =
        arrayOfNulls<IStepEasingFunction_Impl>(size) as Array<IStepEasingFunction?>
  }
}
