package Windows.UI.Xaml.Media

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

@ABIMarker(IFontFamilyStatics2.ABI::class)
@Signature("{52ad7af9-37e6-4297-a238-97fb6a408d9e}")
@Guid("52ad7af937e64297a23897fb6a408d9e")
@WinRTInterface("52ad7af937e64297a23897fb6a408d9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontFamilyStatics2.ByReference::class)
public interface IFontFamilyStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XamlAutoFontFamily(): FontFamily?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontFamilyStatics2> {
    public override fun getValue() = ABI.makeIFontFamilyStatics2(pointer.getPointer(0))

    public fun setValue(value: IFontFamilyStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontFamilyStatics2 {
    public val __81379772_Ptr: Pointer?

    public val _81379772_VtblPtr: Pointer?
      get() = __81379772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XamlAutoFontFamily(): FontFamily? {
      val fnPtr = _81379772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__81379772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }
  }

  public class IFontFamilyStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __81379772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontFamilyStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52ad7af937e64297a23897fb6a408d9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontFamilyStatics2(ptr: Pointer?): WithDefault = IFontFamilyStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontFamilyStatics2 {
      val address = segment.toRawLongValue()
      return makeIFontFamilyStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFontFamilyStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__81379772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontFamilyStatics2): Array<IFontFamilyStatics2?> =
        (elements as
        Array<IFontFamilyStatics2?>).castToImpl<IFontFamilyStatics2,IFontFamilyStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontFamilyStatics2?> =
        arrayOfNulls<IFontFamilyStatics2_Impl>(size) as Array<IFontFamilyStatics2?>
  }
}
