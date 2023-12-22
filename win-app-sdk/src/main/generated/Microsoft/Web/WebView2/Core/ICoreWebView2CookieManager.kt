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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2CookieManager.ABI::class)
@Signature("{4098f516-adca-5563-aaa5-d7affd847aa3}")
@Guid("4098f516adca5563aaa5d7affd847aa3")
@WinRTInterface("4098f516adca5563aaa5d7affd847aa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CookieManager.ByReference::class)
public interface ICoreWebView2CookieManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCookie(
    name: String?,
    value: String?,
    Domain: String?,
    Path: String?
  ): CoreWebView2Cookie?

  @InterfaceMethod(1)
  public fun CopyCookie(cookieParam: CoreWebView2Cookie?): CoreWebView2Cookie?

  @InterfaceMethod(2)
  public fun AddOrUpdateCookie(cookie: CoreWebView2Cookie?): Unit

  @InterfaceMethod(3)
  public fun DeleteCookie(cookie: CoreWebView2Cookie?): Unit

  @InterfaceMethod(4)
  public fun DeleteCookies(name: String?, uri: String?): Unit

  @InterfaceMethod(5)
  public fun DeleteCookiesWithDomainAndPath(
    name: String?,
    Domain: String?,
    Path: String?
  ): Unit

  @InterfaceMethod(6)
  public fun DeleteAllCookies(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CookieManager> {
    public override fun getValue() = ABI.makeICoreWebView2CookieManager(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CookieManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CookieManager {
    public val __426252706_Ptr: Pointer?

    public val _426252706_VtblPtr: Pointer?
      get() = __426252706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCookie(
      name: String?,
      value: String?,
      Domain: String?,
      Path: String?
    ): CoreWebView2Cookie? {
      val fnPtr = _426252706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Cookie>()
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(Domain), marshalToNative(Path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Cookie>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyCookie(cookieParam: CoreWebView2Cookie?): CoreWebView2Cookie? {
      val fnPtr = _426252706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Cookie>()
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(cookieParam), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Cookie>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AddOrUpdateCookie(cookie: CoreWebView2Cookie?): Unit {
      val fnPtr = _426252706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun DeleteCookie(cookie: CoreWebView2Cookie?): Unit {
      val fnPtr = _426252706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun DeleteCookies(name: String?, uri: String?): Unit {
      val fnPtr = _426252706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(name), marshalToNative(uri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun DeleteCookiesWithDomainAndPath(
      name: String?,
      Domain: String?,
      Path: String?
    ): Unit {
      val fnPtr = _426252706_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, marshalToNative(name), marshalToNative(Domain),
          marshalToNative(Path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun DeleteAllCookies(): Unit {
      val fnPtr = _426252706_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426252706_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2CookieManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __426252706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CookieManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4098f516adca5563aaa5d7affd847aa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CookieManager(ptr: Pointer?): WithDefault =
        ICoreWebView2CookieManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2CookieManager {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CookieManager(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CookieManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__426252706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CookieManager):
        Array<ICoreWebView2CookieManager?> = (elements as
        Array<ICoreWebView2CookieManager?>).castToImpl<ICoreWebView2CookieManager,ICoreWebView2CookieManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2CookieManager?> =
        arrayOfNulls<ICoreWebView2CookieManager_Impl>(size) as Array<ICoreWebView2CookieManager?>
  }
}
