package Windows.ApplicationModel.Search

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SearchSuggestionsRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchSuggestionsRequest;{4e4e26a7-44e5-4039-9099-6000ead1f0c6})")
@WinRTByReference(brClass = SearchSuggestionsRequest.ByReference::class)
public class SearchSuggestionsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchSuggestionsRequest.WithDefault, IWinRTObject {
  private val __1879178015_Interface: ISearchSuggestionsRequest.WithDefault by lazy {
    as_1879178015()
  }


  public override val __1879178015_Ptr: JNAPointer? by lazy {
    __1879178015_Interface.__1879178015_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1879178015_Interface)

  private fun as_1879178015(): ISearchSuggestionsRequest.WithDefault {
    if(pointer == NULL) {
      return(ISearchSuggestionsRequest.ABI.makeISearchSuggestionsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchSuggestionsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchSuggestionsRequest.ABI.makeISearchSuggestionsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchSuggestionsRequest> {
    public override fun getValue() = SearchSuggestionsRequest(pointer.getPointer(0))

    public fun setValue(value: SearchSuggestionsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchSuggestionsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchSuggestionsRequest {
      val address = segment.toRawLongValue()
      return SearchSuggestionsRequest(Pointer(address))
    }

    public override fun toNative(obj: SearchSuggestionsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
