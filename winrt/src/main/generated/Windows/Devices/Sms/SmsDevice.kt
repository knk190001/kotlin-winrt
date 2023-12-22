package Windows.Devices.Sms

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

@ABIMarker(SmsDevice.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsDevice;{091791ed-872b-4eec-9c72-ab11627b34ec})")
@WinRTByReference(brClass = SmsDevice.ByReference::class)
public class SmsDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsDevice.WithDefault, IWinRTObject {
  private val __472992771_Interface: ISmsDevice.WithDefault by lazy {
    as_472992771()
  }


  public override val __472992771_Ptr: JNAPointer? by lazy {
    __472992771_Interface.__472992771_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__472992771_Interface)

  private fun as_472992771(): ISmsDevice.WithDefault {
    if(pointer == NULL) {
      return(ISmsDevice.ABI.makeISmsDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsDevice.ABI.makeISmsDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SmsDevice> {
    public override fun getValue() = SmsDevice(pointer.getPointer(0))

    public fun setValue(value: SmsDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsDevice, MemoryAddress> {
    public val ISmsDeviceStatics_Instance: ISmsDeviceStatics by lazy {
      createISmsDeviceStatics()
    }


    public val ISmsDeviceStatics2_Instance: ISmsDeviceStatics2 by lazy {
      createISmsDeviceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmsDeviceStatics(): ISmsDeviceStatics {
      val refiid = Guid.REFIID(ISmsDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsDevice".toHandle(),refiid,interfacePtr)
      val result = ISmsDeviceStatics.ABI.makeISmsDeviceStatics(interfacePtr.value)
      return result
    }

    public fun createISmsDeviceStatics2(): ISmsDeviceStatics2 {
      val refiid = Guid.REFIID(ISmsDeviceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsDevice".toHandle(),refiid,interfacePtr)
      val result = ISmsDeviceStatics2.ABI.makeISmsDeviceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmsDevice {
      val address = segment.toRawLongValue()
      return SmsDevice(Pointer(address))
    }

    public override fun toNative(obj: SmsDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ISmsDeviceStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.ISmsDeviceStatics_Instance.FromIdAsync(deviceId)

    public fun GetDefaultAsync() = ABI.ISmsDeviceStatics_Instance.GetDefaultAsync()

    public fun FromNetworkAccountIdAsync(networkAccountId: String) =
        ABI.ISmsDeviceStatics2_Instance.FromNetworkAccountIdAsync(networkAccountId)
  }
}
