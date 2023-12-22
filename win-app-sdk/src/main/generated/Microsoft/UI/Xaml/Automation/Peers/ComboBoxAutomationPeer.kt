package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IComboBoxAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Automation.Provider.IValueProvider
import Microsoft.UI.Xaml.Automation.Provider.IWindowProvider
import Microsoft.UI.Xaml.Controls.ComboBox
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

@ABIMarker(ComboBoxAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ComboBoxAutomationPeer;{459d2245-1fd2-5dda-822c-bed13df6776b})")
@WinRTByReference(brClass = ComboBoxAutomationPeer.ByReference::class)
public open class ComboBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : SelectorAutomationPeer(ptr), IComboBoxAutomationPeer.WithDefault, IValueProvider.WithDefault,
    IExpandCollapseProvider.WithDefault, IWindowProvider.WithDefault, IWinRTObject {
  private val __145473273_Interface: IComboBoxAutomationPeer.WithDefault by lazy {
    as_145473273()
  }


  private val __1118783765_Interface: IValueProvider.WithDefault by lazy {
    as_1118783765()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  private val __2118179278_Interface: IWindowProvider.WithDefault by lazy {
    as_2118179278()
  }


  public override val __145473273_Ptr: JNAPointer? by lazy {
    __145473273_Interface.__145473273_Ptr
  }


  public override val __1118783765_Ptr: JNAPointer? by lazy {
    __1118783765_Interface.__1118783765_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val __2118179278_Ptr: JNAPointer? by lazy {
    __2118179278_Interface.__2118179278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145473273_Interface, __1118783765_Interface, __1578214981_Interface,
        __2118179278_Interface)

  public constructor(owner: ComboBox) : this(ABI.activate(owner))

  private fun as_145473273(): IComboBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxAutomationPeer.ABI.makeIComboBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxAutomationPeer.ABI.makeIComboBoxAutomationPeer(ref.value))
  }

  private fun as_1118783765(): IValueProvider.WithDefault {
    if(pointer == NULL) {
      return(IValueProvider.ABI.makeIValueProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValueProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValueProvider.ABI.makeIValueProvider(ref.value))
  }

  private fun as_1578214981(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  private fun as_2118179278(): IWindowProvider.WithDefault {
    if(pointer == NULL) {
      return(IWindowProvider.ABI.makeIWindowProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowProvider.ABI.makeIWindowProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComboBoxAutomationPeer> {
    public override fun getValue() = ComboBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ComboBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxAutomationPeer, MemoryAddress> {
    public val IComboBoxAutomationPeerFactory_Instance: IComboBoxAutomationPeerFactory by lazy {
      createIComboBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxAutomationPeerFactory(): IComboBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ComboBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxAutomationPeerFactory.ABI.makeIComboBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ComboBox): JNAPointer? =
        IComboBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return ComboBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
