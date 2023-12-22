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

@ABIMarker(BarcodeScannerEnableScannerRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerEnableScannerRequest;{c0b3e9ba-816a-452b-bd77-b7e453ec446d})")
@WinRTByReference(brClass = BarcodeScannerEnableScannerRequest.ByReference::class)
public class BarcodeScannerEnableScannerRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerEnableScannerRequest.WithDefault,
    IBarcodeScannerEnableScannerRequest2.WithDefault, IWinRTObject {
  private val __754035366_Interface: IBarcodeScannerEnableScannerRequest.WithDefault by lazy {
    as_754035366()
  }


  private val __1900259916_Interface: IBarcodeScannerEnableScannerRequest2.WithDefault by lazy {
    as_1900259916()
  }


  public override val __754035366_Ptr: JNAPointer? by lazy {
    __754035366_Interface.__754035366_Ptr
  }


  public override val __1900259916_Ptr: JNAPointer? by lazy {
    __1900259916_Interface.__1900259916_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__754035366_Interface, __1900259916_Interface)

  private fun as_754035366(): IBarcodeScannerEnableScannerRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerEnableScannerRequest.ABI.makeIBarcodeScannerEnableScannerRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerEnableScannerRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerEnableScannerRequest.ABI.makeIBarcodeScannerEnableScannerRequest(ref.value))
  }

  private fun as_1900259916(): IBarcodeScannerEnableScannerRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerEnableScannerRequest2.ABI.makeIBarcodeScannerEnableScannerRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerEnableScannerRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerEnableScannerRequest2.ABI.makeIBarcodeScannerEnableScannerRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerEnableScannerRequest> {
    public override fun getValue() = BarcodeScannerEnableScannerRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerEnableScannerRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerEnableScannerRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerEnableScannerRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerEnableScannerRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerEnableScannerRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
