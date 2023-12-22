package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Style
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeView2.ABI::class)
@Signature("{b947ca7d-0f6f-594c-83ec-14153d343225}")
@Guid("b947ca7d0f6f594c83ec14153d343225")
@WinRTInterface("b947ca7d0f6f594c83ec14153d343225")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeView2.ByReference::class)
public interface ITreeView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NodeFromContainer(container: DependencyObject?): TreeViewNode?

  @InterfaceMethod(1)
  public fun ContainerFromNode(node: TreeViewNode?): DependencyObject?

  @InterfaceMethod(2)
  public fun ItemFromContainer(container: DependencyObject?): IUnknown?

  @InterfaceMethod(3)
  public fun ContainerFromItem(item: IUnknown?): DependencyObject?

  @InterfaceMethod(4)
  public fun get_CanDragItems(): Boolean

  @InterfaceMethod(5)
  public fun put_CanDragItems(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_CanReorderItems(): Boolean

  @InterfaceMethod(7)
  public fun put_CanReorderItems(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ItemTemplate(): DataTemplate?

  @InterfaceMethod(9)
  public fun put_ItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(10)
  public fun get_ItemTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(11)
  public fun put_ItemTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(12)
  public fun get_ItemContainerStyle(): Style?

  @InterfaceMethod(13)
  public fun put_ItemContainerStyle(value: Style?): Unit

  @InterfaceMethod(14)
  public fun get_ItemContainerStyleSelector(): StyleSelector?

  @InterfaceMethod(15)
  public fun put_ItemContainerStyleSelector(value: StyleSelector?): Unit

  @InterfaceMethod(16)
  public fun get_ItemContainerTransitions(): TransitionCollection?

  @InterfaceMethod(17)
  public fun put_ItemContainerTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(18)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(19)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun add_DragItemsStarting(handler: TypedEventHandler<TreeView?,
      TreeViewDragItemsStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_DragItemsCompleted(handler: TypedEventHandler<TreeView?,
      TreeViewDragItemsCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun get_SelectedNode(): TreeViewNode?

  @InterfaceMethod(25)
  public fun put_SelectedNode(value: TreeViewNode?): Unit

  @InterfaceMethod(26)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(27)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(28)
  public fun get_SelectedItems(): IVector<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeView2> {
    public override fun getValue() = ABI.makeITreeView2(pointer.getPointer(0))

    public fun setValue(value: ITreeView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeView2 {
    public val __559281336_Ptr: Pointer?

    public val _559281336_VtblPtr: Pointer?
      get() = __559281336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NodeFromContainer(container: DependencyObject?): TreeViewNode? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewNode>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ContainerFromNode(node: TreeViewNode?): DependencyObject? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(node), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ItemFromContainer(container: DependencyObject?): IUnknown? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ContainerFromItem(item: IUnknown?): DependencyObject? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CanDragItems(): Boolean {
      val fnPtr = _559281336_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_CanDragItems(value: Boolean): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CanReorderItems(): Boolean {
      val fnPtr = _559281336_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_CanReorderItems(value: Boolean): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ItemTemplate(): DataTemplate? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ItemTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ItemTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ItemContainerStyle(): Style? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ItemContainerStyle(value: Style?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ItemContainerStyleSelector(): StyleSelector? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSelector>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ItemContainerStyleSelector(value: StyleSelector?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ItemContainerTransitions(): TransitionCollection? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ItemContainerTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_DragItemsStarting(handler: TypedEventHandler<TreeView?,
        TreeViewDragItemsStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_DragItemsStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_DragItemsCompleted(handler: TypedEventHandler<TreeView?,
        TreeViewDragItemsCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_SelectedNode(): TreeViewNode? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewNode>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_SelectedNode(value: TreeViewNode?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _559281336_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_SelectedItems(): IVector<IUnknown?>? {
      val fnPtr = _559281336_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__559281336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ITreeView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559281336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b947ca7d0f6f594c83ec14153d343225")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeView2(ptr: Pointer?): WithDefault = ITreeView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeView2 {
      val address = segment.toRawLongValue()
      return makeITreeView2(Pointer(address))
    }

    public override fun toNative(obj: ITreeView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559281336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeView2): Array<ITreeView2?> = (elements as
        Array<ITreeView2?>).castToImpl<ITreeView2,ITreeView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeView2?> = arrayOfNulls<ITreeView2_Impl>(size)
        as Array<ITreeView2?>
  }
}
