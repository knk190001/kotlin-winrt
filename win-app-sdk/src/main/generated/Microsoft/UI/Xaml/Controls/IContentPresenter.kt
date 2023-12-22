package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.BrushTransition
import Microsoft.UI.Xaml.CornerRadius
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.HorizontalAlignment
import Microsoft.UI.Xaml.LineStackingStrategy
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Media.FontFamily
import Microsoft.UI.Xaml.OpticalMarginAlignment
import Microsoft.UI.Xaml.TextLineBounds
import Microsoft.UI.Xaml.TextWrapping
import Microsoft.UI.Xaml.Thickness
import Microsoft.UI.Xaml.VerticalAlignment
import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentPresenter.ABI::class)
@Signature("{075e6ca8-da46-5ec6-8c64-03b3ddeaf74f}")
@Guid("075e6ca8da465ec68c6403b3ddeaf74f")
@WinRTInterface("075e6ca8da465ec68c6403b3ddeaf74f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentPresenter.ByReference::class)
public interface IContentPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Content(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ContentTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_ContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_ContentTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(5)
  public fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(6)
  public fun get_ContentTransitions(): TransitionCollection?

  @InterfaceMethod(7)
  public fun put_ContentTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(8)
  public fun get_FontSize(): Double

  @InterfaceMethod(9)
  public fun put_FontSize(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_FontFamily(): FontFamily?

  @InterfaceMethod(11)
  public fun put_FontFamily(value: FontFamily?): Unit

  @InterfaceMethod(12)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(13)
  public fun put_FontWeight(value: FontWeight?): Unit

  @InterfaceMethod(14)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(15)
  public fun put_FontStyle(value: FontStyle?): Unit

  @InterfaceMethod(16)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(17)
  public fun put_FontStretch(value: FontStretch?): Unit

  @InterfaceMethod(18)
  public fun get_CharacterSpacing(): Int

  @InterfaceMethod(19)
  public fun put_CharacterSpacing(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(21)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(22)
  public fun get_OpticalMarginAlignment(): OpticalMarginAlignment?

  @InterfaceMethod(23)
  public fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit

  @InterfaceMethod(24)
  public fun get_TextLineBounds(): TextLineBounds?

  @InterfaceMethod(25)
  public fun put_TextLineBounds(value: TextLineBounds?): Unit

  @InterfaceMethod(26)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(27)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(29)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  @InterfaceMethod(30)
  public fun get_TextWrapping(): TextWrapping?

  @InterfaceMethod(31)
  public fun put_TextWrapping(value: TextWrapping?): Unit

  @InterfaceMethod(32)
  public fun get_MaxLines(): Int

  @InterfaceMethod(33)
  public fun put_MaxLines(value: Int): Unit

  @InterfaceMethod(34)
  public fun get_LineStackingStrategy(): LineStackingStrategy?

  @InterfaceMethod(35)
  public fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit

  @InterfaceMethod(36)
  public fun get_LineHeight(): Double

  @InterfaceMethod(37)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(38)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(39)
  public fun put_BorderBrush(value: Brush?): Unit

  @InterfaceMethod(40)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(41)
  public fun put_BorderThickness(value: Thickness?): Unit

  @InterfaceMethod(42)
  public fun get_CornerRadius(): CornerRadius?

  @InterfaceMethod(43)
  public fun put_CornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(44)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(45)
  public fun put_Padding(value: Thickness?): Unit

  @InterfaceMethod(46)
  public fun get_Background(): Brush?

  @InterfaceMethod(47)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(48)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(49)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  @InterfaceMethod(50)
  public fun get_HorizontalContentAlignment(): HorizontalAlignment?

  @InterfaceMethod(51)
  public fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(52)
  public fun get_VerticalContentAlignment(): VerticalAlignment?

  @InterfaceMethod(53)
  public fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentPresenter> {
    public override fun getValue() = ABI.makeIContentPresenter(pointer.getPointer(0))

    public fun setValue(value: IContentPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentPresenter {
    public val __1418623498_Ptr: Pointer?

    public val _1418623498_VtblPtr: Pointer?
      get() = __1418623498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IUnknown? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IUnknown?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentTemplate(): DataTemplate? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentTransitions(): TransitionCollection? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontSize(): Double {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CharacterSpacing(): Int {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_CharacterSpacing(value: Int): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_OpticalMarginAlignment(): OpticalMarginAlignment? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalMarginAlignment>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalMarginAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_TextLineBounds(): TextLineBounds? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextLineBounds>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextLineBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_TextLineBounds(value: TextLineBounds?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_TextWrapping(): TextWrapping? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextWrapping>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_TextWrapping(value: TextWrapping?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_MaxLines(): Int {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_LineStackingStrategy(): LineStackingStrategy? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineStackingStrategy>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineStackingStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_BorderBrush(value: Brush?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_BorderThickness(value: Thickness?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_CornerRadius(): CornerRadius? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_CornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_Background(): Brush? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_HorizontalContentAlignment(): HorizontalAlignment? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_HorizontalContentAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_VerticalContentAlignment(): VerticalAlignment? {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_VerticalContentAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1418623498_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1418623498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418623498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("075e6ca8da465ec68c6403b3ddeaf74f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentPresenter(ptr: Pointer?): WithDefault = IContentPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentPresenter {
      val address = segment.toRawLongValue()
      return makeIContentPresenter(Pointer(address))
    }

    public override fun toNative(obj: IContentPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418623498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentPresenter): Array<IContentPresenter?> = (elements
        as Array<IContentPresenter?>).castToImpl<IContentPresenter,IContentPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentPresenter?> =
        arrayOfNulls<IContentPresenter_Impl>(size) as Array<IContentPresenter?>
  }
}
