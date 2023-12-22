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
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextDocument.ABI::class)
@Signature("{beee4ddb-90b2-408c-a2f6-0a0ac31e33e4}")
@Guid("beee4ddb90b2408ca2f60a0ac31e33e4")
@WinRTInterface("beee4ddb90b2408ca2f60a0ac31e33e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextDocument.ByReference::class)
public interface ITextDocument : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CaretType(): CaretType?

  @InterfaceMethod(1)
  public fun put_CaretType(value: CaretType?): Unit

  @InterfaceMethod(2)
  public fun get_DefaultTabStop(): Float

  @InterfaceMethod(3)
  public fun put_DefaultTabStop(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_Selection(): ITextSelection?

  @InterfaceMethod(5)
  public fun get_UndoLimit(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_UndoLimit(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun CanCopy(): Boolean

  @InterfaceMethod(8)
  public fun CanPaste(): Boolean

  @InterfaceMethod(9)
  public fun CanRedo(): Boolean

  @InterfaceMethod(10)
  public fun CanUndo(): Boolean

  @InterfaceMethod(11)
  public fun ApplyDisplayUpdates(): Int

  @InterfaceMethod(12)
  public fun BatchDisplayUpdates(): Int

  @InterfaceMethod(13)
  public fun BeginUndoGroup(): Unit

  @InterfaceMethod(14)
  public fun EndUndoGroup(): Unit

  @InterfaceMethod(15)
  public fun GetDefaultCharacterFormat(): ITextCharacterFormat?

  @InterfaceMethod(16)
  public fun GetDefaultParagraphFormat(): ITextParagraphFormat?

  @InterfaceMethod(17)
  public fun GetRange(startPosition: Int, endPosition: Int): ITextRange?

  @InterfaceMethod(18)
  public fun GetRangeFromPoint(point: Point?, options: PointOptions?): ITextRange?

  @InterfaceMethod(19)
  public fun GetText(options: TextGetOptions?, value: String?): Unit

  @InterfaceMethod(20)
  public fun LoadFromStream(options: TextSetOptions?, value: IRandomAccessStream?): Unit

  @InterfaceMethod(21)
  public fun Redo(): Unit

  @InterfaceMethod(22)
  public fun SaveToStream(options: TextGetOptions?, value: IRandomAccessStream?): Unit

  @InterfaceMethod(23)
  public fun SetDefaultCharacterFormat(value: ITextCharacterFormat?): Unit

  @InterfaceMethod(24)
  public fun SetDefaultParagraphFormat(value: ITextParagraphFormat?): Unit

  @InterfaceMethod(25)
  public fun SetText(options: TextSetOptions?, value: String?): Unit

  @InterfaceMethod(26)
  public fun Undo(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextDocument>
      {
    public override fun getValue() = ABI.makeITextDocument(pointer.getPointer(0))

    public fun setValue(value: ITextDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextDocument {
    public val __965129717_Ptr: Pointer?

    public val _965129717_VtblPtr: Pointer?
      get() = __965129717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CaretType(): CaretType? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CaretType>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CaretType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CaretType(value: CaretType?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DefaultTabStop(): Float {
      val fnPtr = _965129717_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DefaultTabStop(value: Float): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Selection(): ITextSelection? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextSelection>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextSelection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_UndoLimit(): WinDef.UINT {
      val fnPtr = _965129717_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_UndoLimit(value: WinDef.UINT): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun CanCopy(): Boolean {
      val fnPtr = _965129717_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun CanPaste(): Boolean {
      val fnPtr = _965129717_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun CanRedo(): Boolean {
      val fnPtr = _965129717_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun CanUndo(): Boolean {
      val fnPtr = _965129717_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun ApplyDisplayUpdates(): Int {
      val fnPtr = _965129717_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun BatchDisplayUpdates(): Int {
      val fnPtr = _965129717_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun BeginUndoGroup(): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun EndUndoGroup(): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun GetDefaultCharacterFormat(): ITextCharacterFormat? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextCharacterFormat>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextCharacterFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetDefaultParagraphFormat(): ITextParagraphFormat? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextParagraphFormat>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextParagraphFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetRange(startPosition: Int, endPosition: Int): ITextRange? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRange>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, startPosition, endPosition, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetRangeFromPoint(point: Point?, options: PointOptions?): ITextRange? {
      val fnPtr = _965129717_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ITextRange>()
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(point),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ITextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetText(options: TextGetOptions?, value: String?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun LoadFromStream(options: TextSetOptions?, value: IRandomAccessStream?):
        Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Redo(): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SaveToStream(options: TextGetOptions?, value: IRandomAccessStream?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun SetDefaultCharacterFormat(value: ITextCharacterFormat?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun SetDefaultParagraphFormat(value: ITextParagraphFormat?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun SetText(options: TextSetOptions?, value: String?): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, marshalToNative(options),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun Undo(): Unit {
      val fnPtr = _965129717_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965129717_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextDocument_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965129717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextDocument, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("beee4ddb90b2408ca2f60a0ac31e33e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextDocument(ptr: Pointer?): WithDefault = ITextDocument_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextDocument {
      val address = segment.toRawLongValue()
      return makeITextDocument(Pointer(address))
    }

    public override fun toNative(obj: ITextDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965129717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextDocument): Array<ITextDocument?> = (elements as
        Array<ITextDocument?>).castToImpl<ITextDocument,ITextDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextDocument?> =
        arrayOfNulls<ITextDocument_Impl>(size) as Array<ITextDocument?>
  }
}
