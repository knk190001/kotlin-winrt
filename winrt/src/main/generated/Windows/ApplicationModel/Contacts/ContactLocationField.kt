package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactLocationFieldFactory.ABI.IID
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

@ABIMarker(ContactLocationField.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactLocationField;{9ec00f82-ab6e-4b36-89e3-b23bc0a1dacc})")
@WinRTByReference(brClass = ContactLocationField.ByReference::class)
public class ContactLocationField(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactLocationField.WithDefault, IContactField.WithDefault, IWinRTObject {
  private val __1881968881_Interface: IContactLocationField.WithDefault by lazy {
    as_1881968881()
  }


  private val __1325530202_Interface: IContactField.WithDefault by lazy {
    as_1325530202()
  }


  public override val __1881968881_Ptr: JNAPointer? by lazy {
    __1881968881_Interface.__1881968881_Ptr
  }


  public override val __1325530202_Ptr: JNAPointer? by lazy {
    __1325530202_Interface.__1325530202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1881968881_Interface, __1325530202_Interface)

  public constructor(unstructuredAddress: String) : this(ABI.activate(unstructuredAddress))

  public constructor(unstructuredAddress: String, category: ContactFieldCategory) :
      this(ABI.activate(unstructuredAddress, category))

  public constructor(
    unstructuredAddress: String,
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) : this(ABI.activate(unstructuredAddress, category, street, city, region, country, postalCode))

  private fun as_1881968881(): IContactLocationField.WithDefault {
    if(pointer == NULL) {
      return(IContactLocationField.ABI.makeIContactLocationField(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactLocationField>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactLocationField.ABI.makeIContactLocationField(ref.value))
  }

  private fun as_1325530202(): IContactField.WithDefault {
    if(pointer == NULL) {
      return(IContactField.ABI.makeIContactField(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactField>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactField.ABI.makeIContactField(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactLocationField> {
    public override fun getValue() = ContactLocationField(pointer.getPointer(0))

    public fun setValue(value: ContactLocationField): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactLocationField, MemoryAddress> {
    public val IContactLocationFieldFactory_Instance: IContactLocationFieldFactory by lazy {
      createIContactLocationFieldFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactLocationFieldFactory(): IContactLocationFieldFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactLocationField".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContactLocationFieldFactory.ABI.makeIContactLocationFieldFactory(factoryActivatorPtr.value))
    }

    public fun activate(unstructuredAddress: String): JNAPointer? =
        IContactLocationFieldFactory_Instance.CreateLocation(unstructuredAddress)?.pointer

    public fun activate(unstructuredAddress: String, category: ContactFieldCategory): JNAPointer? =
        IContactLocationFieldFactory_Instance.CreateLocation(unstructuredAddress, category)?.pointer

    public fun activate(
      unstructuredAddress: String,
      category: ContactFieldCategory,
      street: String,
      city: String,
      region: String,
      country: String,
      postalCode: String
    ): JNAPointer? = IContactLocationFieldFactory_Instance.CreateLocation(unstructuredAddress,
        category, street, city, region, country, postalCode)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContactLocationField {
      val address = segment.toRawLongValue()
      return ContactLocationField(Pointer(address))
    }

    public override fun toNative(obj: ContactLocationField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
