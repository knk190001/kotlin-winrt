package Windows.ApplicationModel.Search.Core

import Windows.ApplicationModel.Search.LocalContentSuggestionSettings
import Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import Windows.Foundation.Collections.IObservableVector
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

@ABIMarker(ISearchSuggestionManager.ABI::class)
@Signature("{3f0c50a1-cb9d-497b-b500-3c04ac959ad2}")
@Guid("3f0c50a1cb9d497bb5003c04ac959ad2")
@WinRTInterface("3f0c50a1cb9d497bb5003c04ac959ad2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchSuggestionManager.ByReference::class)
public interface ISearchSuggestionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SearchHistoryEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_SearchHistoryEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SearchHistoryContext(): String?

  @InterfaceMethod(3)
  public fun put_SearchHistoryContext(value: String?): Unit

  @InterfaceMethod(4)
  public fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit

  @InterfaceMethod(5)
  public fun SetQuery(queryText: String?): Unit

  @InterfaceMethod(6)
  public fun SetQuery(queryText: String?, language: String?): Unit

  @InterfaceMethod(7)
  public fun SetQuery(
    queryText: String?,
    language: String?,
    linguisticDetails: SearchQueryLinguisticDetails?
  ): Unit

  @InterfaceMethod(8)
  public fun get_Suggestions(): IObservableVector<SearchSuggestion?>?

  @InterfaceMethod(9)
  public fun AddToHistory(queryText: String?): Unit

  @InterfaceMethod(10)
  public fun AddToHistory(queryText: String?, language: String?): Unit

  @InterfaceMethod(11)
  public fun ClearHistory(): Unit

  @InterfaceMethod(12)
  public fun add_SuggestionsRequested(handler: TypedEventHandler<SearchSuggestionManager?,
      SearchSuggestionsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_RequestingFocusOnKeyboardInput(handler: TypedEventHandler<SearchSuggestionManager?,
      RequestingFocusOnKeyboardInputEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_RequestingFocusOnKeyboardInput(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchSuggestionManager> {
    public override fun getValue() = ABI.makeISearchSuggestionManager(pointer.getPointer(0))

    public fun setValue(value: ISearchSuggestionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchSuggestionManager {
    public val __1734756877_Ptr: Pointer?

    public val _1734756877_VtblPtr: Pointer?
      get() = __1734756877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SearchHistoryEnabled(): Boolean {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SearchHistoryEnabled(value: Boolean): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SearchHistoryContext(): String? {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SearchHistoryContext(value: String?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun SetLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(settings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetQuery(queryText: String?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(queryText),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetQuery(queryText: String?, language: String?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(queryText),
          marshalToNative(language),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetQuery(
      queryText: String?,
      language: String?,
      linguisticDetails: SearchQueryLinguisticDetails?
    ): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(queryText),
          marshalToNative(language), marshalToNative(linguisticDetails),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Suggestions(): IObservableVector<SearchSuggestion?>? {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<SearchSuggestion?>>()
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<SearchSuggestion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun AddToHistory(queryText: String?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(queryText),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun AddToHistory(queryText: String?, language: String?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(queryText),
          marshalToNative(language),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun ClearHistory(): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_SuggestionsRequested(handler: TypedEventHandler<SearchSuggestionManager?,
        SearchSuggestionsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_SuggestionsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override
        fun add_RequestingFocusOnKeyboardInput(handler: TypedEventHandler<SearchSuggestionManager?,
        RequestingFocusOnKeyboardInputEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_RequestingFocusOnKeyboardInput(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1734756877_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1734756877_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchSuggestionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1734756877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchSuggestionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f0c50a1cb9d497bb5003c04ac959ad2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchSuggestionManager(ptr: Pointer?): WithDefault =
        ISearchSuggestionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchSuggestionManager {
      val address = segment.toRawLongValue()
      return makeISearchSuggestionManager(Pointer(address))
    }

    public override fun toNative(obj: ISearchSuggestionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1734756877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchSuggestionManager):
        Array<ISearchSuggestionManager?> = (elements as
        Array<ISearchSuggestionManager?>).castToImpl<ISearchSuggestionManager,ISearchSuggestionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchSuggestionManager?> =
        arrayOfNulls<ISearchSuggestionManager_Impl>(size) as Array<ISearchSuggestionManager?>
  }
}
