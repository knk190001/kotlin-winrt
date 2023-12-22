package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.Search.LocalContentSuggestionSettings
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.RoutedEventArgs
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

@ABIMarker(ISearchBox.ABI::class)
@Signature("{f89ecc5a-99ba-4bd4-966c-f11fa443d13c}")
@Guid("f89ecc5a99ba4bd4966cf11fa443d13c")
@WinRTInterface("f89ecc5a99ba4bd4966cf11fa443d13c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBox.ByReference::class)
public interface ISearchBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SearchHistoryEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_SearchHistoryEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SearchHistoryContext(): String?

  @InterfaceMethod(3)
  public fun put_SearchHistoryContext(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(5)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_QueryText(): String?

  @InterfaceMethod(7)
  public fun put_QueryText(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_FocusOnKeyboardInput(): Boolean

  @InterfaceMethod(9)
  public fun put_FocusOnKeyboardInput(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_ChooseSuggestionOnEnter(): Boolean

  @InterfaceMethod(11)
  public fun put_ChooseSuggestionOnEnter(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun add_QueryChanged(handler: TypedEventHandler<SearchBox?,
      SearchBoxQueryChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_QueryChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_SuggestionsRequested(handler: TypedEventHandler<SearchBox?,
      SearchBoxSuggestionsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_QuerySubmitted(handler: TypedEventHandler<SearchBox?,
      SearchBoxQuerySubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_ResultSuggestionChosen(handler: TypedEventHandler<SearchBox?,
      SearchBoxResultSuggestionChosenEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_ResultSuggestionChosen(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_PrepareForFocusOnKeyboardInput(handler: TypedEventHandler<SearchBox?,
      RoutedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_PrepareForFocusOnKeyboardInput(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISearchBox> {
    public override fun getValue() = ABI.makeISearchBox(pointer.getPointer(0))

    public fun setValue(value: ISearchBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBox {
    public val __487693721_Ptr: Pointer?

    public val _487693721_VtblPtr: Pointer?
      get() = __487693721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SearchHistoryEnabled(): Boolean {
      val fnPtr = _487693721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SearchHistoryEnabled(value: Boolean): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SearchHistoryContext(): String? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SearchHistoryContext(value: String?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_QueryText(): String? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_QueryText(value: String?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FocusOnKeyboardInput(): Boolean {
      val fnPtr = _487693721_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_FocusOnKeyboardInput(value: Boolean): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ChooseSuggestionOnEnter(): Boolean {
      val fnPtr = _487693721_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ChooseSuggestionOnEnter(value: Boolean): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_QueryChanged(handler: TypedEventHandler<SearchBox?,
        SearchBoxQueryChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_QueryChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_SuggestionsRequested(handler: TypedEventHandler<SearchBox?,
        SearchBoxSuggestionsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_QuerySubmitted(handler: TypedEventHandler<SearchBox?,
        SearchBoxQuerySubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_ResultSuggestionChosen(handler: TypedEventHandler<SearchBox?,
        SearchBoxResultSuggestionChosenEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_ResultSuggestionChosen(token: EventRegistrationToken?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_PrepareForFocusOnKeyboardInput(handler: TypedEventHandler<SearchBox?,
        RoutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _487693721_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_PrepareForFocusOnKeyboardInput(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override
        fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit {
      val fnPtr = _487693721_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__487693721_Ptr, marshalToNative(settings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __487693721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f89ecc5a99ba4bd4966cf11fa443d13c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBox(ptr: Pointer?): WithDefault = ISearchBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBox {
      val address = segment.toRawLongValue()
      return makeISearchBox(Pointer(address))
    }

    public override fun toNative(obj: ISearchBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__487693721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBox): Array<ISearchBox?> = (elements as
        Array<ISearchBox?>).castToImpl<ISearchBox,ISearchBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBox?> = arrayOfNulls<ISearchBox_Impl>(size)
        as Array<ISearchBox?>
  }
}
