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

@ABIMarker(DeviceInformationUpdate.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceInformationUpdate;{8f315305-d972-44b7-a37e-9e822c78213b})")
@WinRTByReference(brClass = DeviceInformationUpdate.ByReference::class)
public class DeviceInformationUpdate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceInformationUpdate.WithDefault, IDeviceInformationUpdate2.WithDefault,
    IWinRTObject {
  private val __839372865_Interface: IDeviceInformationUpdate.WithDefault by lazy {
    as_839372865()
  }


  private val __250755089_Interface: IDeviceInformationUpdate2.WithDefault by lazy {
    as_250755089()
  }


  public override val __839372865_Ptr: JNAPointer? by lazy {
    __839372865_Interface.__839372865_Ptr
  }


  public override val __250755089_Ptr: JNAPointer? by lazy {
    __250755089_Interface.__250755089_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__839372865_Interface, __250755089_Interface)

  private fun as_839372865(): IDeviceInformationUpdate.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformationUpdate.ABI.makeIDeviceInformationUpdate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformationUpdate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformationUpdate.ABI.makeIDeviceInformationUpdate(ref.value))
  }

  private fun as_250755089(): IDeviceInformationUpdate2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformationUpdate2.ABI.makeIDeviceInformationUpdate2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformationUpdate2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformationUpdate2.ABI.makeIDeviceInformationUpdate2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceInformationUpdate> {
    public override fun getValue() = DeviceInformationUpdate(pointer.getPointer(0))

    public fun setValue(value: DeviceInformationUpdate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceInformationUpdate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceInformationUpdate {
      val address = segment.toRawLongValue()
      return DeviceInformationUpdate(Pointer(address))
    }

    public override fun toNative(obj: DeviceInformationUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
