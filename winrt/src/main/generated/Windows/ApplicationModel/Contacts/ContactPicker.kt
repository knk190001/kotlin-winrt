package Windows.ApplicationModel.Contacts

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(ContactPicker.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.ContactPicker;{0e09fd91-42f8-4055-90a0-896f96738936})")
@WinRTByReference(brClass = ContactPicker.ByReference::class)
public class ContactPicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactPicker.WithDefault, IContactPicker2.WithDefault,
    IContactPicker3.WithDefault, IWinRTObject {
  private val __2144467810_Interface: IContactPicker.WithDefault by lazy {
    as_2144467810()
  }


  private val __2053992720_Interface: IContactPicker2.WithDefault by lazy {
    as_2053992720()
  }


  private val __2053992721_Interface: IContactPicker3.WithDefault by lazy {
    as_2053992721()
  }


  public override val __2144467810_Ptr: JNAPointer? by lazy {
    __2144467810_Interface.__2144467810_Ptr
  }


  public override val __2053992720_Ptr: JNAPointer? by lazy {
    __2053992720_Interface.__2053992720_Ptr
  }


  public override val __2053992721_Ptr: JNAPointer? by lazy {
    __2053992721_Interface.__2053992721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2144467810_Interface, __2053992720_Interface, __2053992721_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2144467810(): IContactPicker.WithDefault {
    if(pointer == NULL) {
      return(IContactPicker.ABI.makeIContactPicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPicker.ABI.makeIContactPicker(ref.value))
  }

  private fun as_2053992720(): IContactPicker2.WithDefault {
    if(pointer == NULL) {
      return(IContactPicker2.ABI.makeIContactPicker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPicker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPicker2.ABI.makeIContactPicker2(ref.value))
  }

  private fun as_2053992721(): IContactPicker3.WithDefault {
    if(pointer == NULL) {
      return(IContactPicker3.ABI.makeIContactPicker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactPicker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactPicker3.ABI.makeIContactPicker3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContactPicker>
      {
    public override fun getValue() = ContactPicker(pointer.getPointer(0))

    public fun setValue(value: ContactPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactPicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContactPickerStatics_Instance: IContactPickerStatics by lazy {
      createIContactPickerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactPicker".toHandle(),
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

    public fun createIContactPickerStatics(): IContactPickerStatics {
      val refiid = Guid.REFIID(IContactPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.ContactPicker".toHandle(),refiid,interfacePtr)
      val result = IContactPickerStatics.ABI.makeIContactPickerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContactPicker {
      val address = segment.toRawLongValue()
      return ContactPicker(Pointer(address))
    }

    public override fun toNative(obj: ContactPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForUser(user: User) = ABI.IContactPickerStatics_Instance.CreateForUser(user)

    public fun IsSupportedAsync() = ABI.IContactPickerStatics_Instance.IsSupportedAsync()
  }
}
