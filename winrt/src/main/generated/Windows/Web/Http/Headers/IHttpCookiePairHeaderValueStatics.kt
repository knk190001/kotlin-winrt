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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpCookiePairHeaderValueStatics.ABI::class)
@Signature("{6e866d48-06af-4462-8158-99388d5dca81}")
@Guid("6e866d4806af4462815899388d5dca81")
@WinRTInterface("6e866d4806af4462815899388d5dca81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCookiePairHeaderValueStatics.ByReference::class)
public interface IHttpCookiePairHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpCookiePairHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      cookiePairHeaderValue: Windows.Web.Http.Headers.HttpCookiePairHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCookiePairHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpCookiePairHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpCookiePairHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCookiePairHeaderValueStatics {
    public val __339506901_Ptr: Pointer?

    public val _339506901_VtblPtr: Pointer?
      get() = __339506901_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpCookiePairHeaderValue? {
      val fnPtr = _339506901_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookiePairHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__339506901_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookiePairHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        cookiePairHeaderValue: Windows.Web.Http.Headers.HttpCookiePairHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _339506901_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__339506901_Ptr, marshalToNative(input),
          marshalToNative(cookiePairHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpCookiePairHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __339506901_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCookiePairHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e866d4806af4462815899388d5dca81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCookiePairHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpCookiePairHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCookiePairHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpCookiePairHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpCookiePairHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__339506901_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCookiePairHeaderValueStatics):
        Array<IHttpCookiePairHeaderValueStatics?> = (elements as
        Array<IHttpCookiePairHeaderValueStatics?>).castToImpl<IHttpCookiePairHeaderValueStatics,IHttpCookiePairHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCookiePairHeaderValueStatics?> =
        arrayOfNulls<IHttpCookiePairHeaderValueStatics_Impl>(size) as
        Array<IHttpCookiePairHeaderValueStatics?>
  }
}
