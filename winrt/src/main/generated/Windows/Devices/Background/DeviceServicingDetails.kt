package Windows.Devices.Background

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

@ABIMarker(DeviceServicingDetails.ABI::class)
@Signature("rc(Windows.Devices.Background.DeviceServicingDetails;{4aabee29-2344-4ac4-8527-4a8ef6905645})")
@WinRTByReference(brClass = DeviceServicingDetails.ByReference::class)
public class DeviceServicingDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceServicingDetails.WithDefault, IWinRTObject {
  private val __1250836987_Interface: IDeviceServicingDetails.WithDefault by lazy {
    as_1250836987()
  }


  public override val __1250836987_Ptr: JNAPointer? by lazy {
    __1250836987_Interface.__1250836987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1250836987_Interface)

  private fun as_1250836987(): IDeviceServicingDetails.WithDefault {
    if(pointer == NULL) {
      return(IDeviceServicingDetails.ABI.makeIDeviceServicingDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceServicingDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceServicingDetails.ABI.makeIDeviceServicingDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceServicingDetails> {
    public override fun getValue() = DeviceServicingDetails(pointer.getPointer(0))

    public fun setValue(value: DeviceServicingDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceServicingDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceServicingDetails {
      val address = segment.toRawLongValue()
      return DeviceServicingDetails(Pointer(address))
    }

    public override fun toNative(obj: DeviceServicingDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
