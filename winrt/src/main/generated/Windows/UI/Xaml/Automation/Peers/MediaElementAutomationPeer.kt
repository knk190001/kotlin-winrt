package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IMediaElementAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.MediaElement
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

@ABIMarker(MediaElementAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.MediaElementAutomationPeer;{ba0b9fc2-a6e2-41a5-b17a-d1594613efba})")
@WinRTByReference(brClass = MediaElementAutomationPeer.ByReference::class)
public open class MediaElementAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMediaElementAutomationPeer.WithDefault, IWinRTObject {
  private val __1664434281_Interface: IMediaElementAutomationPeer.WithDefault by lazy {
    as_1664434281()
  }


  public override val __1664434281_Ptr: JNAPointer? by lazy {
    __1664434281_Interface.__1664434281_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1664434281_Interface)

  public constructor(owner: MediaElement) : this(ABI.activate(owner))

  private fun as_1664434281(): IMediaElementAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMediaElementAutomationPeer.ABI.makeIMediaElementAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaElementAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaElementAutomationPeer.ABI.makeIMediaElementAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaElementAutomationPeer> {
    public override fun getValue() = MediaElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MediaElementAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaElementAutomationPeer, MemoryAddress> {
    public val IMediaElementAutomationPeerFactory_Instance: IMediaElementAutomationPeerFactory by
        lazy {
      createIMediaElementAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaElementAutomationPeerFactory(): IMediaElementAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.MediaElementAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaElementAutomationPeerFactory.ABI.makeIMediaElementAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MediaElement): JNAPointer? =
        IMediaElementAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaElementAutomationPeer {
      val address = segment.toRawLongValue()
      return MediaElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MediaElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
