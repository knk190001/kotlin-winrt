package Windows.ApplicationModel.Search.Core

import Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import Windows.ApplicationModel.Search.SearchSuggestionsRequest
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISearchSuggestionsRequestedEventArgs.ABI::class)
@Signature("{6fd519e5-9e7e-4ab4-8be3-c76b1bd4344a}")
@Guid("6fd519e59e7e4ab48be3c76b1bd4344a")
@WinRTInterface("6fd519e59e7e4ab48be3c76b1bd4344a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchSuggestionsRequestedEventArgs.ByReference::class)
public interface ISearchSuggestionsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_LinguisticDetails(): SearchQueryLinguisticDetails?

  @InterfaceMethod(3)
  public fun get_Request(): SearchSuggestionsRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchSuggestionsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeISearchSuggestionsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchSuggestionsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchSuggestionsRequestedEventArgs {
    public val __1003869694_Ptr: Pointer?

    public val _1003869694_VtblPtr: Pointer?
      get() = __1003869694_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _1003869694_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1003869694_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _1003869694_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1003869694_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LinguisticDetails(): SearchQueryLinguisticDetails? {
      val fnPtr = _1003869694_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchQueryLinguisticDetails>()
      val hr = fn.invokeHR(arrayOf(__1003869694_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchQueryLinguisticDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Request(): SearchSuggestionsRequest? {
      val fnPtr = _1003869694_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchSuggestionsRequest>()
      val hr = fn.invokeHR(arrayOf(__1003869694_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchSuggestionsRequest>(result.getValue())
      return resultValue
    }
  }

  public class ISearchSuggestionsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1003869694_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchSuggestionsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fd519e59e7e4ab48be3c76b1bd4344a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchSuggestionsRequestedEventArgs(ptr: Pointer?): WithDefault =
        ISearchSuggestionsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchSuggestionsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchSuggestionsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchSuggestionsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1003869694_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchSuggestionsRequestedEventArgs):
        Array<ISearchSuggestionsRequestedEventArgs?> = (elements as
        Array<ISearchSuggestionsRequestedEventArgs?>).castToImpl<ISearchSuggestionsRequestedEventArgs,ISearchSuggestionsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchSuggestionsRequestedEventArgs?> =
        arrayOfNulls<ISearchSuggestionsRequestedEventArgs_Impl>(size) as
        Array<ISearchSuggestionsRequestedEventArgs?>
  }
}
