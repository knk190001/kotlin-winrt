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

@ABIMarker(PrintCustomItemListOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintCustomItemListOptionDetails.ByReference::class)
public class PrintCustomItemListOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintCustomOptionDetails.WithDefault,
    IPrintItemListOptionDetails.WithDefault, IPrintCustomItemListOptionDetails.WithDefault,
    IPrintCustomItemListOptionDetails2.WithDefault, IPrintCustomItemListOptionDetails3.WithDefault,
    IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __2747404_Interface: IPrintCustomOptionDetails.WithDefault by lazy {
    as_2747404()
  }


  private val __1989080788_Interface: IPrintItemListOptionDetails.WithDefault by lazy {
    as_1989080788()
  }


  private val __173431355_Interface: IPrintCustomItemListOptionDetails.WithDefault by lazy {
    as_173431355()
  }


  private val __1081404759_Interface: IPrintCustomItemListOptionDetails2.WithDefault by lazy {
    as_1081404759()
  }


  private val __1081404760_Interface: IPrintCustomItemListOptionDetails3.WithDefault by lazy {
    as_1081404760()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __2747404_Ptr: JNAPointer? by lazy {
    __2747404_Interface.__2747404_Ptr
  }


  public override val __1989080788_Ptr: JNAPointer? by lazy {
    __1989080788_Interface.__1989080788_Ptr
  }


  public override val __173431355_Ptr: JNAPointer? by lazy {
    __173431355_Interface.__173431355_Ptr
  }


  public override val __1081404759_Ptr: JNAPointer? by lazy {
    __1081404759_Interface.__1081404759_Ptr
  }


  public override val __1081404760_Ptr: JNAPointer? by lazy {
    __1081404760_Interface.__1081404760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __2747404_Interface, __1989080788_Interface,
        __173431355_Interface, __1081404759_Interface, __1081404760_Interface)

  private fun as_143188995(): IPrintOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintOptionDetails.ABI.makeIPrintOptionDetails(ref.value))
  }

  private fun as_2747404(): IPrintCustomOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomOptionDetails.ABI.makeIPrintCustomOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomOptionDetails.ABI.makeIPrintCustomOptionDetails(ref.value))
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

  private fun as_173431355(): IPrintCustomItemListOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomItemListOptionDetails.ABI.makeIPrintCustomItemListOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomItemListOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomItemListOptionDetails.ABI.makeIPrintCustomItemListOptionDetails(ref.value))
  }

  private fun as_1081404759(): IPrintCustomItemListOptionDetails2.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomItemListOptionDetails2.ABI.makeIPrintCustomItemListOptionDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomItemListOptionDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomItemListOptionDetails2.ABI.makeIPrintCustomItemListOptionDetails2(ref.value))
  }

  private fun as_1081404760(): IPrintCustomItemListOptionDetails3.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomItemListOptionDetails3.ABI.makeIPrintCustomItemListOptionDetails3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomItemListOptionDetails3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomItemListOptionDetails3.ABI.makeIPrintCustomItemListOptionDetails3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintCustomItemListOptionDetails> {
    public override fun getValue() = PrintCustomItemListOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintCustomItemListOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintCustomItemListOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintCustomItemListOptionDetails {
      val address = segment.toRawLongValue()
      return PrintCustomItemListOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintCustomItemListOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
