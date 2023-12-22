package Windows.Security.Cryptography.Core

import Windows.Security.Cryptography.Certificates.Certificate
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

@ABIMarker(PersistedKeyProvider.ABI::class)
@WinRTByReference(brClass = PersistedKeyProvider.ByReference::class)
public class PersistedKeyProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PersistedKeyProvider> {
    public override fun getValue() = PersistedKeyProvider(pointer.getPointer(0))

    public fun setValue(value: PersistedKeyProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PersistedKeyProvider, MemoryAddress> {
    public val IPersistedKeyProviderStatics_Instance: IPersistedKeyProviderStatics by lazy {
      createIPersistedKeyProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPersistedKeyProviderStatics(): IPersistedKeyProviderStatics {
      val refiid = Guid.REFIID(IPersistedKeyProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.PersistedKeyProvider".toHandle(),refiid,interfacePtr)
      val result =
          IPersistedKeyProviderStatics.ABI.makeIPersistedKeyProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PersistedKeyProvider {
      val address = segment.toRawLongValue()
      return PersistedKeyProvider(Pointer(address))
    }

    public override fun toNative(obj: PersistedKeyProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenKeyPairFromCertificateAsync(
      certificate: Certificate,
      hashAlgorithmName: String,
      padding: CryptographicPadding
    ) = ABI.IPersistedKeyProviderStatics_Instance.OpenKeyPairFromCertificateAsync(certificate,
        hashAlgorithmName, padding)

    public fun OpenPublicKeyFromCertificate(
      certificate: Certificate,
      hashAlgorithmName: String,
      padding: CryptographicPadding
    ) = ABI.IPersistedKeyProviderStatics_Instance.OpenPublicKeyFromCertificate(certificate,
        hashAlgorithmName, padding)
  }
}
