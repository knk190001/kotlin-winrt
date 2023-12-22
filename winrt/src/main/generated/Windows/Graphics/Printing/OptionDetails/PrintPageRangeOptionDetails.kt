package Windows.Graphics.Printing.OptionDetails

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

@ABIMarker(PrintPageRangeOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintPageRangeOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintPageRangeOptionDetails.ByReference::class)
public class PrintPageRangeOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintPageRangeOptionDetails.WithDefault,
    IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __813386545_Interface: IPrintPageRangeOptionDetails.WithDefault by lazy {
    as_813386545()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __813386545_Ptr: JNAPointer? by lazy {
    __813386545_Interface.__813386545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __813386545_Interface)

  private fun as_143188995(): IPrintOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(ref.value))
  }

  private fun as_813386545(): IPrintPageRangeOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintPageRangeOptionDetails.ABI.makeIPrintPageRangeOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintPageRangeOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintPageRangeOptionDetails.ABI.makeIPrintPageRangeOptionDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintPageRangeOptionDetails> {
    public override fun getValue() = PrintPageRangeOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintPageRangeOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintPageRangeOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintPageRangeOptionDetails {
      val address = segment.toRawLongValue()
      return PrintPageRangeOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintPageRangeOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
