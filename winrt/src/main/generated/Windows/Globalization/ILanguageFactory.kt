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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILanguageFactory.ABI::class)
@Signature("{9b0252ac-0c27-44f8-b792-9793fb66c63e}")
@Guid("9b0252ac0c2744f8b7929793fb66c63e")
@WinRTInterface("9b0252ac0c2744f8b7929793fb66c63e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageFactory.ByReference::class)
public interface ILanguageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateLanguage(languageTag: String?): Language?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageFactory> {
    public override fun getValue() = ABI.makeILanguageFactory(pointer.getPointer(0))

    public fun setValue(value: ILanguageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageFactory {
    public val __476200449_Ptr: Pointer?

    public val _476200449_VtblPtr: Pointer?
      get() = __476200449_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLanguage(languageTag: String?): Language? {
      val fnPtr = _476200449_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__476200449_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }
  }

  public class ILanguageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __476200449_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b0252ac0c2744f8b7929793fb66c63e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageFactory(ptr: Pointer?): WithDefault = ILanguageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageFactory {
      val address = segment.toRawLongValue()
      return makeILanguageFactory(Pointer(address))
    }

    public override fun toNative(obj: ILanguageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__476200449_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageFactory): Array<ILanguageFactory?> = (elements as
        Array<ILanguageFactory?>).castToImpl<ILanguageFactory,ILanguageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageFactory?> =
        arrayOfNulls<ILanguageFactory_Impl>(size) as Array<ILanguageFactory?>
  }
}
