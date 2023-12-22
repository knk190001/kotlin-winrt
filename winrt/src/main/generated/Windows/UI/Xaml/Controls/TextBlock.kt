package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkElement
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
@Signature("rc(Windows.UI.Xaml.Controls.TextBlock;{ae2d9271-3b4a-45fc-8468-f7949548f4d5})")
@WinRTByReference(brClass = TextBlock.ByReference::class)
public class TextBlock(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), ITextBlock.WithDefault, ITextBlock2.WithDefault, ITextBlock3.WithDefault,
    ITextBlock4.WithDefault, ITextBlock5.WithDefault, ITextBlock6.WithDefault,
    ITextBlock7.WithDefault, IWinRTObject {
  private val __964511428_Interface: ITextBlock.WithDefault by lazy {
    as_964511428()
  }


  private val __164916754_Interface: ITextBlock2.WithDefault by lazy {
    as_164916754()
  }


  private val __164916753_Interface: ITextBlock3.WithDefault by lazy {
    as_164916753()
  }


  private val __164916752_Interface: ITextBlock4.WithDefault by lazy {
    as_164916752()
  }


  private val __164916751_Interface: ITextBlock5.WithDefault by lazy {
    as_164916751()
  }


  private val __164916750_Interface: ITextBlock6.WithDefault by lazy {
    as_164916750()
  }


  private val __164916749_Interface: ITextBlock7.WithDefault by lazy {
    as_164916749()
  }


  public override val __964511428_Ptr: JNAPointer? by lazy {
    __964511428_Interface.__964511428_Ptr
  }


  public override val __164916754_Ptr: JNAPointer? by lazy {
    __164916754_Interface.__164916754_Ptr
  }


  public override val __164916753_Ptr: JNAPointer? by lazy {
    __164916753_Interface.__164916753_Ptr
  }


  public override val __164916752_Ptr: JNAPointer? by lazy {
    __164916752_Interface.__164916752_Ptr
  }


  public override val __164916751_Ptr: JNAPointer? by lazy {
    __164916751_Interface.__164916751_Ptr
  }


  public override val __164916750_Ptr: JNAPointer? by lazy {
    __164916750_Interface.__164916750_Ptr
  }


  public override val __164916749_Ptr: JNAPointer? by lazy {
    __164916749_Interface.__164916749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__964511428_Interface, __164916754_Interface, __164916753_Interface,
        __164916752_Interface, __164916751_Interface, __164916750_Interface, __164916749_Interface)

  public constructor() : this(ABI.activate())

  private fun as_964511428(): ITextBlock.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock.ABI.makeITextBlock(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock.ABI.makeITextBlock(ref.value))
  }

  private fun as_164916754(): ITextBlock2.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock2.ABI.makeITextBlock2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock2.ABI.makeITextBlock2(ref.value))
  }

  private fun as_164916753(): ITextBlock3.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock3.ABI.makeITextBlock3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock3.ABI.makeITextBlock3(ref.value))
  }

  private fun as_164916752(): ITextBlock4.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock4.ABI.makeITextBlock4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock4.ABI.makeITextBlock4(ref.value))
  }

  private fun as_164916751(): ITextBlock5.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock5.ABI.makeITextBlock5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock5.ABI.makeITextBlock5(ref.value))
  }

  private fun as_164916750(): ITextBlock6.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock6.ABI.makeITextBlock6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock6.ABI.makeITextBlock6(ref.value))
  }

  private fun as_164916749(): ITextBlock7.WithDefault {
    if(pointer == NULL) {
      return(ITextBlock7.ABI.makeITextBlock7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlock7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlock7.ABI.makeITextBlock7(ref.value))
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


    public val ITextBlockStatics2_Instance: ITextBlockStatics2 by lazy {
      createITextBlockStatics2()
    }


    public val ITextBlockStatics6_Instance: ITextBlockStatics6 by lazy {
      createITextBlockStatics6()
    }


    public val ITextBlockStatics7_Instance: ITextBlockStatics7 by lazy {
      createITextBlockStatics7()
    }


    public val ITextBlockStatics_Instance: ITextBlockStatics by lazy {
      createITextBlockStatics()
    }


    public val ITextBlockStatics5_Instance: ITextBlockStatics5 by lazy {
      createITextBlockStatics5()
    }


    public val ITextBlockStatics3_Instance: ITextBlockStatics3 by lazy {
      createITextBlockStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),
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

    public fun createITextBlockStatics2(): ITextBlockStatics2 {
      val refiid = Guid.REFIID(ITextBlockStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics2.ABI.makeITextBlockStatics2(interfacePtr.value)
      return result
    }

    public fun createITextBlockStatics6(): ITextBlockStatics6 {
      val refiid = Guid.REFIID(ITextBlockStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics6.ABI.makeITextBlockStatics6(interfacePtr.value)
      return result
    }

    public fun createITextBlockStatics7(): ITextBlockStatics7 {
      val refiid = Guid.REFIID(ITextBlockStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics7.ABI.makeITextBlockStatics7(interfacePtr.value)
      return result
    }

    public fun createITextBlockStatics(): ITextBlockStatics {
      val refiid = Guid.REFIID(ITextBlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics.ABI.makeITextBlockStatics(interfacePtr.value)
      return result
    }

    public fun createITextBlockStatics5(): ITextBlockStatics5 {
      val refiid = Guid.REFIID(ITextBlockStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics5.ABI.makeITextBlockStatics5(interfacePtr.value)
      return result
    }

    public fun createITextBlockStatics3(): ITextBlockStatics3 {
      val refiid = Guid.REFIID(ITextBlockStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TextBlock".toHandle(),refiid,interfacePtr)
      val result = ITextBlockStatics3.ABI.makeITextBlockStatics3(interfacePtr.value)
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
    public fun get_SelectionHighlightColorProperty() =
        ABI.ITextBlockStatics2_Instance.get_SelectionHighlightColorProperty()

    public fun get_MaxLinesProperty() = ABI.ITextBlockStatics2_Instance.get_MaxLinesProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.ITextBlockStatics2_Instance.get_TextLineBoundsProperty()

    public fun get_OpticalMarginAlignmentProperty() =
        ABI.ITextBlockStatics2_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.ITextBlockStatics2_Instance.get_IsColorFontEnabledProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.ITextBlockStatics2_Instance.get_TextReadingOrderProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.ITextBlockStatics6_Instance.get_IsTextTrimmedProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.ITextBlockStatics6_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.ITextBlockStatics7_Instance.get_SelectionFlyoutProperty()

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

    public fun get_TextDecorationsProperty() =
        ABI.ITextBlockStatics5_Instance.get_TextDecorationsProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.ITextBlockStatics3_Instance.get_IsTextScaleFactorEnabledProperty()
  }
}
