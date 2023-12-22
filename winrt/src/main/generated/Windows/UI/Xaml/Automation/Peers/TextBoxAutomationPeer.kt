package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ITextBoxAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.TextBox
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

@ABIMarker(TextBoxAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.TextBoxAutomationPeer;{3a4f1ca0-5e5d-4d26-9067-e740bf657a9f})")
@WinRTByReference(brClass = TextBoxAutomationPeer.ByReference::class)
public open class TextBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITextBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __1696725087_Interface: ITextBoxAutomationPeer.WithDefault by lazy {
    as_1696725087()
  }


  public override val __1696725087_Ptr: JNAPointer? by lazy {
    __1696725087_Interface.__1696725087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1696725087_Interface)

  public constructor(owner: TextBox) : this(ABI.activate(owner))

  private fun as_1696725087(): ITextBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxAutomationPeer.ABI.makeITextBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxAutomationPeer.ABI.makeITextBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextBoxAutomationPeer> {
    public override fun getValue() = TextBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TextBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBoxAutomationPeer, MemoryAddress> {
    public val ITextBoxAutomationPeerFactory_Instance: ITextBoxAutomationPeerFactory by lazy {
      createITextBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextBoxAutomationPeerFactory(): ITextBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.TextBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextBoxAutomationPeerFactory.ABI.makeITextBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TextBox): JNAPointer? =
        ITextBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return TextBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TextBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
