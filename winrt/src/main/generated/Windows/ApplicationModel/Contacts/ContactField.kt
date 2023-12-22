package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactFieldFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContactField.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactField;{b176486a-d293-492c-a058-db575b3e3c0f})")
@WinRTByReference(brClass = ContactField.ByReference::class)
public class ContactField(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactField.WithDefault, IWinRTObject {
  private val __1325530202_Interface: IContactField.WithDefault by lazy {
    as_1325530202()
  }


  public override val __1325530202_Ptr: JNAPointer? by lazy {
    __1325530202_Interface.__1325530202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1325530202_Interface)

  public constructor(value: String, type: ContactFieldType) : this(ABI.activate(value, type))

  public constructor(
    value: String,
    type: ContactFieldType,
    category: ContactFieldCategory
  ) : this(ABI.activate(value, type, category))

  public constructor(
    name: String,
    value: String,
    type: ContactFieldType,
    category: ContactFieldCategory
  ) : this(ABI.activate(name, value, type, category))

  private fun as_1325530202(): IContactField.WithDefault {
    if(pointer == NULL) {
      return(IContactField.ABI.makeIContactField(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactField>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactField.ABI.makeIContactField(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactField> {
    public override fun getValue() = ContactField(pointer.getPointer(0))

    public fun setValue(value: ContactField): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactField, MemoryAddress> {
    public val IContactFieldFactory_Instance: IContactFieldFactory by lazy {
      createIContactFieldFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactFieldFactory(): IContactFieldFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactField".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContactFieldFactory.ABI.makeIContactFieldFactory(factoryActivatorPtr.value))
    }

    public fun activate(value: String, type: ContactFieldType): JNAPointer? =
        IContactFieldFactory_Instance.CreateField(value, type)?.pointer

    public fun activate(
      value: String,
      type: ContactFieldType,
      category: ContactFieldCategory
    ): JNAPointer? = IContactFieldFactory_Instance.CreateField(value, type, category)?.pointer

    public fun activate(
      name: String,
      value: String,
      type: ContactFieldType,
      category: ContactFieldCategory
    ): JNAPointer? = IContactFieldFactory_Instance.CreateField(name, value, type, category)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContactField {
      val address = segment.toRawLongValue()
      return ContactField(Pointer(address))
    }

    public override fun toNative(obj: ContactField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
