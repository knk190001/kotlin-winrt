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

@ABIMarker(DevicePickerFilter.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DevicePickerFilter;{91db92a2-57cb-48f1-9b59-a59b7a1f02a2})")
@WinRTByReference(brClass = DevicePickerFilter.ByReference::class)
public class DevicePickerFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePickerFilter.WithDefault, IWinRTObject {
  private val __1524566778_Interface: IDevicePickerFilter.WithDefault by lazy {
    as_1524566778()
  }


  public override val __1524566778_Ptr: JNAPointer? by lazy {
    __1524566778_Interface.__1524566778_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1524566778_Interface)

  private fun as_1524566778(): IDevicePickerFilter.WithDefault {
    if(pointer == NULL) {
      return(IDevicePickerFilter.ABI.makeIDevicePickerFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePickerFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePickerFilter.ABI.makeIDevicePickerFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePickerFilter> {
    public override fun getValue() = DevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: DevicePickerFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePickerFilter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DevicePickerFilter {
      val address = segment.toRawLongValue()
      return DevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: DevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
