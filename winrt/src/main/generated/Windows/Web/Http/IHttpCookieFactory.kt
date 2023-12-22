package Windows.Web.Http

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

@ABIMarker(IHttpCookieFactory.ABI::class)
@Signature("{6a0585a9-931c-4cd1-a96d-c21701785c5f}")
@Guid("6a0585a9931c4cd1a96dc21701785c5f")
@WinRTInterface("6a0585a9931c4cd1a96dc21701785c5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCookieFactory.ByReference::class)
public interface IHttpCookieFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    name: String?,
    domain: String?,
    path: String?
  ): HttpCookie?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCookieFactory> {
    public override fun getValue() = ABI.makeIHttpCookieFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpCookieFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCookieFactory {
    public val __221780446_Ptr: Pointer?

    public val _221780446_VtblPtr: Pointer?
      get() = __221780446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      name: String?,
      domain: String?,
      path: String?
    ): HttpCookie? {
      val fnPtr = _221780446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookie>()
      val hr = fn.invokeHR(arrayOf(__221780446_Ptr, marshalToNative(name), marshalToNative(domain),
          marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookie>(result.getValue())
      return resultValue
    }
  }

  public class IHttpCookieFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __221780446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCookieFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a0585a9931c4cd1a96dc21701785c5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCookieFactory(ptr: Pointer?): WithDefault = IHttpCookieFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCookieFactory {
      val address = segment.toRawLongValue()
      return makeIHttpCookieFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpCookieFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__221780446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCookieFactory): Array<IHttpCookieFactory?> =
        (elements as
        Array<IHttpCookieFactory?>).castToImpl<IHttpCookieFactory,IHttpCookieFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCookieFactory?> =
        arrayOfNulls<IHttpCookieFactory_Impl>(size) as Array<IHttpCookieFactory?>
  }
}
