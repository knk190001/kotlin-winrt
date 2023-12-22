package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.FontFamily
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFontIconSource.ABI::class)
@Signature("{b89d614c-e9b5-5b6a-9bec-ad78b1a14b74}")
@Guid("b89d614ce9b55b6a9becad78b1a14b74")
@WinRTInterface("b89d614ce9b55b6a9becad78b1a14b74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIconSource.ByReference::class)
public interface IFontIconSource : NativeMapped, IWinRTInterface {
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

  @InterfaceMethod(10)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_MirroredWhenRightToLeft(): Boolean

  @InterfaceMethod(13)
  public fun put_MirroredWhenRightToLeft(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontIconSource> {
    public override fun getValue() = ABI.makeIFontIconSource(pointer.getPointer(0))

    public fun setValue(value: IFontIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIconSource {
    public val __1690192170_Ptr: Pointer?

    public val _1690192170_VtblPtr: Pointer?
      get() = __1690192170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Glyph(): String? {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Glyph(value: String?): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontSize(): Double {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FontSize(value: Double): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontFamily(): FontFamily? {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontFamily(value: FontFamily?): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontWeight(): FontWeight? {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontWeight(value: FontWeight?): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MirroredWhenRightToLeft(): Boolean {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_MirroredWhenRightToLeft(value: Boolean): Unit {
      val fnPtr = _1690192170_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1690192170_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFontIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690192170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b89d614ce9b55b6a9becad78b1a14b74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIconSource(ptr: Pointer?): WithDefault = IFontIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIconSource {
      val address = segment.toRawLongValue()
      return makeIFontIconSource(Pointer(address))
    }

    public override fun toNative(obj: IFontIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690192170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIconSource): Array<IFontIconSource?> = (elements as
        Array<IFontIconSource?>).castToImpl<IFontIconSource,IFontIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIconSource?> =
        arrayOfNulls<IFontIconSource_Impl>(size) as Array<IFontIconSource?>
  }
}
