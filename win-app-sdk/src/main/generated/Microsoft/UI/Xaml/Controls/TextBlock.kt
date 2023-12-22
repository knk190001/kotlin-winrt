package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TextBlock.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextBlock;{1ac8d84f-392c-5c7e-83f5-a53e3bf0abb0})")
@WinRTByReference(brClass = TextBlock.ByReference::class)
public class TextBlock(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), ITextBlock.WithDefault, IWinRTObject {
  private val __1647213191_Interface: ITextBlock.WithDefault by lazy {
    as_1647213191()
  }


  public override val __1647213191_Ptr: JNAPointer? by lazy {
    __1647213191_Interface.__1647213191_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1647213191_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1647213191(): ITextBlock.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock.ABI.makeITextBlock(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock.ABI.makeITextBlock(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextBlock> {
    public override fun getValue() = TextBlock(pointer.getPointer(0))

    public fun setValue(value: TextBlock): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBlock, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITextBlockStatics_Instance: ITextBlockStatics by lazy {
      createITextBlockStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TextBlock".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createITextBlockStatics(): ITextBlockStatics {
      val refiid = Guid.REFIID(ITextBlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics.ABI.makeITextBlockStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TextBlock {
      val address = segment.toRawLongValue()
      return TextBlock(Pointer(address))
    }

    public override fun toNative(obj: TextBlock): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FontSizeProperty() = ABI.ITextBlockStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() = ABI.ITextBlockStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() = ABI.ITextBlockStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.ITextBlockStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() = ABI.ITextBlockStatics_Instance.get_FontStretchProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.ITextBlockStatics_Instance.get_CharacterSpacingProperty()

    public fun get_ForegroundProperty() = ABI.ITextBlockStatics_Instance.get_ForegroundProperty()

    public fun get_TextWrappingProperty() =
        ABI.ITextBlockStatics_Instance.get_TextWrappingProperty()

    public fun get_TextTrimmingProperty() =
        ABI.ITextBlockStatics_Instance.get_TextTrimmingProperty()

    public fun get_TextAlignmentProperty() =
        ABI.ITextBlockStatics_Instance.get_TextAlignmentProperty()

    public fun get_TextProperty() = ABI.ITextBlockStatics_Instance.get_TextProperty()

    public fun get_PaddingProperty() = ABI.ITextBlockStatics_Instance.get_PaddingProperty()

    public fun get_LineHeightProperty() = ABI.ITextBlockStatics_Instance.get_LineHeightProperty()

    public fun get_LineStackingStrategyProperty() =
        ABI.ITextBlockStatics_Instance.get_LineStackingStrategyProperty()

    public fun get_IsTextSelectionEnabledProperty() =
        ABI.ITextBlockStatics_Instance.get_IsTextSelectionEnabledProperty()

    public fun get_SelectedTextProperty() =
        ABI.ITextBlockStatics_Instance.get_SelectedTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.ITextBlockStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_MaxLinesProperty() = ABI.ITextBlockStatics_Instance.get_MaxLinesProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.ITextBlockStatics_Instance.get_TextLineBoundsProperty()

    public fun get_OpticalMarginAlignmentProperty() =
        ABI.ITextBlockStatics_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.ITextBlockStatics_Instance.get_IsColorFontEnabledProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.ITextBlockStatics_Instance.get_TextReadingOrderProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.ITextBlockStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_TextDecorationsProperty() =
        ABI.ITextBlockStatics_Instance.get_TextDecorationsProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.ITextBlockStatics_Instance.get_IsTextTrimmedProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.ITextBlockStatics_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.ITextBlockStatics_Instance.get_SelectionFlyoutProperty()
  }
}
