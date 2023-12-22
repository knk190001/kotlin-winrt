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

@ABIMarker(ITimedTextStyle.ABI::class)
@Signature("{1bb2384d-a825-40c2-a7f5-281eaedf3b55}")
@Guid("1bb2384da82540c2a7f5281eaedf3b55")
@WinRTInterface("1bb2384da82540c2a7f5281eaedf3b55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextStyle.ByReference::class)
public interface ITimedTextStyle : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_FontFamily(): String?

  @InterfaceMethod(3)
  public fun put_FontFamily(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_FontSize(): TimedTextDouble?

  @InterfaceMethod(5)
  public fun put_FontSize(value: TimedTextDouble?): Unit

  @InterfaceMethod(6)
  public fun get_FontWeight(): TimedTextWeight?

  @InterfaceMethod(7)
  public fun put_FontWeight(value: TimedTextWeight?): Unit

  @InterfaceMethod(8)
  public fun get_Foreground(): Color?

  @InterfaceMethod(9)
  public fun put_Foreground(value: Color?): Unit

  @InterfaceMethod(10)
  public fun get_Background(): Color?

  @InterfaceMethod(11)
  public fun put_Background(value: Color?): Unit

  @InterfaceMethod(12)
  public fun get_IsBackgroundAlwaysShown(): Boolean

  @InterfaceMethod(13)
  public fun put_IsBackgroundAlwaysShown(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_FlowDirection(): TimedTextFlowDirection?

  @InterfaceMethod(15)
  public fun put_FlowDirection(value: TimedTextFlowDirection?): Unit

  @InterfaceMethod(16)
  public fun get_LineAlignment(): TimedTextLineAlignment?

  @InterfaceMethod(17)
  public fun put_LineAlignment(value: TimedTextLineAlignment?): Unit

  @InterfaceMethod(18)
  public fun get_OutlineColor(): Color?

  @InterfaceMethod(19)
  public fun put_OutlineColor(value: Color?): Unit

  @InterfaceMethod(20)
  public fun get_OutlineThickness(): TimedTextDouble?

  @InterfaceMethod(21)
  public fun put_OutlineThickness(value: TimedTextDouble?): Unit

  @InterfaceMethod(22)
  public fun get_OutlineRadius(): TimedTextDouble?

  @InterfaceMethod(23)
  public fun put_OutlineRadius(value: TimedTextDouble?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedTextStyle> {
    public override fun getValue() = ABI.makeITimedTextStyle(pointer.getPointer(0))

    public fun setValue(value: ITimedTextStyle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextStyle {
    public val __1092607710_Ptr: Pointer?

    public val _1092607710_VtblPtr: Pointer?
      get() = __1092607710_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FontFamily(): String? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FontFamily(value: String?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FontSize(): TimedTextDouble? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextDouble>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FontSize(value: TimedTextDouble?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FontWeight(): TimedTextWeight? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextWeight>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FontWeight(value: TimedTextWeight?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Foreground(): Color? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Foreground(value: Color?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Background(): Color? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Background(value: Color?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsBackgroundAlwaysShown(): Boolean {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsBackgroundAlwaysShown(value: Boolean): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_FlowDirection(): TimedTextFlowDirection? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextFlowDirection>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextFlowDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_FlowDirection(value: TimedTextFlowDirection?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_LineAlignment(): TimedTextLineAlignment? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextLineAlignment>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextLineAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_LineAlignment(value: TimedTextLineAlignment?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_OutlineColor(): Color? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_OutlineColor(value: Color?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_OutlineThickness(): TimedTextDouble? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextDouble>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_OutlineThickness(value: TimedTextDouble?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_OutlineRadius(): TimedTextDouble? {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextDouble>()
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_OutlineRadius(value: TimedTextDouble?): Unit {
      val fnPtr = _1092607710_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1092607710_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimedTextStyle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1092607710_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextStyle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bb2384da82540c2a7f5281eaedf3b55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextStyle(ptr: Pointer?): WithDefault = ITimedTextStyle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextStyle {
      val address = segment.toRawLongValue()
      return makeITimedTextStyle(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1092607710_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextStyle): Array<ITimedTextStyle?> = (elements as
        Array<ITimedTextStyle?>).castToImpl<ITimedTextStyle,ITimedTextStyle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextStyle?> =
        arrayOfNulls<ITimedTextStyle_Impl>(size) as Array<ITimedTextStyle?>
  }
}
