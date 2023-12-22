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

@ABIMarker(IHttpContentCodingWithQualityHeaderValueFactory.ABI::class)
@Signature("{c45eee1a-c553-46fc-ade2-d75c1d53df7b}")
@Guid("c45eee1ac55346fcade2d75c1d53df7b")
@WinRTInterface("c45eee1ac55346fcade2d75c1d53df7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentCodingWithQualityHeaderValueFactory.ByReference::class)
public interface IHttpContentCodingWithQualityHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromValue(contentCoding: String?): HttpContentCodingWithQualityHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromValueWithQuality(contentCoding: String?, quality: Double):
      HttpContentCodingWithQualityHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentCodingWithQualityHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpContentCodingWithQualityHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpContentCodingWithQualityHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentCodingWithQualityHeaderValueFactory {
    public val __1902503976_Ptr: Pointer?

    public val _1902503976_VtblPtr: Pointer?
      get() = __1902503976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromValue(contentCoding: String?):
        HttpContentCodingWithQualityHeaderValue? {
      val fnPtr = _1902503976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1902503976_Ptr, marshalToNative(contentCoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpContentCodingWithQualityHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromValueWithQuality(contentCoding: String?, quality: Double):
        HttpContentCodingWithQualityHeaderValue? {
      val fnPtr = _1902503976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1902503976_Ptr, marshalToNative(contentCoding), quality,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpContentCodingWithQualityHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpContentCodingWithQualityHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1902503976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentCodingWithQualityHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c45eee1ac55346fcade2d75c1d53df7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentCodingWithQualityHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpContentCodingWithQualityHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpContentCodingWithQualityHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpContentCodingWithQualityHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentCodingWithQualityHeaderValueFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1902503976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentCodingWithQualityHeaderValueFactory):
        Array<IHttpContentCodingWithQualityHeaderValueFactory?> = (elements as
        Array<IHttpContentCodingWithQualityHeaderValueFactory?>).castToImpl<IHttpContentCodingWithQualityHeaderValueFactory,IHttpContentCodingWithQualityHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentCodingWithQualityHeaderValueFactory?>
        = arrayOfNulls<IHttpContentCodingWithQualityHeaderValueFactory_Impl>(size) as
        Array<IHttpContentCodingWithQualityHeaderValueFactory?>
  }
}
