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

@ABIMarker(BarcodeScannerStartSoftwareTriggerRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerStartSoftwareTriggerRequest;{e3fa7b27-ff62-4454-af4a-cb6144a3e3f7})")
@WinRTByReference(brClass = BarcodeScannerStartSoftwareTriggerRequest.ByReference::class)
public class BarcodeScannerStartSoftwareTriggerRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerStartSoftwareTriggerRequest.WithDefault,
    IBarcodeScannerStartSoftwareTriggerRequest2.WithDefault, IWinRTObject {
  private val __1870382702_Interface: IBarcodeScannerStartSoftwareTriggerRequest.WithDefault by
      lazy {
    as_1870382702()
  }


  private val __2147288964_Interface: IBarcodeScannerStartSoftwareTriggerRequest2.WithDefault by
      lazy {
    as_2147288964()
  }


  public override val __1870382702_Ptr: JNAPointer? by lazy {
    __1870382702_Interface.__1870382702_Ptr
  }


  public override val __2147288964_Ptr: JNAPointer? by lazy {
    __2147288964_Interface.__2147288964_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1870382702_Interface, __2147288964_Interface)

  private fun as_1870382702(): IBarcodeScannerStartSoftwareTriggerRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStartSoftwareTriggerRequest.ABI.makeIBarcodeScannerStartSoftwareTriggerRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStartSoftwareTriggerRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStartSoftwareTriggerRequest.ABI.makeIBarcodeScannerStartSoftwareTriggerRequest(ref.value))
  }

  private fun as_2147288964(): IBarcodeScannerStartSoftwareTriggerRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerStartSoftwareTriggerRequest2.ABI.makeIBarcodeScannerStartSoftwareTriggerRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerStartSoftwareTriggerRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerStartSoftwareTriggerRequest2.ABI.makeIBarcodeScannerStartSoftwareTriggerRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerStartSoftwareTriggerRequest> {
    public override fun getValue() =
        BarcodeScannerStartSoftwareTriggerRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerStartSoftwareTriggerRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerStartSoftwareTriggerRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerStartSoftwareTriggerRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerStartSoftwareTriggerRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerStartSoftwareTriggerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
