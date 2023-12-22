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

@ABIMarker(IHttpNameValueHeaderValueStatics.ABI::class)
@Signature("{ffd4030f-1130-4152-8659-256909a9d115}")
@Guid("ffd4030f113041528659256909a9d115")
@WinRTInterface("ffd4030f113041528659256909a9d115")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpNameValueHeaderValueStatics.ByReference::class)
public interface IHttpNameValueHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpNameValueHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      nameValueHeaderValue: Windows.Web.Http.Headers.HttpNameValueHeaderValue.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpNameValueHeaderValueStatics> {
    public override fun getValue() = ABI.makeIHttpNameValueHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpNameValueHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpNameValueHeaderValueStatics {
    public val __1895137765_Ptr: Pointer?

    public val _1895137765_VtblPtr: Pointer?
      get() = __1895137765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpNameValueHeaderValue? {
      val fnPtr = _1895137765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpNameValueHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1895137765_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpNameValueHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        nameValueHeaderValue: Windows.Web.Http.Headers.HttpNameValueHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _1895137765_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1895137765_Ptr, marshalToNative(input),
          marshalToNative(nameValueHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpNameValueHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895137765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpNameValueHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffd4030f113041528659256909a9d115")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpNameValueHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpNameValueHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpNameValueHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpNameValueHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpNameValueHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895137765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpNameValueHeaderValueStatics):
        Array<IHttpNameValueHeaderValueStatics?> = (elements as
        Array<IHttpNameValueHeaderValueStatics?>).castToImpl<IHttpNameValueHeaderValueStatics,IHttpNameValueHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpNameValueHeaderValueStatics?> =
        arrayOfNulls<IHttpNameValueHeaderValueStatics_Impl>(size) as
        Array<IHttpNameValueHeaderValueStatics?>
  }
}
