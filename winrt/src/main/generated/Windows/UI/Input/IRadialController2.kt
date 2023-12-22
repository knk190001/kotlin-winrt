package Windows.UI.Input

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IRadialController2.ABI::class)
@Signature("{3d577eff-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577eff4cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577eff4cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialController2.ByReference::class)
public interface IRadialController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ButtonPressed(handler: TypedEventHandler<RadialController?,
      RadialControllerButtonPressedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ButtonPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ButtonHolding(handler: TypedEventHandler<RadialController?,
      RadialControllerButtonHoldingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ButtonHolding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ButtonReleased(handler: TypedEventHandler<RadialController?,
      RadialControllerButtonReleasedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ButtonReleased(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialController2> {
    public override fun getValue() = ABI.makeIRadialController2(pointer.getPointer(0))

    public fun setValue(value: IRadialController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialController2 {
    public val __535429783_Ptr: Pointer?

    public val _535429783_VtblPtr: Pointer?
      get() = __535429783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ButtonPressed(handler: TypedEventHandler<RadialController?,
        RadialControllerButtonPressedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _535429783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ButtonPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _535429783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ButtonHolding(handler: TypedEventHandler<RadialController?,
        RadialControllerButtonHoldingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _535429783_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ButtonHolding(token: EventRegistrationToken?): Unit {
      val fnPtr = _535429783_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ButtonReleased(handler: TypedEventHandler<RadialController?,
        RadialControllerButtonReleasedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _535429783_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ButtonReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _535429783_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535429783_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRadialController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535429783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577eff4cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialController2(ptr: Pointer?): WithDefault = IRadialController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialController2 {
      val address = segment.toRawLongValue()
      return makeIRadialController2(Pointer(address))
    }

    public override fun toNative(obj: IRadialController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535429783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialController2): Array<IRadialController2?> =
        (elements as
        Array<IRadialController2?>).castToImpl<IRadialController2,IRadialController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialController2?> =
        arrayOfNulls<IRadialController2_Impl>(size) as Array<IRadialController2?>
  }
}
