package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.Automation.Peers.AccessibilityView
import Windows.UI.Xaml.Automation.Peers.AutomationControlType
import Windows.UI.Xaml.Automation.Peers.AutomationHeadingLevel
import Windows.UI.Xaml.Automation.Peers.AutomationLandmarkType
import Windows.UI.Xaml.Automation.Peers.AutomationLiveSetting
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.UIElement
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AutomationProperties.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.AutomationProperties;{68d7232c-e622-48e9-af0b-1ffa33cc5cba})")
@WinRTByReference(brClass = AutomationProperties.ByReference::class)
public class AutomationProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationProperties.WithDefault, IWinRTObject {
  private val __633636293_Interface: IAutomationProperties.WithDefault by lazy {
    as_633636293()
  }


  public override val __633636293_Ptr: JNAPointer? by lazy {
    __633636293_Interface.__633636293_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__633636293_Interface)

  private fun as_633636293(): IAutomationProperties.WithDefault {
    if(pointer == NULL) {
      return(IAutomationProperties.ABI.makeIAutomationProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationProperties.ABI.makeIAutomationProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationProperties> {
    public override fun getValue() = AutomationProperties(pointer.getPointer(0))

    public fun setValue(value: AutomationProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationProperties, MemoryAddress> {
    public val IAutomationPropertiesStatics2_Instance: IAutomationPropertiesStatics2 by lazy {
      createIAutomationPropertiesStatics2()
    }


    public val IAutomationPropertiesStatics_Instance: IAutomationPropertiesStatics by lazy {
      createIAutomationPropertiesStatics()
    }


    public val IAutomationPropertiesStatics5_Instance: IAutomationPropertiesStatics5 by lazy {
      createIAutomationPropertiesStatics5()
    }


    public val IAutomationPropertiesStatics4_Instance: IAutomationPropertiesStatics4 by lazy {
      createIAutomationPropertiesStatics4()
    }


    public val IAutomationPropertiesStatics9_Instance: IAutomationPropertiesStatics9 by lazy {
      createIAutomationPropertiesStatics9()
    }


    public val IAutomationPropertiesStatics6_Instance: IAutomationPropertiesStatics6 by lazy {
      createIAutomationPropertiesStatics6()
    }


    public val IAutomationPropertiesStatics8_Instance: IAutomationPropertiesStatics8 by lazy {
      createIAutomationPropertiesStatics8()
    }


    public val IAutomationPropertiesStatics7_Instance: IAutomationPropertiesStatics7 by lazy {
      createIAutomationPropertiesStatics7()
    }


    public val IAutomationPropertiesStatics3_Instance: IAutomationPropertiesStatics3 by lazy {
      createIAutomationPropertiesStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutomationPropertiesStatics2(): IAutomationPropertiesStatics2 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics2.ABI.makeIAutomationPropertiesStatics2(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics(): IAutomationPropertiesStatics {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics.ABI.makeIAutomationPropertiesStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics5(): IAutomationPropertiesStatics5 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics5.ABI.makeIAutomationPropertiesStatics5(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics4(): IAutomationPropertiesStatics4 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics4.ABI.makeIAutomationPropertiesStatics4(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics9(): IAutomationPropertiesStatics9 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics9.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics9.ABI.makeIAutomationPropertiesStatics9(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics6(): IAutomationPropertiesStatics6 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics6.ABI.makeIAutomationPropertiesStatics6(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics8(): IAutomationPropertiesStatics8 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics8.ABI.makeIAutomationPropertiesStatics8(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics7(): IAutomationPropertiesStatics7 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics7.ABI.makeIAutomationPropertiesStatics7(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics3(): IAutomationPropertiesStatics3 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics3.ABI.makeIAutomationPropertiesStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutomationProperties {
      val address = segment.toRawLongValue()
      return AutomationProperties(Pointer(address))
    }

    public override fun toNative(obj: AutomationProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AccessibilityViewProperty() =
        ABI.IAutomationPropertiesStatics2_Instance.get_AccessibilityViewProperty()

    public fun GetAccessibilityView(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics2_Instance.GetAccessibilityView(element)

    public fun SetAccessibilityView(element: DependencyObject, value: AccessibilityView) =
        ABI.IAutomationPropertiesStatics2_Instance.SetAccessibilityView(element, value)

    public fun get_ControlledPeersProperty() =
        ABI.IAutomationPropertiesStatics2_Instance.get_ControlledPeersProperty()

    public fun GetControlledPeers(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics2_Instance.GetControlledPeers(element)

    public fun get_AcceleratorKeyProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_AcceleratorKeyProperty()

    public fun GetAcceleratorKey(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetAcceleratorKey(element)

    public fun SetAcceleratorKey(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetAcceleratorKey(element, value)

    public fun get_AccessKeyProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_AccessKeyProperty()

    public fun GetAccessKey(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetAccessKey(element)

    public fun SetAccessKey(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetAccessKey(element, value)

    public fun get_AutomationIdProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_AutomationIdProperty()

    public fun GetAutomationId(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetAutomationId(element)

    public fun SetAutomationId(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetAutomationId(element, value)

    public fun get_HelpTextProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_HelpTextProperty()

    public fun GetHelpText(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetHelpText(element)

    public fun SetHelpText(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetHelpText(element, value)

    public fun get_IsRequiredForFormProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_IsRequiredForFormProperty()

    public fun GetIsRequiredForForm(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetIsRequiredForForm(element)

    public fun SetIsRequiredForForm(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics_Instance.SetIsRequiredForForm(element, value)

    public fun get_ItemStatusProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_ItemStatusProperty()

    public fun GetItemStatus(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetItemStatus(element)

    public fun SetItemStatus(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetItemStatus(element, value)

    public fun get_ItemTypeProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_ItemTypeProperty()

    public fun GetItemType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetItemType(element)

    public fun SetItemType(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetItemType(element, value)

    public fun get_LabeledByProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_LabeledByProperty()

    public fun GetLabeledBy(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLabeledBy(element)

    public fun SetLabeledBy(element: DependencyObject, value: UIElement) =
        ABI.IAutomationPropertiesStatics_Instance.SetLabeledBy(element, value)

    public fun get_NameProperty() = ABI.IAutomationPropertiesStatics_Instance.get_NameProperty()

    public fun GetName(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetName(element)

    public fun SetName(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetName(element, value)

    public fun get_LiveSettingProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_LiveSettingProperty()

    public fun GetLiveSetting(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLiveSetting(element)

    public fun SetLiveSetting(element: DependencyObject, value: AutomationLiveSetting) =
        ABI.IAutomationPropertiesStatics_Instance.SetLiveSetting(element, value)

    public fun get_IsPeripheralProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_IsPeripheralProperty()

    public fun GetIsPeripheral(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetIsPeripheral(element)

    public fun SetIsPeripheral(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics5_Instance.SetIsPeripheral(element, value)

    public fun get_IsDataValidForFormProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_IsDataValidForFormProperty()

    public fun GetIsDataValidForForm(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetIsDataValidForForm(element)

    public fun SetIsDataValidForForm(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics5_Instance.SetIsDataValidForForm(element, value)

    public fun get_FullDescriptionProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_FullDescriptionProperty()

    public fun GetFullDescription(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetFullDescription(element)

    public fun SetFullDescription(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics5_Instance.SetFullDescription(element, value)

    public fun get_LocalizedControlTypeProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_LocalizedControlTypeProperty()

    public fun GetLocalizedControlType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetLocalizedControlType(element)

    public fun SetLocalizedControlType(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics5_Instance.SetLocalizedControlType(element, value)

    public fun get_DescribedByProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_DescribedByProperty()

    public fun GetDescribedBy(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetDescribedBy(element)

    public fun get_FlowsToProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_FlowsToProperty()

    public fun GetFlowsTo(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetFlowsTo(element)

    public fun get_FlowsFromProperty() =
        ABI.IAutomationPropertiesStatics5_Instance.get_FlowsFromProperty()

    public fun GetFlowsFrom(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics5_Instance.GetFlowsFrom(element)

    public fun get_LandmarkTypeProperty() =
        ABI.IAutomationPropertiesStatics4_Instance.get_LandmarkTypeProperty()

    public fun GetLandmarkType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics4_Instance.GetLandmarkType(element)

    public fun SetLandmarkType(element: DependencyObject, value: AutomationLandmarkType) =
        ABI.IAutomationPropertiesStatics4_Instance.SetLandmarkType(element, value)

    public fun get_LocalizedLandmarkTypeProperty() =
        ABI.IAutomationPropertiesStatics4_Instance.get_LocalizedLandmarkTypeProperty()

    public fun GetLocalizedLandmarkType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics4_Instance.GetLocalizedLandmarkType(element)

    public fun SetLocalizedLandmarkType(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics4_Instance.SetLocalizedLandmarkType(element, value)

    public fun get_AutomationControlTypeProperty() =
        ABI.IAutomationPropertiesStatics9_Instance.get_AutomationControlTypeProperty()

    public fun GetAutomationControlType(element: UIElement) =
        ABI.IAutomationPropertiesStatics9_Instance.GetAutomationControlType(element)

    public fun SetAutomationControlType(element: UIElement, value: AutomationControlType) =
        ABI.IAutomationPropertiesStatics9_Instance.SetAutomationControlType(element, value)

    public fun get_CultureProperty() =
        ABI.IAutomationPropertiesStatics6_Instance.get_CultureProperty()

    public fun GetCulture(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics6_Instance.GetCulture(element)

    public fun SetCulture(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics6_Instance.SetCulture(element, value)

    public fun get_IsDialogProperty() =
        ABI.IAutomationPropertiesStatics8_Instance.get_IsDialogProperty()

    public fun GetIsDialog(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics8_Instance.GetIsDialog(element)

    public fun SetIsDialog(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics8_Instance.SetIsDialog(element, value)

    public fun get_HeadingLevelProperty() =
        ABI.IAutomationPropertiesStatics7_Instance.get_HeadingLevelProperty()

    public fun GetHeadingLevel(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics7_Instance.GetHeadingLevel(element)

    public fun SetHeadingLevel(element: DependencyObject, value: AutomationHeadingLevel) =
        ABI.IAutomationPropertiesStatics7_Instance.SetHeadingLevel(element, value)

    public fun get_PositionInSetProperty() =
        ABI.IAutomationPropertiesStatics3_Instance.get_PositionInSetProperty()

    public fun GetPositionInSet(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics3_Instance.GetPositionInSet(element)

    public fun SetPositionInSet(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics3_Instance.SetPositionInSet(element, value)

    public fun get_SizeOfSetProperty() =
        ABI.IAutomationPropertiesStatics3_Instance.get_SizeOfSetProperty()

    public fun GetSizeOfSet(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics3_Instance.GetSizeOfSet(element)

    public fun SetSizeOfSet(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics3_Instance.SetSizeOfSet(element, value)

    public fun get_LevelProperty() = ABI.IAutomationPropertiesStatics3_Instance.get_LevelProperty()

    public fun GetLevel(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics3_Instance.GetLevel(element)

    public fun SetLevel(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics3_Instance.SetLevel(element, value)

    public fun get_AnnotationsProperty() =
        ABI.IAutomationPropertiesStatics3_Instance.get_AnnotationsProperty()

    public fun GetAnnotations(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics3_Instance.GetAnnotations(element)
  }
}
