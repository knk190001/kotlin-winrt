package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Input.InputScope
import Microsoft.UI.Xaml.Media.SolidColorBrush
import Microsoft.UI.Xaml.RoutedEventHandler
import Microsoft.UI.Xaml.TextReadingOrder
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPasswordBox.ABI::class)
@Signature("{6d3ccff7-aaee-5adc-8298-33300fa119da}")
@Guid("6d3ccff7aaee5adc829833300fa119da")
@WinRTInterface("6d3ccff7aaee5adc829833300fa119da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBox.ByReference::class)
public interface IPasswordBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Password(): String?

  @InterfaceMethod(1)
  public fun put_Password(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_PasswordChar(): String?

  @InterfaceMethod(3)
  public fun put_PasswordChar(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsPasswordRevealButtonEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsPasswordRevealButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_MaxLength(): Int

  @InterfaceMethod(7)
  public fun put_MaxLength(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(9)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(10)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(11)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(12)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(13)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(15)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(16)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean

  @InterfaceMethod(17)
  public fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_PasswordRevealMode(): PasswordRevealMode?

  @InterfaceMethod(19)
  public fun put_PasswordRevealMode(value: PasswordRevealMode?): Unit

  @InterfaceMethod(20)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(21)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(22)
  public fun get_InputScope(): InputScope?

  @InterfaceMethod(23)
  public fun put_InputScope(value: InputScope?): Unit

  @InterfaceMethod(24)
  public fun get_CanPasteClipboardContent(): Boolean

  @InterfaceMethod(25)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(26)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(27)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(28)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(29)
  public fun add_PasswordChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_PasswordChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_Paste(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun add_PasswordChanging(handler: TypedEventHandler<PasswordBox?,
      PasswordBoxPasswordChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_PasswordChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun SelectAll(): Unit

  @InterfaceMethod(38)
  public fun PasteFromClipboard(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPasswordBox> {
    public override fun getValue() = ABI.makeIPasswordBox(pointer.getPointer(0))

    public fun setValue(value: IPasswordBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBox {
    public val __158785271_Ptr: Pointer?

    public val _158785271_VtblPtr: Pointer?
      get() = __158785271_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Password(): String? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Password(value: String?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PasswordChar(): String? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PasswordChar(value: String?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsPasswordRevealButtonEnabled(): Boolean {
      val fnPtr = _158785271_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsPasswordRevealButtonEnabled(value: Boolean): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MaxLength(): Int {
      val fnPtr = _158785271_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MaxLength(value: Int): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean {
      val fnPtr = _158785271_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PasswordRevealMode(): PasswordRevealMode? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordRevealMode>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordRevealMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_PasswordRevealMode(value: PasswordRevealMode?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_InputScope(): InputScope? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScope>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_InputScope(value: InputScope?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CanPasteClipboardContent(): Boolean {
      val fnPtr = _158785271_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_PasswordChanged(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_PasswordChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_Paste(token: EventRegistrationToken?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun add_PasswordChanging(handler: TypedEventHandler<PasswordBox?,
        PasswordBoxPasswordChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _158785271_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_PasswordChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun SelectAll(): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun PasteFromClipboard(): Unit {
      val fnPtr = _158785271_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__158785271_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPasswordBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __158785271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d3ccff7aaee5adc829833300fa119da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBox(ptr: Pointer?): WithDefault = IPasswordBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBox {
      val address = segment.toRawLongValue()
      return makeIPasswordBox(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__158785271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBox): Array<IPasswordBox?> = (elements as
        Array<IPasswordBox?>).castToImpl<IPasswordBox,IPasswordBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBox?> =
        arrayOfNulls<IPasswordBox_Impl>(size) as Array<IPasswordBox?>
  }
}
