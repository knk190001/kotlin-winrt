package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IDropDownButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Microsoft.UI.Xaml.Controls.DropDownButton
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

@ABIMarker(DropDownButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.DropDownButtonAutomationPeer;{7dc37dec-0a0a-5c98-8a6f-9e47dbab2f82})")
@WinRTByReference(brClass = DropDownButtonAutomationPeer.ByReference::class)
public open class DropDownButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonAutomationPeer(ptr), IDropDownButtonAutomationPeer.WithDefault,
    IExpandCollapseProvider.WithDefault, IWinRTObject {
  private val __1235095455_Interface: IDropDownButtonAutomationPeer.WithDefault by lazy {
    as_1235095455()
  }


  private val __1578214981_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1578214981()
  }


  public override val __1235095455_Ptr: JNAPointer? by lazy {
    __1235095455_Interface.__1235095455_Ptr
  }


  public override val __1578214981_Ptr: JNAPointer? by lazy {
    __1578214981_Interface.__1578214981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1235095455_Interface, __1578214981_Interface)

  public constructor(owner: DropDownButton) : this(ABI.activate(owner))

  private fun as_1235095455(): IDropDownButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IDropDownButtonAutomationPeer.ABI.makeIDropDownButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropDownButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropDownButtonAutomationPeer.ABI.makeIDropDownButtonAutomationPeer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DropDownButtonAutomationPeer> {
    public override fun getValue() = DropDownButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: DropDownButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropDownButtonAutomationPeer, MemoryAddress> {
    public val IDropDownButtonAutomationPeerFactory_Instance: IDropDownButtonAutomationPeerFactory
        by lazy {
      createIDropDownButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDropDownButtonAutomationPeerFactory(): IDropDownButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.DropDownButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDropDownButtonAutomationPeerFactory.ABI.makeIDropDownButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: DropDownButton): JNAPointer? =
        IDropDownButtonAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DropDownButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return DropDownButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: DropDownButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
