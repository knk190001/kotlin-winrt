package Windows.UI.Xaml.Controls

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

@ABIMarker(SearchBoxSuggestionsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SearchBoxSuggestionsRequestedEventArgs;{da15170e-e566-48cb-bd11-fe4b0f30a44d})")
@WinRTByReference(brClass = SearchBoxSuggestionsRequestedEventArgs.ByReference::class)
public class SearchBoxSuggestionsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchBoxSuggestionsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __462475535_Interface: ISearchBoxSuggestionsRequestedEventArgs.WithDefault by lazy {
    as_462475535()
  }


  public override val __462475535_Ptr: JNAPointer? by lazy {
    __462475535_Interface.__462475535_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__462475535_Interface)

  private fun as_462475535(): ISearchBoxSuggestionsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchBoxSuggestionsRequestedEventArgs.ABI.makeISearchBoxSuggestionsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchBoxSuggestionsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchBoxSuggestionsRequestedEventArgs.ABI.makeISearchBoxSuggestionsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchBoxSuggestionsRequestedEventArgs> {
    public override fun getValue() = SearchBoxSuggestionsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchBoxSuggestionsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchBoxSuggestionsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchBoxSuggestionsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return SearchBoxSuggestionsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchBoxSuggestionsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
