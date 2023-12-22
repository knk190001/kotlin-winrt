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

@ABIMarker(IHttpContentDispositionHeaderValueStatics.ABI::class)
@Signature("{29c56067-5a37-46e4-b074-c5177d69ca66}")
@Guid("29c560675a3746e4b074c5177d69ca66")
@WinRTInterface("29c560675a3746e4b074c5177d69ca66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentDispositionHeaderValueStatics.ByReference::class)
public interface IHttpContentDispositionHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpContentDispositionHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      contentDispositionHeaderValue: Windows.Web.Http.Headers.HttpContentDispositionHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentDispositionHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpContentDispositionHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpContentDispositionHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentDispositionHeaderValueStatics {
    public val __166679371_Ptr: Pointer?

    public val _166679371_VtblPtr: Pointer?
      get() = __166679371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpContentDispositionHeaderValue? {
      val fnPtr = _166679371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentDispositionHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__166679371_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentDispositionHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        contentDispositionHeaderValue: Windows.Web.Http.Headers.HttpContentDispositionHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _166679371_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__166679371_Ptr, marshalToNative(input),
          marshalToNative(contentDispositionHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpContentDispositionHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __166679371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentDispositionHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29c560675a3746e4b074c5177d69ca66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentDispositionHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpContentDispositionHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpContentDispositionHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpContentDispositionHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentDispositionHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__166679371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentDispositionHeaderValueStatics):
        Array<IHttpContentDispositionHeaderValueStatics?> = (elements as
        Array<IHttpContentDispositionHeaderValueStatics?>).castToImpl<IHttpContentDispositionHeaderValueStatics,IHttpContentDispositionHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentDispositionHeaderValueStatics?> =
        arrayOfNulls<IHttpContentDispositionHeaderValueStatics_Impl>(size) as
        Array<IHttpContentDispositionHeaderValueStatics?>
  }
}
