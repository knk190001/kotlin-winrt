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

@ABIMarker(KeyDerivationAlgorithmNames.ABI::class)
@WinRTByReference(brClass = KeyDerivationAlgorithmNames.ByReference::class)
public class KeyDerivationAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyDerivationAlgorithmNames> {
    public override fun getValue() = KeyDerivationAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: KeyDerivationAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyDerivationAlgorithmNames, MemoryAddress> {
    public val IKeyDerivationAlgorithmNamesStatics2_Instance: IKeyDerivationAlgorithmNamesStatics2
        by lazy {
      createIKeyDerivationAlgorithmNamesStatics2()
    }


    public val IKeyDerivationAlgorithmNamesStatics_Instance: IKeyDerivationAlgorithmNamesStatics by
        lazy {
      createIKeyDerivationAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyDerivationAlgorithmNamesStatics2(): IKeyDerivationAlgorithmNamesStatics2 {
      val refiid = Guid.REFIID(IKeyDerivationAlgorithmNamesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result =
          IKeyDerivationAlgorithmNamesStatics2.ABI.makeIKeyDerivationAlgorithmNamesStatics2(interfacePtr.value)
      return result
    }

    public fun createIKeyDerivationAlgorithmNamesStatics(): IKeyDerivationAlgorithmNamesStatics {
      val refiid = Guid.REFIID(IKeyDerivationAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result =
          IKeyDerivationAlgorithmNamesStatics.ABI.makeIKeyDerivationAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyDerivationAlgorithmNames {
      val address = segment.toRawLongValue()
      return KeyDerivationAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: KeyDerivationAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CapiKdfMd5() = ABI.IKeyDerivationAlgorithmNamesStatics2_Instance.get_CapiKdfMd5()

    public fun get_CapiKdfSha1() =
        ABI.IKeyDerivationAlgorithmNamesStatics2_Instance.get_CapiKdfSha1()

    public fun get_CapiKdfSha256() =
        ABI.IKeyDerivationAlgorithmNamesStatics2_Instance.get_CapiKdfSha256()

    public fun get_CapiKdfSha384() =
        ABI.IKeyDerivationAlgorithmNamesStatics2_Instance.get_CapiKdfSha384()

    public fun get_CapiKdfSha512() =
        ABI.IKeyDerivationAlgorithmNamesStatics2_Instance.get_CapiKdfSha512()

    public fun get_Pbkdf2Md5() = ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Pbkdf2Md5()

    public fun get_Pbkdf2Sha1() = ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Pbkdf2Sha1()

    public fun get_Pbkdf2Sha256() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Pbkdf2Sha256()

    public fun get_Pbkdf2Sha384() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Pbkdf2Sha384()

    public fun get_Pbkdf2Sha512() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Pbkdf2Sha512()

    public fun get_Sp800108CtrHmacMd5() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp800108CtrHmacMd5()

    public fun get_Sp800108CtrHmacSha1() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp800108CtrHmacSha1()

    public fun get_Sp800108CtrHmacSha256() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp800108CtrHmacSha256()

    public fun get_Sp800108CtrHmacSha384() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp800108CtrHmacSha384()

    public fun get_Sp800108CtrHmacSha512() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp800108CtrHmacSha512()

    public fun get_Sp80056aConcatMd5() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp80056aConcatMd5()

    public fun get_Sp80056aConcatSha1() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp80056aConcatSha1()

    public fun get_Sp80056aConcatSha256() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp80056aConcatSha256()

    public fun get_Sp80056aConcatSha384() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp80056aConcatSha384()

    public fun get_Sp80056aConcatSha512() =
        ABI.IKeyDerivationAlgorithmNamesStatics_Instance.get_Sp80056aConcatSha512()
  }
}
