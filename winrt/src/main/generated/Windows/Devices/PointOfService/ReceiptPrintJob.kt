package Windows.Devices.PointOfService

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

@ABIMarker(ReceiptPrintJob.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ReceiptPrintJob;{aa96066e-acad-4b79-9d0f-c0cfc08dc77b})")
@WinRTByReference(brClass = ReceiptPrintJob.ByReference::class)
public class ReceiptPrintJob(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IReceiptPrintJob.WithDefault, IReceiptPrintJob2.WithDefault,
    IReceiptOrSlipJob.WithDefault, IPosPrinterJob.WithDefault, IWinRTObject {
  private val __818460887_Interface: IReceiptPrintJob.WithDefault by lazy {
    as_818460887()
  }


  private val __397516329_Interface: IReceiptPrintJob2.WithDefault by lazy {
    as_397516329()
  }


  private val __206561087_Interface: IReceiptOrSlipJob.WithDefault by lazy {
    as_206561087()
  }


  private val __738591224_Interface: IPosPrinterJob.WithDefault by lazy {
    as_738591224()
  }


  public override val __818460887_Ptr: JNAPointer? by lazy {
    __818460887_Interface.__818460887_Ptr
  }


  public override val __397516329_Ptr: JNAPointer? by lazy {
    __397516329_Interface.__397516329_Ptr
  }


  public override val __206561087_Ptr: JNAPointer? by lazy {
    __206561087_Interface.__206561087_Ptr
  }


  public override val __738591224_Ptr: JNAPointer? by lazy {
    __738591224_Interface.__738591224_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__818460887_Interface, __397516329_Interface, __206561087_Interface,
        __738591224_Interface)

  private fun as_818460887(): IReceiptPrintJob.WithDefault {
    if(pointer == NULL) {
      return(IReceiptPrintJob.ABI.makeIReceiptPrintJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReceiptPrintJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReceiptPrintJob.ABI.makeIReceiptPrintJob(ref.value))
  }

  private fun as_397516329(): IReceiptPrintJob2.WithDefault {
    if(pointer == NULL) {
      return(IReceiptPrintJob2.ABI.makeIReceiptPrintJob2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReceiptPrintJob2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReceiptPrintJob2.ABI.makeIReceiptPrintJob2(ref.value))
  }

  private fun as_206561087(): IReceiptOrSlipJob.WithDefault {
    if(pointer == NULL) {
      return(IReceiptOrSlipJob.ABI.makeIReceiptOrSlipJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReceiptOrSlipJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReceiptOrSlipJob.ABI.makeIReceiptOrSlipJob(ref.value))
  }

  private fun as_738591224(): IPosPrinterJob.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinterJob.ABI.makeIPosPrinterJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinterJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinterJob.ABI.makeIPosPrinterJob(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ReceiptPrintJob> {
    public override fun getValue() = ReceiptPrintJob(pointer.getPointer(0))

    public fun setValue(value: ReceiptPrintJob): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ReceiptPrintJob, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ReceiptPrintJob {
      val address = segment.toRawLongValue()
      return ReceiptPrintJob(Pointer(address))
    }

    public override fun toNative(obj: ReceiptPrintJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
