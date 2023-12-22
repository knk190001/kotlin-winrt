package Windows.Gaming.Input

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlightStick.ABI::class)
@Signature("{b4a2c01c-b83b-4459-a1a9-97b03c33da7c}")
@Guid("b4a2c01cb83b4459a1a997b03c33da7c")
@WinRTInterface("b4a2c01cb83b4459a1a997b03c33da7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlightStick.ByReference::class)
public interface IFlightStick : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun get_HatSwitchKind(): GameControllerSwitchKind?

  @InterfaceMethod(1)
  public fun GetButtonLabel(button: FlightStickButtons?): GameControllerButtonLabel?

  @InterfaceMethod(2)
  public fun GetCurrentReading(): FlightStickReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlightStick> {
    public override fun getValue() = ABI.makeIFlightStick(pointer.getPointer(0))

    public fun setValue(value: IFlightStick_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlightStick, IGameController.WithDefault {
    public val __1611442157_Ptr: Pointer?

    public val _1611442157_VtblPtr: Pointer?
      get() = __1611442157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HatSwitchKind(): GameControllerSwitchKind? {
      val fnPtr = _1611442157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerSwitchKind>()
      val hr = fn.invokeHR(arrayOf(__1611442157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerSwitchKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetButtonLabel(button: FlightStickButtons?): GameControllerButtonLabel? {
      val fnPtr = _1611442157_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1611442157_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCurrentReading(): FlightStickReading? {
      val fnPtr = _1611442157_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlightStickReading>()
      val hr = fn.invokeHR(arrayOf(__1611442157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlightStickReading>(result.getValue())
      return resultValue
    }
  }

  public class IFlightStick_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1611442157_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1611442157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlightStick, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4a2c01cb83b4459a1a997b03c33da7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlightStick(ptr: Pointer?): WithDefault = IFlightStick_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlightStick {
      val address = segment.toRawLongValue()
      return makeIFlightStick(Pointer(address))
    }

    public override fun toNative(obj: IFlightStick): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1611442157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlightStick): Array<IFlightStick?> = (elements as
        Array<IFlightStick?>).castToImpl<IFlightStick,IFlightStick_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlightStick?> =
        arrayOfNulls<IFlightStick_Impl>(size) as Array<IFlightStick?>
  }
}
