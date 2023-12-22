package Microsoft.UI.Input

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.System.VirtualKey
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

@ABIMarker(IInputKeyboardSource2.ABI::class)
@Signature("{79d1c9b6-b3c9-5ec2-8a5b-707088787f78}")
@Guid("79d1c9b6b3c95ec28a5b707088787f78")
@WinRTInterface("79d1c9b6b3c95ec28a5b707088787f78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputKeyboardSource2.ByReference::class)
public interface IInputKeyboardSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentKeyState(virtualKey: VirtualKey?): VirtualKeyStates?

  @InterfaceMethod(1)
  public fun GetKeyState(virtualKey: VirtualKey?): VirtualKeyStates?

  @InterfaceMethod(2)
  public fun add_CharacterReceived(handler: TypedEventHandler<InputKeyboardSource?,
      CharacterReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CharacterReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_ContextMenuKey(handler: TypedEventHandler<InputKeyboardSource?,
      ContextMenuKeyEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ContextMenuKey(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_KeyDown(handler: TypedEventHandler<InputKeyboardSource?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_KeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_KeyUp(handler: TypedEventHandler<InputKeyboardSource?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_KeyUp(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_SystemKeyDown(handler: TypedEventHandler<InputKeyboardSource?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SystemKeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_SystemKeyUp(handler: TypedEventHandler<InputKeyboardSource?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_SystemKeyUp(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputKeyboardSource2> {
    public override fun getValue() = ABI.makeIInputKeyboardSource2(pointer.getPointer(0))

    public fun setValue(value: IInputKeyboardSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputKeyboardSource2 {
    public val __847303519_Ptr: Pointer?

    public val _847303519_VtblPtr: Pointer?
      get() = __847303519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentKeyState(virtualKey: VirtualKey?): VirtualKeyStates? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetKeyState(virtualKey: VirtualKey?): VirtualKeyStates? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_CharacterReceived(handler: TypedEventHandler<InputKeyboardSource?,
        CharacterReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CharacterReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ContextMenuKey(handler: TypedEventHandler<InputKeyboardSource?,
        ContextMenuKeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ContextMenuKey(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_KeyDown(handler: TypedEventHandler<InputKeyboardSource?,
        KeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_KeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_KeyUp(handler: TypedEventHandler<InputKeyboardSource?, KeyEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_KeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_SystemKeyDown(handler: TypedEventHandler<InputKeyboardSource?,
        KeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SystemKeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_SystemKeyUp(handler: TypedEventHandler<InputKeyboardSource?,
        KeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303519_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_SystemKeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303519_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303519_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputKeyboardSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __847303519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputKeyboardSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79d1c9b6b3c95ec28a5b707088787f78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputKeyboardSource2(ptr: Pointer?): WithDefault =
        IInputKeyboardSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputKeyboardSource2 {
      val address = segment.toRawLongValue()
      return makeIInputKeyboardSource2(Pointer(address))
    }

    public override fun toNative(obj: IInputKeyboardSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847303519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputKeyboardSource2): Array<IInputKeyboardSource2?> =
        (elements as
        Array<IInputKeyboardSource2?>).castToImpl<IInputKeyboardSource2,IInputKeyboardSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputKeyboardSource2?> =
        arrayOfNulls<IInputKeyboardSource2_Impl>(size) as Array<IInputKeyboardSource2?>
  }
}
