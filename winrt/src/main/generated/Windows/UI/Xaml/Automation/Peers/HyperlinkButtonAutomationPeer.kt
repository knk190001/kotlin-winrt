package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IHyperlinkButtonAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IInvokeProvider
import Windows.UI.Xaml.Controls.HyperlinkButton
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

@ABIMarker(HyperlinkButtonAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.HyperlinkButtonAutomationPeer;{aa7afcb1-0edf-46d9-aa9e-0eb21d140097})")
@WinRTByReference(brClass = HyperlinkButtonAutomationPeer.ByReference::class)
public open class HyperlinkButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonBaseAutomationPeer(ptr), IHyperlinkButtonAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IWinRTObject {
  private val __351231161_Interface: IHyperlinkButtonAutomationPeer.WithDefault by lazy {
    as_351231161()
  }


  private val __907541087_Interface: IInvokeProvider.WithDefault by lazy {
    as_907541087()
  }


  public override val __351231161_Ptr: JNAPointer? by lazy {
    __351231161_Interface.__351231161_Ptr
  }


  public override val __907541087_Ptr: JNAPointer? by lazy {
    __907541087_Interface.__907541087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__351231161_Interface, __907541087_Interface)

  public constructor(owner: HyperlinkButton) : this(ABI.activate(owner))

  private fun as_351231161(): IHyperlinkButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IHyperlinkButtonAutomationPeer.ABI.makeIHyperlinkButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlinkButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlinkButtonAutomationPeer.ABI.makeIHyperlinkButtonAutomationPeer(ref.value))
  }

  private fun as_907541087(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HyperlinkButtonAutomationPeer> {
    public override fun getValue() = HyperlinkButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: HyperlinkButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HyperlinkButtonAutomationPeer, MemoryAddress> {
    public val IHyperlinkButtonAutomationPeerFactory_Instance: IHyperlinkButtonAutomationPeerFactory
        by lazy {
      createIHyperlinkButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHyperlinkButtonAutomationPeerFactory():
        IHyperlinkButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.HyperlinkButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHyperlinkButtonAutomationPeerFactory.ABI.makeIHyperlinkButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: HyperlinkButton): JNAPointer? =
        IHyperlinkButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HyperlinkButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return HyperlinkButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: HyperlinkButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
