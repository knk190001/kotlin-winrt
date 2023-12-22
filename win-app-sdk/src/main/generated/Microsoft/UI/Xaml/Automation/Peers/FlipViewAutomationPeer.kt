package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IFlipViewAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.FlipView
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

@ABIMarker(FlipViewAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.FlipViewAutomationPeer;{9f2901ea-23cb-5cac-87d4-7fa9c7ffbc60})")
@WinRTByReference(brClass = FlipViewAutomationPeer.ByReference::class)
public open class FlipViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), IFlipViewAutomationPeer.WithDefault, IWinRTObject {
  private val __89109902_Interface: IFlipViewAutomationPeer.WithDefault by lazy {
    as_89109902()
  }


  public override val __89109902_Ptr: JNAPointer? by lazy {
    __89109902_Interface.__89109902_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__89109902_Interface)

  public constructor(owner: FlipView) : this(ABI.activate(owner))

  private fun as_89109902(): IFlipViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IFlipViewAutomationPeer.ABI.makeIFlipViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipViewAutomationPeer.ABI.makeIFlipViewAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlipViewAutomationPeer> {
    public override fun getValue() = FlipViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: FlipViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipViewAutomationPeer, MemoryAddress> {
    public val IFlipViewAutomationPeerFactory_Instance: IFlipViewAutomationPeerFactory by lazy {
      createIFlipViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewAutomationPeerFactory(): IFlipViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.FlipViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlipViewAutomationPeerFactory.ABI.makeIFlipViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: FlipView): JNAPointer? =
        IFlipViewAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlipViewAutomationPeer {
      val address = segment.toRawLongValue()
      return FlipViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: FlipViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
