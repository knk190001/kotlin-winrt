package Windows.UI.Xaml

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Input.CharacterReceivedRoutedEventArgs
import Windows.UI.Xaml.Input.KeyEventHandler
import Windows.UI.Xaml.Input.KeyboardAccelerator
import Windows.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
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

@ABIMarker(IUIElement7.ABI::class)
@Signature("{cafc4968-6369-4249-80f9-3d656319e811}")
@Guid("cafc49686369424980f93d656319e811")
@WinRTInterface("cafc49686369424980f93d656319e811")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement7.ByReference::class)
public interface IUIElement7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>?

  @InterfaceMethod(1)
  public fun add_CharacterReceived(handler: TypedEventHandler<UIElement?,
      CharacterReceivedRoutedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_CharacterReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_ProcessKeyboardAccelerators(handler: TypedEventHandler<UIElement?,
      ProcessKeyboardAcceleratorEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_ProcessKeyboardAccelerators(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_PreviewKeyDown(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_PreviewKeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_PreviewKeyUp(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PreviewKeyUp(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement7> {
    public override fun getValue() = ABI.makeIUIElement7(pointer.getPointer(0))

    public fun setValue(value: IUIElement7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement7 {
    public val __1021118241_Ptr: Pointer?

    public val _1021118241_VtblPtr: Pointer?
      get() = __1021118241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>? {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<KeyboardAccelerator?>>()
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<KeyboardAccelerator?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_CharacterReceived(handler: TypedEventHandler<UIElement?,
        CharacterReceivedRoutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_CharacterReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_ProcessKeyboardAccelerators(handler: TypedEventHandler<UIElement?,
        ProcessKeyboardAcceleratorEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_ProcessKeyboardAccelerators(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_PreviewKeyDown(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_PreviewKeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_PreviewKeyUp(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PreviewKeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _1021118241_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118241_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cafc49686369424980f93d656319e811")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement7(ptr: Pointer?): WithDefault = IUIElement7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement7 {
      val address = segment.toRawLongValue()
      return makeIUIElement7(Pointer(address))
    }

    public override fun toNative(obj: IUIElement7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement7): Array<IUIElement7?> = (elements as
        Array<IUIElement7?>).castToImpl<IUIElement7,IUIElement7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement7?> =
        arrayOfNulls<IUIElement7_Impl>(size) as Array<IUIElement7?>
  }
}
