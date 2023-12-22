package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IRichTextBlockAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.RichTextBlock
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

@ABIMarker(RichTextBlockAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.RichTextBlockAutomationPeer;{7080ff80-b3b8-5d3c-89b5-d989d561192f})")
@WinRTByReference(brClass = RichTextBlockAutomationPeer.ByReference::class)
public open class RichTextBlockAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRichTextBlockAutomationPeer.WithDefault, IWinRTObject {
  private val __540052774_Interface: IRichTextBlockAutomationPeer.WithDefault by lazy {
    as_540052774()
  }


  public override val __540052774_Ptr: JNAPointer? by lazy {
    __540052774_Interface.__540052774_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__540052774_Interface)

  public constructor(owner: RichTextBlock) : this(ABI.activate(owner))

  private fun as_540052774(): IRichTextBlockAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockAutomationPeer.ABI.makeIRichTextBlockAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockAutomationPeer.ABI.makeIRichTextBlockAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichTextBlockAutomationPeer> {
    public override fun getValue() = RichTextBlockAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RichTextBlockAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichTextBlockAutomationPeer, MemoryAddress> {
    public val IRichTextBlockAutomationPeerFactory_Instance: IRichTextBlockAutomationPeerFactory by
        lazy {
      createIRichTextBlockAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRichTextBlockAutomationPeerFactory(): IRichTextBlockAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.RichTextBlockAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRichTextBlockAutomationPeerFactory.ABI.makeIRichTextBlockAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RichTextBlock): JNAPointer? =
        IRichTextBlockAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RichTextBlockAutomationPeer {
      val address = segment.toRawLongValue()
      return RichTextBlockAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RichTextBlockAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
