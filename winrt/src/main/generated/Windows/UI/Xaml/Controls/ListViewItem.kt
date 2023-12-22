package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IListViewItemFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.SelectorItem
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(ListViewItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListViewItem;{b7bb4305-3dd9-43de-a8c0-c472f085bc11})")
@WinRTByReference(brClass = ListViewItem.ByReference::class)
public open class ListViewItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IListViewItem.WithDefault, IWinRTObject {
  private val __653985742_Interface: IListViewItem.WithDefault by lazy {
    as_653985742()
  }


  public override val __653985742_Ptr: JNAPointer? by lazy {
    __653985742_Interface.__653985742_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__653985742_Interface)

  public constructor() : this(ABI.activate())

  private fun as_653985742(): IListViewItem.WithDefault {
    if(pointer == NULL) {
      return(IListViewItem.ABI.makeIListViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItem.ABI.makeIListViewItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ListViewItem> {
    public override fun getValue() = ListViewItem(pointer.getPointer(0))

    public fun setValue(value: ListViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItem, MemoryAddress> {
    public val IListViewItemFactory_Instance: IListViewItemFactory by lazy {
      createIListViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewItemFactory(): IListViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewItemFactory.ABI.makeIListViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewItem {
      val address = segment.toRawLongValue()
      return ListViewItem(Pointer(address))
    }

    public override fun toNative(obj: ListViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
