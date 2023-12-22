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

@ABIMarker(SearchPaneSuggestionsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs;{c89b8a2f-ac56-4460-8d2f-80023bec4fc5})")
@WinRTByReference(brClass = SearchPaneSuggestionsRequestedEventArgs.ByReference::class)
public class SearchPaneSuggestionsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneSuggestionsRequestedEventArgs.WithDefault,
    ISearchPaneQueryChangedEventArgs.WithDefault, IWinRTObject {
  private val __1620740401_Interface: ISearchPaneSuggestionsRequestedEventArgs.WithDefault by lazy {
    as_1620740401()
  }


  private val __947647164_Interface: ISearchPaneQueryChangedEventArgs.WithDefault by lazy {
    as_947647164()
  }


  public override val __1620740401_Ptr: JNAPointer? by lazy {
    __1620740401_Interface.__1620740401_Ptr
  }


  public override val __947647164_Ptr: JNAPointer? by lazy {
    __947647164_Interface.__947647164_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1620740401_Interface, __947647164_Interface)

  private fun as_1620740401(): ISearchPaneSuggestionsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneSuggestionsRequestedEventArgs.ABI.makeISearchPaneSuggestionsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneSuggestionsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneSuggestionsRequestedEventArgs.ABI.makeISearchPaneSuggestionsRequestedEventArgs(ref.value))
  }

  private fun as_947647164(): ISearchPaneQueryChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneQueryChangedEventArgs.ABI.makeISearchPaneQueryChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneQueryChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneQueryChangedEventArgs.ABI.makeISearchPaneQueryChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneSuggestionsRequestedEventArgs> {
    public override fun getValue() = SearchPaneSuggestionsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchPaneSuggestionsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneSuggestionsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SearchPaneSuggestionsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return SearchPaneSuggestionsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneSuggestionsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
