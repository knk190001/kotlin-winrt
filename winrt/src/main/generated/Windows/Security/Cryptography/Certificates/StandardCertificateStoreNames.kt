package Windows.Security.Cryptography.Certificates

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

@ABIMarker(StandardCertificateStoreNames.ABI::class)
@WinRTByReference(brClass = StandardCertificateStoreNames.ByReference::class)
public class StandardCertificateStoreNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StandardCertificateStoreNames> {
    public override fun getValue() = StandardCertificateStoreNames(pointer.getPointer(0))

    public fun setValue(value: StandardCertificateStoreNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StandardCertificateStoreNames, MemoryAddress> {
    public val IStandardCertificateStoreNamesStatics_Instance: IStandardCertificateStoreNamesStatics
        by lazy {
      createIStandardCertificateStoreNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStandardCertificateStoreNamesStatics():
        IStandardCertificateStoreNamesStatics {
      val refiid = Guid.REFIID(IStandardCertificateStoreNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.StandardCertificateStoreNames".toHandle(),refiid,interfacePtr)
      val result =
          IStandardCertificateStoreNamesStatics.ABI.makeIStandardCertificateStoreNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StandardCertificateStoreNames {
      val address = segment.toRawLongValue()
      return StandardCertificateStoreNames(Pointer(address))
    }

    public override fun toNative(obj: StandardCertificateStoreNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Personal() = ABI.IStandardCertificateStoreNamesStatics_Instance.get_Personal()

    public fun get_TrustedRootCertificationAuthorities() =
        ABI.IStandardCertificateStoreNamesStatics_Instance.get_TrustedRootCertificationAuthorities()

    public fun get_IntermediateCertificationAuthorities() =
        ABI.IStandardCertificateStoreNamesStatics_Instance.get_IntermediateCertificationAuthorities()
  }
}
