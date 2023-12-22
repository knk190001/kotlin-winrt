package Windows.Phone.PersonalInformation

import Windows.Phone.PersonalInformation.IStoredContactFactory.ABI.IID
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

@ABIMarker(StoredContact.ABI::class)
@Signature("rc(Windows.Phone.PersonalInformation.StoredContact;{b070b7b1-263d-4e71-abe7-591d2466570e})")
@WinRTByReference(brClass = StoredContact.ByReference::class)
public class StoredContact(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoredContact.WithDefault, IContactInformation.WithDefault,
    IContactInformation2.WithDefault, IWinRTObject {
  private val __156536245_Interface: IStoredContact.WithDefault by lazy {
    as_156536245()
  }


  private val __3320524_Interface: IContactInformation.WithDefault by lazy {
    as_3320524()
  }


  private val __102936194_Interface: IContactInformation2.WithDefault by lazy {
    as_102936194()
  }


  public override val __156536245_Ptr: JNAPointer? by lazy {
    __156536245_Interface.__156536245_Ptr
  }


  public override val __3320524_Ptr: JNAPointer? by lazy {
    __3320524_Interface.__3320524_Ptr
  }


  public override val __102936194_Ptr: JNAPointer? by lazy {
    __102936194_Interface.__102936194_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__156536245_Interface, __3320524_Interface, __102936194_Interface)

  public constructor(store: ContactStore) : this(ABI.activate(store))

  public constructor(store: ContactStore, contact: ContactInformation) : this(ABI.activate(store,
      contact))

  private fun as_156536245(): IStoredContact.WithDefault {
    if(pointer == NULL) {
      return(IStoredContact.ABI.makeIStoredContact(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoredContact>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoredContact.ABI.makeIStoredContact(ref.value))
  }

  private fun as_3320524(): IContactInformation.WithDefault {
    if(pointer == NULL) {
      return(IContactInformation.ABI.makeIContactInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInformation.ABI.makeIContactInformation(ref.value))
  }

  private fun as_102936194(): IContactInformation2.WithDefault {
    if(pointer == NULL) {
      return(IContactInformation2.ABI.makeIContactInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInformation2.ABI.makeIContactInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoredContact>
      {
    public override fun getValue() = StoredContact(pointer.getPointer(0))

    public fun setValue(value: StoredContact): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoredContact, MemoryAddress> {
    public val IStoredContactFactory_Instance: IStoredContactFactory by lazy {
      createIStoredContactFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStoredContactFactory(): IStoredContactFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.StoredContact".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStoredContactFactory.ABI.makeIStoredContactFactory(factoryActivatorPtr.value))
    }

    public fun activate(store: ContactStore): JNAPointer? =
        IStoredContactFactory_Instance.CreateStoredContact(store)?.pointer

    public fun activate(store: ContactStore, contact: ContactInformation): JNAPointer? =
        IStoredContactFactory_Instance.CreateStoredContactFromInformation(store, contact)?.pointer

    public override fun fromNative(segment: MemoryAddress): StoredContact {
      val address = segment.toRawLongValue()
      return StoredContact(Pointer(address))
    }

    public override fun toNative(obj: StoredContact): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
