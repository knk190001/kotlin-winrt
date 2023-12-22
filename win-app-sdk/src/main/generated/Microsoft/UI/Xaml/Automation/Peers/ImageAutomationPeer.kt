package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IImageAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Image
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

@ABIMarker(ImageAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ImageAutomationPeer;{1f6eb184-8765-5455-bd1d-93c251c17f9b})")
@WinRTByReference(brClass = ImageAutomationPeer.ByReference::class)
public open class ImageAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IImageAutomationPeer.WithDefault, IWinRTObject {
  private val __106652911_Interface: IImageAutomationPeer.WithDefault by lazy {
    as_106652911()
  }


  public override val __106652911_Ptr: JNAPointer? by lazy {
    __106652911_Interface.__106652911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__106652911_Interface)

  public constructor(owner: Image) : this(ABI.activate(owner))

  private fun as_106652911(): IImageAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IImageAutomationPeer.ABI.makeIImageAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageAutomationPeer.ABI.makeIImageAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageAutomationPeer> {
    public override fun getValue() = ImageAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ImageAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageAutomationPeer, MemoryAddress> {
    public val IImageAutomationPeerFactory_Instance: IImageAutomationPeerFactory by lazy {
      createIImageAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIImageAutomationPeerFactory(): IImageAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ImageAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IImageAutomationPeerFactory.ABI.makeIImageAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Image): JNAPointer? =
        IImageAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ImageAutomationPeer {
      val address = segment.toRawLongValue()
      return ImageAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ImageAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
