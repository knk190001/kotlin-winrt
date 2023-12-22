package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IComboBoxItemDataAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IScrollItemProvider
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ComboBoxItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ComboBoxItemDataAutomationPeer;{4fef6df2-289c-4c04-831b-5a668c6d7104})")
@WinRTByReference(brClass = ComboBoxItemDataAutomationPeer.ByReference::class)
public open class ComboBoxItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorItemAutomationPeer(ptr), IComboBoxItemDataAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, IWinRTObject {
  private val __1305593931_Interface: IComboBoxItemDataAutomationPeer.WithDefault by lazy {
    as_1305593931()
  }


  private val __8885417_Interface: IScrollItemProvider.WithDefault by lazy {
    as_8885417()
  }


  public override val __1305593931_Ptr: JNAPointer? by lazy {
    __1305593931_Interface.__1305593931_Ptr
  }


  public override val __8885417_Ptr: JNAPointer? by lazy {
    __8885417_Interface.__8885417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1305593931_Interface, __8885417_Interface)

  public constructor(item: IUnknown, parent: ComboBoxAutomationPeer) : this(ABI.activate(item,
      parent))

  private fun as_1305593931(): IComboBoxItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxItemDataAutomationPeer.ABI.makeIComboBoxItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxItemDataAutomationPeer.ABI.makeIComboBoxItemDataAutomationPeer(ref.value))
  }

  private fun as_8885417(): IScrollItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollItemProvider.ABI.makeIScrollItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollItemProvider.ABI.makeIScrollItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComboBoxItemDataAutomationPeer> {
    public override fun getValue() = ComboBoxItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ComboBoxItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxItemDataAutomationPeer, MemoryAddress> {
    public val IComboBoxItemDataAutomationPeerFactory_Instance:
        IComboBoxItemDataAutomationPeerFactory by lazy {
      createIComboBoxItemDataAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxItemDataAutomationPeerFactory():
        IComboBoxItemDataAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ComboBoxItemDataAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxItemDataAutomationPeerFactory.ABI.makeIComboBoxItemDataAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(item: IUnknown, parent: ComboBoxAutomationPeer): JNAPointer? =
        IComboBoxItemDataAutomationPeerFactory_Instance.CreateInstanceWithParentAndItem(item,
        parent, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBoxItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return ComboBoxItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
