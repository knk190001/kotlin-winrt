package Windows.Globalization.PhoneNumberFormatting

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneNumberFormatter.ABI::class)
@Signature("rc(Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormatter;{1556b49e-bad4-4b4a-900d-4407adb7c981})")
@WinRTByReference(brClass = PhoneNumberFormatter.ByReference::class)
public class PhoneNumberFormatter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneNumberFormatter.WithDefault, IWinRTObject {
  private val __910938264_Interface: IPhoneNumberFormatter.WithDefault by lazy {
    as_910938264()
  }


  public override val __910938264_Ptr: JNAPointer? by lazy {
    __910938264_Interface.__910938264_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__910938264_Interface)

  public constructor() : this(ABI.activate())

  private fun as_910938264(): IPhoneNumberFormatter.WithDefault {
    if(pointer == NULL) {
      return(IPhoneNumberFormatter.ABI.makeIPhoneNumberFormatter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneNumberFormatter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneNumberFormatter.ABI.makeIPhoneNumberFormatter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneNumberFormatter> {
    public override fun getValue() = PhoneNumberFormatter(pointer.getPointer(0))

    public fun setValue(value: PhoneNumberFormatter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneNumberFormatter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPhoneNumberFormatterStatics_Instance: IPhoneNumberFormatterStatics by lazy {
      createIPhoneNumberFormatterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormatter".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIPhoneNumberFormatterStatics(): IPhoneNumberFormatterStatics {
      val refiid = Guid.REFIID(IPhoneNumberFormatterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormatter".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneNumberFormatterStatics.ABI.makeIPhoneNumberFormatterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneNumberFormatter {
      val address = segment.toRawLongValue()
      return PhoneNumberFormatter(Pointer(address))
    }

    public override fun toNative(obj: PhoneNumberFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreate(regionCode: String, phoneNumber: ByReference) =
        ABI.IPhoneNumberFormatterStatics_Instance.TryCreate(regionCode, phoneNumber)

    public fun GetCountryCodeForRegion(regionCode: String) =
        ABI.IPhoneNumberFormatterStatics_Instance.GetCountryCodeForRegion(regionCode)

    public fun GetNationalDirectDialingPrefixForRegion(regionCode: String, stripNonDigit: Boolean) =
        ABI.IPhoneNumberFormatterStatics_Instance.GetNationalDirectDialingPrefixForRegion(regionCode,
        stripNonDigit)

    public fun WrapWithLeftToRightMarkers(number: String) =
        ABI.IPhoneNumberFormatterStatics_Instance.WrapWithLeftToRightMarkers(number)
  }
}
