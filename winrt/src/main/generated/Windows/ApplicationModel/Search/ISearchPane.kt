package Windows.ApplicationModel.Search

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

@ABIMarker(ISearchPane.ABI::class)
@Signature("{fdacec38-3700-4d73-91a1-2f998674238a}")
@Guid("fdacec3837004d7391a12f998674238a")
@WinRTInterface("fdacec3837004d7391a12f998674238a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPane.ByReference::class)
public interface ISearchPane : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_SearchHistoryEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_SearchHistoryEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_SearchHistoryContext(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_SearchHistoryContext(): String?

  @InterfaceMethod(4)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(6)
  public fun get_QueryText(): String?

  @InterfaceMethod(7)
  public fun get_Language(): String?

  @InterfaceMethod(8)
  public fun get_Visible(): Boolean

  @InterfaceMethod(9)
  public fun add_VisibilityChanged(handler: TypedEventHandler<SearchPane?,
      SearchPaneVisibilityChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_QueryChanged(handler: TypedEventHandler<SearchPane?,
      SearchPaneQueryChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_QueryChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_SuggestionsRequested(handler: TypedEventHandler<SearchPane?,
      SearchPaneSuggestionsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_QuerySubmitted(handler: TypedEventHandler<SearchPane?,
      SearchPaneQuerySubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_ResultSuggestionChosen(handler: TypedEventHandler<SearchPane?,
      SearchPaneResultSuggestionChosenEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_ResultSuggestionChosen(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit

  @InterfaceMethod(20)
  public fun Show(): Unit

  @InterfaceMethod(21)
  public fun Show(query: String?): Unit

  @InterfaceMethod(22)
  public fun put_ShowOnKeyboardInput(value: Boolean): Unit

  @InterfaceMethod(23)
  public fun get_ShowOnKeyboardInput(): Boolean

  @InterfaceMethod(24)
  public fun TrySetQueryText(query: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISearchPane> {
    public override fun getValue() = ABI.makeISearchPane(pointer.getPointer(0))

    public fun setValue(value: ISearchPane_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPane {
    public val __347021273_Ptr: Pointer?

    public val _347021273_VtblPtr: Pointer?
      get() = __347021273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_SearchHistoryEnabled(value: Boolean): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_SearchHistoryEnabled(): Boolean {
      val fnPtr = _347021273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_SearchHistoryContext(value: String?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SearchHistoryContext(): String? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_QueryText(): String? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Language(): String? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Visible(): Boolean {
      val fnPtr = _347021273_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun add_VisibilityChanged(handler: TypedEventHandler<SearchPane?,
        SearchPaneVisibilityChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_QueryChanged(handler: TypedEventHandler<SearchPane?,
        SearchPaneQueryChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_QueryChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_SuggestionsRequested(handler: TypedEventHandler<SearchPane?,
        SearchPaneSuggestionsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_QuerySubmitted(handler: TypedEventHandler<SearchPane?,
        SearchPaneQuerySubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_ResultSuggestionChosen(handler: TypedEventHandler<SearchPane?,
        SearchPaneResultSuggestionChosenEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347021273_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_ResultSuggestionChosen(token: EventRegistrationToken?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override
        fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(settings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun Show(): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Show(query: String?): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(query),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun put_ShowOnKeyboardInput(value: Boolean): Unit {
      val fnPtr = _347021273_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_ShowOnKeyboardInput(): Boolean {
      val fnPtr = _347021273_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun TrySetQueryText(query: String?): Boolean {
      val fnPtr = _347021273_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__347021273_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISearchPane_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __347021273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPane, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdacec3837004d7391a12f998674238a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPane(ptr: Pointer?): WithDefault = ISearchPane_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPane {
      val address = segment.toRawLongValue()
      return makeISearchPane(Pointer(address))
    }

    public override fun toNative(obj: ISearchPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__347021273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPane): Array<ISearchPane?> = (elements as
        Array<ISearchPane?>).castToImpl<ISearchPane,ISearchPane_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPane?> =
        arrayOfNulls<ISearchPane_Impl>(size) as Array<ISearchPane?>
  }
}
