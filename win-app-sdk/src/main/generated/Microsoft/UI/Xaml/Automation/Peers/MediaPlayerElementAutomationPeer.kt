package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IMediaPlayerElementAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.MediaPlayerElement
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

@ABIMarker(MediaPlayerElementAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.MediaPlayerElementAutomationPeer;{f68b8ca2-4428-5c35-b6a8-1b2ea062c22c})")
@WinRTByReference(brClass = MediaPlayerElementAutomationPeer.ByReference::class)
public open class MediaPlayerElementAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMediaPlayerElementAutomationPeer.WithDefault, IWinRTObject
    {
  private val __173092787_Interface: IMediaPlayerElementAutomationPeer.WithDefault by lazy {
    as_173092787()
  }


  public override val __173092787_Ptr: JNAPointer? by lazy {
    __173092787_Interface.__173092787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__173092787_Interface)

  public constructor(owner: MediaPlayerElement) : this(ABI.activate(owner))

  private fun as_173092787(): IMediaPlayerElementAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerElementAutomationPeer.ABI.makeIMediaPlayerElementAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerElementAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerElementAutomationPeer.ABI.makeIMediaPlayerElementAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlayerElementAutomationPeer> {
    public override fun getValue() = MediaPlayerElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MediaPlayerElementAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayerElementAutomationPeer, MemoryAddress> {
    public val IMediaPlayerElementAutomationPeerFactory_Instance:
        IMediaPlayerElementAutomationPeerFactory by lazy {
      createIMediaPlayerElementAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaPlayerElementAutomationPeerFactory():
        IMediaPlayerElementAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.MediaPlayerElementAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaPlayerElementAutomationPeerFactory.ABI.makeIMediaPlayerElementAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: MediaPlayerElement): JNAPointer? =
        IMediaPlayerElementAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaPlayerElementAutomationPeer {
      val address = segment.toRawLongValue()
      return MediaPlayerElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayerElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
