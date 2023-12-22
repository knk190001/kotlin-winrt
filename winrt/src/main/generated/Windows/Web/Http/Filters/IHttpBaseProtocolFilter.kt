package Windows.Web.Http.Filters

import Windows.Foundation.Collections.IVector
import Windows.Security.Credentials.PasswordCredential
import Windows.Security.Cryptography.Certificates.Certificate
import Windows.Security.Cryptography.Certificates.ChainValidationResult
import Windows.Web.Http.HttpCookieManager
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpBaseProtocolFilter.ABI::class)
@Signature("{71c89b09-e131-4b54-a53c-eb43ff37e9bb}")
@Guid("71c89b09e1314b54a53ceb43ff37e9bb")
@WinRTInterface("71c89b09e1314b54a53ceb43ff37e9bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBaseProtocolFilter.ByReference::class)
public interface IHttpBaseProtocolFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowAutoRedirect(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowAutoRedirect(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AllowUI(): Boolean

  @InterfaceMethod(3)
  public fun put_AllowUI(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AutomaticDecompression(): Boolean

  @InterfaceMethod(5)
  public fun put_AutomaticDecompression(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_CacheControl(): HttpCacheControl?

  @InterfaceMethod(7)
  public fun get_CookieManager(): HttpCookieManager?

  @InterfaceMethod(8)
  public fun get_ClientCertificate(): Certificate?

  @InterfaceMethod(9)
  public fun put_ClientCertificate(value: Certificate?): Unit

  @InterfaceMethod(10)
  public fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>?

  @InterfaceMethod(11)
  public fun get_MaxConnectionsPerServer(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_MaxConnectionsPerServer(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_ProxyCredential(): PasswordCredential?

  @InterfaceMethod(14)
  public fun put_ProxyCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(15)
  public fun get_ServerCredential(): PasswordCredential?

  @InterfaceMethod(16)
  public fun put_ServerCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(17)
  public fun get_UseProxy(): Boolean

  @InterfaceMethod(18)
  public fun put_UseProxy(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBaseProtocolFilter> {
    public override fun getValue() = ABI.makeIHttpBaseProtocolFilter(pointer.getPointer(0))

    public fun setValue(value: IHttpBaseProtocolFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBaseProtocolFilter {
    public val __905293112_Ptr: Pointer?

    public val _905293112_VtblPtr: Pointer?
      get() = __905293112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowAutoRedirect(): Boolean {
      val fnPtr = _905293112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowAutoRedirect(value: Boolean): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowUI(): Boolean {
      val fnPtr = _905293112_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AllowUI(value: Boolean): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AutomaticDecompression(): Boolean {
      val fnPtr = _905293112_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AutomaticDecompression(value: Boolean): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CacheControl(): HttpCacheControl? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCacheControl>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCacheControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CookieManager(): HttpCookieManager? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookieManager>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookieManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ClientCertificate(): Certificate? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ClientCertificate(value: Certificate?): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ChainValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_MaxConnectionsPerServer(): WinDef.UINT {
      val fnPtr = _905293112_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_MaxConnectionsPerServer(value: WinDef.UINT): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ProxyCredential(): PasswordCredential? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ProxyCredential(value: PasswordCredential?): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ServerCredential(): PasswordCredential? {
      val fnPtr = _905293112_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_ServerCredential(value: PasswordCredential?): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_UseProxy(): Boolean {
      val fnPtr = _905293112_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_UseProxy(value: Boolean): Unit {
      val fnPtr = _905293112_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__905293112_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpBaseProtocolFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __905293112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBaseProtocolFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71c89b09e1314b54a53ceb43ff37e9bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBaseProtocolFilter(ptr: Pointer?): WithDefault =
        IHttpBaseProtocolFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBaseProtocolFilter {
      val address = segment.toRawLongValue()
      return makeIHttpBaseProtocolFilter(Pointer(address))
    }

    public override fun toNative(obj: IHttpBaseProtocolFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__905293112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBaseProtocolFilter): Array<IHttpBaseProtocolFilter?>
        = (elements as
        Array<IHttpBaseProtocolFilter?>).castToImpl<IHttpBaseProtocolFilter,IHttpBaseProtocolFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBaseProtocolFilter?> =
        arrayOfNulls<IHttpBaseProtocolFilter_Impl>(size) as Array<IHttpBaseProtocolFilter?>
  }
}
