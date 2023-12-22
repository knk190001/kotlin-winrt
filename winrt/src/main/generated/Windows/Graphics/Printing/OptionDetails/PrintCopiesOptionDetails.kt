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

@ABIMarker(PrintCopiesOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintCopiesOptionDetails.ByReference::class)
public class PrintCopiesOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintNumberOptionDetails.WithDefault,
    IPrintCopiesOptionDetails.WithDefault, IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __50193612_Interface: IPrintNumberOptionDetails.WithDefault by lazy {
    as_50193612()
  }


  private val __1977806870_Interface: IPrintCopiesOptionDetails.WithDefault by lazy {
    as_1977806870()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __50193612_Ptr: JNAPointer? by lazy {
    __50193612_Interface.__50193612_Ptr
  }


  public override val __1977806870_Ptr: JNAPointer? by lazy {
    __1977806870_Interface.__1977806870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __50193612_Interface, __1977806870_Interface)

  private fun as_143188995(): IPrintOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(ref.value))
  }

  private fun as_50193612(): IPrintNumberOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintNumberOptionDetails.ABI.makeIPrintNumberOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintNumberOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintNumberOptionDetails.ABI.makeIPrintNumberOptionDetails(ref.value))
  }

  private fun as_1977806870(): IPrintCopiesOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCopiesOptionDetails.ABI.makeIPrintCopiesOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCopiesOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCopiesOptionDetails.ABI.makeIPrintCopiesOptionDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintCopiesOptionDetails> {
    public override fun getValue() = PrintCopiesOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintCopiesOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintCopiesOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintCopiesOptionDetails {
      val address = segment.toRawLongValue()
      return PrintCopiesOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintCopiesOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
