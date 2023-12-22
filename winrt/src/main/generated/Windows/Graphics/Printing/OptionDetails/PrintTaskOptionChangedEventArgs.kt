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

@ABIMarker(PrintTaskOptionChangedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintTaskOptionChangedEventArgs;{65197d05-a5ee-4307-9407-9acad147679c})")
@WinRTByReference(brClass = PrintTaskOptionChangedEventArgs.ByReference::class)
public class PrintTaskOptionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskOptionChangedEventArgs.WithDefault, IWinRTObject {
  private val __1152987853_Interface: IPrintTaskOptionChangedEventArgs.WithDefault by lazy {
    as_1152987853()
  }


  public override val __1152987853_Ptr: JNAPointer? by lazy {
    __1152987853_Interface.__1152987853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1152987853_Interface)

  private fun as_1152987853(): IPrintTaskOptionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionChangedEventArgs.ABI.makeIPrintTaskOptionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionChangedEventArgs.ABI.makeIPrintTaskOptionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskOptionChangedEventArgs> {
    public override fun getValue() = PrintTaskOptionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintTaskOptionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskOptionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskOptionChangedEventArgs {
      val address = segment.toRawLongValue()
      return PrintTaskOptionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskOptionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
