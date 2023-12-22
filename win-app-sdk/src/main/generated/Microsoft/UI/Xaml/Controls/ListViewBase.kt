package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IListViewBaseFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(ListViewBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ListViewBase;{775c57ac-abce-5beb-8e34-3b8158aedd80})")
@WinRTByReference(brClass = ListViewBase.ByReference::class)
public open class ListViewBase(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IListViewBase.WithDefault, ISemanticZoomInformation.WithDefault, IWinRTObject {
  private val __1085197595_Interface: IListViewBase.WithDefault by lazy {
    as_1085197595()
  }


  private val __685461260_Interface: ISemanticZoomInformation.WithDefault by lazy {
    as_685461260()
  }


  public override val __1085197595_Ptr: JNAPointer? by lazy {
    __1085197595_Interface.__1085197595_Ptr
  }


  public override val __685461260_Ptr: JNAPointer? by lazy {
    __685461260_Interface.__685461260_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1085197595_Interface, __685461260_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1085197595(): IListViewBase.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase.ABI.makeIListViewBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase.ABI.makeIListViewBase(ref.value))
  }

  private fun as_685461260(): ISemanticZoomInformation.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoomInformation.ABI.makeISemanticZoomInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoomInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoomInformation.ABI.makeISemanticZoomInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ListViewBase> {
    public override fun getValue() = ListViewBase(pointer.getPointer(0))

    public fun setValue(value: ListViewBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewBase, MemoryAddress> {
    public val IListViewBaseStatics_Instance: IListViewBaseStatics by lazy {
      createIListViewBaseStatics()
    }


    public val IListViewBaseFactory_Instance: IListViewBaseFactory by lazy {
      createIListViewBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewBaseStatics(): IListViewBaseStatics {
      val refiid = Guid.REFIID(IListViewBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics.ABI.makeIListViewBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseFactory(): IListViewBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewBaseFactory.ABI.makeIListViewBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListViewBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewBase {
      val address = segment.toRawLongValue()
      return ListViewBase(Pointer(address))
    }

    public override fun toNative(obj: ListViewBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectionModeProperty() =
        ABI.IListViewBaseStatics_Instance.get_SelectionModeProperty()

    public fun get_IsSwipeEnabledProperty() =
        ABI.IListViewBaseStatics_Instance.get_IsSwipeEnabledProperty()

    public fun get_CanDragItemsProperty() =
        ABI.IListViewBaseStatics_Instance.get_CanDragItemsProperty()

    public fun get_CanReorderItemsProperty() =
        ABI.IListViewBaseStatics_Instance.get_CanReorderItemsProperty()

    public fun get_IsItemClickEnabledProperty() =
        ABI.IListViewBaseStatics_Instance.get_IsItemClickEnabledProperty()

    public fun get_DataFetchSizeProperty() =
        ABI.IListViewBaseStatics_Instance.get_DataFetchSizeProperty()

    public fun get_IncrementalLoadingThresholdProperty() =
        ABI.IListViewBaseStatics_Instance.get_IncrementalLoadingThresholdProperty()

    public fun get_IncrementalLoadingTriggerProperty() =
        ABI.IListViewBaseStatics_Instance.get_IncrementalLoadingTriggerProperty()

    public fun get_ShowsScrollingPlaceholdersProperty() =
        ABI.IListViewBaseStatics_Instance.get_ShowsScrollingPlaceholdersProperty()

    public fun get_ReorderModeProperty() =
        ABI.IListViewBaseStatics_Instance.get_ReorderModeProperty()

    public fun get_IsMultiSelectCheckBoxEnabledProperty() =
        ABI.IListViewBaseStatics_Instance.get_IsMultiSelectCheckBoxEnabledProperty()

    public fun get_SingleSelectionFollowsFocusProperty() =
        ABI.IListViewBaseStatics_Instance.get_SingleSelectionFollowsFocusProperty()

    public fun get_SemanticZoomOwnerProperty() =
        ABI.IListViewBaseStatics_Instance.get_SemanticZoomOwnerProperty()

    public fun get_IsActiveViewProperty() =
        ABI.IListViewBaseStatics_Instance.get_IsActiveViewProperty()

    public fun get_IsZoomedInViewProperty() =
        ABI.IListViewBaseStatics_Instance.get_IsZoomedInViewProperty()

    public fun get_HeaderProperty() = ABI.IListViewBaseStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IListViewBaseStatics_Instance.get_HeaderTemplateProperty()

    public fun get_HeaderTransitionsProperty() =
        ABI.IListViewBaseStatics_Instance.get_HeaderTransitionsProperty()

    public fun get_FooterProperty() = ABI.IListViewBaseStatics_Instance.get_FooterProperty()

    public fun get_FooterTemplateProperty() =
        ABI.IListViewBaseStatics_Instance.get_FooterTemplateProperty()

    public fun get_FooterTransitionsProperty() =
        ABI.IListViewBaseStatics_Instance.get_FooterTransitionsProperty()
  }
}
