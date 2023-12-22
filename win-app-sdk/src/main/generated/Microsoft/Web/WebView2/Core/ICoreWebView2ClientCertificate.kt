package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ClientCertificate.ABI::class)
@Signature("{091b39f2-68df-52b4-8fb0-fd3561af41f2}")
@Guid("091b39f268df52b48fb0fd3561af41f2")
@WinRTInterface("091b39f268df52b48fb0fd3561af41f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ClientCertificate.ByReference::class)
public interface ICoreWebView2ClientCertificate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Subject(): String?

  @InterfaceMethod(1)
  public fun get_Issuer(): String?

  @InterfaceMethod(2)
  public fun get_ValidFrom(): Double

  @InterfaceMethod(3)
  public fun get_ValidTo(): Double

  @InterfaceMethod(4)
  public fun get_DerEncodedSerialNumber(): String?

  @InterfaceMethod(5)
  public fun get_DisplayName(): String?

  @InterfaceMethod(6)
  public fun get_PemEncodedIssuerCertificateChain(): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun get_Kind(): CoreWebView2ClientCertificateKind?

  @InterfaceMethod(8)
  public fun ToPemEncoding(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ClientCertificate> {
    public override fun getValue() = ABI.makeICoreWebView2ClientCertificate(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ClientCertificate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ClientCertificate {
    public val __297355589_Ptr: Pointer?

    public val _297355589_VtblPtr: Pointer?
      get() = __297355589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Subject(): String? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Issuer(): String? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValidFrom(): Double {
      val fnPtr = _297355589_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ValidTo(): Double {
      val fnPtr = _297355589_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DerEncodedSerialNumber(): String? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DisplayName(): String? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PemEncodedIssuerCertificateChain(): IVectorView<String?>? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Kind(): CoreWebView2ClientCertificateKind? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ClientCertificateKind>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ClientCertificateKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ToPemEncoding(): String? {
      val fnPtr = _297355589_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297355589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ClientCertificate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __297355589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ClientCertificate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("091b39f268df52b48fb0fd3561af41f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ClientCertificate(ptr: Pointer?): WithDefault =
        ICoreWebView2ClientCertificate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ClientCertificate {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ClientCertificate(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ClientCertificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__297355589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ClientCertificate):
        Array<ICoreWebView2ClientCertificate?> = (elements as
        Array<ICoreWebView2ClientCertificate?>).castToImpl<ICoreWebView2ClientCertificate,ICoreWebView2ClientCertificate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ClientCertificate?> =
        arrayOfNulls<ICoreWebView2ClientCertificate_Impl>(size) as
        Array<ICoreWebView2ClientCertificate?>
  }
}
