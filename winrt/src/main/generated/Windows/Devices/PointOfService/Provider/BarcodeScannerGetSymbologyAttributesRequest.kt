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

@ABIMarker(BarcodeScannerGetSymbologyAttributesRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerGetSymbologyAttributesRequest;{9774c46a-58e4-4c5f-b8e9-e41467632700})")
@WinRTByReference(brClass = BarcodeScannerGetSymbologyAttributesRequest.ByReference::class)
public class BarcodeScannerGetSymbologyAttributesRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerGetSymbologyAttributesRequest.WithDefault,
    IBarcodeScannerGetSymbologyAttributesRequest2.WithDefault, IWinRTObject {
  private val __940706861_Interface: IBarcodeScannerGetSymbologyAttributesRequest.WithDefault by
      lazy {
    as_940706861()
  }


  private val __902858431_Interface: IBarcodeScannerGetSymbologyAttributesRequest2.WithDefault by
      lazy {
    as_902858431()
  }


  public override val __940706861_Ptr: JNAPointer? by lazy {
    __940706861_Interface.__940706861_Ptr
  }


  public override val __902858431_Ptr: JNAPointer? by lazy {
    __902858431_Interface.__902858431_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__940706861_Interface, __902858431_Interface)

  private fun as_940706861(): IBarcodeScannerGetSymbologyAttributesRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerGetSymbologyAttributesRequest.ABI.makeIBarcodeScannerGetSymbologyAttributesRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerGetSymbologyAttributesRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerGetSymbologyAttributesRequest.ABI.makeIBarcodeScannerGetSymbologyAttributesRequest(ref.value))
  }

  private fun as_902858431(): IBarcodeScannerGetSymbologyAttributesRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerGetSymbologyAttributesRequest2.ABI.makeIBarcodeScannerGetSymbologyAttributesRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerGetSymbologyAttributesRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerGetSymbologyAttributesRequest2.ABI.makeIBarcodeScannerGetSymbologyAttributesRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerGetSymbologyAttributesRequest> {
    public override fun getValue() =
        BarcodeScannerGetSymbologyAttributesRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerGetSymbologyAttributesRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerGetSymbologyAttributesRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerGetSymbologyAttributesRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerGetSymbologyAttributesRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerGetSymbologyAttributesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
