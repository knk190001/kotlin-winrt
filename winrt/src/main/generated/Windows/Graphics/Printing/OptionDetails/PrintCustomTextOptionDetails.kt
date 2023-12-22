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

@ABIMarker(PrintCustomTextOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails;{390686cf-d682-495f-adfe-d7333f5c1808})")
@WinRTByReference(brClass = PrintCustomTextOptionDetails.ByReference::class)
public class PrintCustomTextOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintOptionDetails.WithDefault, IPrintCustomOptionDetails.WithDefault,
    IPrintCustomTextOptionDetails.WithDefault, IPrintCustomTextOptionDetails2.WithDefault,
    IWinRTObject {
  private val __143188995_Interface: IPrintOptionDetails.WithDefault by lazy {
    as_143188995()
  }


  private val __2747404_Interface: IPrintCustomOptionDetails.WithDefault by lazy {
    as_2747404()
  }


  private val __1797607519_Interface: IPrintCustomTextOptionDetails.WithDefault by lazy {
    as_1797607519()
  }


  private val __108741709_Interface: IPrintCustomTextOptionDetails2.WithDefault by lazy {
    as_108741709()
  }


  public override val __143188995_Ptr: JNAPointer? by lazy {
    __143188995_Interface.__143188995_Ptr
  }


  public override val __2747404_Ptr: JNAPointer? by lazy {
    __2747404_Interface.__2747404_Ptr
  }


  public override val __1797607519_Ptr: JNAPointer? by lazy {
    __1797607519_Interface.__1797607519_Ptr
  }


  public override val __108741709_Ptr: JNAPointer? by lazy {
    __108741709_Interface.__108741709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143188995_Interface, __2747404_Interface, __1797607519_Interface,
        __108741709_Interface)

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

  private fun as_1797607519(): IPrintCustomTextOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomTextOptionDetails.ABI.makeIPrintCustomTextOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomTextOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomTextOptionDetails.ABI.makeIPrintCustomTextOptionDetails(ref.value))
  }

  private fun as_108741709(): IPrintCustomTextOptionDetails2.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomTextOptionDetails2.ABI.makeIPrintCustomTextOptionDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomTextOptionDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomTextOptionDetails2.ABI.makeIPrintCustomTextOptionDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintCustomTextOptionDetails> {
    public override fun getValue() = PrintCustomTextOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintCustomTextOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintCustomTextOptionDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintCustomTextOptionDetails {
      val address = segment.toRawLongValue()
      return PrintCustomTextOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintCustomTextOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
