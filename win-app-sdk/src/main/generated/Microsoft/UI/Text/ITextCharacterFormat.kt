package Microsoft.UI.Text

import Windows.UI.Color
import Windows.UI.Text.FontStretch
import Windows.UI.Text.FontStyle
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
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextCharacterFormat.ABI::class)
@Signature("{f5710050-98e5-5788-b1e3-32191eebf94d}")
@Guid("f571005098e55788b1e332191eebf94d")
@WinRTInterface("f571005098e55788b1e332191eebf94d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCharacterFormat.ByReference::class)
public interface ITextCharacterFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllCaps(): FormatEffect?

  @InterfaceMethod(1)
  public fun put_AllCaps(value: FormatEffect?): Unit

  @InterfaceMethod(2)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(3)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_Bold(): FormatEffect?

  @InterfaceMethod(5)
  public fun put_Bold(value: FormatEffect?): Unit

  @InterfaceMethod(6)
  public fun get_FontStretch(): FontStretch?

  @InterfaceMethod(7)
  public fun put_FontStretch(value: FontStretch?): Unit

  @InterfaceMethod(8)
  public fun get_FontStyle(): FontStyle?

  @InterfaceMethod(9)
  public fun put_FontStyle(value: FontStyle?): Unit

  @InterfaceMethod(10)
  public fun get_ForegroundColor(): Color?

  @InterfaceMethod(11)
  public fun put_ForegroundColor(value: Color?): Unit

  @InterfaceMethod(12)
  public fun get_Hidden(): FormatEffect?

  @InterfaceMethod(13)
  public fun put_Hidden(value: FormatEffect?): Unit

  @InterfaceMethod(14)
  public fun get_Italic(): FormatEffect?

  @InterfaceMethod(15)
  public fun put_Italic(value: FormatEffect?): Unit

  @InterfaceMethod(16)
  public fun get_Kerning(): Float

  @InterfaceMethod(17)
  public fun put_Kerning(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_LanguageTag(): String?

  @InterfaceMethod(19)
  public fun put_LanguageTag(value: String?): Unit

  @InterfaceMethod(20)
  public fun get_LinkType(): LinkType?

  @InterfaceMethod(21)
  public fun get_Name(): String?

  @InterfaceMethod(22)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(23)
  public fun get_Outline(): FormatEffect?

  @InterfaceMethod(24)
  public fun put_Outline(value: FormatEffect?): Unit

  @InterfaceMethod(25)
  public fun get_Position(): Float

  @InterfaceMethod(26)
  public fun put_Position(value: Float): Unit

  @InterfaceMethod(27)
  public fun get_ProtectedText(): FormatEffect?

  @InterfaceMethod(28)
  public fun put_ProtectedText(value: FormatEffect?): Unit

  @InterfaceMethod(29)
  public fun get_Size(): Float

  @InterfaceMethod(30)
  public fun put_Size(value: Float): Unit

  @InterfaceMethod(31)
  public fun get_SmallCaps(): FormatEffect?

  @InterfaceMethod(32)
  public fun put_SmallCaps(value: FormatEffect?): Unit

  @InterfaceMethod(33)
  public fun get_Spacing(): Float

  @InterfaceMethod(34)
  public fun put_Spacing(value: Float): Unit

  @InterfaceMethod(35)
  public fun get_Strikethrough(): FormatEffect?

  @InterfaceMethod(36)
  public fun put_Strikethrough(value: FormatEffect?): Unit

  @InterfaceMethod(37)
  public fun get_Subscript(): FormatEffect?

  @InterfaceMethod(38)
  public fun put_Subscript(value: FormatEffect?): Unit

  @InterfaceMethod(39)
  public fun get_Superscript(): FormatEffect?

  @InterfaceMethod(40)
  public fun put_Superscript(value: FormatEffect?): Unit

  @InterfaceMethod(41)
  public fun get_TextScript(): TextScript?

  @InterfaceMethod(42)
  public fun put_TextScript(value: TextScript?): Unit

  @InterfaceMethod(43)
  public fun get_Underline(): UnderlineType?

  @InterfaceMethod(44)
  public fun put_Underline(value: UnderlineType?): Unit

  @InterfaceMethod(45)
  public fun get_Weight(): Int

  @InterfaceMethod(46)
  public fun put_Weight(value: Int): Unit

  @InterfaceMethod(47)
  public fun SetClone(value: ITextCharacterFormat?): Unit

  @InterfaceMethod(48)
  public fun GetClone(): ITextCharacterFormat?

  @InterfaceMethod(49)
  public fun IsEqual(format: ITextCharacterFormat?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCharacterFormat> {
    public override fun getValue() = ABI.makeITextCharacterFormat(pointer.getPointer(0))

    public fun setValue(value: ITextCharacterFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCharacterFormat {
    public val __91666863_Ptr: Pointer?

    public val _91666863_VtblPtr: Pointer?
      get() = __91666863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllCaps(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AllCaps(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Bold(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Bold(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontStretch(): FontStretch? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStretch>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontStretch(value: FontStretch?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FontStyle(): FontStyle? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FontStyle(value: FontStyle?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ForegroundColor(): Color? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ForegroundColor(value: Color?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Hidden(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Hidden(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Italic(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Italic(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Kerning(): Float {
      val fnPtr = _91666863_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_Kerning(value: Float): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_LanguageTag(): String? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_LanguageTag(value: String?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_LinkType(): LinkType? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinkType>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_Name(): String? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_Outline(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_Outline(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_Position(): Float {
      val fnPtr = _91666863_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_Position(value: Float): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_ProtectedText(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun put_ProtectedText(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_Size(): Float {
      val fnPtr = _91666863_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun put_Size(value: Float): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_SmallCaps(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_SmallCaps(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_Spacing(): Float {
      val fnPtr = _91666863_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun put_Spacing(value: Float): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_Strikethrough(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun put_Strikethrough(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_Subscript(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun put_Subscript(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_Superscript(): FormatEffect? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun put_Superscript(value: FormatEffect?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_TextScript(): TextScript? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextScript>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextScript>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_TextScript(value: TextScript?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_Underline(): UnderlineType? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnderlineType>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnderlineType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun put_Underline(value: UnderlineType?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_Weight(): Int {
      val fnPtr = _91666863_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun put_Weight(value: Int): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun SetClone(value: ITextCharacterFormat?): Unit {
      val fnPtr = _91666863_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun GetClone(): ITextCharacterFormat? {
      val fnPtr = _91666863_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextCharacterFormat>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextCharacterFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun IsEqual(format: ITextCharacterFormat?): Boolean {
      val fnPtr = _91666863_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__91666863_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextCharacterFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __91666863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCharacterFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f571005098e55788b1e332191eebf94d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCharacterFormat(ptr: Pointer?): WithDefault = ITextCharacterFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCharacterFormat {
      val address = segment.toRawLongValue()
      return makeITextCharacterFormat(Pointer(address))
    }

    public override fun toNative(obj: ITextCharacterFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__91666863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCharacterFormat): Array<ITextCharacterFormat?> =
        (elements as
        Array<ITextCharacterFormat?>).castToImpl<ITextCharacterFormat,ITextCharacterFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCharacterFormat?> =
        arrayOfNulls<ITextCharacterFormat_Impl>(size) as Array<ITextCharacterFormat?>
  }
}
