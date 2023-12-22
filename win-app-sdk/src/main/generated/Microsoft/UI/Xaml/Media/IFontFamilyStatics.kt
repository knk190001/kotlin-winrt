package Microsoft.UI.Xaml.Media

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

@ABIMarker(IFontFamilyStatics.ABI::class)
@Signature("{b3eadceb-c471-58fe-93d0-d71b04a7fd54}")
@Guid("b3eadcebc47158fe93d0d71b04a7fd54")
@WinRTInterface("b3eadcebc47158fe93d0d71b04a7fd54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontFamilyStatics.ByReference::class)
public interface IFontFamilyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XamlAutoFontFamily(): FontFamily?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontFamilyStatics> {
    public override fun getValue() = ABI.makeIFontFamilyStatics(pointer.getPointer(0))

    public fun setValue(value: IFontFamilyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontFamilyStatics {
    public val __1660776543_Ptr: Pointer?

    public val _1660776543_VtblPtr: Pointer?
      get() = __1660776543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XamlAutoFontFamily(): FontFamily? {
      val fnPtr = _1660776543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1660776543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }
  }

  public class IFontFamilyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660776543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontFamilyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3eadcebc47158fe93d0d71b04a7fd54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontFamilyStatics(ptr: Pointer?): WithDefault = IFontFamilyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontFamilyStatics {
      val address = segment.toRawLongValue()
      return makeIFontFamilyStatics(Pointer(address))
    }

    public override fun toNative(obj: IFontFamilyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660776543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontFamilyStatics): Array<IFontFamilyStatics?> =
        (elements as
        Array<IFontFamilyStatics?>).castToImpl<IFontFamilyStatics,IFontFamilyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontFamilyStatics?> =
        arrayOfNulls<IFontFamilyStatics_Impl>(size) as Array<IFontFamilyStatics?>
  }
}
