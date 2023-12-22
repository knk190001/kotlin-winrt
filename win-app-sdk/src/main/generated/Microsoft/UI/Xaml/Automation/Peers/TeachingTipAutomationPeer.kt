package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.ITeachingTipAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.TeachingTip
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

@ABIMarker(TeachingTipAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.TeachingTipAutomationPeer;{607994ec-a995-5b07-b535-8c913f0bc26c})")
@WinRTByReference(brClass = TeachingTipAutomationPeer.ByReference::class)
public open class TeachingTipAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ITeachingTipAutomationPeer.WithDefault, IWinRTObject {
  private val __112485572_Interface: ITeachingTipAutomationPeer.WithDefault by lazy {
    as_112485572()
  }


  public override val __112485572_Ptr: JNAPointer? by lazy {
    __112485572_Interface.__112485572_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__112485572_Interface)

  public constructor(owner: TeachingTip) : this(ABI.activate(owner))

  private fun as_112485572(): ITeachingTipAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ITeachingTipAutomationPeer.ABI.makeITeachingTipAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITeachingTipAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITeachingTipAutomationPeer.ABI.makeITeachingTipAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TeachingTipAutomationPeer> {
    public override fun getValue() = TeachingTipAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: TeachingTipAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TeachingTipAutomationPeer, MemoryAddress> {
    public val ITeachingTipAutomationPeerFactory_Instance: ITeachingTipAutomationPeerFactory by
        lazy {
      createITeachingTipAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITeachingTipAutomationPeerFactory(): ITeachingTipAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.TeachingTipAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITeachingTipAutomationPeerFactory.ABI.makeITeachingTipAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: TeachingTip): JNAPointer? =
        ITeachingTipAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TeachingTipAutomationPeer {
      val address = segment.toRawLongValue()
      return TeachingTipAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: TeachingTipAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
