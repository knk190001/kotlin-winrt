package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ITextBlockAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.TextBlock
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

@ABIMarker(TextBlockAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.TextBlockAutomationPeer;{be2057f5-6715-4e69-a050-92bd0ce232a9})")
@WinRTByReference(brClass = TextBlockAutomationPeer.ByReference::class)
public open class TextBlockAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITextBlockAutomationPeer.WithDefault, IWinRTObject {
  private val __905901855_Interface: ITextBlockAutomationPeer.WithDefault by lazy {
    as_905901855()
  }


  public override val __905901855_Ptr: JNAPointer? by lazy {
    __905901855_Interface.__905901855_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__905901855_Interface)

  public constructor(owner: TextBlock) : this(ABI.activate(owner))

  private fun as_905901855(): ITextBlockAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITextBlockAutomationPeer.ABI.makeITextBlockAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBlockAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBlockAutomationPeer.ABI.makeITextBlockAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextBlockAutomationPeer> {
    public override fun getValue() = TextBlockAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TextBlockAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBlockAutomationPeer, MemoryAddress> {
    public val ITextBlockAutomationPeerFactory_Instance: ITextBlockAutomationPeerFactory by lazy {
      createITextBlockAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextBlockAutomationPeerFactory(): ITextBlockAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.TextBlockAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextBlockAutomationPeerFactory.ABI.makeITextBlockAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TextBlock): JNAPointer? =
        ITextBlockAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextBlockAutomationPeer {
      val address = segment.toRawLongValue()
      return TextBlockAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TextBlockAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
