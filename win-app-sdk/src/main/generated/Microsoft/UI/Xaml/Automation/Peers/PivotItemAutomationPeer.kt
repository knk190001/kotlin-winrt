package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IPivotItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.PivotItem
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

@ABIMarker(PivotItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.PivotItemAutomationPeer;{bfe7fb7b-2d88-56e4-b50f-0a40de6f52a1})")
@WinRTByReference(brClass = PivotItemAutomationPeer.ByReference::class)
public class PivotItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IPivotItemAutomationPeer.WithDefault, IWinRTObject {
  private val __1761959893_Interface: IPivotItemAutomationPeer.WithDefault by lazy {
    as_1761959893()
  }


  public override val __1761959893_Ptr: JNAPointer? by lazy {
    __1761959893_Interface.__1761959893_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1761959893_Interface)

  public constructor(owner: PivotItem) : this(ABI.activate(owner))

  private fun as_1761959893(): IPivotItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPivotItemAutomationPeer.ABI.makeIPivotItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotItemAutomationPeer.ABI.makeIPivotItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotItemAutomationPeer> {
    public override fun getValue() = PivotItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PivotItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotItemAutomationPeer, MemoryAddress> {
    public val IPivotItemAutomationPeerFactory_Instance: IPivotItemAutomationPeerFactory by lazy {
      createIPivotItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotItemAutomationPeerFactory(): IPivotItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.PivotItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotItemAutomationPeerFactory.ABI.makeIPivotItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: PivotItem): JNAPointer? =
        IPivotItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner)?.pointer

    public override fun fromNative(segment: MemoryAddress): PivotItemAutomationPeer {
      val address = segment.toRawLongValue()
      return PivotItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PivotItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
