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

@ABIMarker(ContactListDeleteContactRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListDeleteContactRequest;{5e114687-ce03-4de5-8557-9ccf552d472a})")
@WinRTByReference(brClass = ContactListDeleteContactRequest.ByReference::class)
public class ContactListDeleteContactRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListDeleteContactRequest.WithDefault, IWinRTObject {
  private val __964648869_Interface: IContactListDeleteContactRequest.WithDefault by lazy {
    as_964648869()
  }


  public override val __964648869_Ptr: JNAPointer? by lazy {
    __964648869_Interface.__964648869_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__964648869_Interface)

  private fun as_964648869(): IContactListDeleteContactRequest.WithDefault {
    if(pointer == NULL) {
      return(IContactListDeleteContactRequest.ABI.makeIContactListDeleteContactRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListDeleteContactRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListDeleteContactRequest.ABI.makeIContactListDeleteContactRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListDeleteContactRequest> {
    public override fun getValue() = ContactListDeleteContactRequest(pointer.getPointer(0))

    public fun setValue(value: ContactListDeleteContactRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListDeleteContactRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactListDeleteContactRequest {
      val address = segment.toRawLongValue()
      return ContactListDeleteContactRequest(Pointer(address))
    }

    public override fun toNative(obj: ContactListDeleteContactRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
