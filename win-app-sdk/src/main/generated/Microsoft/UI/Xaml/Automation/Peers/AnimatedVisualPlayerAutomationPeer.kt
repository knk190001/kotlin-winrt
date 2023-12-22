package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IAnimatedVisualPlayerAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer
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

@ABIMarker(AnimatedVisualPlayerAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.AnimatedVisualPlayerAutomationPeer;{f949eeb6-b3ea-58ad-b62b-b7255bcc04df})")
@WinRTByReference(brClass = AnimatedVisualPlayerAutomationPeer.ByReference::class)
public open class AnimatedVisualPlayerAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IAnimatedVisualPlayerAutomationPeer.WithDefault,
    IWinRTObject {
  private val __314847136_Interface: IAnimatedVisualPlayerAutomationPeer.WithDefault by lazy {
    as_314847136()
  }


  public override val __314847136_Ptr: JNAPointer? by lazy {
    __314847136_Interface.__314847136_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__314847136_Interface)

  public constructor(owner: AnimatedVisualPlayer) : this(ABI.activate(owner))

  private fun as_314847136(): IAnimatedVisualPlayerAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedVisualPlayerAutomationPeer.ABI.makeIAnimatedVisualPlayerAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedVisualPlayerAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedVisualPlayerAutomationPeer.ABI.makeIAnimatedVisualPlayerAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimatedVisualPlayerAutomationPeer> {
    public override fun getValue() = AnimatedVisualPlayerAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AnimatedVisualPlayerAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimatedVisualPlayerAutomationPeer, MemoryAddress> {
    public val IAnimatedVisualPlayerAutomationPeerFactory_Instance:
        IAnimatedVisualPlayerAutomationPeerFactory by lazy {
      createIAnimatedVisualPlayerAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimatedVisualPlayerAutomationPeerFactory():
        IAnimatedVisualPlayerAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.AnimatedVisualPlayerAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnimatedVisualPlayerAutomationPeerFactory.ABI.makeIAnimatedVisualPlayerAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: AnimatedVisualPlayer): JNAPointer? =
        IAnimatedVisualPlayerAutomationPeerFactory_Instance.CreateInstance(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnimatedVisualPlayerAutomationPeer {
      val address = segment.toRawLongValue()
      return AnimatedVisualPlayerAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AnimatedVisualPlayerAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
