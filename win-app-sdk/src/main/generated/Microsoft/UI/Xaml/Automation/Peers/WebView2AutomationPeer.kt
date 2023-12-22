package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IWebView2AutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.WebView2
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

@ABIMarker(WebView2AutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.WebView2AutomationPeer;{8e556eca-b000-5e51-810f-7b7d80c39d56})")
@WinRTByReference(brClass = WebView2AutomationPeer.ByReference::class)
public open class WebView2AutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IWebView2AutomationPeer.WithDefault, IWinRTObject {
  private val __1536286677_Interface: IWebView2AutomationPeer.WithDefault by lazy {
    as_1536286677()
  }


  public override val __1536286677_Ptr: JNAPointer? by lazy {
    __1536286677_Interface.__1536286677_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536286677_Interface)

  public constructor(owner: WebView2) : this(ABI.activate(owner))

  private fun as_1536286677(): IWebView2AutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IWebView2AutomationPeer.ABI.makeIWebView2AutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView2AutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView2AutomationPeer.ABI.makeIWebView2AutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebView2AutomationPeer> {
    public override fun getValue() = WebView2AutomationPeer(pointer.getPointer(0))

    public fun setValue(value: WebView2AutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebView2AutomationPeer, MemoryAddress> {
    public val IWebView2AutomationPeerFactory_Instance: IWebView2AutomationPeerFactory by lazy {
      createIWebView2AutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebView2AutomationPeerFactory(): IWebView2AutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.WebView2AutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebView2AutomationPeerFactory.ABI.makeIWebView2AutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: WebView2): JNAPointer? =
        IWebView2AutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebView2AutomationPeer {
      val address = segment.toRawLongValue()
      return WebView2AutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: WebView2AutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
