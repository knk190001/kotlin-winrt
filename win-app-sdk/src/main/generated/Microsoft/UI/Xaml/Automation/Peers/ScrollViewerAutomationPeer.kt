package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IScrollViewerAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Automation.Provider.IScrollProvider
import Microsoft.UI.Xaml.Controls.ScrollViewer
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

@ABIMarker(ScrollViewerAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ScrollViewerAutomationPeer;{25394bad-6ca2-5e04-95fa-95412c1f80ac})")
@WinRTByReference(brClass = ScrollViewerAutomationPeer.ByReference::class)
public open class ScrollViewerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IScrollViewerAutomationPeer.WithDefault,
    IScrollProvider.WithDefault, IWinRTObject {
  private val __628733915_Interface: IScrollViewerAutomationPeer.WithDefault by lazy {
    as_628733915()
  }


  private val __1467697237_Interface: IScrollProvider.WithDefault by lazy {
    as_1467697237()
  }


  public override val __628733915_Ptr: JNAPointer? by lazy {
    __628733915_Interface.__628733915_Ptr
  }


  public override val __1467697237_Ptr: JNAPointer? by lazy {
    __1467697237_Interface.__1467697237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__628733915_Interface, __1467697237_Interface)

  public constructor(owner: ScrollViewer) : this(ABI.activate(owner))

  private fun as_628733915(): IScrollViewerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewerAutomationPeer.ABI.makeIScrollViewerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewerAutomationPeer.ABI.makeIScrollViewerAutomationPeer(ref.value))
  }

  private fun as_1467697237(): IScrollProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollProvider.ABI.makeIScrollProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollProvider.ABI.makeIScrollProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollViewerAutomationPeer> {
    public override fun getValue() = ScrollViewerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ScrollViewerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollViewerAutomationPeer, MemoryAddress> {
    public val IScrollViewerAutomationPeerFactory_Instance: IScrollViewerAutomationPeerFactory by
        lazy {
      createIScrollViewerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollViewerAutomationPeerFactory(): IScrollViewerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ScrollViewerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollViewerAutomationPeerFactory.ABI.makeIScrollViewerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ScrollViewer): JNAPointer? =
        IScrollViewerAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollViewerAutomationPeer {
      val address = segment.toRawLongValue()
      return ScrollViewerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ScrollViewerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
