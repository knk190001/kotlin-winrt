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

@ABIMarker(ICoreWebView2Certificate.ABI::class)
@Signature("{414a3b75-1bc1-55e1-9926-268c0a3462c7}")
@Guid("414a3b751bc155e19926268c0a3462c7")
@WinRTInterface("414a3b751bc155e19926268c0a3462c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Certificate.ByReference::class)
public interface ICoreWebView2Certificate : NativeMapped, IWinRTInterface {
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
  public fun ToPemEncoding(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Certificate> {
    public override fun getValue() = ABI.makeICoreWebView2Certificate(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Certificate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Certificate {
    public val __1835376432_Ptr: Pointer?

    public val _1835376432_VtblPtr: Pointer?
      get() = __1835376432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Subject(): String? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Issuer(): String? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValidFrom(): Double {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ValidTo(): Double {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DerEncodedSerialNumber(): String? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PemEncodedIssuerCertificateChain(): IVectorView<String?>? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ToPemEncoding(): String? {
      val fnPtr = _1835376432_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1835376432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Certificate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1835376432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Certificate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("414a3b751bc155e19926268c0a3462c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Certificate(ptr: Pointer?): WithDefault =
        ICoreWebView2Certificate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Certificate {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Certificate(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Certificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1835376432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Certificate):
        Array<ICoreWebView2Certificate?> = (elements as
        Array<ICoreWebView2Certificate?>).castToImpl<ICoreWebView2Certificate,ICoreWebView2Certificate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Certificate?> =
        arrayOfNulls<ICoreWebView2Certificate_Impl>(size) as Array<ICoreWebView2Certificate?>
  }
}
