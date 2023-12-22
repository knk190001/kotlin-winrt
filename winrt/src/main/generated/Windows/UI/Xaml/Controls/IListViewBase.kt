package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.UI.Xaml.Data.LoadMoreItemsResult
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Media.Animation.TransitionCollection
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

@ABIMarker(IListViewBase.ABI::class)
@Signature("{3d0813ba-6890-4537-bfe5-796d9458edd6}")
@Guid("3d0813ba68904537bfe5796d9458edd6")
@WinRTInterface("3d0813ba68904537bfe5796d9458edd6")
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
  public fun add_ItemClick(handler: ItemClickEventHandler?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_ItemClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_DragItemsStarting(handler: DragItemsStartingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun ScrollIntoView(item: IUnknown?): Unit

  @InterfaceMethod(22)
  public fun SelectAll(): Unit

  @InterfaceMethod(23)
  public fun LoadMoreItemsAsync(): IAsyncOperation<LoadMoreItemsResult?>?

  @InterfaceMethod(24)
  public fun ScrollIntoView(item: IUnknown?, alignment: ScrollIntoViewAlignment?): Unit

  @InterfaceMethod(25)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(26)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(27)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(28)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(29)
  public fun get_HeaderTransitions(): TransitionCollection?

  @InterfaceMethod(30)
  public fun put_HeaderTransitions(value: TransitionCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase>
      {
    public override fun getValue() = ABI.makeIListViewBase(pointer.getPointer(0))

    public fun setValue(value: IListViewBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase {
    public val __654212112_Ptr: Pointer?

    public val _654212112_VtblPtr: Pointer?
      get() = __654212112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItems(): IVector<IUnknown?>? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionMode(): ListViewSelectionMode? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SelectionMode(value: ListViewSelectionMode?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsSwipeEnabled(): Boolean {
      val fnPtr = _654212112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsSwipeEnabled(value: Boolean): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CanDragItems(): Boolean {
      val fnPtr = _654212112_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CanDragItems(value: Boolean): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_CanReorderItems(): Boolean {
      val fnPtr = _654212112_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_CanReorderItems(value: Boolean): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsItemClickEnabled(): Boolean {
      val fnPtr = _654212112_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsItemClickEnabled(value: Boolean): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_DataFetchSize(): Double {
      val fnPtr = _654212112_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_DataFetchSize(value: Double): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IncrementalLoadingThreshold(): Double {
      val fnPtr = _654212112_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IncrementalLoadingThreshold(value: Double): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IncrementalLoadingTrigger(): IncrementalLoadingTrigger? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IncrementalLoadingTrigger>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IncrementalLoadingTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_IncrementalLoadingTrigger(value: IncrementalLoadingTrigger?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_ItemClick(handler: ItemClickEventHandler?): EventRegistrationToken? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_ItemClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_DragItemsStarting(handler: DragItemsStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun ScrollIntoView(item: IUnknown?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SelectAll(): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun LoadMoreItemsAsync(): IAsyncOperation<LoadMoreItemsResult?>? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LoadMoreItemsResult?>>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LoadMoreItemsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun ScrollIntoView(item: IUnknown?, alignment: ScrollIntoViewAlignment?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(item),
          marshalToNative(alignment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_HeaderTransitions(): TransitionCollection? {
      val fnPtr = _654212112_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun put_HeaderTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _654212112_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__654212112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654212112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d0813ba68904537bfe5796d9458edd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase(ptr: Pointer?): WithDefault = IListViewBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase {
      val address = segment.toRawLongValue()
      return makeIListViewBase(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654212112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase): Array<IListViewBase?> = (elements as
        Array<IListViewBase?>).castToImpl<IListViewBase,IListViewBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase?> =
        arrayOfNulls<IListViewBase_Impl>(size) as Array<IListViewBase?>
  }
}
