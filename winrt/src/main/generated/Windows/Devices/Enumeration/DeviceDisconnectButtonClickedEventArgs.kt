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

@ABIMarker(DeviceDisconnectButtonClickedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceDisconnectButtonClickedEventArgs;{8e44b56d-f902-4a00-b536-f37992e6a2a7})")
@WinRTByReference(brClass = DeviceDisconnectButtonClickedEventArgs.ByReference::class)
public class DeviceDisconnectButtonClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceDisconnectButtonClickedEventArgs.WithDefault, IWinRTObject {
  private val __881414290_Interface: IDeviceDisconnectButtonClickedEventArgs.WithDefault by lazy {
    as_881414290()
  }


  public override val __881414290_Ptr: JNAPointer? by lazy {
    __881414290_Interface.__881414290_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__881414290_Interface)

  private fun as_881414290(): IDeviceDisconnectButtonClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDeviceDisconnectButtonClickedEventArgs.ABI.makeIDeviceDisconnectButtonClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceDisconnectButtonClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceDisconnectButtonClickedEventArgs.ABI.makeIDeviceDisconnectButtonClickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceDisconnectButtonClickedEventArgs> {
    public override fun getValue() = DeviceDisconnectButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DeviceDisconnectButtonClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceDisconnectButtonClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeviceDisconnectButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return DeviceDisconnectButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DeviceDisconnectButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
