package Windows.Security.Cryptography.Core

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

@ABIMarker(SymmetricAlgorithmNames.ABI::class)
@WinRTByReference(brClass = SymmetricAlgorithmNames.ByReference::class)
public class SymmetricAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SymmetricAlgorithmNames> {
    public override fun getValue() = SymmetricAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: SymmetricAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SymmetricAlgorithmNames, MemoryAddress> {
    public val ISymmetricAlgorithmNamesStatics_Instance: ISymmetricAlgorithmNamesStatics by lazy {
      createISymmetricAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISymmetricAlgorithmNamesStatics(): ISymmetricAlgorithmNamesStatics {
      val refiid = Guid.REFIID(ISymmetricAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.SymmetricAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result =
          ISymmetricAlgorithmNamesStatics.ABI.makeISymmetricAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SymmetricAlgorithmNames {
      val address = segment.toRawLongValue()
      return SymmetricAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: SymmetricAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DesCbc() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_DesCbc()

    public fun get_DesEcb() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_DesEcb()

    public fun get_TripleDesCbc() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_TripleDesCbc()

    public fun get_TripleDesEcb() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_TripleDesEcb()

    public fun get_Rc2Cbc() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_Rc2Cbc()

    public fun get_Rc2Ecb() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_Rc2Ecb()

    public fun get_AesCbc() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesCbc()

    public fun get_AesEcb() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesEcb()

    public fun get_AesGcm() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesGcm()

    public fun get_AesCcm() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesCcm()

    public fun get_AesCbcPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesCbcPkcs7()

    public fun get_AesEcbPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_AesEcbPkcs7()

    public fun get_DesCbcPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_DesCbcPkcs7()

    public fun get_DesEcbPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_DesEcbPkcs7()

    public fun get_TripleDesCbcPkcs7() =
        ABI.ISymmetricAlgorithmNamesStatics_Instance.get_TripleDesCbcPkcs7()

    public fun get_TripleDesEcbPkcs7() =
        ABI.ISymmetricAlgorithmNamesStatics_Instance.get_TripleDesEcbPkcs7()

    public fun get_Rc2CbcPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_Rc2CbcPkcs7()

    public fun get_Rc2EcbPkcs7() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_Rc2EcbPkcs7()

    public fun get_Rc4() = ABI.ISymmetricAlgorithmNamesStatics_Instance.get_Rc4()
  }
}
