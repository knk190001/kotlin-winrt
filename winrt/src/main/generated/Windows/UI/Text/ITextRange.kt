package Windows.UI.Text

import Windows.Foundation.Point
import Windows.Storage.Streams.IRandomAccessStream
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Char
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextRange.ABI::class)
@Signature("{5b9e4e57-c072-42a0-8945-af503ee54768}")
@Guid("5b9e4e57c07242a08945af503ee54768")
@WinRTInterface("5b9e4e57c07242a08945af503ee54768")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextRange.ByReference::class)
public interface ITextRange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Character(): Char

  @InterfaceMethod(1)
  public fun put_Character(value: Char): Unit

  @InterfaceMethod(2)
  public fun get_CharacterFormat(): ITextCharacterFormat?

  @InterfaceMethod(3)
  public fun put_CharacterFormat(value: ITextCharacterFormat?): Unit

  @InterfaceMethod(4)
  public fun get_FormattedText(): ITextRange?

  @InterfaceMethod(5)
  public fun put_FormattedText(value: ITextRange?): Unit

  @InterfaceMethod(6)
  public fun get_EndPosition(): Int

  @InterfaceMethod(7)
  public fun put_EndPosition(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Gravity(): RangeGravity?

  @InterfaceMethod(9)
  public fun put_Gravity(value: RangeGravity?): Unit

  @InterfaceMethod(10)
  public fun get_Length(): Int

  @InterfaceMethod(11)
  public fun get_Link(): String?

  @InterfaceMethod(12)
  public fun put_Link(value: String?): Unit

  @InterfaceMethod(13)
  public fun get_ParagraphFormat(): ITextParagraphFormat?

  @InterfaceMethod(14)
  public fun put_ParagraphFormat(value: ITextParagraphFormat?): Unit

  @InterfaceMethod(15)
  public fun get_StartPosition(): Int

  @InterfaceMethod(16)
  public fun put_StartPosition(value: Int): Unit

  @InterfaceMethod(17)
  public fun get_StoryLength(): Int

  @InterfaceMethod(18)
  public fun get_Text(): String?

  @InterfaceMethod(19)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(20)
  public fun CanPaste(format: Int): Boolean

  @InterfaceMethod(21)
  public fun ChangeCase(value: LetterCase?): Unit

  @InterfaceMethod(22)
  public fun Collapse(value: Boolean): Unit

  @InterfaceMethod(23)
  public fun Copy(): Unit

  @InterfaceMethod(24)
  public fun Cut(): Unit

  @InterfaceMethod(25)
  public fun Delete(unit: TextRangeUnit?, count: Int): Int

  @InterfaceMethod(26)
  public fun EndOf(unit: TextRangeUnit?, extend: Boolean): Int

  @InterfaceMethod(27)
  public fun Expand(unit: TextRangeUnit?): Int

  @InterfaceMethod(28)
  public fun FindText(
    value: String?,
    scanLength: Int,
    options: FindOptions?
  ): Int

  @InterfaceMethod(29)
  public fun GetCharacterUtf32(value: WinDef.UINT, offset: Int): Unit

  @InterfaceMethod(30)
  public fun GetClone(): ITextRange?

  @InterfaceMethod(31)
  public fun GetIndex(unit: TextRangeUnit?): Int

  @InterfaceMethod(32)
  public fun GetPoint(
    horizontalAlign: HorizontalCharacterAlignment?,
    verticalAlign: VerticalCharacterAlignment?,
    options: PointOptions?,
    point: Windows.Foundation.Point.ByReference?
  ): Unit

  @InterfaceMethod(33)
  public fun GetRect(
    options: PointOptions?,
    rect: Windows.Foundation.Rect.ByReference?,
    hit: Int
  ): Unit

  @InterfaceMethod(34)
  public fun GetText(options: TextGetOptions?, value: String?): Unit

  @InterfaceMethod(35)
  public fun GetTextViaStream(options: TextGetOptions?, value: IRandomAccessStream?): Unit

  @InterfaceMethod(36)
  public fun InRange(range: ITextRange?): Boolean

  @InterfaceMethod(37)
  public fun InsertImage(
    width: Int,
    height: Int,
    ascent: Int,
    verticalAlign: VerticalCharacterAlignment?,
    alternateText: String?,
    value: IRandomAccessStream?
  ): Unit

  @InterfaceMethod(38)
  public fun InStory(range: ITextRange?): Boolean

  @InterfaceMethod(39)
  public fun IsEqual(range: ITextRange?): Boolean

  @InterfaceMethod(40)
  public fun Move(unit: TextRangeUnit?, count: Int): Int

  @InterfaceMethod(41)
  public fun MoveEnd(unit: TextRangeUnit?, count: Int): Int

  @InterfaceMethod(42)
  public fun MoveStart(unit: TextRangeUnit?, count: Int): Int

  @InterfaceMethod(43)
  public fun Paste(format: Int): Unit

  @InterfaceMethod(44)
  public fun ScrollIntoView(value: PointOptions?): Unit

  @InterfaceMethod(45)
  public fun MatchSelection(): Unit

  @InterfaceMethod(46)
  public fun SetIndex(
    unit: TextRangeUnit?,
    index: Int,
    extend: Boolean
  ): Unit

  @InterfaceMethod(47)
  public fun SetPoint(
    point: Point?,
    options: PointOptions?,
    extend: Boolean
  ): Unit

  @InterfaceMethod(48)
  public fun SetRange(startPosition: Int, endPosition: Int): Unit

  @InterfaceMethod(49)
  public fun SetText(options: TextSetOptions?, value: String?): Unit

  @InterfaceMethod(50)
  public fun SetTextViaStream(options: TextSetOptions?, value: IRandomAccessStream?): Unit

  @InterfaceMethod(51)
  public fun StartOf(unit: TextRangeUnit?, extend: Boolean): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextRange> {
    public override fun getValue() = ABI.makeITextRange(pointer.getPointer(0))

    public fun setValue(value: ITextRange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextRange {
    public val __92400989_Ptr: Pointer?

    public val _92400989_VtblPtr: Pointer?
      get() = __92400989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Character(): Char {
      val fnPtr = _92400989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Char>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Char>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Character(value: Char): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CharacterFormat(): ITextCharacterFormat? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextCharacterFormat>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextCharacterFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CharacterFormat(value: ITextCharacterFormat?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FormattedText(): ITextRange? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRange>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FormattedText(value: ITextRange?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EndPosition(): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_EndPosition(value: Int): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Gravity(): RangeGravity? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RangeGravity>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RangeGravity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Gravity(value: RangeGravity?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Length(): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_Link(): String? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_Link(value: String?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ParagraphFormat(): ITextParagraphFormat? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextParagraphFormat>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextParagraphFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ParagraphFormat(value: ITextParagraphFormat?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_StartPosition(): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_StartPosition(value: Int): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_StoryLength(): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_Text(): String? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun CanPaste(format: Int): Boolean {
      val fnPtr = _92400989_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, format, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun ChangeCase(value: LetterCase?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun Collapse(value: Boolean): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun Copy(): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun Cut(): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun Delete(unit: TextRangeUnit?, count: Int): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun EndOf(unit: TextRangeUnit?, extend: Boolean): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun Expand(unit: TextRangeUnit?): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun FindText(
      value: String?,
      scanLength: Int,
      options: FindOptions?
    ): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value), scanLength,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun GetCharacterUtf32(value: WinDef.UINT, offset: Int): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, value, offset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun GetClone(): ITextRange? {
      val fnPtr = _92400989_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRange>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun GetIndex(unit: TextRangeUnit?): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun GetPoint(
      horizontalAlign: HorizontalCharacterAlignment?,
      verticalAlign: VerticalCharacterAlignment?,
      options: PointOptions?,
      point: Windows.Foundation.Point.ByReference?
    ): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(horizontalAlign),
          marshalToNative(verticalAlign), marshalToNative(options), marshalToNative(point),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun GetRect(
      options: PointOptions?,
      rect: Windows.Foundation.Rect.ByReference?,
      hit: Int
    ): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(options), marshalToNative(rect),
          hit,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun GetText(options: TextGetOptions?, value: String?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun GetTextViaStream(options: TextGetOptions?, value: IRandomAccessStream?):
        Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun InRange(range: ITextRange?): Boolean {
      val fnPtr = _92400989_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(range), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun InsertImage(
      width: Int,
      height: Int,
      ascent: Int,
      verticalAlign: VerticalCharacterAlignment?,
      alternateText: String?,
      value: IRandomAccessStream?
    ): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, width, height, ascent,
          marshalToNative(verticalAlign), marshalToNative(alternateText), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun InStory(range: ITextRange?): Boolean {
      val fnPtr = _92400989_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(range), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun IsEqual(range: ITextRange?): Boolean {
      val fnPtr = _92400989_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(range), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun Move(unit: TextRangeUnit?, count: Int): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun MoveEnd(unit: TextRangeUnit?, count: Int): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(42)
    public override fun MoveStart(unit: TextRangeUnit?, count: Int): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun Paste(format: Int): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, format,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun ScrollIntoView(value: PointOptions?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun MatchSelection(): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun SetIndex(
      unit: TextRangeUnit?,
      index: Int,
      extend: Boolean
    ): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), index, extend,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun SetPoint(
      point: Point?,
      options: PointOptions?,
      extend: Boolean
    ): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(point), marshalToNative(options),
          extend,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun SetRange(startPosition: Int, endPosition: Int): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, startPosition, endPosition,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun SetText(options: TextSetOptions?, value: String?): Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun SetTextViaStream(options: TextSetOptions?, value: IRandomAccessStream?):
        Unit {
      val fnPtr = _92400989_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun StartOf(unit: TextRangeUnit?, extend: Boolean): Int {
      val fnPtr = _92400989_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__92400989_Ptr, marshalToNative(unit), extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ITextRange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __92400989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextRange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b9e4e57c07242a08945af503ee54768")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextRange(ptr: Pointer?): WithDefault = ITextRange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextRange {
      val address = segment.toRawLongValue()
      return makeITextRange(Pointer(address))
    }

    public override fun toNative(obj: ITextRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__92400989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextRange): Array<ITextRange?> = (elements as
        Array<ITextRange?>).castToImpl<ITextRange,ITextRange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextRange?> = arrayOfNulls<ITextRange_Impl>(size)
        as Array<ITextRange?>
  }
}
