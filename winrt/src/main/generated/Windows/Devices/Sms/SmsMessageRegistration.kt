package Windows.Devices.Sms

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

@ABIMarker(SmsMessageRegistration.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsMessageRegistration;{1720503e-f34f-446b-83b3-0ff19923b409})")
@WinRTByReference(brClass = SmsMessageRegistration.ByReference::class)
public class SmsMessageRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsMessageRegistration.WithDefault, IWinRTObject {
  private val __1956355539_Interface: ISmsMessageRegistration.WithDefault by lazy {
    as_1956355539()
  }


  public override val __1956355539_Ptr: JNAPointer? by lazy {
    __1956355539_Interface.__1956355539_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1956355539_Interface)

  private fun as_1956355539(): ISmsMessageRegistration.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageRegistration.ABI.makeISmsMessageRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageRegistration.ABI.makeISmsMessageRegistration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsMessageRegistration> {
    public override fun getValue() = SmsMessageRegistration(pointer.getPointer(0))

    public fun setValue(value: SmsMessageRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsMessageRegistration, MemoryAddress> {
    public val ISmsMessageRegistrationStatics_Instance: ISmsMessageRegistrationStatics by lazy {
      createISmsMessageRegistrationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmsMessageRegistrationStatics(): ISmsMessageRegistrationStatics {
      val refiid = Guid.REFIID(ISmsMessageRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsMessageRegistration".toHandle(),refiid,interfacePtr)
      val result =
          ISmsMessageRegistrationStatics.ABI.makeISmsMessageRegistrationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmsMessageRegistration {
      val address = segment.toRawLongValue()
      return SmsMessageRegistration(Pointer(address))
    }

    public override fun toNative(obj: SmsMessageRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AllRegistrations() =
        ABI.ISmsMessageRegistrationStatics_Instance.get_AllRegistrations()

    public fun Register(id: String, filterRules: SmsFilterRules) =
        ABI.ISmsMessageRegistrationStatics_Instance.Register(id, filterRules)
  }
}
