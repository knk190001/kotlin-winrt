package Windows.Phone.PersonalInformation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(KnownContactProperties.ABI::class)
@WinRTByReference(brClass = KnownContactProperties.ByReference::class)
public class KnownContactProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownContactProperties> {
    public override fun getValue() = KnownContactProperties(pointer.getPointer(0))

    public fun setValue(value: KnownContactProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownContactProperties, MemoryAddress> {
    public val IKnownContactPropertiesStatics_Instance: IKnownContactPropertiesStatics by lazy {
      createIKnownContactPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownContactPropertiesStatics(): IKnownContactPropertiesStatics {
      val refiid = Guid.REFIID(IKnownContactPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.PersonalInformation.KnownContactProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownContactPropertiesStatics.ABI.makeIKnownContactPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownContactProperties {
      val address = segment.toRawLongValue()
      return KnownContactProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownContactProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DisplayName() = ABI.IKnownContactPropertiesStatics_Instance.get_DisplayName()

    public fun get_FamilyName() = ABI.IKnownContactPropertiesStatics_Instance.get_FamilyName()

    public fun get_GivenName() = ABI.IKnownContactPropertiesStatics_Instance.get_GivenName()

    public fun get_HonorificPrefix() =
        ABI.IKnownContactPropertiesStatics_Instance.get_HonorificPrefix()

    public fun get_HonorificSuffix() =
        ABI.IKnownContactPropertiesStatics_Instance.get_HonorificSuffix()

    public fun get_AdditionalName() =
        ABI.IKnownContactPropertiesStatics_Instance.get_AdditionalName()

    public fun get_Address() = ABI.IKnownContactPropertiesStatics_Instance.get_Address()

    public fun get_OtherAddress() = ABI.IKnownContactPropertiesStatics_Instance.get_OtherAddress()

    public fun get_Email() = ABI.IKnownContactPropertiesStatics_Instance.get_Email()

    public fun get_WorkAddress() = ABI.IKnownContactPropertiesStatics_Instance.get_WorkAddress()

    public fun get_WorkTelephone() = ABI.IKnownContactPropertiesStatics_Instance.get_WorkTelephone()

    public fun get_JobTitle() = ABI.IKnownContactPropertiesStatics_Instance.get_JobTitle()

    public fun get_Birthdate() = ABI.IKnownContactPropertiesStatics_Instance.get_Birthdate()

    public fun get_Anniversary() = ABI.IKnownContactPropertiesStatics_Instance.get_Anniversary()

    public fun get_Telephone() = ABI.IKnownContactPropertiesStatics_Instance.get_Telephone()

    public fun get_MobileTelephone() =
        ABI.IKnownContactPropertiesStatics_Instance.get_MobileTelephone()

    public fun get_Url() = ABI.IKnownContactPropertiesStatics_Instance.get_Url()

    public fun get_Notes() = ABI.IKnownContactPropertiesStatics_Instance.get_Notes()

    public fun get_WorkFax() = ABI.IKnownContactPropertiesStatics_Instance.get_WorkFax()

    public fun get_Children() = ABI.IKnownContactPropertiesStatics_Instance.get_Children()

    public fun get_SignificantOther() =
        ABI.IKnownContactPropertiesStatics_Instance.get_SignificantOther()

    public fun get_CompanyName() = ABI.IKnownContactPropertiesStatics_Instance.get_CompanyName()

    public fun get_CompanyTelephone() =
        ABI.IKnownContactPropertiesStatics_Instance.get_CompanyTelephone()

    public fun get_HomeFax() = ABI.IKnownContactPropertiesStatics_Instance.get_HomeFax()

    public fun get_AlternateTelephone() =
        ABI.IKnownContactPropertiesStatics_Instance.get_AlternateTelephone()

    public fun get_Manager() = ABI.IKnownContactPropertiesStatics_Instance.get_Manager()

    public fun get_Nickname() = ABI.IKnownContactPropertiesStatics_Instance.get_Nickname()

    public fun get_OfficeLocation() =
        ABI.IKnownContactPropertiesStatics_Instance.get_OfficeLocation()

    public fun get_WorkEmail() = ABI.IKnownContactPropertiesStatics_Instance.get_WorkEmail()

    public fun get_YomiGivenName() = ABI.IKnownContactPropertiesStatics_Instance.get_YomiGivenName()

    public fun get_YomiFamilyName() =
        ABI.IKnownContactPropertiesStatics_Instance.get_YomiFamilyName()

    public fun get_YomiCompanyName() =
        ABI.IKnownContactPropertiesStatics_Instance.get_YomiCompanyName()

    public fun get_OtherEmail() = ABI.IKnownContactPropertiesStatics_Instance.get_OtherEmail()

    public fun get_AlternateMobileTelephone() =
        ABI.IKnownContactPropertiesStatics_Instance.get_AlternateMobileTelephone()

    public fun get_AlternateWorkTelephone() =
        ABI.IKnownContactPropertiesStatics_Instance.get_AlternateWorkTelephone()
  }
}
