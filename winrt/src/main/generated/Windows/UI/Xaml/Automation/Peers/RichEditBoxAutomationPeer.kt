package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IRichEditBoxAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.RichEditBox
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

@ABIMarker(RichEditBoxAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.RichEditBoxAutomationPeer;{c69f5c04-16ee-467a-a833-c3da8458ad64})")
@WinRTByReference(brClass = RichEditBoxAutomationPeer.ByReference::class)
public open class RichEditBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRichEditBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __1989142950_Interface: IRichEditBoxAutomationPeer.WithDefault by lazy {
    as_1989142950()
  }


  public override val __1989142950_Ptr: JNAPointer? by lazy {
    __1989142950_Interface.__1989142950_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1989142950_Interface)

  public constructor(owner: RichEditBox) : this(ABI.activate(owner))

  private fun as_1989142950(): IRichEditBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBoxAutomationPeer.ABI.makeIRichEditBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBoxAutomationPeer.ABI.makeIRichEditBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditBoxAutomationPeer> {
    public override fun getValue() = RichEditBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RichEditBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBoxAutomationPeer, MemoryAddress> {
    public val IRichEditBoxAutomationPeerFactory_Instance: IRichEditBoxAutomationPeerFactory by
        lazy {
      createIRichEditBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRichEditBoxAutomationPeerFactory(): IRichEditBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.RichEditBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRichEditBoxAutomationPeerFactory.ABI.makeIRichEditBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RichEditBox): JNAPointer? =
        IRichEditBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RichEditBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return RichEditBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RichEditBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
