package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IButtonBaseAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ButtonBase
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

@ABIMarker(ButtonBaseAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ButtonBaseAutomationPeer;{7a88a2d8-f8dd-5526-8a40-e2e3888193bf})")
@WinRTByReference(brClass = ButtonBaseAutomationPeer.ByReference::class)
public open class ButtonBaseAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IButtonBaseAutomationPeer.WithDefault, IWinRTObject {
  private val __1311905921_Interface: IButtonBaseAutomationPeer.WithDefault by lazy {
    as_1311905921()
  }


  public override val __1311905921_Ptr: JNAPointer? by lazy {
    __1311905921_Interface.__1311905921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1311905921_Interface)

  public constructor(owner: ButtonBase) : this(ABI.activate(owner))

  private fun as_1311905921(): IButtonBaseAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IButtonBaseAutomationPeer.ABI.makeIButtonBaseAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButtonBaseAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButtonBaseAutomationPeer.ABI.makeIButtonBaseAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ButtonBaseAutomationPeer> {
    public override fun getValue() = ButtonBaseAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ButtonBaseAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ButtonBaseAutomationPeer, MemoryAddress> {
    public val IButtonBaseAutomationPeerFactory_Instance: IButtonBaseAutomationPeerFactory by lazy {
      createIButtonBaseAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIButtonBaseAutomationPeerFactory(): IButtonBaseAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ButtonBaseAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IButtonBaseAutomationPeerFactory.ABI.makeIButtonBaseAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ButtonBase): JNAPointer? =
        IButtonBaseAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ButtonBaseAutomationPeer {
      val address = segment.toRawLongValue()
      return ButtonBaseAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ButtonBaseAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
