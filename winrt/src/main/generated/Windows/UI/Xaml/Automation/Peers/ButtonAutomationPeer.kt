package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IButtonAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Automation.Provider.IInvokeProvider
import Windows.UI.Xaml.Controls.Button
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

@ABIMarker(ButtonAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ButtonAutomationPeer;{fb77efbe-39ec-4508-8ac3-51a1424027d7})")
@WinRTByReference(brClass = ButtonAutomationPeer.ByReference::class)
public open class ButtonAutomationPeer(
  ptr: JNAPointer? = NULL
) : ButtonBaseAutomationPeer(ptr), IButtonAutomationPeer.WithDefault, IInvokeProvider.WithDefault,
    IWinRTObject {
  private val __1069032867_Interface: IButtonAutomationPeer.WithDefault by lazy {
    as_1069032867()
  }


  private val __907541087_Interface: IInvokeProvider.WithDefault by lazy {
    as_907541087()
  }


  public override val __1069032867_Ptr: JNAPointer? by lazy {
    __1069032867_Interface.__1069032867_Ptr
  }


  public override val __907541087_Ptr: JNAPointer? by lazy {
    __907541087_Interface.__907541087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1069032867_Interface, __907541087_Interface)

  public constructor(owner: Button) : this(ABI.activate(owner))

  private fun as_1069032867(): IButtonAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IButtonAutomationPeer.ABI.makeIButtonAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButtonAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButtonAutomationPeer.ABI.makeIButtonAutomationPeer(ref.value))
  }

  private fun as_907541087(): IInvokeProvider.WithDefault {
    if(pointer == NULL) {
      return(IInvokeProvider.ABI.makeIInvokeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInvokeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInvokeProvider.ABI.makeIInvokeProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ButtonAutomationPeer> {
    public override fun getValue() = ButtonAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ButtonAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ButtonAutomationPeer, MemoryAddress> {
    public val IButtonAutomationPeerFactory_Instance: IButtonAutomationPeerFactory by lazy {
      createIButtonAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIButtonAutomationPeerFactory(): IButtonAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ButtonAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IButtonAutomationPeerFactory.ABI.makeIButtonAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: Button): JNAPointer? =
        IButtonAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ButtonAutomationPeer {
      val address = segment.toRawLongValue()
      return ButtonAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ButtonAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
