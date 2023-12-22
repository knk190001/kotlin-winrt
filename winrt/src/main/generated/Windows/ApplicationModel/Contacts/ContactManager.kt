package Windows.ApplicationModel.Contacts

import Windows.Foundation.Rect
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.System.User
import Windows.UI.Popups.Placement
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContactManager.ABI::class)
@WinRTByReference(brClass = ContactManager.ByReference::class)
public class ContactManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactManager>
      {
    public override fun getValue() = ContactManager(pointer.getPointer(0))

    public fun setValue(value: ContactManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactManager, MemoryAddress> {
    public val IContactManagerStatics4_Instance: IContactManagerStatics4 by lazy {
      createIContactManagerStatics4()
    }


    public val IContactManagerStatics_Instance: IContactManagerStatics by lazy {
      createIContactManagerStatics()
    }


    public val IContactManagerStatics2_Instance: IContactManagerStatics2 by lazy {
      createIContactManagerStatics2()
    }


    public val IContactManagerStatics3_Instance: IContactManagerStatics3 by lazy {
      createIContactManagerStatics3()
    }


    public val IContactManagerStatics5_Instance: IContactManagerStatics5 by lazy {
      createIContactManagerStatics5()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactManagerStatics4(): IContactManagerStatics4 {
      val refiid = Guid.REFIID(IContactManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactManager".toHandle(),refiid,interfacePtr)
      val result = IContactManagerStatics4.ABI.makeIContactManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIContactManagerStatics(): IContactManagerStatics {
      val refiid = Guid.REFIID(IContactManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactManager".toHandle(),refiid,interfacePtr)
      val result = IContactManagerStatics.ABI.makeIContactManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIContactManagerStatics2(): IContactManagerStatics2 {
      val refiid = Guid.REFIID(IContactManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactManager".toHandle(),refiid,interfacePtr)
      val result = IContactManagerStatics2.ABI.makeIContactManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIContactManagerStatics3(): IContactManagerStatics3 {
      val refiid = Guid.REFIID(IContactManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactManager".toHandle(),refiid,interfacePtr)
      val result = IContactManagerStatics3.ABI.makeIContactManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIContactManagerStatics5(): IContactManagerStatics5 {
      val refiid = Guid.REFIID(IContactManagerStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactManager".toHandle(),refiid,interfacePtr)
      val result = IContactManagerStatics5.ABI.makeIContactManagerStatics5(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContactManager {
      val address = segment.toRawLongValue()
      return ContactManager(Pointer(address))
    }

    public override fun toNative(obj: ContactManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) = ABI.IContactManagerStatics4_Instance.GetForUser(user)

    public fun ShowContactCard(contact: Contact, selection: Rect) =
        ABI.IContactManagerStatics_Instance.ShowContactCard(contact, selection)

    public fun ShowContactCard(
      contact: Contact,
      selection: Rect,
      preferredPlacement: Placement
    ) = ABI.IContactManagerStatics_Instance.ShowContactCard(contact, selection, preferredPlacement)

    public fun ShowDelayLoadedContactCard(
      contact: Contact,
      selection: Rect,
      preferredPlacement: Placement
    ) = ABI.IContactManagerStatics_Instance.ShowDelayLoadedContactCard(contact, selection,
        preferredPlacement)

    public fun RequestStoreAsync() = ABI.IContactManagerStatics2_Instance.RequestStoreAsync()

    public fun ConvertContactToVCardAsync(contact: Contact) =
        ABI.IContactManagerStatics3_Instance.ConvertContactToVCardAsync(contact)

    public fun ConvertContactToVCardAsync(contact: Contact, maxBytes: WinDef.UINT) =
        ABI.IContactManagerStatics3_Instance.ConvertContactToVCardAsync(contact, maxBytes)

    public fun ConvertVCardToContactAsync(vCard: IRandomAccessStreamReference) =
        ABI.IContactManagerStatics3_Instance.ConvertVCardToContactAsync(vCard)

    public fun RequestStoreAsync(accessType: ContactStoreAccessType) =
        ABI.IContactManagerStatics3_Instance.RequestStoreAsync(accessType)

    public fun RequestAnnotationStoreAsync(accessType: ContactAnnotationStoreAccessType) =
        ABI.IContactManagerStatics3_Instance.RequestAnnotationStoreAsync(accessType)

    public fun IsShowContactCardSupported() =
        ABI.IContactManagerStatics3_Instance.IsShowContactCardSupported()

    public fun ShowContactCard(
      contact: Contact,
      selection: Rect,
      preferredPlacement: Placement,
      contactCardOptions: ContactCardOptions
    ) = ABI.IContactManagerStatics3_Instance.ShowContactCard(contact, selection, preferredPlacement,
        contactCardOptions)

    public fun IsShowDelayLoadedContactCardSupported() =
        ABI.IContactManagerStatics3_Instance.IsShowDelayLoadedContactCardSupported()

    public fun ShowDelayLoadedContactCard(
      contact: Contact,
      selection: Rect,
      preferredPlacement: Placement,
      contactCardOptions: ContactCardOptions
    ) = ABI.IContactManagerStatics3_Instance.ShowDelayLoadedContactCard(contact, selection,
        preferredPlacement, contactCardOptions)

    public fun ShowFullContactCard(contact: Contact, fullContactCardOptions: FullContactCardOptions)
        = ABI.IContactManagerStatics3_Instance.ShowFullContactCard(contact, fullContactCardOptions)

    public fun get_SystemDisplayNameOrder() =
        ABI.IContactManagerStatics3_Instance.get_SystemDisplayNameOrder()

    public fun put_SystemDisplayNameOrder(value: ContactNameOrder) =
        ABI.IContactManagerStatics3_Instance.put_SystemDisplayNameOrder(value)

    public fun get_SystemSortOrder() = ABI.IContactManagerStatics3_Instance.get_SystemSortOrder()

    public fun put_SystemSortOrder(value: ContactNameOrder) =
        ABI.IContactManagerStatics3_Instance.put_SystemSortOrder(value)

    public fun IsShowFullContactCardSupportedAsync() =
        ABI.IContactManagerStatics5_Instance.IsShowFullContactCardSupportedAsync()

    public fun get_IncludeMiddleNameInSystemDisplayAndSort() =
        ABI.IContactManagerStatics5_Instance.get_IncludeMiddleNameInSystemDisplayAndSort()

    public fun put_IncludeMiddleNameInSystemDisplayAndSort(value: Boolean) =
        ABI.IContactManagerStatics5_Instance.put_IncludeMiddleNameInSystemDisplayAndSort(value)
  }
}
