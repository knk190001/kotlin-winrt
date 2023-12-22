package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.DependencyProperty
import Windows.UI.Xaml.FontCapitals
import Windows.UI.Xaml.FontEastAsianLanguage
import Windows.UI.Xaml.FontEastAsianWidths
import Windows.UI.Xaml.FontFraction
import Windows.UI.Xaml.FontNumeralAlignment
import Windows.UI.Xaml.FontNumeralStyle
import Windows.UI.Xaml.FontVariants
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

@ABIMarker(ITypographyStatics.ABI::class)
@Signature("{67b9ec88-6c57-4ce0-95f1-d4b9ed632fb4}")
@Guid("67b9ec886c574ce095f1d4b9ed632fb4")
@WinRTInterface("67b9ec886c574ce095f1d4b9ed632fb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITypographyStatics.ByReference::class)
public interface ITypographyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnnotationAlternatesProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetAnnotationAlternates(element: DependencyObject?): Int

  @InterfaceMethod(2)
  public fun SetAnnotationAlternates(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(3)
  public fun get_EastAsianExpertFormsProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetEastAsianExpertForms(element: DependencyObject?): Boolean

  @InterfaceMethod(5)
  public fun SetEastAsianExpertForms(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_EastAsianLanguageProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetEastAsianLanguage(element: DependencyObject?): FontEastAsianLanguage?

  @InterfaceMethod(8)
  public fun SetEastAsianLanguage(element: DependencyObject?, value: FontEastAsianLanguage?): Unit

  @InterfaceMethod(9)
  public fun get_EastAsianWidthsProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetEastAsianWidths(element: DependencyObject?): FontEastAsianWidths?

  @InterfaceMethod(11)
  public fun SetEastAsianWidths(element: DependencyObject?, value: FontEastAsianWidths?): Unit

  @InterfaceMethod(12)
  public fun get_StandardLigaturesProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetStandardLigatures(element: DependencyObject?): Boolean

  @InterfaceMethod(14)
  public fun SetStandardLigatures(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_ContextualLigaturesProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun GetContextualLigatures(element: DependencyObject?): Boolean

  @InterfaceMethod(17)
  public fun SetContextualLigatures(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_DiscretionaryLigaturesProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun GetDiscretionaryLigatures(element: DependencyObject?): Boolean

  @InterfaceMethod(20)
  public fun SetDiscretionaryLigatures(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(21)
  public fun get_HistoricalLigaturesProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun GetHistoricalLigatures(element: DependencyObject?): Boolean

  @InterfaceMethod(23)
  public fun SetHistoricalLigatures(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_StandardSwashesProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun GetStandardSwashes(element: DependencyObject?): Int

  @InterfaceMethod(26)
  public fun SetStandardSwashes(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(27)
  public fun get_ContextualSwashesProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun GetContextualSwashes(element: DependencyObject?): Int

  @InterfaceMethod(29)
  public fun SetContextualSwashes(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(30)
  public fun get_ContextualAlternatesProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun GetContextualAlternates(element: DependencyObject?): Boolean

  @InterfaceMethod(32)
  public fun SetContextualAlternates(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(33)
  public fun get_StylisticAlternatesProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun GetStylisticAlternates(element: DependencyObject?): Int

  @InterfaceMethod(35)
  public fun SetStylisticAlternates(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(36)
  public fun get_StylisticSet1Property(): DependencyProperty?

  @InterfaceMethod(37)
  public fun GetStylisticSet1(element: DependencyObject?): Boolean

  @InterfaceMethod(38)
  public fun SetStylisticSet1(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(39)
  public fun get_StylisticSet2Property(): DependencyProperty?

  @InterfaceMethod(40)
  public fun GetStylisticSet2(element: DependencyObject?): Boolean

  @InterfaceMethod(41)
  public fun SetStylisticSet2(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(42)
  public fun get_StylisticSet3Property(): DependencyProperty?

  @InterfaceMethod(43)
  public fun GetStylisticSet3(element: DependencyObject?): Boolean

  @InterfaceMethod(44)
  public fun SetStylisticSet3(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(45)
  public fun get_StylisticSet4Property(): DependencyProperty?

  @InterfaceMethod(46)
  public fun GetStylisticSet4(element: DependencyObject?): Boolean

  @InterfaceMethod(47)
  public fun SetStylisticSet4(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(48)
  public fun get_StylisticSet5Property(): DependencyProperty?

  @InterfaceMethod(49)
  public fun GetStylisticSet5(element: DependencyObject?): Boolean

  @InterfaceMethod(50)
  public fun SetStylisticSet5(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(51)
  public fun get_StylisticSet6Property(): DependencyProperty?

  @InterfaceMethod(52)
  public fun GetStylisticSet6(element: DependencyObject?): Boolean

  @InterfaceMethod(53)
  public fun SetStylisticSet6(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(54)
  public fun get_StylisticSet7Property(): DependencyProperty?

  @InterfaceMethod(55)
  public fun GetStylisticSet7(element: DependencyObject?): Boolean

  @InterfaceMethod(56)
  public fun SetStylisticSet7(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(57)
  public fun get_StylisticSet8Property(): DependencyProperty?

  @InterfaceMethod(58)
  public fun GetStylisticSet8(element: DependencyObject?): Boolean

  @InterfaceMethod(59)
  public fun SetStylisticSet8(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(60)
  public fun get_StylisticSet9Property(): DependencyProperty?

  @InterfaceMethod(61)
  public fun GetStylisticSet9(element: DependencyObject?): Boolean

  @InterfaceMethod(62)
  public fun SetStylisticSet9(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(63)
  public fun get_StylisticSet10Property(): DependencyProperty?

  @InterfaceMethod(64)
  public fun GetStylisticSet10(element: DependencyObject?): Boolean

  @InterfaceMethod(65)
  public fun SetStylisticSet10(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(66)
  public fun get_StylisticSet11Property(): DependencyProperty?

  @InterfaceMethod(67)
  public fun GetStylisticSet11(element: DependencyObject?): Boolean

  @InterfaceMethod(68)
  public fun SetStylisticSet11(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(69)
  public fun get_StylisticSet12Property(): DependencyProperty?

  @InterfaceMethod(70)
  public fun GetStylisticSet12(element: DependencyObject?): Boolean

  @InterfaceMethod(71)
  public fun SetStylisticSet12(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(72)
  public fun get_StylisticSet13Property(): DependencyProperty?

  @InterfaceMethod(73)
  public fun GetStylisticSet13(element: DependencyObject?): Boolean

  @InterfaceMethod(74)
  public fun SetStylisticSet13(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(75)
  public fun get_StylisticSet14Property(): DependencyProperty?

  @InterfaceMethod(76)
  public fun GetStylisticSet14(element: DependencyObject?): Boolean

  @InterfaceMethod(77)
  public fun SetStylisticSet14(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(78)
  public fun get_StylisticSet15Property(): DependencyProperty?

  @InterfaceMethod(79)
  public fun GetStylisticSet15(element: DependencyObject?): Boolean

  @InterfaceMethod(80)
  public fun SetStylisticSet15(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(81)
  public fun get_StylisticSet16Property(): DependencyProperty?

  @InterfaceMethod(82)
  public fun GetStylisticSet16(element: DependencyObject?): Boolean

  @InterfaceMethod(83)
  public fun SetStylisticSet16(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(84)
  public fun get_StylisticSet17Property(): DependencyProperty?

  @InterfaceMethod(85)
  public fun GetStylisticSet17(element: DependencyObject?): Boolean

  @InterfaceMethod(86)
  public fun SetStylisticSet17(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(87)
  public fun get_StylisticSet18Property(): DependencyProperty?

  @InterfaceMethod(88)
  public fun GetStylisticSet18(element: DependencyObject?): Boolean

  @InterfaceMethod(89)
  public fun SetStylisticSet18(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(90)
  public fun get_StylisticSet19Property(): DependencyProperty?

  @InterfaceMethod(91)
  public fun GetStylisticSet19(element: DependencyObject?): Boolean

  @InterfaceMethod(92)
  public fun SetStylisticSet19(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(93)
  public fun get_StylisticSet20Property(): DependencyProperty?

  @InterfaceMethod(94)
  public fun GetStylisticSet20(element: DependencyObject?): Boolean

  @InterfaceMethod(95)
  public fun SetStylisticSet20(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(96)
  public fun get_CapitalsProperty(): DependencyProperty?

  @InterfaceMethod(97)
  public fun GetCapitals(element: DependencyObject?): FontCapitals?

  @InterfaceMethod(98)
  public fun SetCapitals(element: DependencyObject?, value: FontCapitals?): Unit

  @InterfaceMethod(99)
  public fun get_CapitalSpacingProperty(): DependencyProperty?

  @InterfaceMethod(100)
  public fun GetCapitalSpacing(element: DependencyObject?): Boolean

  @InterfaceMethod(101)
  public fun SetCapitalSpacing(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(102)
  public fun get_KerningProperty(): DependencyProperty?

  @InterfaceMethod(103)
  public fun GetKerning(element: DependencyObject?): Boolean

  @InterfaceMethod(104)
  public fun SetKerning(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(105)
  public fun get_CaseSensitiveFormsProperty(): DependencyProperty?

  @InterfaceMethod(106)
  public fun GetCaseSensitiveForms(element: DependencyObject?): Boolean

  @InterfaceMethod(107)
  public fun SetCaseSensitiveForms(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(108)
  public fun get_HistoricalFormsProperty(): DependencyProperty?

  @InterfaceMethod(109)
  public fun GetHistoricalForms(element: DependencyObject?): Boolean

  @InterfaceMethod(110)
  public fun SetHistoricalForms(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(111)
  public fun get_FractionProperty(): DependencyProperty?

  @InterfaceMethod(112)
  public fun GetFraction(element: DependencyObject?): FontFraction?

  @InterfaceMethod(113)
  public fun SetFraction(element: DependencyObject?, value: FontFraction?): Unit

  @InterfaceMethod(114)
  public fun get_NumeralStyleProperty(): DependencyProperty?

  @InterfaceMethod(115)
  public fun GetNumeralStyle(element: DependencyObject?): FontNumeralStyle?

  @InterfaceMethod(116)
  public fun SetNumeralStyle(element: DependencyObject?, value: FontNumeralStyle?): Unit

  @InterfaceMethod(117)
  public fun get_NumeralAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(118)
  public fun GetNumeralAlignment(element: DependencyObject?): FontNumeralAlignment?

  @InterfaceMethod(119)
  public fun SetNumeralAlignment(element: DependencyObject?, value: FontNumeralAlignment?): Unit

  @InterfaceMethod(120)
  public fun get_SlashedZeroProperty(): DependencyProperty?

  @InterfaceMethod(121)
  public fun GetSlashedZero(element: DependencyObject?): Boolean

  @InterfaceMethod(122)
  public fun SetSlashedZero(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(123)
  public fun get_MathematicalGreekProperty(): DependencyProperty?

  @InterfaceMethod(124)
  public fun GetMathematicalGreek(element: DependencyObject?): Boolean

  @InterfaceMethod(125)
  public fun SetMathematicalGreek(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(126)
  public fun get_VariantsProperty(): DependencyProperty?

  @InterfaceMethod(127)
  public fun GetVariants(element: DependencyObject?): FontVariants?

  @InterfaceMethod(128)
  public fun SetVariants(element: DependencyObject?, value: FontVariants?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITypographyStatics> {
    public override fun getValue() = ABI.makeITypographyStatics(pointer.getPointer(0))

    public fun setValue(value: ITypographyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITypographyStatics {
    public val __2076074386_Ptr: Pointer?

    public val _2076074386_VtblPtr: Pointer?
      get() = __2076074386_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnnotationAlternatesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAnnotationAlternates(element: DependencyObject?): Int {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetAnnotationAlternates(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_EastAsianExpertFormsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetEastAsianExpertForms(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetEastAsianExpertForms(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EastAsianLanguageProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetEastAsianLanguage(element: DependencyObject?): FontEastAsianLanguage? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontEastAsianLanguage>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontEastAsianLanguage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetEastAsianLanguage(element: DependencyObject?,
        value: FontEastAsianLanguage?): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_EastAsianWidthsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetEastAsianWidths(element: DependencyObject?): FontEastAsianWidths? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontEastAsianWidths>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontEastAsianWidths>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetEastAsianWidths(element: DependencyObject?, value: FontEastAsianWidths?):
        Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_StandardLigaturesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetStandardLigatures(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun SetStandardLigatures(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ContextualLigaturesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetContextualLigatures(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun SetContextualLigatures(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_DiscretionaryLigaturesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetDiscretionaryLigatures(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun SetDiscretionaryLigatures(element: DependencyObject?, value: Boolean):
        Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_HistoricalLigaturesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetHistoricalLigatures(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun SetHistoricalLigatures(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_StandardSwashesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetStandardSwashes(element: DependencyObject?): Int {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun SetStandardSwashes(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_ContextualSwashesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetContextualSwashes(element: DependencyObject?): Int {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun SetContextualSwashes(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_ContextualAlternatesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun GetContextualAlternates(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun SetContextualAlternates(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_StylisticAlternatesProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun GetStylisticAlternates(element: DependencyObject?): Int {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun SetStylisticAlternates(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_StylisticSet1Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun GetStylisticSet1(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun SetStylisticSet1(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_StylisticSet2Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun GetStylisticSet2(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun SetStylisticSet2(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_StylisticSet3Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun GetStylisticSet3(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(44)
    public override fun SetStylisticSet3(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_StylisticSet4Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun GetStylisticSet4(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun SetStylisticSet4(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_StylisticSet5Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun GetStylisticSet5(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(50)
    public override fun SetStylisticSet5(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun get_StylisticSet6Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun GetStylisticSet6(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(53)
    public override fun SetStylisticSet6(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_StylisticSet7Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun GetStylisticSet7(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(56)
    public override fun SetStylisticSet7(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun get_StylisticSet8Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun GetStylisticSet8(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(59)
    public override fun SetStylisticSet8(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun get_StylisticSet9Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun GetStylisticSet9(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(62)
    public override fun SetStylisticSet9(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun get_StylisticSet10Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun GetStylisticSet10(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(65)
    public override fun SetStylisticSet10(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun get_StylisticSet11Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun GetStylisticSet11(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(68)
    public override fun SetStylisticSet11(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(69)
    public override fun get_StylisticSet12Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun GetStylisticSet12(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(71)
    public override fun SetStylisticSet12(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun get_StylisticSet13Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun GetStylisticSet13(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(74)
    public override fun SetStylisticSet13(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun get_StylisticSet14Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(76)
    public override fun GetStylisticSet14(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(77)
    public override fun SetStylisticSet14(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun get_StylisticSet15Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(79)
    public override fun GetStylisticSet15(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(80)
    public override fun SetStylisticSet15(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(81)
    public override fun get_StylisticSet16Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(82)
    public override fun GetStylisticSet16(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(83)
    public override fun SetStylisticSet16(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(84)
    public override fun get_StylisticSet17Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(85)
    public override fun GetStylisticSet17(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(86)
    public override fun SetStylisticSet17(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(87)
    public override fun get_StylisticSet18Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(88)
    public override fun GetStylisticSet18(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(89)
    public override fun SetStylisticSet18(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun get_StylisticSet19Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(91)
    public override fun GetStylisticSet19(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(92)
    public override fun SetStylisticSet19(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(93)
    public override fun get_StylisticSet20Property(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(94)
    public override fun GetStylisticSet20(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(95)
    public override fun SetStylisticSet20(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(96)
    public override fun get_CapitalsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(102L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(97)
    public override fun GetCapitals(element: DependencyObject?): FontCapitals? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(103L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontCapitals>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontCapitals>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(98)
    public override fun SetCapitals(element: DependencyObject?, value: FontCapitals?): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(104L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(99)
    public override fun get_CapitalSpacingProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(105L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(100)
    public override fun GetCapitalSpacing(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(106L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(101)
    public override fun SetCapitalSpacing(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(107L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(102)
    public override fun get_KerningProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(108L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(103)
    public override fun GetKerning(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(109L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(104)
    public override fun SetKerning(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(110L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(105)
    public override fun get_CaseSensitiveFormsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(111L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(106)
    public override fun GetCaseSensitiveForms(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(112L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(107)
    public override fun SetCaseSensitiveForms(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(113L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(108)
    public override fun get_HistoricalFormsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(114L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(109)
    public override fun GetHistoricalForms(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(115L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(110)
    public override fun SetHistoricalForms(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(116L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(111)
    public override fun get_FractionProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(117L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(112)
    public override fun GetFraction(element: DependencyObject?): FontFraction? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(118L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFraction>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFraction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(113)
    public override fun SetFraction(element: DependencyObject?, value: FontFraction?): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(119L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(114)
    public override fun get_NumeralStyleProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(120L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(115)
    public override fun GetNumeralStyle(element: DependencyObject?): FontNumeralStyle? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(121L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontNumeralStyle>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontNumeralStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(116)
    public override fun SetNumeralStyle(element: DependencyObject?, value: FontNumeralStyle?):
        Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(122L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(117)
    public override fun get_NumeralAlignmentProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(123L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(118)
    public override fun GetNumeralAlignment(element: DependencyObject?): FontNumeralAlignment? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(124L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontNumeralAlignment>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontNumeralAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(119)
    public override fun SetNumeralAlignment(element: DependencyObject?,
        value: FontNumeralAlignment?): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(125L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(120)
    public override fun get_SlashedZeroProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(126L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(121)
    public override fun GetSlashedZero(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(127L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(122)
    public override fun SetSlashedZero(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(128L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(123)
    public override fun get_MathematicalGreekProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(129L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(124)
    public override fun GetMathematicalGreek(element: DependencyObject?): Boolean {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(130L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(125)
    public override fun SetMathematicalGreek(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(131L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(126)
    public override fun get_VariantsProperty(): DependencyProperty? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(132L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(127)
    public override fun GetVariants(element: DependencyObject?): FontVariants? {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(133L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontVariants>()
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontVariants>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(128)
    public override fun SetVariants(element: DependencyObject?, value: FontVariants?): Unit {
      val fnPtr = _2076074386_VtblPtr!!.getPointer(134L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076074386_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITypographyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2076074386_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITypographyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67b9ec886c574ce095f1d4b9ed632fb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITypographyStatics(ptr: Pointer?): WithDefault = ITypographyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITypographyStatics {
      val address = segment.toRawLongValue()
      return makeITypographyStatics(Pointer(address))
    }

    public override fun toNative(obj: ITypographyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2076074386_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITypographyStatics): Array<ITypographyStatics?> =
        (elements as
        Array<ITypographyStatics?>).castToImpl<ITypographyStatics,ITypographyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITypographyStatics?> =
        arrayOfNulls<ITypographyStatics_Impl>(size) as Array<ITypographyStatics?>
  }
}
