package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IProgressBarAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.ProgressBar
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

@ABIMarker(ProgressBarAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ProgressBarAutomationPeer;{93f48f86-d840-4fb6-ac2f-5f779b854b0d})")
@WinRTByReference(brClass = ProgressBarAutomationPeer.ByReference::class)
public open class ProgressBarAutomationPeer(
  ptr: JNAPointer? = NULL
) : RangeBaseAutomationPeer(ptr), IProgressBarAutomationPeer.WithDefault, IWinRTObject {
  private val __797382567_Interface: IProgressBarAutomationPeer.WithDefault by lazy {
    as_797382567()
  }


  public override val __797382567_Ptr: JNAPointer? by lazy {
    __797382567_Interface.__797382567_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__797382567_Interface)

  public constructor(owner: ProgressBar) : this(ABI.activate(owner))

  private fun as_797382567(): IProgressBarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IProgressBarAutomationPeer.ABI.makeIProgressBarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressBarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressBarAutomationPeer.ABI.makeIProgressBarAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProgressBarAutomationPeer> {
    public override fun getValue() = ProgressBarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ProgressBarAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressBarAutomationPeer, MemoryAddress> {
    public val IProgressBarAutomationPeerFactory_Instance: IProgressBarAutomationPeerFactory by
        lazy {
      createIProgressBarAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProgressBarAutomationPeerFactory(): IProgressBarAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ProgressBarAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProgressBarAutomationPeerFactory.ABI.makeIProgressBarAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ProgressBar): JNAPointer? =
        IProgressBarAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProgressBarAutomationPeer {
      val address = segment.toRawLongValue()
      return ProgressBarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ProgressBarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
