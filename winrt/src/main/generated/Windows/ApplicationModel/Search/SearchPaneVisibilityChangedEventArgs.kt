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

@ABIMarker(SearchPaneVisibilityChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs;{3c4d3046-ac4b-49f2-97d6-020e6182cb9c})")
@WinRTByReference(brClass = SearchPaneVisibilityChangedEventArgs.ByReference::class)
public class SearchPaneVisibilityChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneVisibilityChangedEventArgs.WithDefault, IWinRTObject {
  private val __755126532_Interface: ISearchPaneVisibilityChangedEventArgs.WithDefault by lazy {
    as_755126532()
  }


  public override val __755126532_Ptr: JNAPointer? by lazy {
    __755126532_Interface.__755126532_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__755126532_Interface)

  private fun as_755126532(): ISearchPaneVisibilityChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneVisibilityChangedEventArgs.ABI.makeISearchPaneVisibilityChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneVisibilityChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneVisibilityChangedEventArgs.ABI.makeISearchPaneVisibilityChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneVisibilityChangedEventArgs> {
    public override fun getValue() = SearchPaneVisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchPaneVisibilityChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneVisibilityChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneVisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return SearchPaneVisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneVisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
