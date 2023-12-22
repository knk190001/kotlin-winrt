package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IHttpTransferCodingHeaderValue.ABI::class)
@Signature("{436f32f9-3ded-42bd-b38a-5496a2511ce6}")
@Guid("436f32f93ded42bdb38a5496a2511ce6")
@WinRTInterface("436f32f93ded42bdb38a5496a2511ce6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpTransferCodingHeaderValue.ByReference::class)
public interface IHttpTransferCodingHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpTransferCodingHeaderValue> {
    public override fun getValue() = ABI.makeIHttpTransferCodingHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpTransferCodingHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpTransferCodingHeaderValue {
    public val __1083836669_Ptr: Pointer?

    public val _1083836669_VtblPtr: Pointer?
      get() = __1083836669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _1083836669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__1083836669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1083836669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1083836669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpTransferCodingHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1083836669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpTransferCodingHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("436f32f93ded42bdb38a5496a2511ce6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpTransferCodingHeaderValue(ptr: Pointer?): WithDefault =
        IHttpTransferCodingHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpTransferCodingHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpTransferCodingHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpTransferCodingHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1083836669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpTransferCodingHeaderValue):
        Array<IHttpTransferCodingHeaderValue?> = (elements as
        Array<IHttpTransferCodingHeaderValue?>).castToImpl<IHttpTransferCodingHeaderValue,IHttpTransferCodingHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpTransferCodingHeaderValue?> =
        arrayOfNulls<IHttpTransferCodingHeaderValue_Impl>(size) as
        Array<IHttpTransferCodingHeaderValue?>
  }
}
