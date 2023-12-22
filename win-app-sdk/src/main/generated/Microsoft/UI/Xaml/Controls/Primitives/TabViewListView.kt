package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ListView
import Microsoft.UI.Xaml.Controls.Primitives.ITabViewListViewFactory.ABI.IID
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

@ABIMarker(TabViewListView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.TabViewListView;{ec48efb5-2cb3-562b-921c-e554923ce1d5})")
@WinRTByReference(brClass = TabViewListView.ByReference::class)
public open class TabViewListView(
  ptr: JNAPointer? = NULL
) : ListView(ptr), ITabViewListView.WithDefault, IWinRTObject {
  private val __2110679532_Interface: ITabViewListView.WithDefault by lazy {
    as_2110679532()
  }


  public override val __2110679532_Ptr: JNAPointer? by lazy {
    __2110679532_Interface.__2110679532_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2110679532_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2110679532(): ITabViewListView.WithDefault {
    if(pointer == NULL) {
      return(ITabViewListView.ABI.makeITabViewListView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewListView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewListView.ABI.makeITabViewListView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewListView> {
    public override fun getValue() = TabViewListView(pointer.getPointer(0))

    public fun setValue(value: TabViewListView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewListView, MemoryAddress> {
    public val ITabViewListViewFactory_Instance: ITabViewListViewFactory by lazy {
      createITabViewListViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewListViewFactory(): ITabViewListViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.TabViewListView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewListViewFactory.ABI.makeITabViewListViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITabViewListViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabViewListView {
      val address = segment.toRawLongValue()
      return TabViewListView(Pointer(address))
    }

    public override fun toNative(obj: TabViewListView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
