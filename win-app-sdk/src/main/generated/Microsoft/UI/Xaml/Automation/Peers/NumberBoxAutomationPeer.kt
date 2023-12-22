package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.INumberBoxAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.NumberBox
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

@ABIMarker(NumberBoxAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.NumberBoxAutomationPeer;{235befeb-6c98-5d35-a2e7-001eae342509})")
@WinRTByReference(brClass = NumberBoxAutomationPeer.ByReference::class)
public open class NumberBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), INumberBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __1972896952_Interface: INumberBoxAutomationPeer.WithDefault by lazy {
    as_1972896952()
  }


  public override val __1972896952_Ptr: JNAPointer? by lazy {
    __1972896952_Interface.__1972896952_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1972896952_Interface)

  public constructor(owner: NumberBox) : this(ABI.activate(owner))

  private fun as_1972896952(): INumberBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(INumberBoxAutomationPeer.ABI.makeINumberBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberBoxAutomationPeer.ABI.makeINumberBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NumberBoxAutomationPeer> {
    public override fun getValue() = NumberBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: NumberBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NumberBoxAutomationPeer, MemoryAddress> {
    public val INumberBoxAutomationPeerFactory_Instance: INumberBoxAutomationPeerFactory by lazy {
      createINumberBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINumberBoxAutomationPeerFactory(): INumberBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.NumberBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INumberBoxAutomationPeerFactory.ABI.makeINumberBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: NumberBox): JNAPointer? =
        INumberBoxAutomationPeerFactory_Instance.CreateInstance(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NumberBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return NumberBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: NumberBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
