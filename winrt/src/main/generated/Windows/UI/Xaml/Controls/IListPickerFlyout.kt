package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.FrameworkElement
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListPickerFlyout.ABI::class)
@Signature("{0f0cb9d7-e5f3-45e6-9063-ff7bbb193c47}")
@Guid("0f0cb9d7e5f345e69063ff7bbb193c47")
@WinRTInterface("0f0cb9d7e5f345e69063ff7bbb193c47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListPickerFlyout.ByReference::class)
public interface IListPickerFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(1)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ItemTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_ItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_DisplayMemberPath(): String?

  @InterfaceMethod(5)
  public fun put_DisplayMemberPath(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_SelectionMode(): ListPickerFlyoutSelectionMode?

  @InterfaceMethod(7)
  public fun put_SelectionMode(value: ListPickerFlyoutSelectionMode?): Unit

  @InterfaceMethod(8)
  public fun get_SelectedIndex(): Int

  @InterfaceMethod(9)
  public fun put_SelectedIndex(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(11)
  public fun put_SelectedItem(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_SelectedValue(): IUnknown?

  @InterfaceMethod(13)
  public fun put_SelectedValue(value: IUnknown?): Unit

  @InterfaceMethod(14)
  public fun get_SelectedValuePath(): String?

  @InterfaceMethod(15)
  public fun put_SelectedValuePath(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_SelectedItems(): IVector<IUnknown?>?

  @InterfaceMethod(17)
  public fun add_ItemsPicked(handler: TypedEventHandler<ListPickerFlyout?, ItemsPickedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_ItemsPicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun ShowAtAsync(target: FrameworkElement?): IAsyncOperation<IVectorView<IUnknown?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListPickerFlyout> {
    public override fun getValue() = ABI.makeIListPickerFlyout(pointer.getPointer(0))

    public fun setValue(value: IListPickerFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListPickerFlyout {
    public val __347105283_Ptr: Pointer?

    public val _347105283_VtblPtr: Pointer?
      get() = __347105283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemTemplate(): DataTemplate? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DisplayMemberPath(): String? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DisplayMemberPath(value: String?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectionMode(): ListPickerFlyoutSelectionMode? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListPickerFlyoutSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListPickerFlyoutSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SelectionMode(value: ListPickerFlyoutSelectionMode?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SelectedIndex(): Int {
      val fnPtr = _347105283_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_SelectedIndex(value: Int): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SelectedItem(value: IUnknown?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_SelectedValue(): IUnknown? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_SelectedValue(value: IUnknown?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_SelectedValuePath(): String? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_SelectedValuePath(value: String?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_SelectedItems(): IVector<IUnknown?>? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun add_ItemsPicked(handler: TypedEventHandler<ListPickerFlyout?,
        ItemsPickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_ItemsPicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _347105283_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun ShowAtAsync(target: FrameworkElement?):
        IAsyncOperation<IVectorView<IUnknown?>?>? {
      val fnPtr = _347105283_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IUnknown?>?>>()
      val hr = fn.invokeHR(arrayOf(__347105283_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IUnknown?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IListPickerFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __347105283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListPickerFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f0cb9d7e5f345e69063ff7bbb193c47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListPickerFlyout(ptr: Pointer?): WithDefault = IListPickerFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListPickerFlyout {
      val address = segment.toRawLongValue()
      return makeIListPickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: IListPickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__347105283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListPickerFlyout): Array<IListPickerFlyout?> = (elements
        as Array<IListPickerFlyout?>).castToImpl<IListPickerFlyout,IListPickerFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListPickerFlyout?> =
        arrayOfNulls<IListPickerFlyout_Impl>(size) as Array<IListPickerFlyout?>
  }
}
