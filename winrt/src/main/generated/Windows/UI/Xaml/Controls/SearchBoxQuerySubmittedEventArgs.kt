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

@ABIMarker(SearchBoxQuerySubmittedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SearchBoxQuerySubmittedEventArgs;{126e90fd-3c4e-4ccb-9aef-4705d19fe548})")
@WinRTByReference(brClass = SearchBoxQuerySubmittedEventArgs.ByReference::class)
public class SearchBoxQuerySubmittedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchBoxQuerySubmittedEventArgs.WithDefault, IWinRTObject {
  private val __77684829_Interface: ISearchBoxQuerySubmittedEventArgs.WithDefault by lazy {
    as_77684829()
  }


  public override val __77684829_Ptr: JNAPointer? by lazy {
    __77684829_Interface.__77684829_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__77684829_Interface)

  private fun as_77684829(): ISearchBoxQuerySubmittedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchBoxQuerySubmittedEventArgs.ABI.makeISearchBoxQuerySubmittedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchBoxQuerySubmittedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchBoxQuerySubmittedEventArgs.ABI.makeISearchBoxQuerySubmittedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchBoxQuerySubmittedEventArgs> {
    public override fun getValue() = SearchBoxQuerySubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchBoxQuerySubmittedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchBoxQuerySubmittedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchBoxQuerySubmittedEventArgs {
      val address = segment.toRawLongValue()
      return SearchBoxQuerySubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchBoxQuerySubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
