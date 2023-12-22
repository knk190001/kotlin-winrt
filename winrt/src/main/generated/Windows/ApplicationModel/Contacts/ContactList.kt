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

@ABIMarker(ContactList.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactList;{16ddec75-392c-4845-9dfb-51a3e7ef3e42})")
@WinRTByReference(brClass = ContactList.ByReference::class)
public class ContactList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactList.WithDefault, IContactList2.WithDefault,
    IContactList3.WithDefault, IWinRTObject {
  private val __42579854_Interface: IContactList.WithDefault by lazy {
    as_42579854()
  }


  private val __1319975424_Interface: IContactList2.WithDefault by lazy {
    as_1319975424()
  }


  private val __1319975423_Interface: IContactList3.WithDefault by lazy {
    as_1319975423()
  }


  public override val __42579854_Ptr: JNAPointer? by lazy {
    __42579854_Interface.__42579854_Ptr
  }


  public override val __1319975424_Ptr: JNAPointer? by lazy {
    __1319975424_Interface.__1319975424_Ptr
  }


  public override val __1319975423_Ptr: JNAPointer? by lazy {
    __1319975423_Interface.__1319975423_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__42579854_Interface, __1319975424_Interface, __1319975423_Interface)

  private fun as_42579854(): IContactList.WithDefault {
    if(pointer == NULL) {
      return(IContactList.ABI.makeIContactList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactList.ABI.makeIContactList(ref.value))
  }

  private fun as_1319975424(): IContactList2.WithDefault {
    if(pointer == NULL) {
      return(IContactList2.ABI.makeIContactList2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactList2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactList2.ABI.makeIContactList2(ref.value))
  }

  private fun as_1319975423(): IContactList3.WithDefault {
    if(pointer == NULL) {
      return(IContactList3.ABI.makeIContactList3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactList3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactList3.ABI.makeIContactList3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactList> {
    public override fun getValue() = ContactList(pointer.getPointer(0))

    public fun setValue(value: ContactList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactList {
      val address = segment.toRawLongValue()
      return ContactList(Pointer(address))
    }

    public override fun toNative(obj: ContactList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
