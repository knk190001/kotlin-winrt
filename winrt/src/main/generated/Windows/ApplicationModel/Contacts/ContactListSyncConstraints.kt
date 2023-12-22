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

@ABIMarker(ContactListSyncConstraints.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactListSyncConstraints;{b2b0bf01-3062-4e2e-969d-018d1987f314})")
@WinRTByReference(brClass = ContactListSyncConstraints.ByReference::class)
public class ContactListSyncConstraints(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListSyncConstraints.WithDefault, IWinRTObject {
  private val __2126664137_Interface: IContactListSyncConstraints.WithDefault by lazy {
    as_2126664137()
  }


  public override val __2126664137_Ptr: JNAPointer? by lazy {
    __2126664137_Interface.__2126664137_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2126664137_Interface)

  private fun as_2126664137(): IContactListSyncConstraints.WithDefault {
    if(pointer == NULL) {
      return(IContactListSyncConstraints.ABI.makeIContactListSyncConstraints(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListSyncConstraints>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListSyncConstraints.ABI.makeIContactListSyncConstraints(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListSyncConstraints> {
    public override fun getValue() = ContactListSyncConstraints(pointer.getPointer(0))

    public fun setValue(value: ContactListSyncConstraints): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListSyncConstraints, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactListSyncConstraints {
      val address = segment.toRawLongValue()
      return ContactListSyncConstraints(Pointer(address))
    }

    public override fun toNative(obj: ContactListSyncConstraints): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
