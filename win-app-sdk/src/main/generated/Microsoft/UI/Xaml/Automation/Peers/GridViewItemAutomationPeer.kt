package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IGridViewItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.GridViewItem
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

@ABIMarker(GridViewItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.GridViewItemAutomationPeer;{de249c2e-5419-5798-b625-cd2c05307572})")
@WinRTByReference(brClass = GridViewItemAutomationPeer.ByReference::class)
public open class GridViewItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IGridViewItemAutomationPeer.WithDefault, IWinRTObject {
  private val __1422438630_Interface: IGridViewItemAutomationPeer.WithDefault by lazy {
    as_1422438630()
  }


  public override val __1422438630_Ptr: JNAPointer? by lazy {
    __1422438630_Interface.__1422438630_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1422438630_Interface)

  public constructor(owner: GridViewItem) : this(ABI.activate(owner))

  private fun as_1422438630(): IGridViewItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IGridViewItemAutomationPeer.ABI.makeIGridViewItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewItemAutomationPeer.ABI.makeIGridViewItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridViewItemAutomationPeer> {
    public override fun getValue() = GridViewItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: GridViewItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewItemAutomationPeer, MemoryAddress> {
    public val IGridViewItemAutomationPeerFactory_Instance: IGridViewItemAutomationPeerFactory by
        lazy {
      createIGridViewItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewItemAutomationPeerFactory(): IGridViewItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.GridViewItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewItemAutomationPeerFactory.ABI.makeIGridViewItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: GridViewItem): JNAPointer? =
        IGridViewItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewItemAutomationPeer {
      val address = segment.toRawLongValue()
      return GridViewItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: GridViewItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
