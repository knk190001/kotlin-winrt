package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Data.BindingBase
import Microsoft.UI.Xaml.Data.BindingExpression
import Microsoft.UI.Xaml.Media.Brush
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameworkElement.ABI::class)
@Signature("{fe08f13d-dc6a-5495-ad44-c2d8d21863b0}")
@Guid("fe08f13ddc6a5495ad44c2d8d21863b0")
@WinRTInterface("fe08f13ddc6a5495ad44c2d8d21863b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement.ByReference::class)
public interface IFrameworkElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Triggers(): TriggerCollection?

  @InterfaceMethod(1)
  public fun get_Resources(): ResourceDictionary?

  @InterfaceMethod(2)
  public fun put_Resources(value: ResourceDictionary?): Unit

  @InterfaceMethod(3)
  public fun get_Tag(): IUnknown?

  @InterfaceMethod(4)
  public fun put_Tag(value: IUnknown?): Unit

  @InterfaceMethod(5)
  public fun get_Language(): String?

  @InterfaceMethod(6)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_ActualWidth(): Double

  @InterfaceMethod(8)
  public fun get_ActualHeight(): Double

  @InterfaceMethod(9)
  public fun get_Width(): Double

  @InterfaceMethod(10)
  public fun put_Width(value: Double): Unit

  @InterfaceMethod(11)
  public fun get_Height(): Double

  @InterfaceMethod(12)
  public fun put_Height(value: Double): Unit

  @InterfaceMethod(13)
  public fun get_MinWidth(): Double

  @InterfaceMethod(14)
  public fun put_MinWidth(value: Double): Unit

  @InterfaceMethod(15)
  public fun get_MaxWidth(): Double

  @InterfaceMethod(16)
  public fun put_MaxWidth(value: Double): Unit

  @InterfaceMethod(17)
  public fun get_MinHeight(): Double

  @InterfaceMethod(18)
  public fun put_MinHeight(value: Double): Unit

  @InterfaceMethod(19)
  public fun get_MaxHeight(): Double

  @InterfaceMethod(20)
  public fun put_MaxHeight(value: Double): Unit

  @InterfaceMethod(21)
  public fun get_HorizontalAlignment(): HorizontalAlignment?

  @InterfaceMethod(22)
  public fun put_HorizontalAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(23)
  public fun get_VerticalAlignment(): VerticalAlignment?

  @InterfaceMethod(24)
  public fun put_VerticalAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(25)
  public fun get_Margin(): Thickness?

  @InterfaceMethod(26)
  public fun put_Margin(value: Thickness?): Unit

  @InterfaceMethod(27)
  public fun get_Name(): String?

  @InterfaceMethod(28)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(29)
  public fun get_BaseUri(): Uri?

  @InterfaceMethod(30)
  public fun get_DataContext(): IUnknown?

  @InterfaceMethod(31)
  public fun put_DataContext(value: IUnknown?): Unit

  @InterfaceMethod(32)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(33)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_FocusVisualMargin(): Thickness?

  @InterfaceMethod(35)
  public fun put_FocusVisualMargin(value: Thickness?): Unit

  @InterfaceMethod(36)
  public fun get_FocusVisualSecondaryThickness(): Thickness?

  @InterfaceMethod(37)
  public fun put_FocusVisualSecondaryThickness(value: Thickness?): Unit

  @InterfaceMethod(38)
  public fun get_FocusVisualPrimaryThickness(): Thickness?

  @InterfaceMethod(39)
  public fun put_FocusVisualPrimaryThickness(value: Thickness?): Unit

  @InterfaceMethod(40)
  public fun get_FocusVisualSecondaryBrush(): Brush?

  @InterfaceMethod(41)
  public fun put_FocusVisualSecondaryBrush(value: Brush?): Unit

  @InterfaceMethod(42)
  public fun get_FocusVisualPrimaryBrush(): Brush?

  @InterfaceMethod(43)
  public fun put_FocusVisualPrimaryBrush(value: Brush?): Unit

  @InterfaceMethod(44)
  public fun get_AllowFocusWhenDisabled(): Boolean

  @InterfaceMethod(45)
  public fun put_AllowFocusWhenDisabled(value: Boolean): Unit

  @InterfaceMethod(46)
  public fun get_Style(): Style?

  @InterfaceMethod(47)
  public fun put_Style(value: Style?): Unit

  @InterfaceMethod(48)
  public fun get_Parent(): DependencyObject?

  @InterfaceMethod(49)
  public fun get_FlowDirection(): FlowDirection?

  @InterfaceMethod(50)
  public fun put_FlowDirection(value: FlowDirection?): Unit

  @InterfaceMethod(51)
  public fun get_RequestedTheme(): ElementTheme?

  @InterfaceMethod(52)
  public fun put_RequestedTheme(value: ElementTheme?): Unit

  @InterfaceMethod(53)
  public fun get_IsLoaded(): Boolean

  @InterfaceMethod(54)
  public fun get_ActualTheme(): ElementTheme?

  @InterfaceMethod(55)
  public fun add_Loaded(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(56)
  public fun remove_Loaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(57)
  public fun add_Unloaded(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(58)
  public fun remove_Unloaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(59)
  public fun add_DataContextChanged(handler: TypedEventHandler<FrameworkElement?,
      DataContextChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(60)
  public fun remove_DataContextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(61)
  public fun add_SizeChanged(handler: SizeChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(62)
  public fun remove_SizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(63)
  public fun add_LayoutUpdated(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(64)
  public fun remove_LayoutUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(65)
  public fun add_Loading(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(66)
  public fun remove_Loading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(67)
  public fun add_ActualThemeChanged(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(68)
  public fun remove_ActualThemeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(69)
  public fun add_EffectiveViewportChanged(handler: TypedEventHandler<FrameworkElement?,
      EffectiveViewportChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(70)
  public fun remove_EffectiveViewportChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(71)
  public fun FindName(name: String?): IUnknown?

  @InterfaceMethod(72)
  public fun SetBinding(dp: DependencyProperty?, binding: BindingBase?): Unit

  @InterfaceMethod(73)
  public fun GetBindingExpression(dp: DependencyProperty?): BindingExpression?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement> {
    public override fun getValue() = ABI.makeIFrameworkElement(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement {
    public val __1230080667_Ptr: Pointer?

    public val _1230080667_VtblPtr: Pointer?
      get() = __1230080667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Triggers(): TriggerCollection? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TriggerCollection>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TriggerCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Resources(): ResourceDictionary? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceDictionary>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceDictionary>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Resources(value: ResourceDictionary?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Tag(): IUnknown? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Tag(value: IUnknown?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Language(): String? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ActualWidth(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_ActualHeight(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Width(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Width(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Height(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_Height(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MinWidth(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_MinWidth(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_MaxWidth(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_MaxWidth(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_MinHeight(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_MinHeight(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_MaxHeight(): Double {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_MaxHeight(value: Double): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_HorizontalAlignment(): HorizontalAlignment? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_HorizontalAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_VerticalAlignment(): VerticalAlignment? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_VerticalAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_Margin(): Thickness? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_Margin(value: Thickness?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_Name(): String? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_BaseUri(): Uri? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_DataContext(): IUnknown? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_DataContext(value: IUnknown?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_FocusVisualMargin(): Thickness? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_FocusVisualMargin(value: Thickness?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_FocusVisualSecondaryThickness(): Thickness? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_FocusVisualSecondaryThickness(value: Thickness?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_FocusVisualPrimaryThickness(): Thickness? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_FocusVisualPrimaryThickness(value: Thickness?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_FocusVisualSecondaryBrush(): Brush? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_FocusVisualSecondaryBrush(value: Brush?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_FocusVisualPrimaryBrush(): Brush? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_FocusVisualPrimaryBrush(value: Brush?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_AllowFocusWhenDisabled(): Boolean {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun put_AllowFocusWhenDisabled(value: Boolean): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_Style(): Style? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_Style(value: Style?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_Parent(): DependencyObject? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_FlowDirection(): FlowDirection? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlowDirection>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlowDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun put_FlowDirection(value: FlowDirection?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun get_RequestedTheme(): ElementTheme? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementTheme>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun put_RequestedTheme(value: ElementTheme?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun get_IsLoaded(): Boolean {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(54)
    public override fun get_ActualTheme(): ElementTheme? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementTheme>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun add_Loaded(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun remove_Loaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun add_Unloaded(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun remove_Unloaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(59)
    public override fun add_DataContextChanged(handler: TypedEventHandler<FrameworkElement?,
        DataContextChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun remove_DataContextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun add_SizeChanged(handler: SizeChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun remove_SizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun add_LayoutUpdated(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun remove_LayoutUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(65)
    public override fun add_Loading(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(66)
    public override fun remove_Loading(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(67)
    public override fun add_ActualThemeChanged(handler: TypedEventHandler<FrameworkElement?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun remove_ActualThemeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(69)
    public override fun add_EffectiveViewportChanged(handler: TypedEventHandler<FrameworkElement?,
        EffectiveViewportChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun remove_EffectiveViewportChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(71)
    public override fun FindName(name: String?): IUnknown? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(72)
    public override fun SetBinding(dp: DependencyProperty?, binding: BindingBase?): Unit {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(dp),
          marshalToNative(binding),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(73)
    public override fun GetBindingExpression(dp: DependencyProperty?): BindingExpression? {
      val fnPtr = _1230080667_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BindingExpression>()
      val hr = fn.invokeHR(arrayOf(__1230080667_Ptr, marshalToNative(dp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BindingExpression>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1230080667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe08f13ddc6a5495ad44c2d8d21863b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement(ptr: Pointer?): WithDefault = IFrameworkElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1230080667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement): Array<IFrameworkElement?> = (elements
        as Array<IFrameworkElement?>).castToImpl<IFrameworkElement,IFrameworkElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement?> =
        arrayOfNulls<IFrameworkElement_Impl>(size) as Array<IFrameworkElement?>
  }
}
