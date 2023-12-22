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

@ABIMarker(DeviceWatcher.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceWatcher;{c9eab97d-8f6b-4f96-a9f4-abc814e22271})")
@WinRTByReference(brClass = DeviceWatcher.ByReference::class)
public class DeviceWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceWatcher.WithDefault, IDeviceWatcher2.WithDefault, IWinRTObject {
  private val __432891880_Interface: IDeviceWatcher.WithDefault by lazy {
    as_432891880()
  }


  private val __534746442_Interface: IDeviceWatcher2.WithDefault by lazy {
    as_534746442()
  }


  public override val __432891880_Ptr: JNAPointer? by lazy {
    __432891880_Interface.__432891880_Ptr
  }


  public override val __534746442_Ptr: JNAPointer? by lazy {
    __534746442_Interface.__534746442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__432891880_Interface, __534746442_Interface)

  private fun as_432891880(): IDeviceWatcher.WithDefault {
    if(pointer == NULL) {
      return(IDeviceWatcher.ABI.makeIDeviceWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceWatcher.ABI.makeIDeviceWatcher(ref.value))
  }

  private fun as_534746442(): IDeviceWatcher2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceWatcher2.ABI.makeIDeviceWatcher2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceWatcher2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceWatcher2.ABI.makeIDeviceWatcher2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DeviceWatcher>
      {
    public override fun getValue() = DeviceWatcher(pointer.getPointer(0))

    public fun setValue(value: DeviceWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceWatcher {
      val address = segment.toRawLongValue()
      return DeviceWatcher(Pointer(address))
    }

    public override fun toNative(obj: DeviceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
