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

@ABIMarker(SearchPaneSuggestionsRequestDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral;{a0d009f7-8748-4ee2-ad44-afa6be997c51})")
@WinRTByReference(brClass = SearchPaneSuggestionsRequestDeferral.ByReference::class)
public class SearchPaneSuggestionsRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPaneSuggestionsRequestDeferral.WithDefault, IWinRTObject {
  private val __493358514_Interface: ISearchPaneSuggestionsRequestDeferral.WithDefault by lazy {
    as_493358514()
  }


  public override val __493358514_Ptr: JNAPointer? by lazy {
    __493358514_Interface.__493358514_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__493358514_Interface)

  private fun as_493358514(): ISearchPaneSuggestionsRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(ISearchPaneSuggestionsRequestDeferral.ABI.makeISearchPaneSuggestionsRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPaneSuggestionsRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPaneSuggestionsRequestDeferral.ABI.makeISearchPaneSuggestionsRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchPaneSuggestionsRequestDeferral> {
    public override fun getValue() = SearchPaneSuggestionsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: SearchPaneSuggestionsRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPaneSuggestionsRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchPaneSuggestionsRequestDeferral {
      val address = segment.toRawLongValue()
      return SearchPaneSuggestionsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: SearchPaneSuggestionsRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
