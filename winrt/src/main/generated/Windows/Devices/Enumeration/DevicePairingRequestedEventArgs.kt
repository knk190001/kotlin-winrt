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

@ABIMarker(DevicePairingRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DevicePairingRequestedEventArgs;{f717fc56-de6b-487f-8376-0180aca69963})")
@WinRTByReference(brClass = DevicePairingRequestedEventArgs.ByReference::class)
public class DevicePairingRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePairingRequestedEventArgs.WithDefault,
    IDevicePairingRequestedEventArgs2.WithDefault, IWinRTObject {
  private val __1310483165_Interface: IDevicePairingRequestedEventArgs.WithDefault by lazy {
    as_1310483165()
  }


  private val __1970272501_Interface: IDevicePairingRequestedEventArgs2.WithDefault by lazy {
    as_1970272501()
  }


  public override val __1310483165_Ptr: JNAPointer? by lazy {
    __1310483165_Interface.__1310483165_Ptr
  }


  public override val __1970272501_Ptr: JNAPointer? by lazy {
    __1970272501_Interface.__1970272501_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1310483165_Interface, __1970272501_Interface)

  private fun as_1310483165(): IDevicePairingRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDevicePairingRequestedEventArgs.ABI.makeIDevicePairingRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePairingRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePairingRequestedEventArgs.ABI.makeIDevicePairingRequestedEventArgs(ref.value))
  }

  private fun as_1970272501(): IDevicePairingRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IDevicePairingRequestedEventArgs2.ABI.makeIDevicePairingRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePairingRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePairingRequestedEventArgs2.ABI.makeIDevicePairingRequestedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePairingRequestedEventArgs> {
    public override fun getValue() = DevicePairingRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DevicePairingRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePairingRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DevicePairingRequestedEventArgs {
      val address = segment.toRawLongValue()
      return DevicePairingRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DevicePairingRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
