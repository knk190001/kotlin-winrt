package Windows.Devices.I2c

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

@ABIMarker(I2cDevice.ABI::class)
@Signature("rc(Windows.Devices.I2c.I2cDevice;{8636c136-b9c5-4f70-9449-cc46dc6f57eb})")
@WinRTByReference(brClass = I2cDevice.ByReference::class)
public class I2cDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), II2cDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1394515835_Interface: II2cDevice.WithDefault by lazy {
    as_1394515835()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1394515835_Ptr: JNAPointer? by lazy {
    __1394515835_Interface.__1394515835_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1394515835_Interface, __1260617006_Interface)

  private fun as_1394515835(): II2cDevice.WithDefault {
    if(pointer == NULL) {
      return(II2cDevice.ABI.makeII2cDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<II2cDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(II2cDevice.ABI.makeII2cDevice(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<I2cDevice> {
    public override fun getValue() = I2cDevice(pointer.getPointer(0))

    public fun setValue(value: I2cDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<I2cDevice, MemoryAddress> {
    public val II2cDeviceStatics_Instance: II2cDeviceStatics by lazy {
      createII2cDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createII2cDeviceStatics(): II2cDeviceStatics {
      val refiid = Guid.REFIID(II2cDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.I2c.I2cDevice".toHandle(),refiid,interfacePtr)
      val result = II2cDeviceStatics.ABI.makeII2cDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): I2cDevice {
      val address = segment.toRawLongValue()
      return I2cDevice(Pointer(address))
    }

    public override fun toNative(obj: I2cDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.II2cDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(friendlyName: String) =
        ABI.II2cDeviceStatics_Instance.GetDeviceSelector(friendlyName)

    public fun FromIdAsync(deviceId: String, settings: I2cConnectionSettings) =
        ABI.II2cDeviceStatics_Instance.FromIdAsync(deviceId, settings)
  }
}
