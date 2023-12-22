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

@ABIMarker(DeviceInformationCustomPairing.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceInformationCustomPairing;{85138c02-4ee6-4914-8370-107a39144c0e})")
@WinRTByReference(brClass = DeviceInformationCustomPairing.ByReference::class)
public class DeviceInformationCustomPairing(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceInformationCustomPairing.WithDefault, IWinRTObject {
  private val __436266081_Interface: IDeviceInformationCustomPairing.WithDefault by lazy {
    as_436266081()
  }


  public override val __436266081_Ptr: JNAPointer? by lazy {
    __436266081_Interface.__436266081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__436266081_Interface)

  private fun as_436266081(): IDeviceInformationCustomPairing.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformationCustomPairing.ABI.makeIDeviceInformationCustomPairing(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformationCustomPairing>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformationCustomPairing.ABI.makeIDeviceInformationCustomPairing(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceInformationCustomPairing> {
    public override fun getValue() = DeviceInformationCustomPairing(pointer.getPointer(0))

    public fun setValue(value: DeviceInformationCustomPairing): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceInformationCustomPairing, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceInformationCustomPairing {
      val address = segment.toRawLongValue()
      return DeviceInformationCustomPairing(Pointer(address))
    }

    public override fun toNative(obj: DeviceInformationCustomPairing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
