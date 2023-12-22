package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IContentPresenterFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentPresenter;{075e6ca8-da46-5ec6-8c64-03b3ddeaf74f})")
@WinRTByReference(brClass = ContentPresenter.ByReference::class)
public open class ContentPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IContentPresenter.WithDefault, IContentPresenterOverrides.WithDefault,
    IWinRTObject {
  private val __1418623498_Interface: IContentPresenter.WithDefault by lazy {
    as_1418623498()
  }


  private val __725267247_Interface: IContentPresenterOverrides.WithDefault by lazy {
    as_725267247()
  }


  public override val __1418623498_Ptr: JNAPointer? by lazy {
    __1418623498_Interface.__1418623498_Ptr
  }


  public override val __725267247_Ptr: JNAPointer? by lazy {
    __725267247_Interface.__725267247_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1418623498_Interface, __725267247_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1418623498(): IContentPresenter.WithDefault {
    if(pointer == NULL) {
      return(IContentPresenter.ABI.makeIContentPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentPresenter.ABI.makeIContentPresenter(ref.value))
  }

  private fun as_725267247(): IContentPresenterOverrides.WithDefault {
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
    public val IContentPresenterStatics_Instance: IContentPresenterStatics by lazy {
      createIContentPresenterStatics()
    }


    public val IContentPresenterFactory_Instance: IContentPresenterFactory by lazy {
      createIContentPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentPresenterStatics(): IContentPresenterStatics {
      val refiid = Guid.REFIID(IContentPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,interfacePtr)
      val result = IContentPresenterStatics.ABI.makeIContentPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIContentPresenterFactory(): IContentPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentPresenter".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_OpticalMarginAlignmentProperty() =
        ABI.IContentPresenterStatics_Instance.get_OpticalMarginAlignmentProperty()

    public fun get_TextLineBoundsProperty() =
        ABI.IContentPresenterStatics_Instance.get_TextLineBoundsProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IContentPresenterStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_TextWrappingProperty() =
        ABI.IContentPresenterStatics_Instance.get_TextWrappingProperty()

    public fun get_MaxLinesProperty() = ABI.IContentPresenterStatics_Instance.get_MaxLinesProperty()

    public fun get_LineStackingStrategyProperty() =
        ABI.IContentPresenterStatics_Instance.get_LineStackingStrategyProperty()

    public fun get_LineHeightProperty() =
        ABI.IContentPresenterStatics_Instance.get_LineHeightProperty()

    public fun get_BorderBrushProperty() =
        ABI.IContentPresenterStatics_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IContentPresenterStatics_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() =
        ABI.IContentPresenterStatics_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IContentPresenterStatics_Instance.get_PaddingProperty()

    public fun get_BackgroundProperty() =
        ABI.IContentPresenterStatics_Instance.get_BackgroundProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IContentPresenterStatics_Instance.get_BackgroundSizingProperty()

    public fun get_HorizontalContentAlignmentProperty() =
        ABI.IContentPresenterStatics_Instance.get_HorizontalContentAlignmentProperty()

    public fun get_VerticalContentAlignmentProperty() =
        ABI.IContentPresenterStatics_Instance.get_VerticalContentAlignmentProperty()
  }
}
