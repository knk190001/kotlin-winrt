package Microsoft.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeView.ABI::class)
@Signature("{1bef9af4-712c-50ef-9bb4-881b975232ab}")
@Guid("1bef9af4712c50ef9bb4881b975232ab")
@WinRTInterface("1bef9af4712c50ef9bb4881b975232ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeView.ByReference::class)
public interface ITreeView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RootNodes(): IVector<TreeViewNode?>?

  @InterfaceMethod(1)
  public fun get_SelectionMode(): TreeViewSelectionMode?

  @InterfaceMethod(2)
  public fun put_SelectionMode(value: TreeViewSelectionMode?): Unit

  @InterfaceMethod(3)
  public fun get_SelectedNodes(): IVector<TreeViewNode?>?

  @InterfaceMethod(4)
  public fun Expand(value: TreeViewNode?): Unit

  @InterfaceMethod(5)
  public fun Collapse(value: TreeViewNode?): Unit

  @InterfaceMethod(6)
  public fun SelectAll(): Unit

  @InterfaceMethod(7)
  public fun add_ItemInvoked(handler: TypedEventHandler<TreeView?, TreeViewItemInvokedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ItemInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_Expanding(handler: TypedEventHandler<TreeView?, TreeViewExpandingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Expanding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Collapsed(handler: TypedEventHandler<TreeView?, TreeViewCollapsedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Collapsed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeView> {
    public override fun getValue() = ABI.makeITreeView(pointer.getPointer(0))

    public fun setValue(value: ITreeView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeView {
    public val __1090337322_Ptr: Pointer?

    public val _1090337322_VtblPtr: Pointer?
      get() = __1090337322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RootNodes(): IVector<TreeViewNode?>? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TreeViewNode?>>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TreeViewNode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionMode(): TreeViewSelectionMode? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SelectionMode(value: TreeViewSelectionMode?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SelectedNodes(): IVector<TreeViewNode?>? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TreeViewNode?>>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TreeViewNode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Expand(value: TreeViewNode?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Collapse(value: TreeViewNode?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SelectAll(): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_ItemInvoked(handler: TypedEventHandler<TreeView?,
        TreeViewItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ItemInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Expanding(handler: TypedEventHandler<TreeView?,
        TreeViewExpandingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Expanding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Collapsed(handler: TypedEventHandler<TreeView?,
        TreeViewCollapsedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Collapsed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1090337322_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090337322_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITreeView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090337322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bef9af4712c50ef9bb4881b975232ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeView(ptr: Pointer?): WithDefault = ITreeView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeView {
      val address = segment.toRawLongValue()
      return makeITreeView(Pointer(address))
    }

    public override fun toNative(obj: ITreeView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090337322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeView): Array<ITreeView?> = (elements as
        Array<ITreeView?>).castToImpl<ITreeView,ITreeView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeView?> = arrayOfNulls<ITreeView_Impl>(size)
        as Array<ITreeView?>
  }
}
