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

@ABIMarker(DevicePortalConnectionRequestReceivedEventArgs.ABI::class)
@Signature("rc(Windows.System.Diagnostics.DevicePortal.DevicePortalConnectionRequestReceivedEventArgs;{64dae045-6fda-4459-9ebd-ecce22e38559})")
@WinRTByReference(brClass = DevicePortalConnectionRequestReceivedEventArgs.ByReference::class)
public class DevicePortalConnectionRequestReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDevicePortalConnectionRequestReceivedEventArgs.WithDefault,
    IDevicePortalWebSocketConnectionRequestReceivedEventArgs.WithDefault, IWinRTObject {
  private val __910125240_Interface: IDevicePortalConnectionRequestReceivedEventArgs.WithDefault by
      lazy {
    as_910125240()
  }


  private val __17963335_Interface:
      IDevicePortalWebSocketConnectionRequestReceivedEventArgs.WithDefault by lazy {
    as_17963335()
  }


  public override val __910125240_Ptr: JNAPointer? by lazy {
    __910125240_Interface.__910125240_Ptr
  }


  public override val __17963335_Ptr: JNAPointer? by lazy {
    __17963335_Interface.__17963335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__910125240_Interface, __17963335_Interface)

  private fun as_910125240(): IDevicePortalConnectionRequestReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDevicePortalConnectionRequestReceivedEventArgs.ABI.makeIDevicePortalConnectionRequestReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePortalConnectionRequestReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePortalConnectionRequestReceivedEventArgs.ABI.makeIDevicePortalConnectionRequestReceivedEventArgs(ref.value))
  }

  private fun as_17963335(): IDevicePortalWebSocketConnectionRequestReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDevicePortalWebSocketConnectionRequestReceivedEventArgs.ABI.makeIDevicePortalWebSocketConnectionRequestReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePortalWebSocketConnectionRequestReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePortalWebSocketConnectionRequestReceivedEventArgs.ABI.makeIDevicePortalWebSocketConnectionRequestReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DevicePortalConnectionRequestReceivedEventArgs> {
    public override fun getValue() =
        DevicePortalConnectionRequestReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DevicePortalConnectionRequestReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DevicePortalConnectionRequestReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DevicePortalConnectionRequestReceivedEventArgs {
      val address = segment.toRawLongValue()
      return DevicePortalConnectionRequestReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DevicePortalConnectionRequestReceivedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
