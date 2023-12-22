package Windows.Graphics.Printing

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

@ABIMarker(PrintTaskRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskRequestedEventArgs;{d0aff924-a31b-454c-a7b6-5d0cc522fc16})")
@WinRTByReference(brClass = PrintTaskRequestedEventArgs.ByReference::class)
public class PrintTaskRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1485508607_Interface: IPrintTaskRequestedEventArgs.WithDefault by lazy {
    as_1485508607()
  }


  public override val __1485508607_Ptr: JNAPointer? by lazy {
    __1485508607_Interface.__1485508607_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1485508607_Interface)

  private fun as_1485508607(): IPrintTaskRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskRequestedEventArgs.ABI.makeIPrintTaskRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskRequestedEventArgs.ABI.makeIPrintTaskRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskRequestedEventArgs> {
    public override fun getValue() = PrintTaskRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintTaskRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PrintTaskRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
