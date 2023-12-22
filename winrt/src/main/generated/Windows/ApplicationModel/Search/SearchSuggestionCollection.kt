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

@ABIMarker(SearchSuggestionCollection.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchSuggestionCollection;{323a8a4b-fbea-4446-abbc-3da7915fdd3a})")
@WinRTByReference(brClass = SearchSuggestionCollection.ByReference::class)
public class SearchSuggestionCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchSuggestionCollection.WithDefault, IWinRTObject {
  private val __682278529_Interface: ISearchSuggestionCollection.WithDefault by lazy {
    as_682278529()
  }


  public override val __682278529_Ptr: JNAPointer? by lazy {
    __682278529_Interface.__682278529_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__682278529_Interface)

  private fun as_682278529(): ISearchSuggestionCollection.WithDefault {
    if(pointer == NULL) {
      return(ISearchSuggestionCollection.ABI.makeISearchSuggestionCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchSuggestionCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchSuggestionCollection.ABI.makeISearchSuggestionCollection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchSuggestionCollection> {
    public override fun getValue() = SearchSuggestionCollection(pointer.getPointer(0))

    public fun setValue(value: SearchSuggestionCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchSuggestionCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchSuggestionCollection {
      val address = segment.toRawLongValue()
      return SearchSuggestionCollection(Pointer(address))
    }

    public override fun toNative(obj: SearchSuggestionCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
