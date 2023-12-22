package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.SolidColorBrush
import Windows.UI.Xaml.OpticalMarginAlignment
import Windows.UI.Xaml.TextLineBounds
import Windows.UI.Xaml.TextReadingOrder
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichTextBlock2.ABI::class)
@Signature("{3f209013-03e7-4508-964a-91aedab3d11e}")
@Guid("3f20901303e74508964a91aedab3d11e")
@WinRTInterface("3f20901303e74508964a91aedab3d11e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock2.ByReference::class)
public interface IRichTextBlock2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxLines(): Int

  @InterfaceMethod(1)
  public fun put_MaxLines(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_TextLineBounds(): TextLineBounds?

  @InterfaceMethod(3)
  public fun put_TextLineBounds(value: TextLineBounds?): Unit

  @InterfaceMethod(4)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(5)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(6)
  public fun get_OpticalMarginAlignment(): OpticalMarginAlignment?

  @InterfaceMethod(7)
  public fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit

  @InterfaceMethod(8)
  public fun get_IsColorFontEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsColorFontEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(11)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlock2> {
    public override fun getValue() = ABI.makeIRichTextBlock2(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock2 {
    public val __1376290282_Ptr: Pointer?

    public val _1376290282_VtblPtr: Pointer?
      get() = __1376290282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxLines(): Int {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxLines(value: Int): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TextLineBounds(): TextLineBounds? {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextLineBounds>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextLineBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TextLineBounds(value: TextLineBounds?): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_OpticalMarginAlignment(): OpticalMarginAlignment? {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalMarginAlignment>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalMarginAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_OpticalMarginAlignment(value: OpticalMarginAlignment?): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsColorFontEnabled(): Boolean {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsColorFontEnabled(value: Boolean): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _1376290282_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290282_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376290282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f20901303e74508964a91aedab3d11e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock2(ptr: Pointer?): WithDefault = IRichTextBlock2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock2 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock2(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376290282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock2): Array<IRichTextBlock2?> = (elements as
        Array<IRichTextBlock2?>).castToImpl<IRichTextBlock2,IRichTextBlock2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock2?> =
        arrayOfNulls<IRichTextBlock2_Impl>(size) as Array<IRichTextBlock2?>
  }
}
