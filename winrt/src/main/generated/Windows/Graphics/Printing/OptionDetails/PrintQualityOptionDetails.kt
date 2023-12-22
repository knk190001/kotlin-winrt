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

@ABIMarker(PrintQualityOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintQualityOptionDetails.ByReference::class)
public class PrintQualityOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintItemListOptionDetails.WithDefault,
    IPrintQualityOptionDetails.WithDefault, IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __1989080788_Interface: IPrintItemListOptionDetails.WithDefault by lazy {
    as_1989080788()
  }


  private val __364667742_Interface: IPrintQualityOptionDetails.WithDefault by lazy {
    as_364667742()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __1989080788_Ptr: JNAPointer? by lazy {
    __1989080788_Interface.__1989080788_Ptr
  }


  public override val __364667742_Ptr: JNAPointer? by lazy {
    __364667742_Interface.__364667742_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __1989080788_Interface, __364667742_Interface)

  private fun as_143188995(): IPrintOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(ref.value))
  }

  private fun as_1989080788(): IPrintItemListOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintItemListOptionDetails.ABI.makeIPrintItemListOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintItemListOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintItemListOptionDetails.ABI.makeIPrintItemListOptionDetails(ref.value))
  }

  private fun as_364667742(): IPrintQualityOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintQualityOptionDetails.ABI.makeIPrintQualityOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintQualityOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintQualityOptionDetails.ABI.makeIPrintQualityOptionDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintQualityOptionDetails> {
    public override fun getValue() = PrintQualityOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintQualityOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintQualityOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintQualityOptionDetails {
      val address = segment.toRawLongValue()
      return PrintQualityOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintQualityOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
