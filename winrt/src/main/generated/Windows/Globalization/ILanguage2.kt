package Windows.Globalization

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILanguage2.ABI::class)
@Signature("{6a47e5b5-d94d-4886-a404-a5a5b9d5b494}")
@Guid("6a47e5b5d94d4886a404a5a5b9d5b494")
@WinRTInterface("6a47e5b5d94d4886a404a5a5b9d5b494")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguage2.ByReference::class)
public interface ILanguage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LayoutDirection(): LanguageLayoutDirection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILanguage2> {
    public override fun getValue() = ABI.makeILanguage2(pointer.getPointer(0))

    public fun setValue(value: ILanguage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguage2 {
    public val __2119937287_Ptr: Pointer?

    public val _2119937287_VtblPtr: Pointer?
      get() = __2119937287_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LayoutDirection(): LanguageLayoutDirection? {
      val fnPtr = _2119937287_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LanguageLayoutDirection>()
      val hr = fn.invokeHR(arrayOf(__2119937287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LanguageLayoutDirection>(result.getValue())
      return resultValue
    }
  }

  public class ILanguage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2119937287_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a47e5b5d94d4886a404a5a5b9d5b494")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguage2(ptr: Pointer?): WithDefault = ILanguage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguage2 {
      val address = segment.toRawLongValue()
      return makeILanguage2(Pointer(address))
    }

    public override fun toNative(obj: ILanguage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2119937287_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguage2): Array<ILanguage2?> = (elements as
        Array<ILanguage2?>).castToImpl<ILanguage2,ILanguage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguage2?> = arrayOfNulls<ILanguage2_Impl>(size)
        as Array<ILanguage2?>
  }
}
