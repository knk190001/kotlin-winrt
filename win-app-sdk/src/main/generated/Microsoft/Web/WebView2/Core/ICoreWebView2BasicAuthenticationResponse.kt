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

@ABIMarker(ICoreWebView2BasicAuthenticationResponse.ABI::class)
@Signature("{08df33b9-6e38-5962-9ffd-caab3c30fbc1}")
@Guid("08df33b96e3859629ffdcaab3c30fbc1")
@WinRTInterface("08df33b96e3859629ffdcaab3c30fbc1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2BasicAuthenticationResponse.ByReference::class)
public interface ICoreWebView2BasicAuthenticationResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserName(): String?

  @InterfaceMethod(1)
  public fun put_UserName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Password(): String?

  @InterfaceMethod(3)
  public fun put_Password(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2BasicAuthenticationResponse> {
    public override fun getValue() =
        ABI.makeICoreWebView2BasicAuthenticationResponse(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2BasicAuthenticationResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2BasicAuthenticationResponse {
    public val __1869150688_Ptr: Pointer?

    public val _1869150688_VtblPtr: Pointer?
      get() = __1869150688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserName(): String? {
      val fnPtr = _1869150688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1869150688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UserName(value: String?): Unit {
      val fnPtr = _1869150688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869150688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Password(): String? {
      val fnPtr = _1869150688_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1869150688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Password(value: String?): Unit {
      val fnPtr = _1869150688_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869150688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2BasicAuthenticationResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1869150688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2BasicAuthenticationResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08df33b96e3859629ffdcaab3c30fbc1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2BasicAuthenticationResponse(ptr: Pointer?): WithDefault =
        ICoreWebView2BasicAuthenticationResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2BasicAuthenticationResponse {
      val address = segment.toRawLongValue()
      return makeICoreWebView2BasicAuthenticationResponse(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2BasicAuthenticationResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1869150688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2BasicAuthenticationResponse):
        Array<ICoreWebView2BasicAuthenticationResponse?> = (elements as
        Array<ICoreWebView2BasicAuthenticationResponse?>).castToImpl<ICoreWebView2BasicAuthenticationResponse,ICoreWebView2BasicAuthenticationResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2BasicAuthenticationResponse?> =
        arrayOfNulls<ICoreWebView2BasicAuthenticationResponse_Impl>(size) as
        Array<ICoreWebView2BasicAuthenticationResponse?>
  }
}
