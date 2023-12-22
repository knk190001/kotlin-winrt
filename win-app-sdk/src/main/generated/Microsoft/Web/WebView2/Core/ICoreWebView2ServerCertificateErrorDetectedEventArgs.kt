package Microsoft.Web.WebView2.Core

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ServerCertificateErrorDetectedEventArgs.ABI::class)
@Signature("{90fdc703-5a9e-56f6-a422-7c114c736420}")
@Guid("90fdc7035a9e56f6a4227c114c736420")
@WinRTInterface("90fdc7035a9e56f6a4227c114c736420")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ServerCertificateErrorDetectedEventArgs.ByReference::class)
public interface ICoreWebView2ServerCertificateErrorDetectedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorStatus(): CoreWebView2WebErrorStatus?

  @InterfaceMethod(1)
  public fun get_RequestUri(): String?

  @InterfaceMethod(2)
  public fun get_ServerCertificate(): CoreWebView2Certificate?

  @InterfaceMethod(3)
  public fun get_Action(): CoreWebView2ServerCertificateErrorAction?

  @InterfaceMethod(4)
  public fun put_Action(value: CoreWebView2ServerCertificateErrorAction?): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ServerCertificateErrorDetectedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ServerCertificateErrorDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ServerCertificateErrorDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ServerCertificateErrorDetectedEventArgs {
    public val __1004901318_Ptr: Pointer?

    public val _1004901318_VtblPtr: Pointer?
      get() = __1004901318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorStatus(): CoreWebView2WebErrorStatus? {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestUri(): String? {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServerCertificate(): CoreWebView2Certificate? {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Certificate>()
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Action(): CoreWebView2ServerCertificateErrorAction? {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ServerCertificateErrorAction>()
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CoreWebView2ServerCertificateErrorAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Action(value: CoreWebView2ServerCertificateErrorAction?): Unit {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1004901318_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1004901318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ServerCertificateErrorDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1004901318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ServerCertificateErrorDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90fdc7035a9e56f6a4227c114c736420")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ServerCertificateErrorDetectedEventArgs(ptr: Pointer?): WithDefault
        = ICoreWebView2ServerCertificateErrorDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2ServerCertificateErrorDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ServerCertificateErrorDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ServerCertificateErrorDetectedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1004901318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ServerCertificateErrorDetectedEventArgs):
        Array<ICoreWebView2ServerCertificateErrorDetectedEventArgs?> = (elements as
        Array<ICoreWebView2ServerCertificateErrorDetectedEventArgs?>).castToImpl<ICoreWebView2ServerCertificateErrorDetectedEventArgs,ICoreWebView2ServerCertificateErrorDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreWebView2ServerCertificateErrorDetectedEventArgs?> =
        arrayOfNulls<ICoreWebView2ServerCertificateErrorDetectedEventArgs_Impl>(size) as
        Array<ICoreWebView2ServerCertificateErrorDetectedEventArgs?>
  }
}
