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

@ABIMarker(DeviceWatcherTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceWatcherTriggerDetails;{38808119-4cb7-4e57-a56d-776d07cbfef9})")
@WinRTByReference(brClass = DeviceWatcherTriggerDetails.ByReference::class)
public class DeviceWatcherTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceWatcherTriggerDetails.WithDefault, IWinRTObject {
  private val __1401492338_Interface: IDeviceWatcherTriggerDetails.WithDefault by lazy {
    as_1401492338()
  }


  public override val __1401492338_Ptr: JNAPointer? by lazy {
    __1401492338_Interface.__1401492338_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1401492338_Interface)

  private fun as_1401492338(): IDeviceWatcherTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IDeviceWatcherTriggerDetails.ABI.makeIDeviceWatcherTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceWatcherTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceWatcherTriggerDetails.ABI.makeIDeviceWatcherTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceWatcherTriggerDetails> {
    public override fun getValue() = DeviceWatcherTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: DeviceWatcherTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceWatcherTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceWatcherTriggerDetails {
      val address = segment.toRawLongValue()
      return DeviceWatcherTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: DeviceWatcherTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
