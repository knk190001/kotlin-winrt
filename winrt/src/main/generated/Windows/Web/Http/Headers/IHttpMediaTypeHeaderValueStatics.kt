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

@ABIMarker(IHttpMediaTypeHeaderValueStatics.ABI::class)
@Signature("{e04d83df-1d41-4d8c-a2de-6fd2ed87399b}")
@Guid("e04d83df1d414d8ca2de6fd2ed87399b")
@WinRTInterface("e04d83df1d414d8ca2de6fd2ed87399b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMediaTypeHeaderValueStatics.ByReference::class)
public interface IHttpMediaTypeHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpMediaTypeHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      mediaTypeHeaderValue: Windows.Web.Http.Headers.HttpMediaTypeHeaderValue.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMediaTypeHeaderValueStatics> {
    public override fun getValue() = ABI.makeIHttpMediaTypeHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpMediaTypeHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMediaTypeHeaderValueStatics {
    public val __543466419_Ptr: Pointer?

    public val _543466419_VtblPtr: Pointer?
      get() = __543466419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpMediaTypeHeaderValue? {
      val fnPtr = _543466419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMediaTypeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__543466419_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMediaTypeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        mediaTypeHeaderValue: Windows.Web.Http.Headers.HttpMediaTypeHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _543466419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__543466419_Ptr, marshalToNative(input),
          marshalToNative(mediaTypeHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpMediaTypeHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __543466419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMediaTypeHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e04d83df1d414d8ca2de6fd2ed87399b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMediaTypeHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpMediaTypeHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMediaTypeHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpMediaTypeHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpMediaTypeHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__543466419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMediaTypeHeaderValueStatics):
        Array<IHttpMediaTypeHeaderValueStatics?> = (elements as
        Array<IHttpMediaTypeHeaderValueStatics?>).castToImpl<IHttpMediaTypeHeaderValueStatics,IHttpMediaTypeHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMediaTypeHeaderValueStatics?> =
        arrayOfNulls<IHttpMediaTypeHeaderValueStatics_Impl>(size) as
        Array<IHttpMediaTypeHeaderValueStatics?>
  }
}
