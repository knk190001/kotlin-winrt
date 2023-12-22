package Windows.UI.Xaml.Automation

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AutomationElementIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.AutomationElementIdentifiers;{e68a63cf-4345-4e2d-8a6a-49cce1fa2dcc})")
@WinRTByReference(brClass = AutomationElementIdentifiers.ByReference::class)
public class AutomationElementIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationElementIdentifiers.WithDefault, IWinRTObject {
  private val __2114338080_Interface: IAutomationElementIdentifiers.WithDefault by lazy {
    as_2114338080()
  }


  public override val __2114338080_Ptr: JNAPointer? by lazy {
    __2114338080_Interface.__2114338080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2114338080_Interface)

  private fun as_2114338080(): IAutomationElementIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IAutomationElementIdentifiers.ABI.makeIAutomationElementIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationElementIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationElementIdentifiers.ABI.makeIAutomationElementIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationElementIdentifiers> {
    public override fun getValue() = AutomationElementIdentifiers(pointer.getPointer(0))

    public fun setValue(value: AutomationElementIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationElementIdentifiers, MemoryAddress> {
    public val IAutomationElementIdentifiersStatics4_Instance: IAutomationElementIdentifiersStatics4
        by lazy {
      createIAutomationElementIdentifiersStatics4()
    }


    public val IAutomationElementIdentifiersStatics7_Instance: IAutomationElementIdentifiersStatics7
        by lazy {
      createIAutomationElementIdentifiersStatics7()
    }


    public val IAutomationElementIdentifiersStatics5_Instance: IAutomationElementIdentifiersStatics5
        by lazy {
      createIAutomationElementIdentifiersStatics5()
    }


    public val IAutomationElementIdentifiersStatics_Instance: IAutomationElementIdentifiersStatics
        by lazy {
      createIAutomationElementIdentifiersStatics()
    }


    public val IAutomationElementIdentifiersStatics6_Instance: IAutomationElementIdentifiersStatics6
        by lazy {
      createIAutomationElementIdentifiersStatics6()
    }


    public val IAutomationElementIdentifiersStatics3_Instance: IAutomationElementIdentifiersStatics3
        by lazy {
      createIAutomationElementIdentifiersStatics3()
    }


    public val IAutomationElementIdentifiersStatics2_Instance: IAutomationElementIdentifiersStatics2
        by lazy {
      createIAutomationElementIdentifiersStatics2()
    }


    public val IAutomationElementIdentifiersStatics8_Instance: IAutomationElementIdentifiersStatics8
        by lazy {
      createIAutomationElementIdentifiersStatics8()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutomationElementIdentifiersStatics4():
        IAutomationElementIdentifiersStatics4 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics4.ABI.makeIAutomationElementIdentifiersStatics4(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics7():
        IAutomationElementIdentifiersStatics7 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics7.ABI.makeIAutomationElementIdentifiersStatics7(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics5():
        IAutomationElementIdentifiersStatics5 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics5.ABI.makeIAutomationElementIdentifiersStatics5(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics(): IAutomationElementIdentifiersStatics {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics.ABI.makeIAutomationElementIdentifiersStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics6():
        IAutomationElementIdentifiersStatics6 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics6.ABI.makeIAutomationElementIdentifiersStatics6(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics3():
        IAutomationElementIdentifiersStatics3 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics3.ABI.makeIAutomationElementIdentifiersStatics3(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics2():
        IAutomationElementIdentifiersStatics2 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics2.ABI.makeIAutomationElementIdentifiersStatics2(interfacePtr.value)
      return result
    }

    public fun createIAutomationElementIdentifiersStatics8():
        IAutomationElementIdentifiersStatics8 {
      val refiid = Guid.REFIID(IAutomationElementIdentifiersStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.AutomationElementIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAutomationElementIdentifiersStatics8.ABI.makeIAutomationElementIdentifiersStatics8(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutomationElementIdentifiers {
      val address = segment.toRawLongValue()
      return AutomationElementIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: AutomationElementIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LandmarkTypeProperty() =
        ABI.IAutomationElementIdentifiersStatics4_Instance.get_LandmarkTypeProperty()

    public fun get_LocalizedLandmarkTypeProperty() =
        ABI.IAutomationElementIdentifiersStatics4_Instance.get_LocalizedLandmarkTypeProperty()

    public fun get_HeadingLevelProperty() =
        ABI.IAutomationElementIdentifiersStatics7_Instance.get_HeadingLevelProperty()

    public fun get_IsPeripheralProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_IsPeripheralProperty()

    public fun get_IsDataValidForFormProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_IsDataValidForFormProperty()

    public fun get_FullDescriptionProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_FullDescriptionProperty()

    public fun get_DescribedByProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_DescribedByProperty()

    public fun get_FlowsToProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_FlowsToProperty()

    public fun get_FlowsFromProperty() =
        ABI.IAutomationElementIdentifiersStatics5_Instance.get_FlowsFromProperty()

    public fun get_AcceleratorKeyProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_AcceleratorKeyProperty()

    public fun get_AccessKeyProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_AccessKeyProperty()

    public fun get_AutomationIdProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_AutomationIdProperty()

    public fun get_BoundingRectangleProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_BoundingRectangleProperty()

    public fun get_ClassNameProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_ClassNameProperty()

    public fun get_ClickablePointProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_ClickablePointProperty()

    public fun get_ControlTypeProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_ControlTypeProperty()

    public fun get_HasKeyboardFocusProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_HasKeyboardFocusProperty()

    public fun get_HelpTextProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_HelpTextProperty()

    public fun get_IsContentElementProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsContentElementProperty()

    public fun get_IsControlElementProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsControlElementProperty()

    public fun get_IsEnabledProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsEnabledProperty()

    public fun get_IsKeyboardFocusableProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsKeyboardFocusableProperty()

    public fun get_IsOffscreenProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsOffscreenProperty()

    public fun get_IsPasswordProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsPasswordProperty()

    public fun get_IsRequiredForFormProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_IsRequiredForFormProperty()

    public fun get_ItemStatusProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_ItemStatusProperty()

    public fun get_ItemTypeProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_ItemTypeProperty()

    public fun get_LabeledByProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_LabeledByProperty()

    public fun get_LocalizedControlTypeProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_LocalizedControlTypeProperty()

    public fun get_NameProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_NameProperty()

    public fun get_OrientationProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_OrientationProperty()

    public fun get_LiveSettingProperty() =
        ABI.IAutomationElementIdentifiersStatics_Instance.get_LiveSettingProperty()

    public fun get_CultureProperty() =
        ABI.IAutomationElementIdentifiersStatics6_Instance.get_CultureProperty()

    public fun get_PositionInSetProperty() =
        ABI.IAutomationElementIdentifiersStatics3_Instance.get_PositionInSetProperty()

    public fun get_SizeOfSetProperty() =
        ABI.IAutomationElementIdentifiersStatics3_Instance.get_SizeOfSetProperty()

    public fun get_LevelProperty() =
        ABI.IAutomationElementIdentifiersStatics3_Instance.get_LevelProperty()

    public fun get_AnnotationsProperty() =
        ABI.IAutomationElementIdentifiersStatics3_Instance.get_AnnotationsProperty()

    public fun get_ControlledPeersProperty() =
        ABI.IAutomationElementIdentifiersStatics2_Instance.get_ControlledPeersProperty()

    public fun get_IsDialogProperty() =
        ABI.IAutomationElementIdentifiersStatics8_Instance.get_IsDialogProperty()
  }
}
