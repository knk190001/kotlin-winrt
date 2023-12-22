package Windows.UI.Text

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextParagraphFormat.ABI::class)
@Signature("{2cf8cfa6-4676-498a-93f5-bbdbfc0bd883}")
@Guid("2cf8cfa64676498a93f5bbdbfc0bd883")
@WinRTInterface("2cf8cfa64676498a93f5bbdbfc0bd883")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextParagraphFormat.ByReference::class)
public interface ITextParagraphFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Alignment(): ParagraphAlignment?

  @InterfaceMethod(1)
  public fun put_Alignment(value: ParagraphAlignment?): Unit

  @InterfaceMethod(2)
  public fun get_FirstLineIndent(): Float

  @InterfaceMethod(3)
  public fun get_KeepTogether(): FormatEffect?

  @InterfaceMethod(4)
  public fun put_KeepTogether(value: FormatEffect?): Unit

  @InterfaceMethod(5)
  public fun get_KeepWithNext(): FormatEffect?

  @InterfaceMethod(6)
  public fun put_KeepWithNext(value: FormatEffect?): Unit

  @InterfaceMethod(7)
  public fun get_LeftIndent(): Float

  @InterfaceMethod(8)
  public fun get_LineSpacing(): Float

  @InterfaceMethod(9)
  public fun get_LineSpacingRule(): LineSpacingRule?

  @InterfaceMethod(10)
  public fun get_ListAlignment(): MarkerAlignment?

  @InterfaceMethod(11)
  public fun put_ListAlignment(value: MarkerAlignment?): Unit

  @InterfaceMethod(12)
  public fun get_ListLevelIndex(): Int

  @InterfaceMethod(13)
  public fun put_ListLevelIndex(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_ListStart(): Int

  @InterfaceMethod(15)
  public fun put_ListStart(value: Int): Unit

  @InterfaceMethod(16)
  public fun get_ListStyle(): MarkerStyle?

  @InterfaceMethod(17)
  public fun put_ListStyle(value: MarkerStyle?): Unit

  @InterfaceMethod(18)
  public fun get_ListTab(): Float

  @InterfaceMethod(19)
  public fun put_ListTab(value: Float): Unit

  @InterfaceMethod(20)
  public fun get_ListType(): MarkerType?

  @InterfaceMethod(21)
  public fun put_ListType(value: MarkerType?): Unit

  @InterfaceMethod(22)
  public fun get_NoLineNumber(): FormatEffect?

  @InterfaceMethod(23)
  public fun put_NoLineNumber(value: FormatEffect?): Unit

  @InterfaceMethod(24)
  public fun get_PageBreakBefore(): FormatEffect?

  @InterfaceMethod(25)
  public fun put_PageBreakBefore(value: FormatEffect?): Unit

  @InterfaceMethod(26)
  public fun get_RightIndent(): Float

  @InterfaceMethod(27)
  public fun put_RightIndent(value: Float): Unit

  @InterfaceMethod(28)
  public fun get_RightToLeft(): FormatEffect?

  @InterfaceMethod(29)
  public fun put_RightToLeft(value: FormatEffect?): Unit

  @InterfaceMethod(30)
  public fun get_Style(): ParagraphStyle?

  @InterfaceMethod(31)
  public fun put_Style(value: ParagraphStyle?): Unit

  @InterfaceMethod(32)
  public fun get_SpaceAfter(): Float

  @InterfaceMethod(33)
  public fun put_SpaceAfter(value: Float): Unit

  @InterfaceMethod(34)
  public fun get_SpaceBefore(): Float

  @InterfaceMethod(35)
  public fun put_SpaceBefore(value: Float): Unit

  @InterfaceMethod(36)
  public fun get_WidowControl(): FormatEffect?

  @InterfaceMethod(37)
  public fun put_WidowControl(value: FormatEffect?): Unit

  @InterfaceMethod(38)
  public fun get_TabCount(): Int

  @InterfaceMethod(39)
  public fun AddTab(
    position: Float,
    align: TabAlignment?,
    leader: TabLeader?
  ): Unit

  @InterfaceMethod(40)
  public fun ClearAllTabs(): Unit

  @InterfaceMethod(41)
  public fun DeleteTab(position: Float): Unit

  @InterfaceMethod(42)
  public fun GetClone(): ITextParagraphFormat?

  @InterfaceMethod(43)
  public fun GetTab(
    index: Int,
    position: Float,
    align: Windows.UI.Text.TabAlignment.ByReference?,
    leader: Windows.UI.Text.TabLeader.ByReference?
  ): Unit

  @InterfaceMethod(44)
  public fun IsEqual(format: ITextParagraphFormat?): Boolean

  @InterfaceMethod(45)
  public fun SetClone(format: ITextParagraphFormat?): Unit

  @InterfaceMethod(46)
  public fun SetIndents(
    start: Float,
    left: Float,
    right: Float
  ): Unit

  @InterfaceMethod(47)
  public fun SetLineSpacing(rule: LineSpacingRule?, spacing: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextParagraphFormat> {
    public override fun getValue() = ABI.makeITextParagraphFormat(pointer.getPointer(0))

    public fun setValue(value: ITextParagraphFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextParagraphFormat {
    public val __1114295061_Ptr: Pointer?

    public val _1114295061_VtblPtr: Pointer?
      get() = __1114295061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Alignment(): ParagraphAlignment? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ParagraphAlignment>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ParagraphAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Alignment(value: ParagraphAlignment?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FirstLineIndent(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_KeepTogether(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_KeepTogether(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_KeepWithNext(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_KeepWithNext(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_LeftIndent(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_LineSpacing(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_LineSpacingRule(): LineSpacingRule? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineSpacingRule>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineSpacingRule>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ListAlignment(): MarkerAlignment? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MarkerAlignment>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MarkerAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ListAlignment(value: MarkerAlignment?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ListLevelIndex(): Int {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_ListLevelIndex(value: Int): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ListStart(): Int {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ListStart(value: Int): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ListStyle(): MarkerStyle? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MarkerStyle>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MarkerStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ListStyle(value: MarkerStyle?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ListTab(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_ListTab(value: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ListType(): MarkerType? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MarkerType>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MarkerType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_ListType(value: MarkerType?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_NoLineNumber(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_NoLineNumber(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_PageBreakBefore(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_PageBreakBefore(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_RightIndent(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_RightIndent(value: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_RightToLeft(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_RightToLeft(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_Style(): ParagraphStyle? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ParagraphStyle>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ParagraphStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_Style(value: ParagraphStyle?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_SpaceAfter(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_SpaceAfter(value: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_SpaceBefore(): Float {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_SpaceBefore(value: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_WidowControl(): FormatEffect? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FormatEffect>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FormatEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_WidowControl(value: FormatEffect?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_TabCount(): Int {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun AddTab(
      position: Float,
      align: TabAlignment?,
      leader: TabLeader?
    ): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, position, marshalToNative(align),
          marshalToNative(leader),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun ClearAllTabs(): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun DeleteTab(position: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, position,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun GetClone(): ITextParagraphFormat? {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextParagraphFormat>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextParagraphFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun GetTab(
      index: Int,
      position: Float,
      align: Windows.UI.Text.TabAlignment.ByReference?,
      leader: Windows.UI.Text.TabLeader.ByReference?
    ): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, index, position, marshalToNative(align),
          marshalToNative(leader),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun IsEqual(format: ITextParagraphFormat?): Boolean {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun SetClone(format: ITextParagraphFormat?): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(format),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun SetIndents(
      start: Float,
      left: Float,
      right: Float
    ): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, start, left, right,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun SetLineSpacing(rule: LineSpacingRule?, spacing: Float): Unit {
      val fnPtr = _1114295061_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1114295061_Ptr, marshalToNative(rule), spacing,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextParagraphFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1114295061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextParagraphFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cf8cfa64676498a93f5bbdbfc0bd883")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextParagraphFormat(ptr: Pointer?): WithDefault = ITextParagraphFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextParagraphFormat {
      val address = segment.toRawLongValue()
      return makeITextParagraphFormat(Pointer(address))
    }

    public override fun toNative(obj: ITextParagraphFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1114295061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextParagraphFormat): Array<ITextParagraphFormat?> =
        (elements as
        Array<ITextParagraphFormat?>).castToImpl<ITextParagraphFormat,ITextParagraphFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextParagraphFormat?> =
        arrayOfNulls<ITextParagraphFormat_Impl>(size) as Array<ITextParagraphFormat?>
  }
}
