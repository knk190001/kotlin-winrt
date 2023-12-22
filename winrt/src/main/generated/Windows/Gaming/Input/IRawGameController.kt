package Windows.Gaming.Input

import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IRawGameController.ABI::class)
@Signature("{7cad6d91-a7e1-4f71-9a78-33e9c5dfea62}")
@Guid("7cad6d91a7e14f719a7833e9c5dfea62")
@WinRTInterface("7cad6d91a7e14f719a7833e9c5dfea62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRawGameController.ByReference::class)
public interface IRawGameController : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun get_AxisCount(): Int

  @InterfaceMethod(1)
  public fun get_ButtonCount(): Int

  @InterfaceMethod(2)
  public fun get_ForceFeedbackMotors(): IVectorView<ForceFeedbackMotor?>?

  @InterfaceMethod(3)
  public fun get_HardwareProductId(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_HardwareVendorId(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_SwitchCount(): Int

  @InterfaceMethod(6)
  public fun GetButtonLabel(buttonIndex: Int): GameControllerButtonLabel?

  @InterfaceMethod(7)
  public fun GetCurrentReading(
    buttonArray: Array<Boolean>,
    switchArray: Array<GameControllerSwitchPosition?>,
    axisArray: Array<Double>
  ): WinDef.ULONG

  @InterfaceMethod(8)
  public fun GetSwitchKind(switchIndex: Int): GameControllerSwitchKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRawGameController> {
    public override fun getValue() = ABI.makeIRawGameController(pointer.getPointer(0))

    public fun setValue(value: IRawGameController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRawGameController, IGameController.WithDefault {
    public val __1516440669_Ptr: Pointer?

    public val _1516440669_VtblPtr: Pointer?
      get() = __1516440669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AxisCount(): Int {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ButtonCount(): Int {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ForceFeedbackMotors(): IVectorView<ForceFeedbackMotor?>? {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ForceFeedbackMotor?>>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ForceFeedbackMotor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HardwareProductId(): WinDef.USHORT {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_HardwareVendorId(): WinDef.USHORT {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SwitchCount(): Int {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetButtonLabel(buttonIndex: Int): GameControllerButtonLabel? {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr, buttonIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetCurrentReading(
      buttonArray: Array<Boolean>,
      switchArray: Array<GameControllerSwitchPosition?>,
      axisArray: Array<Double>
    ): WinDef.ULONG {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr, buttonArray.size,marshalToNative(buttonArray),
          switchArray.size,marshalToNative(switchArray), axisArray.size,marshalToNative(axisArray),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun GetSwitchKind(switchIndex: Int): GameControllerSwitchKind? {
      val fnPtr = _1516440669_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerSwitchKind>()
      val hr = fn.invokeHR(arrayOf(__1516440669_Ptr, switchIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerSwitchKind>(result.getValue())
      return resultValue
    }
  }

  public class IRawGameController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1516440669_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1516440669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRawGameController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cad6d91a7e14f719a7833e9c5dfea62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRawGameController(ptr: Pointer?): WithDefault = IRawGameController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRawGameController {
      val address = segment.toRawLongValue()
      return makeIRawGameController(Pointer(address))
    }

    public override fun toNative(obj: IRawGameController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516440669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRawGameController): Array<IRawGameController?> =
        (elements as
        Array<IRawGameController?>).castToImpl<IRawGameController,IRawGameController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRawGameController?> =
        arrayOfNulls<IRawGameController_Impl>(size) as Array<IRawGameController?>
  }
}
