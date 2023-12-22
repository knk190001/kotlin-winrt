package Windows.UI.Core

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.UI.Popups.IUICommand
import Windows.UI.Popups.UICommandInvokedHandler
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWindowDialog.ABI::class)
@Signature("{e7392ce0-c78d-427e-8b2c-01ff420c69d5}")
@Guid("e7392ce0c78d427e8b2c01ff420c69d5")
@WinRTInterface("e7392ce0c78d427e8b2c01ff420c69d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowDialog.ByReference::class)
public interface ICoreWindowDialog : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Showing(handler: TypedEventHandler<CoreWindow?,
      CoreWindowPopupShowingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Showing(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_MaxSize(): Size?

  @InterfaceMethod(3)
  public fun get_MinSize(): Size?

  @InterfaceMethod(4)
  public fun get_Title(): String?

  @InterfaceMethod(5)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_IsInteractionDelayed(): Int

  @InterfaceMethod(7)
  public fun put_IsInteractionDelayed(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Commands(): IVector<IUICommand?>?

  @InterfaceMethod(9)
  public fun get_DefaultCommandIndex(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_DefaultCommandIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_CancelCommandIndex(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_CancelCommandIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_BackButtonCommand(): UICommandInvokedHandler?

  @InterfaceMethod(14)
  public fun put_BackButtonCommand(value: UICommandInvokedHandler?): Unit

  @InterfaceMethod(15)
  public fun ShowAsync(): IAsyncOperation<IUICommand?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowDialog> {
    public override fun getValue() = ABI.makeICoreWindowDialog(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowDialog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowDialog {
    public val __680251506_Ptr: Pointer?

    public val _680251506_VtblPtr: Pointer?
      get() = __680251506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Showing(handler: TypedEventHandler<CoreWindow?,
        CoreWindowPopupShowingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Showing(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxSize(): Size? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinSize(): Size? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Title(): String? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsInteractionDelayed(): Int {
      val fnPtr = _680251506_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsInteractionDelayed(value: Int): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Commands(): IVector<IUICommand?>? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DefaultCommandIndex(): WinDef.UINT {
      val fnPtr = _680251506_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_DefaultCommandIndex(value: WinDef.UINT): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CancelCommandIndex(): WinDef.UINT {
      val fnPtr = _680251506_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_CancelCommandIndex(value: WinDef.UINT): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_BackButtonCommand(): UICommandInvokedHandler? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommandInvokedHandler>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommandInvokedHandler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_BackButtonCommand(value: UICommandInvokedHandler?): Unit {
      val fnPtr = _680251506_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun ShowAsync(): IAsyncOperation<IUICommand?>? {
      val fnPtr = _680251506_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__680251506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowDialog_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __680251506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowDialog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7392ce0c78d427e8b2c01ff420c69d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowDialog(ptr: Pointer?): WithDefault = ICoreWindowDialog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowDialog {
      val address = segment.toRawLongValue()
      return makeICoreWindowDialog(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__680251506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowDialog): Array<ICoreWindowDialog?> = (elements
        as Array<ICoreWindowDialog?>).castToImpl<ICoreWindowDialog,ICoreWindowDialog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowDialog?> =
        arrayOfNulls<ICoreWindowDialog_Impl>(size) as Array<ICoreWindowDialog?>
  }
}
