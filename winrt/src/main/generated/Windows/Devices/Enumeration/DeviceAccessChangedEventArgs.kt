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

@ABIMarker(DeviceAccessChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceAccessChangedEventArgs;{deda0bcc-4f9d-4f58-9dba-a9bc800408d5})")
@WinRTByReference(brClass = DeviceAccessChangedEventArgs.ByReference::class)
public class DeviceAccessChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceAccessChangedEventArgs.WithDefault,
    IDeviceAccessChangedEventArgs2.WithDefault, IWinRTObject {
  private val __322955291_Interface: IDeviceAccessChangedEventArgs.WithDefault by lazy {
    as_322955291()
  }


  private val __1421679479_Interface: IDeviceAccessChangedEventArgs2.WithDefault by lazy {
    as_1421679479()
  }


  public override val __322955291_Ptr: JNAPointer? by lazy {
    __322955291_Interface.__322955291_Ptr
  }


  public override val __1421679479_Ptr: JNAPointer? by lazy {
    __1421679479_Interface.__1421679479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__322955291_Interface, __1421679479_Interface)

  private fun as_322955291(): IDeviceAccessChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDeviceAccessChangedEventArgs.ABI.makeIDeviceAccessChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceAccessChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceAccessChangedEventArgs.ABI.makeIDeviceAccessChangedEventArgs(ref.value))
  }

  private fun as_1421679479(): IDeviceAccessChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceAccessChangedEventArgs2.ABI.makeIDeviceAccessChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceAccessChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceAccessChangedEventArgs2.ABI.makeIDeviceAccessChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceAccessChangedEventArgs> {
    public override fun getValue() = DeviceAccessChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DeviceAccessChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceAccessChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceAccessChangedEventArgs {
      val address = segment.toRawLongValue()
      return DeviceAccessChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DeviceAccessChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
