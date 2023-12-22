package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Data.ItemIndexRange
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewBase4.ABI::class)
@Signature("{18b7792b-11dc-4eb6-a7bc-741adb3eeb79}")
@Guid("18b7792b11dc4eb6a7bc741adb3eeb79")
@WinRTInterface("18b7792b11dc4eb6a7bc741adb3eeb79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase4.ByReference::class)
public interface IListViewBase4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedRanges(): IVectorView<ItemIndexRange?>?

  @InterfaceMethod(1)
  public fun get_IsMultiSelectCheckBoxEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsMultiSelectCheckBoxEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun add_DragItemsCompleted(handler: TypedEventHandler<ListViewBase?,
      DragItemsCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_ChoosingItemContainer(handler: TypedEventHandler<ListViewBase?,
      ChoosingItemContainerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ChoosingItemContainer(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_ChoosingGroupHeaderContainer(handler: TypedEventHandler<ListViewBase?,
      ChoosingGroupHeaderContainerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ChoosingGroupHeaderContainer(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun SelectRange(itemIndexRange: ItemIndexRange?): Unit

  @InterfaceMethod(10)
  public fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase4>
      {
    public override fun getValue() = ABI.makeIListViewBase4(pointer.getPointer(0))

    public fun setValue(value: IListViewBase4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase4 {
    public val __1194261060_Ptr: Pointer?

    public val _1194261060_VtblPtr: Pointer?
      get() = __1194261060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedRanges(): IVectorView<ItemIndexRange?>? {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ItemIndexRange?>>()
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ItemIndexRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsMultiSelectCheckBoxEnabled(): Boolean {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsMultiSelectCheckBoxEnabled(value: Boolean): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_DragItemsCompleted(handler: TypedEventHandler<ListViewBase?,
        DragItemsCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_DragItemsCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_ChoosingItemContainer(handler: TypedEventHandler<ListViewBase?,
        ChoosingItemContainerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ChoosingItemContainer(token: EventRegistrationToken?): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_ChoosingGroupHeaderContainer(handler: TypedEventHandler<ListViewBase?,
        ChoosingGroupHeaderContainerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ChoosingGroupHeaderContainer(token: EventRegistrationToken?): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SelectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun DeselectRange(itemIndexRange: ItemIndexRange?): Unit {
      val fnPtr = _1194261060_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1194261060_Ptr, marshalToNative(itemIndexRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewBase4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194261060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18b7792b11dc4eb6a7bc741adb3eeb79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase4(ptr: Pointer?): WithDefault = IListViewBase4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase4 {
      val address = segment.toRawLongValue()
      return makeIListViewBase4(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194261060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase4): Array<IListViewBase4?> = (elements as
        Array<IListViewBase4?>).castToImpl<IListViewBase4,IListViewBase4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase4?> =
        arrayOfNulls<IListViewBase4_Impl>(size) as Array<IListViewBase4?>
  }
}
