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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILanguageStatics2.ABI::class)
@Signature("{30199f6e-914b-4b2a-9d6e-e3b0e27dbe4f}")
@Guid("30199f6e914b4b2a9d6ee3b0e27dbe4f")
@WinRTInterface("30199f6e914b4b2a9d6ee3b0e27dbe4f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageStatics2.ByReference::class)
public interface ILanguageStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetInputMethodLanguageTag(languageTag: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageStatics2> {
    public override fun getValue() = ABI.makeILanguageStatics2(pointer.getPointer(0))

    public fun setValue(value: ILanguageStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageStatics2 {
    public val __1070365000_Ptr: Pointer?

    public val _1070365000_VtblPtr: Pointer?
      get() = __1070365000_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetInputMethodLanguageTag(languageTag: String?): Boolean {
      val fnPtr = _1070365000_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1070365000_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILanguageStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1070365000_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30199f6e914b4b2a9d6ee3b0e27dbe4f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageStatics2(ptr: Pointer?): WithDefault = ILanguageStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageStatics2 {
      val address = segment.toRawLongValue()
      return makeILanguageStatics2(Pointer(address))
    }

    public override fun toNative(obj: ILanguageStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1070365000_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageStatics2): Array<ILanguageStatics2?> = (elements
        as Array<ILanguageStatics2?>).castToImpl<ILanguageStatics2,ILanguageStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageStatics2?> =
        arrayOfNulls<ILanguageStatics2_Impl>(size) as Array<ILanguageStatics2?>
  }
}
