package Windows.Phone.Devices.Notification

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VibrationDevice.ABI::class)
@Signature("rc(Windows.Phone.Devices.Notification.VibrationDevice;{1b4a6595-cfcd-4e08-92fb-c1906d04498c})")
@WinRTByReference(brClass = VibrationDevice.ByReference::class)
public class VibrationDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVibrationDevice.WithDefault, IWinRTObject {
  private val __1211851686_Interface: IVibrationDevice.WithDefault by lazy {
    as_1211851686()
  }


  public override val __1211851686_Ptr: JNAPointer? by lazy {
    __1211851686_Interface.__1211851686_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1211851686_Interface)

  private fun as_1211851686(): IVibrationDevice.WithDefault {
    if(pointer == NULL) {
      return(IVibrationDevice.ABI.makeIVibrationDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVibrationDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVibrationDevice.ABI.makeIVibrationDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VibrationDevice> {
    public override fun getValue() = VibrationDevice(pointer.getPointer(0))

    public fun setValue(value: VibrationDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VibrationDevice, MemoryAddress> {
    public val IVibrationDeviceStatics_Instance: IVibrationDeviceStatics by lazy {
      createIVibrationDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVibrationDeviceStatics(): IVibrationDeviceStatics {
      val refiid = Guid.REFIID(IVibrationDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Devices.Notification.VibrationDevice".toHandle(),refiid,interfacePtr)
      val result = IVibrationDeviceStatics.ABI.makeIVibrationDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VibrationDevice {
      val address = segment.toRawLongValue()
      return VibrationDevice(Pointer(address))
    }

    public override fun toNative(obj: VibrationDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IVibrationDeviceStatics_Instance.GetDefault()
  }
}
