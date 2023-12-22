package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Text.RichEditTextDocument
import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Input.InputScope
import Microsoft.UI.Xaml.Media.SolidColorBrush
import Microsoft.UI.Xaml.RoutedEventHandler
import Microsoft.UI.Xaml.TextAlignment
import Microsoft.UI.Xaml.TextReadingOrder
import Microsoft.UI.Xaml.TextWrapping
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IRichEditBox.ABI::class)
@Signature("{699163db-723d-5514-a8c9-2c64d99e1ea6}")
@Guid("699163db723d5514a8c92c64d99e1ea6")
@WinRTInterface("699163db723d5514a8c92c64d99e1ea6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox.ByReference::class)
public interface IRichEditBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(1)
  public fun put_IsReadOnly(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AcceptsReturn(): Boolean

  @InterfaceMethod(3)
  public fun put_AcceptsReturn(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_TextAlignment(): TextAlignment?

  @InterfaceMethod(5)
  public fun put_TextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(6)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(7)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(8)
  public fun get_IsSpellCheckEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsSpellCheckEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsTextPredictionEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsTextPredictionEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_Document(): RichEditTextDocument?

  @InterfaceMethod(13)
  public fun get_InputScope(): InputScope?

  @InterfaceMethod(14)
  public fun put_InputScope(value: InputScope?): Unit

  @InterfaceMethod(15)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(16)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(17)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(18)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(19)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(20)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(21)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(22)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(23)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean

  @InterfaceMethod(24)
  public fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit

  @InterfaceMethod(25)
  public fun get_IsColorFontEnabled(): Boolean

  @InterfaceMethod(26)
  public fun put_IsColorFontEnabled(value: Boolean): Unit

  @InterfaceMethod(27)
  public fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush?

  @InterfaceMethod(28)
  public fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit

  @InterfaceMethod(29)
  public fun get_MaxLength(): Int

  @InterfaceMethod(30)
  public fun put_MaxLength(value: Int): Unit

  @InterfaceMethod(31)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(32)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(33)
  public fun get_CharacterCasing(): CharacterCasing?

  @InterfaceMethod(34)
  public fun put_CharacterCasing(value: CharacterCasing?): Unit

  @InterfaceMethod(35)
  public fun get_DisabledFormattingAccelerators(): DisabledFormattingAccelerators?

  @InterfaceMethod(36)
  public fun put_DisabledFormattingAccelerators(value: DisabledFormattingAccelerators?): Unit

  @InterfaceMethod(37)
  public fun get_TextDocument(): RichEditTextDocument?

  @InterfaceMethod(38)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(39)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(40)
  public fun get_ProofingMenuFlyout(): FlyoutBase?

  @InterfaceMethod(41)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(42)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(43)
  public fun add_TextChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_TextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun add_SelectionChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(49)
  public fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken?

  @InterfaceMethod(50)
  public fun remove_Paste(token: EventRegistrationToken?): Unit

  @InterfaceMethod(51)
  public fun add_TextCompositionStarted(handler: TypedEventHandler<RichEditBox?,
      TextCompositionStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(52)
  public fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(53)
  public fun add_TextCompositionChanged(handler: TypedEventHandler<RichEditBox?,
      TextCompositionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(54)
  public fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(55)
  public fun add_TextCompositionEnded(handler: TypedEventHandler<RichEditBox?,
      TextCompositionEndedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(56)
  public fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(57)
  public fun add_CopyingToClipboard(handler: TypedEventHandler<RichEditBox?,
      TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(58)
  public fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(59)
  public fun add_CuttingToClipboard(handler: TypedEventHandler<RichEditBox?,
      TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(60)
  public fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(61)
  public fun add_SelectionChanging(handler: TypedEventHandler<RichEditBox?,
      RichEditBoxSelectionChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(62)
  public fun remove_SelectionChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(63)
  public fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(64)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(65)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(66)
  public fun get_ClipboardCopyFormat(): RichEditClipboardFormat?

  @InterfaceMethod(67)
  public fun put_ClipboardCopyFormat(value: RichEditClipboardFormat?): Unit

  @InterfaceMethod(68)
  public fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment?

  @InterfaceMethod(69)
  public fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?): Unit

  @InterfaceMethod(70)
  public fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<RichEditBox?,
      CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(71)
  public fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(72)
  public fun add_TextChanging(handler: TypedEventHandler<RichEditBox?,
      RichEditBoxTextChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(73)
  public fun remove_TextChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox> {
    public override fun getValue() = ABI.makeIRichEditBox(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox {
    public val __1619672386_Ptr: Pointer?

    public val _1619672386_VtblPtr: Pointer?
      get() = __1619672386_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsReadOnly(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AcceptsReturn(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AcceptsReturn(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TextAlignment(): TextAlignment? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsSpellCheckEnabled(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsSpellCheckEnabled(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsTextPredictionEnabled(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsTextPredictionEnabled(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Document(): RichEditTextDocument? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditTextDocument>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditTextDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_InputScope(): InputScope? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScope>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_InputScope(value: InputScope?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_IsColorFontEnabled(): Boolean {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_IsColorFontEnabled(value: Boolean): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_MaxLength(): Int {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_MaxLength(value: Int): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_CharacterCasing(): CharacterCasing? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CharacterCasing>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CharacterCasing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun put_CharacterCasing(value: CharacterCasing?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_DisabledFormattingAccelerators(): DisabledFormattingAccelerators? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisabledFormattingAccelerators>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisabledFormattingAccelerators>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun put_DisabledFormattingAccelerators(value: DisabledFormattingAccelerators?):
        Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_TextDocument(): RichEditTextDocument? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditTextDocument>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditTextDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_ProofingMenuFlyout(): FlyoutBase? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun add_TextChanged(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_TextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun add_SelectionChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun remove_Paste(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun add_TextCompositionStarted(handler: TypedEventHandler<RichEditBox?,
        TextCompositionStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun add_TextCompositionChanged(handler: TypedEventHandler<RichEditBox?,
        TextCompositionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun add_TextCompositionEnded(handler: TypedEventHandler<RichEditBox?,
        TextCompositionEndedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun add_CopyingToClipboard(handler: TypedEventHandler<RichEditBox?,
        TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(59)
    public override fun add_CuttingToClipboard(handler: TypedEventHandler<RichEditBox?,
        TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun add_SelectionChanging(handler: TypedEventHandler<RichEditBox?,
        RichEditBoxSelectionChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun remove_SelectionChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun get_ClipboardCopyFormat(): RichEditClipboardFormat? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditClipboardFormat>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditClipboardFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun put_ClipboardCopyFormat(value: RichEditClipboardFormat?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CandidateWindowAlignment>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CandidateWindowAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?):
        Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<RichEditBox?,
        CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun add_TextChanging(handler: TypedEventHandler<RichEditBox?,
        RichEditBoxTextChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun remove_TextChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1619672386_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1619672386_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619672386_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("699163db723d5514a8c92c64d99e1ea6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox(ptr: Pointer?): WithDefault = IRichEditBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox {
      val address = segment.toRawLongValue()
      return makeIRichEditBox(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619672386_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox): Array<IRichEditBox?> = (elements as
        Array<IRichEditBox?>).castToImpl<IRichEditBox,IRichEditBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox?> =
        arrayOfNulls<IRichEditBox_Impl>(size) as Array<IRichEditBox?>
  }
}
