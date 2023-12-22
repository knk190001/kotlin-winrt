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

@ABIMarker(ContactListLimitedWriteOperations.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactListLimitedWriteOperations;{e19813da-4a0b-44b8-9a1f-a0f3d218175f})")
@WinRTByReference(brClass = ContactListLimitedWriteOperations.ByReference::class)
public class ContactListLimitedWriteOperations(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactListLimitedWriteOperations.WithDefault, IWinRTObject {
  private val __1722257597_Interface: IContactListLimitedWriteOperations.WithDefault by lazy {
    as_1722257597()
  }


  public override val __1722257597_Ptr: JNAPointer? by lazy {
    __1722257597_Interface.__1722257597_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1722257597_Interface)

  private fun as_1722257597(): IContactListLimitedWriteOperations.WithDefault {
    if(pointer == NULL) {
      return(IContactListLimitedWriteOperations.ABI.makeIContactListLimitedWriteOperations(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactListLimitedWriteOperations>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactListLimitedWriteOperations.ABI.makeIContactListLimitedWriteOperations(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactListLimitedWriteOperations> {
    public override fun getValue() = ContactListLimitedWriteOperations(pointer.getPointer(0))

    public fun setValue(value: ContactListLimitedWriteOperations): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactListLimitedWriteOperations, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactListLimitedWriteOperations {
      val address = segment.toRawLongValue()
      return ContactListLimitedWriteOperations(Pointer(address))
    }

    public override fun toNative(obj: ContactListLimitedWriteOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
