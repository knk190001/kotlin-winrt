package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IFlipViewItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.FlipViewItem
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

@ABIMarker(FlipViewItemAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.FlipViewItemAutomationPeer;{c83034de-fa08-4bd3-aeb2-d2e5bfa04df9})")
@WinRTByReference(brClass = FlipViewItemAutomationPeer.ByReference::class)
public open class FlipViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IFlipViewItemAutomationPeer.WithDefault, IWinRTObject {
  private val __1214638570_Interface: IFlipViewItemAutomationPeer.WithDefault by lazy {
    as_1214638570()
  }


  public override val __1214638570_Ptr: JNAPointer? by lazy {
    __1214638570_Interface.__1214638570_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1214638570_Interface)

  public constructor(owner: FlipViewItem) : this(ABI.activate(owner))

  private fun as_1214638570(): IFlipViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IFlipViewItemAutomationPeer.ABI.makeIFlipViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipViewItemAutomationPeer.ABI.makeIFlipViewItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlipViewItemAutomationPeer> {
    public override fun getValue() = FlipViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: FlipViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipViewItemAutomationPeer, MemoryAddress> {
    public val IFlipViewItemAutomationPeerFactory_Instance: IFlipViewItemAutomationPeerFactory by
        lazy {
      createIFlipViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewItemAutomationPeerFactory(): IFlipViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.FlipViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlipViewItemAutomationPeerFactory.ABI.makeIFlipViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: FlipViewItem): JNAPointer? =
        IFlipViewItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlipViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return FlipViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: FlipViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
