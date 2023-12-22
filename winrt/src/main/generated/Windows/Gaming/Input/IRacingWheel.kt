package Windows.Gaming.Input

import Windows.Gaming.Input.ForceFeedback.ForceFeedbackMotor
import Windows.Gaming.Input.IGameController.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IRacingWheel.ABI::class)
@Signature("{f546656f-e106-4c82-a90f-554012904b85}")
@Guid("f546656fe1064c82a90f554012904b85")
@WinRTInterface("f546656fe1064c82a90f554012904b85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRacingWheel.ByReference::class)
public interface IRacingWheel : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun get_HasClutch(): Boolean

  @InterfaceMethod(1)
  public fun get_HasHandbrake(): Boolean

  @InterfaceMethod(2)
  public fun get_HasPatternShifter(): Boolean

  @InterfaceMethod(3)
  public fun get_MaxPatternShifterGear(): Int

  @InterfaceMethod(4)
  public fun get_MaxWheelAngle(): Double

  @InterfaceMethod(5)
  public fun get_WheelMotor(): ForceFeedbackMotor?

  @InterfaceMethod(6)
  public fun GetButtonLabel(button: RacingWheelButtons?): GameControllerButtonLabel?

  @InterfaceMethod(7)
  public fun GetCurrentReading(): RacingWheelReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRacingWheel> {
    public override fun getValue() = ABI.makeIRacingWheel(pointer.getPointer(0))

    public fun setValue(value: IRacingWheel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRacingWheel, IGameController.WithDefault {
    public val __1496197786_Ptr: Pointer?

    public val _1496197786_VtblPtr: Pointer?
      get() = __1496197786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasClutch(): Boolean {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HasHandbrake(): Boolean {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HasPatternShifter(): Boolean {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxPatternShifterGear(): Int {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxWheelAngle(): Double {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_WheelMotor(): ForceFeedbackMotor? {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ForceFeedbackMotor>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ForceFeedbackMotor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetButtonLabel(button: RacingWheelButtons?): GameControllerButtonLabel? {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetCurrentReading(): RacingWheelReading? {
      val fnPtr = _1496197786_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RacingWheelReading>()
      val hr = fn.invokeHR(arrayOf(__1496197786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RacingWheelReading>(result.getValue())
      return resultValue
    }
  }

  public class IRacingWheel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1496197786_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1496197786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRacingWheel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f546656fe1064c82a90f554012904b85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRacingWheel(ptr: Pointer?): WithDefault = IRacingWheel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRacingWheel {
      val address = segment.toRawLongValue()
      return makeIRacingWheel(Pointer(address))
    }

    public override fun toNative(obj: IRacingWheel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496197786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRacingWheel): Array<IRacingWheel?> = (elements as
        Array<IRacingWheel?>).castToImpl<IRacingWheel,IRacingWheel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRacingWheel?> =
        arrayOfNulls<IRacingWheel_Impl>(size) as Array<IRacingWheel?>
  }
}
