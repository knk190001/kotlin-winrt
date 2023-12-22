package Windows.Web.Http

import Windows.Foundation.Uri
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

@ABIMarker(IHttpCookieManager.ABI::class)
@Signature("{7a431780-cd4f-4e57-a84a-5b0a53d6bb96}")
@Guid("7a431780cd4f4e57a84a5b0a53d6bb96")
@WinRTInterface("7a431780cd4f4e57a84a5b0a53d6bb96")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCookieManager.ByReference::class)
public interface IHttpCookieManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetCookie(cookie: HttpCookie?): Boolean

  @InterfaceMethod(1)
  public fun SetCookie(cookie: HttpCookie?, thirdParty: Boolean): Boolean

  @InterfaceMethod(2)
  public fun DeleteCookie(cookie: HttpCookie?): Unit

  @InterfaceMethod(3)
  public fun GetCookies(uri: Uri?): HttpCookieCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCookieManager> {
    public override fun getValue() = ABI.makeIHttpCookieManager(pointer.getPointer(0))

    public fun setValue(value: IHttpCookieManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCookieManager {
    public val __1705362629_Ptr: Pointer?

    public val _1705362629_VtblPtr: Pointer?
      get() = __1705362629_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetCookie(cookie: HttpCookie?): Boolean {
      val fnPtr = _1705362629_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1705362629_Ptr, marshalToNative(cookie), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun SetCookie(cookie: HttpCookie?, thirdParty: Boolean): Boolean {
      val fnPtr = _1705362629_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1705362629_Ptr, marshalToNative(cookie), thirdParty, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun DeleteCookie(cookie: HttpCookie?): Unit {
      val fnPtr = _1705362629_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1705362629_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetCookies(uri: Uri?): HttpCookieCollection? {
      val fnPtr = _1705362629_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookieCollection>()
      val hr = fn.invokeHR(arrayOf(__1705362629_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookieCollection>(result.getValue())
      return resultValue
    }
  }

  public class IHttpCookieManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1705362629_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCookieManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a431780cd4f4e57a84a5b0a53d6bb96")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCookieManager(ptr: Pointer?): WithDefault = IHttpCookieManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCookieManager {
      val address = segment.toRawLongValue()
      return makeIHttpCookieManager(Pointer(address))
    }

    public override fun toNative(obj: IHttpCookieManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1705362629_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCookieManager): Array<IHttpCookieManager?> =
        (elements as
        Array<IHttpCookieManager?>).castToImpl<IHttpCookieManager,IHttpCookieManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCookieManager?> =
        arrayOfNulls<IHttpCookieManager_Impl>(size) as Array<IHttpCookieManager?>
  }
}
