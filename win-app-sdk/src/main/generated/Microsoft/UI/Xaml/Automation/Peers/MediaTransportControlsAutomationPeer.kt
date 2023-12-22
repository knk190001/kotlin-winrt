package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IMediaTransportControlsAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.MediaTransportControls
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

@ABIMarker(MediaTransportControlsAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.MediaTransportControlsAutomationPeer;{da850d4e-8715-5ae7-81a9-abd10d17c1ed})")
@WinRTByReference(brClass = MediaTransportControlsAutomationPeer.ByReference::class)
public open class MediaTransportControlsAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMediaTransportControlsAutomationPeer.WithDefault,
    IWinRTObject {
  private val __147961175_Interface: IMediaTransportControlsAutomationPeer.WithDefault by lazy {
    as_147961175()
  }


  public override val __147961175_Ptr: JNAPointer? by lazy {
    __147961175_Interface.__147961175_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__147961175_Interface)

  public constructor(owner: MediaTransportControls) : this(ABI.activate(owner))

  private fun as_147961175(): IMediaTransportControlsAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControlsAutomationPeer.ABI.makeIMediaTransportControlsAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControlsAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControlsAutomationPeer.ABI.makeIMediaTransportControlsAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTransportControlsAutomationPeer> {
    public override fun getValue() = MediaTransportControlsAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MediaTransportControlsAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTransportControlsAutomationPeer, MemoryAddress> {
    public val IMediaTransportControlsAutomationPeerFactory_Instance:
        IMediaTransportControlsAutomationPeerFactory by lazy {
      createIMediaTransportControlsAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaTransportControlsAutomationPeerFactory():
        IMediaTransportControlsAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.MediaTransportControlsAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaTransportControlsAutomationPeerFactory.ABI.makeIMediaTransportControlsAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MediaTransportControls): JNAPointer? =
        IMediaTransportControlsAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaTransportControlsAutomationPeer {
      val address = segment.toRawLongValue()
      return MediaTransportControlsAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MediaTransportControlsAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
