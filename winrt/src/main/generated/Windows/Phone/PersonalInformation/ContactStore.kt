package Windows.Phone.PersonalInformation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
@Signature("rc(Windows.Phone.PersonalInformation.ContactStore;{b2cd6fef-2bfd-4fad-8552-4e698097e8eb})")
@WinRTByReference(brClass = ContactStore.ByReference::class)
public class ContactStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactStore.WithDefault, IContactStore2.WithDefault, IWinRTObject {
  private val __343114007_Interface: IContactStore.WithDefault by lazy {
    as_343114007()
  }


  private val __2046599575_Interface: IContactStore2.WithDefault by lazy {
    as_2046599575()
  }


  public override val __343114007_Ptr: JNAPointer? by lazy {
    __343114007_Interface.__343114007_Ptr
  }


  public override val __2046599575_Ptr: JNAPointer? by lazy {
    __2046599575_Interface.__2046599575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343114007_Interface, __2046599575_Interface)

  private fun as_343114007(): IContactStore.WithDefault {
    if(pointer == NULL) {
      return(IContactStore.ABI.makeIContactStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStore.ABI.makeIContactStore(ref.value))
  }

  private fun as_2046599575(): IContactStore2.WithDefault {
    if(pointer == NULL) {
      return(IContactStore2.ABI.makeIContactStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactStore2.ABI.makeIContactStore2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactStore> {
    public override fun getValue() = ContactStore(pointer.getPointer(0))

    public fun setValue(value: ContactStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactStore, MemoryAddress> {
    public val IContactStoreStatics_Instance: IContactStoreStatics by lazy {
      createIContactStoreStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactStoreStatics(): IContactStoreStatics {
      val refiid = Guid.REFIID(IContactStoreStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.ContactStore".toHandle(),refiid,interfacePtr)
      val result = IContactStoreStatics.ABI.makeIContactStoreStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContactStore {
      val address = segment.toRawLongValue()
      return ContactStore(Pointer(address))
    }

    public override fun toNative(obj: ContactStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateOrOpenAsync() = ABI.IContactStoreStatics_Instance.CreateOrOpenAsync()

    public fun CreateOrOpenAsync(access: ContactStoreSystemAccessMode,
        sharing: ContactStoreApplicationAccessMode) =
        ABI.IContactStoreStatics_Instance.CreateOrOpenAsync(access, sharing)
  }
}
