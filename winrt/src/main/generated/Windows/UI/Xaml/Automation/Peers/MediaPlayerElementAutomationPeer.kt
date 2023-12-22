package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IMediaPlayerElementAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.MediaPlayerElement
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
@Signature("rc(Windows.UI.Xaml.Automation.Peers.MediaPlayerElementAutomationPeer;{02bed209-3f65-4fdd-b5ca-c4750d4e6ea4})")
@WinRTByReference(brClass = MediaPlayerElementAutomationPeer.ByReference::class)
public open class MediaPlayerElementAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMediaPlayerElementAutomationPeer.WithDefault, IWinRTObject
    {
  private val __7338744_Interface: IMediaPlayerElementAutomationPeer.WithDefault by lazy {
    as_7338744()
  }


  public override val __7338744_Ptr: JNAPointer? by lazy {
    __7338744_Interface.__7338744_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__7338744_Interface)

  public constructor(owner: MediaPlayerElement) : this(ABI.activate(owner))

  private fun as_7338744(): IMediaPlayerElementAutomationPeer.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.MediaPlayerElementAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
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
