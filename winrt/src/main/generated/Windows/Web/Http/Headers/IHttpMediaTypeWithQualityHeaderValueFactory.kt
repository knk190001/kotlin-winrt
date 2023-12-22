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

@ABIMarker(IHttpMediaTypeWithQualityHeaderValueFactory.ABI::class)
@Signature("{4c6d20f4-9457-44e6-a323-d122b958780b}")
@Guid("4c6d20f4945744e6a323d122b958780b")
@WinRTInterface("4c6d20f4945744e6a323d122b958780b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMediaTypeWithQualityHeaderValueFactory.ByReference::class)
public interface IHttpMediaTypeWithQualityHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromMediaType(mediaType: String?): HttpMediaTypeWithQualityHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromMediaTypeWithQuality(mediaType: String?, quality: Double):
      HttpMediaTypeWithQualityHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMediaTypeWithQualityHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpMediaTypeWithQualityHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpMediaTypeWithQualityHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMediaTypeWithQualityHeaderValueFactory {
    public val __772286477_Ptr: Pointer?

    public val _772286477_VtblPtr: Pointer?
      get() = __772286477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromMediaType(mediaType: String?):
        HttpMediaTypeWithQualityHeaderValue? {
      val fnPtr = _772286477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMediaTypeWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__772286477_Ptr, marshalToNative(mediaType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMediaTypeWithQualityHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromMediaTypeWithQuality(mediaType: String?, quality: Double):
        HttpMediaTypeWithQualityHeaderValue? {
      val fnPtr = _772286477_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMediaTypeWithQualityHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__772286477_Ptr, marshalToNative(mediaType), quality, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMediaTypeWithQualityHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMediaTypeWithQualityHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772286477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMediaTypeWithQualityHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c6d20f4945744e6a323d122b958780b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMediaTypeWithQualityHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpMediaTypeWithQualityHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpMediaTypeWithQualityHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpMediaTypeWithQualityHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpMediaTypeWithQualityHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772286477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMediaTypeWithQualityHeaderValueFactory):
        Array<IHttpMediaTypeWithQualityHeaderValueFactory?> = (elements as
        Array<IHttpMediaTypeWithQualityHeaderValueFactory?>).castToImpl<IHttpMediaTypeWithQualityHeaderValueFactory,IHttpMediaTypeWithQualityHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMediaTypeWithQualityHeaderValueFactory?> =
        arrayOfNulls<IHttpMediaTypeWithQualityHeaderValueFactory_Impl>(size) as
        Array<IHttpMediaTypeWithQualityHeaderValueFactory?>
  }
}
