package Windows.UI.Popups

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Foundation.Rect
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

@ABIMarker(IPopupMenu.ABI::class)
@Signature("{4e9bc6dc-880d-47fc-a0a1-72b639e62559}")
@Guid("4e9bc6dc880d47fca0a172b639e62559")
@WinRTInterface("4e9bc6dc880d47fca0a172b639e62559")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupMenu.ByReference::class)
public interface IPopupMenu : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Commands(): IVector<IUICommand?>?

  @InterfaceMethod(1)
  public fun ShowAsync(invocationPoint: Point?): IAsyncOperation<IUICommand?>?

  @InterfaceMethod(2)
  public fun ShowForSelectionAsync(selection: Rect?): IAsyncOperation<IUICommand?>?

  @InterfaceMethod(3)
  public fun ShowForSelectionAsync(selection: Rect?, preferredPlacement: Placement?):
      IAsyncOperation<IUICommand?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopupMenu> {
    public override fun getValue() = ABI.makeIPopupMenu(pointer.getPointer(0))

    public fun setValue(value: IPopupMenu_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupMenu {
    public val __839784808_Ptr: Pointer?

    public val _839784808_VtblPtr: Pointer?
      get() = __839784808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Commands(): IVector<IUICommand?>? {
      val fnPtr = _839784808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__839784808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAsync(invocationPoint: Point?): IAsyncOperation<IUICommand?>? {
      val fnPtr = _839784808_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__839784808_Ptr, marshalToNative(invocationPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowForSelectionAsync(selection: Rect?): IAsyncOperation<IUICommand?>? {
      val fnPtr = _839784808_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__839784808_Ptr, marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowForSelectionAsync(selection: Rect?, preferredPlacement: Placement?):
        IAsyncOperation<IUICommand?>? {
      val fnPtr = _839784808_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__839784808_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }
  }

  public class IPopupMenu_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __839784808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupMenu, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e9bc6dc880d47fca0a172b639e62559")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupMenu(ptr: Pointer?): WithDefault = IPopupMenu_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupMenu {
      val address = segment.toRawLongValue()
      return makeIPopupMenu(Pointer(address))
    }

    public override fun toNative(obj: IPopupMenu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__839784808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupMenu): Array<IPopupMenu?> = (elements as
        Array<IPopupMenu?>).castToImpl<IPopupMenu,IPopupMenu_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupMenu?> = arrayOfNulls<IPopupMenu_Impl>(size)
        as Array<IPopupMenu?>
  }
}
