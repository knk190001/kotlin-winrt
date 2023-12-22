package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Media.Brush
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBox6.ABI::class)
@Signature("{41ff2d07-5085-4e52-a51c-f94b06cd558b}")
@Guid("41ff2d0750854e52a51cf94b06cd558b")
@WinRTInterface("41ff2d0750854e52a51cf94b06cd558b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox6.ByReference::class)
public interface ITextBox6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(1)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(2)
  public fun get_CharacterCasing(): CharacterCasing?

  @InterfaceMethod(3)
  public fun put_CharacterCasing(value: CharacterCasing?): Unit

  @InterfaceMethod(4)
  public fun get_PlaceholderForeground(): Brush?

  @InterfaceMethod(5)
  public fun put_PlaceholderForeground(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun add_CopyingToClipboard(handler: TypedEventHandler<TextBox?,
      TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_CuttingToClipboard(handler: TypedEventHandler<TextBox?,
      TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_BeforeTextChanging(handler: TypedEventHandler<TextBox?,
      TextBoxBeforeTextChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_BeforeTextChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox6> {
    public override fun getValue() = ABI.makeITextBox6(pointer.getPointer(0))

    public fun setValue(value: ITextBox6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox6 {
    public val __1492904268_Ptr: Pointer?

    public val _1492904268_VtblPtr: Pointer?
      get() = __1492904268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CharacterCasing(): CharacterCasing? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CharacterCasing>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CharacterCasing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CharacterCasing(value: CharacterCasing?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PlaceholderForeground(): Brush? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PlaceholderForeground(value: Brush?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_CopyingToClipboard(handler: TypedEventHandler<TextBox?,
        TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_CuttingToClipboard(handler: TypedEventHandler<TextBox?,
        TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_BeforeTextChanging(handler: TypedEventHandler<TextBox?,
        TextBoxBeforeTextChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_BeforeTextChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1492904268_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904268_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBox6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492904268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41ff2d0750854e52a51cf94b06cd558b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox6(ptr: Pointer?): WithDefault = ITextBox6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox6 {
      val address = segment.toRawLongValue()
      return makeITextBox6(Pointer(address))
    }

    public override fun toNative(obj: ITextBox6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492904268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox6): Array<ITextBox6?> = (elements as
        Array<ITextBox6?>).castToImpl<ITextBox6,ITextBox6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox6?> = arrayOfNulls<ITextBox6_Impl>(size)
        as Array<ITextBox6?>
  }
}
