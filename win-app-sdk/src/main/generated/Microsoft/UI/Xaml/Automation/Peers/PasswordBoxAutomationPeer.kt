package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IPasswordBoxAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.PasswordBox
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

@ABIMarker(PasswordBoxAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.PasswordBoxAutomationPeer;{49b18dba-fa3b-5106-a1e8-1aaa3d24d5e1})")
@WinRTByReference(brClass = PasswordBoxAutomationPeer.ByReference::class)
public open class PasswordBoxAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IPasswordBoxAutomationPeer.WithDefault, IWinRTObject {
  private val __634361958_Interface: IPasswordBoxAutomationPeer.WithDefault by lazy {
    as_634361958()
  }


  public override val __634361958_Ptr: JNAPointer? by lazy {
    __634361958_Interface.__634361958_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__634361958_Interface)

  public constructor(owner: PasswordBox) : this(ABI.activate(owner))

  private fun as_634361958(): IPasswordBoxAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBoxAutomationPeer.ABI.makeIPasswordBoxAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBoxAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBoxAutomationPeer.ABI.makeIPasswordBoxAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PasswordBoxAutomationPeer> {
    public override fun getValue() = PasswordBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PasswordBoxAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordBoxAutomationPeer, MemoryAddress> {
    public val IPasswordBoxAutomationPeerFactory_Instance: IPasswordBoxAutomationPeerFactory by
        lazy {
      createIPasswordBoxAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPasswordBoxAutomationPeerFactory(): IPasswordBoxAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.PasswordBoxAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPasswordBoxAutomationPeerFactory.ABI.makeIPasswordBoxAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: PasswordBox): JNAPointer? =
        IPasswordBoxAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PasswordBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return PasswordBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PasswordBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
