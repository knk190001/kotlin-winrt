package Windows.Security.Cryptography.Certificates

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CertificateEnrollmentManager.ABI::class)
@WinRTByReference(brClass = CertificateEnrollmentManager.ByReference::class)
public class CertificateEnrollmentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateEnrollmentManager> {
    public override fun getValue() = CertificateEnrollmentManager(pointer.getPointer(0))

    public fun setValue(value: CertificateEnrollmentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateEnrollmentManager, MemoryAddress> {
    public val ICertificateEnrollmentManagerStatics2_Instance: ICertificateEnrollmentManagerStatics2
        by lazy {
      createICertificateEnrollmentManagerStatics2()
    }


    public val ICertificateEnrollmentManagerStatics_Instance: ICertificateEnrollmentManagerStatics
        by lazy {
      createICertificateEnrollmentManagerStatics()
    }


    public val ICertificateEnrollmentManagerStatics3_Instance: ICertificateEnrollmentManagerStatics3
        by lazy {
      createICertificateEnrollmentManagerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICertificateEnrollmentManagerStatics2():
        ICertificateEnrollmentManagerStatics2 {
      val refiid = Guid.REFIID(ICertificateEnrollmentManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager".toHandle(),refiid,interfacePtr)
      val result =
          ICertificateEnrollmentManagerStatics2.ABI.makeICertificateEnrollmentManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createICertificateEnrollmentManagerStatics(): ICertificateEnrollmentManagerStatics {
      val refiid = Guid.REFIID(ICertificateEnrollmentManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager".toHandle(),refiid,interfacePtr)
      val result =
          ICertificateEnrollmentManagerStatics.ABI.makeICertificateEnrollmentManagerStatics(interfacePtr.value)
      return result
    }

    public fun createICertificateEnrollmentManagerStatics3():
        ICertificateEnrollmentManagerStatics3 {
      val refiid = Guid.REFIID(ICertificateEnrollmentManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager".toHandle(),refiid,interfacePtr)
      val result =
          ICertificateEnrollmentManagerStatics3.ABI.makeICertificateEnrollmentManagerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CertificateEnrollmentManager {
      val address = segment.toRawLongValue()
      return CertificateEnrollmentManager(Pointer(address))
    }

    public override fun toNative(obj: CertificateEnrollmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UserCertificateEnrollmentManager() =
        ABI.ICertificateEnrollmentManagerStatics2_Instance.get_UserCertificateEnrollmentManager()

    public fun ImportPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String,
      keyStorageProvider: String
    ) = ABI.ICertificateEnrollmentManagerStatics2_Instance.ImportPfxDataAsync(pfxData, password,
        exportable, keyProtectionLevel, installOption, friendlyName, keyStorageProvider)

    public fun CreateRequestAsync(request: CertificateRequestProperties) =
        ABI.ICertificateEnrollmentManagerStatics_Instance.CreateRequestAsync(request)

    public fun InstallCertificateAsync(certificate: String, installOption: InstallOptions) =
        ABI.ICertificateEnrollmentManagerStatics_Instance.InstallCertificateAsync(certificate,
        installOption)

    public fun ImportPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ) = ABI.ICertificateEnrollmentManagerStatics_Instance.ImportPfxDataAsync(pfxData, password,
        exportable, keyProtectionLevel, installOption, friendlyName)

    public fun ImportPfxDataAsync(
      pfxData: String,
      password: String,
      pfxImportParameters: PfxImportParameters
    ) = ABI.ICertificateEnrollmentManagerStatics3_Instance.ImportPfxDataAsync(pfxData, password,
        pfxImportParameters)
  }
}
