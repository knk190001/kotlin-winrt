package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs
import Microsoft.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs
import Microsoft.UI.Xaml.Input.AccessKeyInvokedEventArgs
import Microsoft.UI.Xaml.Input.KeyTipPlacementMode
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Media.FontFamily
import Microsoft.UI.Xaml.XamlRoot
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextElement.ABI::class)
@Signature("{a122ba22-833f-5220-a47e-6cd507531abe}")
@Guid("a122ba22833f5220a47e6cd507531abe")
@WinRTInterface("a122ba22833f5220a47e6cd507531abe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElement.ByReference::class)
public interface ITextElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_FontSize(): Double

  @InterfaceMethod(2)
  public fun put_FontSize(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_FontFamily(): FontFamily?

  @InterfaceMethod(4)
  public fun put_FontFamily(value: FontFamily?): Unit

  @InterfaceMethod(5)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(6)
  public fun put_FontWeight(value: FontWeight?): Unit

  @InterfaceMethod(7)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(8)
  public fun put_FontStyle(value: FontStyle?): Unit

  @InterfaceMethod(9)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(10)
  public fun put_FontStretch(value: FontStretch?): Unit

  @InterfaceMethod(11)
  public fun get_CharacterSpacing(): Int

  @InterfaceMethod(12)
  public fun put_CharacterSpacing(value: Int): Unit

  @InterfaceMethod(13)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(14)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(15)
  public fun get_Language(): String?

  @InterfaceMethod(16)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(17)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(18)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_TextDecorations(): TextDecorations?

  @InterfaceMethod(20)
  public fun put_TextDecorations(value: TextDecorations?): Unit

  @InterfaceMethod(21)
  public fun get_ContentStart(): TextPointer?

  @InterfaceMethod(22)
  public fun get_ContentEnd(): TextPointer?

  @InterfaceMethod(23)
  public fun get_ElementStart(): TextPointer?

  @InterfaceMethod(24)
  public fun get_ElementEnd(): TextPointer?

  @InterfaceMethod(25)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(26)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(27)
  public fun get_AccessKey(): String?

  @InterfaceMethod(28)
  public fun put_AccessKey(value: String?): Unit

  @InterfaceMethod(29)
  public fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean

  @InterfaceMethod(30)
  public fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit

  @InterfaceMethod(31)
  public fun get_IsAccessKeyScope(): Boolean

  @InterfaceMethod(32)
  public fun put_IsAccessKeyScope(value: Boolean): Unit

  @InterfaceMethod(33)
  public fun get_AccessKeyScopeOwner(): DependencyObject?

  @InterfaceMethod(34)
  public fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit

  @InterfaceMethod(35)
  public fun get_KeyTipPlacementMode(): KeyTipPlacementMode?

  @InterfaceMethod(36)
  public fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit

  @InterfaceMethod(37)
  public fun get_KeyTipHorizontalOffset(): Double

  @InterfaceMethod(38)
  public fun put_KeyTipHorizontalOffset(value: Double): Unit

  @InterfaceMethod(39)
  public fun get_KeyTipVerticalOffset(): Double

  @InterfaceMethod(40)
  public fun put_KeyTipVerticalOffset(value: Double): Unit

  @InterfaceMethod(41)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(42)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  @InterfaceMethod(43)
  public fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<TextElement?,
      AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<TextElement?,
      AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_AccessKeyInvoked(handler: TypedEventHandler<TextElement?,
      AccessKeyInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(49)
  public fun FindName(name: String?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextElement> {
    public override fun getValue() = ABI.makeITextElement(pointer.getPointer(0))

    public fun setValue(value: ITextElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElement {
    public val __36184302_Ptr: Pointer?

    public val _36184302_VtblPtr: Pointer?
      get() = __36184302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FontSize(): Double {
      val fnPtr = _36184302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _36184302_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Language(): String? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _36184302_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_TextDecorations(): TextDecorations? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextDecorations>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextDecorations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_TextDecorations(value: TextDecorations?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_ContentStart(): TextPointer? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_ContentEnd(): TextPointer? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_ElementStart(): TextPointer? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_ElementEnd(): TextPointer? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _36184302_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_AccessKey(): String? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_AccessKey(value: String?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean {
      val fnPtr = _36184302_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_IsAccessKeyScope(): Boolean {
      val fnPtr = _36184302_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun put_IsAccessKeyScope(value: Boolean): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_AccessKeyScopeOwner(): DependencyObject? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_KeyTipPlacementMode(): KeyTipPlacementMode? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTipPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTipPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_KeyTipHorizontalOffset(): Double {
      val fnPtr = _36184302_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun put_KeyTipHorizontalOffset(value: Double): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_KeyTipVerticalOffset(): Double {
      val fnPtr = _36184302_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun put_KeyTipVerticalOffset(value: Double): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<TextElement?,
        AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<TextElement?,
        AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_AccessKeyInvoked(handler: TypedEventHandler<TextElement?,
        AccessKeyInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _36184302_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun FindName(name: String?): IUnknown? {
      val fnPtr = _36184302_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__36184302_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ITextElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36184302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a122ba22833f5220a47e6cd507531abe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElement(ptr: Pointer?): WithDefault = ITextElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElement {
      val address = segment.toRawLongValue()
      return makeITextElement(Pointer(address))
    }

    public override fun toNative(obj: ITextElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36184302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElement): Array<ITextElement?> = (elements as
        Array<ITextElement?>).castToImpl<ITextElement,ITextElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElement?> =
        arrayOfNulls<ITextElement_Impl>(size) as Array<ITextElement?>
  }
}
