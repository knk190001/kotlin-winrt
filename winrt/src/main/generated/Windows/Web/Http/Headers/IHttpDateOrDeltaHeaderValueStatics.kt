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

@ABIMarker(IHttpDateOrDeltaHeaderValueStatics.ABI::class)
@Signature("{7c2659a8-6672-4e90-9a9a-f39766f7f576}")
@Guid("7c2659a866724e909a9af39766f7f576")
@WinRTInterface("7c2659a866724e909a9af39766f7f576")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDateOrDeltaHeaderValueStatics.ByReference::class)
public interface IHttpDateOrDeltaHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpDateOrDeltaHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      dateOrDeltaHeaderValue: Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDateOrDeltaHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpDateOrDeltaHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpDateOrDeltaHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDateOrDeltaHeaderValueStatics {
    public val __736548548_Ptr: Pointer?

    public val _736548548_VtblPtr: Pointer?
      get() = __736548548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpDateOrDeltaHeaderValue? {
      val fnPtr = _736548548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpDateOrDeltaHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__736548548_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpDateOrDeltaHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        dateOrDeltaHeaderValue: Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _736548548_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__736548548_Ptr, marshalToNative(input),
          marshalToNative(dateOrDeltaHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpDateOrDeltaHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __736548548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDateOrDeltaHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c2659a866724e909a9af39766f7f576")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDateOrDeltaHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpDateOrDeltaHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpDateOrDeltaHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpDateOrDeltaHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpDateOrDeltaHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__736548548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDateOrDeltaHeaderValueStatics):
        Array<IHttpDateOrDeltaHeaderValueStatics?> = (elements as
        Array<IHttpDateOrDeltaHeaderValueStatics?>).castToImpl<IHttpDateOrDeltaHeaderValueStatics,IHttpDateOrDeltaHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDateOrDeltaHeaderValueStatics?> =
        arrayOfNulls<IHttpDateOrDeltaHeaderValueStatics_Impl>(size) as
        Array<IHttpDateOrDeltaHeaderValueStatics?>
  }
}
