package Windows.UI.Xaml

import Windows.UI.Composition.IAnimationObject
import Windows.UI.Composition.IVisualElement
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

@ABIMarker(UIElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.UIElement;{676d0be9-b65c-41c6-ba40-58cf87f201c1})")
@WinRTByReference(brClass = UIElement.ByReference::class)
public open class UIElement(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IUIElement.WithDefault, IUIElement2.WithDefault, IUIElement3.WithDefault,
    IUIElement4.WithDefault, IUIElement5.WithDefault, IUIElement7.WithDefault,
    IUIElement8.WithDefault, IUIElement9.WithDefault, IUIElement10.WithDefault,
    IUIElementOverrides.WithDefault, IUIElementOverrides7.WithDefault,
    IUIElementOverrides8.WithDefault, IUIElementOverrides9.WithDefault,
    IAnimationObject.WithDefault, IVisualElement.WithDefault, IWinRTObject {
  private val __1834054614_Interface: IUIElement.WithDefault by lazy {
    as_1834054614()
  }


  private val __1021118236_Interface: IUIElement2.WithDefault by lazy {
    as_1021118236()
  }


  private val __1021118237_Interface: IUIElement3.WithDefault by lazy {
    as_1021118237()
  }


  private val __1021118238_Interface: IUIElement4.WithDefault by lazy {
    as_1021118238()
  }


  private val __1021118239_Interface: IUIElement5.WithDefault by lazy {
    as_1021118239()
  }


  private val __1021118241_Interface: IUIElement7.WithDefault by lazy {
    as_1021118241()
  }


  private val __1021118242_Interface: IUIElement8.WithDefault by lazy {
    as_1021118242()
  }


  private val __1021118243_Interface: IUIElement9.WithDefault by lazy {
    as_1021118243()
  }


  private val __1589894261_Interface: IUIElement10.WithDefault by lazy {
    as_1589894261()
  }


  private val __2076375793_Interface: IUIElementOverrides.WithDefault by lazy {
    as_2076375793()
  }


  private val __56859802_Interface: IUIElementOverrides7.WithDefault by lazy {
    as_56859802()
  }


  private val __56859801_Interface: IUIElementOverrides8.WithDefault by lazy {
    as_56859801()
  }


  private val __56859800_Interface: IUIElementOverrides9.WithDefault by lazy {
    as_56859800()
  }


  private val __1365507701_Interface: IAnimationObject.WithDefault by lazy {
    as_1365507701()
  }


  private val __931728046_Interface: IVisualElement.WithDefault by lazy {
    as_931728046()
  }


  public override val __1834054614_Ptr: JNAPointer? by lazy {
    __1834054614_Interface.__1834054614_Ptr
  }


  public override val __1021118236_Ptr: JNAPointer? by lazy {
    __1021118236_Interface.__1021118236_Ptr
  }


  public override val __1021118237_Ptr: JNAPointer? by lazy {
    __1021118237_Interface.__1021118237_Ptr
  }


  public override val __1021118238_Ptr: JNAPointer? by lazy {
    __1021118238_Interface.__1021118238_Ptr
  }


  public override val __1021118239_Ptr: JNAPointer? by lazy {
    __1021118239_Interface.__1021118239_Ptr
  }


  public override val __1021118241_Ptr: JNAPointer? by lazy {
    __1021118241_Interface.__1021118241_Ptr
  }


  public override val __1021118242_Ptr: JNAPointer? by lazy {
    __1021118242_Interface.__1021118242_Ptr
  }


  public override val __1021118243_Ptr: JNAPointer? by lazy {
    __1021118243_Interface.__1021118243_Ptr
  }


  public override val __1589894261_Ptr: JNAPointer? by lazy {
    __1589894261_Interface.__1589894261_Ptr
  }


  public override val __2076375793_Ptr: JNAPointer? by lazy {
    __2076375793_Interface.__2076375793_Ptr
  }


  public override val __56859802_Ptr: JNAPointer? by lazy {
    __56859802_Interface.__56859802_Ptr
  }


  public override val __56859801_Ptr: JNAPointer? by lazy {
    __56859801_Interface.__56859801_Ptr
  }


  public override val __56859800_Ptr: JNAPointer? by lazy {
    __56859800_Interface.__56859800_Ptr
  }


  public override val __1365507701_Ptr: JNAPointer? by lazy {
    __1365507701_Interface.__1365507701_Ptr
  }


  public override val __931728046_Ptr: JNAPointer? by lazy {
    __931728046_Interface.__931728046_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1834054614_Interface, __1021118236_Interface, __1021118237_Interface,
        __1021118238_Interface, __1021118239_Interface, __1021118241_Interface,
        __1021118242_Interface, __1021118243_Interface, __1589894261_Interface,
        __2076375793_Interface, __56859802_Interface, __56859801_Interface, __56859800_Interface,
        __1365507701_Interface, __931728046_Interface)

  private fun as_1834054614(): IUIElement.WithDefault {
    if(pointer == NULL) {
      return(IUIElement.ABI.makeIUIElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement.ABI.makeIUIElement(ref.value))
  }

  private fun as_1021118236(): IUIElement2.WithDefault {
    if(pointer == NULL) {
      return(IUIElement2.ABI.makeIUIElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement2.ABI.makeIUIElement2(ref.value))
  }

  private fun as_1021118237(): IUIElement3.WithDefault {
    if(pointer == NULL) {
      return(IUIElement3.ABI.makeIUIElement3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement3.ABI.makeIUIElement3(ref.value))
  }

  private fun as_1021118238(): IUIElement4.WithDefault {
    if(pointer == NULL) {
      return(IUIElement4.ABI.makeIUIElement4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement4.ABI.makeIUIElement4(ref.value))
  }

  private fun as_1021118239(): IUIElement5.WithDefault {
    if(pointer == NULL) {
      return(IUIElement5.ABI.makeIUIElement5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement5.ABI.makeIUIElement5(ref.value))
  }

  private fun as_1021118241(): IUIElement7.WithDefault {
    if(pointer == NULL) {
      return(IUIElement7.ABI.makeIUIElement7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement7.ABI.makeIUIElement7(ref.value))
  }

  private fun as_1021118242(): IUIElement8.WithDefault {
    if(pointer == NULL) {
      return(IUIElement8.ABI.makeIUIElement8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement8.ABI.makeIUIElement8(ref.value))
  }

  private fun as_1021118243(): IUIElement9.WithDefault {
    if(pointer == NULL) {
      return(IUIElement9.ABI.makeIUIElement9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement9.ABI.makeIUIElement9(ref.value))
  }

  private fun as_1589894261(): IUIElement10.WithDefault {
    if(pointer == NULL) {
      return(IUIElement10.ABI.makeIUIElement10(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement10>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement10.ABI.makeIUIElement10(ref.value))
  }

  private fun as_2076375793(): IUIElementOverrides.WithDefault {
    if(pointer == NULL) {
      return(IUIElementOverrides.ABI.makeIUIElementOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementOverrides.ABI.makeIUIElementOverrides(ref.value))
  }

  private fun as_56859802(): IUIElementOverrides7.WithDefault {
    if(pointer == NULL) {
      return(IUIElementOverrides7.ABI.makeIUIElementOverrides7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementOverrides7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementOverrides7.ABI.makeIUIElementOverrides7(ref.value))
  }

  private fun as_56859801(): IUIElementOverrides8.WithDefault {
    if(pointer == NULL) {
      return(IUIElementOverrides8.ABI.makeIUIElementOverrides8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementOverrides8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementOverrides8.ABI.makeIUIElementOverrides8(ref.value))
  }

  private fun as_56859800(): IUIElementOverrides9.WithDefault {
    if(pointer == NULL) {
      return(IUIElementOverrides9.ABI.makeIUIElementOverrides9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementOverrides9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementOverrides9.ABI.makeIUIElementOverrides9(ref.value))
  }

  private fun as_1365507701(): IAnimationObject.WithDefault {
    if(pointer == NULL) {
      return(IAnimationObject.ABI.makeIAnimationObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationObject.ABI.makeIAnimationObject(ref.value))
  }

  private fun as_931728046(): IVisualElement.WithDefault {
    if(pointer == NULL) {
      return(IVisualElement.ABI.makeIVisualElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElement.ABI.makeIVisualElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UIElement> {
    public override fun getValue() = UIElement(pointer.getPointer(0))

    public fun setValue(value: UIElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIElement, MemoryAddress> {
    public val IUIElementStatics9_Instance: IUIElementStatics9 by lazy {
      createIUIElementStatics9()
    }


    public val IUIElementStatics10_Instance: IUIElementStatics10 by lazy {
      createIUIElementStatics10()
    }


    public val IUIElementStatics4_Instance: IUIElementStatics4 by lazy {
      createIUIElementStatics4()
    }


    public val IUIElementStatics2_Instance: IUIElementStatics2 by lazy {
      createIUIElementStatics2()
    }


    public val IUIElementStatics6_Instance: IUIElementStatics6 by lazy {
      createIUIElementStatics6()
    }


    public val IUIElementStatics3_Instance: IUIElementStatics3 by lazy {
      createIUIElementStatics3()
    }


    public val IUIElementStatics8_Instance: IUIElementStatics8 by lazy {
      createIUIElementStatics8()
    }


    public val IUIElementStatics5_Instance: IUIElementStatics5 by lazy {
      createIUIElementStatics5()
    }


    public val IUIElementStatics_Instance: IUIElementStatics by lazy {
      createIUIElementStatics()
    }


    public val IUIElementStatics7_Instance: IUIElementStatics7 by lazy {
      createIUIElementStatics7()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUIElementStatics9(): IUIElementStatics9 {
      val refiid = Guid.REFIID(IUIElementStatics9.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics9.ABI.makeIUIElementStatics9(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics10(): IUIElementStatics10 {
      val refiid = Guid.REFIID(IUIElementStatics10.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics10.ABI.makeIUIElementStatics10(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics4(): IUIElementStatics4 {
      val refiid = Guid.REFIID(IUIElementStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics4.ABI.makeIUIElementStatics4(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics2(): IUIElementStatics2 {
      val refiid = Guid.REFIID(IUIElementStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics2.ABI.makeIUIElementStatics2(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics6(): IUIElementStatics6 {
      val refiid = Guid.REFIID(IUIElementStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics6.ABI.makeIUIElementStatics6(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics3(): IUIElementStatics3 {
      val refiid = Guid.REFIID(IUIElementStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics3.ABI.makeIUIElementStatics3(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics8(): IUIElementStatics8 {
      val refiid = Guid.REFIID(IUIElementStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics8.ABI.makeIUIElementStatics8(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics5(): IUIElementStatics5 {
      val refiid = Guid.REFIID(IUIElementStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics5.ABI.makeIUIElementStatics5(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics(): IUIElementStatics {
      val refiid = Guid.REFIID(IUIElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics.ABI.makeIUIElementStatics(interfacePtr.value)
      return result
    }

    public fun createIUIElementStatics7(): IUIElementStatics7 {
      val refiid = Guid.REFIID(IUIElementStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics7.ABI.makeIUIElementStatics7(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UIElement {
      val address = segment.toRawLongValue()
      return UIElement(Pointer(address))
    }

    public override fun toNative(obj: UIElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanBeScrollAnchorProperty() =
        ABI.IUIElementStatics9_Instance.get_CanBeScrollAnchorProperty()

    public fun get_ShadowProperty() = ABI.IUIElementStatics10_Instance.get_ShadowProperty()

    public fun get_ContextFlyoutProperty() =
        ABI.IUIElementStatics4_Instance.get_ContextFlyoutProperty()

    public fun get_ExitDisplayModeOnAccessKeyInvokedProperty() =
        ABI.IUIElementStatics4_Instance.get_ExitDisplayModeOnAccessKeyInvokedProperty()

    public fun get_IsAccessKeyScopeProperty() =
        ABI.IUIElementStatics4_Instance.get_IsAccessKeyScopeProperty()

    public fun get_AccessKeyScopeOwnerProperty() =
        ABI.IUIElementStatics4_Instance.get_AccessKeyScopeOwnerProperty()

    public fun get_AccessKeyProperty() = ABI.IUIElementStatics4_Instance.get_AccessKeyProperty()

    public fun get_CompositeModeProperty() =
        ABI.IUIElementStatics2_Instance.get_CompositeModeProperty()

    public fun get_GettingFocusEvent() = ABI.IUIElementStatics6_Instance.get_GettingFocusEvent()

    public fun get_LosingFocusEvent() = ABI.IUIElementStatics6_Instance.get_LosingFocusEvent()

    public fun get_NoFocusCandidateFoundEvent() =
        ABI.IUIElementStatics6_Instance.get_NoFocusCandidateFoundEvent()

    public fun get_Transform3DProperty() = ABI.IUIElementStatics3_Instance.get_Transform3DProperty()

    public fun get_CanDragProperty() = ABI.IUIElementStatics3_Instance.get_CanDragProperty()

    public fun TryStartDirectManipulation(value: Windows.UI.Xaml.Input.Pointer) =
        ABI.IUIElementStatics3_Instance.TryStartDirectManipulation(value)

    public fun get_BringIntoViewRequestedEvent() =
        ABI.IUIElementStatics8_Instance.get_BringIntoViewRequestedEvent()

    public fun get_ContextRequestedEvent() =
        ABI.IUIElementStatics8_Instance.get_ContextRequestedEvent()

    public fun get_KeyTipTargetProperty() =
        ABI.IUIElementStatics8_Instance.get_KeyTipTargetProperty()

    public fun get_KeyboardAcceleratorPlacementTargetProperty() =
        ABI.IUIElementStatics8_Instance.get_KeyboardAcceleratorPlacementTargetProperty()

    public fun get_KeyboardAcceleratorPlacementModeProperty() =
        ABI.IUIElementStatics8_Instance.get_KeyboardAcceleratorPlacementModeProperty()

    public fun RegisterAsScrollPort(element: UIElement) =
        ABI.IUIElementStatics8_Instance.RegisterAsScrollPort(element)

    public fun get_LightsProperty() = ABI.IUIElementStatics5_Instance.get_LightsProperty()

    public fun get_KeyTipPlacementModeProperty() =
        ABI.IUIElementStatics5_Instance.get_KeyTipPlacementModeProperty()

    public fun get_KeyTipHorizontalOffsetProperty() =
        ABI.IUIElementStatics5_Instance.get_KeyTipHorizontalOffsetProperty()

    public fun get_KeyTipVerticalOffsetProperty() =
        ABI.IUIElementStatics5_Instance.get_KeyTipVerticalOffsetProperty()

    public fun get_XYFocusKeyboardNavigationProperty() =
        ABI.IUIElementStatics5_Instance.get_XYFocusKeyboardNavigationProperty()

    public fun get_XYFocusUpNavigationStrategyProperty() =
        ABI.IUIElementStatics5_Instance.get_XYFocusUpNavigationStrategyProperty()

    public fun get_XYFocusDownNavigationStrategyProperty() =
        ABI.IUIElementStatics5_Instance.get_XYFocusDownNavigationStrategyProperty()

    public fun get_XYFocusLeftNavigationStrategyProperty() =
        ABI.IUIElementStatics5_Instance.get_XYFocusLeftNavigationStrategyProperty()

    public fun get_XYFocusRightNavigationStrategyProperty() =
        ABI.IUIElementStatics5_Instance.get_XYFocusRightNavigationStrategyProperty()

    public fun get_HighContrastAdjustmentProperty() =
        ABI.IUIElementStatics5_Instance.get_HighContrastAdjustmentProperty()

    public fun get_TabFocusNavigationProperty() =
        ABI.IUIElementStatics5_Instance.get_TabFocusNavigationProperty()

    public fun get_KeyDownEvent() = ABI.IUIElementStatics_Instance.get_KeyDownEvent()

    public fun get_KeyUpEvent() = ABI.IUIElementStatics_Instance.get_KeyUpEvent()

    public fun get_PointerEnteredEvent() = ABI.IUIElementStatics_Instance.get_PointerEnteredEvent()

    public fun get_PointerPressedEvent() = ABI.IUIElementStatics_Instance.get_PointerPressedEvent()

    public fun get_PointerMovedEvent() = ABI.IUIElementStatics_Instance.get_PointerMovedEvent()

    public fun get_PointerReleasedEvent() =
        ABI.IUIElementStatics_Instance.get_PointerReleasedEvent()

    public fun get_PointerExitedEvent() = ABI.IUIElementStatics_Instance.get_PointerExitedEvent()

    public fun get_PointerCaptureLostEvent() =
        ABI.IUIElementStatics_Instance.get_PointerCaptureLostEvent()

    public fun get_PointerCanceledEvent() =
        ABI.IUIElementStatics_Instance.get_PointerCanceledEvent()

    public fun get_PointerWheelChangedEvent() =
        ABI.IUIElementStatics_Instance.get_PointerWheelChangedEvent()

    public fun get_TappedEvent() = ABI.IUIElementStatics_Instance.get_TappedEvent()

    public fun get_DoubleTappedEvent() = ABI.IUIElementStatics_Instance.get_DoubleTappedEvent()

    public fun get_HoldingEvent() = ABI.IUIElementStatics_Instance.get_HoldingEvent()

    public fun get_RightTappedEvent() = ABI.IUIElementStatics_Instance.get_RightTappedEvent()

    public fun get_ManipulationStartingEvent() =
        ABI.IUIElementStatics_Instance.get_ManipulationStartingEvent()

    public fun get_ManipulationInertiaStartingEvent() =
        ABI.IUIElementStatics_Instance.get_ManipulationInertiaStartingEvent()

    public fun get_ManipulationStartedEvent() =
        ABI.IUIElementStatics_Instance.get_ManipulationStartedEvent()

    public fun get_ManipulationDeltaEvent() =
        ABI.IUIElementStatics_Instance.get_ManipulationDeltaEvent()

    public fun get_ManipulationCompletedEvent() =
        ABI.IUIElementStatics_Instance.get_ManipulationCompletedEvent()

    public fun get_DragEnterEvent() = ABI.IUIElementStatics_Instance.get_DragEnterEvent()

    public fun get_DragLeaveEvent() = ABI.IUIElementStatics_Instance.get_DragLeaveEvent()

    public fun get_DragOverEvent() = ABI.IUIElementStatics_Instance.get_DragOverEvent()

    public fun get_DropEvent() = ABI.IUIElementStatics_Instance.get_DropEvent()

    public fun get_AllowDropProperty() = ABI.IUIElementStatics_Instance.get_AllowDropProperty()

    public fun get_OpacityProperty() = ABI.IUIElementStatics_Instance.get_OpacityProperty()

    public fun get_ClipProperty() = ABI.IUIElementStatics_Instance.get_ClipProperty()

    public fun get_RenderTransformProperty() =
        ABI.IUIElementStatics_Instance.get_RenderTransformProperty()

    public fun get_ProjectionProperty() = ABI.IUIElementStatics_Instance.get_ProjectionProperty()

    public fun get_RenderTransformOriginProperty() =
        ABI.IUIElementStatics_Instance.get_RenderTransformOriginProperty()

    public fun get_IsHitTestVisibleProperty() =
        ABI.IUIElementStatics_Instance.get_IsHitTestVisibleProperty()

    public fun get_VisibilityProperty() = ABI.IUIElementStatics_Instance.get_VisibilityProperty()

    public fun get_UseLayoutRoundingProperty() =
        ABI.IUIElementStatics_Instance.get_UseLayoutRoundingProperty()

    public fun get_TransitionsProperty() = ABI.IUIElementStatics_Instance.get_TransitionsProperty()

    public fun get_CacheModeProperty() = ABI.IUIElementStatics_Instance.get_CacheModeProperty()

    public fun get_IsTapEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsTapEnabledProperty()

    public fun get_IsDoubleTapEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsDoubleTapEnabledProperty()

    public fun get_IsRightTapEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsRightTapEnabledProperty()

    public fun get_IsHoldingEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsHoldingEnabledProperty()

    public fun get_ManipulationModeProperty() =
        ABI.IUIElementStatics_Instance.get_ManipulationModeProperty()

    public fun get_PointerCapturesProperty() =
        ABI.IUIElementStatics_Instance.get_PointerCapturesProperty()

    public fun get_PreviewKeyDownEvent() = ABI.IUIElementStatics7_Instance.get_PreviewKeyDownEvent()

    public fun get_CharacterReceivedEvent() =
        ABI.IUIElementStatics7_Instance.get_CharacterReceivedEvent()

    public fun get_PreviewKeyUpEvent() = ABI.IUIElementStatics7_Instance.get_PreviewKeyUpEvent()
  }
}
