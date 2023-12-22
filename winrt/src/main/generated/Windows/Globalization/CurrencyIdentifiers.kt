package Windows.Globalization

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

@ABIMarker(CurrencyIdentifiers.ABI::class)
@WinRTByReference(brClass = CurrencyIdentifiers.ByReference::class)
public class CurrencyIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrencyIdentifiers> {
    public override fun getValue() = CurrencyIdentifiers(pointer.getPointer(0))

    public fun setValue(value: CurrencyIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrencyIdentifiers, MemoryAddress> {
    public val ICurrencyIdentifiersStatics_Instance: ICurrencyIdentifiersStatics by lazy {
      createICurrencyIdentifiersStatics()
    }


    public val ICurrencyIdentifiersStatics2_Instance: ICurrencyIdentifiersStatics2 by lazy {
      createICurrencyIdentifiersStatics2()
    }


    public val ICurrencyIdentifiersStatics3_Instance: ICurrencyIdentifiersStatics3 by lazy {
      createICurrencyIdentifiersStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrencyIdentifiersStatics(): ICurrencyIdentifiersStatics {
      val refiid = Guid.REFIID(ICurrencyIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CurrencyIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICurrencyIdentifiersStatics.ABI.makeICurrencyIdentifiersStatics(interfacePtr.value)
      return result
    }

    public fun createICurrencyIdentifiersStatics2(): ICurrencyIdentifiersStatics2 {
      val refiid = Guid.REFIID(ICurrencyIdentifiersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CurrencyIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICurrencyIdentifiersStatics2.ABI.makeICurrencyIdentifiersStatics2(interfacePtr.value)
      return result
    }

    public fun createICurrencyIdentifiersStatics3(): ICurrencyIdentifiersStatics3 {
      val refiid = Guid.REFIID(ICurrencyIdentifiersStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CurrencyIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICurrencyIdentifiersStatics3.ABI.makeICurrencyIdentifiersStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CurrencyIdentifiers {
      val address = segment.toRawLongValue()
      return CurrencyIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: CurrencyIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AED() = ABI.ICurrencyIdentifiersStatics_Instance.get_AED()

    public fun get_AFN() = ABI.ICurrencyIdentifiersStatics_Instance.get_AFN()

    public fun get_ALL() = ABI.ICurrencyIdentifiersStatics_Instance.get_ALL()

    public fun get_AMD() = ABI.ICurrencyIdentifiersStatics_Instance.get_AMD()

    public fun get_ANG() = ABI.ICurrencyIdentifiersStatics_Instance.get_ANG()

    public fun get_AOA() = ABI.ICurrencyIdentifiersStatics_Instance.get_AOA()

    public fun get_ARS() = ABI.ICurrencyIdentifiersStatics_Instance.get_ARS()

    public fun get_AUD() = ABI.ICurrencyIdentifiersStatics_Instance.get_AUD()

    public fun get_AWG() = ABI.ICurrencyIdentifiersStatics_Instance.get_AWG()

    public fun get_AZN() = ABI.ICurrencyIdentifiersStatics_Instance.get_AZN()

    public fun get_BAM() = ABI.ICurrencyIdentifiersStatics_Instance.get_BAM()

    public fun get_BBD() = ABI.ICurrencyIdentifiersStatics_Instance.get_BBD()

    public fun get_BDT() = ABI.ICurrencyIdentifiersStatics_Instance.get_BDT()

    public fun get_BGN() = ABI.ICurrencyIdentifiersStatics_Instance.get_BGN()

    public fun get_BHD() = ABI.ICurrencyIdentifiersStatics_Instance.get_BHD()

    public fun get_BIF() = ABI.ICurrencyIdentifiersStatics_Instance.get_BIF()

    public fun get_BMD() = ABI.ICurrencyIdentifiersStatics_Instance.get_BMD()

    public fun get_BND() = ABI.ICurrencyIdentifiersStatics_Instance.get_BND()

    public fun get_BOB() = ABI.ICurrencyIdentifiersStatics_Instance.get_BOB()

    public fun get_BRL() = ABI.ICurrencyIdentifiersStatics_Instance.get_BRL()

    public fun get_BSD() = ABI.ICurrencyIdentifiersStatics_Instance.get_BSD()

    public fun get_BTN() = ABI.ICurrencyIdentifiersStatics_Instance.get_BTN()

    public fun get_BWP() = ABI.ICurrencyIdentifiersStatics_Instance.get_BWP()

    public fun get_BYR() = ABI.ICurrencyIdentifiersStatics_Instance.get_BYR()

    public fun get_BZD() = ABI.ICurrencyIdentifiersStatics_Instance.get_BZD()

    public fun get_CAD() = ABI.ICurrencyIdentifiersStatics_Instance.get_CAD()

    public fun get_CDF() = ABI.ICurrencyIdentifiersStatics_Instance.get_CDF()

    public fun get_CHF() = ABI.ICurrencyIdentifiersStatics_Instance.get_CHF()

    public fun get_CLP() = ABI.ICurrencyIdentifiersStatics_Instance.get_CLP()

    public fun get_CNY() = ABI.ICurrencyIdentifiersStatics_Instance.get_CNY()

    public fun get_COP() = ABI.ICurrencyIdentifiersStatics_Instance.get_COP()

    public fun get_CRC() = ABI.ICurrencyIdentifiersStatics_Instance.get_CRC()

    public fun get_CUP() = ABI.ICurrencyIdentifiersStatics_Instance.get_CUP()

    public fun get_CVE() = ABI.ICurrencyIdentifiersStatics_Instance.get_CVE()

    public fun get_CZK() = ABI.ICurrencyIdentifiersStatics_Instance.get_CZK()

    public fun get_DJF() = ABI.ICurrencyIdentifiersStatics_Instance.get_DJF()

    public fun get_DKK() = ABI.ICurrencyIdentifiersStatics_Instance.get_DKK()

    public fun get_DOP() = ABI.ICurrencyIdentifiersStatics_Instance.get_DOP()

    public fun get_DZD() = ABI.ICurrencyIdentifiersStatics_Instance.get_DZD()

    public fun get_EGP() = ABI.ICurrencyIdentifiersStatics_Instance.get_EGP()

    public fun get_ERN() = ABI.ICurrencyIdentifiersStatics_Instance.get_ERN()

    public fun get_ETB() = ABI.ICurrencyIdentifiersStatics_Instance.get_ETB()

    public fun get_EUR() = ABI.ICurrencyIdentifiersStatics_Instance.get_EUR()

    public fun get_FJD() = ABI.ICurrencyIdentifiersStatics_Instance.get_FJD()

    public fun get_FKP() = ABI.ICurrencyIdentifiersStatics_Instance.get_FKP()

    public fun get_GBP() = ABI.ICurrencyIdentifiersStatics_Instance.get_GBP()

    public fun get_GEL() = ABI.ICurrencyIdentifiersStatics_Instance.get_GEL()

    public fun get_GHS() = ABI.ICurrencyIdentifiersStatics_Instance.get_GHS()

    public fun get_GIP() = ABI.ICurrencyIdentifiersStatics_Instance.get_GIP()

    public fun get_GMD() = ABI.ICurrencyIdentifiersStatics_Instance.get_GMD()

    public fun get_GNF() = ABI.ICurrencyIdentifiersStatics_Instance.get_GNF()

    public fun get_GTQ() = ABI.ICurrencyIdentifiersStatics_Instance.get_GTQ()

    public fun get_GYD() = ABI.ICurrencyIdentifiersStatics_Instance.get_GYD()

    public fun get_HKD() = ABI.ICurrencyIdentifiersStatics_Instance.get_HKD()

    public fun get_HNL() = ABI.ICurrencyIdentifiersStatics_Instance.get_HNL()

    public fun get_HRK() = ABI.ICurrencyIdentifiersStatics_Instance.get_HRK()

    public fun get_HTG() = ABI.ICurrencyIdentifiersStatics_Instance.get_HTG()

    public fun get_HUF() = ABI.ICurrencyIdentifiersStatics_Instance.get_HUF()

    public fun get_IDR() = ABI.ICurrencyIdentifiersStatics_Instance.get_IDR()

    public fun get_ILS() = ABI.ICurrencyIdentifiersStatics_Instance.get_ILS()

    public fun get_INR() = ABI.ICurrencyIdentifiersStatics_Instance.get_INR()

    public fun get_IQD() = ABI.ICurrencyIdentifiersStatics_Instance.get_IQD()

    public fun get_IRR() = ABI.ICurrencyIdentifiersStatics_Instance.get_IRR()

    public fun get_ISK() = ABI.ICurrencyIdentifiersStatics_Instance.get_ISK()

    public fun get_JMD() = ABI.ICurrencyIdentifiersStatics_Instance.get_JMD()

    public fun get_JOD() = ABI.ICurrencyIdentifiersStatics_Instance.get_JOD()

    public fun get_JPY() = ABI.ICurrencyIdentifiersStatics_Instance.get_JPY()

    public fun get_KES() = ABI.ICurrencyIdentifiersStatics_Instance.get_KES()

    public fun get_KGS() = ABI.ICurrencyIdentifiersStatics_Instance.get_KGS()

    public fun get_KHR() = ABI.ICurrencyIdentifiersStatics_Instance.get_KHR()

    public fun get_KMF() = ABI.ICurrencyIdentifiersStatics_Instance.get_KMF()

    public fun get_KPW() = ABI.ICurrencyIdentifiersStatics_Instance.get_KPW()

    public fun get_KRW() = ABI.ICurrencyIdentifiersStatics_Instance.get_KRW()

    public fun get_KWD() = ABI.ICurrencyIdentifiersStatics_Instance.get_KWD()

    public fun get_KYD() = ABI.ICurrencyIdentifiersStatics_Instance.get_KYD()

    public fun get_KZT() = ABI.ICurrencyIdentifiersStatics_Instance.get_KZT()

    public fun get_LAK() = ABI.ICurrencyIdentifiersStatics_Instance.get_LAK()

    public fun get_LBP() = ABI.ICurrencyIdentifiersStatics_Instance.get_LBP()

    public fun get_LKR() = ABI.ICurrencyIdentifiersStatics_Instance.get_LKR()

    public fun get_LRD() = ABI.ICurrencyIdentifiersStatics_Instance.get_LRD()

    public fun get_LSL() = ABI.ICurrencyIdentifiersStatics_Instance.get_LSL()

    public fun get_LTL() = ABI.ICurrencyIdentifiersStatics_Instance.get_LTL()

    public fun get_LVL() = ABI.ICurrencyIdentifiersStatics_Instance.get_LVL()

    public fun get_LYD() = ABI.ICurrencyIdentifiersStatics_Instance.get_LYD()

    public fun get_MAD() = ABI.ICurrencyIdentifiersStatics_Instance.get_MAD()

    public fun get_MDL() = ABI.ICurrencyIdentifiersStatics_Instance.get_MDL()

    public fun get_MGA() = ABI.ICurrencyIdentifiersStatics_Instance.get_MGA()

    public fun get_MKD() = ABI.ICurrencyIdentifiersStatics_Instance.get_MKD()

    public fun get_MMK() = ABI.ICurrencyIdentifiersStatics_Instance.get_MMK()

    public fun get_MNT() = ABI.ICurrencyIdentifiersStatics_Instance.get_MNT()

    public fun get_MOP() = ABI.ICurrencyIdentifiersStatics_Instance.get_MOP()

    public fun get_MRO() = ABI.ICurrencyIdentifiersStatics_Instance.get_MRO()

    public fun get_MUR() = ABI.ICurrencyIdentifiersStatics_Instance.get_MUR()

    public fun get_MVR() = ABI.ICurrencyIdentifiersStatics_Instance.get_MVR()

    public fun get_MWK() = ABI.ICurrencyIdentifiersStatics_Instance.get_MWK()

    public fun get_MXN() = ABI.ICurrencyIdentifiersStatics_Instance.get_MXN()

    public fun get_MYR() = ABI.ICurrencyIdentifiersStatics_Instance.get_MYR()

    public fun get_MZN() = ABI.ICurrencyIdentifiersStatics_Instance.get_MZN()

    public fun get_NAD() = ABI.ICurrencyIdentifiersStatics_Instance.get_NAD()

    public fun get_NGN() = ABI.ICurrencyIdentifiersStatics_Instance.get_NGN()

    public fun get_NIO() = ABI.ICurrencyIdentifiersStatics_Instance.get_NIO()

    public fun get_NOK() = ABI.ICurrencyIdentifiersStatics_Instance.get_NOK()

    public fun get_NPR() = ABI.ICurrencyIdentifiersStatics_Instance.get_NPR()

    public fun get_NZD() = ABI.ICurrencyIdentifiersStatics_Instance.get_NZD()

    public fun get_OMR() = ABI.ICurrencyIdentifiersStatics_Instance.get_OMR()

    public fun get_PAB() = ABI.ICurrencyIdentifiersStatics_Instance.get_PAB()

    public fun get_PEN() = ABI.ICurrencyIdentifiersStatics_Instance.get_PEN()

    public fun get_PGK() = ABI.ICurrencyIdentifiersStatics_Instance.get_PGK()

    public fun get_PHP() = ABI.ICurrencyIdentifiersStatics_Instance.get_PHP()

    public fun get_PKR() = ABI.ICurrencyIdentifiersStatics_Instance.get_PKR()

    public fun get_PLN() = ABI.ICurrencyIdentifiersStatics_Instance.get_PLN()

    public fun get_PYG() = ABI.ICurrencyIdentifiersStatics_Instance.get_PYG()

    public fun get_QAR() = ABI.ICurrencyIdentifiersStatics_Instance.get_QAR()

    public fun get_RON() = ABI.ICurrencyIdentifiersStatics_Instance.get_RON()

    public fun get_RSD() = ABI.ICurrencyIdentifiersStatics_Instance.get_RSD()

    public fun get_RUB() = ABI.ICurrencyIdentifiersStatics_Instance.get_RUB()

    public fun get_RWF() = ABI.ICurrencyIdentifiersStatics_Instance.get_RWF()

    public fun get_SAR() = ABI.ICurrencyIdentifiersStatics_Instance.get_SAR()

    public fun get_SBD() = ABI.ICurrencyIdentifiersStatics_Instance.get_SBD()

    public fun get_SCR() = ABI.ICurrencyIdentifiersStatics_Instance.get_SCR()

    public fun get_SDG() = ABI.ICurrencyIdentifiersStatics_Instance.get_SDG()

    public fun get_SEK() = ABI.ICurrencyIdentifiersStatics_Instance.get_SEK()

    public fun get_SGD() = ABI.ICurrencyIdentifiersStatics_Instance.get_SGD()

    public fun get_SHP() = ABI.ICurrencyIdentifiersStatics_Instance.get_SHP()

    public fun get_SLL() = ABI.ICurrencyIdentifiersStatics_Instance.get_SLL()

    public fun get_SOS() = ABI.ICurrencyIdentifiersStatics_Instance.get_SOS()

    public fun get_SRD() = ABI.ICurrencyIdentifiersStatics_Instance.get_SRD()

    public fun get_STD() = ABI.ICurrencyIdentifiersStatics_Instance.get_STD()

    public fun get_SYP() = ABI.ICurrencyIdentifiersStatics_Instance.get_SYP()

    public fun get_SZL() = ABI.ICurrencyIdentifiersStatics_Instance.get_SZL()

    public fun get_THB() = ABI.ICurrencyIdentifiersStatics_Instance.get_THB()

    public fun get_TJS() = ABI.ICurrencyIdentifiersStatics_Instance.get_TJS()

    public fun get_TMT() = ABI.ICurrencyIdentifiersStatics_Instance.get_TMT()

    public fun get_TND() = ABI.ICurrencyIdentifiersStatics_Instance.get_TND()

    public fun get_TOP() = ABI.ICurrencyIdentifiersStatics_Instance.get_TOP()

    public fun get_TRY() = ABI.ICurrencyIdentifiersStatics_Instance.get_TRY()

    public fun get_TTD() = ABI.ICurrencyIdentifiersStatics_Instance.get_TTD()

    public fun get_TWD() = ABI.ICurrencyIdentifiersStatics_Instance.get_TWD()

    public fun get_TZS() = ABI.ICurrencyIdentifiersStatics_Instance.get_TZS()

    public fun get_UAH() = ABI.ICurrencyIdentifiersStatics_Instance.get_UAH()

    public fun get_UGX() = ABI.ICurrencyIdentifiersStatics_Instance.get_UGX()

    public fun get_USD() = ABI.ICurrencyIdentifiersStatics_Instance.get_USD()

    public fun get_UYU() = ABI.ICurrencyIdentifiersStatics_Instance.get_UYU()

    public fun get_UZS() = ABI.ICurrencyIdentifiersStatics_Instance.get_UZS()

    public fun get_VEF() = ABI.ICurrencyIdentifiersStatics_Instance.get_VEF()

    public fun get_VND() = ABI.ICurrencyIdentifiersStatics_Instance.get_VND()

    public fun get_VUV() = ABI.ICurrencyIdentifiersStatics_Instance.get_VUV()

    public fun get_WST() = ABI.ICurrencyIdentifiersStatics_Instance.get_WST()

    public fun get_XAF() = ABI.ICurrencyIdentifiersStatics_Instance.get_XAF()

    public fun get_XCD() = ABI.ICurrencyIdentifiersStatics_Instance.get_XCD()

    public fun get_XOF() = ABI.ICurrencyIdentifiersStatics_Instance.get_XOF()

    public fun get_XPF() = ABI.ICurrencyIdentifiersStatics_Instance.get_XPF()

    public fun get_XXX() = ABI.ICurrencyIdentifiersStatics_Instance.get_XXX()

    public fun get_YER() = ABI.ICurrencyIdentifiersStatics_Instance.get_YER()

    public fun get_ZAR() = ABI.ICurrencyIdentifiersStatics_Instance.get_ZAR()

    public fun get_ZMW() = ABI.ICurrencyIdentifiersStatics_Instance.get_ZMW()

    public fun get_ZWL() = ABI.ICurrencyIdentifiersStatics_Instance.get_ZWL()

    public fun get_BYN() = ABI.ICurrencyIdentifiersStatics2_Instance.get_BYN()

    public fun get_MRU() = ABI.ICurrencyIdentifiersStatics3_Instance.get_MRU()

    public fun get_SSP() = ABI.ICurrencyIdentifiersStatics3_Instance.get_SSP()

    public fun get_STN() = ABI.ICurrencyIdentifiersStatics3_Instance.get_STN()

    public fun get_VES() = ABI.ICurrencyIdentifiersStatics3_Instance.get_VES()
  }
}
