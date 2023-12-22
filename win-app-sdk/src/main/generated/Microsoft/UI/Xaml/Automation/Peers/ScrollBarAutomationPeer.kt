package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IScrollBarAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ScrollBar
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

@ABIMarker(ScrollBarAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ScrollBarAutomationPeer;{028a26c4-05f7-58b2-a81e-a7ac032f756f})")
@WinRTByReference(brClass = ScrollBarAutomationPeer.ByReference::class)
public open class ScrollBarAutomationPeer(
  ptr: JNAPointer? = NULL
) : RangeBaseAutomationPeer(ptr), IScrollBarAutomationPeer.WithDefault, IWinRTObject {
  private val __142365180_Interface: IScrollBarAutomationPeer.WithDefault by lazy {
    as_142365180()
  }


  public override val __142365180_Ptr: JNAPointer? by lazy {
    __142365180_Interface.__142365180_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__142365180_Interface)

  public constructor(owner: ScrollBar) : this(ABI.activate(owner))

  private fun as_142365180(): IScrollBarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IScrollBarAutomationPeer.ABI.makeIScrollBarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollBarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollBarAutomationPeer.ABI.makeIScrollBarAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollBarAutomationPeer> {
    public override fun getValue() = ScrollBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ScrollBarAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollBarAutomationPeer, MemoryAddress> {
    public val IScrollBarAutomationPeerFactory_Instance: IScrollBarAutomationPeerFactory by lazy {
      createIScrollBarAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollBarAutomationPeerFactory(): IScrollBarAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ScrollBarAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollBarAutomationPeerFactory.ABI.makeIScrollBarAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ScrollBar): JNAPointer? =
        IScrollBarAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollBarAutomationPeer {
      val address = segment.toRawLongValue()
      return ScrollBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ScrollBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
