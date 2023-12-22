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

@ABIMarker(PrintTaskCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskCompletedEventArgs;{5bcd34af-24e9-4c10-8d07-14c346ba3fce})")
@WinRTByReference(brClass = PrintTaskCompletedEventArgs.ByReference::class)
public class PrintTaskCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskCompletedEventArgs.WithDefault, IWinRTObject {
  private val __722003518_Interface: IPrintTaskCompletedEventArgs.WithDefault by lazy {
    as_722003518()
  }


  public override val __722003518_Ptr: JNAPointer? by lazy {
    __722003518_Interface.__722003518_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__722003518_Interface)

  private fun as_722003518(): IPrintTaskCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskCompletedEventArgs.ABI.makeIPrintTaskCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskCompletedEventArgs.ABI.makeIPrintTaskCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskCompletedEventArgs> {
    public override fun getValue() = PrintTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintTaskCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return PrintTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
