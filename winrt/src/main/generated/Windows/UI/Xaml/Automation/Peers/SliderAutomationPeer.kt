package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.ISliderAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.Slider
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

@ABIMarker(SliderAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.SliderAutomationPeer;{ec30015a-d611-46d0-ae4f-6ecf27dfbaa5})")
@WinRTByReference(brClass = SliderAutomationPeer.ByReference::class)
public open class SliderAutomationPeer(
  ptr: JNAPointer? = NULL
) : RangeBaseAutomationPeer(ptr), ISliderAutomationPeer.WithDefault, IWinRTObject {
  private val __2125309678_Interface: ISliderAutomationPeer.WithDefault by lazy {
    as_2125309678()
  }


  public override val __2125309678_Ptr: JNAPointer? by lazy {
    __2125309678_Interface.__2125309678_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2125309678_Interface)

  public constructor(owner: Slider) : this(ABI.activate(owner))

  private fun as_2125309678(): ISliderAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ISliderAutomationPeer.ABI.makeISliderAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISliderAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISliderAutomationPeer.ABI.makeISliderAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SliderAutomationPeer> {
    public override fun getValue() = SliderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: SliderAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SliderAutomationPeer, MemoryAddress> {
    public val ISliderAutomationPeerFactory_Instance: ISliderAutomationPeerFactory by lazy {
      createISliderAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISliderAutomationPeerFactory(): ISliderAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.SliderAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISliderAutomationPeerFactory.ABI.makeISliderAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Slider): JNAPointer? =
        ISliderAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SliderAutomationPeer {
      val address = segment.toRawLongValue()
      return SliderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: SliderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
