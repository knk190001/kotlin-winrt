package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITabViewAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.TabView
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

@ABIMarker(TabViewAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TabViewAutomationPeer;{efb3f05b-2a25-5266-a1cb-5a0aa451ca32})")
@WinRTByReference(brClass = TabViewAutomationPeer.ByReference::class)
public open class TabViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITabViewAutomationPeer.WithDefault, IWinRTObject {
  private val __387926032_Interface: ITabViewAutomationPeer.WithDefault by lazy {
    as_387926032()
  }


  public override val __387926032_Ptr: JNAPointer? by lazy {
    __387926032_Interface.__387926032_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__387926032_Interface)

  public constructor(owner: TabView) : this(ABI.activate(owner))

  private fun as_387926032(): ITabViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITabViewAutomationPeer.ABI.makeITabViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewAutomationPeer.ABI.makeITabViewAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewAutomationPeer> {
    public override fun getValue() = TabViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TabViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewAutomationPeer, MemoryAddress> {
    public val ITabViewAutomationPeerFactory_Instance: ITabViewAutomationPeerFactory by lazy {
      createITabViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewAutomationPeerFactory(): ITabViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TabViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewAutomationPeerFactory.ABI.makeITabViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TabView): JNAPointer? =
        ITabViewAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabViewAutomationPeer {
      val address = segment.toRawLongValue()
      return TabViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TabViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
