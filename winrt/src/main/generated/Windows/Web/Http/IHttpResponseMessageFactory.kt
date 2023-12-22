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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpResponseMessageFactory.ABI::class)
@Signature("{52a8af99-f095-43da-b60f-7cfc2bc7ea2f}")
@Guid("52a8af99f09543dab60f7cfc2bc7ea2f")
@WinRTInterface("52a8af99f09543dab60f7cfc2bc7ea2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpResponseMessageFactory.ByReference::class)
public interface IHttpResponseMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(statusCode: HttpStatusCode?): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpResponseMessageFactory> {
    public override fun getValue() = ABI.makeIHttpResponseMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpResponseMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpResponseMessageFactory {
    public val __1614306568_Ptr: Pointer?

    public val _1614306568_VtblPtr: Pointer?
      get() = __1614306568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(statusCode: HttpStatusCode?): HttpResponseMessage? {
      val fnPtr = _1614306568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__1614306568_Ptr, marshalToNative(statusCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IHttpResponseMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1614306568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpResponseMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52a8af99f09543dab60f7cfc2bc7ea2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpResponseMessageFactory(ptr: Pointer?): WithDefault =
        IHttpResponseMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpResponseMessageFactory {
      val address = segment.toRawLongValue()
      return makeIHttpResponseMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpResponseMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1614306568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpResponseMessageFactory):
        Array<IHttpResponseMessageFactory?> = (elements as
        Array<IHttpResponseMessageFactory?>).castToImpl<IHttpResponseMessageFactory,IHttpResponseMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpResponseMessageFactory?> =
        arrayOfNulls<IHttpResponseMessageFactory_Impl>(size) as Array<IHttpResponseMessageFactory?>
  }
}
