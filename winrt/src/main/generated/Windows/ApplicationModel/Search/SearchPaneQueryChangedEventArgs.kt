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

@ABIMarker(SearchPaneQueryChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs;{3c064fe9-2351-4248-a529-7110f464a785})")
@WinRTByReference(brClass = SearchPaneQueryChangedEventArgs.ByReference::class)
public class SearchPaneQueryChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneQueryChangedEventArgs.WithDefault, IWinRTObject {
  private val __947647164_Interface: ISearchPaneQueryChangedEventArgs.WithDefault by lazy {
    as_947647164()
  }


  public override val __947647164_Ptr: JNAPointer? by lazy {
    __947647164_Interface.__947647164_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__947647164_Interface)

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
      IByReference<SearchPaneQueryChangedEventArgs> {
    public override fun getValue() = SearchPaneQueryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchPaneQueryChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneQueryChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneQueryChangedEventArgs {
      val address = segment.toRawLongValue()
      return SearchPaneQueryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneQueryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
