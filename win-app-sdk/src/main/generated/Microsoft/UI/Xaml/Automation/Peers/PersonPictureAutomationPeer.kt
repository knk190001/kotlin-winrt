package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IPersonPictureAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.PersonPicture
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

@ABIMarker(PersonPictureAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.PersonPictureAutomationPeer;{2e71779b-aca4-52c2-8a25-bc5f1ee3b0ae})")
@WinRTByReference(brClass = PersonPictureAutomationPeer.ByReference::class)
public open class PersonPictureAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IPersonPictureAutomationPeer.WithDefault, IWinRTObject {
  private val __1118450719_Interface: IPersonPictureAutomationPeer.WithDefault by lazy {
    as_1118450719()
  }


  public override val __1118450719_Ptr: JNAPointer? by lazy {
    __1118450719_Interface.__1118450719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1118450719_Interface)

  public constructor(owner: PersonPicture) : this(ABI.activate(owner))

  private fun as_1118450719(): IPersonPictureAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IPersonPictureAutomationPeer.ABI.makeIPersonPictureAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPersonPictureAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPersonPictureAutomationPeer.ABI.makeIPersonPictureAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PersonPictureAutomationPeer> {
    public override fun getValue() = PersonPictureAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: PersonPictureAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PersonPictureAutomationPeer, MemoryAddress> {
    public val IPersonPictureAutomationPeerFactory_Instance: IPersonPictureAutomationPeerFactory by
        lazy {
      createIPersonPictureAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPersonPictureAutomationPeerFactory(): IPersonPictureAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.PersonPictureAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPersonPictureAutomationPeerFactory.ABI.makeIPersonPictureAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: PersonPicture): JNAPointer? =
        IPersonPictureAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PersonPictureAutomationPeer {
      val address = segment.toRawLongValue()
      return PersonPictureAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: PersonPictureAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
