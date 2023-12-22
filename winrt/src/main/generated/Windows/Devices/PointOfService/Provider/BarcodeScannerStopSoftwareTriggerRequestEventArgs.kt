package Windows.Devices.PointOfService.Provider

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

@ABIMarker(BarcodeScannerStopSoftwareTriggerRequestEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerStopSoftwareTriggerRequestEventArgs;{eac34450-4eb7-481a-9273-147a273b99b8})")
@WinRTByReference(brClass = BarcodeScannerStopSoftwareTriggerRequestEventArgs.ByReference::class)
public class BarcodeScannerStopSoftwareTriggerRequestEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerStopSoftwareTriggerRequestEventArgs.WithDefault, IWinRTObject {
  private val __1497389371_Interface: IBarcodeScannerStopSoftwareTriggerRequestEventArgs.WithDefault
      by lazy {
    as_1497389371()
  }


  public override val __1497389371_Ptr: JNAPointer? by lazy {
    __1497389371_Interface.__1497389371_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1497389371_Interface)

  private fun as_1497389371(): IBarcodeScannerStopSoftwareTriggerRequestEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStopSoftwareTriggerRequestEventArgs.ABI.makeIBarcodeScannerStopSoftwareTriggerRequestEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStopSoftwareTriggerRequestEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStopSoftwareTriggerRequestEventArgs.ABI.makeIBarcodeScannerStopSoftwareTriggerRequestEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerStopSoftwareTriggerRequestEventArgs> {
    public override fun getValue() =
        BarcodeScannerStopSoftwareTriggerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerStopSoftwareTriggerRequestEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerStopSoftwareTriggerRequestEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerStopSoftwareTriggerRequestEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerStopSoftwareTriggerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerStopSoftwareTriggerRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
