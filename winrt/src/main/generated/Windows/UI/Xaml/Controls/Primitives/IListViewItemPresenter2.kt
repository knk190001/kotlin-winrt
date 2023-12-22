package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IListViewItemPresenter2.ABI::class)
@Signature("{f5dc5496-e122-4c57-a625-ac4b08fb2d4c}")
@Guid("f5dc5496e1224c57a625ac4b08fb2d4c")
@WinRTInterface("f5dc5496e1224c57a625ac4b08fb2d4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenter2.ByReference::class)
public interface IListViewItemPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedPressedBackground(): Brush?

  @InterfaceMethod(1)
  public fun put_SelectedPressedBackground(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_PressedBackground(): Brush?

  @InterfaceMethod(3)
  public fun put_PressedBackground(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_CheckBoxBrush(): Brush?

  @InterfaceMethod(5)
  public fun put_CheckBoxBrush(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_FocusSecondaryBorderBrush(): Brush?

  @InterfaceMethod(7)
  public fun put_FocusSecondaryBorderBrush(value: Brush?): Unit

  @InterfaceMethod(8)
  public fun get_CheckMode(): ListViewItemPresenterCheckMode?

  @InterfaceMethod(9)
  public fun put_CheckMode(value: ListViewItemPresenterCheckMode?): Unit

  @InterfaceMethod(10)
  public fun get_PointerOverForeground(): Brush?

  @InterfaceMethod(11)
  public fun put_PointerOverForeground(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenter2> {
    public override fun getValue() = ABI.makeIListViewItemPresenter2(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenter2 {
    public val __1417391900_Ptr: Pointer?

    public val _1417391900_VtblPtr: Pointer?
      get() = __1417391900_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedPressedBackground(): Brush? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectedPressedBackground(value: Brush?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PressedBackground(): Brush? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PressedBackground(value: Brush?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CheckBoxBrush(): Brush? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CheckBoxBrush(value: Brush?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FocusSecondaryBorderBrush(): Brush? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FocusSecondaryBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CheckMode(): ListViewItemPresenterCheckMode? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemPresenterCheckMode>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemPresenterCheckMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_CheckMode(value: ListViewItemPresenterCheckMode?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PointerOverForeground(): Brush? {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PointerOverForeground(value: Brush?): Unit {
      val fnPtr = _1417391900_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewItemPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417391900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5dc5496e1224c57a625ac4b08fb2d4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenter2(ptr: Pointer?): WithDefault =
        IListViewItemPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenter2 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1417391900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenter2): Array<IListViewItemPresenter2?>
        = (elements as
        Array<IListViewItemPresenter2?>).castToImpl<IListViewItemPresenter2,IListViewItemPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenter2?> =
        arrayOfNulls<IListViewItemPresenter2_Impl>(size) as Array<IListViewItemPresenter2?>
  }
}
