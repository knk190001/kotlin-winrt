package Windows.Globalization.PhoneNumberFormatting

import Windows.Foundation.IStringable
import Windows.Globalization.PhoneNumberFormatting.IPhoneNumberInfoFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(PhoneNumberInfo.ABI::class)
@Signature("rc(Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo;{1c7ce4dd-c8b4-4ea3-9aef-b342e2c5b417})")
@WinRTByReference(brClass = PhoneNumberInfo.ByReference::class)
public class PhoneNumberInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneNumberInfo.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __635640864_Interface: IPhoneNumberInfo.WithDefault by lazy {
    as_635640864()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __635640864_Ptr: JNAPointer? by lazy {
    __635640864_Interface.__635640864_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__635640864_Interface, __328683030_Interface)

  public constructor(number: String) : this(ABI.activate(number))

  private fun as_635640864(): IPhoneNumberInfo.WithDefault {
    if(pointer == NULL) {
      return(IPhoneNumberInfo.ABI.makeIPhoneNumberInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneNumberInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneNumberInfo.ABI.makeIPhoneNumberInfo(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneNumberInfo> {
    public override fun getValue() = PhoneNumberInfo(pointer.getPointer(0))

    public fun setValue(value: PhoneNumberInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneNumberInfo, MemoryAddress> {
    public val IPhoneNumberInfoStatics_Instance: IPhoneNumberInfoStatics by lazy {
      createIPhoneNumberInfoStatics()
    }


    public val IPhoneNumberInfoFactory_Instance: IPhoneNumberInfoFactory by lazy {
      createIPhoneNumberInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneNumberInfoStatics(): IPhoneNumberInfoStatics {
      val refiid = Guid.REFIID(IPhoneNumberInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo".toHandle(),refiid,interfacePtr)
      val result = IPhoneNumberInfoStatics.ABI.makeIPhoneNumberInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIPhoneNumberInfoFactory(): IPhoneNumberInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPhoneNumberInfoFactory.ABI.makeIPhoneNumberInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(number: String): JNAPointer? =
        IPhoneNumberInfoFactory_Instance.Create(number)?.pointer

    public override fun fromNative(segment: MemoryAddress): PhoneNumberInfo {
      val address = segment.toRawLongValue()
      return PhoneNumberInfo(Pointer(address))
    }

    public override fun toNative(obj: PhoneNumberInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryParse(input: String, phoneNumber: ByReference) =
        ABI.IPhoneNumberInfoStatics_Instance.TryParse(input, phoneNumber)

    public fun TryParse(
      input: String,
      regionCode: String,
      phoneNumber: ByReference
    ) = ABI.IPhoneNumberInfoStatics_Instance.TryParse(input, regionCode, phoneNumber)
  }
}
