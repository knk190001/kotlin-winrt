package Windows.Media.Casting

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

@ABIMarker(CastingDevice.ABI::class)
@Signature("rc(Windows.Media.Casting.CastingDevice;{de721c83-4a43-4ad1-a6d2-2492a796c3f2})")
@WinRTByReference(brClass = CastingDevice.ByReference::class)
public class CastingDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICastingDevice.WithDefault, IWinRTObject {
  private val __115924514_Interface: ICastingDevice.WithDefault by lazy {
    as_115924514()
  }


  public override val __115924514_Ptr: JNAPointer? by lazy {
    __115924514_Interface.__115924514_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__115924514_Interface)

  private fun as_115924514(): ICastingDevice.WithDefault {
    if(pointer == NULL) {
      return(ICastingDevice.ABI.makeICastingDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICastingDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICastingDevice.ABI.makeICastingDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CastingDevice>
      {
    public override fun getValue() = CastingDevice(pointer.getPointer(0))

    public fun setValue(value: CastingDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CastingDevice, MemoryAddress> {
    public val ICastingDeviceStatics_Instance: ICastingDeviceStatics by lazy {
      createICastingDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICastingDeviceStatics(): ICastingDeviceStatics {
      val refiid = Guid.REFIID(ICastingDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Casting.CastingDevice".toHandle(),refiid,interfacePtr)
      val result = ICastingDeviceStatics.ABI.makeICastingDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CastingDevice {
      val address = segment.toRawLongValue()
      return CastingDevice(Pointer(address))
    }

    public override fun toNative(obj: CastingDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(type: CastingPlaybackTypes) =
        ABI.ICastingDeviceStatics_Instance.GetDeviceSelector(type)

    public fun GetDeviceSelectorFromCastingSourceAsync(castingSource: CastingSource) =
        ABI.ICastingDeviceStatics_Instance.GetDeviceSelectorFromCastingSourceAsync(castingSource)

    public fun FromIdAsync(value: String) = ABI.ICastingDeviceStatics_Instance.FromIdAsync(value)

    public fun DeviceInfoSupportsCastingAsync(device: DeviceInformation) =
        ABI.ICastingDeviceStatics_Instance.DeviceInfoSupportsCastingAsync(device)
  }
}
