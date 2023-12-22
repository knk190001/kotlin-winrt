package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ISearchBoxAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.SearchBox
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

@ABIMarker(SearchBoxAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.SearchBoxAutomationPeer;{854011a4-18a6-4f30-939b-8871afa3f5e9})")
@WinRTByReference(brClass = SearchBoxAutomationPeer.ByReference::class)
public open class SearchBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ISearchBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __191132860_Interface: ISearchBoxAutomationPeer.WithDefault by lazy {
    as_191132860()
  }


  public override val __191132860_Ptr: JNAPointer? by lazy {
    __191132860_Interface.__191132860_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__191132860_Interface)

  public constructor(owner: SearchBox) : this(ABI.activate(owner))

  private fun as_191132860(): ISearchBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISearchBoxAutomationPeer.ABI.makeISearchBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchBoxAutomationPeer.ABI.makeISearchBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchBoxAutomationPeer> {
    public override fun getValue() = SearchBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SearchBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchBoxAutomationPeer, MemoryAddress> {
    public val ISearchBoxAutomationPeerFactory_Instance: ISearchBoxAutomationPeerFactory by lazy {
      createISearchBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISearchBoxAutomationPeerFactory(): ISearchBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.SearchBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISearchBoxAutomationPeerFactory.ABI.makeISearchBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: SearchBox): JNAPointer? =
        ISearchBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SearchBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return SearchBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SearchBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
