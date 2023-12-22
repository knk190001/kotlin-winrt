package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Data.ItemIndexRange
import Microsoft.UI.Xaml.Data.LoadMoreItemsResult
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.Animation.ConnectedAnimation
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewBase.ABI::class)
@Signature("{775c57ac-abce-5beb-8e34-3b8158aedd80}")
@Guid("775c57acabce5beb8e343b8158aedd80")
@WinRTInterface("775c57acabce5beb8e343b8158aedd80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase.ByReference::class)
public interface IListViewBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItems(): IVector<IUnknown?>?

  @InterfaceMethod(1)
  public fun get_SelectionMode(): ListViewSelectionMode?

  @InterfaceMethod(2)
  public fun put_SelectionMode(value: ListViewSelectionMode?): Unit

  @InterfaceMethod(3)
  public fun get_IsSwipeEnabled(): Boolean

  @InterfaceMethod(4)
  public fun put_IsSwipeEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_CanDragItems(): Boolean

  @InterfaceMethod(6)
  public fun put_CanDragItems(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_CanReorderItems(): Boolean

  @InterfaceMethod(8)
  public fun put_CanReorderItems(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_IsItemClickEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_IsItemClickEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_DataFetchSize(): Double

  @InterfaceMethod(12)
  public fun put_DataFetchSize(value: Double): Unit

  @InterfaceMethod(13)
  public fun get_IncrementalLoadingThreshold(): Double

  @InterfaceMethod(14)
  public fun put_IncrementalLoadingThreshold(value: Double): Unit

  @InterfaceMethod(15)
  public fun get_IncrementalLoadingTrigger(): IncrementalLoadingTrigger?

  @InterfaceMethod(16)
  public fun put_IncrementalLoadingTrigger(value: IncrementalLoadingTrigger?): Unit

  @InterfaceMethod(17)
  public fun get_ShowsScrollingPlaceholders(): Boolean

  @InterfaceMethod(18)
  public fun put_ShowsScrollingPlaceholders(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_ReorderMode(): ListViewReorderMode?

  @InterfaceMethod(20)
  public fun put_ReorderMode(value: ListViewReorderMode?): Unit

  @InterfaceMethod(21)
  public fun get_SelectedRanges(): IVectorView<ItemIndexRange?>?

  @InterfaceMethod(22)
  public fun get_IsMultiSelectCheckBoxEnabled(): Boolean

  @InterfaceMethod(23)
  public fun put_IsMultiSelectCheckBoxEnabled(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_SingleSelectionFollowsFocus(): Boolean

  @InterfaceMethod(25)
  public fun put_SingleSelectionFollowsFocus(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun add_ItemClick(handler: ItemClickEventHandler?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_ItemClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_DragItemsStarting(handler: DragItemsStartingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_DragItemsCompleted(handler: TypedEventHandler<ListViewBase?,
      DragItemsCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_ContainerContentChanging(handler: TypedEventHandler<ListViewBase?,
      ContainerContentChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_ContainerContentChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_ChoosingItemContainer(handler: TypedEventHandler<ListViewBase?,
      ChoosingItemContainerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_ChoosingItemContainer(token: EventRegistrationToken?): Unit

  @InterfaceMethod(36)
  public fun add_ChoosingGroupHeaderContainer(handler: TypedEventHandler<ListViewBase?,
      ChoosingGroupHeaderContainerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(37)
  public fun remove_ChoosingGroupHeaderContainer(token: EventRegistrationToken?): Unit

  @InterfaceMethod(38)
  public fun ScrollIntoView(item: IUnknown?): Unit

  @InterfaceMethod(39)
  public fun SelectAll(): Unit

  @InterfaceMethod(40)
  public fun LoadMoreItemsAsync(): IAsyncOperation<LoadMoreItemsResult?>?

  @InterfaceMethod(41)
  public fun ScrollIntoView(item: IUnknown?, alignment: ScrollIntoViewAlignment?): Unit

  @InterfaceMethod(42)
  public fun SetDesiredContainerUpdateDuration(duration: TimeSpan?): Unit

  @InterfaceMethod(43)
  public fun SelectRange(itemIndexRange: ItemIndexRange?): Unit

  @InterfaceMethod(44)
  public fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit

  @InterfaceMethod(45)
  public fun IsDragSource(): Boolean

  @InterfaceMethod(46)
  public fun TryStartConnectedAnimationAsync(
    animation: ConnectedAnimation?,
    item: IUnknown?,
    elementName: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(47)
  public fun PrepareConnectedAnimation(
    key: String?,
    item: IUnknown?,
    elementName: String?
  ): ConnectedAnimation?

  @InterfaceMethod(48)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(49)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(50)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(51)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(52)
  public fun get_HeaderTransitions(): TransitionCollection?

  @InterfaceMethod(53)
  public fun put_HeaderTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(54)
  public fun get_Footer(): IUnknown?

  @InterfaceMethod(55)
  public fun put_Footer(value: IUnknown?): Unit

  @InterfaceMethod(56)
  public fun get_FooterTemplate(): DataTemplate?

  @InterfaceMethod(57)
  public fun put_FooterTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(58)
  public fun get_FooterTransitions(): TransitionCollection?

  @InterfaceMethod(59)
  public fun put_FooterTransitions(value: TransitionCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase>
      {
    public override fun getValue() = ABI.makeIListViewBase(pointer.getPointer(0))

    public fun setValue(value: IListViewBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase {
    public val __1085197595_Ptr: Pointer?

    public val _1085197595_VtblPtr: Pointer?
      get() = __1085197595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItems(): IVector<IUnknown?>? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionMode(): ListViewSelectionMode? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SelectionMode(value: ListViewSelectionMode?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsSwipeEnabled(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsSwipeEnabled(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CanDragItems(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CanDragItems(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_CanReorderItems(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_CanReorderItems(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsItemClickEnabled(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsItemClickEnabled(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_DataFetchSize(): Double {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_DataFetchSize(value: Double): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IncrementalLoadingThreshold(): Double {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IncrementalLoadingThreshold(value: Double): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IncrementalLoadingTrigger(): IncrementalLoadingTrigger? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IncrementalLoadingTrigger>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IncrementalLoadingTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_IncrementalLoadingTrigger(value: IncrementalLoadingTrigger?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_ShowsScrollingPlaceholders(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_ShowsScrollingPlaceholders(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_ReorderMode(): ListViewReorderMode? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewReorderMode>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewReorderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_ReorderMode(value: ListViewReorderMode?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_SelectedRanges(): IVectorView<ItemIndexRange?>? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ItemIndexRange?>>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ItemIndexRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_IsMultiSelectCheckBoxEnabled(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsMultiSelectCheckBoxEnabled(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_SingleSelectionFollowsFocus(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_SingleSelectionFollowsFocus(value: Boolean): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_ItemClick(handler: ItemClickEventHandler?): EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_ItemClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_DragItemsStarting(handler: DragItemsStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_DragItemsCompleted(handler: TypedEventHandler<ListViewBase?,
        DragItemsCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_ContainerContentChanging(handler: TypedEventHandler<ListViewBase?,
        ContainerContentChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_ContainerContentChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_ChoosingItemContainer(handler: TypedEventHandler<ListViewBase?,
        ChoosingItemContainerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_ChoosingItemContainer(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun add_ChoosingGroupHeaderContainer(handler: TypedEventHandler<ListViewBase?,
        ChoosingGroupHeaderContainerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun remove_ChoosingGroupHeaderContainer(token: EventRegistrationToken?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun ScrollIntoView(item: IUnknown?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun SelectAll(): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun LoadMoreItemsAsync(): IAsyncOperation<LoadMoreItemsResult?>? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LoadMoreItemsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LoadMoreItemsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun ScrollIntoView(item: IUnknown?, alignment: ScrollIntoViewAlignment?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(item),
          marshalToNative(alignment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun SetDesiredContainerUpdateDuration(duration: TimeSpan?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(duration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun SelectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun IsDragSource(): Boolean {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun TryStartConnectedAnimationAsync(
      animation: ConnectedAnimation?,
      item: IUnknown?,
      elementName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(animation),
          marshalToNative(item), marshalToNative(elementName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun PrepareConnectedAnimation(
      key: String?,
      item: IUnknown?,
      elementName: String?
    ): ConnectedAnimation? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimation>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(key), marshalToNative(item),
          marshalToNative(elementName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_HeaderTransitions(): TransitionCollection? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_HeaderTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_Footer(): IUnknown? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_Footer(value: IUnknown?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_FooterTemplate(): DataTemplate? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun put_FooterTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_FooterTransitions(): TransitionCollection? {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun put_FooterTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1085197595_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1085197595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1085197595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("775c57acabce5beb8e343b8158aedd80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase(ptr: Pointer?): WithDefault = IListViewBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase {
      val address = segment.toRawLongValue()
      return makeIListViewBase(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1085197595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase): Array<IListViewBase?> = (elements as
        Array<IListViewBase?>).castToImpl<IListViewBase,IListViewBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase?> =
        arrayOfNulls<IListViewBase_Impl>(size) as Array<IListViewBase?>
  }
}
