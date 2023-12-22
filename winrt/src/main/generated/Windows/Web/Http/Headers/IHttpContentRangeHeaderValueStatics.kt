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

@ABIMarker(IHttpContentRangeHeaderValueStatics.ABI::class)
@Signature("{80a346ca-174c-4fae-821c-134cd294aa38}")
@Guid("80a346ca174c4fae821c134cd294aa38")
@WinRTInterface("80a346ca174c4fae821c134cd294aa38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentRangeHeaderValueStatics.ByReference::class)
public interface IHttpContentRangeHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpContentRangeHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      contentRangeHeaderValue: Windows.Web.Http.Headers.HttpContentRangeHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentRangeHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpContentRangeHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpContentRangeHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentRangeHeaderValueStatics {
    public val __1364048273_Ptr: Pointer?

    public val _1364048273_VtblPtr: Pointer?
      get() = __1364048273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpContentRangeHeaderValue? {
      val fnPtr = _1364048273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentRangeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1364048273_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentRangeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        contentRangeHeaderValue: Windows.Web.Http.Headers.HttpContentRangeHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _1364048273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1364048273_Ptr, marshalToNative(input),
          marshalToNative(contentRangeHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpContentRangeHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1364048273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentRangeHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80a346ca174c4fae821c134cd294aa38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentRangeHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpContentRangeHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentRangeHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpContentRangeHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentRangeHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1364048273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentRangeHeaderValueStatics):
        Array<IHttpContentRangeHeaderValueStatics?> = (elements as
        Array<IHttpContentRangeHeaderValueStatics?>).castToImpl<IHttpContentRangeHeaderValueStatics,IHttpContentRangeHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentRangeHeaderValueStatics?> =
        arrayOfNulls<IHttpContentRangeHeaderValueStatics_Impl>(size) as
        Array<IHttpContentRangeHeaderValueStatics?>
  }
}
