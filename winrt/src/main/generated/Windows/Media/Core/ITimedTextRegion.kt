package Windows.Media.Core

import Windows.UI.Color
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextRegion.ABI::class)
@Signature("{1ed0881f-8a06-4222-9f59-b21bf40124b4}")
@Guid("1ed0881f8a0642229f59b21bf40124b4")
@WinRTInterface("1ed0881f8a0642229f59b21bf40124b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextRegion.ByReference::class)
public interface ITimedTextRegion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Position(): TimedTextPoint?

  @InterfaceMethod(3)
  public fun put_Position(value: TimedTextPoint?): Unit

  @InterfaceMethod(4)
  public fun get_Extent(): TimedTextSize?

  @InterfaceMethod(5)
  public fun put_Extent(value: TimedTextSize?): Unit

  @InterfaceMethod(6)
  public fun get_Background(): Color?

  @InterfaceMethod(7)
  public fun put_Background(value: Color?): Unit

  @InterfaceMethod(8)
  public fun get_WritingMode(): TimedTextWritingMode?

  @InterfaceMethod(9)
  public fun put_WritingMode(value: TimedTextWritingMode?): Unit

  @InterfaceMethod(10)
  public fun get_DisplayAlignment(): TimedTextDisplayAlignment?

  @InterfaceMethod(11)
  public fun put_DisplayAlignment(value: TimedTextDisplayAlignment?): Unit

  @InterfaceMethod(12)
  public fun get_LineHeight(): TimedTextDouble?

  @InterfaceMethod(13)
  public fun put_LineHeight(value: TimedTextDouble?): Unit

  @InterfaceMethod(14)
  public fun get_IsOverflowClipped(): Boolean

  @InterfaceMethod(15)
  public fun put_IsOverflowClipped(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_Padding(): TimedTextPadding?

  @InterfaceMethod(17)
  public fun put_Padding(value: TimedTextPadding?): Unit

  @InterfaceMethod(18)
  public fun get_TextWrapping(): TimedTextWrapping?

  @InterfaceMethod(19)
  public fun put_TextWrapping(value: TimedTextWrapping?): Unit

  @InterfaceMethod(20)
  public fun get_ZIndex(): Int

  @InterfaceMethod(21)
  public fun put_ZIndex(value: Int): Unit

  @InterfaceMethod(22)
  public fun get_ScrollMode(): TimedTextScrollMode?

  @InterfaceMethod(23)
  public fun put_ScrollMode(value: TimedTextScrollMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextRegion> {
    public override fun getValue() = ABI.makeITimedTextRegion(pointer.getPointer(0))

    public fun setValue(value: ITimedTextRegion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextRegion {
    public val __445878691_Ptr: Pointer?

    public val _445878691_VtblPtr: Pointer?
      get() = __445878691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Position(): TimedTextPoint? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextPoint>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Position(value: TimedTextPoint?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Extent(): TimedTextSize? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextSize>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Extent(value: TimedTextSize?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Background(): Color? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Background(value: Color?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_WritingMode(): TimedTextWritingMode? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextWritingMode>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextWritingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_WritingMode(value: TimedTextWritingMode?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DisplayAlignment(): TimedTextDisplayAlignment? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextDisplayAlignment>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextDisplayAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DisplayAlignment(value: TimedTextDisplayAlignment?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_LineHeight(): TimedTextDouble? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextDouble>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_LineHeight(value: TimedTextDouble?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsOverflowClipped(): Boolean {
      val fnPtr = _445878691_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsOverflowClipped(value: Boolean): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Padding(): TimedTextPadding? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextPadding>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextPadding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Padding(value: TimedTextPadding?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TextWrapping(): TimedTextWrapping? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextWrapping>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextWrapping>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_TextWrapping(value: TimedTextWrapping?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ZIndex(): Int {
      val fnPtr = _445878691_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_ZIndex(value: Int): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_ScrollMode(): TimedTextScrollMode? {
      val fnPtr = _445878691_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextScrollMode>()
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_ScrollMode(value: TimedTextScrollMode?): Unit {
      val fnPtr = _445878691_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445878691_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextRegion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445878691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextRegion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ed0881f8a0642229f59b21bf40124b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextRegion(ptr: Pointer?): WithDefault = ITimedTextRegion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextRegion {
      val address = segment.toRawLongValue()
      return makeITimedTextRegion(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445878691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextRegion): Array<ITimedTextRegion?> = (elements as
        Array<ITimedTextRegion?>).castToImpl<ITimedTextRegion,ITimedTextRegion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextRegion?> =
        arrayOfNulls<ITimedTextRegion_Impl>(size) as Array<ITimedTextRegion?>
  }
}
