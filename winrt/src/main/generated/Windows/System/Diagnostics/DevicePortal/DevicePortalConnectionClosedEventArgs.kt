package Windows.System.Diagnostics.DevicePortal

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

@ABIMarker(DevicePortalConnectionClosedEventArgs.ABI::class)
@Signature("rc(Windows.System.Diagnostics.DevicePortal.DevicePortalConnectionClosedEventArgs;{fcf70e38-7032-428c-9f50-945c15a9f0cb})")
@WinRTByReference(brClass = DevicePortalConnectionClosedEventArgs.ByReference::class)
public class DevicePortalConnectionClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePortalConnectionClosedEventArgs.WithDefault, IWinRTObject {
  private val __1165752934_Interface: IDevicePortalConnectionClosedEventArgs.WithDefault by lazy {
    as_1165752934()
  }


  public override val __1165752934_Ptr: JNAPointer? by lazy {
    __1165752934_Interface.__1165752934_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1165752934_Interface)

  private fun as_1165752934(): IDevicePortalConnectionClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDevicePortalConnectionClosedEventArgs.ABI.makeIDevicePortalConnectionClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePortalConnectionClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePortalConnectionClosedEventArgs.ABI.makeIDevicePortalConnectionClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePortalConnectionClosedEventArgs> {
    public override fun getValue() = DevicePortalConnectionClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DevicePortalConnectionClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePortalConnectionClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DevicePortalConnectionClosedEventArgs {
      val address = segment.toRawLongValue()
      return DevicePortalConnectionClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DevicePortalConnectionClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
