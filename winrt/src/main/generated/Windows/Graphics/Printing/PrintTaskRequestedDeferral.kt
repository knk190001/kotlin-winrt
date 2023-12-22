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

@ABIMarker(PrintTaskRequestedDeferral.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskRequestedDeferral;{cfefb3f0-ce3e-42c7-9496-64800c622c44})")
@WinRTByReference(brClass = PrintTaskRequestedDeferral.ByReference::class)
public class PrintTaskRequestedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskRequestedDeferral.WithDefault, IWinRTObject {
  private val __413563645_Interface: IPrintTaskRequestedDeferral.WithDefault by lazy {
    as_413563645()
  }


  public override val __413563645_Ptr: JNAPointer? by lazy {
    __413563645_Interface.__413563645_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__413563645_Interface)

  private fun as_413563645(): IPrintTaskRequestedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskRequestedDeferral.ABI.makeIPrintTaskRequestedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskRequestedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskRequestedDeferral.ABI.makeIPrintTaskRequestedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskRequestedDeferral> {
    public override fun getValue() = PrintTaskRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: PrintTaskRequestedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskRequestedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskRequestedDeferral {
      val address = segment.toRawLongValue()
      return PrintTaskRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
