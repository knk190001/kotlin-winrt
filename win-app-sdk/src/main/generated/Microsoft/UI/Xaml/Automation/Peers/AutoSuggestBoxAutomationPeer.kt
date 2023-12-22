package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IAutoSuggestBoxAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Controls.AutoSuggestBox
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

@ABIMarker(AutoSuggestBoxAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AutoSuggestBoxAutomationPeer;{695236fc-0021-5936-bdf9-ed5991db0d52})")
@WinRTByReference(brClass = AutoSuggestBoxAutomationPeer.ByReference::class)
public class AutoSuggestBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IAutoSuggestBoxAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IWinRTObject {
  private val __974350930_Interface: IAutoSuggestBoxAutomationPeer.WithDefault by lazy {
    as_974350930()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __974350930_Ptr: JNAPointer? by lazy {
    __974350930_Interface.__974350930_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__974350930_Interface, __840579670_Interface)

  public constructor(owner: AutoSuggestBox) : this(ABI.activate(owner))

  private fun as_974350930(): IAutoSuggestBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBoxAutomationPeer.ABI.makeIAutoSuggestBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBoxAutomationPeer.ABI.makeIAutoSuggestBoxAutomationPeer(ref.value))
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
      IByReference<AutoSuggestBoxAutomationPeer> {
    public override fun getValue() = AutoSuggestBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AutoSuggestBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoSuggestBoxAutomationPeer, MemoryAddress> {
    public val IAutoSuggestBoxAutomationPeerFactory_Instance: IAutoSuggestBoxAutomationPeerFactory
        by lazy {
      createIAutoSuggestBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutoSuggestBoxAutomationPeerFactory(): IAutoSuggestBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AutoSuggestBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAutoSuggestBoxAutomationPeerFactory.ABI.makeIAutoSuggestBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: AutoSuggestBox): JNAPointer? =
        IAutoSuggestBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner)?.pointer

    public override fun fromNative(segment: MemoryAddress): AutoSuggestBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return AutoSuggestBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AutoSuggestBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
