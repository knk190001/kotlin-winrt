package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRichTextBlockOverflowAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.RichTextBlockOverflow
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

@ABIMarker(RichTextBlockOverflowAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RichTextBlockOverflowAutomationPeer;{d0bf83c0-8cfb-5770-b26c-0706e51a9a3b})")
@WinRTByReference(brClass = RichTextBlockOverflowAutomationPeer.ByReference::class)
public open class RichTextBlockOverflowAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRichTextBlockOverflowAutomationPeer.WithDefault,
    IWinRTObject {
  private val __1541437052_Interface: IRichTextBlockOverflowAutomationPeer.WithDefault by lazy {
    as_1541437052()
  }


  public override val __1541437052_Ptr: JNAPointer? by lazy {
    __1541437052_Interface.__1541437052_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1541437052_Interface)

  public constructor(owner: RichTextBlockOverflow) : this(ABI.activate(owner))

  private fun as_1541437052(): IRichTextBlockOverflowAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockOverflowAutomationPeer.ABI.makeIRichTextBlockOverflowAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockOverflowAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockOverflowAutomationPeer.ABI.makeIRichTextBlockOverflowAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichTextBlockOverflowAutomationPeer> {
    public override fun getValue() = RichTextBlockOverflowAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RichTextBlockOverflowAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichTextBlockOverflowAutomationPeer, MemoryAddress> {
    public val IRichTextBlockOverflowAutomationPeerFactory_Instance:
        IRichTextBlockOverflowAutomationPeerFactory by lazy {
      createIRichTextBlockOverflowAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRichTextBlockOverflowAutomationPeerFactory():
        IRichTextBlockOverflowAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RichTextBlockOverflowAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRichTextBlockOverflowAutomationPeerFactory.ABI.makeIRichTextBlockOverflowAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RichTextBlockOverflow): JNAPointer? =
        IRichTextBlockOverflowAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RichTextBlockOverflowAutomationPeer {
      val address = segment.toRawLongValue()
      return RichTextBlockOverflowAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RichTextBlockOverflowAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
