package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Automation.Peers.FrameworkElementAutomationPeer
import Windows.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Windows.UI.Xaml.Automation.Provider.IToggleProvider
import Windows.UI.Xaml.Controls.IToggleSplitButtonAutomationPeerFactory.ABI.IID
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

@ABIMarker(ToggleSplitButtonAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ToggleSplitButtonAutomationPeer;{538e61de-7d46-5da7-94ab-acede6a12b9e})")
@WinRTByReference(brClass = ToggleSplitButtonAutomationPeer.ByReference::class)
public open class ToggleSplitButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IToggleSplitButtonAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IToggleProvider.WithDefault, IWinRTObject {
  private val __2001155221_Interface: IToggleSplitButtonAutomationPeer.WithDefault by lazy {
    as_2001155221()
  }


  private val __1930365296_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1930365296()
  }


  private val __1185800317_Interface: IToggleProvider.WithDefault by lazy {
    as_1185800317()
  }


  public override val __2001155221_Ptr: JNAPointer? by lazy {
    __2001155221_Interface.__2001155221_Ptr
  }


  public override val __1930365296_Ptr: JNAPointer? by lazy {
    __1930365296_Interface.__1930365296_Ptr
  }


  public override val __1185800317_Ptr: JNAPointer? by lazy {
    __1185800317_Interface.__1185800317_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2001155221_Interface, __1930365296_Interface, __1185800317_Interface)

  public constructor(owner: ToggleSplitButton) : this(ABI.activate(owner))

  private fun as_2001155221(): IToggleSplitButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IToggleSplitButtonAutomationPeer.ABI.makeIToggleSplitButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSplitButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSplitButtonAutomationPeer.ABI.makeIToggleSplitButtonAutomationPeer(ref.value))
  }

  private fun as_1930365296(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  private fun as_1185800317(): IToggleProvider.WithDefault {
    if(pointer == NULL) {
      return(IToggleProvider.ABI.makeIToggleProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleProvider.ABI.makeIToggleProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleSplitButtonAutomationPeer> {
    public override fun getValue() = ToggleSplitButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ToggleSplitButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSplitButtonAutomationPeer, MemoryAddress> {
    public val IToggleSplitButtonAutomationPeerFactory_Instance:
        IToggleSplitButtonAutomationPeerFactory by lazy {
      createIToggleSplitButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleSplitButtonAutomationPeerFactory():
        IToggleSplitButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ToggleSplitButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleSplitButtonAutomationPeerFactory.ABI.makeIToggleSplitButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ToggleSplitButton): JNAPointer? =
        IToggleSplitButtonAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleSplitButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return ToggleSplitButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ToggleSplitButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
