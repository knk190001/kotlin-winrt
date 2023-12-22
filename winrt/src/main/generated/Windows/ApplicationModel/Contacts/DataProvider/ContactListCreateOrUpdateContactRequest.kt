package Windows.ApplicationModel.Contacts.DataProvider

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

@ABIMarker(ContactListCreateOrUpdateContactRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListCreateOrUpdateContactRequest;{b4af411f-c849-47d0-b119-91cf605b2f2a})")
@WinRTByReference(brClass = ContactListCreateOrUpdateContactRequest.ByReference::class)
public class ContactListCreateOrUpdateContactRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListCreateOrUpdateContactRequest.WithDefault, IWinRTObject {
  private val __386133864_Interface: IContactListCreateOrUpdateContactRequest.WithDefault by lazy {
    as_386133864()
  }


  public override val __386133864_Ptr: JNAPointer? by lazy {
    __386133864_Interface.__386133864_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__386133864_Interface)

  private fun as_386133864(): IContactListCreateOrUpdateContactRequest.WithDefault {
    if(pointer == NULL) {
      return(IContactListCreateOrUpdateContactRequest.ABI.makeIContactListCreateOrUpdateContactRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListCreateOrUpdateContactRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListCreateOrUpdateContactRequest.ABI.makeIContactListCreateOrUpdateContactRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListCreateOrUpdateContactRequest> {
    public override fun getValue() = ContactListCreateOrUpdateContactRequest(pointer.getPointer(0))

    public fun setValue(value: ContactListCreateOrUpdateContactRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListCreateOrUpdateContactRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListCreateOrUpdateContactRequest {
      val address = segment.toRawLongValue()
      return ContactListCreateOrUpdateContactRequest(Pointer(address))
    }

    public override fun toNative(obj: ContactListCreateOrUpdateContactRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
