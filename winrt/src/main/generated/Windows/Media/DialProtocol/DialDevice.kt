package Windows.Media.DialProtocol

import Windows.Devices.Enumeration.DeviceInformation
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

@ABIMarker(DialDevice.ABI::class)
@Signature("rc(Windows.Media.DialProtocol.DialDevice;{fff0edaf-759f-41d2-a20a-7f29ce0b3784})")
@WinRTByReference(brClass = DialDevice.ByReference::class)
public class DialDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialDevice.WithDefault, IDialDevice2.WithDefault, IWinRTObject {
  private val __1793268050_Interface: IDialDevice.WithDefault by lazy {
    as_1793268050()
  }


  private val __243265248_Interface: IDialDevice2.WithDefault by lazy {
    as_243265248()
  }


  public override val __1793268050_Ptr: JNAPointer? by lazy {
    __1793268050_Interface.__1793268050_Ptr
  }


  public override val __243265248_Ptr: JNAPointer? by lazy {
    __243265248_Interface.__243265248_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1793268050_Interface, __243265248_Interface)

  private fun as_1793268050(): IDialDevice.WithDefault {
    if(pointer == NULL) {
      return(IDialDevice.ABI.makeIDialDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialDevice.ABI.makeIDialDevice(ref.value))
  }

  private fun as_243265248(): IDialDevice2.WithDefault {
    if(pointer == NULL) {
      return(IDialDevice2.ABI.makeIDialDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialDevice2.ABI.makeIDialDevice2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DialDevice> {
    public override fun getValue() = DialDevice(pointer.getPointer(0))

    public fun setValue(value: DialDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DialDevice, MemoryAddress> {
    public val IDialDeviceStatics_Instance: IDialDeviceStatics by lazy {
      createIDialDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDialDeviceStatics(): IDialDeviceStatics {
      val refiid = Guid.REFIID(IDialDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.DialProtocol.DialDevice".toHandle(),refiid,interfacePtr)
      val result = IDialDeviceStatics.ABI.makeIDialDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DialDevice {
      val address = segment.toRawLongValue()
      return DialDevice(Pointer(address))
    }

    public override fun toNative(obj: DialDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(appName: String) =
        ABI.IDialDeviceStatics_Instance.GetDeviceSelector(appName)

    public fun FromIdAsync(value: String) = ABI.IDialDeviceStatics_Instance.FromIdAsync(value)

    public fun DeviceInfoSupportsDialAsync(device: DeviceInformation) =
        ABI.IDialDeviceStatics_Instance.DeviceInfoSupportsDialAsync(device)
  }
}
