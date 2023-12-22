package Windows.Phone.PersonalInformation.Provisioning

import Windows.Phone.PersonalInformation.ContactStore
import Windows.Storage.Streams.IInputStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContactPartnerProvisioningManager.ABI::class)
@WinRTByReference(brClass = ContactPartnerProvisioningManager.ByReference::class)
public class ContactPartnerProvisioningManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactPartnerProvisioningManager> {
    public override fun getValue() = ContactPartnerProvisioningManager(pointer.getPointer(0))

    public fun setValue(value: ContactPartnerProvisioningManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactPartnerProvisioningManager, MemoryAddress> {
    public val IContactPartnerProvisioningManagerStatics_Instance:
        IContactPartnerProvisioningManagerStatics by lazy {
      createIContactPartnerProvisioningManagerStatics()
    }


    public val IContactPartnerProvisioningManagerStatics2_Instance:
        IContactPartnerProvisioningManagerStatics2 by lazy {
      createIContactPartnerProvisioningManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactPartnerProvisioningManagerStatics():
        IContactPartnerProvisioningManagerStatics {
      val refiid = Guid.REFIID(IContactPartnerProvisioningManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.Provisioning.ContactPartnerProvisioningManager".toHandle(),refiid,interfacePtr)
      val result =
          IContactPartnerProvisioningManagerStatics.ABI.makeIContactPartnerProvisioningManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIContactPartnerProvisioningManagerStatics2():
        IContactPartnerProvisioningManagerStatics2 {
      val refiid = Guid.REFIID(IContactPartnerProvisioningManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.Provisioning.ContactPartnerProvisioningManager".toHandle(),refiid,interfacePtr)
      val result =
          IContactPartnerProvisioningManagerStatics2.ABI.makeIContactPartnerProvisioningManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContactPartnerProvisioningManager {
      val address = segment.toRawLongValue()
      return ContactPartnerProvisioningManager(Pointer(address))
    }

    public override fun toNative(obj: ContactPartnerProvisioningManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AssociateNetworkAccountAsync(
      store: ContactStore,
      networkName: String,
      networkAccountId: String
    ) = ABI.IContactPartnerProvisioningManagerStatics_Instance.AssociateNetworkAccountAsync(store,
        networkName, networkAccountId)

    public fun ImportVcardToSystemAsync(stream: IInputStream) =
        ABI.IContactPartnerProvisioningManagerStatics_Instance.ImportVcardToSystemAsync(stream)

    public fun AssociateSocialNetworkAccountAsync(
      store: ContactStore,
      networkName: String,
      networkAccountId: String
    ) =
        ABI.IContactPartnerProvisioningManagerStatics2_Instance.AssociateSocialNetworkAccountAsync(store,
        networkName, networkAccountId)
  }
}
