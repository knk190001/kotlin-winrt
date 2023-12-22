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

@ABIMarker(BarcodeScannerStopSoftwareTriggerRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerStopSoftwareTriggerRequest;{6f9faf35-e287-4ca8-b70d-5a91d694f668})")
@WinRTByReference(brClass = BarcodeScannerStopSoftwareTriggerRequest.ByReference::class)
public class BarcodeScannerStopSoftwareTriggerRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerStopSoftwareTriggerRequest.WithDefault,
    IBarcodeScannerStopSoftwareTriggerRequest2.WithDefault, IWinRTObject {
  private val __1134404594_Interface: IBarcodeScannerStopSoftwareTriggerRequest.WithDefault by
      lazy {
    as_1134404594()
  }


  private val __806804096_Interface: IBarcodeScannerStopSoftwareTriggerRequest2.WithDefault by
      lazy {
    as_806804096()
  }


  public override val __1134404594_Ptr: JNAPointer? by lazy {
    __1134404594_Interface.__1134404594_Ptr
  }


  public override val __806804096_Ptr: JNAPointer? by lazy {
    __806804096_Interface.__806804096_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1134404594_Interface, __806804096_Interface)

  private fun as_1134404594(): IBarcodeScannerStopSoftwareTriggerRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStopSoftwareTriggerRequest.ABI.makeIBarcodeScannerStopSoftwareTriggerRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStopSoftwareTriggerRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStopSoftwareTriggerRequest.ABI.makeIBarcodeScannerStopSoftwareTriggerRequest(ref.value))
  }

  private fun as_806804096(): IBarcodeScannerStopSoftwareTriggerRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStopSoftwareTriggerRequest2.ABI.makeIBarcodeScannerStopSoftwareTriggerRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStopSoftwareTriggerRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStopSoftwareTriggerRequest2.ABI.makeIBarcodeScannerStopSoftwareTriggerRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerStopSoftwareTriggerRequest> {
    public override fun getValue() = BarcodeScannerStopSoftwareTriggerRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerStopSoftwareTriggerRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerStopSoftwareTriggerRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerStopSoftwareTriggerRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerStopSoftwareTriggerRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerStopSoftwareTriggerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
