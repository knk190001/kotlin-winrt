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

@ABIMarker(JournalPrintJob.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.JournalPrintJob;{9f4f2864-f3f0-55d0-8c39-74cc91783eed})")
@WinRTByReference(brClass = JournalPrintJob.ByReference::class)
public class JournalPrintJob(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJournalPrintJob.WithDefault, IPosPrinterJob.WithDefault, IWinRTObject {
  private val __230157016_Interface: IJournalPrintJob.WithDefault by lazy {
    as_230157016()
  }


  private val __738591224_Interface: IPosPrinterJob.WithDefault by lazy {
    as_738591224()
  }


  public override val __230157016_Ptr: JNAPointer? by lazy {
    __230157016_Interface.__230157016_Ptr
  }


  public override val __738591224_Ptr: JNAPointer? by lazy {
    __738591224_Interface.__738591224_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__230157016_Interface, __738591224_Interface)

  private fun as_230157016(): IJournalPrintJob.WithDefault {
    if(pointer == NULL) {
      return(IJournalPrintJob.ABI.makeIJournalPrintJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJournalPrintJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJournalPrintJob.ABI.makeIJournalPrintJob(ref.value))
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
      IByReference<JournalPrintJob> {
    public override fun getValue() = JournalPrintJob(pointer.getPointer(0))

    public fun setValue(value: JournalPrintJob): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JournalPrintJob, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): JournalPrintJob {
      val address = segment.toRawLongValue()
      return JournalPrintJob(Pointer(address))
    }

    public override fun toNative(obj: JournalPrintJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
