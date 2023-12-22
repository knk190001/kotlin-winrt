package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DragEventHandler
import Microsoft.UI.Xaml.Input.ICommand
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorChangedEventArgs
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITabView.ABI::class)
@Signature("{07b509e1-1d38-551b-95f4-4732b049f6a6}")
@Guid("07b509e11d38551b95f44732b049f6a6")
@WinRTInterface("07b509e11d38551b95f44732b049f6a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabView.ByReference::class)
public interface ITabView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TabWidthMode(): TabViewWidthMode?

  @InterfaceMethod(1)
  public fun put_TabWidthMode(value: TabViewWidthMode?): Unit

  @InterfaceMethod(2)
  public fun get_CloseButtonOverlayMode(): TabViewCloseButtonOverlayMode?

  @InterfaceMethod(3)
  public fun put_CloseButtonOverlayMode(value: TabViewCloseButtonOverlayMode?): Unit

  @InterfaceMethod(4)
  public fun get_TabStripHeader(): IUnknown?

  @InterfaceMethod(5)
  public fun put_TabStripHeader(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun get_TabStripHeaderTemplate(): DataTemplate?

  @InterfaceMethod(7)
  public fun put_TabStripHeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(8)
  public fun get_TabStripFooter(): IUnknown?

  @InterfaceMethod(9)
  public fun put_TabStripFooter(value: IUnknown?): Unit

  @InterfaceMethod(10)
  public fun get_TabStripFooterTemplate(): DataTemplate?

  @InterfaceMethod(11)
  public fun put_TabStripFooterTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(12)
  public fun get_IsAddTabButtonVisible(): Boolean

  @InterfaceMethod(13)
  public fun put_IsAddTabButtonVisible(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_AddTabButtonCommand(): ICommand?

  @InterfaceMethod(15)
  public fun put_AddTabButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(16)
  public fun get_AddTabButtonCommandParameter(): IUnknown?

  @InterfaceMethod(17)
  public fun put_AddTabButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun add_TabCloseRequested(handler: TypedEventHandler<TabView?,
      TabViewTabCloseRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_TabCloseRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_TabDroppedOutside(handler: TypedEventHandler<TabView?,
      TabViewTabDroppedOutsideEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_TabDroppedOutside(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_AddTabButtonClick(handler: TypedEventHandler<TabView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_AddTabButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_TabItemsChanged(handler: TypedEventHandler<TabView?, IVectorChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_TabItemsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun get_TabItemsSource(): IUnknown?

  @InterfaceMethod(27)
  public fun put_TabItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(28)
  public fun get_TabItems(): IVector<IUnknown?>?

  @InterfaceMethod(29)
  public fun get_TabItemTemplate(): DataTemplate?

  @InterfaceMethod(30)
  public fun put_TabItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(31)
  public fun get_TabItemTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(32)
  public fun put_TabItemTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(33)
  public fun get_CanDragTabs(): Boolean

  @InterfaceMethod(34)
  public fun put_CanDragTabs(value: Boolean): Unit

  @InterfaceMethod(35)
  public fun get_CanReorderTabs(): Boolean

  @InterfaceMethod(36)
  public fun put_CanReorderTabs(value: Boolean): Unit

  @InterfaceMethod(37)
  public fun get_AllowDropTabs(): Boolean

  @InterfaceMethod(38)
  public fun put_AllowDropTabs(value: Boolean): Unit

  @InterfaceMethod(39)
  public fun get_SelectedIndex(): Int

  @InterfaceMethod(40)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(41)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(42)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(43)
  public fun ContainerFromItem(item: IUnknown?): DependencyObject?

  @InterfaceMethod(44)
  public fun ContainerFromIndex(index: Int): DependencyObject?

  @InterfaceMethod(45)
  public fun add_SelectionChanged(handler: SelectionChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_TabDragStarting(handler: TypedEventHandler<TabView?,
      TabViewTabDragStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_TabDragStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(49)
  public fun add_TabDragCompleted(handler: TypedEventHandler<TabView?,
      TabViewTabDragCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(50)
  public fun remove_TabDragCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(51)
  public fun add_TabStripDragOver(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(52)
  public fun remove_TabStripDragOver(token: EventRegistrationToken?): Unit

  @InterfaceMethod(53)
  public fun add_TabStripDrop(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(54)
  public fun remove_TabStripDrop(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITabView> {
    public override fun getValue() = ABI.makeITabView(pointer.getPointer(0))

    public fun setValue(value: ITabView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabView {
    public val __792203315_Ptr: Pointer?

    public val _792203315_VtblPtr: Pointer?
      get() = __792203315_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TabWidthMode(): TabViewWidthMode? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewWidthMode>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewWidthMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TabWidthMode(value: TabViewWidthMode?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CloseButtonOverlayMode(): TabViewCloseButtonOverlayMode? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewCloseButtonOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewCloseButtonOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CloseButtonOverlayMode(value: TabViewCloseButtonOverlayMode?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TabStripHeader(): IUnknown? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TabStripHeader(value: IUnknown?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TabStripHeaderTemplate(): DataTemplate? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TabStripHeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TabStripFooter(): IUnknown? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TabStripFooter(value: IUnknown?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TabStripFooterTemplate(): DataTemplate? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_TabStripFooterTemplate(value: DataTemplate?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsAddTabButtonVisible(): Boolean {
      val fnPtr = _792203315_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsAddTabButtonVisible(value: Boolean): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_AddTabButtonCommand(): ICommand? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_AddTabButtonCommand(value: ICommand?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_AddTabButtonCommandParameter(): IUnknown? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_AddTabButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_TabCloseRequested(handler: TypedEventHandler<TabView?,
        TabViewTabCloseRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_TabCloseRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_TabDroppedOutside(handler: TypedEventHandler<TabView?,
        TabViewTabDroppedOutsideEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_TabDroppedOutside(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_AddTabButtonClick(handler: TypedEventHandler<TabView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_AddTabButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_TabItemsChanged(handler: TypedEventHandler<TabView?,
        IVectorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_TabItemsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_TabItemsSource(): IUnknown? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_TabItemsSource(value: IUnknown?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_TabItems(): IVector<IUnknown?>? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_TabItemTemplate(): DataTemplate? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun put_TabItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_TabItemTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_TabItemTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_CanDragTabs(): Boolean {
      val fnPtr = _792203315_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun put_CanDragTabs(value: Boolean): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_CanReorderTabs(): Boolean {
      val fnPtr = _792203315_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun put_CanReorderTabs(value: Boolean): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_AllowDropTabs(): Boolean {
      val fnPtr = _792203315_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun put_AllowDropTabs(value: Boolean): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _792203315_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun ContainerFromItem(item: IUnknown?): DependencyObject? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun ContainerFromIndex(index: Int): DependencyObject? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun add_SelectionChanged(handler: SelectionChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_TabDragStarting(handler: TypedEventHandler<TabView?,
        TabViewTabDragStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_TabDragStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun add_TabDragCompleted(handler: TypedEventHandler<TabView?,
        TabViewTabDragCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun remove_TabDragCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun add_TabStripDragOver(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun remove_TabStripDragOver(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun add_TabStripDrop(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _792203315_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun remove_TabStripDrop(token: EventRegistrationToken?): Unit {
      val fnPtr = _792203315_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__792203315_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITabView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __792203315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07b509e11d38551b95f44732b049f6a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabView(ptr: Pointer?): WithDefault = ITabView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabView {
      val address = segment.toRawLongValue()
      return makeITabView(Pointer(address))
    }

    public override fun toNative(obj: ITabView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__792203315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabView): Array<ITabView?> = (elements as
        Array<ITabView?>).castToImpl<ITabView,ITabView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabView?> = arrayOfNulls<ITabView_Impl>(size) as
        Array<ITabView?>
  }
}
