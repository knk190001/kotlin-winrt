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

@ABIMarker(ContactFieldFactory.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactFieldFactory;{85e2913f-0e4a-4a3e-8994-406ae7ed646e})")
@WinRTByReference(brClass = ContactFieldFactory.ByReference::class)
public class ContactFieldFactory(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactFieldFactory.WithDefault, IContactLocationFieldFactory.WithDefault,
    IContactInstantMessageFieldFactory.WithDefault, IWinRTObject {
  private val __152076668_Interface: IContactFieldFactory.WithDefault by lazy {
    as_152076668()
  }


  private val __592415015_Interface: IContactLocationFieldFactory.WithDefault by lazy {
    as_592415015()
  }


  private val __1773360758_Interface: IContactInstantMessageFieldFactory.WithDefault by lazy {
    as_1773360758()
  }


  public override val __152076668_Ptr: JNAPointer? by lazy {
    __152076668_Interface.__152076668_Ptr
  }


  public override val __592415015_Ptr: JNAPointer? by lazy {
    __592415015_Interface.__592415015_Ptr
  }


  public override val __1773360758_Ptr: JNAPointer? by lazy {
    __1773360758_Interface.__1773360758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__152076668_Interface, __592415015_Interface, __1773360758_Interface)

  public constructor() : this(ABI.activate())

  private fun as_152076668(): IContactFieldFactory.WithDefault {
    if(pointer == NULL) {
      return(IContactFieldFactory.ABI.makeIContactFieldFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactFieldFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactFieldFactory.ABI.makeIContactFieldFactory(ref.value))
  }

  private fun as_592415015(): IContactLocationFieldFactory.WithDefault {
    if(pointer == NULL) {
      return(IContactLocationFieldFactory.ABI.makeIContactLocationFieldFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactLocationFieldFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactLocationFieldFactory.ABI.makeIContactLocationFieldFactory(ref.value))
  }

  private fun as_1773360758(): IContactInstantMessageFieldFactory.WithDefault {
    if(pointer == NULL) {
      return(IContactInstantMessageFieldFactory.ABI.makeIContactInstantMessageFieldFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInstantMessageFieldFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInstantMessageFieldFactory.ABI.makeIContactInstantMessageFieldFactory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactFieldFactory> {
    public override fun getValue() = ContactFieldFactory(pointer.getPointer(0))

    public fun setValue(value: ContactFieldFactory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactFieldFactory, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactFieldFactory".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContactFieldFactory {
      val address = segment.toRawLongValue()
      return ContactFieldFactory(Pointer(address))
    }

    public override fun toNative(obj: ContactFieldFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
