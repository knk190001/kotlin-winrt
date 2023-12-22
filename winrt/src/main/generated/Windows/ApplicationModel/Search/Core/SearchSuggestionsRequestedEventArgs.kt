package Windows.ApplicationModel.Search.Core

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

@ABIMarker(SearchSuggestionsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs;{6fd519e5-9e7e-4ab4-8be3-c76b1bd4344a})")
@WinRTByReference(brClass = SearchSuggestionsRequestedEventArgs.ByReference::class)
public class SearchSuggestionsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchSuggestionsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1003869694_Interface: ISearchSuggestionsRequestedEventArgs.WithDefault by lazy {
    as_1003869694()
  }


  public override val __1003869694_Ptr: JNAPointer? by lazy {
    __1003869694_Interface.__1003869694_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1003869694_Interface)

  private fun as_1003869694(): ISearchSuggestionsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchSuggestionsRequestedEventArgs.ABI.makeISearchSuggestionsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchSuggestionsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchSuggestionsRequestedEventArgs.ABI.makeISearchSuggestionsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchSuggestionsRequestedEventArgs> {
    public override fun getValue() = SearchSuggestionsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchSuggestionsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchSuggestionsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchSuggestionsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return SearchSuggestionsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchSuggestionsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
