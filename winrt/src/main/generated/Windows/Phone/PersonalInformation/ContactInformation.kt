package Windows.Phone.PersonalInformation

import Windows.Storage.Streams.IInputStream
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

@ABIMarker(ContactInformation.ABI::class)
@Signature("rc(Windows.Phone.PersonalInformation.ContactInformation;{e2b51ffc-e792-4ab7-b15b-f2e078664dea})")
@WinRTByReference(brClass = ContactInformation.ByReference::class)
public class ContactInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactInformation.WithDefault, IWinRTObject {
  private val __3320524_Interface: IContactInformation.WithDefault by lazy {
    as_3320524()
  }


  public override val __3320524_Ptr: JNAPointer? by lazy {
    __3320524_Interface.__3320524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__3320524_Interface)

  public constructor() : this(ABI.activate())

  private fun as_3320524(): IContactInformation.WithDefault {
    if(pointer == NULL) {
      return(IContactInformation.ABI.makeIContactInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactInformation.ABI.makeIContactInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContactInformation> {
    public override fun getValue() = ContactInformation(pointer.getPointer(0))

    public fun setValue(value: ContactInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContactInformation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContactInformationStatics_Instance: IContactInformationStatics by lazy {
      createIContactInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.ContactInformation".toHandle(),
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

    public fun createIContactInformationStatics(): IContactInformationStatics {
      val refiid = Guid.REFIID(IContactInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.ContactInformation".toHandle(),refiid,interfacePtr)
      val result = IContactInformationStatics.ABI.makeIContactInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContactInformation {
      val address = segment.toRawLongValue()
      return ContactInformation(Pointer(address))
    }

    public override fun toNative(obj: ContactInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ParseVcardAsync(vcard: IInputStream) =
        ABI.IContactInformationStatics_Instance.ParseVcardAsync(vcard)
  }
}
