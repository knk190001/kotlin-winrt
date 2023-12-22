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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpContentCodingHeaderValue.ABI::class)
@Signature("{bcf7f92a-9376-4d85-bccc-9f4f9acab434}")
@Guid("bcf7f92a93764d85bccc9f4f9acab434")
@WinRTInterface("bcf7f92a93764d85bccc9f4f9acab434")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentCodingHeaderValue.ByReference::class)
public interface IHttpContentCodingHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentCoding(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentCodingHeaderValue> {
    public override fun getValue() = ABI.makeIHttpContentCodingHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpContentCodingHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentCodingHeaderValue {
    public val __835152013_Ptr: Pointer?

    public val _835152013_VtblPtr: Pointer?
      get() = __835152013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentCoding(): String? {
      val fnPtr = _835152013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__835152013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpContentCodingHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __835152013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentCodingHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcf7f92a93764d85bccc9f4f9acab434")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentCodingHeaderValue(ptr: Pointer?): WithDefault =
        IHttpContentCodingHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentCodingHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpContentCodingHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentCodingHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__835152013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentCodingHeaderValue):
        Array<IHttpContentCodingHeaderValue?> = (elements as
        Array<IHttpContentCodingHeaderValue?>).castToImpl<IHttpContentCodingHeaderValue,IHttpContentCodingHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentCodingHeaderValue?> =
        arrayOfNulls<IHttpContentCodingHeaderValue_Impl>(size) as
        Array<IHttpContentCodingHeaderValue?>
  }
}
