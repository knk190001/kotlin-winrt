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

@ABIMarker(IHttpLanguageRangeWithQualityHeaderValueStatics.ABI::class)
@Signature("{2541e146-f308-46f5-b695-42f54024ec68}")
@Guid("2541e146f30846f5b69542f54024ec68")
@WinRTInterface("2541e146f30846f5b69542f54024ec68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpLanguageRangeWithQualityHeaderValueStatics.ByReference::class)
public interface IHttpLanguageRangeWithQualityHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpLanguageRangeWithQualityHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      languageRangeWithQualityHeaderValue: Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpLanguageRangeWithQualityHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpLanguageRangeWithQualityHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpLanguageRangeWithQualityHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpLanguageRangeWithQualityHeaderValueStatics {
    public val __611866273_Ptr: Pointer?

    public val _611866273_VtblPtr: Pointer?
      get() = __611866273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpLanguageRangeWithQualityHeaderValue? {
      val fnPtr = _611866273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpLanguageRangeWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__611866273_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpLanguageRangeWithQualityHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        languageRangeWithQualityHeaderValue: Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _611866273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__611866273_Ptr, marshalToNative(input),
          marshalToNative(languageRangeWithQualityHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpLanguageRangeWithQualityHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __611866273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpLanguageRangeWithQualityHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2541e146f30846f5b69542f54024ec68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpLanguageRangeWithQualityHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpLanguageRangeWithQualityHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpLanguageRangeWithQualityHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpLanguageRangeWithQualityHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpLanguageRangeWithQualityHeaderValueStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__611866273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpLanguageRangeWithQualityHeaderValueStatics):
        Array<IHttpLanguageRangeWithQualityHeaderValueStatics?> = (elements as
        Array<IHttpLanguageRangeWithQualityHeaderValueStatics?>).castToImpl<IHttpLanguageRangeWithQualityHeaderValueStatics,IHttpLanguageRangeWithQualityHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpLanguageRangeWithQualityHeaderValueStatics?>
        = arrayOfNulls<IHttpLanguageRangeWithQualityHeaderValueStatics_Impl>(size) as
        Array<IHttpLanguageRangeWithQualityHeaderValueStatics?>
  }
}
