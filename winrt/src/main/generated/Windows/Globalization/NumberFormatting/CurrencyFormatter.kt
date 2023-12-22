package Windows.Globalization.NumberFormatting

import Windows.Foundation.Collections.IIterable
import Windows.Globalization.NumberFormatting.ICurrencyFormatterFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CurrencyFormatter.ABI::class)
@Signature("rc(Windows.Globalization.NumberFormatting.CurrencyFormatter;{11730ca5-4b00-41b2-b332-73b12a497d54})")
@WinRTByReference(brClass = CurrencyFormatter.ByReference::class)
public class CurrencyFormatter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrencyFormatter.WithDefault, INumberParser.WithDefault,
    INumberFormatter2.WithDefault, INumberFormatter.WithDefault,
    INumberFormatterOptions.WithDefault, ICurrencyFormatter2.WithDefault,
    ISignificantDigitsOption.WithDefault, INumberRounderOption.WithDefault,
    ISignedZeroOption.WithDefault, IWinRTObject {
  private val __1802490730_Interface: ICurrencyFormatter.WithDefault by lazy {
    as_1802490730()
  }


  private val __185731531_Interface: INumberParser.WithDefault by lazy {
    as_185731531()
  }


  private val __151748692_Interface: INumberFormatter2.WithDefault by lazy {
    as_151748692()
  }


  private val __559084446_Interface: INumberFormatter.WithDefault by lazy {
    as_559084446()
  }


  private val __297696544_Interface: INumberFormatterOptions.WithDefault by lazy {
    as_297696544()
  }


  private val __42637732_Interface: ICurrencyFormatter2.WithDefault by lazy {
    as_42637732()
  }


  private val __730319595_Interface: ISignificantDigitsOption.WithDefault by lazy {
    as_730319595()
  }


  private val __1982953500_Interface: INumberRounderOption.WithDefault by lazy {
    as_1982953500()
  }


  private val __1896278788_Interface: ISignedZeroOption.WithDefault by lazy {
    as_1896278788()
  }


  public override val __1802490730_Ptr: JNAPointer? by lazy {
    __1802490730_Interface.__1802490730_Ptr
  }


  public override val __185731531_Ptr: JNAPointer? by lazy {
    __185731531_Interface.__185731531_Ptr
  }


  public override val __151748692_Ptr: JNAPointer? by lazy {
    __151748692_Interface.__151748692_Ptr
  }


  public override val __559084446_Ptr: JNAPointer? by lazy {
    __559084446_Interface.__559084446_Ptr
  }


  public override val __297696544_Ptr: JNAPointer? by lazy {
    __297696544_Interface.__297696544_Ptr
  }


  public override val __42637732_Ptr: JNAPointer? by lazy {
    __42637732_Interface.__42637732_Ptr
  }


  public override val __730319595_Ptr: JNAPointer? by lazy {
    __730319595_Interface.__730319595_Ptr
  }


  public override val __1982953500_Ptr: JNAPointer? by lazy {
    __1982953500_Interface.__1982953500_Ptr
  }


  public override val __1896278788_Ptr: JNAPointer? by lazy {
    __1896278788_Interface.__1896278788_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1802490730_Interface, __185731531_Interface, __151748692_Interface,
        __559084446_Interface, __297696544_Interface, __42637732_Interface, __730319595_Interface,
        __1982953500_Interface, __1896278788_Interface)

  public constructor(currencyCode: String) : this(ABI.activate(currencyCode))

  public constructor(
    currencyCode: String,
    languages: IIterable<String?>,
    geographicRegion: String
  ) : this(ABI.activate(currencyCode, languages, geographicRegion))

  private fun as_1802490730(): ICurrencyFormatter.WithDefault {
    if(pointer == NULL) {
      return(ICurrencyFormatter.ABI.makeICurrencyFormatter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrencyFormatter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrencyFormatter.ABI.makeICurrencyFormatter(ref.value))
  }

  private fun as_185731531(): INumberParser.WithDefault {
    if(pointer == NULL) {
      return(INumberParser.ABI.makeINumberParser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberParser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberParser.ABI.makeINumberParser(ref.value))
  }

  private fun as_151748692(): INumberFormatter2.WithDefault {
    if(pointer == NULL) {
      return(INumberFormatter2.ABI.makeINumberFormatter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberFormatter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberFormatter2.ABI.makeINumberFormatter2(ref.value))
  }

  private fun as_559084446(): INumberFormatter.WithDefault {
    if(pointer == NULL) {
      return(INumberFormatter.ABI.makeINumberFormatter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberFormatter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberFormatter.ABI.makeINumberFormatter(ref.value))
  }

  private fun as_297696544(): INumberFormatterOptions.WithDefault {
    if(pointer == NULL) {
      return(INumberFormatterOptions.ABI.makeINumberFormatterOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberFormatterOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberFormatterOptions.ABI.makeINumberFormatterOptions(ref.value))
  }

  private fun as_42637732(): ICurrencyFormatter2.WithDefault {
    if(pointer == NULL) {
      return(ICurrencyFormatter2.ABI.makeICurrencyFormatter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrencyFormatter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrencyFormatter2.ABI.makeICurrencyFormatter2(ref.value))
  }

  private fun as_730319595(): ISignificantDigitsOption.WithDefault {
    if(pointer == NULL) {
      return(ISignificantDigitsOption.ABI.makeISignificantDigitsOption(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISignificantDigitsOption>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISignificantDigitsOption.ABI.makeISignificantDigitsOption(ref.value))
  }

  private fun as_1982953500(): INumberRounderOption.WithDefault {
    if(pointer == NULL) {
      return(INumberRounderOption.ABI.makeINumberRounderOption(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberRounderOption>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberRounderOption.ABI.makeINumberRounderOption(ref.value))
  }

  private fun as_1896278788(): ISignedZeroOption.WithDefault {
    if(pointer == NULL) {
      return(ISignedZeroOption.ABI.makeISignedZeroOption(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISignedZeroOption>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISignedZeroOption.ABI.makeISignedZeroOption(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrencyFormatter> {
    public override fun getValue() = CurrencyFormatter(pointer.getPointer(0))

    public fun setValue(value: CurrencyFormatter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrencyFormatter, MemoryAddress> {
    public val ICurrencyFormatterFactory_Instance: ICurrencyFormatterFactory by lazy {
      createICurrencyFormatterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrencyFormatterFactory(): ICurrencyFormatterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumberFormatting.CurrencyFormatter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICurrencyFormatterFactory.ABI.makeICurrencyFormatterFactory(factoryActivatorPtr.value))
    }

    public fun activate(currencyCode: String): JNAPointer? =
        ICurrencyFormatterFactory_Instance.CreateCurrencyFormatterCode(currencyCode)?.pointer

    public fun activate(
      currencyCode: String,
      languages: IIterable<String?>,
      geographicRegion: String
    ): JNAPointer? =
        ICurrencyFormatterFactory_Instance.CreateCurrencyFormatterCodeContext(currencyCode,
        languages, geographicRegion)?.pointer

    public override fun fromNative(segment: MemoryAddress): CurrencyFormatter {
      val address = segment.toRawLongValue()
      return CurrencyFormatter(Pointer(address))
    }

    public override fun toNative(obj: CurrencyFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
