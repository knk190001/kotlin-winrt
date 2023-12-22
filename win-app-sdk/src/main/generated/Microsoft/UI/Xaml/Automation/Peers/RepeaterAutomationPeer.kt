package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRepeaterAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.ItemsRepeater
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

@ABIMarker(RepeaterAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RepeaterAutomationPeer;{03f2c315-fb55-54b2-9aad-9723aaf5e2cf})")
@WinRTByReference(brClass = RepeaterAutomationPeer.ByReference::class)
public open class RepeaterAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRepeaterAutomationPeer.WithDefault, IWinRTObject {
  private val __1563912732_Interface: IRepeaterAutomationPeer.WithDefault by lazy {
    as_1563912732()
  }


  public override val __1563912732_Ptr: JNAPointer? by lazy {
    __1563912732_Interface.__1563912732_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1563912732_Interface)

  public constructor(owner: ItemsRepeater) : this(ABI.activate(owner))

  private fun as_1563912732(): IRepeaterAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRepeaterAutomationPeer.ABI.makeIRepeaterAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeaterAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeaterAutomationPeer.ABI.makeIRepeaterAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepeaterAutomationPeer> {
    public override fun getValue() = RepeaterAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RepeaterAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeaterAutomationPeer, MemoryAddress> {
    public val IRepeaterAutomationPeerFactory_Instance: IRepeaterAutomationPeerFactory by lazy {
      createIRepeaterAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRepeaterAutomationPeerFactory(): IRepeaterAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RepeaterAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRepeaterAutomationPeerFactory.ABI.makeIRepeaterAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ItemsRepeater): JNAPointer? =
        IRepeaterAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RepeaterAutomationPeer {
      val address = segment.toRawLongValue()
      return RepeaterAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RepeaterAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
