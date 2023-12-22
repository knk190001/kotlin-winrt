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

@ABIMarker(SearchPaneQuerySubmittedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs;{143ba4fc-e9c5-4736-91b2-e8eb9cb88356})")
@WinRTByReference(brClass = SearchPaneQuerySubmittedEventArgs.ByReference::class)
public class SearchPaneQuerySubmittedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneQuerySubmittedEventArgs.WithDefault,
    ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails.WithDefault, IWinRTObject {
  private val __1911384733_Interface: ISearchPaneQuerySubmittedEventArgs.WithDefault by lazy {
    as_1911384733()
  }


  private val __1760541574_Interface:
      ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails.WithDefault by lazy {
    as_1760541574()
  }


  public override val __1911384733_Ptr: JNAPointer? by lazy {
    __1911384733_Interface.__1911384733_Ptr
  }


  public override val __1760541574_Ptr: JNAPointer? by lazy {
    __1760541574_Interface.__1760541574_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1911384733_Interface, __1760541574_Interface)

  private fun as_1911384733(): ISearchPaneQuerySubmittedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneQuerySubmittedEventArgs.ABI.makeISearchPaneQuerySubmittedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneQuerySubmittedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneQuerySubmittedEventArgs.ABI.makeISearchPaneQuerySubmittedEventArgs(ref.value))
  }

  private fun as_1760541574(): ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails.ABI.makeISearchPaneQuerySubmittedEventArgsWithLinguisticDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneQuerySubmittedEventArgsWithLinguisticDetails.ABI.makeISearchPaneQuerySubmittedEventArgsWithLinguisticDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneQuerySubmittedEventArgs> {
    public override fun getValue() = SearchPaneQuerySubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchPaneQuerySubmittedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneQuerySubmittedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneQuerySubmittedEventArgs {
      val address = segment.toRawLongValue()
      return SearchPaneQuerySubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneQuerySubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
