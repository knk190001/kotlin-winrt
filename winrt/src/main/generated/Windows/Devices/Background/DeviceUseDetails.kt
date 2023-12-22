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

@ABIMarker(DeviceUseDetails.ABI::class)
@Signature("rc(Windows.Devices.Background.DeviceUseDetails;{7d565141-557e-4154-b994-e4f7a11fb323})")
@WinRTByReference(brClass = DeviceUseDetails.ByReference::class)
public class DeviceUseDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceUseDetails.WithDefault, IWinRTObject {
  private val __1576784688_Interface: IDeviceUseDetails.WithDefault by lazy {
    as_1576784688()
  }


  public override val __1576784688_Ptr: JNAPointer? by lazy {
    __1576784688_Interface.__1576784688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576784688_Interface)

  private fun as_1576784688(): IDeviceUseDetails.WithDefault {
    if(pointer == NULL) {
      return(IDeviceUseDetails.ABI.makeIDeviceUseDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceUseDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceUseDetails.ABI.makeIDeviceUseDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceUseDetails> {
    public override fun getValue() = DeviceUseDetails(pointer.getPointer(0))

    public fun setValue(value: DeviceUseDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceUseDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceUseDetails {
      val address = segment.toRawLongValue()
      return DeviceUseDetails(Pointer(address))
    }

    public override fun toNative(obj: DeviceUseDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
