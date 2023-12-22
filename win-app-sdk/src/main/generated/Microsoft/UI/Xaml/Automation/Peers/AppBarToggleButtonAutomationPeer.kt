package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IAppBarToggleButtonAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.AppBarToggleButton
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

@ABIMarker(AppBarToggleButtonAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AppBarToggleButtonAutomationPeer;{17d28eb5-4635-5e2d-af01-8dcd23a608c4})")
@WinRTByReference(brClass = AppBarToggleButtonAutomationPeer.ByReference::class)
public open class AppBarToggleButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ToggleButtonAutomationPeer(ptr), IAppBarToggleButtonAutomationPeer.WithDefault, IWinRTObject {
  private val __121723500_Interface: IAppBarToggleButtonAutomationPeer.WithDefault by lazy {
    as_121723500()
  }


  public override val __121723500_Ptr: JNAPointer? by lazy {
    __121723500_Interface.__121723500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__121723500_Interface)

  public constructor(owner: AppBarToggleButton) : this(ABI.activate(owner))

  private fun as_121723500(): IAppBarToggleButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButtonAutomationPeer.ABI.makeIAppBarToggleButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButtonAutomationPeer.ABI.makeIAppBarToggleButtonAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarToggleButtonAutomationPeer> {
    public override fun getValue() = AppBarToggleButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AppBarToggleButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarToggleButtonAutomationPeer, MemoryAddress> {
    public val IAppBarToggleButtonAutomationPeerFactory_Instance:
        IAppBarToggleButtonAutomationPeerFactory by lazy {
      createIAppBarToggleButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarToggleButtonAutomationPeerFactory():
        IAppBarToggleButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AppBarToggleButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarToggleButtonAutomationPeerFactory.ABI.makeIAppBarToggleButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: AppBarToggleButton): JNAPointer? =
        IAppBarToggleButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarToggleButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return AppBarToggleButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AppBarToggleButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
