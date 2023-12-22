package Windows.Gaming.Input.ForceFeedback

import Windows.Foundation.IAsyncOperation
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IForceFeedbackMotor.ABI::class)
@Signature("{8d3d417c-a5ea-4516-8026-2b00f74ef6e5}")
@Guid("8d3d417ca5ea451680262b00f74ef6e5")
@WinRTInterface("8d3d417ca5ea451680262b00f74ef6e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IForceFeedbackMotor.ByReference::class)
public interface IForceFeedbackMotor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreEffectsPaused(): Boolean

  @InterfaceMethod(1)
  public fun get_MasterGain(): Double

  @InterfaceMethod(2)
  public fun put_MasterGain(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(4)
  public fun get_SupportedAxes(): ForceFeedbackEffectAxes?

  @InterfaceMethod(5)
  public fun LoadEffectAsync(effect: IForceFeedbackEffect?):
      IAsyncOperation<ForceFeedbackLoadEffectResult?>?

  @InterfaceMethod(6)
  public fun PauseAllEffects(): Unit

  @InterfaceMethod(7)
  public fun ResumeAllEffects(): Unit

  @InterfaceMethod(8)
  public fun StopAllEffects(): Unit

  @InterfaceMethod(9)
  public fun TryDisableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(10)
  public fun TryEnableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(11)
  public fun TryResetAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(12)
  public fun TryUnloadEffectAsync(effect: IForceFeedbackEffect?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IForceFeedbackMotor> {
    public override fun getValue() = ABI.makeIForceFeedbackMotor(pointer.getPointer(0))

    public fun setValue(value: IForceFeedbackMotor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IForceFeedbackMotor {
    public val __1684926838_Ptr: Pointer?

    public val _1684926838_VtblPtr: Pointer?
      get() = __1684926838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreEffectsPaused(): Boolean {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MasterGain(): Double {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_MasterGain(value: Double): Unit {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_SupportedAxes(): ForceFeedbackEffectAxes? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ForceFeedbackEffectAxes>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ForceFeedbackEffectAxes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LoadEffectAsync(effect: IForceFeedbackEffect?):
        IAsyncOperation<ForceFeedbackLoadEffectResult?>? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ForceFeedbackLoadEffectResult?>>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, marshalToNative(effect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ForceFeedbackLoadEffectResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun PauseAllEffects(): Unit {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun ResumeAllEffects(): Unit {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun StopAllEffects(): Unit {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun TryDisableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TryEnableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TryResetAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun TryUnloadEffectAsync(effect: IForceFeedbackEffect?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1684926838_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1684926838_Ptr, marshalToNative(effect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IForceFeedbackMotor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1684926838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IForceFeedbackMotor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d3d417ca5ea451680262b00f74ef6e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIForceFeedbackMotor(ptr: Pointer?): WithDefault = IForceFeedbackMotor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IForceFeedbackMotor {
      val address = segment.toRawLongValue()
      return makeIForceFeedbackMotor(Pointer(address))
    }

    public override fun toNative(obj: IForceFeedbackMotor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1684926838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IForceFeedbackMotor): Array<IForceFeedbackMotor?> =
        (elements as
        Array<IForceFeedbackMotor?>).castToImpl<IForceFeedbackMotor,IForceFeedbackMotor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IForceFeedbackMotor?> =
        arrayOfNulls<IForceFeedbackMotor_Impl>(size) as Array<IForceFeedbackMotor?>
  }
}
