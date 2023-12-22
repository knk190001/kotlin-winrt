package Windows.Devices.Display

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayMonitor.ABI::class)
@Signature("rc(Windows.Devices.Display.DisplayMonitor;{1f6b15d4-1d01-4c51-87e2-6f954a772b59})")
@WinRTByReference(brClass = DisplayMonitor.ByReference::class)
public class DisplayMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayMonitor.WithDefault, IDisplayMonitor2.WithDefault, IWinRTObject {
  private val __1347452101_Interface: IDisplayMonitor.WithDefault by lazy {
    as_1347452101()
  }


  private val __1178657879_Interface: IDisplayMonitor2.WithDefault by lazy {
    as_1178657879()
  }


  public override val __1347452101_Ptr: JNAPointer? by lazy {
    __1347452101_Interface.__1347452101_Ptr
  }


  public override val __1178657879_Ptr: JNAPointer? by lazy {
    __1178657879_Interface.__1178657879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1347452101_Interface, __1178657879_Interface)

  private fun as_1347452101(): IDisplayMonitor.WithDefault {
    if(pointer == NULL) {
      return(IDisplayMonitor.ABI.makeIDisplayMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayMonitor.ABI.makeIDisplayMonitor(ref.value))
  }

  private fun as_1178657879(): IDisplayMonitor2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayMonitor2.ABI.makeIDisplayMonitor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayMonitor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayMonitor2.ABI.makeIDisplayMonitor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayMonitor>
      {
    public override fun getValue() = DisplayMonitor(pointer.getPointer(0))

    public fun setValue(value: DisplayMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayMonitor, MemoryAddress> {
    public val IDisplayMonitorStatics_Instance: IDisplayMonitorStatics by lazy {
      createIDisplayMonitorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayMonitorStatics(): IDisplayMonitorStatics {
      val refiid = Guid.REFIID(IDisplayMonitorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.DisplayMonitor".toHandle(),refiid,interfacePtr)
      val result = IDisplayMonitorStatics.ABI.makeIDisplayMonitorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayMonitor {
      val address = segment.toRawLongValue()
      return DisplayMonitor(Pointer(address))
    }

    public override fun toNative(obj: DisplayMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IDisplayMonitorStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IDisplayMonitorStatics_Instance.FromIdAsync(deviceId)

    public fun FromInterfaceIdAsync(deviceInterfaceId: String) =
        ABI.IDisplayMonitorStatics_Instance.FromInterfaceIdAsync(deviceInterfaceId)
  }
}
