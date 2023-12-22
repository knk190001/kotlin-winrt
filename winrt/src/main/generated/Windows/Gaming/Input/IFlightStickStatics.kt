package Windows.Gaming.Input

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IFlightStickStatics.ABI::class)
@Signature("{5514924a-fecc-435e-83dc-5cec8a18a520}")
@Guid("5514924afecc435e83dc5cec8a18a520")
@WinRTInterface("5514924afecc435e83dc5cec8a18a520")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlightStickStatics.ByReference::class)
public interface IFlightStickStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_FlightStickAdded(value: EventHandler<FlightStick?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_FlightStickAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_FlightStickRemoved(value: EventHandler<FlightStick?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_FlightStickRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_FlightSticks(): IVectorView<FlightStick?>?

  @InterfaceMethod(5)
  public fun FromGameController(gameController: IGameController?): FlightStick?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlightStickStatics> {
    public override fun getValue() = ABI.makeIFlightStickStatics(pointer.getPointer(0))

    public fun setValue(value: IFlightStickStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlightStickStatics {
    public val __1135305960_Ptr: Pointer?

    public val _1135305960_VtblPtr: Pointer?
      get() = __1135305960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_FlightStickAdded(value: EventHandler<FlightStick?>?):
        EventRegistrationToken? {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_FlightStickAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_FlightStickRemoved(value: EventHandler<FlightStick?>?):
        EventRegistrationToken? {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_FlightStickRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FlightSticks(): IVectorView<FlightStick?>? {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<FlightStick?>>()
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<FlightStick?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FromGameController(gameController: IGameController?): FlightStick? {
      val fnPtr = _1135305960_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlightStick>()
      val hr = fn.invokeHR(arrayOf(__1135305960_Ptr, marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlightStick>(result.getValue())
      return resultValue
    }
  }

  public class IFlightStickStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1135305960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlightStickStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5514924afecc435e83dc5cec8a18a520")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlightStickStatics(ptr: Pointer?): WithDefault = IFlightStickStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlightStickStatics {
      val address = segment.toRawLongValue()
      return makeIFlightStickStatics(Pointer(address))
    }

    public override fun toNative(obj: IFlightStickStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1135305960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlightStickStatics): Array<IFlightStickStatics?> =
        (elements as
        Array<IFlightStickStatics?>).castToImpl<IFlightStickStatics,IFlightStickStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlightStickStatics?> =
        arrayOfNulls<IFlightStickStatics_Impl>(size) as Array<IFlightStickStatics?>
  }
}
