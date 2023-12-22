package Windows.Devices.Enumeration

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

@ABIMarker(DeviceConnectionChangeTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceConnectionChangeTriggerDetails;{b8578c0c-bbc1-484b-bffa-7b31dcc200b2})")
@WinRTByReference(brClass = DeviceConnectionChangeTriggerDetails.ByReference::class)
public class DeviceConnectionChangeTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceConnectionChangeTriggerDetails.WithDefault, IWinRTObject {
  private val __34494860_Interface: IDeviceConnectionChangeTriggerDetails.WithDefault by lazy {
    as_34494860()
  }


  public override val __34494860_Ptr: JNAPointer? by lazy {
    __34494860_Interface.__34494860_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__34494860_Interface)

  private fun as_34494860(): IDeviceConnectionChangeTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IDeviceConnectionChangeTriggerDetails.ABI.makeIDeviceConnectionChangeTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceConnectionChangeTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceConnectionChangeTriggerDetails.ABI.makeIDeviceConnectionChangeTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceConnectionChangeTriggerDetails> {
    public override fun getValue() = DeviceConnectionChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: DeviceConnectionChangeTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceConnectionChangeTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceConnectionChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return DeviceConnectionChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: DeviceConnectionChangeTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
