package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ContextMenuItem.ABI::class)
@Signature("{2a65706f-941a-52cd-8651-a165586b0abf}")
@Guid("2a65706f941a52cd8651a165586b0abf")
@WinRTInterface("2a65706f941a52cd8651a165586b0abf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ContextMenuItem.ByReference::class)
public interface ICoreWebView2ContextMenuItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Label(): String?

  @InterfaceMethod(2)
  public fun get_CommandId(): Int

  @InterfaceMethod(3)
  public fun get_ShortcutKeyDescription(): String?

  @InterfaceMethod(4)
  public fun get_Icon(): IRandomAccessStream?

  @InterfaceMethod(5)
  public fun get_Kind(): CoreWebView2ContextMenuItemKind?

  @InterfaceMethod(6)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(9)
  public fun put_IsChecked(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_Children(): IVector<CoreWebView2ContextMenuItem?>?

  @InterfaceMethod(11)
  public fun add_CustomItemSelected(handler: TypedEventHandler<CoreWebView2ContextMenuItem?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_CustomItemSelected(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ContextMenuItem> {
    public override fun getValue() = ABI.makeICoreWebView2ContextMenuItem(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ContextMenuItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ContextMenuItem {
    public val __940151450_Ptr: Pointer?

    public val _940151450_VtblPtr: Pointer?
      get() = __940151450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Label(): String? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CommandId(): Int {
      val fnPtr = _940151450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ShortcutKeyDescription(): String? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Icon(): IRandomAccessStream? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Kind(): CoreWebView2ContextMenuItemKind? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ContextMenuItemKind>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ContextMenuItemKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _940151450_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _940151450_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _940151450_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _940151450_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Children(): IVector<CoreWebView2ContextMenuItem?>? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<CoreWebView2ContextMenuItem?>>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<CoreWebView2ContextMenuItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override
        fun add_CustomItemSelected(handler: TypedEventHandler<CoreWebView2ContextMenuItem?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _940151450_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_CustomItemSelected(token: EventRegistrationToken?): Unit {
      val fnPtr = _940151450_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__940151450_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2ContextMenuItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __940151450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ContextMenuItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a65706f941a52cd8651a165586b0abf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ContextMenuItem(ptr: Pointer?): WithDefault =
        ICoreWebView2ContextMenuItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ContextMenuItem {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ContextMenuItem(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ContextMenuItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__940151450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ContextMenuItem):
        Array<ICoreWebView2ContextMenuItem?> = (elements as
        Array<ICoreWebView2ContextMenuItem?>).castToImpl<ICoreWebView2ContextMenuItem,ICoreWebView2ContextMenuItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ContextMenuItem?> =
        arrayOfNulls<ICoreWebView2ContextMenuItem_Impl>(size) as
        Array<ICoreWebView2ContextMenuItem?>
  }
}
