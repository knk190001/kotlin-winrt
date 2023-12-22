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

@ABIMarker(ContactAnnotationStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactAnnotationStore;{23acf4aa-7a77-457d-8203-987f4b31af09})")
@WinRTByReference(brClass = ContactAnnotationStore.ByReference::class)
public class ContactAnnotationStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactAnnotationStore.WithDefault, IContactAnnotationStore2.WithDefault,
    IWinRTObject {
  private val __1066680674_Interface: IContactAnnotationStore.WithDefault by lazy {
    as_1066680674()
  }


  private val __1292637524_Interface: IContactAnnotationStore2.WithDefault by lazy {
    as_1292637524()
  }


  public override val __1066680674_Ptr: JNAPointer? by lazy {
    __1066680674_Interface.__1066680674_Ptr
  }


  public override val __1292637524_Ptr: JNAPointer? by lazy {
    __1292637524_Interface.__1292637524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1066680674_Interface, __1292637524_Interface)

  private fun as_1066680674(): IContactAnnotationStore.WithDefault {
    if(pointer == NULL) {
      return(IContactAnnotationStore.ABI.makeIContactAnnotationStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactAnnotationStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactAnnotationStore.ABI.makeIContactAnnotationStore(ref.value))
  }

  private fun as_1292637524(): IContactAnnotationStore2.WithDefault {
    if(pointer == NULL) {
      return(IContactAnnotationStore2.ABI.makeIContactAnnotationStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactAnnotationStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactAnnotationStore2.ABI.makeIContactAnnotationStore2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactAnnotationStore> {
    public override fun getValue() = ContactAnnotationStore(pointer.getPointer(0))

    public fun setValue(value: ContactAnnotationStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactAnnotationStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContactAnnotationStore {
      val address = segment.toRawLongValue()
      return ContactAnnotationStore(Pointer(address))
    }

    public override fun toNative(obj: ContactAnnotationStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
