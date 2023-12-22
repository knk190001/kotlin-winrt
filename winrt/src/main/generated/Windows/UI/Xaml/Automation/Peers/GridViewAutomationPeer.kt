package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IGridViewAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.GridView
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

@ABIMarker(GridViewAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.GridViewAutomationPeer;{1c4401a4-d951-49ca-8f82-c7f3c60681b0})")
@WinRTByReference(brClass = GridViewAutomationPeer.ByReference::class)
public open class GridViewAutomationPeer(
  ptr: JNAPointer? = NULL
) : ListViewBaseAutomationPeer(ptr), IGridViewAutomationPeer.WithDefault, IWinRTObject {
  private val __1535322044_Interface: IGridViewAutomationPeer.WithDefault by lazy {
    as_1535322044()
  }


  public override val __1535322044_Ptr: JNAPointer? by lazy {
    __1535322044_Interface.__1535322044_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1535322044_Interface)

  public constructor(owner: GridView) : this(ABI.activate(owner))

  private fun as_1535322044(): IGridViewAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IGridViewAutomationPeer.ABI.makeIGridViewAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewAutomationPeer.ABI.makeIGridViewAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridViewAutomationPeer> {
    public override fun getValue() = GridViewAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: GridViewAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewAutomationPeer, MemoryAddress> {
    public val IGridViewAutomationPeerFactory_Instance: IGridViewAutomationPeerFactory by lazy {
      createIGridViewAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewAutomationPeerFactory(): IGridViewAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.GridViewAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewAutomationPeerFactory.ABI.makeIGridViewAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: GridView): JNAPointer? =
        IGridViewAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewAutomationPeer {
      val address = segment.toRawLongValue()
      return GridViewAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: GridViewAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
