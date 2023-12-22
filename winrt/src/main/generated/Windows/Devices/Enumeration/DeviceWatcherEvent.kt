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

@ABIMarker(DeviceWatcherEvent.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceWatcherEvent;{74aa9c0b-1dbd-47fd-b635-3cc556d0ff8b})")
@WinRTByReference(brClass = DeviceWatcherEvent.ByReference::class)
public class DeviceWatcherEvent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceWatcherEvent.WithDefault, IWinRTObject {
  private val __1365429138_Interface: IDeviceWatcherEvent.WithDefault by lazy {
    as_1365429138()
  }


  public override val __1365429138_Ptr: JNAPointer? by lazy {
    __1365429138_Interface.__1365429138_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1365429138_Interface)

  private fun as_1365429138(): IDeviceWatcherEvent.WithDefault {
    if(pointer == NULL) {
      return(IDeviceWatcherEvent.ABI.makeIDeviceWatcherEvent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceWatcherEvent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceWatcherEvent.ABI.makeIDeviceWatcherEvent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceWatcherEvent> {
    public override fun getValue() = DeviceWatcherEvent(pointer.getPointer(0))

    public fun setValue(value: DeviceWatcherEvent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceWatcherEvent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceWatcherEvent {
      val address = segment.toRawLongValue()
      return DeviceWatcherEvent(Pointer(address))
    }

    public override fun toNative(obj: DeviceWatcherEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
