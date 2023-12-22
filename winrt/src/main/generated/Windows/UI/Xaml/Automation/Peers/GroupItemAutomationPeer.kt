package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IGroupItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.GroupItem
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

@ABIMarker(GroupItemAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.GroupItemAutomationPeer;{1914fe6d-0740-4236-9ee1-38cf19c1c388})")
@WinRTByReference(brClass = GroupItemAutomationPeer.ByReference::class)
public open class GroupItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IGroupItemAutomationPeer.WithDefault, IWinRTObject {
  private val __1868528691_Interface: IGroupItemAutomationPeer.WithDefault by lazy {
    as_1868528691()
  }


  public override val __1868528691_Ptr: JNAPointer? by lazy {
    __1868528691_Interface.__1868528691_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1868528691_Interface)

  public constructor(owner: GroupItem) : this(ABI.activate(owner))

  private fun as_1868528691(): IGroupItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IGroupItemAutomationPeer.ABI.makeIGroupItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupItemAutomationPeer.ABI.makeIGroupItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GroupItemAutomationPeer> {
    public override fun getValue() = GroupItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: GroupItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GroupItemAutomationPeer, MemoryAddress> {
    public val IGroupItemAutomationPeerFactory_Instance: IGroupItemAutomationPeerFactory by lazy {
      createIGroupItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGroupItemAutomationPeerFactory(): IGroupItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.GroupItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGroupItemAutomationPeerFactory.ABI.makeIGroupItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: GroupItem): JNAPointer? =
        IGroupItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GroupItemAutomationPeer {
      val address = segment.toRawLongValue()
      return GroupItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: GroupItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
