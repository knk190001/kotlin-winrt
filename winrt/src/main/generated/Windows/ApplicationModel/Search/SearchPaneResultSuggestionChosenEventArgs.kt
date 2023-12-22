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

@ABIMarker(SearchPaneResultSuggestionChosenEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs;{c8316cc0-aed2-41e0-bce0-c26ca74f85ec})")
@WinRTByReference(brClass = SearchPaneResultSuggestionChosenEventArgs.ByReference::class)
public class SearchPaneResultSuggestionChosenEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneResultSuggestionChosenEventArgs.WithDefault, IWinRTObject {
  private val __1350054365_Interface: ISearchPaneResultSuggestionChosenEventArgs.WithDefault by
      lazy {
    as_1350054365()
  }


  public override val __1350054365_Ptr: JNAPointer? by lazy {
    __1350054365_Interface.__1350054365_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1350054365_Interface)

  private fun as_1350054365(): ISearchPaneResultSuggestionChosenEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneResultSuggestionChosenEventArgs.ABI.makeISearchPaneResultSuggestionChosenEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneResultSuggestionChosenEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneResultSuggestionChosenEventArgs.ABI.makeISearchPaneResultSuggestionChosenEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneResultSuggestionChosenEventArgs> {
    public override fun getValue() =
        SearchPaneResultSuggestionChosenEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchPaneResultSuggestionChosenEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneResultSuggestionChosenEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SearchPaneResultSuggestionChosenEventArgs {
      val address = segment.toRawLongValue()
      return SearchPaneResultSuggestionChosenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneResultSuggestionChosenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
