package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.Primitives.SnapPointsAlignment
import Windows.UI.Xaml.Visibility
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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewer.ABI::class)
@Signature("{64e9be00-4dc1-493d-abe7-cbd3c577490d}")
@Guid("64e9be004dc1493dabe7cbd3c577490d")
@WinRTInterface("64e9be004dc1493dabe7cbd3c577490d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewer.ByReference::class)
public interface IScrollViewer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalScrollBarVisibility(): ScrollBarVisibility?

  @InterfaceMethod(1)
  public fun put_HorizontalScrollBarVisibility(value: ScrollBarVisibility?): Unit

  @InterfaceMethod(2)
  public fun get_VerticalScrollBarVisibility(): ScrollBarVisibility?

  @InterfaceMethod(3)
  public fun put_VerticalScrollBarVisibility(value: ScrollBarVisibility?): Unit

  @InterfaceMethod(4)
  public fun get_IsHorizontalRailEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsHorizontalRailEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsVerticalRailEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsVerticalRailEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsHorizontalScrollChainingEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsHorizontalScrollChainingEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsVerticalScrollChainingEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsVerticalScrollChainingEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsZoomChainingEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_IsZoomChainingEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsScrollInertiaEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsScrollInertiaEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsZoomInertiaEnabled(): Boolean

  @InterfaceMethod(17)
  public fun put_IsZoomInertiaEnabled(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_HorizontalScrollMode(): ScrollMode?

  @InterfaceMethod(19)
  public fun put_HorizontalScrollMode(value: ScrollMode?): Unit

  @InterfaceMethod(20)
  public fun get_VerticalScrollMode(): ScrollMode?

  @InterfaceMethod(21)
  public fun put_VerticalScrollMode(value: ScrollMode?): Unit

  @InterfaceMethod(22)
  public fun get_ZoomMode(): ZoomMode?

  @InterfaceMethod(23)
  public fun put_ZoomMode(value: ZoomMode?): Unit

  @InterfaceMethod(24)
  public fun get_HorizontalSnapPointsAlignment(): SnapPointsAlignment?

  @InterfaceMethod(25)
  public fun put_HorizontalSnapPointsAlignment(value: SnapPointsAlignment?): Unit

  @InterfaceMethod(26)
  public fun get_VerticalSnapPointsAlignment(): SnapPointsAlignment?

  @InterfaceMethod(27)
  public fun put_VerticalSnapPointsAlignment(value: SnapPointsAlignment?): Unit

  @InterfaceMethod(28)
  public fun get_HorizontalSnapPointsType(): SnapPointsType?

  @InterfaceMethod(29)
  public fun put_HorizontalSnapPointsType(value: SnapPointsType?): Unit

  @InterfaceMethod(30)
  public fun get_VerticalSnapPointsType(): SnapPointsType?

  @InterfaceMethod(31)
  public fun put_VerticalSnapPointsType(value: SnapPointsType?): Unit

  @InterfaceMethod(32)
  public fun get_ZoomSnapPointsType(): SnapPointsType?

  @InterfaceMethod(33)
  public fun put_ZoomSnapPointsType(value: SnapPointsType?): Unit

  @InterfaceMethod(34)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(35)
  public fun get_ViewportWidth(): Double

  @InterfaceMethod(36)
  public fun get_ScrollableWidth(): Double

  @InterfaceMethod(37)
  public fun get_ComputedHorizontalScrollBarVisibility(): Visibility?

  @InterfaceMethod(38)
  public fun get_ExtentWidth(): Double

  @InterfaceMethod(39)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(40)
  public fun get_ViewportHeight(): Double

  @InterfaceMethod(41)
  public fun get_ScrollableHeight(): Double

  @InterfaceMethod(42)
  public fun get_ComputedVerticalScrollBarVisibility(): Visibility?

  @InterfaceMethod(43)
  public fun get_ExtentHeight(): Double

  @InterfaceMethod(44)
  public fun get_MinZoomFactor(): Float

  @InterfaceMethod(45)
  public fun put_MinZoomFactor(value: Float): Unit

  @InterfaceMethod(46)
  public fun get_MaxZoomFactor(): Float

  @InterfaceMethod(47)
  public fun put_MaxZoomFactor(value: Float): Unit

  @InterfaceMethod(48)
  public fun get_ZoomFactor(): Float

  @InterfaceMethod(49)
  public fun get_ZoomSnapPoints(): IVector<Float>?

  @InterfaceMethod(50)
  public fun add_ViewChanged(handler: EventHandler<ScrollViewerViewChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_ViewChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(52)
  public fun ScrollToHorizontalOffset(offset: Double): Unit

  @InterfaceMethod(53)
  public fun ScrollToVerticalOffset(offset: Double): Unit

  @InterfaceMethod(54)
  public fun ZoomToFactor(factor: Float): Unit

  @InterfaceMethod(55)
  public fun InvalidateScrollInfo(): Unit

  @InterfaceMethod(56)
  public fun get_IsDeferredScrollingEnabled(): Boolean

  @InterfaceMethod(57)
  public fun put_IsDeferredScrollingEnabled(value: Boolean): Unit

  @InterfaceMethod(58)
  public fun get_BringIntoViewOnFocusChange(): Boolean

  @InterfaceMethod(59)
  public fun put_BringIntoViewOnFocusChange(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScrollViewer>
      {
    public override fun getValue() = ABI.makeIScrollViewer(pointer.getPointer(0))

    public fun setValue(value: IScrollViewer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewer {
    public val __698354011_Ptr: Pointer?

    public val _698354011_VtblPtr: Pointer?
      get() = __698354011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalScrollBarVisibility(): ScrollBarVisibility? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollBarVisibility>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollBarVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalScrollBarVisibility(value: ScrollBarVisibility?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VerticalScrollBarVisibility(): ScrollBarVisibility? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollBarVisibility>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollBarVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_VerticalScrollBarVisibility(value: ScrollBarVisibility?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsHorizontalRailEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsHorizontalRailEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsVerticalRailEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsVerticalRailEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsHorizontalScrollChainingEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsHorizontalScrollChainingEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsVerticalScrollChainingEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsVerticalScrollChainingEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsZoomChainingEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsZoomChainingEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsScrollInertiaEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsScrollInertiaEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsZoomInertiaEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsZoomInertiaEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_HorizontalScrollMode(): ScrollMode? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollMode>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_HorizontalScrollMode(value: ScrollMode?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_VerticalScrollMode(): ScrollMode? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollMode>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_VerticalScrollMode(value: ScrollMode?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_ZoomMode(): ZoomMode? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ZoomMode>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ZoomMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_ZoomMode(value: ZoomMode?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_HorizontalSnapPointsAlignment(): SnapPointsAlignment? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SnapPointsAlignment>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SnapPointsAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_HorizontalSnapPointsAlignment(value: SnapPointsAlignment?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_VerticalSnapPointsAlignment(): SnapPointsAlignment? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SnapPointsAlignment>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SnapPointsAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_VerticalSnapPointsAlignment(value: SnapPointsAlignment?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_HorizontalSnapPointsType(): SnapPointsType? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SnapPointsType>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SnapPointsType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_HorizontalSnapPointsType(value: SnapPointsType?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_VerticalSnapPointsType(): SnapPointsType? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SnapPointsType>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SnapPointsType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_VerticalSnapPointsType(value: SnapPointsType?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ZoomSnapPointsType(): SnapPointsType? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SnapPointsType>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SnapPointsType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_ZoomSnapPointsType(value: SnapPointsType?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun get_ViewportWidth(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun get_ScrollableWidth(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun get_ComputedHorizontalScrollBarVisibility(): Visibility? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_ExtentWidth(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun get_ViewportHeight(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun get_ScrollableHeight(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(42)
    public override fun get_ComputedVerticalScrollBarVisibility(): Visibility? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_ExtentHeight(): Double {
      val fnPtr = _698354011_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(44)
    public override fun get_MinZoomFactor(): Float {
      val fnPtr = _698354011_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun put_MinZoomFactor(value: Float): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_MaxZoomFactor(): Float {
      val fnPtr = _698354011_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_MaxZoomFactor(value: Float): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_ZoomFactor(): Float {
      val fnPtr = _698354011_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun get_ZoomSnapPoints(): IVector<Float>? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Float>>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun add_ViewChanged(handler: EventHandler<ScrollViewerViewChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _698354011_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_ViewChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun ScrollToHorizontalOffset(offset: Double): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, offset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun ScrollToVerticalOffset(offset: Double): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, offset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun ZoomToFactor(factor: Float): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, factor,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun InvalidateScrollInfo(): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_IsDeferredScrollingEnabled(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(57)
    public override fun put_IsDeferredScrollingEnabled(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_BringIntoViewOnFocusChange(): Boolean {
      val fnPtr = _698354011_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(59)
    public override fun put_BringIntoViewOnFocusChange(value: Boolean): Unit {
      val fnPtr = _698354011_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__698354011_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollViewer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __698354011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e9be004dc1493dabe7cbd3c577490d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewer(ptr: Pointer?): WithDefault = IScrollViewer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewer {
      val address = segment.toRawLongValue()
      return makeIScrollViewer(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__698354011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewer): Array<IScrollViewer?> = (elements as
        Array<IScrollViewer?>).castToImpl<IScrollViewer,IScrollViewer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewer?> =
        arrayOfNulls<IScrollViewer_Impl>(size) as Array<IScrollViewer?>
  }
}
