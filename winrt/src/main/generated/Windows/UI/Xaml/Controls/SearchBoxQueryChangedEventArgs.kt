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

@ABIMarker(SearchBoxQueryChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SearchBoxQueryChangedEventArgs;{a9a70f8f-0cb0-4bd2-9998-2fb57ad5e731})")
@WinRTByReference(brClass = SearchBoxQueryChangedEventArgs.ByReference::class)
public class SearchBoxQueryChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchBoxQueryChangedEventArgs.WithDefault, IWinRTObject {
  private val __775582468_Interface: ISearchBoxQueryChangedEventArgs.WithDefault by lazy {
    as_775582468()
  }


  public override val __775582468_Ptr: JNAPointer? by lazy {
    __775582468_Interface.__775582468_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__775582468_Interface)

  private fun as_775582468(): ISearchBoxQueryChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchBoxQueryChangedEventArgs.ABI.makeISearchBoxQueryChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchBoxQueryChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchBoxQueryChangedEventArgs.ABI.makeISearchBoxQueryChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchBoxQueryChangedEventArgs> {
    public override fun getValue() = SearchBoxQueryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchBoxQueryChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchBoxQueryChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchBoxQueryChangedEventArgs {
      val address = segment.toRawLongValue()
      return SearchBoxQueryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchBoxQueryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
