package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.FontCapitals
import Windows.UI.Xaml.FontEastAsianLanguage
import Windows.UI.Xaml.FontEastAsianWidths
import Windows.UI.Xaml.FontFraction
import Windows.UI.Xaml.FontNumeralAlignment
import Windows.UI.Xaml.FontNumeralStyle
import Windows.UI.Xaml.FontVariants
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Typography.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.Typography;{866f65d5-ea97-42ab-9288-9c01aebc7a97})")
@WinRTByReference(brClass = Typography.ByReference::class)
public class Typography(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITypography.WithDefault, IWinRTObject {
  private val __980097367_Interface: ITypography.WithDefault by lazy {
    as_980097367()
  }


  public override val __980097367_Ptr: JNAPointer? by lazy {
    __980097367_Interface.__980097367_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__980097367_Interface)

  private fun as_980097367(): ITypography.WithDefault {
    if(pointer == NULL) {
      return(ITypography.ABI.makeITypography(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITypography>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITypography.ABI.makeITypography(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Typography> {
    public override fun getValue() = Typography(pointer.getPointer(0))

    public fun setValue(value: Typography): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Typography, MemoryAddress> {
    public val ITypographyStatics_Instance: ITypographyStatics by lazy {
      createITypographyStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITypographyStatics(): ITypographyStatics {
      val refiid = Guid.REFIID(ITypographyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Typography".toHandle(),refiid,interfacePtr)
      val result = ITypographyStatics.ABI.makeITypographyStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Typography {
      val address = segment.toRawLongValue()
      return Typography(Pointer(address))
    }

    public override fun toNative(obj: Typography): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AnnotationAlternatesProperty() =
        ABI.ITypographyStatics_Instance.get_AnnotationAlternatesProperty()

    public fun GetAnnotationAlternates(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetAnnotationAlternates(element)

    public fun SetAnnotationAlternates(element: DependencyObject, value: Int) =
        ABI.ITypographyStatics_Instance.SetAnnotationAlternates(element, value)

    public fun get_EastAsianExpertFormsProperty() =
        ABI.ITypographyStatics_Instance.get_EastAsianExpertFormsProperty()

    public fun GetEastAsianExpertForms(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetEastAsianExpertForms(element)

    public fun SetEastAsianExpertForms(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetEastAsianExpertForms(element, value)

    public fun get_EastAsianLanguageProperty() =
        ABI.ITypographyStatics_Instance.get_EastAsianLanguageProperty()

    public fun GetEastAsianLanguage(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetEastAsianLanguage(element)

    public fun SetEastAsianLanguage(element: DependencyObject, value: FontEastAsianLanguage) =
        ABI.ITypographyStatics_Instance.SetEastAsianLanguage(element, value)

    public fun get_EastAsianWidthsProperty() =
        ABI.ITypographyStatics_Instance.get_EastAsianWidthsProperty()

    public fun GetEastAsianWidths(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetEastAsianWidths(element)

    public fun SetEastAsianWidths(element: DependencyObject, value: FontEastAsianWidths) =
        ABI.ITypographyStatics_Instance.SetEastAsianWidths(element, value)

    public fun get_StandardLigaturesProperty() =
        ABI.ITypographyStatics_Instance.get_StandardLigaturesProperty()

    public fun GetStandardLigatures(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStandardLigatures(element)

    public fun SetStandardLigatures(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStandardLigatures(element, value)

    public fun get_ContextualLigaturesProperty() =
        ABI.ITypographyStatics_Instance.get_ContextualLigaturesProperty()

    public fun GetContextualLigatures(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetContextualLigatures(element)

    public fun SetContextualLigatures(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetContextualLigatures(element, value)

    public fun get_DiscretionaryLigaturesProperty() =
        ABI.ITypographyStatics_Instance.get_DiscretionaryLigaturesProperty()

    public fun GetDiscretionaryLigatures(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetDiscretionaryLigatures(element)

    public fun SetDiscretionaryLigatures(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetDiscretionaryLigatures(element, value)

    public fun get_HistoricalLigaturesProperty() =
        ABI.ITypographyStatics_Instance.get_HistoricalLigaturesProperty()

    public fun GetHistoricalLigatures(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetHistoricalLigatures(element)

    public fun SetHistoricalLigatures(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetHistoricalLigatures(element, value)

    public fun get_StandardSwashesProperty() =
        ABI.ITypographyStatics_Instance.get_StandardSwashesProperty()

    public fun GetStandardSwashes(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStandardSwashes(element)

    public fun SetStandardSwashes(element: DependencyObject, value: Int) =
        ABI.ITypographyStatics_Instance.SetStandardSwashes(element, value)

    public fun get_ContextualSwashesProperty() =
        ABI.ITypographyStatics_Instance.get_ContextualSwashesProperty()

    public fun GetContextualSwashes(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetContextualSwashes(element)

    public fun SetContextualSwashes(element: DependencyObject, value: Int) =
        ABI.ITypographyStatics_Instance.SetContextualSwashes(element, value)

    public fun get_ContextualAlternatesProperty() =
        ABI.ITypographyStatics_Instance.get_ContextualAlternatesProperty()

    public fun GetContextualAlternates(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetContextualAlternates(element)

    public fun SetContextualAlternates(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetContextualAlternates(element, value)

    public fun get_StylisticAlternatesProperty() =
        ABI.ITypographyStatics_Instance.get_StylisticAlternatesProperty()

    public fun GetStylisticAlternates(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticAlternates(element)

    public fun SetStylisticAlternates(element: DependencyObject, value: Int) =
        ABI.ITypographyStatics_Instance.SetStylisticAlternates(element, value)

    public fun get_StylisticSet1Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet1Property()

    public fun GetStylisticSet1(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet1(element)

    public fun SetStylisticSet1(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet1(element, value)

    public fun get_StylisticSet2Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet2Property()

    public fun GetStylisticSet2(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet2(element)

    public fun SetStylisticSet2(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet2(element, value)

    public fun get_StylisticSet3Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet3Property()

    public fun GetStylisticSet3(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet3(element)

    public fun SetStylisticSet3(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet3(element, value)

    public fun get_StylisticSet4Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet4Property()

    public fun GetStylisticSet4(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet4(element)

    public fun SetStylisticSet4(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet4(element, value)

    public fun get_StylisticSet5Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet5Property()

    public fun GetStylisticSet5(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet5(element)

    public fun SetStylisticSet5(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet5(element, value)

    public fun get_StylisticSet6Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet6Property()

    public fun GetStylisticSet6(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet6(element)

    public fun SetStylisticSet6(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet6(element, value)

    public fun get_StylisticSet7Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet7Property()

    public fun GetStylisticSet7(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet7(element)

    public fun SetStylisticSet7(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet7(element, value)

    public fun get_StylisticSet8Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet8Property()

    public fun GetStylisticSet8(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet8(element)

    public fun SetStylisticSet8(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet8(element, value)

    public fun get_StylisticSet9Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet9Property()

    public fun GetStylisticSet9(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet9(element)

    public fun SetStylisticSet9(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet9(element, value)

    public fun get_StylisticSet10Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet10Property()

    public fun GetStylisticSet10(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet10(element)

    public fun SetStylisticSet10(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet10(element, value)

    public fun get_StylisticSet11Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet11Property()

    public fun GetStylisticSet11(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet11(element)

    public fun SetStylisticSet11(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet11(element, value)

    public fun get_StylisticSet12Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet12Property()

    public fun GetStylisticSet12(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet12(element)

    public fun SetStylisticSet12(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet12(element, value)

    public fun get_StylisticSet13Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet13Property()

    public fun GetStylisticSet13(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet13(element)

    public fun SetStylisticSet13(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet13(element, value)

    public fun get_StylisticSet14Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet14Property()

    public fun GetStylisticSet14(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet14(element)

    public fun SetStylisticSet14(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet14(element, value)

    public fun get_StylisticSet15Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet15Property()

    public fun GetStylisticSet15(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet15(element)

    public fun SetStylisticSet15(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet15(element, value)

    public fun get_StylisticSet16Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet16Property()

    public fun GetStylisticSet16(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet16(element)

    public fun SetStylisticSet16(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet16(element, value)

    public fun get_StylisticSet17Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet17Property()

    public fun GetStylisticSet17(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet17(element)

    public fun SetStylisticSet17(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet17(element, value)

    public fun get_StylisticSet18Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet18Property()

    public fun GetStylisticSet18(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet18(element)

    public fun SetStylisticSet18(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet18(element, value)

    public fun get_StylisticSet19Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet19Property()

    public fun GetStylisticSet19(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet19(element)

    public fun SetStylisticSet19(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet19(element, value)

    public fun get_StylisticSet20Property() =
        ABI.ITypographyStatics_Instance.get_StylisticSet20Property()

    public fun GetStylisticSet20(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetStylisticSet20(element)

    public fun SetStylisticSet20(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetStylisticSet20(element, value)

    public fun get_CapitalsProperty() = ABI.ITypographyStatics_Instance.get_CapitalsProperty()

    public fun GetCapitals(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetCapitals(element)

    public fun SetCapitals(element: DependencyObject, value: FontCapitals) =
        ABI.ITypographyStatics_Instance.SetCapitals(element, value)

    public fun get_CapitalSpacingProperty() =
        ABI.ITypographyStatics_Instance.get_CapitalSpacingProperty()

    public fun GetCapitalSpacing(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetCapitalSpacing(element)

    public fun SetCapitalSpacing(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetCapitalSpacing(element, value)

    public fun get_KerningProperty() = ABI.ITypographyStatics_Instance.get_KerningProperty()

    public fun GetKerning(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetKerning(element)

    public fun SetKerning(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetKerning(element, value)

    public fun get_CaseSensitiveFormsProperty() =
        ABI.ITypographyStatics_Instance.get_CaseSensitiveFormsProperty()

    public fun GetCaseSensitiveForms(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetCaseSensitiveForms(element)

    public fun SetCaseSensitiveForms(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetCaseSensitiveForms(element, value)

    public fun get_HistoricalFormsProperty() =
        ABI.ITypographyStatics_Instance.get_HistoricalFormsProperty()

    public fun GetHistoricalForms(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetHistoricalForms(element)

    public fun SetHistoricalForms(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetHistoricalForms(element, value)

    public fun get_FractionProperty() = ABI.ITypographyStatics_Instance.get_FractionProperty()

    public fun GetFraction(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetFraction(element)

    public fun SetFraction(element: DependencyObject, value: FontFraction) =
        ABI.ITypographyStatics_Instance.SetFraction(element, value)

    public fun get_NumeralStyleProperty() =
        ABI.ITypographyStatics_Instance.get_NumeralStyleProperty()

    public fun GetNumeralStyle(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetNumeralStyle(element)

    public fun SetNumeralStyle(element: DependencyObject, value: FontNumeralStyle) =
        ABI.ITypographyStatics_Instance.SetNumeralStyle(element, value)

    public fun get_NumeralAlignmentProperty() =
        ABI.ITypographyStatics_Instance.get_NumeralAlignmentProperty()

    public fun GetNumeralAlignment(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetNumeralAlignment(element)

    public fun SetNumeralAlignment(element: DependencyObject, value: FontNumeralAlignment) =
        ABI.ITypographyStatics_Instance.SetNumeralAlignment(element, value)

    public fun get_SlashedZeroProperty() = ABI.ITypographyStatics_Instance.get_SlashedZeroProperty()

    public fun GetSlashedZero(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetSlashedZero(element)

    public fun SetSlashedZero(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetSlashedZero(element, value)

    public fun get_MathematicalGreekProperty() =
        ABI.ITypographyStatics_Instance.get_MathematicalGreekProperty()

    public fun GetMathematicalGreek(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetMathematicalGreek(element)

    public fun SetMathematicalGreek(element: DependencyObject, value: Boolean) =
        ABI.ITypographyStatics_Instance.SetMathematicalGreek(element, value)

    public fun get_VariantsProperty() = ABI.ITypographyStatics_Instance.get_VariantsProperty()

    public fun GetVariants(element: DependencyObject) =
        ABI.ITypographyStatics_Instance.GetVariants(element)

    public fun SetVariants(element: DependencyObject, value: FontVariants) =
        ABI.ITypographyStatics_Instance.SetVariants(element, value)
  }
}
