package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactInstantMessageFieldFactory.ABI.IID
import Windows.Foundation.Uri
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

@ABIMarker(ContactInstantMessageField.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactInstantMessageField;{cce33b37-0d85-41fa-b43d-da599c3eb009})")
@WinRTByReference(brClass = ContactInstantMessageField.ByReference::class)
public class ContactInstantMessageField(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactInstantMessageField.WithDefault, IContactField.WithDefault,
    IWinRTObject {
  private val __2005701472_Interface: IContactInstantMessageField.WithDefault by lazy {
    as_2005701472()
  }


  private val __1325530202_Interface: IContactField.WithDefault by lazy {
    as_1325530202()
  }


  public override val __2005701472_Ptr: JNAPointer? by lazy {
    __2005701472_Interface.__2005701472_Ptr
  }


  public override val __1325530202_Ptr: JNAPointer? by lazy {
    __1325530202_Interface.__1325530202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2005701472_Interface, __1325530202_Interface)

  public constructor(userName: String) : this(ABI.activate(userName))

  public constructor(userName: String, category: ContactFieldCategory) : this(ABI.activate(userName,
      category))

  public constructor(
    userName: String,
    category: ContactFieldCategory,
    service: String,
    displayText: String,
    verb: Uri
  ) : this(ABI.activate(userName, category, service, displayText, verb))

  private fun as_2005701472(): IContactInstantMessageField.WithDefault {
    if(pointer == NULL) {
      return(IContactInstantMessageField.ABI.makeIContactInstantMessageField(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInstantMessageField>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInstantMessageField.ABI.makeIContactInstantMessageField(ref.value))
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
      IByReference<ContactInstantMessageField> {
    public override fun getValue() = ContactInstantMessageField(pointer.getPointer(0))

    public fun setValue(value: ContactInstantMessageField): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactInstantMessageField, MemoryAddress> {
    public val IContactInstantMessageFieldFactory_Instance: IContactInstantMessageFieldFactory by
        lazy {
      createIContactInstantMessageFieldFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContactInstantMessageFieldFactory(): IContactInstantMessageFieldFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactInstantMessageField".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContactInstantMessageFieldFactory.ABI.makeIContactInstantMessageFieldFactory(factoryActivatorPtr.value))
    }

    public fun activate(userName: String): JNAPointer? =
        IContactInstantMessageFieldFactory_Instance.CreateInstantMessage(userName)?.pointer

    public fun activate(userName: String, category: ContactFieldCategory): JNAPointer? =
        IContactInstantMessageFieldFactory_Instance.CreateInstantMessage(userName,
        category)?.pointer

    public fun activate(
      userName: String,
      category: ContactFieldCategory,
      service: String,
      displayText: String,
      verb: Uri
    ): JNAPointer? = IContactInstantMessageFieldFactory_Instance.CreateInstantMessage(userName,
        category, service, displayText, verb)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContactInstantMessageField {
      val address = segment.toRawLongValue()
      return ContactInstantMessageField(Pointer(address))
    }

    public override fun toNative(obj: ContactInstantMessageField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
