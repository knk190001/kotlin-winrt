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

@ABIMarker(ContactStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactStore;{2c220b10-3a6c-4293-b9bc-fe987f6e0d52})")
@WinRTByReference(brClass = ContactStore.ByReference::class)
public class ContactStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactStore.WithDefault, IContactStore2.WithDefault,
    IContactStore3.WithDefault, IWinRTObject {
  private val __1313186931_Interface: IContactStore.WithDefault by lazy {
    as_1313186931()
  }


  private val __2054089147_Interface: IContactStore2.WithDefault by lazy {
    as_2054089147()
  }


  private val __2054089146_Interface: IContactStore3.WithDefault by lazy {
    as_2054089146()
  }


  public override val __1313186931_Ptr: JNAPointer? by lazy {
    __1313186931_Interface.__1313186931_Ptr
  }


  public override val __2054089147_Ptr: JNAPointer? by lazy {
    __2054089147_Interface.__2054089147_Ptr
  }


  public override val __2054089146_Ptr: JNAPointer? by lazy {
    __2054089146_Interface.__2054089146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1313186931_Interface, __2054089147_Interface, __2054089146_Interface)

  private fun as_1313186931(): IContactStore.WithDefault {
    if(pointer == NULL) {
      return(IContactStore.ABI.makeIContactStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStore.ABI.makeIContactStore(ref.value))
  }

  private fun as_2054089147(): IContactStore2.WithDefault {
    if(pointer == NULL) {
      return(IContactStore2.ABI.makeIContactStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStore2.ABI.makeIContactStore2(ref.value))
  }

  private fun as_2054089146(): IContactStore3.WithDefault {
    if(pointer == NULL) {
      return(IContactStore3.ABI.makeIContactStore3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStore3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStore3.ABI.makeIContactStore3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactStore> {
    public override fun getValue() = ContactStore(pointer.getPointer(0))

    public fun setValue(value: ContactStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactStore {
      val address = segment.toRawLongValue()
      return ContactStore(Pointer(address))
    }

    public override fun toNative(obj: ContactStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
