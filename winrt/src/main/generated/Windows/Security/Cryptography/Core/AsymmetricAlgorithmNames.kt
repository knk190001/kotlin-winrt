package Windows.Security.Cryptography.Core

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AsymmetricAlgorithmNames.ABI::class)
@WinRTByReference(brClass = AsymmetricAlgorithmNames.ByReference::class)
public class AsymmetricAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsymmetricAlgorithmNames> {
    public override fun getValue() = AsymmetricAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: AsymmetricAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AsymmetricAlgorithmNames, MemoryAddress> {
    public val IAsymmetricAlgorithmNamesStatics2_Instance: IAsymmetricAlgorithmNamesStatics2 by
        lazy {
      createIAsymmetricAlgorithmNamesStatics2()
    }


    public val IAsymmetricAlgorithmNamesStatics_Instance: IAsymmetricAlgorithmNamesStatics by lazy {
      createIAsymmetricAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAsymmetricAlgorithmNamesStatics2(): IAsymmetricAlgorithmNamesStatics2 {
      val refiid = Guid.REFIID(IAsymmetricAlgorithmNamesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result =
          IAsymmetricAlgorithmNamesStatics2.ABI.makeIAsymmetricAlgorithmNamesStatics2(interfacePtr.value)
      return result
    }

    public fun createIAsymmetricAlgorithmNamesStatics(): IAsymmetricAlgorithmNamesStatics {
      val refiid = Guid.REFIID(IAsymmetricAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.AsymmetricAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result =
          IAsymmetricAlgorithmNamesStatics.ABI.makeIAsymmetricAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AsymmetricAlgorithmNames {
      val address = segment.toRawLongValue()
      return AsymmetricAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: AsymmetricAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EcdsaSha256() = ABI.IAsymmetricAlgorithmNamesStatics2_Instance.get_EcdsaSha256()

    public fun get_EcdsaSha384() = ABI.IAsymmetricAlgorithmNamesStatics2_Instance.get_EcdsaSha384()

    public fun get_EcdsaSha512() = ABI.IAsymmetricAlgorithmNamesStatics2_Instance.get_EcdsaSha512()

    public fun get_RsaPkcs1() = ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaPkcs1()

    public fun get_RsaOaepSha1() = ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaOaepSha1()

    public fun get_RsaOaepSha256() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaOaepSha256()

    public fun get_RsaOaepSha384() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaOaepSha384()

    public fun get_RsaOaepSha512() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaOaepSha512()

    public fun get_EcdsaP256Sha256() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_EcdsaP256Sha256()

    public fun get_EcdsaP384Sha384() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_EcdsaP384Sha384()

    public fun get_EcdsaP521Sha512() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_EcdsaP521Sha512()

    public fun get_DsaSha1() = ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_DsaSha1()

    public fun get_DsaSha256() = ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_DsaSha256()

    public fun get_RsaSignPkcs1Sha1() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPkcs1Sha1()

    public fun get_RsaSignPkcs1Sha256() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPkcs1Sha256()

    public fun get_RsaSignPkcs1Sha384() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPkcs1Sha384()

    public fun get_RsaSignPkcs1Sha512() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPkcs1Sha512()

    public fun get_RsaSignPssSha1() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPssSha1()

    public fun get_RsaSignPssSha256() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPssSha256()

    public fun get_RsaSignPssSha384() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPssSha384()

    public fun get_RsaSignPssSha512() =
        ABI.IAsymmetricAlgorithmNamesStatics_Instance.get_RsaSignPssSha512()
  }
}
