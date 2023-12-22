package Microsoft.UI.Input

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputKeyboardSource3.ABI::class)
@Signature("{61696e2c-3f37-5b37-9778-63df5f8151f2}")
@Guid("61696e2c3f375b37977863df5f8151f2")
@WinRTInterface("61696e2c3f375b37977863df5f8151f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputKeyboardSource3.ByReference::class)
public interface IInputKeyboardSource3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasFocus(): Boolean

  @InterfaceMethod(1)
  public fun TrySetFocus(): Boolean

  @InterfaceMethod(2)
  public fun add_GotFocus(handler: TypedEventHandler<InputKeyboardSource?,
      InputFocusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_LostFocus(handler: TypedEventHandler<InputKeyboardSource?,
      InputFocusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputKeyboardSource3> {
    public override fun getValue() = ABI.makeIInputKeyboardSource3(pointer.getPointer(0))

    public fun setValue(value: IInputKeyboardSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputKeyboardSource3 {
    public val __847303520_Ptr: Pointer?

    public val _847303520_VtblPtr: Pointer?
      get() = __847303520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasFocus(): Boolean {
      val fnPtr = _847303520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySetFocus(): Boolean {
      val fnPtr = _847303520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_GotFocus(handler: TypedEventHandler<InputKeyboardSource?,
        InputFocusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303520_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303520_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_LostFocus(handler: TypedEventHandler<InputKeyboardSource?,
        InputFocusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _847303520_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _847303520_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847303520_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputKeyboardSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __847303520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputKeyboardSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61696e2c3f375b37977863df5f8151f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputKeyboardSource3(ptr: Pointer?): WithDefault =
        IInputKeyboardSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputKeyboardSource3 {
      val address = segment.toRawLongValue()
      return makeIInputKeyboardSource3(Pointer(address))
    }

    public override fun toNative(obj: IInputKeyboardSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847303520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputKeyboardSource3): Array<IInputKeyboardSource3?> =
        (elements as
        Array<IInputKeyboardSource3?>).castToImpl<IInputKeyboardSource3,IInputKeyboardSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputKeyboardSource3?> =
        arrayOfNulls<IInputKeyboardSource3_Impl>(size) as Array<IInputKeyboardSource3?>
  }
}
