package Microsoft.UI.Xaml.Automation

import Microsoft.UI.Xaml.Automation.Peers.AccessibilityView
import Microsoft.UI.Xaml.Automation.Peers.AutomationControlType
import Microsoft.UI.Xaml.Automation.Peers.AutomationHeadingLevel
import Microsoft.UI.Xaml.Automation.Peers.AutomationLandmarkType
import Microsoft.UI.Xaml.Automation.Peers.AutomationLiveSetting
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.UIElement
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
@Signature("rc(Microsoft.UI.Xaml.Automation.AutomationProperties;{525c6a71-dd8a-52a0-977b-db1b02f8e896})")
@WinRTByReference(brClass = AutomationProperties.ByReference::class)
public class AutomationProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationProperties.WithDefault, IWinRTObject {
  private val __762014416_Interface: IAutomationProperties.WithDefault by lazy {
    as_762014416()
  }


  public override val __762014416_Ptr: JNAPointer? by lazy {
    __762014416_Interface.__762014416_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__762014416_Interface)

  private fun as_762014416(): IAutomationProperties.WithDefault {
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
    public val IAutomationPropertiesStatics_Instance: IAutomationPropertiesStatics by lazy {
      createIAutomationPropertiesStatics()
    }


    public val IAutomationPropertiesStatics2_Instance: IAutomationPropertiesStatics2 by lazy {
      createIAutomationPropertiesStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutomationPropertiesStatics(): IAutomationPropertiesStatics {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics.ABI.makeIAutomationPropertiesStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationPropertiesStatics2(): IAutomationPropertiesStatics2 {
      val refiid = Guid.REFIID(IAutomationPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.AutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationPropertiesStatics2.ABI.makeIAutomationPropertiesStatics2(interfacePtr.value)
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

    public fun get_AccessibilityViewProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_AccessibilityViewProperty()

    public fun GetAccessibilityView(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetAccessibilityView(element)

    public fun SetAccessibilityView(element: DependencyObject, value: AccessibilityView) =
        ABI.IAutomationPropertiesStatics_Instance.SetAccessibilityView(element, value)

    public fun get_ControlledPeersProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_ControlledPeersProperty()

    public fun GetControlledPeers(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetControlledPeers(element)

    public fun get_PositionInSetProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_PositionInSetProperty()

    public fun GetPositionInSet(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetPositionInSet(element)

    public fun SetPositionInSet(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics_Instance.SetPositionInSet(element, value)

    public fun get_SizeOfSetProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_SizeOfSetProperty()

    public fun GetSizeOfSet(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetSizeOfSet(element)

    public fun SetSizeOfSet(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics_Instance.SetSizeOfSet(element, value)

    public fun get_LevelProperty() = ABI.IAutomationPropertiesStatics_Instance.get_LevelProperty()

    public fun GetLevel(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLevel(element)

    public fun SetLevel(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics_Instance.SetLevel(element, value)

    public fun get_AnnotationsProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_AnnotationsProperty()

    public fun GetAnnotations(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetAnnotations(element)

    public fun get_LandmarkTypeProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_LandmarkTypeProperty()

    public fun GetLandmarkType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLandmarkType(element)

    public fun SetLandmarkType(element: DependencyObject, value: AutomationLandmarkType) =
        ABI.IAutomationPropertiesStatics_Instance.SetLandmarkType(element, value)

    public fun get_LocalizedLandmarkTypeProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_LocalizedLandmarkTypeProperty()

    public fun GetLocalizedLandmarkType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLocalizedLandmarkType(element)

    public fun SetLocalizedLandmarkType(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetLocalizedLandmarkType(element, value)

    public fun get_IsPeripheralProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_IsPeripheralProperty()

    public fun GetIsPeripheral(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetIsPeripheral(element)

    public fun SetIsPeripheral(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics_Instance.SetIsPeripheral(element, value)

    public fun get_IsDataValidForFormProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_IsDataValidForFormProperty()

    public fun GetIsDataValidForForm(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetIsDataValidForForm(element)

    public fun SetIsDataValidForForm(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics_Instance.SetIsDataValidForForm(element, value)

    public fun get_FullDescriptionProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_FullDescriptionProperty()

    public fun GetFullDescription(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetFullDescription(element)

    public fun SetFullDescription(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetFullDescription(element, value)

    public fun get_LocalizedControlTypeProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_LocalizedControlTypeProperty()

    public fun GetLocalizedControlType(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetLocalizedControlType(element)

    public fun SetLocalizedControlType(element: DependencyObject, value: String) =
        ABI.IAutomationPropertiesStatics_Instance.SetLocalizedControlType(element, value)

    public fun get_DescribedByProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_DescribedByProperty()

    public fun GetDescribedBy(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetDescribedBy(element)

    public fun get_FlowsToProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_FlowsToProperty()

    public fun GetFlowsTo(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetFlowsTo(element)

    public fun get_FlowsFromProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_FlowsFromProperty()

    public fun GetFlowsFrom(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetFlowsFrom(element)

    public fun get_CultureProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_CultureProperty()

    public fun GetCulture(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetCulture(element)

    public fun SetCulture(element: DependencyObject, value: Int) =
        ABI.IAutomationPropertiesStatics_Instance.SetCulture(element, value)

    public fun get_HeadingLevelProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_HeadingLevelProperty()

    public fun GetHeadingLevel(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetHeadingLevel(element)

    public fun SetHeadingLevel(element: DependencyObject, value: AutomationHeadingLevel) =
        ABI.IAutomationPropertiesStatics_Instance.SetHeadingLevel(element, value)

    public fun get_IsDialogProperty() =
        ABI.IAutomationPropertiesStatics_Instance.get_IsDialogProperty()

    public fun GetIsDialog(element: DependencyObject) =
        ABI.IAutomationPropertiesStatics_Instance.GetIsDialog(element)

    public fun SetIsDialog(element: DependencyObject, value: Boolean) =
        ABI.IAutomationPropertiesStatics_Instance.SetIsDialog(element, value)

    public fun get_AutomationControlTypeProperty() =
        ABI.IAutomationPropertiesStatics2_Instance.get_AutomationControlTypeProperty()

    public fun GetAutomationControlType(element: UIElement) =
        ABI.IAutomationPropertiesStatics2_Instance.GetAutomationControlType(element)

    public fun SetAutomationControlType(element: UIElement, value: AutomationControlType) =
        ABI.IAutomationPropertiesStatics2_Instance.SetAutomationControlType(element, value)
  }
}
