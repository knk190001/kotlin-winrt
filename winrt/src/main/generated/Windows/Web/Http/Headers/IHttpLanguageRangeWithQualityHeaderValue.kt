package Windows.Web.Http.Headers

import Windows.Foundation.IReference
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

@ABIMarker(IHttpLanguageRangeWithQualityHeaderValue.ABI::class)
@Signature("{7256e102-0080-4db4-a083-7de7b2e5ba4c}")
@Guid("7256e10200804db4a0837de7b2e5ba4c")
@WinRTInterface("7256e10200804db4a0837de7b2e5ba4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpLanguageRangeWithQualityHeaderValue.ByReference::class)
public interface IHttpLanguageRangeWithQualityHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LanguageRange(): String?

  @InterfaceMethod(1)
  public fun get_Quality(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpLanguageRangeWithQualityHeaderValue> {
    public override fun getValue() =
        ABI.makeIHttpLanguageRangeWithQualityHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpLanguageRangeWithQualityHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpLanguageRangeWithQualityHeaderValue {
    public val __1879120764_Ptr: Pointer?

    public val _1879120764_VtblPtr: Pointer?
      get() = __1879120764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LanguageRange(): String? {
      val fnPtr = _1879120764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1879120764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Quality(): IReference<Double>? {
      val fnPtr = _1879120764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1879120764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpLanguageRangeWithQualityHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879120764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpLanguageRangeWithQualityHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7256e10200804db4a0837de7b2e5ba4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpLanguageRangeWithQualityHeaderValue(ptr: Pointer?): WithDefault =
        IHttpLanguageRangeWithQualityHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpLanguageRangeWithQualityHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpLanguageRangeWithQualityHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpLanguageRangeWithQualityHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879120764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpLanguageRangeWithQualityHeaderValue):
        Array<IHttpLanguageRangeWithQualityHeaderValue?> = (elements as
        Array<IHttpLanguageRangeWithQualityHeaderValue?>).castToImpl<IHttpLanguageRangeWithQualityHeaderValue,IHttpLanguageRangeWithQualityHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpLanguageRangeWithQualityHeaderValue?> =
        arrayOfNulls<IHttpLanguageRangeWithQualityHeaderValue_Impl>(size) as
        Array<IHttpLanguageRangeWithQualityHeaderValue?>
  }
}
