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

@ABIMarker(RichTextBlock.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RichTextBlock;{e5fff9e2-b968-49e7-97d4-8cca2ac3ae7c})")
@WinRTByReference(brClass = RichTextBlock.ByReference::class)
public class RichTextBlock(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IRichTextBlock.WithDefault, IRichTextBlock2.WithDefault,
    IRichTextBlock3.WithDefault, IRichTextBlock4.WithDefault, IRichTextBlock5.WithDefault,
    IRichTextBlock6.WithDefault, IWinRTObject {
  private val __1014227784_Interface: IRichTextBlock.WithDefault by lazy {
    as_1014227784()
  }


  private val __1376290282_Interface: IRichTextBlock2.WithDefault by lazy {
    as_1376290282()
  }


  private val __1376290283_Interface: IRichTextBlock3.WithDefault by lazy {
    as_1376290283()
  }


  private val __1376290284_Interface: IRichTextBlock4.WithDefault by lazy {
    as_1376290284()
  }


  private val __1376290285_Interface: IRichTextBlock5.WithDefault by lazy {
    as_1376290285()
  }


  private val __1376290286_Interface: IRichTextBlock6.WithDefault by lazy {
    as_1376290286()
  }


  public override val __1014227784_Ptr: JNAPointer? by lazy {
    __1014227784_Interface.__1014227784_Ptr
  }


  public override val __1376290282_Ptr: JNAPointer? by lazy {
    __1376290282_Interface.__1376290282_Ptr
  }


  public override val __1376290283_Ptr: JNAPointer? by lazy {
    __1376290283_Interface.__1376290283_Ptr
  }


  public override val __1376290284_Ptr: JNAPointer? by lazy {
    __1376290284_Interface.__1376290284_Ptr
  }


  public override val __1376290285_Ptr: JNAPointer? by lazy {
    __1376290285_Interface.__1376290285_Ptr
  }


  public override val __1376290286_Ptr: JNAPointer? by lazy {
    __1376290286_Interface.__1376290286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1014227784_Interface, __1376290282_Interface, __1376290283_Interface,
        __1376290284_Interface, __1376290285_Interface, __1376290286_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1014227784(): IRichTextBlock.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock.ABI.makeIRichTextBlock(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock.ABI.makeIRichTextBlock(ref.value))
  }

  private fun as_1376290282(): IRichTextBlock2.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock2.ABI.makeIRichTextBlock2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock2.ABI.makeIRichTextBlock2(ref.value))
  }

  private fun as_1376290283(): IRichTextBlock3.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock3.ABI.makeIRichTextBlock3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock3.ABI.makeIRichTextBlock3(ref.value))
  }

  private fun as_1376290284(): IRichTextBlock4.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock4.ABI.makeIRichTextBlock4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock4.ABI.makeIRichTextBlock4(ref.value))
  }

  private fun as_1376290285(): IRichTextBlock5.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock5.ABI.makeIRichTextBlock5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock5.ABI.makeIRichTextBlock5(ref.value))
  }

  private fun as_1376290286(): IRichTextBlock6.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlock6.ABI.makeIRichTextBlock6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlock6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlock6.ABI.makeIRichTextBlock6(ref.value))
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


    public val IRichTextBlockStatics3_Instance: IRichTextBlockStatics3 by lazy {
      createIRichTextBlockStatics3()
    }


    public val IRichTextBlockStatics2_Instance: IRichTextBlockStatics2 by lazy {
      createIRichTextBlockStatics2()
    }


    public val IRichTextBlockStatics_Instance: IRichTextBlockStatics by lazy {
      createIRichTextBlockStatics()
    }


    public val IRichTextBlockStatics4_Instance: IRichTextBlockStatics4 by lazy {
      createIRichTextBlockStatics4()
    }


    public val IRichTextBlockStatics6_Instance: IRichTextBlockStatics6 by lazy {
      createIRichTextBlockStatics6()
    }


    public val IRichTextBlockStatics5_Instance: IRichTextBlockStatics5 by lazy {
      createIRichTextBlockStatics5()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),
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

    public fun createIRichTextBlockStatics3(): IRichTextBlockStatics3 {
      val refiid = Guid.REFIID(IRichTextBlockStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics3.ABI.makeIRichTextBlockStatics3(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockStatics2(): IRichTextBlockStatics2 {
      val refiid = Guid.REFIID(IRichTextBlockStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics2.ABI.makeIRichTextBlockStatics2(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockStatics(): IRichTextBlockStatics {
      val refiid = Guid.REFIID(IRichTextBlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics.ABI.makeIRichTextBlockStatics(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockStatics4(): IRichTextBlockStatics4 {
      val refiid = Guid.REFIID(IRichTextBlockStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics4.ABI.makeIRichTextBlockStatics4(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockStatics6(): IRichTextBlockStatics6 {
      val refiid = Guid.REFIID(IRichTextBlockStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics6.ABI.makeIRichTextBlockStatics6(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockStatics5(): IRichTextBlockStatics5 {
      val refiid = Guid.REFIID(IRichTextBlockStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlock".toHandle(),refiid,interfacePtr)
      val result = IRichTextBlockStatics5.ABI.makeIRichTextBlockStatics5(interfacePtr.value)
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
    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IRichTextBlockStatics3_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_MaxLinesProperty() = ABI.IRichTextBlockStatics2_Instance.get_MaxLinesProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.IRichTextBlockStatics2_Instance.get_TextLineBoundsProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IRichTextBlockStatics2_Instance.get_SelectionHighlightColorProperty()

    public fun get_OpticalMarginAlignmentProperty() =
        ABI.IRichTextBlockStatics2_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_IsColorFontEnabledProperty() =
        ABI.IRichTextBlockStatics2_Instance.get_IsColorFontEnabledProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IRichTextBlockStatics2_Instance.get_TextReadingOrderProperty()

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

    public fun get_TextIndentProperty() =
        ABI.IRichTextBlockStatics_Instance.get_TextIndentProperty()

    public fun get_TextDecorationsProperty() =
        ABI.IRichTextBlockStatics4_Instance.get_TextDecorationsProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IRichTextBlockStatics6_Instance.get_SelectionFlyoutProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.IRichTextBlockStatics5_Instance.get_IsTextTrimmedProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.IRichTextBlockStatics5_Instance.get_HorizontalTextAlignmentProperty()
  }
}
