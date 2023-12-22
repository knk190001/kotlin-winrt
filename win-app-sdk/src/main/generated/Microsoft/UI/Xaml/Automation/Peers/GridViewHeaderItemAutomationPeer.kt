package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IGridViewHeaderItemAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.GridViewHeaderItem
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

@ABIMarker(GridViewHeaderItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.GridViewHeaderItemAutomationPeer;{c38af4b0-2757-569b-bdc7-a5b7b74ffdba})")
@WinRTByReference(brClass = GridViewHeaderItemAutomationPeer.ByReference::class)
public open class GridViewHeaderItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewBaseHeaderItemAutomationPeer(ptr), IGridViewHeaderItemAutomationPeer.WithDefault,
    IWinRTObject {
  private val __690486777_Interface: IGridViewHeaderItemAutomationPeer.WithDefault by lazy {
    as_690486777()
  }


  public override val __690486777_Ptr: JNAPointer? by lazy {
    __690486777_Interface.__690486777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__690486777_Interface)

  public constructor(owner: GridViewHeaderItem) : this(ABI.activate(owner))

  private fun as_690486777(): IGridViewHeaderItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IGridViewHeaderItemAutomationPeer.ABI.makeIGridViewHeaderItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewHeaderItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewHeaderItemAutomationPeer.ABI.makeIGridViewHeaderItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridViewHeaderItemAutomationPeer> {
    public override fun getValue() = GridViewHeaderItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: GridViewHeaderItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewHeaderItemAutomationPeer, MemoryAddress> {
    public val IGridViewHeaderItemAutomationPeerFactory_Instance:
        IGridViewHeaderItemAutomationPeerFactory by lazy {
      createIGridViewHeaderItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewHeaderItemAutomationPeerFactory():
        IGridViewHeaderItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.GridViewHeaderItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewHeaderItemAutomationPeerFactory.ABI.makeIGridViewHeaderItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: GridViewHeaderItem): JNAPointer? =
        IGridViewHeaderItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewHeaderItemAutomationPeer {
      val address = segment.toRawLongValue()
      return GridViewHeaderItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: GridViewHeaderItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
