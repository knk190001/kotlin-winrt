package Microsoft.Web.WebView2.Core

import Windows.Security.Cryptography.Certificates.Certificate
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2Certificate_Manual.ABI::class)
@Signature("{4b9b0fe5-0ad9-5594-81e7-b18ecc0636de}")
@Guid("4b9b0fe50ad9559481e7b18ecc0636de")
@WinRTInterface("4b9b0fe50ad9559481e7b18ecc0636de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = CoreWebView2Certificate_Manual.ByReference::class)
public interface CoreWebView2Certificate_Manual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToCertificate(): Certificate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Certificate_Manual> {
    public override fun getValue() = ABI.makeCoreWebView2Certificate_Manual(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Certificate_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : CoreWebView2Certificate_Manual {
    public val __1313909984_Ptr: Pointer?

    public val _1313909984_VtblPtr: Pointer?
      get() = __1313909984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToCertificate(): Certificate? {
      val fnPtr = _1313909984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1313909984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }
  }

  public class CoreWebView2Certificate_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1313909984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<CoreWebView2Certificate_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b9b0fe50ad9559481e7b18ecc0636de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeCoreWebView2Certificate_Manual(ptr: Pointer?): WithDefault =
        CoreWebView2Certificate_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Certificate_Manual {
      val address = segment.toRawLongValue()
      return makeCoreWebView2Certificate_Manual(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Certificate_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1313909984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: CoreWebView2Certificate_Manual):
        Array<CoreWebView2Certificate_Manual?> = (elements as
        Array<CoreWebView2Certificate_Manual?>).castToImpl<CoreWebView2Certificate_Manual,CoreWebView2Certificate_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<CoreWebView2Certificate_Manual?> =
        arrayOfNulls<CoreWebView2Certificate_Manual_Impl>(size) as
        Array<CoreWebView2Certificate_Manual?>
  }
}
