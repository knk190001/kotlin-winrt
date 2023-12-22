package Windows.Globalization.Fonts

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

@ABIMarker(ILanguageFontGroupFactory.ABI::class)
@Signature("{fcaeac67-4e77-49c7-b856-dde934fc735b}")
@Guid("fcaeac674e7749c7b856dde934fc735b")
@WinRTInterface("fcaeac674e7749c7b856dde934fc735b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageFontGroupFactory.ByReference::class)
public interface ILanguageFontGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateLanguageFontGroup(languageTag: String?): LanguageFontGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanguageFontGroupFactory> {
    public override fun getValue() = ABI.makeILanguageFontGroupFactory(pointer.getPointer(0))

    public fun setValue(value: ILanguageFontGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageFontGroupFactory {
    public val __951484655_Ptr: Pointer?

    public val _951484655_VtblPtr: Pointer?
      get() = __951484655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLanguageFontGroup(languageTag: String?): LanguageFontGroup? {
      val fnPtr = _951484655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LanguageFontGroup>()
      val hr = fn.invokeHR(arrayOf(__951484655_Ptr, marshalToNative(languageTag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LanguageFontGroup>(result.getValue())
      return resultValue
    }
  }

  public class ILanguageFontGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __951484655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageFontGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcaeac674e7749c7b856dde934fc735b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageFontGroupFactory(ptr: Pointer?): WithDefault =
        ILanguageFontGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageFontGroupFactory {
      val address = segment.toRawLongValue()
      return makeILanguageFontGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: ILanguageFontGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__951484655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageFontGroupFactory):
        Array<ILanguageFontGroupFactory?> = (elements as
        Array<ILanguageFontGroupFactory?>).castToImpl<ILanguageFontGroupFactory,ILanguageFontGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageFontGroupFactory?> =
        arrayOfNulls<ILanguageFontGroupFactory_Impl>(size) as Array<ILanguageFontGroupFactory?>
  }
}
