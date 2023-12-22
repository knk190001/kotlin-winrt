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

@ABIMarker(ContactListDeleteContactRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListDeleteContactRequestEventArgs;{b22054a1-e8fa-4db5-9389-2d12ee7d15ee})")
@WinRTByReference(brClass = ContactListDeleteContactRequestEventArgs.ByReference::class)
public class ContactListDeleteContactRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListDeleteContactRequestEventArgs.WithDefault, IWinRTObject {
  private val __1080586116_Interface: IContactListDeleteContactRequestEventArgs.WithDefault by
      lazy {
    as_1080586116()
  }


  public override val __1080586116_Ptr: JNAPointer? by lazy {
    __1080586116_Interface.__1080586116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1080586116_Interface)

  private fun as_1080586116(): IContactListDeleteContactRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactListDeleteContactRequestEventArgs.ABI.makeIContactListDeleteContactRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListDeleteContactRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListDeleteContactRequestEventArgs.ABI.makeIContactListDeleteContactRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListDeleteContactRequestEventArgs> {
    public override fun getValue() = ContactListDeleteContactRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactListDeleteContactRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListDeleteContactRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListDeleteContactRequestEventArgs {
      val address = segment.toRawLongValue()
      return ContactListDeleteContactRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactListDeleteContactRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
