package Windows.ApplicationModel.Contacts

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(Contact.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.Contact;{ec0072f3-2118-4049-9ebc-17f0ab692b64})")
@WinRTByReference(brClass = Contact.ByReference::class)
public class Contact(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContact.WithDefault, IContact2.WithDefault, IContactName.WithDefault,
    IContact3.WithDefault, IWinRTObject {
  private val __1161814604_Interface: IContact.WithDefault by lazy {
    as_1161814604()
  }


  private val __1656514306_Interface: IContact2.WithDefault by lazy {
    as_1656514306()
  }


  private val __42528161_Interface: IContactName.WithDefault by lazy {
    as_42528161()
  }


  private val __1656514305_Interface: IContact3.WithDefault by lazy {
    as_1656514305()
  }


  public override val __1161814604_Ptr: JNAPointer? by lazy {
    __1161814604_Interface.__1161814604_Ptr
  }


  public override val __1656514306_Ptr: JNAPointer? by lazy {
    __1656514306_Interface.__1656514306_Ptr
  }


  public override val __42528161_Ptr: JNAPointer? by lazy {
    __42528161_Interface.__42528161_Ptr
  }


  public override val __1656514305_Ptr: JNAPointer? by lazy {
    __1656514305_Interface.__1656514305_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1161814604_Interface, __1656514306_Interface, __42528161_Interface,
        __1656514305_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1161814604(): IContact.WithDefault {
    if(pointer == NULL) {
      return(IContact.ABI.makeIContact(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContact>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContact.ABI.makeIContact(ref.value))
  }

  private fun as_1656514306(): IContact2.WithDefault {
    if(pointer == NULL) {
      return(IContact2.ABI.makeIContact2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContact2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContact2.ABI.makeIContact2(ref.value))
  }

  private fun as_42528161(): IContactName.WithDefault {
    if(pointer == NULL) {
      return(IContactName.ABI.makeIContactName(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactName>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactName.ABI.makeIContactName(ref.value))
  }

  private fun as_1656514305(): IContact3.WithDefault {
    if(pointer == NULL) {
      return(IContact3.ABI.makeIContact3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContact3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContact3.ABI.makeIContact3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Contact> {
    public override fun getValue() = Contact(pointer.getPointer(0))

    public fun setValue(value: Contact): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Contact, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.Contact".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): Contact {
      val address = segment.toRawLongValue()
      return Contact(Pointer(address))
    }

    public override fun toNative(obj: Contact): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
