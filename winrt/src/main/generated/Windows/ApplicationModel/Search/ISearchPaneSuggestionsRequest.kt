package Windows.ApplicationModel.Search

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

@ABIMarker(ISearchPaneSuggestionsRequest.ABI::class)
@Signature("{81b10b1c-e561-4093-9b4d-2ad482794a53}")
@Guid("81b10b1ce56140939b4d2ad482794a53")
@WinRTInterface("81b10b1ce56140939b4d2ad482794a53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneSuggestionsRequest.ByReference::class)
public interface ISearchPaneSuggestionsRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(1)
  public fun get_SearchSuggestionCollection(): SearchSuggestionCollection?

  @InterfaceMethod(2)
  public fun GetDeferral(): SearchPaneSuggestionsRequestDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneSuggestionsRequest> {
    public override fun getValue() = ABI.makeISearchPaneSuggestionsRequest(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneSuggestionsRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneSuggestionsRequest {
    public val __1665906983_Ptr: Pointer?

    public val _1665906983_VtblPtr: Pointer?
      get() = __1665906983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1665906983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1665906983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SearchSuggestionCollection(): SearchSuggestionCollection? {
      val fnPtr = _1665906983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchSuggestionCollection>()
      val hr = fn.invokeHR(arrayOf(__1665906983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchSuggestionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): SearchPaneSuggestionsRequestDeferral? {
      val fnPtr = _1665906983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchPaneSuggestionsRequestDeferral>()
      val hr = fn.invokeHR(arrayOf(__1665906983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchPaneSuggestionsRequestDeferral>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneSuggestionsRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1665906983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneSuggestionsRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81b10b1ce56140939b4d2ad482794a53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneSuggestionsRequest(ptr: Pointer?): WithDefault =
        ISearchPaneSuggestionsRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneSuggestionsRequest {
      val address = segment.toRawLongValue()
      return makeISearchPaneSuggestionsRequest(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneSuggestionsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1665906983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneSuggestionsRequest):
        Array<ISearchPaneSuggestionsRequest?> = (elements as
        Array<ISearchPaneSuggestionsRequest?>).castToImpl<ISearchPaneSuggestionsRequest,ISearchPaneSuggestionsRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneSuggestionsRequest?> =
        arrayOfNulls<ISearchPaneSuggestionsRequest_Impl>(size) as
        Array<ISearchPaneSuggestionsRequest?>
  }
}
