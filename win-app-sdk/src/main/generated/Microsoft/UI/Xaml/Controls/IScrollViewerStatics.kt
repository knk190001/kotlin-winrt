package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewerStatics.ABI::class)
@Signature("{d971fd86-0a96-50c4-a6e1-9975faa2a142}")
@Guid("d971fd860a9650c4a6e19975faa2a142")
@WinRTInterface("d971fd860a9650c4a6e19975faa2a142")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerStatics.ByReference::class)
public interface IScrollViewerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalSnapPointsAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_VerticalSnapPointsAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HorizontalSnapPointsTypeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_VerticalSnapPointsTypeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ZoomSnapPointsTypeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ViewportWidthProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ScrollableWidthProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ComputedHorizontalScrollBarVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ExtentWidthProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_VerticalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_ViewportHeightProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_ScrollableHeightProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_ComputedVerticalScrollBarVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_ExtentHeightProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_MinZoomFactorProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_MaxZoomFactorProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_ZoomFactorProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_ZoomSnapPointsProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_TopLeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_LeftHeaderProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_TopHeaderProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_ReduceViewportForCoreInputViewOcclusionsProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_HorizontalAnchorRatioProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_VerticalAnchorRatioProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_HorizontalScrollBarVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun GetHorizontalScrollBarVisibility(element: DependencyObject?): ScrollBarVisibility?

  @InterfaceMethod(27)
  public fun SetHorizontalScrollBarVisibility(element: DependencyObject?,
      horizontalScrollBarVisibility: ScrollBarVisibility?): Unit

  @InterfaceMethod(28)
  public fun get_VerticalScrollBarVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(29)
  public fun GetVerticalScrollBarVisibility(element: DependencyObject?): ScrollBarVisibility?

  @InterfaceMethod(30)
  public fun SetVerticalScrollBarVisibility(element: DependencyObject?,
      verticalScrollBarVisibility: ScrollBarVisibility?): Unit

  @InterfaceMethod(31)
  public fun get_IsHorizontalRailEnabledProperty(): DependencyProperty?

  @InterfaceMethod(32)
  public fun GetIsHorizontalRailEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(33)
  public fun SetIsHorizontalRailEnabled(element: DependencyObject?,
      isHorizontalRailEnabled: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_IsVerticalRailEnabledProperty(): DependencyProperty?

  @InterfaceMethod(35)
  public fun GetIsVerticalRailEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(36)
  public fun SetIsVerticalRailEnabled(element: DependencyObject?, isVerticalRailEnabled: Boolean):
      Unit

  @InterfaceMethod(37)
  public fun get_IsHorizontalScrollChainingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(38)
  public fun GetIsHorizontalScrollChainingEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(39)
  public fun SetIsHorizontalScrollChainingEnabled(element: DependencyObject?,
      isHorizontalScrollChainingEnabled: Boolean): Unit

  @InterfaceMethod(40)
  public fun get_IsVerticalScrollChainingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(41)
  public fun GetIsVerticalScrollChainingEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(42)
  public fun SetIsVerticalScrollChainingEnabled(element: DependencyObject?,
      isVerticalScrollChainingEnabled: Boolean): Unit

  @InterfaceMethod(43)
  public fun get_IsZoomChainingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(44)
  public fun GetIsZoomChainingEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(45)
  public fun SetIsZoomChainingEnabled(element: DependencyObject?, isZoomChainingEnabled: Boolean):
      Unit

  @InterfaceMethod(46)
  public fun get_IsScrollInertiaEnabledProperty(): DependencyProperty?

  @InterfaceMethod(47)
  public fun GetIsScrollInertiaEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(48)
  public fun SetIsScrollInertiaEnabled(element: DependencyObject?, isScrollInertiaEnabled: Boolean):
      Unit

  @InterfaceMethod(49)
  public fun get_IsZoomInertiaEnabledProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun GetIsZoomInertiaEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(51)
  public fun SetIsZoomInertiaEnabled(element: DependencyObject?, isZoomInertiaEnabled: Boolean):
      Unit

  @InterfaceMethod(52)
  public fun get_HorizontalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(53)
  public fun GetHorizontalScrollMode(element: DependencyObject?): ScrollMode?

  @InterfaceMethod(54)
  public fun SetHorizontalScrollMode(element: DependencyObject?, horizontalScrollMode: ScrollMode?):
      Unit

  @InterfaceMethod(55)
  public fun get_VerticalScrollModeProperty(): DependencyProperty?

  @InterfaceMethod(56)
  public fun GetVerticalScrollMode(element: DependencyObject?): ScrollMode?

  @InterfaceMethod(57)
  public fun SetVerticalScrollMode(element: DependencyObject?, verticalScrollMode: ScrollMode?):
      Unit

  @InterfaceMethod(58)
  public fun get_ZoomModeProperty(): DependencyProperty?

  @InterfaceMethod(59)
  public fun GetZoomMode(element: DependencyObject?): ZoomMode?

  @InterfaceMethod(60)
  public fun SetZoomMode(element: DependencyObject?, zoomMode: ZoomMode?): Unit

  @InterfaceMethod(61)
  public fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty?

  @InterfaceMethod(62)
  public fun GetCanContentRenderOutsideBounds(element: DependencyObject?): Boolean

  @InterfaceMethod(63)
  public fun SetCanContentRenderOutsideBounds(element: DependencyObject?,
      canContentRenderOutsideBounds: Boolean): Unit

  @InterfaceMethod(64)
  public fun get_IsDeferredScrollingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(65)
  public fun GetIsDeferredScrollingEnabled(element: DependencyObject?): Boolean

  @InterfaceMethod(66)
  public fun SetIsDeferredScrollingEnabled(element: DependencyObject?,
      isDeferredScrollingEnabled: Boolean): Unit

  @InterfaceMethod(67)
  public fun get_BringIntoViewOnFocusChangeProperty(): DependencyProperty?

  @InterfaceMethod(68)
  public fun GetBringIntoViewOnFocusChange(element: DependencyObject?): Boolean

  @InterfaceMethod(69)
  public fun SetBringIntoViewOnFocusChange(element: DependencyObject?,
      bringIntoViewOnFocusChange: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerStatics> {
    public override fun getValue() = ABI.makeIScrollViewerStatics(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerStatics {
    public val __1081377375_Ptr: Pointer?

    public val _1081377375_VtblPtr: Pointer?
      get() = __1081377375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalSnapPointsAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VerticalSnapPointsAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalSnapPointsTypeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VerticalSnapPointsTypeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ZoomSnapPointsTypeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ViewportWidthProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ScrollableWidthProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ComputedHorizontalScrollBarVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ExtentWidthProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_VerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ViewportHeightProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_ScrollableHeightProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ComputedVerticalScrollBarVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ExtentHeightProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_MinZoomFactorProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_MaxZoomFactorProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ZoomFactorProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_ZoomSnapPointsProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_TopLeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_LeftHeaderProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_TopHeaderProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_ReduceViewportForCoreInputViewOcclusionsProperty():
        DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_HorizontalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_VerticalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_HorizontalScrollBarVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun GetHorizontalScrollBarVisibility(element: DependencyObject?):
        ScrollBarVisibility? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollBarVisibility>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollBarVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun SetHorizontalScrollBarVisibility(element: DependencyObject?,
        horizontalScrollBarVisibility: ScrollBarVisibility?): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          marshalToNative(horizontalScrollBarVisibility),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_VerticalScrollBarVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun GetVerticalScrollBarVisibility(element: DependencyObject?):
        ScrollBarVisibility? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollBarVisibility>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollBarVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun SetVerticalScrollBarVisibility(element: DependencyObject?,
        verticalScrollBarVisibility: ScrollBarVisibility?): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          marshalToNative(verticalScrollBarVisibility),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_IsHorizontalRailEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun GetIsHorizontalRailEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun SetIsHorizontalRailEnabled(element: DependencyObject?,
        isHorizontalRailEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isHorizontalRailEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_IsVerticalRailEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun GetIsVerticalRailEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun SetIsVerticalRailEnabled(element: DependencyObject?,
        isVerticalRailEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isVerticalRailEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_IsHorizontalScrollChainingEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun GetIsHorizontalScrollChainingEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun SetIsHorizontalScrollChainingEnabled(element: DependencyObject?,
        isHorizontalScrollChainingEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isHorizontalScrollChainingEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_IsVerticalScrollChainingEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun GetIsVerticalScrollChainingEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(42)
    public override fun SetIsVerticalScrollChainingEnabled(element: DependencyObject?,
        isVerticalScrollChainingEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isVerticalScrollChainingEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_IsZoomChainingEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun GetIsZoomChainingEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun SetIsZoomChainingEnabled(element: DependencyObject?,
        isZoomChainingEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isZoomChainingEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_IsScrollInertiaEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun GetIsScrollInertiaEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(48)
    public override fun SetIsScrollInertiaEnabled(element: DependencyObject?,
        isScrollInertiaEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isScrollInertiaEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_IsZoomInertiaEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun GetIsZoomInertiaEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(51)
    public override fun SetIsZoomInertiaEnabled(element: DependencyObject?,
        isZoomInertiaEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isZoomInertiaEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_HorizontalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun GetHorizontalScrollMode(element: DependencyObject?): ScrollMode? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollMode>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun SetHorizontalScrollMode(element: DependencyObject?,
        horizontalScrollMode: ScrollMode?): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          marshalToNative(horizontalScrollMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun get_VerticalScrollModeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun GetVerticalScrollMode(element: DependencyObject?): ScrollMode? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollMode>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun SetVerticalScrollMode(element: DependencyObject?,
        verticalScrollMode: ScrollMode?): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          marshalToNative(verticalScrollMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_ZoomModeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun GetZoomMode(element: DependencyObject?): ZoomMode? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ZoomMode>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ZoomMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun SetZoomMode(element: DependencyObject?, zoomMode: ZoomMode?): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          marshalToNative(zoomMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun GetCanContentRenderOutsideBounds(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(63)
    public override fun SetCanContentRenderOutsideBounds(element: DependencyObject?,
        canContentRenderOutsideBounds: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          canContentRenderOutsideBounds,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun get_IsDeferredScrollingEnabledProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun GetIsDeferredScrollingEnabled(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(66)
    public override fun SetIsDeferredScrollingEnabled(element: DependencyObject?,
        isDeferredScrollingEnabled: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          isDeferredScrollingEnabled,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(67)
    public override fun get_BringIntoViewOnFocusChangeProperty(): DependencyProperty? {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun GetBringIntoViewOnFocusChange(element: DependencyObject?): Boolean {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(69)
    public override fun SetBringIntoViewOnFocusChange(element: DependencyObject?,
        bringIntoViewOnFocusChange: Boolean): Unit {
      val fnPtr = _1081377375_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1081377375_Ptr, marshalToNative(element),
          bringIntoViewOnFocusChange,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollViewerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1081377375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d971fd860a9650c4a6e19975faa2a142")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerStatics(ptr: Pointer?): WithDefault = IScrollViewerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerStatics {
      val address = segment.toRawLongValue()
      return makeIScrollViewerStatics(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1081377375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerStatics): Array<IScrollViewerStatics?> =
        (elements as
        Array<IScrollViewerStatics?>).castToImpl<IScrollViewerStatics,IScrollViewerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerStatics?> =
        arrayOfNulls<IScrollViewerStatics_Impl>(size) as Array<IScrollViewerStatics?>
  }
}
