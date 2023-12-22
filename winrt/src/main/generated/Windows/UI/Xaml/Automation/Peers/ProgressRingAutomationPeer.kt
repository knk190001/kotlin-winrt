package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IProgressRingAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ProgressRing
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

@ABIMarker(ProgressRingAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ProgressRingAutomationPeer;{bc305eee-39d3-4eeb-ac33-2394de123e2e})")
@WinRTByReference(brClass = ProgressRingAutomationPeer.ByReference::class)
public open class ProgressRingAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IProgressRingAutomationPeer.WithDefault, IWinRTObject {
  private val __1824626478_Interface: IProgressRingAutomationPeer.WithDefault by lazy {
    as_1824626478()
  }


  public override val __1824626478_Ptr: JNAPointer? by lazy {
    __1824626478_Interface.__1824626478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1824626478_Interface)

  public constructor(owner: ProgressRing) : this(ABI.activate(owner))

  private fun as_1824626478(): IProgressRingAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IProgressRingAutomationPeer.ABI.makeIProgressRingAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressRingAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressRingAutomationPeer.ABI.makeIProgressRingAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProgressRingAutomationPeer> {
    public override fun getValue() = ProgressRingAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ProgressRingAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressRingAutomationPeer, MemoryAddress> {
    public val IProgressRingAutomationPeerFactory_Instance: IProgressRingAutomationPeerFactory by
        lazy {
      createIProgressRingAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProgressRingAutomationPeerFactory(): IProgressRingAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ProgressRingAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProgressRingAutomationPeerFactory.ABI.makeIProgressRingAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ProgressRing): JNAPointer? =
        IProgressRingAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProgressRingAutomationPeer {
      val address = segment.toRawLongValue()
      return ProgressRingAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ProgressRingAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
