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

@ABIMarker(BarcodeScannerSetActiveSymbologiesRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerSetActiveSymbologiesRequest;{db3f32b9-f7da-41a1-9f79-07bcd95f0bdf})")
@WinRTByReference(brClass = BarcodeScannerSetActiveSymbologiesRequest.ByReference::class)
public class BarcodeScannerSetActiveSymbologiesRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerSetActiveSymbologiesRequest.WithDefault,
    IBarcodeScannerSetActiveSymbologiesRequest2.WithDefault, IWinRTObject {
  private val __1569419906_Interface: IBarcodeScannerSetActiveSymbologiesRequest.WithDefault by
      lazy {
    as_1569419906()
  }


  private val __1407376780_Interface: IBarcodeScannerSetActiveSymbologiesRequest2.WithDefault by
      lazy {
    as_1407376780()
  }


  public override val __1569419906_Ptr: JNAPointer? by lazy {
    __1569419906_Interface.__1569419906_Ptr
  }


  public override val __1407376780_Ptr: JNAPointer? by lazy {
    __1407376780_Interface.__1407376780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1569419906_Interface, __1407376780_Interface)

  private fun as_1569419906(): IBarcodeScannerSetActiveSymbologiesRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetActiveSymbologiesRequest.ABI.makeIBarcodeScannerSetActiveSymbologiesRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetActiveSymbologiesRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetActiveSymbologiesRequest.ABI.makeIBarcodeScannerSetActiveSymbologiesRequest(ref.value))
  }

  private fun as_1407376780(): IBarcodeScannerSetActiveSymbologiesRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerSetActiveSymbologiesRequest2.ABI.makeIBarcodeScannerSetActiveSymbologiesRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerSetActiveSymbologiesRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerSetActiveSymbologiesRequest2.ABI.makeIBarcodeScannerSetActiveSymbologiesRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerSetActiveSymbologiesRequest> {
    public override fun getValue() =
        BarcodeScannerSetActiveSymbologiesRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerSetActiveSymbologiesRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerSetActiveSymbologiesRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerSetActiveSymbologiesRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerSetActiveSymbologiesRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerSetActiveSymbologiesRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
