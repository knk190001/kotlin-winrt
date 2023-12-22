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

@ABIMarker(ContactManagerForUser.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactManagerForUser;{b74bba57-1076-4bef-aef3-54686d18387d})")
@WinRTByReference(brClass = ContactManagerForUser.ByReference::class)
public class ContactManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactManagerForUser.WithDefault, IContactManagerForUser2.WithDefault,
    IWinRTObject {
  private val __1107770011_Interface: IContactManagerForUser.WithDefault by lazy {
    as_1107770011()
  }


  private val __18867977_Interface: IContactManagerForUser2.WithDefault by lazy {
    as_18867977()
  }


  public override val __1107770011_Ptr: JNAPointer? by lazy {
    __1107770011_Interface.__1107770011_Ptr
  }


  public override val __18867977_Ptr: JNAPointer? by lazy {
    __18867977_Interface.__18867977_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1107770011_Interface, __18867977_Interface)

  private fun as_1107770011(): IContactManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IContactManagerForUser.ABI.makeIContactManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactManagerForUser.ABI.makeIContactManagerForUser(ref.value))
  }

  private fun as_18867977(): IContactManagerForUser2.WithDefault {
    if(pointer == NULL) {
      return(IContactManagerForUser2.ABI.makeIContactManagerForUser2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactManagerForUser2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactManagerForUser2.ABI.makeIContactManagerForUser2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactManagerForUser> {
    public override fun getValue() = ContactManagerForUser(pointer.getPointer(0))

    public fun setValue(value: ContactManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactManagerForUser {
      val address = segment.toRawLongValue()
      return ContactManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: ContactManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
