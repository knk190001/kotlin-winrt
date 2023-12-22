package Microsoft.Web.WebView2.Core

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

@ABIMarker(ICoreWebView2Settings.ABI::class)
@Signature("{003b325e-74cd-52dd-8024-ebb8be38e48e}")
@Guid("003b325e74cd52dd8024ebb8be38e48e")
@WinRTInterface("003b325e74cd52dd8024ebb8be38e48e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings.ByReference::class)
public interface ICoreWebView2Settings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScriptEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsScriptEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsWebMessageEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsWebMessageEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AreDefaultScriptDialogsEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_AreDefaultScriptDialogsEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsStatusBarEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsStatusBarEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_AreDevToolsEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_AreDevToolsEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_AreDefaultContextMenusEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_AreDefaultContextMenusEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_AreHostObjectsAllowed(): Boolean

  @InterfaceMethod(13)
  public fun put_AreHostObjectsAllowed(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsZoomControlEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsZoomControlEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsBuiltInErrorPageEnabled(): Boolean

  @InterfaceMethod(17)
  public fun put_IsBuiltInErrorPageEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings> {
    public override fun getValue() = ABI.makeICoreWebView2Settings(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings {
    public val __446795658_Ptr: Pointer?

    public val _446795658_VtblPtr: Pointer?
      get() = __446795658_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScriptEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsScriptEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsWebMessageEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsWebMessageEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AreDefaultScriptDialogsEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AreDefaultScriptDialogsEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsStatusBarEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsStatusBarEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AreDevToolsEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AreDevToolsEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AreDefaultContextMenusEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_AreDefaultContextMenusEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AreHostObjectsAllowed(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AreHostObjectsAllowed(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsZoomControlEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsZoomControlEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsBuiltInErrorPageEnabled(): Boolean {
      val fnPtr = _446795658_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsBuiltInErrorPageEnabled(value: Boolean): Unit {
      val fnPtr = _446795658_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446795658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __446795658_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("003b325e74cd52dd8024ebb8be38e48e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__446795658_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings): Array<ICoreWebView2Settings?> =
        (elements as
        Array<ICoreWebView2Settings?>).castToImpl<ICoreWebView2Settings,ICoreWebView2Settings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings?> =
        arrayOfNulls<ICoreWebView2Settings_Impl>(size) as Array<ICoreWebView2Settings?>
  }
}
