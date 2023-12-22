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

@ABIMarker(BarcodeScannerSetSymbologyAttributesRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerSetSymbologyAttributesRequest;{32fb814f-a37f-48b0-acea-dce1480f12ae})")
@WinRTByReference(brClass = BarcodeScannerSetSymbologyAttributesRequest.ByReference::class)
public class BarcodeScannerSetSymbologyAttributesRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerSetSymbologyAttributesRequest.WithDefault,
    IBarcodeScannerSetSymbologyAttributesRequest2.WithDefault, IWinRTObject {
  private val __1213421089_Interface: IBarcodeScannerSetSymbologyAttributesRequest.WithDefault by
      lazy {
    as_1213421089()
  }


  private val __1038651955_Interface: IBarcodeScannerSetSymbologyAttributesRequest2.WithDefault by
      lazy {
    as_1038651955()
  }


  public override val __1213421089_Ptr: JNAPointer? by lazy {
    __1213421089_Interface.__1213421089_Ptr
  }


  public override val __1038651955_Ptr: JNAPointer? by lazy {
    __1038651955_Interface.__1038651955_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1213421089_Interface, __1038651955_Interface)

  private fun as_1213421089(): IBarcodeScannerSetSymbologyAttributesRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetSymbologyAttributesRequest.ABI.makeIBarcodeScannerSetSymbologyAttributesRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetSymbologyAttributesRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetSymbologyAttributesRequest.ABI.makeIBarcodeScannerSetSymbologyAttributesRequest(ref.value))
  }

  private fun as_1038651955(): IBarcodeScannerSetSymbologyAttributesRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetSymbologyAttributesRequest2.ABI.makeIBarcodeScannerSetSymbologyAttributesRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetSymbologyAttributesRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetSymbologyAttributesRequest2.ABI.makeIBarcodeScannerSetSymbologyAttributesRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerSetSymbologyAttributesRequest> {
    public override fun getValue() =
        BarcodeScannerSetSymbologyAttributesRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerSetSymbologyAttributesRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerSetSymbologyAttributesRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerSetSymbologyAttributesRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerSetSymbologyAttributesRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerSetSymbologyAttributesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
