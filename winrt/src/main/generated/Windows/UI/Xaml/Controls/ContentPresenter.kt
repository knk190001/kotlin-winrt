package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IContentPresenterFactory.ABI.IID
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

@ABIMarker(ContentPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ContentPresenter;{79fde5b4-cd37-491c-8845-daf472defff6})")
@WinRTByReference(brClass = ContentPresenter.ByReference::class)
public open class ContentPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IContentPresenter.WithDefault, IContentPresenter2.WithDefault,
    IContentPresenter3.WithDefault, IContentPresenter4.WithDefault, IContentPresenter5.WithDefault,
    IContentPresenterOverrides.WithDefault, IWinRTObject {
  private val __617428405_Interface: IContentPresenter.WithDefault by lazy {
    as_617428405()
  }


  private val __1960411321_Interface: IContentPresenter2.WithDefault by lazy {
    as_1960411321()
  }


  private val __1960411320_Interface: IContentPresenter3.WithDefault by lazy {
    as_1960411320()
  }


  private val __1960411319_Interface: IContentPresenter4.WithDefault by lazy {
    as_1960411319()
  }


  private val __1960411318_Interface: IContentPresenter5.WithDefault by lazy {
    as_1960411318()
  }


  private val __1821579292_Interface: IContentPresenterOverrides.WithDefault by lazy {
    as_1821579292()
  }


  public override val __617428405_Ptr: JNAPointer? by lazy {
    __617428405_Interface.__617428405_Ptr
  }


  public override val __1960411321_Ptr: JNAPointer? by lazy {
    __1960411321_Interface.__1960411321_Ptr
  }


  public override val __1960411320_Ptr: JNAPointer? by lazy {
    __1960411320_Interface.__1960411320_Ptr
  }


  public override val __1960411319_Ptr: JNAPointer? by lazy {
    __1960411319_Interface.__1960411319_Ptr
  }


  public override val __1960411318_Ptr: JNAPointer? by lazy {
    __1960411318_Interface.__1960411318_Ptr
  }


  public override val __1821579292_Ptr: JNAPointer? by lazy {
    __1821579292_Interface.__1821579292_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__617428405_Interface, __1960411321_Interface, __1960411320_Interface,
        __1960411319_Interface, __1960411318_Interface, __1821579292_Interface)

  public constructor() : this(ABI.activate())

  private fun as_617428405(): IContentPresenter.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter.ABI.makeIContentPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter.ABI.makeIContentPresenter(ref.value))
  }

  private fun as_1960411321(): IContentPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter2.ABI.makeIContentPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter2.ABI.makeIContentPresenter2(ref.value))
  }

  private fun as_1960411320(): IContentPresenter3.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter3.ABI.makeIContentPresenter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter3.ABI.makeIContentPresenter3(ref.value))
  }

  private fun as_1960411319(): IContentPresenter4.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter4.ABI.makeIContentPresenter4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter4.ABI.makeIContentPresenter4(ref.value))
  }

  private fun as_1960411318(): IContentPresenter5.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter5.ABI.makeIContentPresenter5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter5.ABI.makeIContentPresenter5(ref.value))
  }

  private fun as_1821579292(): IContentPresenterOverrides.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenterOverrides.ABI.makeIContentPresenterOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenterOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenterOverrides.ABI.makeIContentPresenterOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentPresenter> {
    public override fun getValue() = ContentPresenter(pointer.getPointer(0))

    public fun setValue(value: ContentPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentPresenter, MemoryAddress> {
    public val IContentPresenterStatics2_Instance: IContentPresenterStatics2 by lazy {
      createIContentPresenterStatics2()
    }


    public val IContentPresenterStatics_Instance: IContentPresenterStatics by lazy {
      createIContentPresenterStatics()
    }


    public val IContentPresenterStatics3_Instance: IContentPresenterStatics3 by lazy {
      createIContentPresenterStatics3()
    }


    public val IContentPresenterStatics5_Instance: IContentPresenterStatics5 by lazy {
      createIContentPresenterStatics5()
    }


    public val IContentPresenterStatics4_Instance: IContentPresenterStatics4 by lazy {
      createIContentPresenterStatics4()
    }


    public val IContentPresenterFactory_Instance: IContentPresenterFactory by lazy {
      createIContentPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentPresenterStatics2(): IContentPresenterStatics2 {
      val refiid = Guid.REFIID(IContentPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics2.ABI.makeIContentPresenterStatics2(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterStatics(): IContentPresenterStatics {
      val refiid = Guid.REFIID(IContentPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics.ABI.makeIContentPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterStatics3(): IContentPresenterStatics3 {
      val refiid = Guid.REFIID(IContentPresenterStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics3.ABI.makeIContentPresenterStatics3(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterStatics5(): IContentPresenterStatics5 {
      val refiid = Guid.REFIID(IContentPresenterStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics5.ABI.makeIContentPresenterStatics5(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterStatics4(): IContentPresenterStatics4 {
      val refiid = Guid.REFIID(IContentPresenterStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics4.ABI.makeIContentPresenterStatics4(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterFactory(): IContentPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContentPresenterFactory.ABI.makeIContentPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IContentPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContentPresenter {
      val address = segment.toRawLongValue()
      return ContentPresenter(Pointer(address))
    }

    public override fun toNative(obj: ContentPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OpticalMarginAlignmentProperty() =
        ABI.IContentPresenterStatics2_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.IContentPresenterStatics2_Instance.get_TextLineBoundsProperty()

    public fun get_ContentProperty() = ABI.IContentPresenterStatics_Instance.get_ContentProperty()

    public fun get_ContentTemplateProperty() =
        ABI.IContentPresenterStatics_Instance.get_ContentTemplateProperty()

    public fun get_ContentTemplateSelectorProperty() =
        ABI.IContentPresenterStatics_Instance.get_ContentTemplateSelectorProperty()

    public fun get_ContentTransitionsProperty() =
        ABI.IContentPresenterStatics_Instance.get_ContentTransitionsProperty()

    public fun get_FontSizeProperty() = ABI.IContentPresenterStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() =
        ABI.IContentPresenterStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() =
        ABI.IContentPresenterStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() =
        ABI.IContentPresenterStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() =
        ABI.IContentPresenterStatics_Instance.get_FontStretchProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.IContentPresenterStatics_Instance.get_CharacterSpacingProperty()

    public fun get_ForegroundProperty() =
        ABI.IContentPresenterStatics_Instance.get_ForegroundProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IContentPresenterStatics3_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IContentPresenterStatics5_Instance.get_BackgroundSizingProperty()

    public fun get_TextWrappingProperty() =
        ABI.IContentPresenterStatics4_Instance.get_TextWrappingProperty()

    public fun get_MaxLinesProperty() =
        ABI.IContentPresenterStatics4_Instance.get_MaxLinesProperty()

    public fun get_LineStackingStrategyProperty() =
        ABI.IContentPresenterStatics4_Instance.get_LineStackingStrategyProperty()

    public fun get_LineHeightProperty() =
        ABI.IContentPresenterStatics4_Instance.get_LineHeightProperty()

    public fun get_BorderBrushProperty() =
        ABI.IContentPresenterStatics4_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IContentPresenterStatics4_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() =
        ABI.IContentPresenterStatics4_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IContentPresenterStatics4_Instance.get_PaddingProperty()

    public fun get_BackgroundProperty() =
        ABI.IContentPresenterStatics4_Instance.get_BackgroundProperty()

    public fun get_HorizontalContentAlignmentProperty() =
        ABI.IContentPresenterStatics4_Instance.get_HorizontalContentAlignmentProperty()

    public fun get_VerticalContentAlignmentProperty() =
        ABI.IContentPresenterStatics4_Instance.get_VerticalContentAlignmentProperty()
  }
}
