package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IRatingControlAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.RatingControl
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

@ABIMarker(RatingControlAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.RatingControlAutomationPeer;{3d14349a-9963-4a47-823c-f457cb3209d5})")
@WinRTByReference(brClass = RatingControlAutomationPeer.ByReference::class)
public open class RatingControlAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRatingControlAutomationPeer.WithDefault, IWinRTObject {
  private val __1498430081_Interface: IRatingControlAutomationPeer.WithDefault by lazy {
    as_1498430081()
  }


  public override val __1498430081_Ptr: JNAPointer? by lazy {
    __1498430081_Interface.__1498430081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1498430081_Interface)

  public constructor(owner: RatingControl) : this(ABI.activate(owner))

  private fun as_1498430081(): IRatingControlAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRatingControlAutomationPeer.ABI.makeIRatingControlAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatingControlAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatingControlAutomationPeer.ABI.makeIRatingControlAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RatingControlAutomationPeer> {
    public override fun getValue() = RatingControlAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RatingControlAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatingControlAutomationPeer, MemoryAddress> {
    public val IRatingControlAutomationPeerFactory_Instance: IRatingControlAutomationPeerFactory by
        lazy {
      createIRatingControlAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatingControlAutomationPeerFactory(): IRatingControlAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.RatingControlAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatingControlAutomationPeerFactory.ABI.makeIRatingControlAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RatingControl): JNAPointer? =
        IRatingControlAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatingControlAutomationPeer {
      val address = segment.toRawLongValue()
      return RatingControlAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RatingControlAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
