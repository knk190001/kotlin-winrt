package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IListBoxAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ListBox
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

@ABIMarker(ListBoxAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ListBoxAutomationPeer;{8cd0d608-b402-4a6e-bd9a-343f8845eb32})")
@WinRTByReference(brClass = ListBoxAutomationPeer.ByReference::class)
public open class ListBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), IListBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __1701987058_Interface: IListBoxAutomationPeer.WithDefault by lazy {
    as_1701987058()
  }


  public override val __1701987058_Ptr: JNAPointer? by lazy {
    __1701987058_Interface.__1701987058_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1701987058_Interface)

  public constructor(owner: ListBox) : this(ABI.activate(owner))

  private fun as_1701987058(): IListBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IListBoxAutomationPeer.ABI.makeIListBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBoxAutomationPeer.ABI.makeIListBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListBoxAutomationPeer> {
    public override fun getValue() = ListBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ListBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListBoxAutomationPeer, MemoryAddress> {
    public val IListBoxAutomationPeerFactory_Instance: IListBoxAutomationPeerFactory by lazy {
      createIListBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListBoxAutomationPeerFactory(): IListBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ListBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListBoxAutomationPeerFactory.ABI.makeIListBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ListBox): JNAPointer? =
        IListBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return ListBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ListBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
