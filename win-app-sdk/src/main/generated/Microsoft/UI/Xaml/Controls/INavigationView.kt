package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Style
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationView.ABI::class)
@Signature("{e77a4b36-3dd1-53d9-9f97-65dccaa74a5c}")
@Guid("e77a4b363dd153d99f9765dccaa74a5c")
@WinRTInterface("e77a4b363dd153d99f9765dccaa74a5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationView.ByReference::class)
public interface INavigationView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPaneOpen(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPaneOpen(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CompactModeThresholdWidth(): Double

  @InterfaceMethod(3)
  public fun put_CompactModeThresholdWidth(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ExpandedModeThresholdWidth(): Double

  @InterfaceMethod(5)
  public fun put_ExpandedModeThresholdWidth(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_FooterMenuItems(): IVector<IUnknown?>?

  @InterfaceMethod(7)
  public fun get_FooterMenuItemsSource(): IUnknown?

  @InterfaceMethod(8)
  public fun put_FooterMenuItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(9)
  public fun get_PaneFooter(): UIElement?

  @InterfaceMethod(10)
  public fun put_PaneFooter(value: UIElement?): Unit

  @InterfaceMethod(11)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(12)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(13)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(14)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(15)
  public fun get_DisplayMode(): NavigationViewDisplayMode?

  @InterfaceMethod(16)
  public fun get_IsSettingsVisible(): Boolean

  @InterfaceMethod(17)
  public fun put_IsSettingsVisible(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_IsPaneToggleButtonVisible(): Boolean

  @InterfaceMethod(19)
  public fun put_IsPaneToggleButtonVisible(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_AlwaysShowHeader(): Boolean

  @InterfaceMethod(21)
  public fun put_AlwaysShowHeader(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_CompactPaneLength(): Double

  @InterfaceMethod(23)
  public fun put_CompactPaneLength(value: Double): Unit

  @InterfaceMethod(24)
  public fun get_OpenPaneLength(): Double

  @InterfaceMethod(25)
  public fun put_OpenPaneLength(value: Double): Unit

  @InterfaceMethod(26)
  public fun get_PaneToggleButtonStyle(): Style?

  @InterfaceMethod(27)
  public fun put_PaneToggleButtonStyle(value: Style?): Unit

  @InterfaceMethod(28)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(29)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(30)
  public fun get_MenuItems(): IVector<IUnknown?>?

  @InterfaceMethod(31)
  public fun get_MenuItemsSource(): IUnknown?

  @InterfaceMethod(32)
  public fun put_MenuItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(33)
  public fun get_SettingsItem(): IUnknown?

  @InterfaceMethod(34)
  public fun get_AutoSuggestBox(): AutoSuggestBox?

  @InterfaceMethod(35)
  public fun put_AutoSuggestBox(value: AutoSuggestBox?): Unit

  @InterfaceMethod(36)
  public fun get_MenuItemTemplate(): DataTemplate?

  @InterfaceMethod(37)
  public fun put_MenuItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(38)
  public fun get_MenuItemTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(39)
  public fun put_MenuItemTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(40)
  public fun get_MenuItemContainerStyle(): Style?

  @InterfaceMethod(41)
  public fun put_MenuItemContainerStyle(value: Style?): Unit

  @InterfaceMethod(42)
  public fun get_MenuItemContainerStyleSelector(): StyleSelector?

  @InterfaceMethod(43)
  public fun put_MenuItemContainerStyleSelector(value: StyleSelector?): Unit

  @InterfaceMethod(44)
  public fun MenuItemFromContainer(container: DependencyObject?): IUnknown?

  @InterfaceMethod(45)
  public fun ContainerFromMenuItem(item: IUnknown?): DependencyObject?

  @InterfaceMethod(46)
  public fun add_SelectionChanged(handler: TypedEventHandler<NavigationView?,
      NavigationViewSelectionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(47)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(48)
  public fun add_ItemInvoked(handler: TypedEventHandler<NavigationView?,
      NavigationViewItemInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(49)
  public fun remove_ItemInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(50)
  public fun add_DisplayModeChanged(handler: TypedEventHandler<NavigationView?,
      NavigationViewDisplayModeChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_DisplayModeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(52)
  public fun get_IsTitleBarAutoPaddingEnabled(): Boolean

  @InterfaceMethod(53)
  public fun put_IsTitleBarAutoPaddingEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationView> {
    public override fun getValue() = ABI.makeINavigationView(pointer.getPointer(0))

    public fun setValue(value: INavigationView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationView {
    public val __421514144_Ptr: Pointer?

    public val _421514144_VtblPtr: Pointer?
      get() = __421514144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPaneOpen(): Boolean {
      val fnPtr = _421514144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPaneOpen(value: Boolean): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CompactModeThresholdWidth(): Double {
      val fnPtr = _421514144_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CompactModeThresholdWidth(value: Double): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExpandedModeThresholdWidth(): Double {
      val fnPtr = _421514144_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ExpandedModeThresholdWidth(value: Double): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FooterMenuItems(): IVector<IUnknown?>? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_FooterMenuItemsSource(): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_FooterMenuItemsSource(value: IUnknown?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_PaneFooter(): UIElement? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_PaneFooter(value: UIElement?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_DisplayMode(): NavigationViewDisplayMode? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_IsSettingsVisible(): Boolean {
      val fnPtr = _421514144_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsSettingsVisible(value: Boolean): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsPaneToggleButtonVisible(): Boolean {
      val fnPtr = _421514144_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsPaneToggleButtonVisible(value: Boolean): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_AlwaysShowHeader(): Boolean {
      val fnPtr = _421514144_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_AlwaysShowHeader(value: Boolean): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CompactPaneLength(): Double {
      val fnPtr = _421514144_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_CompactPaneLength(value: Double): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_OpenPaneLength(): Double {
      val fnPtr = _421514144_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_OpenPaneLength(value: Double): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_PaneToggleButtonStyle(): Style? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_PaneToggleButtonStyle(value: Style?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_MenuItems(): IVector<IUnknown?>? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_MenuItemsSource(): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_MenuItemsSource(value: IUnknown?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_SettingsItem(): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_AutoSuggestBox(): AutoSuggestBox? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoSuggestBox>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoSuggestBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_AutoSuggestBox(value: AutoSuggestBox?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_MenuItemTemplate(): DataTemplate? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_MenuItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_MenuItemTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_MenuItemTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_MenuItemContainerStyle(): Style? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_MenuItemContainerStyle(value: Style?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_MenuItemContainerStyleSelector(): StyleSelector? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSelector>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_MenuItemContainerStyleSelector(value: StyleSelector?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun MenuItemFromContainer(container: DependencyObject?): IUnknown? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun ContainerFromMenuItem(item: IUnknown?): DependencyObject? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun add_SelectionChanged(handler: TypedEventHandler<NavigationView?,
        NavigationViewSelectionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun add_ItemInvoked(handler: TypedEventHandler<NavigationView?,
        NavigationViewItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun remove_ItemInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun add_DisplayModeChanged(handler: TypedEventHandler<NavigationView?,
        NavigationViewDisplayModeChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421514144_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_DisplayModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_IsTitleBarAutoPaddingEnabled(): Boolean {
      val fnPtr = _421514144_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(53)
    public override fun put_IsTitleBarAutoPaddingEnabled(value: Boolean): Unit {
      val fnPtr = _421514144_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421514144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __421514144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e77a4b363dd153d99f9765dccaa74a5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationView(ptr: Pointer?): WithDefault = INavigationView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationView {
      val address = segment.toRawLongValue()
      return makeINavigationView(Pointer(address))
    }

    public override fun toNative(obj: INavigationView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__421514144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationView): Array<INavigationView?> = (elements as
        Array<INavigationView?>).castToImpl<INavigationView,INavigationView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationView?> =
        arrayOfNulls<INavigationView_Impl>(size) as Array<INavigationView?>
  }
}
