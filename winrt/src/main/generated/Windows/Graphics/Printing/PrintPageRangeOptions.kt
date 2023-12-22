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

@ABIMarker(PrintPageRangeOptions.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintPageRangeOptions;{ce6db728-1357-46b2-a923-79f995f448fc})")
@WinRTByReference(brClass = PrintPageRangeOptions.ByReference::class)
public class PrintPageRangeOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintPageRangeOptions.WithDefault, IWinRTObject {
  private val __863647329_Interface: IPrintPageRangeOptions.WithDefault by lazy {
    as_863647329()
  }


  public override val __863647329_Ptr: JNAPointer? by lazy {
    __863647329_Interface.__863647329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__863647329_Interface)

  private fun as_863647329(): IPrintPageRangeOptions.WithDefault {
    if(pointer == NULL) {
      return(IPrintPageRangeOptions.ABI.makeIPrintPageRangeOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintPageRangeOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintPageRangeOptions.ABI.makeIPrintPageRangeOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintPageRangeOptions> {
    public override fun getValue() = PrintPageRangeOptions(pointer.getPointer(0))

    public fun setValue(value: PrintPageRangeOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintPageRangeOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintPageRangeOptions {
      val address = segment.toRawLongValue()
      return PrintPageRangeOptions(Pointer(address))
    }

    public override fun toNative(obj: PrintPageRangeOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
