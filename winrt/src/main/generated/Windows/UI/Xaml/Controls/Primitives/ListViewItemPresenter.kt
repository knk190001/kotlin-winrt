package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.ContentPresenter
import Windows.UI.Xaml.Controls.Primitives.IListViewItemPresenterFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter;{fc8946bd-a3a2-4969-8174-25b5d3c28033})")
@WinRTByReference(brClass = ListViewItemPresenter.ByReference::class)
public open class ListViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ContentPresenter(ptr), IListViewItemPresenter.WithDefault, IListViewItemPresenter2.WithDefault,
    IListViewItemPresenter3.WithDefault, IListViewItemPresenter4.WithDefault, IWinRTObject {
  private val __322816982_Interface: IListViewItemPresenter.WithDefault by lazy {
    as_322816982()
  }


  private val __1417391900_Interface: IListViewItemPresenter2.WithDefault by lazy {
    as_1417391900()
  }


  private val __1417391901_Interface: IListViewItemPresenter3.WithDefault by lazy {
    as_1417391901()
  }


  private val __1417391902_Interface: IListViewItemPresenter4.WithDefault by lazy {
    as_1417391902()
  }


  public override val __322816982_Ptr: JNAPointer? by lazy {
    __322816982_Interface.__322816982_Ptr
  }


  public override val __1417391900_Ptr: JNAPointer? by lazy {
    __1417391900_Interface.__1417391900_Ptr
  }


  public override val __1417391901_Ptr: JNAPointer? by lazy {
    __1417391901_Interface.__1417391901_Ptr
  }


  public override val __1417391902_Ptr: JNAPointer? by lazy {
    __1417391902_Interface.__1417391902_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__322816982_Interface, __1417391900_Interface, __1417391901_Interface,
        __1417391902_Interface)

  public constructor() : this(ABI.activate())

  private fun as_322816982(): IListViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemPresenter.ABI.makeIListViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemPresenter.ABI.makeIListViewItemPresenter(ref.value))
  }

  private fun as_1417391900(): IListViewItemPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemPresenter2.ABI.makeIListViewItemPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemPresenter2.ABI.makeIListViewItemPresenter2(ref.value))
  }

  private fun as_1417391901(): IListViewItemPresenter3.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemPresenter3.ABI.makeIListViewItemPresenter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemPresenter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemPresenter3.ABI.makeIListViewItemPresenter3(ref.value))
  }

  private fun as_1417391902(): IListViewItemPresenter4.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemPresenter4.ABI.makeIListViewItemPresenter4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemPresenter4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemPresenter4.ABI.makeIListViewItemPresenter4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemPresenter> {
    public override fun getValue() = ListViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: ListViewItemPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItemPresenter, MemoryAddress> {
    public val IListViewItemPresenterStatics4_Instance: IListViewItemPresenterStatics4 by lazy {
      createIListViewItemPresenterStatics4()
    }


    public val IListViewItemPresenterStatics2_Instance: IListViewItemPresenterStatics2 by lazy {
      createIListViewItemPresenterStatics2()
    }


    public val IListViewItemPresenterStatics_Instance: IListViewItemPresenterStatics by lazy {
      createIListViewItemPresenterStatics()
    }


    public val IListViewItemPresenterStatics3_Instance: IListViewItemPresenterStatics3 by lazy {
      createIListViewItemPresenterStatics3()
    }


    public val IListViewItemPresenterFactory_Instance: IListViewItemPresenterFactory by lazy {
      createIListViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewItemPresenterStatics4(): IListViewItemPresenterStatics4 {
      val refiid = Guid.REFIID(IListViewItemPresenterStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IListViewItemPresenterStatics4.ABI.makeIListViewItemPresenterStatics4(interfacePtr.value)
      return result
    }

    public fun createIListViewItemPresenterStatics2(): IListViewItemPresenterStatics2 {
      val refiid = Guid.REFIID(IListViewItemPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IListViewItemPresenterStatics2.ABI.makeIListViewItemPresenterStatics2(interfacePtr.value)
      return result
    }

    public fun createIListViewItemPresenterStatics(): IListViewItemPresenterStatics {
      val refiid = Guid.REFIID(IListViewItemPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IListViewItemPresenterStatics.ABI.makeIListViewItemPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIListViewItemPresenterStatics3(): IListViewItemPresenterStatics3 {
      val refiid = Guid.REFIID(IListViewItemPresenterStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IListViewItemPresenterStatics3.ABI.makeIListViewItemPresenterStatics3(interfacePtr.value)
      return result
    }

    public fun createIListViewItemPresenterFactory(): IListViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_SelectedDisabledBackgroundProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectedDisabledBackgroundProperty()

    public fun get_CheckPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckPressedBrushProperty()

    public fun get_CheckDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckDisabledBrushProperty()

    public fun get_CheckBoxPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxPointerOverBrushProperty()

    public fun get_CheckBoxPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxPressedBrushProperty()

    public fun get_CheckBoxDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxDisabledBrushProperty()

    public fun get_CheckBoxSelectedBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxSelectedBrushProperty()

    public fun get_CheckBoxSelectedPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxSelectedPointerOverBrushProperty()

    public fun get_CheckBoxSelectedPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxSelectedPressedBrushProperty()

    public fun get_CheckBoxSelectedDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxSelectedDisabledBrushProperty()

    public fun get_CheckBoxBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxBorderBrushProperty()

    public fun get_CheckBoxPointerOverBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxPointerOverBorderBrushProperty()

    public fun get_CheckBoxPressedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxPressedBorderBrushProperty()

    public fun get_CheckBoxDisabledBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxDisabledBorderBrushProperty()

    public fun get_CheckBoxCornerRadiusProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_CheckBoxCornerRadiusProperty()

    public fun get_SelectionIndicatorCornerRadiusProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorCornerRadiusProperty()

    public fun get_SelectionIndicatorVisualEnabledProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorVisualEnabledProperty()

    public fun get_SelectionIndicatorModeProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorModeProperty()

    public fun get_SelectionIndicatorBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorBrushProperty()

    public fun get_SelectionIndicatorPointerOverBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorPointerOverBrushProperty()

    public fun get_SelectionIndicatorPressedBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorPressedBrushProperty()

    public fun get_SelectionIndicatorDisabledBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectionIndicatorDisabledBrushProperty()

    public fun get_SelectedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectedBorderBrushProperty()

    public fun get_SelectedPressedBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectedPressedBorderBrushProperty()

    public fun get_SelectedDisabledBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectedDisabledBorderBrushProperty()

    public fun get_SelectedInnerBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_SelectedInnerBorderBrushProperty()

    public fun get_PointerOverBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics4_Instance.get_PointerOverBorderBrushProperty()

    public fun get_SelectedPressedBackgroundProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_SelectedPressedBackgroundProperty()

    public fun get_PressedBackgroundProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_PressedBackgroundProperty()

    public fun get_CheckBoxBrushProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_CheckBoxBrushProperty()

    public fun get_FocusSecondaryBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_FocusSecondaryBorderBrushProperty()

    public fun get_CheckModeProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_CheckModeProperty()

    public fun get_PointerOverForegroundProperty() =
        ABI.IListViewItemPresenterStatics2_Instance.get_PointerOverForegroundProperty()

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

    public fun get_RevealBackgroundProperty() =
        ABI.IListViewItemPresenterStatics3_Instance.get_RevealBackgroundProperty()

    public fun get_RevealBorderBrushProperty() =
        ABI.IListViewItemPresenterStatics3_Instance.get_RevealBorderBrushProperty()

    public fun get_RevealBorderThicknessProperty() =
        ABI.IListViewItemPresenterStatics3_Instance.get_RevealBorderThicknessProperty()

    public fun get_RevealBackgroundShowsAboveContentProperty() =
        ABI.IListViewItemPresenterStatics3_Instance.get_RevealBackgroundShowsAboveContentProperty()
  }
}
