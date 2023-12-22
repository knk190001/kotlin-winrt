package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IListBox.ABI::class)
@Signature("{f3e7dedf-7a3c-59f1-9e05-ae5026b54293}")
@Guid("f3e7dedf7a3c59f19e05ae5026b54293")
@WinRTInterface("f3e7dedf7a3c59f19e05ae5026b54293")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBox.ByReference::class)
public interface IListBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItems(): IVector<IUnknown?>?

  @InterfaceMethod(1)
  public fun get_SelectionMode(): SelectionMode?

  @InterfaceMethod(2)
  public fun put_SelectionMode(value: SelectionMode?): Unit

  @InterfaceMethod(3)
  public fun get_SingleSelectionFollowsFocus(): Boolean

  @InterfaceMethod(4)
  public fun put_SingleSelectionFollowsFocus(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun ScrollIntoView(item: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun SelectAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListBox> {
    public override fun getValue() = ABI.makeIListBox(pointer.getPointer(0))

    public fun setValue(value: IListBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBox {
    public val __1767269210_Ptr: Pointer?

    public val _1767269210_VtblPtr: Pointer?
      get() = __1767269210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItems(): IVector<IUnknown?>? {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionMode(): SelectionMode? {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SelectionMode(value: SelectionMode?): Unit {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SingleSelectionFollowsFocus(): Boolean {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_SingleSelectionFollowsFocus(value: Boolean): Unit {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ScrollIntoView(item: IUnknown?): Unit {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SelectAll(): Unit {
      val fnPtr = _1767269210_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767269210_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767269210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3e7dedf7a3c59f19e05ae5026b54293")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBox(ptr: Pointer?): WithDefault = IListBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBox {
      val address = segment.toRawLongValue()
      return makeIListBox(Pointer(address))
    }

    public override fun toNative(obj: IListBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767269210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBox): Array<IListBox?> = (elements as
        Array<IListBox?>).castToImpl<IListBox,IListBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBox?> = arrayOfNulls<IListBox_Impl>(size) as
        Array<IListBox?>
  }
}
