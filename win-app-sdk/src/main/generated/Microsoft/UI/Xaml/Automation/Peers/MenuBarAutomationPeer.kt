package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IMenuBarAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.MenuBar
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

@ABIMarker(MenuBarAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.MenuBarAutomationPeer;{ae96e710-b9d3-59dd-973e-1bbc86cf0afc})")
@WinRTByReference(brClass = MenuBarAutomationPeer.ByReference::class)
public open class MenuBarAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMenuBarAutomationPeer.WithDefault, IWinRTObject {
  private val __1034781930_Interface: IMenuBarAutomationPeer.WithDefault by lazy {
    as_1034781930()
  }


  public override val __1034781930_Ptr: JNAPointer? by lazy {
    __1034781930_Interface.__1034781930_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1034781930_Interface)

  public constructor(owner: MenuBar) : this(ABI.activate(owner))

  private fun as_1034781930(): IMenuBarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMenuBarAutomationPeer.ABI.makeIMenuBarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBarAutomationPeer.ABI.makeIMenuBarAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuBarAutomationPeer> {
    public override fun getValue() = MenuBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MenuBarAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBarAutomationPeer, MemoryAddress> {
    public val IMenuBarAutomationPeerFactory_Instance: IMenuBarAutomationPeerFactory by lazy {
      createIMenuBarAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarAutomationPeerFactory(): IMenuBarAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.MenuBarAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarAutomationPeerFactory.ABI.makeIMenuBarAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MenuBar): JNAPointer? =
        IMenuBarAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBarAutomationPeer {
      val address = segment.toRawLongValue()
      return MenuBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MenuBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
