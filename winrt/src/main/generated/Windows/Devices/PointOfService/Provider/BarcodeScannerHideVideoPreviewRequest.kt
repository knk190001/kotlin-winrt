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

@ABIMarker(BarcodeScannerHideVideoPreviewRequest.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerHideVideoPreviewRequest;{fa4ebe7f-6670-40e1-b90b-bb10d8d425fa})")
@WinRTByReference(brClass = BarcodeScannerHideVideoPreviewRequest.ByReference::class)
public class BarcodeScannerHideVideoPreviewRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerHideVideoPreviewRequest.WithDefault,
    IBarcodeScannerHideVideoPreviewRequest2.WithDefault, IWinRTObject {
  private val __1940238734_Interface: IBarcodeScannerHideVideoPreviewRequest.WithDefault by lazy {
    as_1940238734()
  }


  private val __17858660_Interface: IBarcodeScannerHideVideoPreviewRequest2.WithDefault by lazy {
    as_17858660()
  }


  public override val __1940238734_Ptr: JNAPointer? by lazy {
    __1940238734_Interface.__1940238734_Ptr
  }


  public override val __17858660_Ptr: JNAPointer? by lazy {
    __17858660_Interface.__17858660_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1940238734_Interface, __17858660_Interface)

  private fun as_1940238734(): IBarcodeScannerHideVideoPreviewRequest.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerHideVideoPreviewRequest.ABI.makeIBarcodeScannerHideVideoPreviewRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerHideVideoPreviewRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerHideVideoPreviewRequest.ABI.makeIBarcodeScannerHideVideoPreviewRequest(ref.value))
  }

  private fun as_17858660(): IBarcodeScannerHideVideoPreviewRequest2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerHideVideoPreviewRequest2.ABI.makeIBarcodeScannerHideVideoPreviewRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerHideVideoPreviewRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerHideVideoPreviewRequest2.ABI.makeIBarcodeScannerHideVideoPreviewRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerHideVideoPreviewRequest> {
    public override fun getValue() = BarcodeScannerHideVideoPreviewRequest(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerHideVideoPreviewRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerHideVideoPreviewRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerHideVideoPreviewRequest {
      val address = segment.toRawLongValue()
      return BarcodeScannerHideVideoPreviewRequest(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerHideVideoPreviewRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
