package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Composition.CompositionBrush
import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.Documents.InlineCollection
import Microsoft.UI.Xaml.Documents.TextHighlighter
import Microsoft.UI.Xaml.Documents.TextPointer
import Microsoft.UI.Xaml.LineStackingStrategy
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Media.FontFamily
import Microsoft.UI.Xaml.Media.SolidColorBrush
import Microsoft.UI.Xaml.OpticalMarginAlignment
import Microsoft.UI.Xaml.RoutedEventHandler
import Microsoft.UI.Xaml.TextAlignment
import Microsoft.UI.Xaml.TextLineBounds
import Microsoft.UI.Xaml.TextReadingOrder
import Microsoft.UI.Xaml.TextTrimming
import Microsoft.UI.Xaml.TextWrapping
import Microsoft.UI.Xaml.Thickness
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
import Windows.UI.Text.TextDecorations
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBlock.ABI::class)
@Signature("{1ac8d84f-392c-5c7e-83f5-a53e3bf0abb0}")
@Guid("1ac8d84f392c5c7e83f5a53e3bf0abb0")
@WinRTInterface("1ac8d84f392c5c7e83f5a53e3bf0abb0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlock.ByReference::class)
public interface ITextBlock : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FontSize(): Double

  @InterfaceMethod(1)
  public fun put_FontSize(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_FontFamily(): FontFamily?

  @InterfaceMethod(3)
  public fun put_FontFamily(value: FontFamily?): Unit

  @InterfaceMethod(4)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(5)
  public fun put_FontWeight(value: FontWeight?): Unit

  @InterfaceMethod(6)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(7)
  public fun put_FontStyle(value: FontStyle?): Unit

  @InterfaceMethod(8)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(9)
  public fun put_FontStretch(value: FontStretch?): Unit

  @InterfaceMethod(10)
  public fun get_CharacterSpacing(): Int

  @InterfaceMethod(11)
  public fun put_CharacterSpacing(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(13)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(14)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(15)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(16)
  public fun get_TextTrimming(): TextTrimming?

  @InterfaceMethod(17)
  public fun put_TextTrimming(value: TextTrimming?): Unit

  @InterfaceMethod(18)
  public fun get_TextAlignment(): TextAlignment?

  @InterfaceMethod(19)
  public fun put_TextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(20)
  public fun get_Text(): String?

  @InterfaceMethod(21)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(22)
  public fun get_Inlines(): InlineCollection?

  @InterfaceMethod(23)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(24)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(25)
  public fun get_LineHeight(): Double

  @InterfaceMethod(26)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(27)
  public fun get_LineStackingStrategy(): LineStackingStrategy?

  @InterfaceMethod(28)
  public fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit

  @InterfaceMethod(29)
  public fun get_IsTextSelectionEnabled(): Boolean

  @InterfaceMethod(30)
  public fun put_IsTextSelectionEnabled(value: Boolean): Unit

  @InterfaceMethod(31)
  public fun get_SelectedText(): String?

  @InterfaceMethod(32)
  public fun get_ContentStart(): TextPointer?

  @InterfaceMethod(33)
  public fun get_ContentEnd(): TextPointer?

  @InterfaceMethod(34)
  public fun get_SelectionStart(): TextPointer?

  @InterfaceMethod(35)
  public fun get_SelectionEnd(): TextPointer?

  @InterfaceMethod(36)
  public fun get_BaselineOffset(): Double

  @InterfaceMethod(37)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(38)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(39)
  public fun get_MaxLines(): Int

  @InterfaceMethod(40)
  public fun put_MaxLines(value: Int): Unit

  @InterfaceMethod(41)
  public fun get_TextLineBounds(): TextLineBounds?

  @InterfaceMethod(42)
  public fun put_TextLineBounds(value: TextLineBounds?): Unit

  @InterfaceMethod(43)
  public fun get_OpticalMarginAlignment(): OpticalMarginAlignment?

  @InterfaceMethod(44)
  public fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit

  @InterfaceMethod(45)
  public fun get_IsColorFontEnabled(): Boolean

  @InterfaceMethod(46)
  public fun put_IsColorFontEnabled(value: Boolean): Unit

  @InterfaceMethod(47)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(48)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(49)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(50)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  @InterfaceMethod(51)
  public fun get_TextDecorations(): TextDecorations?

  @InterfaceMethod(52)
  public fun put_TextDecorations(value: TextDecorations?): Unit

  @InterfaceMethod(53)
  public fun get_IsTextTrimmed(): Boolean

  @InterfaceMethod(54)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(55)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(56)
  public fun get_TextHighlighters(): IVector<TextHighlighter?>?

  @InterfaceMethod(57)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(58)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(59)
  public fun add_SelectionChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(60)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(61)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(62)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(63)
  public fun add_IsTextTrimmedChanged(handler: TypedEventHandler<TextBlock?,
      IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(64)
  public fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(65)
  public fun SelectAll(): Unit

  @InterfaceMethod(66)
  public fun Select(start: TextPointer?, end: TextPointer?): Unit

  @InterfaceMethod(67)
  public fun GetAlphaMask(): CompositionBrush?

  @InterfaceMethod(68)
  public fun CopySelectionToClipboard(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBlock> {
    public override fun getValue() = ABI.makeITextBlock(pointer.getPointer(0))

    public fun setValue(value: ITextBlock_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlock {
    public val __1647213191_Ptr: Pointer?

    public val _1647213191_VtblPtr: Pointer?
      get() = __1647213191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontSize(): Double {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TextTrimming(): TextTrimming? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextTrimming>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextTrimming>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TextTrimming(value: TextTrimming?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TextAlignment(): TextAlignment? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_TextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Text(): String? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Inlines(): InlineCollection? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InlineCollection>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InlineCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_LineStackingStrategy(): LineStackingStrategy? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineStackingStrategy>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineStackingStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_IsTextSelectionEnabled(): Boolean {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_IsTextSelectionEnabled(value: Boolean): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_SelectedText(): String? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_ContentStart(): TextPointer? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_ContentEnd(): TextPointer? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_SelectionStart(): TextPointer? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_SelectionEnd(): TextPointer? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_BaselineOffset(): Double {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_MaxLines(): Int {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_TextLineBounds(): TextLineBounds? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextLineBounds>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextLineBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_TextLineBounds(value: TextLineBounds?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_OpticalMarginAlignment(): OpticalMarginAlignment? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalMarginAlignment>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalMarginAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_IsColorFontEnabled(): Boolean {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun put_IsColorFontEnabled(value: Boolean): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(50)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun get_TextDecorations(): TextDecorations? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextDecorations>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextDecorations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun put_TextDecorations(value: TextDecorations?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun get_IsTextTrimmed(): Boolean {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(54)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_TextHighlighters(): IVector<TextHighlighter?>? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TextHighlighter?>>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TextHighlighter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(59)
    public override fun add_SelectionChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun add_IsTextTrimmedChanged(handler: TypedEventHandler<TextBlock?,
        IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(65)
    public override fun SelectAll(): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun Select(start: TextPointer?, end: TextPointer?): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, marshalToNative(start), marshalToNative(end),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(67)
    public override fun GetAlphaMask(): CompositionBrush? {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun CopySelectionToClipboard(): Unit {
      val fnPtr = _1647213191_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1647213191_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBlock_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1647213191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlock, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ac8d84f392c5c7e83f5a53e3bf0abb0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlock(ptr: Pointer?): WithDefault = ITextBlock_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlock {
      val address = segment.toRawLongValue()
      return makeITextBlock(Pointer(address))
    }

    public override fun toNative(obj: ITextBlock): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1647213191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlock): Array<ITextBlock?> = (elements as
        Array<ITextBlock?>).castToImpl<ITextBlock,ITextBlock_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlock?> = arrayOfNulls<ITextBlock_Impl>(size)
        as Array<ITextBlock?>
  }
}
