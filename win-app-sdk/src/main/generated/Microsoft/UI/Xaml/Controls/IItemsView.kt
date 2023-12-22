package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.BringIntoViewOptions
import Microsoft.UI.Xaml.Controls.Primitives.IScrollController
import Microsoft.UI.Xaml.IElementFactory
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IItemsView.ABI::class)
@Signature("{bbb195d8-6a7f-5a42-9866-25fd5a4473ab}")
@Guid("bbb195d86a7f5a42986625fd5a4473ab")
@WinRTInterface("bbb195d86a7f5a42986625fd5a4473ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsView.ByReference::class)
public interface IItemsView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(1)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ScrollView(): ScrollView?

  @InterfaceMethod(3)
  public fun get_VerticalScrollController(): IScrollController?

  @InterfaceMethod(4)
  public fun put_VerticalScrollController(value: IScrollController?): Unit

  @InterfaceMethod(5)
  public fun get_ItemTemplate(): IElementFactory?

  @InterfaceMethod(6)
  public fun put_ItemTemplate(value: IElementFactory?): Unit

  @InterfaceMethod(7)
  public fun get_Layout(): Layout?

  @InterfaceMethod(8)
  public fun put_Layout(value: Layout?): Unit

  @InterfaceMethod(9)
  public fun get_IsItemInvokedEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_IsItemInvokedEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_SelectionMode(): ItemsViewSelectionMode?

  @InterfaceMethod(12)
  public fun put_SelectionMode(value: ItemsViewSelectionMode?): Unit

  @InterfaceMethod(13)
  public fun get_ItemTransitionProvider(): ItemCollectionTransitionProvider?

  @InterfaceMethod(14)
  public fun put_ItemTransitionProvider(value: ItemCollectionTransitionProvider?): Unit

  @InterfaceMethod(15)
  public fun get_CurrentItemIndex(): Int

  @InterfaceMethod(16)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(17)
  public fun get_SelectedItems(): IVectorView<IUnknown?>?

  @InterfaceMethod(18)
  public fun TryGetItemIndex(
    horizontalViewportRatio: Double,
    verticalViewportRatio: Double,
    index: Int
  ): Boolean

  @InterfaceMethod(19)
  public fun StartBringItemIntoView(index: Int, options: BringIntoViewOptions?): Unit

  @InterfaceMethod(20)
  public fun Select(itemIndex: Int): Unit

  @InterfaceMethod(21)
  public fun Deselect(itemIndex: Int): Unit

  @InterfaceMethod(22)
  public fun IsSelected(itemIndex: Int): Boolean

  @InterfaceMethod(23)
  public fun SelectAll(): Unit

  @InterfaceMethod(24)
  public fun DeselectAll(): Unit

  @InterfaceMethod(25)
  public fun InvertSelection(): Unit

  @InterfaceMethod(26)
  public fun add_ItemInvoked(handler: TypedEventHandler<ItemsView?,
      ItemsViewItemInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_ItemInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_SelectionChanged(handler: TypedEventHandler<ItemsView?,
      ItemsViewSelectionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_SelectionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItemsView> {
    public override fun getValue() = ABI.makeIItemsView(pointer.getPointer(0))

    public fun setValue(value: IItemsView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsView {
    public val __1588754590_Ptr: Pointer?

    public val _1588754590_VtblPtr: Pointer?
      get() = __1588754590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ScrollView(): ScrollView? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollView>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VerticalScrollController(): IScrollController? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IScrollController>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IScrollController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_VerticalScrollController(value: IScrollController?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ItemTemplate(): IElementFactory? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IElementFactory>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IElementFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ItemTemplate(value: IElementFactory?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Layout(): Layout? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Layout>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Layout>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Layout(value: Layout?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsItemInvokedEnabled(): Boolean {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsItemInvokedEnabled(value: Boolean): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_SelectionMode(): ItemsViewSelectionMode? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsViewSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsViewSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_SelectionMode(value: ItemsViewSelectionMode?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ItemTransitionProvider(): ItemCollectionTransitionProvider? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionProvider>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ItemTransitionProvider(value: ItemCollectionTransitionProvider?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_CurrentItemIndex(): Int {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SelectedItems(): IVectorView<IUnknown?>? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun TryGetItemIndex(
      horizontalViewportRatio: Double,
      verticalViewportRatio: Double,
      index: Int
    ): Boolean {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, horizontalViewportRatio, verticalViewportRatio,
          index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun StartBringItemIntoView(index: Int, options: BringIntoViewOptions?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, index, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun Select(itemIndex: Int): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, itemIndex,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Deselect(itemIndex: Int): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, itemIndex,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun IsSelected(itemIndex: Int): Boolean {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, itemIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun SelectAll(): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun DeselectAll(): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun InvertSelection(): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_ItemInvoked(handler: TypedEventHandler<ItemsView?,
        ItemsViewItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_ItemInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_SelectionChanged(handler: TypedEventHandler<ItemsView?,
        ItemsViewSelectionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_SelectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1588754590_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1588754590_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1588754590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbb195d86a7f5a42986625fd5a4473ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsView(ptr: Pointer?): WithDefault = IItemsView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsView {
      val address = segment.toRawLongValue()
      return makeIItemsView(Pointer(address))
    }

    public override fun toNative(obj: IItemsView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1588754590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsView): Array<IItemsView?> = (elements as
        Array<IItemsView?>).castToImpl<IItemsView,IItemsView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsView?> = arrayOfNulls<IItemsView_Impl>(size)
        as Array<IItemsView?>
  }
}
