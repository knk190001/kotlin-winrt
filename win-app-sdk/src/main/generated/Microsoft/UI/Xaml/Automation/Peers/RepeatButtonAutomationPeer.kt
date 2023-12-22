package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRepeatButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IInvokeProvider
import Microsoft.UI.Xaml.Controls.Primitives.RepeatButton
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

@ABIMarker(RepeatButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RepeatButtonAutomationPeer;{e42a7cc2-ace8-56eb-9967-9b7fd157c37f})")
@WinRTByReference(brClass = RepeatButtonAutomationPeer.ByReference::class)
public open class RepeatButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonBaseAutomationPeer(ptr), IRepeatButtonAutomationPeer.WithDefault,
    IInvokeProvider.WithDefault, IWinRTObject {
  private val __1900153033_Interface: IRepeatButtonAutomationPeer.WithDefault by lazy {
    as_1900153033()
  }


  private val __840579670_Interface: IInvokeProvider.WithDefault by lazy {
    as_840579670()
  }


  public override val __1900153033_Ptr: JNAPointer? by lazy {
    __1900153033_Interface.__1900153033_Ptr
  }


  public override val __840579670_Ptr: JNAPointer? by lazy {
    __840579670_Interface.__840579670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1900153033_Interface, __840579670_Interface)

  public constructor(owner: RepeatButton) : this(ABI.activate(owner))

  private fun as_1900153033(): IRepeatButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRepeatButtonAutomationPeer.ABI.makeIRepeatButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeatButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeatButtonAutomationPeer.ABI.makeIRepeatButtonAutomationPeer(ref.value))
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
      IByReference<RepeatButtonAutomationPeer> {
    public override fun getValue() = RepeatButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RepeatButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeatButtonAutomationPeer, MemoryAddress> {
    public val IRepeatButtonAutomationPeerFactory_Instance: IRepeatButtonAutomationPeerFactory by
        lazy {
      createIRepeatButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRepeatButtonAutomationPeerFactory(): IRepeatButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RepeatButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRepeatButtonAutomationPeerFactory.ABI.makeIRepeatButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RepeatButton): JNAPointer? =
        IRepeatButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RepeatButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return RepeatButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RepeatButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
