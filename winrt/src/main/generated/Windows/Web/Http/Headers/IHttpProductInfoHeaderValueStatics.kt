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

@ABIMarker(IHttpProductInfoHeaderValueStatics.ABI::class)
@Signature("{db7fd857-327a-4e73-81e5-7059a302b042}")
@Guid("db7fd857327a4e7381e57059a302b042")
@WinRTInterface("db7fd857327a4e7381e57059a302b042")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpProductInfoHeaderValueStatics.ByReference::class)
public interface IHttpProductInfoHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpProductInfoHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      productInfoHeaderValue: Windows.Web.Http.Headers.HttpProductInfoHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpProductInfoHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpProductInfoHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpProductInfoHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpProductInfoHeaderValueStatics {
    public val __1555341810_Ptr: Pointer?

    public val _1555341810_VtblPtr: Pointer?
      get() = __1555341810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpProductInfoHeaderValue? {
      val fnPtr = _1555341810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductInfoHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1555341810_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductInfoHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        productInfoHeaderValue: Windows.Web.Http.Headers.HttpProductInfoHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _1555341810_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1555341810_Ptr, marshalToNative(input),
          marshalToNative(productInfoHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpProductInfoHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1555341810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpProductInfoHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db7fd857327a4e7381e57059a302b042")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpProductInfoHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpProductInfoHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpProductInfoHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpProductInfoHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpProductInfoHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1555341810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpProductInfoHeaderValueStatics):
        Array<IHttpProductInfoHeaderValueStatics?> = (elements as
        Array<IHttpProductInfoHeaderValueStatics?>).castToImpl<IHttpProductInfoHeaderValueStatics,IHttpProductInfoHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpProductInfoHeaderValueStatics?> =
        arrayOfNulls<IHttpProductInfoHeaderValueStatics_Impl>(size) as
        Array<IHttpProductInfoHeaderValueStatics?>
  }
}
