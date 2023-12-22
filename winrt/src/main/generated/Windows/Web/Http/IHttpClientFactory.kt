package Windows.Web.Http

import Windows.Web.Http.Filters.IHttpFilter
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

@ABIMarker(IHttpClientFactory.ABI::class)
@Signature("{c30c4eca-e3fa-4f99-afb4-63cc65009462}")
@Guid("c30c4ecae3fa4f99afb463cc65009462")
@WinRTInterface("c30c4ecae3fa4f99afb463cc65009462")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpClientFactory.ByReference::class)
public interface IHttpClientFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(filter: IHttpFilter?): HttpClient?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpClientFactory> {
    public override fun getValue() = ABI.makeIHttpClientFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpClientFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpClientFactory {
    public val __1608127781_Ptr: Pointer?

    public val _1608127781_VtblPtr: Pointer?
      get() = __1608127781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(filter: IHttpFilter?): HttpClient? {
      val fnPtr = _1608127781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpClient>()
      val hr = fn.invokeHR(arrayOf(__1608127781_Ptr, marshalToNative(filter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpClient>(result.getValue())
      return resultValue
    }
  }

  public class IHttpClientFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1608127781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpClientFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c30c4ecae3fa4f99afb463cc65009462")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpClientFactory(ptr: Pointer?): WithDefault = IHttpClientFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpClientFactory {
      val address = segment.toRawLongValue()
      return makeIHttpClientFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpClientFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1608127781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpClientFactory): Array<IHttpClientFactory?> =
        (elements as
        Array<IHttpClientFactory?>).castToImpl<IHttpClientFactory,IHttpClientFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpClientFactory?> =
        arrayOfNulls<IHttpClientFactory_Impl>(size) as Array<IHttpClientFactory?>
  }
}
