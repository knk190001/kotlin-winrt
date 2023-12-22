package Windows.ApplicationModel.Contacts

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContactStoreNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactStoreNotificationTriggerDetails;{abb298d6-878a-4f8b-a9ce-46bb7d1c84ce})")
@WinRTByReference(brClass = ContactStoreNotificationTriggerDetails.ByReference::class)
public class ContactStoreNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactStoreNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __2056969054_Interface: IContactStoreNotificationTriggerDetails.WithDefault by lazy {
    as_2056969054()
  }


  public override val __2056969054_Ptr: JNAPointer? by lazy {
    __2056969054_Interface.__2056969054_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2056969054_Interface)

  private fun as_2056969054(): IContactStoreNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IContactStoreNotificationTriggerDetails.ABI.makeIContactStoreNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStoreNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStoreNotificationTriggerDetails.ABI.makeIContactStoreNotificationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactStoreNotificationTriggerDetails> {
    public override fun getValue() = ContactStoreNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ContactStoreNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactStoreNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactStoreNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return ContactStoreNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ContactStoreNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
