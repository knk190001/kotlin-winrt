package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
import Windows.UI.Xaml.DependencyPropertyChangedEventHandler
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.HorizontalAlignment
import Windows.UI.Xaml.Input.KeyboardNavigationMode
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.FontFamily
import Windows.UI.Xaml.Thickness
import Windows.UI.Xaml.VerticalAlignment
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControl.ABI::class)
@Signature("{a8912263-2951-4f58-a9c5-5a134eaa7f07}")
@Guid("a891226329514f58a9c55a134eaa7f07")
@WinRTInterface("a891226329514f58a9c55a134eaa7f07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControl.ByReference::class)
public interface IControl : NativeMapped, IWinRTInterface {
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
  public fun get_IsTabStop(): Boolean

  @InterfaceMethod(15)
  public fun put_IsTabStop(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(17)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_TabIndex(): Int

  @InterfaceMethod(19)
  public fun put_TabIndex(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_TabNavigation(): KeyboardNavigationMode?

  @InterfaceMethod(21)
  public fun put_TabNavigation(value: KeyboardNavigationMode?): Unit

  @InterfaceMethod(22)
  public fun get_Template(): ControlTemplate?

  @InterfaceMethod(23)
  public fun put_Template(value: ControlTemplate?): Unit

  @InterfaceMethod(24)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(25)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(26)
  public fun get_HorizontalContentAlignment(): HorizontalAlignment?

  @InterfaceMethod(27)
  public fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(28)
  public fun get_VerticalContentAlignment(): VerticalAlignment?

  @InterfaceMethod(29)
  public fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(30)
  public fun get_Background(): Brush?

  @InterfaceMethod(31)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(32)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(33)
  public fun put_BorderThickness(value: Thickness?): Unit

  @InterfaceMethod(34)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(35)
  public fun put_BorderBrush(value: Brush?): Unit

  @InterfaceMethod(36)
  public fun get_FocusState(): FocusState?

  @InterfaceMethod(37)
  public fun add_IsEnabledChanged(handler: DependencyPropertyChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_IsEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun ApplyTemplate(): Boolean

  @InterfaceMethod(40)
  public fun Focus(value: FocusState?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IControl> {
    public override fun getValue() = ABI.makeIControl(pointer.getPointer(0))

    public fun setValue(value: IControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControl {
    public val __104493505_Ptr: Pointer?

    public val _104493505_VtblPtr: Pointer?
      get() = __104493505_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontSize(): Double {
      val fnPtr = _104493505_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _104493505_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsTabStop(): Boolean {
      val fnPtr = _104493505_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsTabStop(value: Boolean): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _104493505_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TabIndex(): Int {
      val fnPtr = _104493505_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_TabIndex(value: Int): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_TabNavigation(): KeyboardNavigationMode? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardNavigationMode>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardNavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_TabNavigation(value: KeyboardNavigationMode?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Template(): ControlTemplate? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlTemplate>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Template(value: ControlTemplate?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_HorizontalContentAlignment(): HorizontalAlignment? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_VerticalContentAlignment(): VerticalAlignment? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_Background(): Brush? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_BorderThickness(value: Thickness?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_BorderBrush(value: Brush?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun add_IsEnabledChanged(handler: DependencyPropertyChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _104493505_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_IsEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _104493505_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun ApplyTemplate(): Boolean {
      val fnPtr = _104493505_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _104493505_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__104493505_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __104493505_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a891226329514f58a9c55a134eaa7f07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControl(ptr: Pointer?): WithDefault = IControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControl {
      val address = segment.toRawLongValue()
      return makeIControl(Pointer(address))
    }

    public override fun toNative(obj: IControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__104493505_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControl): Array<IControl?> = (elements as
        Array<IControl?>).castToImpl<IControl,IControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControl?> = arrayOfNulls<IControl_Impl>(size) as
        Array<IControl?>
  }
}
