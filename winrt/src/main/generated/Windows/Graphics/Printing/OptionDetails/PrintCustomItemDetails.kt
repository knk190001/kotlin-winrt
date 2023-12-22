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

@ABIMarker(PrintCustomItemDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintCustomItemDetails;{5704b637-5c3a-449a-aa36-b3291b1192fd})")
@WinRTByReference(brClass = PrintCustomItemDetails.ByReference::class)
public class PrintCustomItemDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintCustomItemDetails.WithDefault, IWinRTObject {
  private val __1752146066_Interface: IPrintCustomItemDetails.WithDefault by lazy {
    as_1752146066()
  }


  public override val __1752146066_Ptr: JNAPointer? by lazy {
    __1752146066_Interface.__1752146066_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1752146066_Interface)

  private fun as_1752146066(): IPrintCustomItemDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintCustomItemDetails.ABI.makeIPrintCustomItemDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintCustomItemDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintCustomItemDetails.ABI.makeIPrintCustomItemDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintCustomItemDetails> {
    public override fun getValue() = PrintCustomItemDetails(pointer.getPointer(0))

    public fun setValue(value: PrintCustomItemDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintCustomItemDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintCustomItemDetails {
      val address = segment.toRawLongValue()
      return PrintCustomItemDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintCustomItemDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
