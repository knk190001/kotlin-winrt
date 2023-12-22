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

@ABIMarker(ContactListSyncManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactListSyncManager;{146e83be-7925-4acc-9de5-21ddd06f8674})")
@WinRTByReference(brClass = ContactListSyncManager.ByReference::class)
public class ContactListSyncManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListSyncManager.WithDefault, IContactListSyncManager2.WithDefault,
    IWinRTObject {
  private val __1279099712_Interface: IContactListSyncManager.WithDefault by lazy {
    as_1279099712()
  }


  private val __997385358_Interface: IContactListSyncManager2.WithDefault by lazy {
    as_997385358()
  }


  public override val __1279099712_Ptr: JNAPointer? by lazy {
    __1279099712_Interface.__1279099712_Ptr
  }


  public override val __997385358_Ptr: JNAPointer? by lazy {
    __997385358_Interface.__997385358_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1279099712_Interface, __997385358_Interface)

  private fun as_1279099712(): IContactListSyncManager.WithDefault {
    if(pointer == NULL) {
      return(IContactListSyncManager.ABI.makeIContactListSyncManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListSyncManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListSyncManager.ABI.makeIContactListSyncManager(ref.value))
  }

  private fun as_997385358(): IContactListSyncManager2.WithDefault {
    if(pointer == NULL) {
      return(IContactListSyncManager2.ABI.makeIContactListSyncManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListSyncManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListSyncManager2.ABI.makeIContactListSyncManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListSyncManager> {
    public override fun getValue() = ContactListSyncManager(pointer.getPointer(0))

    public fun setValue(value: ContactListSyncManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListSyncManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactListSyncManager {
      val address = segment.toRawLongValue()
      return ContactListSyncManager(Pointer(address))
    }

    public override fun toNative(obj: ContactListSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
