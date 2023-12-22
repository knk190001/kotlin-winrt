package Windows.Globalization

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ILanguageStatics3.ABI::class)
@Signature("{d15ecb5a-71de-5752-9542-fac5b4f27261}")
@Guid("d15ecb5a71de57529542fac5b4f27261")
@WinRTInterface("d15ecb5a71de57529542fac5b4f27261")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageStatics3.ByReference::class)
public interface ILanguageStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetMuiCompatibleLanguageListFromLanguageTags(languageTags: IIterable<String?>?):
      IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageStatics3> {
    public override fun getValue() = ABI.makeILanguageStatics3(pointer.getPointer(0))

    public fun setValue(value: ILanguageStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageStatics3 {
    public val __1070364999_Ptr: Pointer?

    public val _1070364999_VtblPtr: Pointer?
      get() = __1070364999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetMuiCompatibleLanguageListFromLanguageTags(languageTags: IIterable<String?>?):
        IVector<String?>? {
      val fnPtr = _1070364999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1070364999_Ptr, marshalToNative(languageTags), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ILanguageStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1070364999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d15ecb5a71de57529542fac5b4f27261")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageStatics3(ptr: Pointer?): WithDefault = ILanguageStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageStatics3 {
      val address = segment.toRawLongValue()
      return makeILanguageStatics3(Pointer(address))
    }

    public override fun toNative(obj: ILanguageStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1070364999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageStatics3): Array<ILanguageStatics3?> = (elements
        as Array<ILanguageStatics3?>).castToImpl<ILanguageStatics3,ILanguageStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageStatics3?> =
        arrayOfNulls<ILanguageStatics3_Impl>(size) as Array<ILanguageStatics3?>
  }
}
