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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Cookie.ABI::class)
@Signature("{52f670fe-8ca2-5aad-aedb-25f7903b7038}")
@Guid("52f670fe8ca25aadaedb25f7903b7038")
@WinRTInterface("52f670fe8ca25aadaedb25f7903b7038")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Cookie.ByReference::class)
public interface ICoreWebView2Cookie : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  @InterfaceMethod(2)
  public fun put_Value(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Domain(): String?

  @InterfaceMethod(4)
  public fun get_Path(): String?

  @InterfaceMethod(5)
  public fun get_Expires(): Double

  @InterfaceMethod(6)
  public fun put_Expires(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_IsHttpOnly(): Boolean

  @InterfaceMethod(8)
  public fun put_IsHttpOnly(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_SameSite(): CoreWebView2CookieSameSiteKind?

  @InterfaceMethod(10)
  public fun put_SameSite(value: CoreWebView2CookieSameSiteKind?): Unit

  @InterfaceMethod(11)
  public fun get_IsSecure(): Boolean

  @InterfaceMethod(12)
  public fun put_IsSecure(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun get_IsSession(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Cookie> {
    public override fun getValue() = ABI.makeICoreWebView2Cookie(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Cookie_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Cookie {
    public val __117798005_Ptr: Pointer?

    public val _117798005_VtblPtr: Pointer?
      get() = __117798005_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _117798005_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _117798005_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _117798005_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Domain(): String? {
      val fnPtr = _117798005_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Path(): String? {
      val fnPtr = _117798005_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Expires(): Double {
      val fnPtr = _117798005_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Expires(value: Double): Unit {
      val fnPtr = _117798005_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsHttpOnly(): Boolean {
      val fnPtr = _117798005_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_IsHttpOnly(value: Boolean): Unit {
      val fnPtr = _117798005_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_SameSite(): CoreWebView2CookieSameSiteKind? {
      val fnPtr = _117798005_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2CookieSameSiteKind>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2CookieSameSiteKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_SameSite(value: CoreWebView2CookieSameSiteKind?): Unit {
      val fnPtr = _117798005_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_IsSecure(): Boolean {
      val fnPtr = _117798005_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_IsSecure(value: Boolean): Unit {
      val fnPtr = _117798005_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsSession(): Boolean {
      val fnPtr = _117798005_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__117798005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2Cookie_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __117798005_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Cookie, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52f670fe8ca25aadaedb25f7903b7038")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Cookie(ptr: Pointer?): WithDefault = ICoreWebView2Cookie_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Cookie {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Cookie(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Cookie): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__117798005_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Cookie): Array<ICoreWebView2Cookie?> =
        (elements as
        Array<ICoreWebView2Cookie?>).castToImpl<ICoreWebView2Cookie,ICoreWebView2Cookie_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Cookie?> =
        arrayOfNulls<ICoreWebView2Cookie_Impl>(size) as Array<ICoreWebView2Cookie?>
  }
}
