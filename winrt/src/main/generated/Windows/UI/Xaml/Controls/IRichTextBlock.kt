package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
import Windows.UI.Xaml.Documents.BlockCollection
import Windows.UI.Xaml.Documents.TextPointer
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.LineStackingStrategy
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.FontFamily
import Windows.UI.Xaml.RoutedEventHandler
import Windows.UI.Xaml.TextAlignment
import Windows.UI.Xaml.TextTrimming
import Windows.UI.Xaml.TextWrapping
import Windows.UI.Xaml.Thickness
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

@ABIMarker(IRichTextBlock.ABI::class)
@Signature("{e5fff9e2-b968-49e7-97d4-8cca2ac3ae7c}")
@Guid("e5fff9e2b96849e797d48cca2ac3ae7c")
@WinRTInterface("e5fff9e2b96849e797d48cca2ac3ae7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock.ByReference::class)
public interface IRichTextBlock : NativeMapped, IWinRTInterface {
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
  public fun get_Foreground(): Brush?

  @InterfaceMethod(11)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(12)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(13)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(14)
  public fun get_TextTrimming(): TextTrimming?

  @InterfaceMethod(15)
  public fun put_TextTrimming(value: TextTrimming?): Unit

  @InterfaceMethod(16)
  public fun get_TextAlignment(): TextAlignment?

  @InterfaceMethod(17)
  public fun put_TextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(18)
  public fun get_Blocks(): BlockCollection?

  @InterfaceMethod(19)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(20)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(21)
  public fun get_LineHeight(): Double

  @InterfaceMethod(22)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(23)
  public fun get_LineStackingStrategy(): LineStackingStrategy?

  @InterfaceMethod(24)
  public fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit

  @InterfaceMethod(25)
  public fun get_CharacterSpacing(): Int

  @InterfaceMethod(26)
  public fun put_CharacterSpacing(value: Int): Unit

  @InterfaceMethod(27)
  public fun get_OverflowContentTarget(): RichTextBlockOverflow?

  @InterfaceMethod(28)
  public fun put_OverflowContentTarget(value: RichTextBlockOverflow?): Unit

  @InterfaceMethod(29)
  public fun get_IsTextSelectionEnabled(): Boolean

  @InterfaceMethod(30)
  public fun put_IsTextSelectionEnabled(value: Boolean): Unit

  @InterfaceMethod(31)
  public fun get_HasOverflowContent(): Boolean

  @InterfaceMethod(32)
  public fun get_SelectedText(): String?

  @InterfaceMethod(33)
  public fun get_ContentStart(): TextPointer?

  @InterfaceMethod(34)
  public fun get_ContentEnd(): TextPointer?

  @InterfaceMethod(35)
  public fun get_SelectionStart(): TextPointer?

  @InterfaceMethod(36)
  public fun get_SelectionEnd(): TextPointer?

  @InterfaceMethod(37)
  public fun get_BaselineOffset(): Double

  @InterfaceMethod(38)
  public fun add_SelectionChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(40)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(41)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(42)
  public fun SelectAll(): Unit

  @InterfaceMethod(43)
  public fun Select(start: TextPointer?, end: TextPointer?): Unit

  @InterfaceMethod(44)
  public fun GetPositionFromPoint(point: Point?): TextPointer?

  @InterfaceMethod(45)
  public fun Focus(value: FocusState?): Boolean

  @InterfaceMethod(46)
  public fun get_TextIndent(): Double

  @InterfaceMethod(47)
  public fun put_TextIndent(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichTextBlock>
      {
    public override fun getValue() = ABI.makeIRichTextBlock(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock {
    public val __1014227784_Ptr: Pointer?

    public val _1014227784_VtblPtr: Pointer?
      get() = __1014227784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontSize(): Double {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TextTrimming(): TextTrimming? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextTrimming>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextTrimming>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TextTrimming(value: TextTrimming?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TextAlignment(): TextAlignment? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Blocks(): BlockCollection? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BlockCollection>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BlockCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_LineStackingStrategy(): LineStackingStrategy? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineStackingStrategy>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineStackingStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_OverflowContentTarget(): RichTextBlockOverflow? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichTextBlockOverflow>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichTextBlockOverflow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_OverflowContentTarget(value: RichTextBlockOverflow?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_IsTextSelectionEnabled(): Boolean {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_IsTextSelectionEnabled(value: Boolean): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_HasOverflowContent(): Boolean {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun get_SelectedText(): String? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_ContentStart(): TextPointer? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_ContentEnd(): TextPointer? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_SelectionStart(): TextPointer? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_SelectionEnd(): TextPointer? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_BaselineOffset(): Double {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun add_SelectionChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun SelectAll(): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun Select(start: TextPointer?, end: TextPointer?): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(start), marshalToNative(end),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun GetPositionFromPoint(point: Point?): TextPointer? {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun get_TextIndent(): Double {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_TextIndent(value: Double): Unit {
      val fnPtr = _1014227784_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1014227784_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1014227784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5fff9e2b96849e797d48cca2ac3ae7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock(ptr: Pointer?): WithDefault = IRichTextBlock_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1014227784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock): Array<IRichTextBlock?> = (elements as
        Array<IRichTextBlock?>).castToImpl<IRichTextBlock,IRichTextBlock_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock?> =
        arrayOfNulls<IRichTextBlock_Impl>(size) as Array<IRichTextBlock?>
  }
}
