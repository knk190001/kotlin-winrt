package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Input.InputScope
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Media.SolidColorBrush
import Microsoft.UI.Xaml.RoutedEventHandler
import Microsoft.UI.Xaml.TextAlignment
import Microsoft.UI.Xaml.TextReadingOrder
import Microsoft.UI.Xaml.TextWrapping
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
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

@ABIMarker(ITextBox.ABI::class)
@Signature("{873af7c2-ab89-5d76-8dbe-3d6325669df5}")
@Guid("873af7c2ab895d768dbe3d6325669df5")
@WinRTInterface("873af7c2ab895d768dbe3d6325669df5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox.ByReference::class)
public interface ITextBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_SelectedText(): String?

  @InterfaceMethod(3)
  public fun put_SelectedText(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SelectionLength(): Int

  @InterfaceMethod(5)
  public fun put_SelectionLength(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_SelectionStart(): Int

  @InterfaceMethod(7)
  public fun put_SelectionStart(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_MaxLength(): Int

  @InterfaceMethod(9)
  public fun put_MaxLength(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(11)
  public fun put_IsReadOnly(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_AcceptsReturn(): Boolean

  @InterfaceMethod(13)
  public fun put_AcceptsReturn(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_TextAlignment(): TextAlignment?

  @InterfaceMethod(15)
  public fun put_TextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(16)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(17)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(18)
  public fun get_IsSpellCheckEnabled(): Boolean

  @InterfaceMethod(19)
  public fun put_IsSpellCheckEnabled(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsTextPredictionEnabled(): Boolean

  @InterfaceMethod(21)
  public fun put_IsTextPredictionEnabled(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_InputScope(): InputScope?

  @InterfaceMethod(23)
  public fun put_InputScope(value: InputScope?): Unit

  @InterfaceMethod(24)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(25)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(26)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(27)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(28)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(29)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(30)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(31)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(32)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean

  @InterfaceMethod(33)
  public fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_IsColorFontEnabled(): Boolean

  @InterfaceMethod(35)
  public fun put_IsColorFontEnabled(value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush?

  @InterfaceMethod(37)
  public fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit

  @InterfaceMethod(38)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(39)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(40)
  public fun get_CharacterCasing(): CharacterCasing?

  @InterfaceMethod(41)
  public fun put_CharacterCasing(value: CharacterCasing?): Unit

  @InterfaceMethod(42)
  public fun get_PlaceholderForeground(): Brush?

  @InterfaceMethod(43)
  public fun put_PlaceholderForeground(value: Brush?): Unit

  @InterfaceMethod(44)
  public fun get_CanPasteClipboardContent(): Boolean

  @InterfaceMethod(45)
  public fun get_CanUndo(): Boolean

  @InterfaceMethod(46)
  public fun get_CanRedo(): Boolean

  @InterfaceMethod(47)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(48)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(49)
  public fun get_ProofingMenuFlyout(): FlyoutBase?

  @InterfaceMethod(50)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(51)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(52)
  public fun add_TextChanged(handler: TextChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(53)
  public fun remove_TextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(54)
  public fun add_SelectionChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(55)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(56)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(57)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(58)
  public fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken?

  @InterfaceMethod(59)
  public fun remove_Paste(token: EventRegistrationToken?): Unit

  @InterfaceMethod(60)
  public fun add_TextCompositionStarted(handler: TypedEventHandler<TextBox?,
      TextCompositionStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(61)
  public fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(62)
  public fun add_TextCompositionChanged(handler: TypedEventHandler<TextBox?,
      TextCompositionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(63)
  public fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(64)
  public fun add_TextCompositionEnded(handler: TypedEventHandler<TextBox?,
      TextCompositionEndedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(65)
  public fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(66)
  public fun add_CopyingToClipboard(handler: TypedEventHandler<TextBox?,
      TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(67)
  public fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(68)
  public fun add_CuttingToClipboard(handler: TypedEventHandler<TextBox?,
      TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(69)
  public fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(70)
  public fun add_BeforeTextChanging(handler: TypedEventHandler<TextBox?,
      TextBoxBeforeTextChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(71)
  public fun remove_BeforeTextChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(72)
  public fun add_SelectionChanging(handler: TypedEventHandler<TextBox?,
      TextBoxSelectionChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(73)
  public fun remove_SelectionChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(74)
  public fun Select(start: Int, length: Int): Unit

  @InterfaceMethod(75)
  public fun SelectAll(): Unit

  @InterfaceMethod(76)
  public fun GetRectFromCharacterIndex(charIndex: Int, trailingEdge: Boolean): Rect?

  @InterfaceMethod(77)
  public fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(78)
  public fun Undo(): Unit

  @InterfaceMethod(79)
  public fun Redo(): Unit

  @InterfaceMethod(80)
  public fun PasteFromClipboard(): Unit

  @InterfaceMethod(81)
  public fun CopySelectionToClipboard(): Unit

  @InterfaceMethod(82)
  public fun CutSelectionToClipboard(): Unit

  @InterfaceMethod(83)
  public fun ClearUndoRedoHistory(): Unit

  @InterfaceMethod(84)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(85)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(86)
  public fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment?

  @InterfaceMethod(87)
  public fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?): Unit

  @InterfaceMethod(88)
  public fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<TextBox?,
      CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(89)
  public fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(90)
  public fun add_TextChanging(handler: TypedEventHandler<TextBox?, TextBoxTextChangingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(91)
  public fun remove_TextChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox> {
    public override fun getValue() = ABI.makeITextBox(pointer.getPointer(0))

    public fun setValue(value: ITextBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox {
    public val __927893943_Ptr: Pointer?

    public val _927893943_VtblPtr: Pointer?
      get() = __927893943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectedText(): String? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectedText(value: String?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SelectionLength(): Int {
      val fnPtr = _927893943_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_SelectionLength(value: Int): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectionStart(): Int {
      val fnPtr = _927893943_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_SelectionStart(value: Int): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MaxLength(): Int {
      val fnPtr = _927893943_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MaxLength(value: Int): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsReadOnly(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AcceptsReturn(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AcceptsReturn(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TextAlignment(): TextAlignment? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsSpellCheckEnabled(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsSpellCheckEnabled(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsTextPredictionEnabled(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsTextPredictionEnabled(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_InputScope(): InputScope? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputScope>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_InputScope(value: InputScope?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_IsColorFontEnabled(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_IsColorFontEnabled(value: Boolean): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_CharacterCasing(): CharacterCasing? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CharacterCasing>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CharacterCasing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_CharacterCasing(value: CharacterCasing?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_PlaceholderForeground(): Brush? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_PlaceholderForeground(value: Brush?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_CanPasteClipboardContent(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun get_CanUndo(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun get_CanRedo(): Boolean {
      val fnPtr = _927893943_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_ProofingMenuFlyout(): FlyoutBase? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun add_TextChanged(handler: TextChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun remove_TextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun add_SelectionChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun add_Paste(handler: TextControlPasteEventHandler?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun remove_Paste(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun add_TextCompositionStarted(handler: TypedEventHandler<TextBox?,
        TextCompositionStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun add_TextCompositionChanged(handler: TypedEventHandler<TextBox?,
        TextCompositionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun add_TextCompositionEnded(handler: TypedEventHandler<TextBox?,
        TextCompositionEndedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun add_CopyingToClipboard(handler: TypedEventHandler<TextBox?,
        TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun add_CuttingToClipboard(handler: TypedEventHandler<TextBox?,
        TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun add_BeforeTextChanging(handler: TypedEventHandler<TextBox?,
        TextBoxBeforeTextChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun remove_BeforeTextChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun add_SelectionChanging(handler: TypedEventHandler<TextBox?,
        TextBoxSelectionChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun remove_SelectionChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(74)
    public override fun Select(start: Int, length: Int): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, start, length,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun SelectAll(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun GetRectFromCharacterIndex(charIndex: Int, trailingEdge: Boolean): Rect? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, charIndex, trailingEdge, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun GetLinguisticAlternativesAsync(): IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(78)
    public override fun Undo(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(79)
    public override fun Redo(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(80)
    public override fun PasteFromClipboard(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(81)
    public override fun CopySelectionToClipboard(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(82)
    public override fun CutSelectionToClipboard(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(83)
    public override fun ClearUndoRedoHistory(): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(84)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(85)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(86)
    public override fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CandidateWindowAlignment>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CandidateWindowAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(87)
    public override fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?):
        Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(88)
    public override fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<TextBox?,
        CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(89)
    public override fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun add_TextChanging(handler: TypedEventHandler<TextBox?,
        TextBoxTextChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _927893943_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(91)
    public override fun remove_TextChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _927893943_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__927893943_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __927893943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("873af7c2ab895d768dbe3d6325669df5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox(ptr: Pointer?): WithDefault = ITextBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox {
      val address = segment.toRawLongValue()
      return makeITextBox(Pointer(address))
    }

    public override fun toNative(obj: ITextBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__927893943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox): Array<ITextBox?> = (elements as
        Array<ITextBox?>).castToImpl<ITextBox,ITextBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox?> = arrayOfNulls<ITextBox_Impl>(size) as
        Array<ITextBox?>
  }
}
