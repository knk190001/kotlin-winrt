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

@ABIMarker(RichTextBlock.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RichTextBlock;{d766e4db-a684-50b7-a202-c8e91fa26ff3})")
@WinRTByReference(brClass = RichTextBlock.ByReference::class)
public class RichTextBlock(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IRichTextBlock.WithDefault, IWinRTObject {
  private val __898646147_Interface: IRichTextBlock.WithDefault by lazy {
    as_898646147()
  }


  public override val __898646147_Ptr: JNAPointer? by lazy {
    __898646147_Interface.__898646147_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__898646147_Interface)

  public constructor() : this(ABI.activate())

  private fun as_898646147(): IRichTextBlock.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock.ABI.makeIRichTextBlock(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock.ABI.makeIRichTextBlock(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RichTextBlock>
      {
    public override fun getValue() = RichTextBlock(pointer.getPointer(0))

    public fun setValue(value: RichTextBlock): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichTextBlock, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRichTextBlockStatics_Instance: IRichTextBlockStatics by lazy {
      createIRichTextBlockStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichTextBlock".toHandle(),
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

    public fun createIRichTextBlockStatics(): IRichTextBlockStatics {
      val refiid = Guid.REFIID(IRichTextBlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics.ABI.makeIRichTextBlockStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RichTextBlock {
      val address = segment.toRawLongValue()
      return RichTextBlock(Pointer(address))
    }

    public override fun toNative(obj: RichTextBlock): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FontSizeProperty() = ABI.IRichTextBlockStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() =
        ABI.IRichTextBlockStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() =
        ABI.IRichTextBlockStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.IRichTextBlockStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() =
        ABI.IRichTextBlockStatics_Instance.get_FontStretchProperty()

    public fun get_ForegroundProperty() =
        ABI.IRichTextBlockStatics_Instance.get_ForegroundProperty()

    public fun get_TextWrappingProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextWrappingProperty()

    public fun get_TextTrimmingProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextTrimmingProperty()

    public fun get_TextAlignmentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextAlignmentProperty()

    public fun get_PaddingProperty() = ABI.IRichTextBlockStatics_Instance.get_PaddingProperty()

    public fun get_LineHeightProperty() =
        ABI.IRichTextBlockStatics_Instance.get_LineHeightProperty()

    public fun get_LineStackingStrategyProperty() =
        ABI.IRichTextBlockStatics_Instance.get_LineStackingStrategyProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.IRichTextBlockStatics_Instance.get_CharacterSpacingProperty()

    public fun get_OverflowContentTargetProperty() =
        ABI.IRichTextBlockStatics_Instance.get_OverflowContentTargetProperty()

    public fun get_IsTextSelectionEnabledProperty() =
        ABI.IRichTextBlockStatics_Instance.get_IsTextSelectionEnabledProperty()

    public fun get_HasOverflowContentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_HasOverflowContentProperty()

    public fun get_SelectedTextProperty() =
        ABI.IRichTextBlockStatics_Instance.get_SelectedTextProperty()

    public fun get_MaxLinesProperty() = ABI.IRichTextBlockStatics_Instance.get_MaxLinesProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextLineBoundsProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IRichTextBlockStatics_Instance.get_SelectionHighlightColorProperty()

    public fun get_OpticalMarginAlignmentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.IRichTextBlockStatics_Instance.get_IsColorFontEnabledProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextReadingOrderProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IRichTextBlockStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_TextDecorationsProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextDecorationsProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.IRichTextBlockStatics_Instance.get_IsTextTrimmedProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IRichTextBlockStatics_Instance.get_SelectionFlyoutProperty()

    public fun get_TextIndentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextIndentProperty()
  }
}
