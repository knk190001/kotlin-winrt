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

@ABIMarker(DeviceUnpairingResult.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceUnpairingResult;{66f44ad3-79d9-444b-92cf-a92ef72571c7})")
@WinRTByReference(brClass = DeviceUnpairingResult.ByReference::class)
public class DeviceUnpairingResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceUnpairingResult.WithDefault, IWinRTObject {
  private val __568680760_Interface: IDeviceUnpairingResult.WithDefault by lazy {
    as_568680760()
  }


  public override val __568680760_Ptr: JNAPointer? by lazy {
    __568680760_Interface.__568680760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__568680760_Interface)

  private fun as_568680760(): IDeviceUnpairingResult.WithDefault {
    if(pointer == NULL) {
      return(IDeviceUnpairingResult.ABI.makeIDeviceUnpairingResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceUnpairingResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceUnpairingResult.ABI.makeIDeviceUnpairingResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceUnpairingResult> {
    public override fun getValue() = DeviceUnpairingResult(pointer.getPointer(0))

    public fun setValue(value: DeviceUnpairingResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceUnpairingResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceUnpairingResult {
      val address = segment.toRawLongValue()
      return DeviceUnpairingResult(Pointer(address))
    }

    public override fun toNative(obj: DeviceUnpairingResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
