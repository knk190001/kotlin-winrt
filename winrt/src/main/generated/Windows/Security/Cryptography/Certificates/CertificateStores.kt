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

@ABIMarker(CertificateStores.ABI::class)
@WinRTByReference(brClass = CertificateStores.ByReference::class)
public class CertificateStores(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateStores> {
    public override fun getValue() = CertificateStores(pointer.getPointer(0))

    public fun setValue(value: CertificateStores): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateStores, MemoryAddress> {
    public val ICertificateStoresStatics_Instance: ICertificateStoresStatics by lazy {
      createICertificateStoresStatics()
    }


    public val ICertificateStoresStatics2_Instance: ICertificateStoresStatics2 by lazy {
      createICertificateStoresStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICertificateStoresStatics(): ICertificateStoresStatics {
      val refiid = Guid.REFIID(ICertificateStoresStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateStores".toHandle(),refiid,interfacePtr)
      val result = ICertificateStoresStatics.ABI.makeICertificateStoresStatics(interfacePtr.value)
      return result
    }

    public fun createICertificateStoresStatics2(): ICertificateStoresStatics2 {
      val refiid = Guid.REFIID(ICertificateStoresStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateStores".toHandle(),refiid,interfacePtr)
      val result = ICertificateStoresStatics2.ABI.makeICertificateStoresStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CertificateStores {
      val address = segment.toRawLongValue()
      return CertificateStores(Pointer(address))
    }

    public override fun toNative(obj: CertificateStores): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAllAsync() = ABI.ICertificateStoresStatics_Instance.FindAllAsync()

    public fun FindAllAsync(query: CertificateQuery) =
        ABI.ICertificateStoresStatics_Instance.FindAllAsync(query)

    public fun get_TrustedRootCertificationAuthorities() =
        ABI.ICertificateStoresStatics_Instance.get_TrustedRootCertificationAuthorities()

    public fun get_IntermediateCertificationAuthorities() =
        ABI.ICertificateStoresStatics_Instance.get_IntermediateCertificationAuthorities()

    public fun GetStoreByName(storeName: String) =
        ABI.ICertificateStoresStatics_Instance.GetStoreByName(storeName)

    public fun GetUserStoreByName(storeName: String) =
        ABI.ICertificateStoresStatics2_Instance.GetUserStoreByName(storeName)
  }
}
