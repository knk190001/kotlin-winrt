package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IThumbAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.Thumb
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

@ABIMarker(ThumbAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ThumbAutomationPeer;{b05d6e5b-3586-5157-a497-4f15b87d89eb})")
@WinRTByReference(brClass = ThumbAutomationPeer.ByReference::class)
public open class ThumbAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IThumbAutomationPeer.WithDefault, IWinRTObject {
  private val __2110017460_Interface: IThumbAutomationPeer.WithDefault by lazy {
    as_2110017460()
  }


  public override val __2110017460_Ptr: JNAPointer? by lazy {
    __2110017460_Interface.__2110017460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2110017460_Interface)

  public constructor(owner: Thumb) : this(ABI.activate(owner))

  private fun as_2110017460(): IThumbAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IThumbAutomationPeer.ABI.makeIThumbAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThumbAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThumbAutomationPeer.ABI.makeIThumbAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ThumbAutomationPeer> {
    public override fun getValue() = ThumbAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ThumbAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThumbAutomationPeer, MemoryAddress> {
    public val IThumbAutomationPeerFactory_Instance: IThumbAutomationPeerFactory by lazy {
      createIThumbAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIThumbAutomationPeerFactory(): IThumbAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ThumbAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IThumbAutomationPeerFactory.ABI.makeIThumbAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Thumb): JNAPointer? =
        IThumbAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ThumbAutomationPeer {
      val address = segment.toRawLongValue()
      return ThumbAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ThumbAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
