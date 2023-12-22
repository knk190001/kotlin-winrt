package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IListViewHeaderItemFactory.ABI.IID
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

@ABIMarker(ListViewHeaderItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListViewHeaderItem;{1b61baeb-e196-4b3b-a5f9-1ed636f3f79b})")
@WinRTByReference(brClass = ListViewHeaderItem.ByReference::class)
public open class ListViewHeaderItem(
  ptr: JNAPointer? = NULL
) : ListViewBaseHeaderItem(ptr), IListViewHeaderItem.WithDefault, IWinRTObject {
  private val __147018465_Interface: IListViewHeaderItem.WithDefault by lazy {
    as_147018465()
  }


  public override val __147018465_Ptr: JNAPointer? by lazy {
    __147018465_Interface.__147018465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__147018465_Interface)

  public constructor() : this(ABI.activate())

  private fun as_147018465(): IListViewHeaderItem.WithDefault {
    if(pointer == NULL) {
      return(IListViewHeaderItem.ABI.makeIListViewHeaderItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewHeaderItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewHeaderItem.ABI.makeIListViewHeaderItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewHeaderItem> {
    public override fun getValue() = ListViewHeaderItem(pointer.getPointer(0))

    public fun setValue(value: ListViewHeaderItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewHeaderItem, MemoryAddress> {
    public val IListViewHeaderItemFactory_Instance: IListViewHeaderItemFactory by lazy {
      createIListViewHeaderItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewHeaderItemFactory(): IListViewHeaderItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewHeaderItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewHeaderItemFactory.ABI.makeIListViewHeaderItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListViewHeaderItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListViewHeaderItem {
      val address = segment.toRawLongValue()
      return ListViewHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: ListViewHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
