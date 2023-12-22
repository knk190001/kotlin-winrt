package Windows.UI.Text

import Windows.UI.Text.ITextRange.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextSelection.ABI::class)
@Signature("{a6d36724-f28f-430a-b2cf-c343671ec0e9}")
@Guid("a6d36724f28f430ab2cfc343671ec0e9")
@WinRTInterface("a6d36724f28f430ab2cfc343671ec0e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextSelection.ByReference::class)
public interface ITextSelection : NativeMapped, IWinRTInterface, ITextRange {
  @InterfaceMethod(0)
  public fun get_Options(): SelectionOptions?

  @InterfaceMethod(1)
  public fun put_Options(value: SelectionOptions?): Unit

  @InterfaceMethod(2)
  public fun get_Type(): SelectionType?

  @InterfaceMethod(3)
  public fun EndKey(unit: TextRangeUnit?, extend: Boolean): Int

  @InterfaceMethod(4)
  public fun HomeKey(unit: TextRangeUnit?, extend: Boolean): Int

  @InterfaceMethod(5)
  public fun MoveDown(
    unit: TextRangeUnit?,
    count: Int,
    extend: Boolean
  ): Int

  @InterfaceMethod(6)
  public fun MoveLeft(
    unit: TextRangeUnit?,
    count: Int,
    extend: Boolean
  ): Int

  @InterfaceMethod(7)
  public fun MoveRight(
    unit: TextRangeUnit?,
    count: Int,
    extend: Boolean
  ): Int

  @InterfaceMethod(8)
  public fun MoveUp(
    unit: TextRangeUnit?,
    count: Int,
    extend: Boolean
  ): Int

  @InterfaceMethod(9)
  public fun TypeText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextSelection>
      {
    public override fun getValue() = ABI.makeITextSelection(pointer.getPointer(0))

    public fun setValue(value: ITextSelection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextSelection, ITextRange.WithDefault {
    public val __1489709042_Ptr: Pointer?

    public val _1489709042_VtblPtr: Pointer?
      get() = __1489709042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Options(): SelectionOptions? {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectionOptions>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectionOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Options(value: SelectionOptions?): Unit {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Type(): SelectionType? {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectionType>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectionType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun EndKey(unit: TextRangeUnit?, extend: Boolean): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun HomeKey(unit: TextRangeUnit?, extend: Boolean): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun MoveDown(
      unit: TextRangeUnit?,
      count: Int,
      extend: Boolean
    ): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), count, extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun MoveLeft(
      unit: TextRangeUnit?,
      count: Int,
      extend: Boolean
    ): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), count, extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun MoveRight(
      unit: TextRangeUnit?,
      count: Int,
      extend: Boolean
    ): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), count, extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun MoveUp(
      unit: TextRangeUnit?,
      count: Int,
      extend: Boolean
    ): Int {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(unit), count, extend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun TypeText(value: String?): Unit {
      val fnPtr = _1489709042_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1489709042_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextSelection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITextRange {
    public override val __92400989_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1489709042_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1489709042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextSelection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6d36724f28f430ab2cfc343671ec0e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextSelection(ptr: Pointer?): WithDefault = ITextSelection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextSelection {
      val address = segment.toRawLongValue()
      return makeITextSelection(Pointer(address))
    }

    public override fun toNative(obj: ITextSelection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1489709042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextSelection): Array<ITextSelection?> = (elements as
        Array<ITextSelection?>).castToImpl<ITextSelection,ITextSelection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextSelection?> =
        arrayOfNulls<ITextSelection_Impl>(size) as Array<ITextSelection?>
  }
}
