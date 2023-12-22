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

@ABIMarker(IHttpContentCodingHeaderValueStatics.ABI::class)
@Signature("{94d8602e-f9bf-42f7-aa46-ed272a41e212}")
@Guid("94d8602ef9bf42f7aa46ed272a41e212")
@WinRTInterface("94d8602ef9bf42f7aa46ed272a41e212")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentCodingHeaderValueStatics.ByReference::class)
public interface IHttpContentCodingHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpContentCodingHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      contentCodingHeaderValue: Windows.Web.Http.Headers.HttpContentCodingHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentCodingHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpContentCodingHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpContentCodingHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentCodingHeaderValueStatics {
    public val __868083320_Ptr: Pointer?

    public val _868083320_VtblPtr: Pointer?
      get() = __868083320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpContentCodingHeaderValue? {
      val fnPtr = _868083320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__868083320_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentCodingHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        contentCodingHeaderValue: Windows.Web.Http.Headers.HttpContentCodingHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _868083320_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__868083320_Ptr, marshalToNative(input),
          marshalToNative(contentCodingHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpContentCodingHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __868083320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentCodingHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94d8602ef9bf42f7aa46ed272a41e212")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentCodingHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpContentCodingHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentCodingHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpContentCodingHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentCodingHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__868083320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentCodingHeaderValueStatics):
        Array<IHttpContentCodingHeaderValueStatics?> = (elements as
        Array<IHttpContentCodingHeaderValueStatics?>).castToImpl<IHttpContentCodingHeaderValueStatics,IHttpContentCodingHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentCodingHeaderValueStatics?> =
        arrayOfNulls<IHttpContentCodingHeaderValueStatics_Impl>(size) as
        Array<IHttpContentCodingHeaderValueStatics?>
  }
}
