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

@ABIMarker(DevicePairingResult.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DevicePairingResult;{072b02bf-dd95-4025-9b37-de51adba37b7})")
@WinRTByReference(brClass = DevicePairingResult.ByReference::class)
public class DevicePairingResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePairingResult.WithDefault, IWinRTObject {
  private val __1248578097_Interface: IDevicePairingResult.WithDefault by lazy {
    as_1248578097()
  }


  public override val __1248578097_Ptr: JNAPointer? by lazy {
    __1248578097_Interface.__1248578097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1248578097_Interface)

  private fun as_1248578097(): IDevicePairingResult.WithDefault {
    if(pointer == NULL) {
      return(IDevicePairingResult.ABI.makeIDevicePairingResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePairingResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePairingResult.ABI.makeIDevicePairingResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePairingResult> {
    public override fun getValue() = DevicePairingResult(pointer.getPointer(0))

    public fun setValue(value: DevicePairingResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePairingResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DevicePairingResult {
      val address = segment.toRawLongValue()
      return DevicePairingResult(Pointer(address))
    }

    public override fun toNative(obj: DevicePairingResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
