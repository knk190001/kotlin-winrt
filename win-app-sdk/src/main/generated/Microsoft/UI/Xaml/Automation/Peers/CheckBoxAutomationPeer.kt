package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ICheckBoxAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.CheckBox
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

@ABIMarker(CheckBoxAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.CheckBoxAutomationPeer;{9b449814-2c1a-5bdc-9524-1df91c06e992})")
@WinRTByReference(brClass = CheckBoxAutomationPeer.ByReference::class)
public open class CheckBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : ToggleButtonAutomationPeer(ptr), ICheckBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __785460927_Interface: ICheckBoxAutomationPeer.WithDefault by lazy {
    as_785460927()
  }


  public override val __785460927_Ptr: JNAPointer? by lazy {
    __785460927_Interface.__785460927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__785460927_Interface)

  public constructor(owner: CheckBox) : this(ABI.activate(owner))

  private fun as_785460927(): ICheckBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ICheckBoxAutomationPeer.ABI.makeICheckBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICheckBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICheckBoxAutomationPeer.ABI.makeICheckBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CheckBoxAutomationPeer> {
    public override fun getValue() = CheckBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: CheckBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CheckBoxAutomationPeer, MemoryAddress> {
    public val ICheckBoxAutomationPeerFactory_Instance: ICheckBoxAutomationPeerFactory by lazy {
      createICheckBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICheckBoxAutomationPeerFactory(): ICheckBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.CheckBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICheckBoxAutomationPeerFactory.ABI.makeICheckBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: CheckBox): JNAPointer? =
        ICheckBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CheckBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return CheckBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: CheckBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
