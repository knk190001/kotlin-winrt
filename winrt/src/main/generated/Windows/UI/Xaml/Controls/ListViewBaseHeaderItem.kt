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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ListViewBaseHeaderItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListViewBaseHeaderItem;{6d0ded27-0d19-4091-8917-ce7c85c1e630})")
@WinRTByReference(brClass = ListViewBaseHeaderItem.ByReference::class)
public open class ListViewBaseHeaderItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IListViewBaseHeaderItem.WithDefault, IWinRTObject {
  private val __699599024_Interface: IListViewBaseHeaderItem.WithDefault by lazy {
    as_699599024()
  }


  public override val __699599024_Ptr: JNAPointer? by lazy {
    __699599024_Interface.__699599024_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__699599024_Interface)

  private fun as_699599024(): IListViewBaseHeaderItem.WithDefault {
    if(pointer == NULL) {
      return(IListViewBaseHeaderItem.ABI.makeIListViewBaseHeaderItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewBaseHeaderItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewBaseHeaderItem.ABI.makeIListViewBaseHeaderItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewBaseHeaderItem> {
    public override fun getValue() = ListViewBaseHeaderItem(pointer.getPointer(0))

    public fun setValue(value: ListViewBaseHeaderItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewBaseHeaderItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListViewBaseHeaderItem {
      val address = segment.toRawLongValue()
      return ListViewBaseHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: ListViewBaseHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
