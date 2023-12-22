package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IListViewBaseFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.Selector
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
@Signature("rc(Windows.UI.Xaml.Controls.ListViewBase;{3d0813ba-6890-4537-bfe5-796d9458edd6})")
@WinRTByReference(brClass = ListViewBase.ByReference::class)
public open class ListViewBase(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IListViewBase.WithDefault, IListViewBase2.WithDefault,
    IListViewBase3.WithDefault, IListViewBase4.WithDefault, IListViewBase5.WithDefault,
    IListViewBase6.WithDefault, ISemanticZoomInformation.WithDefault, IWinRTObject {
  private val __654212112_Interface: IListViewBase.WithDefault by lazy {
    as_654212112()
  }


  private val __1194261058_Interface: IListViewBase2.WithDefault by lazy {
    as_1194261058()
  }


  private val __1194261059_Interface: IListViewBase3.WithDefault by lazy {
    as_1194261059()
  }


  private val __1194261060_Interface: IListViewBase4.WithDefault by lazy {
    as_1194261060()
  }


  private val __1194261061_Interface: IListViewBase5.WithDefault by lazy {
    as_1194261061()
  }


  private val __1194261062_Interface: IListViewBase6.WithDefault by lazy {
    as_1194261062()
  }


  private val __1000960279_Interface: ISemanticZoomInformation.WithDefault by lazy {
    as_1000960279()
  }


  public override val __654212112_Ptr: JNAPointer? by lazy {
    __654212112_Interface.__654212112_Ptr
  }


  public override val __1194261058_Ptr: JNAPointer? by lazy {
    __1194261058_Interface.__1194261058_Ptr
  }


  public override val __1194261059_Ptr: JNAPointer? by lazy {
    __1194261059_Interface.__1194261059_Ptr
  }


  public override val __1194261060_Ptr: JNAPointer? by lazy {
    __1194261060_Interface.__1194261060_Ptr
  }


  public override val __1194261061_Ptr: JNAPointer? by lazy {
    __1194261061_Interface.__1194261061_Ptr
  }


  public override val __1194261062_Ptr: JNAPointer? by lazy {
    __1194261062_Interface.__1194261062_Ptr
  }


  public override val __1000960279_Ptr: JNAPointer? by lazy {
    __1000960279_Interface.__1000960279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__654212112_Interface, __1194261058_Interface, __1194261059_Interface,
        __1194261060_Interface, __1194261061_Interface, __1194261062_Interface,
        __1000960279_Interface)

  public constructor() : this(ABI.activate())

  private fun as_654212112(): IListViewBase.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase.ABI.makeIListViewBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase.ABI.makeIListViewBase(ref.value))
  }

  private fun as_1194261058(): IListViewBase2.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase2.ABI.makeIListViewBase2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase2.ABI.makeIListViewBase2(ref.value))
  }

  private fun as_1194261059(): IListViewBase3.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase3.ABI.makeIListViewBase3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase3.ABI.makeIListViewBase3(ref.value))
  }

  private fun as_1194261060(): IListViewBase4.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase4.ABI.makeIListViewBase4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase4.ABI.makeIListViewBase4(ref.value))
  }

  private fun as_1194261061(): IListViewBase5.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase5.ABI.makeIListViewBase5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase5.ABI.makeIListViewBase5(ref.value))
  }

  private fun as_1194261062(): IListViewBase6.WithDefault {
    if(pointer == NULL) {
      return(IListViewBase6.ABI.makeIListViewBase6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBase6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBase6.ABI.makeIListViewBase6(ref.value))
  }

  private fun as_1000960279(): ISemanticZoomInformation.WithDefault {
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


    public val IListViewBaseStatics5_Instance: IListViewBaseStatics5 by lazy {
      createIListViewBaseStatics5()
    }


    public val IListViewBaseStatics2_Instance: IListViewBaseStatics2 by lazy {
      createIListViewBaseStatics2()
    }


    public val IListViewBaseStatics3_Instance: IListViewBaseStatics3 by lazy {
      createIListViewBaseStatics3()
    }


    public val IListViewBaseStatics4_Instance: IListViewBaseStatics4 by lazy {
      createIListViewBaseStatics4()
    }


    public val IListViewBaseFactory_Instance: IListViewBaseFactory by lazy {
      createIListViewBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewBaseStatics(): IListViewBaseStatics {
      val refiid = Guid.REFIID(IListViewBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics.ABI.makeIListViewBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseStatics5(): IListViewBaseStatics5 {
      val refiid = Guid.REFIID(IListViewBaseStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics5.ABI.makeIListViewBaseStatics5(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseStatics2(): IListViewBaseStatics2 {
      val refiid = Guid.REFIID(IListViewBaseStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics2.ABI.makeIListViewBaseStatics2(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseStatics3(): IListViewBaseStatics3 {
      val refiid = Guid.REFIID(IListViewBaseStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics3.ABI.makeIListViewBaseStatics3(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseStatics4(): IListViewBaseStatics4 {
      val refiid = Guid.REFIID(IListViewBaseStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,interfacePtr)
      val result = IListViewBaseStatics4.ABI.makeIListViewBaseStatics4(interfacePtr.value)
      return result
    }

    public fun createIListViewBaseFactory(): IListViewBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewBase".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_SingleSelectionFollowsFocusProperty() =
        ABI.IListViewBaseStatics5_Instance.get_SingleSelectionFollowsFocusProperty()

    public fun get_ShowsScrollingPlaceholdersProperty() =
        ABI.IListViewBaseStatics2_Instance.get_ShowsScrollingPlaceholdersProperty()

    public fun get_FooterProperty() = ABI.IListViewBaseStatics2_Instance.get_FooterProperty()

    public fun get_FooterTemplateProperty() =
        ABI.IListViewBaseStatics2_Instance.get_FooterTemplateProperty()

    public fun get_FooterTransitionsProperty() =
        ABI.IListViewBaseStatics2_Instance.get_FooterTransitionsProperty()

    public fun get_ReorderModeProperty() =
        ABI.IListViewBaseStatics3_Instance.get_ReorderModeProperty()

    public fun get_IsMultiSelectCheckBoxEnabledProperty() =
        ABI.IListViewBaseStatics4_Instance.get_IsMultiSelectCheckBoxEnabledProperty()
  }
}
