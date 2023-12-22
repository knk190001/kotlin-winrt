package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IRangeBaseAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IRangeValueProvider
import Windows.UI.Xaml.Controls.Primitives.RangeBase
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

@ABIMarker(RangeBaseAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.RangeBaseAutomationPeer;{e454b549-4b2c-42ad-b04b-d35947d1ee50})")
@WinRTByReference(brClass = RangeBaseAutomationPeer.ByReference::class)
public open class RangeBaseAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IRangeBaseAutomationPeer.WithDefault,
    IRangeValueProvider.WithDefault, IWinRTObject {
  private val __1298199215_Interface: IRangeBaseAutomationPeer.WithDefault by lazy {
    as_1298199215()
  }


  private val __1294049117_Interface: IRangeValueProvider.WithDefault by lazy {
    as_1294049117()
  }


  public override val __1298199215_Ptr: JNAPointer? by lazy {
    __1298199215_Interface.__1298199215_Ptr
  }


  public override val __1294049117_Ptr: JNAPointer? by lazy {
    __1294049117_Interface.__1294049117_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1298199215_Interface, __1294049117_Interface)

  public constructor(owner: RangeBase) : this(ABI.activate(owner))

  private fun as_1298199215(): IRangeBaseAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IRangeBaseAutomationPeer.ABI.makeIRangeBaseAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRangeBaseAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRangeBaseAutomationPeer.ABI.makeIRangeBaseAutomationPeer(ref.value))
  }

  private fun as_1294049117(): IRangeValueProvider.WithDefault {
    if(pointer == NULL) {
      return(IRangeValueProvider.ABI.makeIRangeValueProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRangeValueProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRangeValueProvider.ABI.makeIRangeValueProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RangeBaseAutomationPeer> {
    public override fun getValue() = RangeBaseAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: RangeBaseAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RangeBaseAutomationPeer, MemoryAddress> {
    public val IRangeBaseAutomationPeerFactory_Instance: IRangeBaseAutomationPeerFactory by lazy {
      createIRangeBaseAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRangeBaseAutomationPeerFactory(): IRangeBaseAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.RangeBaseAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRangeBaseAutomationPeerFactory.ABI.makeIRangeBaseAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: RangeBase): JNAPointer? =
        IRangeBaseAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RangeBaseAutomationPeer {
      val address = segment.toRawLongValue()
      return RangeBaseAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: RangeBaseAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
