package Windows.Gaming.Input

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.System.User
import Windows.System.UserChangedEventArgs
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

@ABIMarker(IGameController.ABI::class)
@Signature("{1baf6522-5f64-42c5-8267-b9fe2215bfbd}")
@Guid("1baf65225f6442c58267b9fe2215bfbd")
@WinRTInterface("1baf65225f6442c58267b9fe2215bfbd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameController.ByReference::class)
public interface IGameController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_HeadsetConnected(value: TypedEventHandler<IGameController?, Headset?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_HeadsetConnected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_HeadsetDisconnected(value: TypedEventHandler<IGameController?, Headset?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_HeadsetDisconnected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_UserChanged(value: TypedEventHandler<IGameController?, UserChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_UserChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_Headset(): Headset?

  @InterfaceMethod(7)
  public fun get_IsWireless(): Boolean

  @InterfaceMethod(8)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameController> {
    public override fun getValue() = ABI.makeIGameController(pointer.getPointer(0))

    public fun setValue(value: IGameController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameController {
    public val __925471711_Ptr: Pointer?

    public val _925471711_VtblPtr: Pointer?
      get() = __925471711_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_HeadsetConnected(value: TypedEventHandler<IGameController?, Headset?>?):
        EventRegistrationToken? {
      val fnPtr = _925471711_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_HeadsetConnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _925471711_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_HeadsetDisconnected(value: TypedEventHandler<IGameController?,
        Headset?>?): EventRegistrationToken? {
      val fnPtr = _925471711_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_HeadsetDisconnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _925471711_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_UserChanged(value: TypedEventHandler<IGameController?,
        UserChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _925471711_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_UserChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _925471711_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Headset(): Headset? {
      val fnPtr = _925471711_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Headset>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Headset>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsWireless(): Boolean {
      val fnPtr = _925471711_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_User(): User? {
      val fnPtr = _925471711_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__925471711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IGameController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925471711_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1baf65225f6442c58267b9fe2215bfbd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameController(ptr: Pointer?): WithDefault = IGameController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameController {
      val address = segment.toRawLongValue()
      return makeIGameController(Pointer(address))
    }

    public override fun toNative(obj: IGameController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925471711_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameController): Array<IGameController?> = (elements as
        Array<IGameController?>).castToImpl<IGameController,IGameController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameController?> =
        arrayOfNulls<IGameController_Impl>(size) as Array<IGameController?>
  }
}
