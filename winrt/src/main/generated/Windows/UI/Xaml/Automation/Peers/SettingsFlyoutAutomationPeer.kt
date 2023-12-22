package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ISettingsFlyoutAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.SettingsFlyout
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

@ABIMarker(SettingsFlyoutAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.SettingsFlyoutAutomationPeer;{d0de0cdb-30cf-47a6-a5eb-9c77f0b0d6dd})")
@WinRTByReference(brClass = SettingsFlyoutAutomationPeer.ByReference::class)
public open class SettingsFlyoutAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ISettingsFlyoutAutomationPeer.WithDefault, IWinRTObject {
  private val __810229103_Interface: ISettingsFlyoutAutomationPeer.WithDefault by lazy {
    as_810229103()
  }


  public override val __810229103_Ptr: JNAPointer? by lazy {
    __810229103_Interface.__810229103_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__810229103_Interface)

  public constructor(owner: SettingsFlyout) : this(ABI.activate(owner))

  private fun as_810229103(): ISettingsFlyoutAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISettingsFlyoutAutomationPeer.ABI.makeISettingsFlyoutAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsFlyoutAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsFlyoutAutomationPeer.ABI.makeISettingsFlyoutAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SettingsFlyoutAutomationPeer> {
    public override fun getValue() = SettingsFlyoutAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SettingsFlyoutAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsFlyoutAutomationPeer, MemoryAddress> {
    public val ISettingsFlyoutAutomationPeerFactory_Instance: ISettingsFlyoutAutomationPeerFactory
        by lazy {
      createISettingsFlyoutAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISettingsFlyoutAutomationPeerFactory(): ISettingsFlyoutAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.SettingsFlyoutAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISettingsFlyoutAutomationPeerFactory.ABI.makeISettingsFlyoutAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: SettingsFlyout): JNAPointer? =
        ISettingsFlyoutAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SettingsFlyoutAutomationPeer {
      val address = segment.toRawLongValue()
      return SettingsFlyoutAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SettingsFlyoutAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
