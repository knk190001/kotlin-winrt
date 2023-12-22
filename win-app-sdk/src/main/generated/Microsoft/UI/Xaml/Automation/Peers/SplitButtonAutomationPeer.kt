package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ISplitButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Controls.SplitButton
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

@ABIMarker(SplitButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.SplitButtonAutomationPeer;{0182661c-0df3-5c7d-8752-547804c4fa44})")
@WinRTByReference(brClass = SplitButtonAutomationPeer.ByReference::class)
public open class SplitButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ISplitButtonAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IInvokeProvider.WithDefault, IWinRTObject {
  private val __1096700194_Interface: ISplitButtonAutomationPeer.WithDefault by lazy {
    as_1096700194()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __1096700194_Ptr: JNAPointer? by lazy {
    __1096700194_Interface.__1096700194_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1096700194_Interface, __1578214981_Interface, __840579670_Interface)

  public constructor(owner: SplitButton) : this(ABI.activate(owner))

  private fun as_1096700194(): ISplitButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISplitButtonAutomationPeer.ABI.makeISplitButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitButtonAutomationPeer.ABI.makeISplitButtonAutomationPeer(ref.value))
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

  private fun as_840579670(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplitButtonAutomationPeer> {
    public override fun getValue() = SplitButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SplitButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitButtonAutomationPeer, MemoryAddress> {
    public val ISplitButtonAutomationPeerFactory_Instance: ISplitButtonAutomationPeerFactory by
        lazy {
      createISplitButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISplitButtonAutomationPeerFactory(): ISplitButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.SplitButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISplitButtonAutomationPeerFactory.ABI.makeISplitButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: SplitButton): JNAPointer? =
        ISplitButtonAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SplitButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return SplitButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SplitButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
