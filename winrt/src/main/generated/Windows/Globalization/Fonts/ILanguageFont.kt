package Windows.Globalization.Fonts

import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
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

@ABIMarker(ILanguageFont.ABI::class)
@Signature("{b12e5c3a-b76d-459b-beeb-901151cd77d1}")
@Guid("b12e5c3ab76d459bbeeb901151cd77d1")
@WinRTInterface("b12e5c3ab76d459bbeeb901151cd77d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanguageFont.ByReference::class)
public interface ILanguageFont : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FontFamily(): String?

  @InterfaceMethod(1)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(2)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(3)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(4)
  public fun get_ScaleFactor(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILanguageFont>
      {
    public override fun getValue() = ABI.makeILanguageFont(pointer.getPointer(0))

    public fun setValue(value: ILanguageFont_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanguageFont {
    public val __1418304836_Ptr: Pointer?

    public val _1418304836_VtblPtr: Pointer?
      get() = __1418304836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FontFamily(): String? {
      val fnPtr = _1418304836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1418304836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _1418304836_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1418304836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _1418304836_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__1418304836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _1418304836_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1418304836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ScaleFactor(): Double {
      val fnPtr = _1418304836_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1418304836_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ILanguageFont_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418304836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanguageFont, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b12e5c3ab76d459bbeeb901151cd77d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanguageFont(ptr: Pointer?): WithDefault = ILanguageFont_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanguageFont {
      val address = segment.toRawLongValue()
      return makeILanguageFont(Pointer(address))
    }

    public override fun toNative(obj: ILanguageFont): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418304836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanguageFont): Array<ILanguageFont?> = (elements as
        Array<ILanguageFont?>).castToImpl<ILanguageFont,ILanguageFont_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanguageFont?> =
        arrayOfNulls<ILanguageFont_Impl>(size) as Array<ILanguageFont?>
  }
}
