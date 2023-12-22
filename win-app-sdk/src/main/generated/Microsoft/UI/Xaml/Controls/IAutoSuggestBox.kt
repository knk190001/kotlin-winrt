package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Style
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoSuggestBox.ABI::class)
@Signature("{3eea809e-b2db-521d-97db-e0648fb5d798}")
@Guid("3eea809eb2db521d97dbe0648fb5d798")
@WinRTInterface("3eea809eb2db521d97dbe0648fb5d798")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBox.ByReference::class)
public interface IAutoSuggestBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxSuggestionListHeight(): Double

  @InterfaceMethod(1)
  public fun put_MaxSuggestionListHeight(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_IsSuggestionListOpen(): Boolean

  @InterfaceMethod(3)
  public fun put_IsSuggestionListOpen(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_TextMemberPath(): String?

  @InterfaceMethod(5)
  public fun put_TextMemberPath(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Text(): String?

  @InterfaceMethod(7)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_UpdateTextOnSelect(): Boolean

  @InterfaceMethod(9)
  public fun put_UpdateTextOnSelect(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(11)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(13)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(14)
  public fun get_AutoMaximizeSuggestionArea(): Boolean

  @InterfaceMethod(15)
  public fun put_AutoMaximizeSuggestionArea(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_TextBoxStyle(): Style?

  @InterfaceMethod(17)
  public fun put_TextBoxStyle(value: Style?): Unit

  @InterfaceMethod(18)
  public fun get_QueryIcon(): IconElement?

  @InterfaceMethod(19)
  public fun put_QueryIcon(value: IconElement?): Unit

  @InterfaceMethod(20)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(21)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(22)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(23)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(24)
  public fun add_SuggestionChosen(handler: TypedEventHandler<AutoSuggestBox?,
      AutoSuggestBoxSuggestionChosenEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_SuggestionChosen(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_TextChanged(handler: TypedEventHandler<AutoSuggestBox?,
      AutoSuggestBoxTextChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_TextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_QuerySubmitted(handler: TypedEventHandler<AutoSuggestBox?,
      AutoSuggestBoxQuerySubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBox> {
    public override fun getValue() = ABI.makeIAutoSuggestBox(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBox {
    public val __1031112765_Ptr: Pointer?

    public val _1031112765_VtblPtr: Pointer?
      get() = __1031112765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxSuggestionListHeight(): Double {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxSuggestionListHeight(value: Double): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsSuggestionListOpen(): Boolean {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsSuggestionListOpen(value: Boolean): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TextMemberPath(): String? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TextMemberPath(value: String?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Text(): String? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_UpdateTextOnSelect(): Boolean {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_UpdateTextOnSelect(value: Boolean): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_AutoMaximizeSuggestionArea(): Boolean {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_AutoMaximizeSuggestionArea(value: Boolean): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TextBoxStyle(): Style? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_TextBoxStyle(value: Style?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_QueryIcon(): IconElement? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_QueryIcon(value: IconElement?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_SuggestionChosen(handler: TypedEventHandler<AutoSuggestBox?,
        AutoSuggestBoxSuggestionChosenEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_SuggestionChosen(token: EventRegistrationToken?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_TextChanged(handler: TypedEventHandler<AutoSuggestBox?,
        AutoSuggestBoxTextChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_TextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_QuerySubmitted(handler: TypedEventHandler<AutoSuggestBox?,
        AutoSuggestBoxQuerySubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1031112765_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1031112765_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutoSuggestBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1031112765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3eea809eb2db521d97dbe0648fb5d798")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBox(ptr: Pointer?): WithDefault = IAutoSuggestBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBox {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBox(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1031112765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBox): Array<IAutoSuggestBox?> = (elements as
        Array<IAutoSuggestBox?>).castToImpl<IAutoSuggestBox,IAutoSuggestBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBox?> =
        arrayOfNulls<IAutoSuggestBox_Impl>(size) as Array<IAutoSuggestBox?>
  }
}
