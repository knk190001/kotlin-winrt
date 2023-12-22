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

@ABIMarker(EccCurveNames.ABI::class)
@WinRTByReference(brClass = EccCurveNames.ByReference::class)
public class EccCurveNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EccCurveNames>
      {
    public override fun getValue() = EccCurveNames(pointer.getPointer(0))

    public fun setValue(value: EccCurveNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EccCurveNames, MemoryAddress> {
    public val IEccCurveNamesStatics_Instance: IEccCurveNamesStatics by lazy {
      createIEccCurveNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEccCurveNamesStatics(): IEccCurveNamesStatics {
      val refiid = Guid.REFIID(IEccCurveNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.EccCurveNames".toHandle(),refiid,interfacePtr)
      val result = IEccCurveNamesStatics.ABI.makeIEccCurveNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EccCurveNames {
      val address = segment.toRawLongValue()
      return EccCurveNames(Pointer(address))
    }

    public override fun toNative(obj: EccCurveNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BrainpoolP160r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP160r1()

    public fun get_BrainpoolP160t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP160t1()

    public fun get_BrainpoolP192r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP192r1()

    public fun get_BrainpoolP192t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP192t1()

    public fun get_BrainpoolP224r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP224r1()

    public fun get_BrainpoolP224t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP224t1()

    public fun get_BrainpoolP256r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP256r1()

    public fun get_BrainpoolP256t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP256t1()

    public fun get_BrainpoolP320r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP320r1()

    public fun get_BrainpoolP320t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP320t1()

    public fun get_BrainpoolP384r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP384r1()

    public fun get_BrainpoolP384t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP384t1()

    public fun get_BrainpoolP512r1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP512r1()

    public fun get_BrainpoolP512t1() = ABI.IEccCurveNamesStatics_Instance.get_BrainpoolP512t1()

    public fun get_Curve25519() = ABI.IEccCurveNamesStatics_Instance.get_Curve25519()

    public fun get_Ec192wapi() = ABI.IEccCurveNamesStatics_Instance.get_Ec192wapi()

    public fun get_NistP192() = ABI.IEccCurveNamesStatics_Instance.get_NistP192()

    public fun get_NistP224() = ABI.IEccCurveNamesStatics_Instance.get_NistP224()

    public fun get_NistP256() = ABI.IEccCurveNamesStatics_Instance.get_NistP256()

    public fun get_NistP384() = ABI.IEccCurveNamesStatics_Instance.get_NistP384()

    public fun get_NistP521() = ABI.IEccCurveNamesStatics_Instance.get_NistP521()

    public fun get_NumsP256t1() = ABI.IEccCurveNamesStatics_Instance.get_NumsP256t1()

    public fun get_NumsP384t1() = ABI.IEccCurveNamesStatics_Instance.get_NumsP384t1()

    public fun get_NumsP512t1() = ABI.IEccCurveNamesStatics_Instance.get_NumsP512t1()

    public fun get_SecP160k1() = ABI.IEccCurveNamesStatics_Instance.get_SecP160k1()

    public fun get_SecP160r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP160r1()

    public fun get_SecP160r2() = ABI.IEccCurveNamesStatics_Instance.get_SecP160r2()

    public fun get_SecP192k1() = ABI.IEccCurveNamesStatics_Instance.get_SecP192k1()

    public fun get_SecP192r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP192r1()

    public fun get_SecP224k1() = ABI.IEccCurveNamesStatics_Instance.get_SecP224k1()

    public fun get_SecP224r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP224r1()

    public fun get_SecP256k1() = ABI.IEccCurveNamesStatics_Instance.get_SecP256k1()

    public fun get_SecP256r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP256r1()

    public fun get_SecP384r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP384r1()

    public fun get_SecP521r1() = ABI.IEccCurveNamesStatics_Instance.get_SecP521r1()

    public fun get_Wtls7() = ABI.IEccCurveNamesStatics_Instance.get_Wtls7()

    public fun get_Wtls9() = ABI.IEccCurveNamesStatics_Instance.get_Wtls9()

    public fun get_Wtls12() = ABI.IEccCurveNamesStatics_Instance.get_Wtls12()

    public fun get_X962P192v1() = ABI.IEccCurveNamesStatics_Instance.get_X962P192v1()

    public fun get_X962P192v2() = ABI.IEccCurveNamesStatics_Instance.get_X962P192v2()

    public fun get_X962P192v3() = ABI.IEccCurveNamesStatics_Instance.get_X962P192v3()

    public fun get_X962P239v1() = ABI.IEccCurveNamesStatics_Instance.get_X962P239v1()

    public fun get_X962P239v2() = ABI.IEccCurveNamesStatics_Instance.get_X962P239v2()

    public fun get_X962P239v3() = ABI.IEccCurveNamesStatics_Instance.get_X962P239v3()

    public fun get_X962P256v1() = ABI.IEccCurveNamesStatics_Instance.get_X962P256v1()

    public fun get_AllEccCurveNames() = ABI.IEccCurveNamesStatics_Instance.get_AllEccCurveNames()
  }
}
