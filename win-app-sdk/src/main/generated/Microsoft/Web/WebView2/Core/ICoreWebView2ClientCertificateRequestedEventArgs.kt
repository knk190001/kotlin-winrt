package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ClientCertificateRequestedEventArgs.ABI::class)
@Signature("{93287b55-31f9-55a0-b68b-d9841d7e1bf4}")
@Guid("93287b5531f955a0b68bd9841d7e1bf4")
@WinRTInterface("93287b5531f955a0b68bd9841d7e1bf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ClientCertificateRequestedEventArgs.ByReference::class)
public interface ICoreWebView2ClientCertificateRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Host(): String?

  @InterfaceMethod(1)
  public fun get_Port(): Int

  @InterfaceMethod(2)
  public fun get_IsProxy(): Boolean

  @InterfaceMethod(3)
  public fun get_AllowedCertificateAuthorities(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_MutuallyTrustedCertificates(): IVectorView<CoreWebView2ClientCertificate?>?

  @InterfaceMethod(5)
  public fun get_SelectedCertificate(): CoreWebView2ClientCertificate?

  @InterfaceMethod(6)
  public fun put_SelectedCertificate(value: CoreWebView2ClientCertificate?): Unit

  @InterfaceMethod(7)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(8)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_Handled(): Boolean

  @InterfaceMethod(10)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ClientCertificateRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ClientCertificateRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ClientCertificateRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ClientCertificateRequestedEventArgs {
    public val __1220410606_Ptr: Pointer?

    public val _1220410606_VtblPtr: Pointer?
      get() = __1220410606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Host(): String? {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Port(): Int {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsProxy(): Boolean {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AllowedCertificateAuthorities(): IVectorView<String?>? {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MutuallyTrustedCertificates():
        IVectorView<CoreWebView2ClientCertificate?>? {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreWebView2ClientCertificate?>>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<CoreWebView2ClientCertificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SelectedCertificate(): CoreWebView2ClientCertificate? {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ClientCertificate>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ClientCertificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SelectedCertificate(value: CoreWebView2ClientCertificate?): Unit {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1220410606_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1220410606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ClientCertificateRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1220410606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ClientCertificateRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93287b5531f955a0b68bd9841d7e1bf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ClientCertificateRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2ClientCertificateRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2ClientCertificateRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ClientCertificateRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ClientCertificateRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1220410606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ClientCertificateRequestedEventArgs):
        Array<ICoreWebView2ClientCertificateRequestedEventArgs?> = (elements as
        Array<ICoreWebView2ClientCertificateRequestedEventArgs?>).castToImpl<ICoreWebView2ClientCertificateRequestedEventArgs,ICoreWebView2ClientCertificateRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ClientCertificateRequestedEventArgs?>
        = arrayOfNulls<ICoreWebView2ClientCertificateRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2ClientCertificateRequestedEventArgs?>
  }
}
