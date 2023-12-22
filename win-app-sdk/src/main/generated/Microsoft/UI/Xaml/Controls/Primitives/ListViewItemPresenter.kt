package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ContentPresenter
import Microsoft.UI.Xaml.Controls.Primitives.IListViewItemPresenterFactory.ABI.IID
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

@ABIMarker(ListViewItemPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ListViewItemPresenter;{81012623-d987-5582-bc28-755a95caaf1c})")
@WinRTByReference(brClass = ListViewItemPresenter.ByReference::class)
public open class ListViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ContentPresenter(ptr), IListViewItemPresenter.WithDefault, IWinRTObject {
  private val __1642212991_Interface: IListViewItemPresenter.WithDefault by lazy {
    as_1642212991()
  }


  public override val __1642212991_Ptr: JNAPointer? by lazy {
    __1642212991_Interface.__1642212991_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1642212991_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1642212991(): IListViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemPresenter.ABI.makeIListViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemPresenter.ABI.makeIListViewItemPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemPresenter> {
    public override fun getValue() = ListViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: ListViewItemPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItemPresenter, MemoryAddress> {
    public val IListViewItemPresenterStatics_Instance: IListViewItemPresenterStatics by lazy {
      createIListViewItemPresenterStatics()
    }


    public val IListViewItemPresenterFactory_Instance: IListViewItemPresenterFactory by lazy {
      createIListViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewItemPresenterStatics(): IListViewItemPresenterStatics {
      val refiid = Guid.REFIID(IListViewItemPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IListViewItemPresenterStatics.ABI.makeIListViewItemPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIListViewItemPresenterFactory(): IListViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewItemPresenterFactory.ABI.makeIListViewItemPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListViewItemPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewItemPresenter {
      val address = segment.toRawLongValue()
      return ListViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: ListViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectionCheckMarkVisualEnabledProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionCheckMarkVisualEnabledProperty()

    public fun get_CheckHintBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckHintBrushProperty()

    public fun get_CheckSelectingBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckSelectingBrushProperty()

    public fun get_CheckBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBrushProperty()

    public fun get_DragBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_DragBackgroundProperty()

    public fun get_DragForegroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_DragForegroundProperty()

    public fun get_FocusBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_FocusBorderBrushProperty()

    public fun get_PlaceholderBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PlaceholderBackgroundProperty()

    public fun get_PointerOverBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PointerOverBackgroundProperty()

    public fun get_SelectedBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedBackgroundProperty()

    public fun get_SelectedForegroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedForegroundProperty()

    public fun get_SelectedPointerOverBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedPointerOverBackgroundProperty()

    public fun get_SelectedPointerOverBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedPointerOverBorderBrushProperty()

    public fun get_SelectedBorderThicknessProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedBorderThicknessProperty()

    public fun get_DisabledOpacityProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_DisabledOpacityProperty()

    public fun get_DragOpacityProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_DragOpacityProperty()

    public fun get_ReorderHintOffsetProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_ReorderHintOffsetProperty()

    public fun get_ListViewItemPresenterHorizontalContentAlignmentProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_ListViewItemPresenterHorizontalContentAlignmentProperty()

    public fun get_ListViewItemPresenterVerticalContentAlignmentProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_ListViewItemPresenterVerticalContentAlignmentProperty()

    public fun get_ListViewItemPresenterPaddingProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_ListViewItemPresenterPaddingProperty()

    public fun get_PointerOverBackgroundMarginProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PointerOverBackgroundMarginProperty()

    public fun get_ContentMarginProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_ContentMarginProperty()

    public fun get_SelectedPressedBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedPressedBackgroundProperty()

    public fun get_PressedBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PressedBackgroundProperty()

    public fun get_CheckBoxBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxBrushProperty()

    public fun get_FocusSecondaryBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_FocusSecondaryBorderBrushProperty()

    public fun get_CheckModeProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckModeProperty()

    public fun get_PointerOverForegroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PointerOverForegroundProperty()

    public fun get_RevealBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_RevealBackgroundProperty()

    public fun get_RevealBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_RevealBorderBrushProperty()

    public fun get_RevealBorderThicknessProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_RevealBorderThicknessProperty()

    public fun get_RevealBackgroundShowsAboveContentProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_RevealBackgroundShowsAboveContentProperty()

    public fun get_SelectedDisabledBackgroundProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedDisabledBackgroundProperty()

    public fun get_CheckPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckPressedBrushProperty()

    public fun get_CheckDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckDisabledBrushProperty()

    public fun get_CheckBoxPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxPointerOverBrushProperty()

    public fun get_CheckBoxPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxPressedBrushProperty()

    public fun get_CheckBoxDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxDisabledBrushProperty()

    public fun get_CheckBoxSelectedBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxSelectedBrushProperty()

    public fun get_CheckBoxSelectedPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxSelectedPointerOverBrushProperty()

    public fun get_CheckBoxSelectedPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxSelectedPressedBrushProperty()

    public fun get_CheckBoxSelectedDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxSelectedDisabledBrushProperty()

    public fun get_CheckBoxBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxBorderBrushProperty()

    public fun get_CheckBoxPointerOverBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxPointerOverBorderBrushProperty()

    public fun get_CheckBoxPressedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxPressedBorderBrushProperty()

    public fun get_CheckBoxDisabledBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxDisabledBorderBrushProperty()

    public fun get_CheckBoxCornerRadiusProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_CheckBoxCornerRadiusProperty()

    public fun get_SelectionIndicatorCornerRadiusProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorCornerRadiusProperty()

    public fun get_SelectionIndicatorVisualEnabledProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorVisualEnabledProperty()

    public fun get_SelectionIndicatorModeProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorModeProperty()

    public fun get_SelectionIndicatorBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorBrushProperty()

    public fun get_SelectionIndicatorPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorPointerOverBrushProperty()

    public fun get_SelectionIndicatorPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorPressedBrushProperty()

    public fun get_SelectionIndicatorDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectionIndicatorDisabledBrushProperty()

    public fun get_SelectedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedBorderBrushProperty()

    public fun get_SelectedPressedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedPressedBorderBrushProperty()

    public fun get_SelectedDisabledBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedDisabledBorderBrushProperty()

    public fun get_SelectedInnerBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_SelectedInnerBorderBrushProperty()

    public fun get_PointerOverBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics_Instance.get_PointerOverBorderBrushProperty()
  }
}
