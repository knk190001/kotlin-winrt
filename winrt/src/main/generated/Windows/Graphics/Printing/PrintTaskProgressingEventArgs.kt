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

@ABIMarker(PrintTaskProgressingEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskProgressingEventArgs;{810cd3cb-b410-4282-a073-5ac378234174})")
@WinRTByReference(brClass = PrintTaskProgressingEventArgs.ByReference::class)
public class PrintTaskProgressingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskProgressingEventArgs.WithDefault, IWinRTObject {
  private val __1582285624_Interface: IPrintTaskProgressingEventArgs.WithDefault by lazy {
    as_1582285624()
  }


  public override val __1582285624_Ptr: JNAPointer? by lazy {
    __1582285624_Interface.__1582285624_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1582285624_Interface)

  private fun as_1582285624(): IPrintTaskProgressingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskProgressingEventArgs.ABI.makeIPrintTaskProgressingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskProgressingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskProgressingEventArgs.ABI.makeIPrintTaskProgressingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskProgressingEventArgs> {
    public override fun getValue() = PrintTaskProgressingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintTaskProgressingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskProgressingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskProgressingEventArgs {
      val address = segment.toRawLongValue()
      return PrintTaskProgressingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskProgressingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
