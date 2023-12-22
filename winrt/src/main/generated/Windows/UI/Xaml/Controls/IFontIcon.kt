package Windows.UI.Xaml.Controls

import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
import Windows.UI.Xaml.Media.FontFamily
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

@ABIMarker(IFontIcon.ABI::class)
@Signature("{d4d61391-39ac-4950-9166-3606c264418b}")
@Guid("d4d6139139ac495091663606c264418b")
@WinRTInterface("d4d6139139ac495091663606c264418b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIcon.ByReference::class)
public interface IFontIcon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Glyph(): String?

  @InterfaceMethod(1)
  public fun put_Glyph(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_FontSize(): Double

  @InterfaceMethod(3)
  public fun put_FontSize(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_FontFamily(): FontFamily?

  @InterfaceMethod(5)
  public fun put_FontFamily(value: FontFamily?): Unit

  @InterfaceMethod(6)
  public fun get_FontWeight(): FontWeight?

  @InterfaceMethod(7)
  public fun put_FontWeight(value: FontWeight?): Unit

  @InterfaceMethod(8)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(9)
  public fun put_FontStyle(value: FontStyle?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFontIcon> {
    public override fun getValue() = ABI.makeIFontIcon(pointer.getPointer(0))

    public fun setValue(value: IFontIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIcon {
    public val __123437692_Ptr: Pointer?

    public val _123437692_VtblPtr: Pointer?
      get() = __123437692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Glyph(): String? {
      val fnPtr = _123437692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Glyph(value: String?): Unit {
      val fnPtr = _123437692_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontSize(): Double {
      val fnPtr = _123437692_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _123437692_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _123437692_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _123437692_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _123437692_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _123437692_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _123437692_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _123437692_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__123437692_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFontIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __123437692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4d6139139ac495091663606c264418b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIcon(ptr: Pointer?): WithDefault = IFontIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIcon {
      val address = segment.toRawLongValue()
      return makeIFontIcon(Pointer(address))
    }

    public override fun toNative(obj: IFontIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__123437692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIcon): Array<IFontIcon?> = (elements as
        Array<IFontIcon?>).castToImpl<IFontIcon,IFontIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIcon?> = arrayOfNulls<IFontIcon_Impl>(size)
        as Array<IFontIcon?>
  }
}
