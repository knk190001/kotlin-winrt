package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Documents.TextHighlighter
import Windows.UI.Xaml.TextAlignment
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

@ABIMarker(IRichTextBlock5.ABI::class)
@Signature("{9c7dc0c6-7a9f-45b6-8818-822c549ba094}")
@Guid("9c7dc0c67a9f45b68818822c549ba094")
@WinRTInterface("9c7dc0c67a9f45b68818822c549ba094")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock5.ByReference::class)
public interface IRichTextBlock5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextTrimmed(): Boolean

  @InterfaceMethod(1)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(2)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(3)
  public fun get_TextHighlighters(): IVector<TextHighlighter?>?

  @InterfaceMethod(4)
  public fun add_IsTextTrimmedChanged(handler: TypedEventHandler<RichTextBlock?,
      IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlock5> {
    public override fun getValue() = ABI.makeIRichTextBlock5(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock5 {
    public val __1376290285_Ptr: Pointer?

    public val _1376290285_VtblPtr: Pointer?
      get() = __1376290285_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextTrimmed(): Boolean {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TextHighlighters(): IVector<TextHighlighter?>? {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TextHighlighter?>>()
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TextHighlighter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_IsTextTrimmedChanged(handler: TypedEventHandler<RichTextBlock?,
        IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1376290285_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290285_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376290285_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c7dc0c67a9f45b68818822c549ba094")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock5(ptr: Pointer?): WithDefault = IRichTextBlock5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock5 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock5(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376290285_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock5): Array<IRichTextBlock5?> = (elements as
        Array<IRichTextBlock5?>).castToImpl<IRichTextBlock5,IRichTextBlock5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock5?> =
        arrayOfNulls<IRichTextBlock5_Impl>(size) as Array<IRichTextBlock5?>
  }
}
