package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IListViewFactory.ABI.IID
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

@ABIMarker(ListView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListView;{f6ce8c6d-fe96-41ad-a64a-c2b81c4af7f8})")
@WinRTByReference(brClass = ListView.ByReference::class)
public open class ListView(
  ptr: JNAPointer? = NULL
) : ListViewBase(ptr), IListView.WithDefault, IWinRTObject {
  private val __856973439_Interface: IListView.WithDefault by lazy {
    as_856973439()
  }


  public override val __856973439_Ptr: JNAPointer? by lazy {
    __856973439_Interface.__856973439_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__856973439_Interface)

  public constructor() : this(ABI.activate())

  private fun as_856973439(): IListView.WithDefault {
    if(pointer == NULL) {
      return(IListView.ABI.makeIListView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListView.ABI.makeIListView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ListView> {
    public override fun getValue() = ListView(pointer.getPointer(0))

    public fun setValue(value: ListView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListView, MemoryAddress> {
    public val IListViewFactory_Instance: IListViewFactory by lazy {
      createIListViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewFactory(): IListViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListViewFactory.ABI.makeIListViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListView {
      val address = segment.toRawLongValue()
      return ListView(Pointer(address))
    }

    public override fun toNative(obj: ListView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
