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

@ABIMarker(SearchPaneSuggestionsRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest;{81b10b1c-e561-4093-9b4d-2ad482794a53})")
@WinRTByReference(brClass = SearchPaneSuggestionsRequest.ByReference::class)
public class SearchPaneSuggestionsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneSuggestionsRequest.WithDefault, IWinRTObject {
  private val __1665906983_Interface: ISearchPaneSuggestionsRequest.WithDefault by lazy {
    as_1665906983()
  }


  public override val __1665906983_Ptr: JNAPointer? by lazy {
    __1665906983_Interface.__1665906983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1665906983_Interface)

  private fun as_1665906983(): ISearchPaneSuggestionsRequest.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneSuggestionsRequest.ABI.makeISearchPaneSuggestionsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneSuggestionsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneSuggestionsRequest.ABI.makeISearchPaneSuggestionsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneSuggestionsRequest> {
    public override fun getValue() = SearchPaneSuggestionsRequest(pointer.getPointer(0))

    public fun setValue(value: SearchPaneSuggestionsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneSuggestionsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneSuggestionsRequest {
      val address = segment.toRawLongValue()
      return SearchPaneSuggestionsRequest(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneSuggestionsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
