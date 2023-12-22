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

@ABIMarker(SearchPaneQueryLinguisticDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails;{82fb460e-0940-4b6d-b8d0-642b30989e15})")
@WinRTByReference(brClass = SearchPaneQueryLinguisticDetails.ByReference::class)
public class SearchPaneQueryLinguisticDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneQueryLinguisticDetails.WithDefault, IWinRTObject {
  private val __459543460_Interface: ISearchPaneQueryLinguisticDetails.WithDefault by lazy {
    as_459543460()
  }


  public override val __459543460_Ptr: JNAPointer? by lazy {
    __459543460_Interface.__459543460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__459543460_Interface)

  private fun as_459543460(): ISearchPaneQueryLinguisticDetails.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneQueryLinguisticDetails.ABI.makeISearchPaneQueryLinguisticDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneQueryLinguisticDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneQueryLinguisticDetails.ABI.makeISearchPaneQueryLinguisticDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneQueryLinguisticDetails> {
    public override fun getValue() = SearchPaneQueryLinguisticDetails(pointer.getPointer(0))

    public fun setValue(value: SearchPaneQueryLinguisticDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneQueryLinguisticDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneQueryLinguisticDetails {
      val address = segment.toRawLongValue()
      return SearchPaneQueryLinguisticDetails(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneQueryLinguisticDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
