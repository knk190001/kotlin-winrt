package Windows.Devices.PointOfService

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BarcodeSymbologies.ABI::class)
@WinRTByReference(brClass = BarcodeSymbologies.ByReference::class)
public class BarcodeSymbologies(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeSymbologies> {
    public override fun getValue() = BarcodeSymbologies(pointer.getPointer(0))

    public fun setValue(value: BarcodeSymbologies): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeSymbologies, MemoryAddress> {
    public val IBarcodeSymbologiesStatics_Instance: IBarcodeSymbologiesStatics by lazy {
      createIBarcodeSymbologiesStatics()
    }


    public val IBarcodeSymbologiesStatics2_Instance: IBarcodeSymbologiesStatics2 by lazy {
      createIBarcodeSymbologiesStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBarcodeSymbologiesStatics(): IBarcodeSymbologiesStatics {
      val refiid = Guid.REFIID(IBarcodeSymbologiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.BarcodeSymbologies".toHandle(),refiid,interfacePtr)
      val result = IBarcodeSymbologiesStatics.ABI.makeIBarcodeSymbologiesStatics(interfacePtr.value)
      return result
    }

    public fun createIBarcodeSymbologiesStatics2(): IBarcodeSymbologiesStatics2 {
      val refiid = Guid.REFIID(IBarcodeSymbologiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.BarcodeSymbologies".toHandle(),refiid,interfacePtr)
      val result =
          IBarcodeSymbologiesStatics2.ABI.makeIBarcodeSymbologiesStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BarcodeSymbologies {
      val address = segment.toRawLongValue()
      return BarcodeSymbologies(Pointer(address))
    }

    public override fun toNative(obj: BarcodeSymbologies): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Unknown() = ABI.IBarcodeSymbologiesStatics_Instance.get_Unknown()

    public fun get_Ean8() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean8()

    public fun get_Ean8Add2() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean8Add2()

    public fun get_Ean8Add5() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean8Add5()

    public fun get_Eanv() = ABI.IBarcodeSymbologiesStatics_Instance.get_Eanv()

    public fun get_EanvAdd2() = ABI.IBarcodeSymbologiesStatics_Instance.get_EanvAdd2()

    public fun get_EanvAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_EanvAdd5()

    public fun get_Ean13() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean13()

    public fun get_Ean13Add2() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean13Add2()

    public fun get_Ean13Add5() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean13Add5()

    public fun get_Isbn() = ABI.IBarcodeSymbologiesStatics_Instance.get_Isbn()

    public fun get_IsbnAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_IsbnAdd5()

    public fun get_Ismn() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ismn()

    public fun get_IsmnAdd2() = ABI.IBarcodeSymbologiesStatics_Instance.get_IsmnAdd2()

    public fun get_IsmnAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_IsmnAdd5()

    public fun get_Issn() = ABI.IBarcodeSymbologiesStatics_Instance.get_Issn()

    public fun get_IssnAdd2() = ABI.IBarcodeSymbologiesStatics_Instance.get_IssnAdd2()

    public fun get_IssnAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_IssnAdd5()

    public fun get_Ean99() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean99()

    public fun get_Ean99Add2() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean99Add2()

    public fun get_Ean99Add5() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ean99Add5()

    public fun get_Upca() = ABI.IBarcodeSymbologiesStatics_Instance.get_Upca()

    public fun get_UpcaAdd2() = ABI.IBarcodeSymbologiesStatics_Instance.get_UpcaAdd2()

    public fun get_UpcaAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_UpcaAdd5()

    public fun get_Upce() = ABI.IBarcodeSymbologiesStatics_Instance.get_Upce()

    public fun get_UpceAdd2() = ABI.IBarcodeSymbologiesStatics_Instance.get_UpceAdd2()

    public fun get_UpceAdd5() = ABI.IBarcodeSymbologiesStatics_Instance.get_UpceAdd5()

    public fun get_UpcCoupon() = ABI.IBarcodeSymbologiesStatics_Instance.get_UpcCoupon()

    public fun get_TfStd() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfStd()

    public fun get_TfDis() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfDis()

    public fun get_TfInt() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfInt()

    public fun get_TfInd() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfInd()

    public fun get_TfMat() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfMat()

    public fun get_TfIata() = ABI.IBarcodeSymbologiesStatics_Instance.get_TfIata()

    public fun get_Gs1DatabarType1() = ABI.IBarcodeSymbologiesStatics_Instance.get_Gs1DatabarType1()

    public fun get_Gs1DatabarType2() = ABI.IBarcodeSymbologiesStatics_Instance.get_Gs1DatabarType2()

    public fun get_Gs1DatabarType3() = ABI.IBarcodeSymbologiesStatics_Instance.get_Gs1DatabarType3()

    public fun get_Code39() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code39()

    public fun get_Code39Ex() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code39Ex()

    public fun get_Trioptic39() = ABI.IBarcodeSymbologiesStatics_Instance.get_Trioptic39()

    public fun get_Code32() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code32()

    public fun get_Pzn() = ABI.IBarcodeSymbologiesStatics_Instance.get_Pzn()

    public fun get_Code93() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code93()

    public fun get_Code93Ex() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code93Ex()

    public fun get_Code128() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code128()

    public fun get_Gs1128() = ABI.IBarcodeSymbologiesStatics_Instance.get_Gs1128()

    public fun get_Gs1128Coupon() = ABI.IBarcodeSymbologiesStatics_Instance.get_Gs1128Coupon()

    public fun get_UccEan128() = ABI.IBarcodeSymbologiesStatics_Instance.get_UccEan128()

    public fun get_Sisac() = ABI.IBarcodeSymbologiesStatics_Instance.get_Sisac()

    public fun get_Isbt() = ABI.IBarcodeSymbologiesStatics_Instance.get_Isbt()

    public fun get_Codabar() = ABI.IBarcodeSymbologiesStatics_Instance.get_Codabar()

    public fun get_Code11() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code11()

    public fun get_Msi() = ABI.IBarcodeSymbologiesStatics_Instance.get_Msi()

    public fun get_Plessey() = ABI.IBarcodeSymbologiesStatics_Instance.get_Plessey()

    public fun get_Telepen() = ABI.IBarcodeSymbologiesStatics_Instance.get_Telepen()

    public fun get_Code16k() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code16k()

    public fun get_CodablockA() = ABI.IBarcodeSymbologiesStatics_Instance.get_CodablockA()

    public fun get_CodablockF() = ABI.IBarcodeSymbologiesStatics_Instance.get_CodablockF()

    public fun get_Codablock128() = ABI.IBarcodeSymbologiesStatics_Instance.get_Codablock128()

    public fun get_Code49() = ABI.IBarcodeSymbologiesStatics_Instance.get_Code49()

    public fun get_Aztec() = ABI.IBarcodeSymbologiesStatics_Instance.get_Aztec()

    public fun get_DataCode() = ABI.IBarcodeSymbologiesStatics_Instance.get_DataCode()

    public fun get_DataMatrix() = ABI.IBarcodeSymbologiesStatics_Instance.get_DataMatrix()

    public fun get_HanXin() = ABI.IBarcodeSymbologiesStatics_Instance.get_HanXin()

    public fun get_Maxicode() = ABI.IBarcodeSymbologiesStatics_Instance.get_Maxicode()

    public fun get_MicroPdf417() = ABI.IBarcodeSymbologiesStatics_Instance.get_MicroPdf417()

    public fun get_MicroQr() = ABI.IBarcodeSymbologiesStatics_Instance.get_MicroQr()

    public fun get_Pdf417() = ABI.IBarcodeSymbologiesStatics_Instance.get_Pdf417()

    public fun get_Qr() = ABI.IBarcodeSymbologiesStatics_Instance.get_Qr()

    public fun get_MsTag() = ABI.IBarcodeSymbologiesStatics_Instance.get_MsTag()

    public fun get_Ccab() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ccab()

    public fun get_Ccc() = ABI.IBarcodeSymbologiesStatics_Instance.get_Ccc()

    public fun get_Tlc39() = ABI.IBarcodeSymbologiesStatics_Instance.get_Tlc39()

    public fun get_AusPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_AusPost()

    public fun get_CanPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_CanPost()

    public fun get_ChinaPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_ChinaPost()

    public fun get_DutchKix() = ABI.IBarcodeSymbologiesStatics_Instance.get_DutchKix()

    public fun get_InfoMail() = ABI.IBarcodeSymbologiesStatics_Instance.get_InfoMail()

    public fun get_ItalianPost25() = ABI.IBarcodeSymbologiesStatics_Instance.get_ItalianPost25()

    public fun get_ItalianPost39() = ABI.IBarcodeSymbologiesStatics_Instance.get_ItalianPost39()

    public fun get_JapanPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_JapanPost()

    public fun get_KoreanPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_KoreanPost()

    public fun get_SwedenPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_SwedenPost()

    public fun get_UkPost() = ABI.IBarcodeSymbologiesStatics_Instance.get_UkPost()

    public fun get_UsIntelligent() = ABI.IBarcodeSymbologiesStatics_Instance.get_UsIntelligent()

    public fun get_UsIntelligentPkg() =
        ABI.IBarcodeSymbologiesStatics_Instance.get_UsIntelligentPkg()

    public fun get_UsPlanet() = ABI.IBarcodeSymbologiesStatics_Instance.get_UsPlanet()

    public fun get_UsPostNet() = ABI.IBarcodeSymbologiesStatics_Instance.get_UsPostNet()

    public fun get_Us4StateFics() = ABI.IBarcodeSymbologiesStatics_Instance.get_Us4StateFics()

    public fun get_OcrA() = ABI.IBarcodeSymbologiesStatics_Instance.get_OcrA()

    public fun get_OcrB() = ABI.IBarcodeSymbologiesStatics_Instance.get_OcrB()

    public fun get_Micr() = ABI.IBarcodeSymbologiesStatics_Instance.get_Micr()

    public fun get_ExtendedBase() = ABI.IBarcodeSymbologiesStatics_Instance.get_ExtendedBase()

    public fun GetName(scanDataType: WinDef.UINT) =
        ABI.IBarcodeSymbologiesStatics_Instance.GetName(scanDataType)

    public fun get_Gs1DWCode() = ABI.IBarcodeSymbologiesStatics2_Instance.get_Gs1DWCode()
  }
}
