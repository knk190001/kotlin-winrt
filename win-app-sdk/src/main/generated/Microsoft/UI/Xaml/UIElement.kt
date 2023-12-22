package Microsoft.UI.Xaml

import Microsoft.UI.Composition.IAnimationObject
import Microsoft.UI.Composition.IVisualElement
import Microsoft.UI.Composition.IVisualElement2
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
@Signature("rc(Microsoft.UI.Xaml.UIElement;{c3c01020-320c-5cf6-9d24-d396bbfa4d8b})")
@WinRTByReference(brClass = UIElement.ByReference::class)
public open class UIElement(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IUIElement.WithDefault, IUIElementProtected.WithDefault,
    IUIElementOverrides.WithDefault, IAnimationObject.WithDefault, IVisualElement.WithDefault,
    IVisualElement2.WithDefault, IWinRTObject {
  private val __320529793_Interface: IUIElement.WithDefault by lazy {
    as_320529793()
  }


  private val __393918675_Interface: IUIElementProtected.WithDefault by lazy {
    as_393918675()
  }


  private val __535348826_Interface: IUIElementOverrides.WithDefault by lazy {
    as_535348826()
  }


  private val __547366230_Interface: IAnimationObject.WithDefault by lazy {
    as_547366230()
  }


  private val __674729949_Interface: IVisualElement.WithDefault by lazy {
    as_674729949()
  }


  private val __558208111_Interface: IVisualElement2.WithDefault by lazy {
    as_558208111()
  }


  public override val __320529793_Ptr: JNAPointer? by lazy {
    __320529793_Interface.__320529793_Ptr
  }


  public override val __393918675_Ptr: JNAPointer? by lazy {
    __393918675_Interface.__393918675_Ptr
  }


  public override val __535348826_Ptr: JNAPointer? by lazy {
    __535348826_Interface.__535348826_Ptr
  }


  public override val __547366230_Ptr: JNAPointer? by lazy {
    __547366230_Interface.__547366230_Ptr
  }


  public override val __674729949_Ptr: JNAPointer? by lazy {
    __674729949_Interface.__674729949_Ptr
  }


  public override val __558208111_Ptr: JNAPointer? by lazy {
    __558208111_Interface.__558208111_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__320529793_Interface, __393918675_Interface, __535348826_Interface,
        __547366230_Interface, __674729949_Interface, __558208111_Interface)

  private fun as_320529793(): IUIElement.WithDefault {
    if(pointer == NULL) {
      return(IUIElement.ABI.makeIUIElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElement.ABI.makeIUIElement(ref.value))
  }

  private fun as_393918675(): IUIElementProtected.WithDefault {
    if(pointer == NULL) {
      return(IUIElementProtected.ABI.makeIUIElementProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementProtected.ABI.makeIUIElementProtected(ref.value))
  }

  private fun as_535348826(): IUIElementOverrides.WithDefault {
    if(pointer == NULL) {
      return(IUIElementOverrides.ABI.makeIUIElementOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementOverrides.ABI.makeIUIElementOverrides(ref.value))
  }

  private fun as_547366230(): IAnimationObject.WithDefault {
    if(pointer == NULL) {
      return(IAnimationObject.ABI.makeIAnimationObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationObject.ABI.makeIAnimationObject(ref.value))
  }

  private fun as_674729949(): IVisualElement.WithDefault {
    if(pointer == NULL) {
      return(IVisualElement.ABI.makeIVisualElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElement.ABI.makeIVisualElement(ref.value))
  }

  private fun as_558208111(): IVisualElement2.WithDefault {
    if(pointer == NULL) {
      return(IVisualElement2.ABI.makeIVisualElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElement2.ABI.makeIVisualElement2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UIElement> {
    public override fun getValue() = UIElement(pointer.getPointer(0))

    public fun setValue(value: UIElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIElement, MemoryAddress> {
    public val IUIElementStatics_Instance: IUIElementStatics by lazy {
      createIUIElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUIElementStatics(): IUIElementStatics {
      val refiid = Guid.REFIID(IUIElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.UIElement".toHandle(),refiid,interfacePtr)
      val result = IUIElementStatics.ABI.makeIUIElementStatics(interfacePtr.value)
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

    public fun get_GettingFocusEvent() = ABI.IUIElementStatics_Instance.get_GettingFocusEvent()

    public fun get_LosingFocusEvent() = ABI.IUIElementStatics_Instance.get_LosingFocusEvent()

    public fun get_NoFocusCandidateFoundEvent() =
        ABI.IUIElementStatics_Instance.get_NoFocusCandidateFoundEvent()

    public fun get_PreviewKeyDownEvent() = ABI.IUIElementStatics_Instance.get_PreviewKeyDownEvent()

    public fun get_CharacterReceivedEvent() =
        ABI.IUIElementStatics_Instance.get_CharacterReceivedEvent()

    public fun get_PreviewKeyUpEvent() = ABI.IUIElementStatics_Instance.get_PreviewKeyUpEvent()

    public fun get_BringIntoViewRequestedEvent() =
        ABI.IUIElementStatics_Instance.get_BringIntoViewRequestedEvent()

    public fun get_ContextRequestedEvent() =
        ABI.IUIElementStatics_Instance.get_ContextRequestedEvent()

    public fun get_AllowDropProperty() = ABI.IUIElementStatics_Instance.get_AllowDropProperty()

    public fun get_OpacityProperty() = ABI.IUIElementStatics_Instance.get_OpacityProperty()

    public fun get_ClipProperty() = ABI.IUIElementStatics_Instance.get_ClipProperty()

    public fun get_RenderTransformProperty() =
        ABI.IUIElementStatics_Instance.get_RenderTransformProperty()

    public fun get_ProjectionProperty() = ABI.IUIElementStatics_Instance.get_ProjectionProperty()

    public fun get_Transform3DProperty() = ABI.IUIElementStatics_Instance.get_Transform3DProperty()

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

    public fun get_CanDragProperty() = ABI.IUIElementStatics_Instance.get_CanDragProperty()

    public fun get_IsRightTapEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsRightTapEnabledProperty()

    public fun get_IsHoldingEnabledProperty() =
        ABI.IUIElementStatics_Instance.get_IsHoldingEnabledProperty()

    public fun get_ManipulationModeProperty() =
        ABI.IUIElementStatics_Instance.get_ManipulationModeProperty()

    public fun get_PointerCapturesProperty() =
        ABI.IUIElementStatics_Instance.get_PointerCapturesProperty()

    public fun get_ContextFlyoutProperty() =
        ABI.IUIElementStatics_Instance.get_ContextFlyoutProperty()

    public fun get_CompositeModeProperty() =
        ABI.IUIElementStatics_Instance.get_CompositeModeProperty()

    public fun get_LightsProperty() = ABI.IUIElementStatics_Instance.get_LightsProperty()

    public fun get_CanBeScrollAnchorProperty() =
        ABI.IUIElementStatics_Instance.get_CanBeScrollAnchorProperty()

    public fun get_ExitDisplayModeOnAccessKeyInvokedProperty() =
        ABI.IUIElementStatics_Instance.get_ExitDisplayModeOnAccessKeyInvokedProperty()

    public fun get_IsAccessKeyScopeProperty() =
        ABI.IUIElementStatics_Instance.get_IsAccessKeyScopeProperty()

    public fun get_AccessKeyScopeOwnerProperty() =
        ABI.IUIElementStatics_Instance.get_AccessKeyScopeOwnerProperty()

    public fun get_AccessKeyProperty() = ABI.IUIElementStatics_Instance.get_AccessKeyProperty()

    public fun get_KeyTipPlacementModeProperty() =
        ABI.IUIElementStatics_Instance.get_KeyTipPlacementModeProperty()

    public fun get_KeyTipHorizontalOffsetProperty() =
        ABI.IUIElementStatics_Instance.get_KeyTipHorizontalOffsetProperty()

    public fun get_KeyTipVerticalOffsetProperty() =
        ABI.IUIElementStatics_Instance.get_KeyTipVerticalOffsetProperty()

    public fun get_KeyTipTargetProperty() =
        ABI.IUIElementStatics_Instance.get_KeyTipTargetProperty()

    public fun get_XYFocusKeyboardNavigationProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusKeyboardNavigationProperty()

    public fun get_XYFocusUpNavigationStrategyProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusUpNavigationStrategyProperty()

    public fun get_XYFocusDownNavigationStrategyProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusDownNavigationStrategyProperty()

    public fun get_XYFocusLeftNavigationStrategyProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusLeftNavigationStrategyProperty()

    public fun get_XYFocusRightNavigationStrategyProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusRightNavigationStrategyProperty()

    public fun get_KeyboardAcceleratorPlacementTargetProperty() =
        ABI.IUIElementStatics_Instance.get_KeyboardAcceleratorPlacementTargetProperty()

    public fun get_KeyboardAcceleratorPlacementModeProperty() =
        ABI.IUIElementStatics_Instance.get_KeyboardAcceleratorPlacementModeProperty()

    public fun get_HighContrastAdjustmentProperty() =
        ABI.IUIElementStatics_Instance.get_HighContrastAdjustmentProperty()

    public fun get_TabFocusNavigationProperty() =
        ABI.IUIElementStatics_Instance.get_TabFocusNavigationProperty()

    public fun get_ShadowProperty() = ABI.IUIElementStatics_Instance.get_ShadowProperty()

    public fun get_FocusStateProperty() = ABI.IUIElementStatics_Instance.get_FocusStateProperty()

    public fun get_UseSystemFocusVisualsProperty() =
        ABI.IUIElementStatics_Instance.get_UseSystemFocusVisualsProperty()

    public fun get_XYFocusLeftProperty() = ABI.IUIElementStatics_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() =
        ABI.IUIElementStatics_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IUIElementStatics_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() = ABI.IUIElementStatics_Instance.get_XYFocusDownProperty()

    public fun get_IsTabStopProperty() = ABI.IUIElementStatics_Instance.get_IsTabStopProperty()

    public fun get_TabIndexProperty() = ABI.IUIElementStatics_Instance.get_TabIndexProperty()

    public fun TryStartDirectManipulation(value: Microsoft.UI.Xaml.Input.Pointer) =
        ABI.IUIElementStatics_Instance.TryStartDirectManipulation(value)

    public fun RegisterAsScrollPort(element: UIElement) =
        ABI.IUIElementStatics_Instance.RegisterAsScrollPort(element)
  }
}
