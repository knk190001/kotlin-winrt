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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpLanguageRangeWithQualityHeaderValueFactory.ABI::class)
@Signature("{7bb83970-780f-4c83-9fe4-dc3087f6bd55}")
@Guid("7bb83970780f4c839fe4dc3087f6bd55")
@WinRTInterface("7bb83970780f4c839fe4dc3087f6bd55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpLanguageRangeWithQualityHeaderValueFactory.ByReference::class)
public interface IHttpLanguageRangeWithQualityHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromLanguageRange(languageRange: String?):
      HttpLanguageRangeWithQualityHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromLanguageRangeWithQuality(languageRange: String?, quality: Double):
      HttpLanguageRangeWithQualityHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpLanguageRangeWithQualityHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpLanguageRangeWithQualityHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpLanguageRangeWithQualityHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpLanguageRangeWithQualityHeaderValueFactory {
    public val __1417119718_Ptr: Pointer?

    public val _1417119718_VtblPtr: Pointer?
      get() = __1417119718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromLanguageRange(languageRange: String?):
        HttpLanguageRangeWithQualityHeaderValue? {
      val fnPtr = _1417119718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpLanguageRangeWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1417119718_Ptr, marshalToNative(languageRange), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpLanguageRangeWithQualityHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromLanguageRangeWithQuality(languageRange: String?, quality: Double):
        HttpLanguageRangeWithQualityHeaderValue? {
      val fnPtr = _1417119718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpLanguageRangeWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1417119718_Ptr, marshalToNative(languageRange), quality,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpLanguageRangeWithQualityHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpLanguageRangeWithQualityHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417119718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpLanguageRangeWithQualityHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bb83970780f4c839fe4dc3087f6bd55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpLanguageRangeWithQualityHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpLanguageRangeWithQualityHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpLanguageRangeWithQualityHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpLanguageRangeWithQualityHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpLanguageRangeWithQualityHeaderValueFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1417119718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpLanguageRangeWithQualityHeaderValueFactory):
        Array<IHttpLanguageRangeWithQualityHeaderValueFactory?> = (elements as
        Array<IHttpLanguageRangeWithQualityHeaderValueFactory?>).castToImpl<IHttpLanguageRangeWithQualityHeaderValueFactory,IHttpLanguageRangeWithQualityHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpLanguageRangeWithQualityHeaderValueFactory?>
        = arrayOfNulls<IHttpLanguageRangeWithQualityHeaderValueFactory_Impl>(size) as
        Array<IHttpLanguageRangeWithQualityHeaderValueFactory?>
  }
}
