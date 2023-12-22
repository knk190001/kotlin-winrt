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

@ABIMarker(ContactListSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.DataProvider.ContactListSyncManagerSyncRequestEventArgs;{158e4dac-446d-4f10-afc2-02683ec533a6})")
@WinRTByReference(brClass = ContactListSyncManagerSyncRequestEventArgs.ByReference::class)
public class ContactListSyncManagerSyncRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListSyncManagerSyncRequestEventArgs.WithDefault, IWinRTObject {
  private val __1020931308_Interface: IContactListSyncManagerSyncRequestEventArgs.WithDefault by
      lazy {
    as_1020931308()
  }


  public override val __1020931308_Ptr: JNAPointer? by lazy {
    __1020931308_Interface.__1020931308_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1020931308_Interface)

  private fun as_1020931308(): IContactListSyncManagerSyncRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactListSyncManagerSyncRequestEventArgs.ABI.makeIContactListSyncManagerSyncRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListSyncManagerSyncRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListSyncManagerSyncRequestEventArgs.ABI.makeIContactListSyncManagerSyncRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        ContactListSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContactListSyncManagerSyncRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContactListSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return ContactListSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContactListSyncManagerSyncRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
