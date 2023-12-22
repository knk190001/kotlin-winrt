package Windows.Devices.Spi

import Windows.Foundation.IClosable
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

@ABIMarker(SpiDevice.ABI::class)
@Signature("rc(Windows.Devices.Spi.SpiDevice;{05d5356d-11b6-4d39-84d5-95dfb4c9f2ce})")
@WinRTByReference(brClass = SpiDevice.ByReference::class)
public class SpiDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpiDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1996720471_Interface: ISpiDevice.WithDefault by lazy {
    as_1996720471()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1996720471_Ptr: JNAPointer? by lazy {
    __1996720471_Interface.__1996720471_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1996720471_Interface, __1260617006_Interface)

  private fun as_1996720471(): ISpiDevice.WithDefault {
    if(pointer == NULL) {
      return(ISpiDevice.ABI.makeISpiDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpiDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpiDevice.ABI.makeISpiDevice(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpiDevice> {
    public override fun getValue() = SpiDevice(pointer.getPointer(0))

    public fun setValue(value: SpiDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpiDevice, MemoryAddress> {
    public val ISpiDeviceStatics_Instance: ISpiDeviceStatics by lazy {
      createISpiDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpiDeviceStatics(): ISpiDeviceStatics {
      val refiid = Guid.REFIID(ISpiDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Spi.SpiDevice".toHandle(),refiid,interfacePtr)
      val result = ISpiDeviceStatics.ABI.makeISpiDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpiDevice {
      val address = segment.toRawLongValue()
      return SpiDevice(Pointer(address))
    }

    public override fun toNative(obj: SpiDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ISpiDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(friendlyName: String) =
        ABI.ISpiDeviceStatics_Instance.GetDeviceSelector(friendlyName)

    public fun GetBusInfo(busId: String) = ABI.ISpiDeviceStatics_Instance.GetBusInfo(busId)

    public fun FromIdAsync(busId: String, settings: SpiConnectionSettings) =
        ABI.ISpiDeviceStatics_Instance.FromIdAsync(busId, settings)
  }
}
