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

@ABIMarker(SlipPrintJob.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.SlipPrintJob;{5d88f95d-6131-5a4b-b7d5-8ef2da7b4165})")
@WinRTByReference(brClass = SlipPrintJob.ByReference::class)
public class SlipPrintJob(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISlipPrintJob.WithDefault, IReceiptOrSlipJob.WithDefault,
    IPosPrinterJob.WithDefault, IWinRTObject {
  private val __763865137_Interface: ISlipPrintJob.WithDefault by lazy {
    as_763865137()
  }


  private val __206561087_Interface: IReceiptOrSlipJob.WithDefault by lazy {
    as_206561087()
  }


  private val __738591224_Interface: IPosPrinterJob.WithDefault by lazy {
    as_738591224()
  }


  public override val __763865137_Ptr: JNAPointer? by lazy {
    __763865137_Interface.__763865137_Ptr
  }


  public override val __206561087_Ptr: JNAPointer? by lazy {
    __206561087_Interface.__206561087_Ptr
  }


  public override val __738591224_Ptr: JNAPointer? by lazy {
    __738591224_Interface.__738591224_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__763865137_Interface, __206561087_Interface, __738591224_Interface)

  private fun as_763865137(): ISlipPrintJob.WithDefault {
    if(pointer == NULL) {
      return(ISlipPrintJob.ABI.makeISlipPrintJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlipPrintJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlipPrintJob.ABI.makeISlipPrintJob(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SlipPrintJob> {
    public override fun getValue() = SlipPrintJob(pointer.getPointer(0))

    public fun setValue(value: SlipPrintJob): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SlipPrintJob, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SlipPrintJob {
      val address = segment.toRawLongValue()
      return SlipPrintJob(Pointer(address))
    }

    public override fun toNative(obj: SlipPrintJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
