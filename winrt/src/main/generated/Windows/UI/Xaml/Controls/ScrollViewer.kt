package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollViewer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ScrollViewer;{64e9be00-4dc1-493d-abe7-cbd3c577490d})")
@WinRTByReference(brClass = ScrollViewer.ByReference::class)
public class ScrollViewer(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IScrollViewer.WithDefault, IScrollViewer2.WithDefault,
    IScrollViewer3.WithDefault, IScrollViewer4.WithDefault, IScrollAnchorProvider.WithDefault,
    IWinRTObject {
  private val __698354011_Interface: IScrollViewer.WithDefault by lazy {
    as_698354011()
  }


  private val __174137911_Interface: IScrollViewer2.WithDefault by lazy {
    as_174137911()
  }


  private val __174137912_Interface: IScrollViewer3.WithDefault by lazy {
    as_174137912()
  }


  private val __174137913_Interface: IScrollViewer4.WithDefault by lazy {
    as_174137913()
  }


  private val __1380656655_Interface: IScrollAnchorProvider.WithDefault by lazy {
    as_1380656655()
  }


  public override val __698354011_Ptr: JNAPointer? by lazy {
    __698354011_Interface.__698354011_Ptr
  }


  public override val __174137911_Ptr: JNAPointer? by lazy {
    __174137911_Interface.__174137911_Ptr
  }


  public override val __174137912_Ptr: JNAPointer? by lazy {
    __174137912_Interface.__174137912_Ptr
  }


  public override val __174137913_Ptr: JNAPointer? by lazy {
    __174137913_Interface.__174137913_Ptr
  }


  public override val __1380656655_Ptr: JNAPointer? by lazy {
    __1380656655_Interface.__1380656655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__698354011_Interface, __174137911_Interface, __174137912_Interface,
        __174137913_Interface, __1380656655_Interface)

  public constructor() : this(ABI.activate())

  private fun as_698354011(): IScrollViewer.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewer.ABI.makeIScrollViewer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewer.ABI.makeIScrollViewer(ref.value))
  }

  private fun as_174137911(): IScrollViewer2.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewer2.ABI.makeIScrollViewer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewer2.ABI.makeIScrollViewer2(ref.value))
  }

  private fun as_174137912(): IScrollViewer3.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewer3.ABI.makeIScrollViewer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewer3.ABI.makeIScrollViewer3(ref.value))
  }

  private fun as_174137913(): IScrollViewer4.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewer4.ABI.makeIScrollViewer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewer4.ABI.makeIScrollViewer4(ref.value))
  }

  private fun as_1380656655(): IScrollAnchorProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollAnchorProvider.ABI.makeIScrollAnchorProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollAnchorProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollAnchorProvider.ABI.makeIScrollAnchorProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ScrollViewer> {
    public override fun getValue() = ScrollViewer(pointer.getPointer(0))

    public fun setValue(value: ScrollViewer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollViewer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IScrollViewerStatics2_Instance: IScrollViewerStatics2 by lazy {
      createIScrollViewerStatics2()
    }


    public val IScrollViewerStatics_Instance: IScrollViewerStatics by lazy {
      createIScrollViewerStatics()
    }


    public val IScrollViewerStatics4_Instance: IScrollViewerStatics4 by lazy {
      createIScrollViewerStatics4()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollViewer".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIScrollViewerStatics2(): IScrollViewerStatics2 {
      val refiid = Guid.REFIID(IScrollViewerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollViewer".toHandle(),refiid,interfacePtr)
      val result = IScrollViewerStatics2.ABI.makeIScrollViewerStatics2(interfacePtr.value)
      return result
    }

    public fun createIScrollViewerStatics(): IScrollViewerStatics {
      val refiid = Guid.REFIID(IScrollViewerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollViewer".toHandle(),refiid,interfacePtr)
      val result = IScrollViewerStatics.ABI.makeIScrollViewerStatics(interfacePtr.value)
      return result
    }

    public fun createIScrollViewerStatics4(): IScrollViewerStatics4 {
      val refiid = Guid.REFIID(IScrollViewerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ScrollViewer".toHandle(),refiid,interfacePtr)
      val result = IScrollViewerStatics4.ABI.makeIScrollViewerStatics4(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScrollViewer {
      val address = segment.toRawLongValue()
      return ScrollViewer(Pointer(address))
    }

    public override fun toNative(obj: ScrollViewer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TopLeftHeaderProperty() =
        ABI.IScrollViewerStatics2_Instance.get_TopLeftHeaderProperty()

    public fun get_LeftHeaderProperty() =
        ABI.IScrollViewerStatics2_Instance.get_LeftHeaderProperty()

    public fun get_TopHeaderProperty() = ABI.IScrollViewerStatics2_Instance.get_TopHeaderProperty()

    public fun get_HorizontalSnapPointsAlignmentProperty() =
        ABI.IScrollViewerStatics_Instance.get_HorizontalSnapPointsAlignmentProperty()

    public fun get_VerticalSnapPointsAlignmentProperty() =
        ABI.IScrollViewerStatics_Instance.get_VerticalSnapPointsAlignmentProperty()

    public fun get_HorizontalSnapPointsTypeProperty() =
        ABI.IScrollViewerStatics_Instance.get_HorizontalSnapPointsTypeProperty()

    public fun get_VerticalSnapPointsTypeProperty() =
        ABI.IScrollViewerStatics_Instance.get_VerticalSnapPointsTypeProperty()

    public fun get_ZoomSnapPointsTypeProperty() =
        ABI.IScrollViewerStatics_Instance.get_ZoomSnapPointsTypeProperty()

    public fun get_HorizontalOffsetProperty() =
        ABI.IScrollViewerStatics_Instance.get_HorizontalOffsetProperty()

    public fun get_ViewportWidthProperty() =
        ABI.IScrollViewerStatics_Instance.get_ViewportWidthProperty()

    public fun get_ScrollableWidthProperty() =
        ABI.IScrollViewerStatics_Instance.get_ScrollableWidthProperty()

    public fun get_ComputedHorizontalScrollBarVisibilityProperty() =
        ABI.IScrollViewerStatics_Instance.get_ComputedHorizontalScrollBarVisibilityProperty()

    public fun get_ExtentWidthProperty() =
        ABI.IScrollViewerStatics_Instance.get_ExtentWidthProperty()

    public fun get_VerticalOffsetProperty() =
        ABI.IScrollViewerStatics_Instance.get_VerticalOffsetProperty()

    public fun get_ViewportHeightProperty() =
        ABI.IScrollViewerStatics_Instance.get_ViewportHeightProperty()

    public fun get_ScrollableHeightProperty() =
        ABI.IScrollViewerStatics_Instance.get_ScrollableHeightProperty()

    public fun get_ComputedVerticalScrollBarVisibilityProperty() =
        ABI.IScrollViewerStatics_Instance.get_ComputedVerticalScrollBarVisibilityProperty()

    public fun get_ExtentHeightProperty() =
        ABI.IScrollViewerStatics_Instance.get_ExtentHeightProperty()

    public fun get_MinZoomFactorProperty() =
        ABI.IScrollViewerStatics_Instance.get_MinZoomFactorProperty()

    public fun get_MaxZoomFactorProperty() =
        ABI.IScrollViewerStatics_Instance.get_MaxZoomFactorProperty()

    public fun get_ZoomFactorProperty() = ABI.IScrollViewerStatics_Instance.get_ZoomFactorProperty()

    public fun get_ZoomSnapPointsProperty() =
        ABI.IScrollViewerStatics_Instance.get_ZoomSnapPointsProperty()

    public fun get_HorizontalScrollBarVisibilityProperty() =
        ABI.IScrollViewerStatics_Instance.get_HorizontalScrollBarVisibilityProperty()

    public fun GetHorizontalScrollBarVisibility(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetHorizontalScrollBarVisibility(element)

    public fun SetHorizontalScrollBarVisibility(element: DependencyObject,
        horizontalScrollBarVisibility: ScrollBarVisibility) =
        ABI.IScrollViewerStatics_Instance.SetHorizontalScrollBarVisibility(element,
        horizontalScrollBarVisibility)

    public fun get_VerticalScrollBarVisibilityProperty() =
        ABI.IScrollViewerStatics_Instance.get_VerticalScrollBarVisibilityProperty()

    public fun GetVerticalScrollBarVisibility(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetVerticalScrollBarVisibility(element)

    public fun SetVerticalScrollBarVisibility(element: DependencyObject,
        verticalScrollBarVisibility: ScrollBarVisibility) =
        ABI.IScrollViewerStatics_Instance.SetVerticalScrollBarVisibility(element,
        verticalScrollBarVisibility)

    public fun get_IsHorizontalRailEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsHorizontalRailEnabledProperty()

    public fun GetIsHorizontalRailEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsHorizontalRailEnabled(element)

    public fun SetIsHorizontalRailEnabled(element: DependencyObject,
        isHorizontalRailEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsHorizontalRailEnabled(element,
        isHorizontalRailEnabled)

    public fun get_IsVerticalRailEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsVerticalRailEnabledProperty()

    public fun GetIsVerticalRailEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsVerticalRailEnabled(element)

    public fun SetIsVerticalRailEnabled(element: DependencyObject, isVerticalRailEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsVerticalRailEnabled(element, isVerticalRailEnabled)

    public fun get_IsHorizontalScrollChainingEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsHorizontalScrollChainingEnabledProperty()

    public fun GetIsHorizontalScrollChainingEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsHorizontalScrollChainingEnabled(element)

    public fun SetIsHorizontalScrollChainingEnabled(element: DependencyObject,
        isHorizontalScrollChainingEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsHorizontalScrollChainingEnabled(element,
        isHorizontalScrollChainingEnabled)

    public fun get_IsVerticalScrollChainingEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsVerticalScrollChainingEnabledProperty()

    public fun GetIsVerticalScrollChainingEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsVerticalScrollChainingEnabled(element)

    public fun SetIsVerticalScrollChainingEnabled(element: DependencyObject,
        isVerticalScrollChainingEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsVerticalScrollChainingEnabled(element,
        isVerticalScrollChainingEnabled)

    public fun get_IsZoomChainingEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsZoomChainingEnabledProperty()

    public fun GetIsZoomChainingEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsZoomChainingEnabled(element)

    public fun SetIsZoomChainingEnabled(element: DependencyObject, isZoomChainingEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsZoomChainingEnabled(element, isZoomChainingEnabled)

    public fun get_IsScrollInertiaEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsScrollInertiaEnabledProperty()

    public fun GetIsScrollInertiaEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsScrollInertiaEnabled(element)

    public fun SetIsScrollInertiaEnabled(element: DependencyObject, isScrollInertiaEnabled: Boolean)
        = ABI.IScrollViewerStatics_Instance.SetIsScrollInertiaEnabled(element,
        isScrollInertiaEnabled)

    public fun get_IsZoomInertiaEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsZoomInertiaEnabledProperty()

    public fun GetIsZoomInertiaEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsZoomInertiaEnabled(element)

    public fun SetIsZoomInertiaEnabled(element: DependencyObject, isZoomInertiaEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsZoomInertiaEnabled(element, isZoomInertiaEnabled)

    public fun get_HorizontalScrollModeProperty() =
        ABI.IScrollViewerStatics_Instance.get_HorizontalScrollModeProperty()

    public fun GetHorizontalScrollMode(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetHorizontalScrollMode(element)

    public fun SetHorizontalScrollMode(element: DependencyObject, horizontalScrollMode: ScrollMode)
        = ABI.IScrollViewerStatics_Instance.SetHorizontalScrollMode(element, horizontalScrollMode)

    public fun get_VerticalScrollModeProperty() =
        ABI.IScrollViewerStatics_Instance.get_VerticalScrollModeProperty()

    public fun GetVerticalScrollMode(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetVerticalScrollMode(element)

    public fun SetVerticalScrollMode(element: DependencyObject, verticalScrollMode: ScrollMode) =
        ABI.IScrollViewerStatics_Instance.SetVerticalScrollMode(element, verticalScrollMode)

    public fun get_ZoomModeProperty() = ABI.IScrollViewerStatics_Instance.get_ZoomModeProperty()

    public fun GetZoomMode(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetZoomMode(element)

    public fun SetZoomMode(element: DependencyObject, zoomMode: ZoomMode) =
        ABI.IScrollViewerStatics_Instance.SetZoomMode(element, zoomMode)

    public fun get_IsDeferredScrollingEnabledProperty() =
        ABI.IScrollViewerStatics_Instance.get_IsDeferredScrollingEnabledProperty()

    public fun GetIsDeferredScrollingEnabled(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetIsDeferredScrollingEnabled(element)

    public fun SetIsDeferredScrollingEnabled(element: DependencyObject,
        isDeferredScrollingEnabled: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetIsDeferredScrollingEnabled(element,
        isDeferredScrollingEnabled)

    public fun get_BringIntoViewOnFocusChangeProperty() =
        ABI.IScrollViewerStatics_Instance.get_BringIntoViewOnFocusChangeProperty()

    public fun GetBringIntoViewOnFocusChange(element: DependencyObject) =
        ABI.IScrollViewerStatics_Instance.GetBringIntoViewOnFocusChange(element)

    public fun SetBringIntoViewOnFocusChange(element: DependencyObject,
        bringIntoViewOnFocusChange: Boolean) =
        ABI.IScrollViewerStatics_Instance.SetBringIntoViewOnFocusChange(element,
        bringIntoViewOnFocusChange)

    public fun get_ReduceViewportForCoreInputViewOcclusionsProperty() =
        ABI.IScrollViewerStatics4_Instance.get_ReduceViewportForCoreInputViewOcclusionsProperty()

    public fun get_HorizontalAnchorRatioProperty() =
        ABI.IScrollViewerStatics4_Instance.get_HorizontalAnchorRatioProperty()

    public fun get_VerticalAnchorRatioProperty() =
        ABI.IScrollViewerStatics4_Instance.get_VerticalAnchorRatioProperty()

    public fun get_CanContentRenderOutsideBoundsProperty() =
        ABI.IScrollViewerStatics4_Instance.get_CanContentRenderOutsideBoundsProperty()

    public fun GetCanContentRenderOutsideBounds(element: DependencyObject) =
        ABI.IScrollViewerStatics4_Instance.GetCanContentRenderOutsideBounds(element)

    public fun SetCanContentRenderOutsideBounds(element: DependencyObject,
        canContentRenderOutsideBounds: Boolean) =
        ABI.IScrollViewerStatics4_Instance.SetCanContentRenderOutsideBounds(element,
        canContentRenderOutsideBounds)
  }
}
