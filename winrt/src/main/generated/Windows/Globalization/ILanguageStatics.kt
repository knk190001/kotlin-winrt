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

@ABIMarker(ILanguageStatics.ABI::class)
@Signature("{b23cd557-0865-46d4-89b8-d59be8990f0d}")
@Guid("b23cd557086546d489b8d59be8990f0d")
@WinRTInterface("b23cd557086546d489b8d59be8990f0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageStatics.ByReference::class)
public interface ILanguageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsWellFormed(languageTag: String?): Boolean

  @InterfaceMethod(1)
  public fun get_CurrentInputMethodLanguageTag(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageStatics> {
    public override fun getValue() = ABI.makeILanguageStatics(pointer.getPointer(0))

    public fun setValue(value: ILanguageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageStatics {
    public val __1281453894_Ptr: Pointer?

    public val _1281453894_VtblPtr: Pointer?
      get() = __1281453894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsWellFormed(languageTag: String?): Boolean {
      val fnPtr = _1281453894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1281453894_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CurrentInputMethodLanguageTag(): String? {
      val fnPtr = _1281453894_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1281453894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILanguageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1281453894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b23cd557086546d489b8d59be8990f0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageStatics(ptr: Pointer?): WithDefault = ILanguageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageStatics {
      val address = segment.toRawLongValue()
      return makeILanguageStatics(Pointer(address))
    }

    public override fun toNative(obj: ILanguageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1281453894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageStatics): Array<ILanguageStatics?> = (elements as
        Array<ILanguageStatics?>).castToImpl<ILanguageStatics,ILanguageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageStatics?> =
        arrayOfNulls<ILanguageStatics_Impl>(size) as Array<ILanguageStatics?>
  }
}
