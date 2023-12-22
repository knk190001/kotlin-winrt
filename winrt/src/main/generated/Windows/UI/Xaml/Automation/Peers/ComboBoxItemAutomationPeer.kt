package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IComboBoxItemAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ComboBoxItem
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

@ABIMarker(ComboBoxItemAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ComboBoxItemAutomationPeer;{12ddc76e-9552-446a-82ee-938cc371800f})")
@WinRTByReference(brClass = ComboBoxItemAutomationPeer.ByReference::class)
public open class ComboBoxItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IComboBoxItemAutomationPeer.WithDefault, IWinRTObject {
  private val __833450497_Interface: IComboBoxItemAutomationPeer.WithDefault by lazy {
    as_833450497()
  }


  public override val __833450497_Ptr: JNAPointer? by lazy {
    __833450497_Interface.__833450497_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__833450497_Interface)

  public constructor(owner: ComboBoxItem) : this(ABI.activate(owner))

  private fun as_833450497(): IComboBoxItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxItemAutomationPeer.ABI.makeIComboBoxItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxItemAutomationPeer.ABI.makeIComboBoxItemAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComboBoxItemAutomationPeer> {
    public override fun getValue() = ComboBoxItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ComboBoxItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxItemAutomationPeer, MemoryAddress> {
    public val IComboBoxItemAutomationPeerFactory_Instance: IComboBoxItemAutomationPeerFactory by
        lazy {
      createIComboBoxItemAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxItemAutomationPeerFactory(): IComboBoxItemAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ComboBoxItemAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxItemAutomationPeerFactory.ABI.makeIComboBoxItemAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ComboBoxItem): JNAPointer? =
        IComboBoxItemAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBoxItemAutomationPeer {
      val address = segment.toRawLongValue()
      return ComboBoxItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
