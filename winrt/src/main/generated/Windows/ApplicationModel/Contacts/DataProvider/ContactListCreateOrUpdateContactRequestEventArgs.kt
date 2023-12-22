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

@ABIMarker(ContactListCreateOrUpdateContactRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListCreateOrUpdateContactRequestEventArgs;{851c1690-1a51-4b0c-aeef-1240ac5bed75})")
@WinRTByReference(brClass = ContactListCreateOrUpdateContactRequestEventArgs.ByReference::class)
public class ContactListCreateOrUpdateContactRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListCreateOrUpdateContactRequestEventArgs.WithDefault, IWinRTObject {
  private val __1904601889_Interface: IContactListCreateOrUpdateContactRequestEventArgs.WithDefault
      by lazy {
    as_1904601889()
  }


  public override val __1904601889_Ptr: JNAPointer? by lazy {
    __1904601889_Interface.__1904601889_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1904601889_Interface)

  private fun as_1904601889(): IContactListCreateOrUpdateContactRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactListCreateOrUpdateContactRequestEventArgs.ABI.makeIContactListCreateOrUpdateContactRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListCreateOrUpdateContactRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListCreateOrUpdateContactRequestEventArgs.ABI.makeIContactListCreateOrUpdateContactRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListCreateOrUpdateContactRequestEventArgs> {
    public override fun getValue() =
        ContactListCreateOrUpdateContactRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactListCreateOrUpdateContactRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListCreateOrUpdateContactRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListCreateOrUpdateContactRequestEventArgs {
      val address = segment.toRawLongValue()
      return ContactListCreateOrUpdateContactRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactListCreateOrUpdateContactRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
