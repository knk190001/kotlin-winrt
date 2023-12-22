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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpRequestMessageFactory.ABI::class)
@Signature("{5bac994e-3886-412e-aec3-52ec7f25616f}")
@Guid("5bac994e3886412eaec352ec7f25616f")
@WinRTInterface("5bac994e3886412eaec352ec7f25616f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpRequestMessageFactory.ByReference::class)
public interface IHttpRequestMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(method: HttpMethod?, uri: Uri?): HttpRequestMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpRequestMessageFactory> {
    public override fun getValue() = ABI.makeIHttpRequestMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpRequestMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpRequestMessageFactory {
    public val __1763598450_Ptr: Pointer?

    public val _1763598450_VtblPtr: Pointer?
      get() = __1763598450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(method: HttpMethod?, uri: Uri?): HttpRequestMessage? {
      val fnPtr = _1763598450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__1763598450_Ptr, marshalToNative(method), marshalToNative(uri),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }
  }

  public class IHttpRequestMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1763598450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpRequestMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bac994e3886412eaec352ec7f25616f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpRequestMessageFactory(ptr: Pointer?): WithDefault =
        IHttpRequestMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpRequestMessageFactory {
      val address = segment.toRawLongValue()
      return makeIHttpRequestMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpRequestMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1763598450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpRequestMessageFactory):
        Array<IHttpRequestMessageFactory?> = (elements as
        Array<IHttpRequestMessageFactory?>).castToImpl<IHttpRequestMessageFactory,IHttpRequestMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpRequestMessageFactory?> =
        arrayOfNulls<IHttpRequestMessageFactory_Impl>(size) as Array<IHttpRequestMessageFactory?>
  }
}
