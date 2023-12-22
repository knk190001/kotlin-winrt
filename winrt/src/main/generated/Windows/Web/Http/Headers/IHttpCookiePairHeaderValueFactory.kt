package Windows.Web.Http.Headers

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

@ABIMarker(IHttpCookiePairHeaderValueFactory.ABI::class)
@Signature("{635e326f-146f-4f56-aa21-2cb7d6d58b1e}")
@Guid("635e326f146f4f56aa212cb7d6d58b1e")
@WinRTInterface("635e326f146f4f56aa212cb7d6d58b1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCookiePairHeaderValueFactory.ByReference::class)
public interface IHttpCookiePairHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromName(name: String?): HttpCookiePairHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromNameWithValue(name: String?, value: String?): HttpCookiePairHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCookiePairHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpCookiePairHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpCookiePairHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCookiePairHeaderValueFactory {
    public val __465746544_Ptr: Pointer?

    public val _465746544_VtblPtr: Pointer?
      get() = __465746544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromName(name: String?): HttpCookiePairHeaderValue? {
      val fnPtr = _465746544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookiePairHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__465746544_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookiePairHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNameWithValue(name: String?, value: String?):
        HttpCookiePairHeaderValue? {
      val fnPtr = _465746544_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookiePairHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__465746544_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookiePairHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpCookiePairHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __465746544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCookiePairHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("635e326f146f4f56aa212cb7d6d58b1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCookiePairHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpCookiePairHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCookiePairHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpCookiePairHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpCookiePairHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__465746544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCookiePairHeaderValueFactory):
        Array<IHttpCookiePairHeaderValueFactory?> = (elements as
        Array<IHttpCookiePairHeaderValueFactory?>).castToImpl<IHttpCookiePairHeaderValueFactory,IHttpCookiePairHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCookiePairHeaderValueFactory?> =
        arrayOfNulls<IHttpCookiePairHeaderValueFactory_Impl>(size) as
        Array<IHttpCookiePairHeaderValueFactory?>
  }
}
