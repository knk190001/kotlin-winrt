package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IExpanderAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Controls.Expander
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

@ABIMarker(ExpanderAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ExpanderAutomationPeer;{f7527408-cc89-5b65-bbde-eae6d66dc3e5})")
@WinRTByReference(brClass = ExpanderAutomationPeer.ByReference::class)
public open class ExpanderAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IExpanderAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __2004445411_Interface: IExpanderAutomationPeer.WithDefault by lazy {
    as_2004445411()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  public override val __2004445411_Ptr: JNAPointer? by lazy {
    __2004445411_Interface.__2004445411_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2004445411_Interface, __1578214981_Interface)

  public constructor(owner: Expander) : this(ABI.activate(owner))

  private fun as_2004445411(): IExpanderAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IExpanderAutomationPeer.ABI.makeIExpanderAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpanderAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpanderAutomationPeer.ABI.makeIExpanderAutomationPeer(ref.value))
  }

  private fun as_1578214981(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpanderAutomationPeer> {
    public override fun getValue() = ExpanderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ExpanderAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpanderAutomationPeer, MemoryAddress> {
    public val IExpanderAutomationPeerFactory_Instance: IExpanderAutomationPeerFactory by lazy {
      createIExpanderAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpanderAutomationPeerFactory(): IExpanderAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ExpanderAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IExpanderAutomationPeerFactory.ABI.makeIExpanderAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Expander): JNAPointer? =
        IExpanderAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ExpanderAutomationPeer {
      val address = segment.toRawLongValue()
      return ExpanderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ExpanderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
