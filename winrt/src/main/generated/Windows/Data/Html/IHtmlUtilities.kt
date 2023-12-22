package Windows.Data.Html

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

@ABIMarker(IHtmlUtilities.ABI::class)
@Signature("{fec00add-2399-4fac-b5a7-05e9acd7181d}")
@Guid("fec00add23994facb5a705e9acd7181d")
@WinRTInterface("fec00add23994facb5a705e9acd7181d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHtmlUtilities.ByReference::class)
public interface IHtmlUtilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConvertToText(html: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHtmlUtilities>
      {
    public override fun getValue() = ABI.makeIHtmlUtilities(pointer.getPointer(0))

    public fun setValue(value: IHtmlUtilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHtmlUtilities {
    public val __1522561926_Ptr: Pointer?

    public val _1522561926_VtblPtr: Pointer?
      get() = __1522561926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertToText(html: String?): String? {
      val fnPtr = _1522561926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1522561926_Ptr, marshalToNative(html), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHtmlUtilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1522561926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHtmlUtilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fec00add23994facb5a705e9acd7181d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHtmlUtilities(ptr: Pointer?): WithDefault = IHtmlUtilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHtmlUtilities {
      val address = segment.toRawLongValue()
      return makeIHtmlUtilities(Pointer(address))
    }

    public override fun toNative(obj: IHtmlUtilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1522561926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHtmlUtilities): Array<IHtmlUtilities?> = (elements as
        Array<IHtmlUtilities?>).castToImpl<IHtmlUtilities,IHtmlUtilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHtmlUtilities?> =
        arrayOfNulls<IHtmlUtilities_Impl>(size) as Array<IHtmlUtilities?>
  }
}
