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

@ABIMarker(PrintCollationOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintCollationOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintCollationOptionDetails.ByReference::class)
public class PrintCollationOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintItemListOptionDetails.WithDefault,
    IPrintCollationOptionDetails.WithDefault, IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __1989080788_Interface: IPrintItemListOptionDetails.WithDefault by lazy {
    as_1989080788()
  }


  private val __1444982508_Interface: IPrintCollationOptionDetails.WithDefault by lazy {
    as_1444982508()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __1989080788_Ptr: JNAPointer? by lazy {
    __1989080788_Interface.__1989080788_Ptr
  }


  public override val __1444982508_Ptr: JNAPointer? by lazy {
    __1444982508_Interface.__1444982508_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __1989080788_Interface, __1444982508_Interface)

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

  private fun as_1444982508(): IPrintCollationOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCollationOptionDetails.ABI.makeIPrintCollationOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCollationOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCollationOptionDetails.ABI.makeIPrintCollationOptionDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintCollationOptionDetails> {
    public override fun getValue() = PrintCollationOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintCollationOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintCollationOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintCollationOptionDetails {
      val address = segment.toRawLongValue()
      return PrintCollationOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintCollationOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
