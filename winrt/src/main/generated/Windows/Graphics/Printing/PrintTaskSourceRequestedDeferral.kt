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

@ABIMarker(PrintTaskSourceRequestedDeferral.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral;{4a1560d1-6992-4d9d-8555-4ca4563fb166})")
@WinRTByReference(brClass = PrintTaskSourceRequestedDeferral.ByReference::class)
public class PrintTaskSourceRequestedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskSourceRequestedDeferral.WithDefault, IWinRTObject {
  private val __1404012200_Interface: IPrintTaskSourceRequestedDeferral.WithDefault by lazy {
    as_1404012200()
  }


  public override val __1404012200_Ptr: JNAPointer? by lazy {
    __1404012200_Interface.__1404012200_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1404012200_Interface)

  private fun as_1404012200(): IPrintTaskSourceRequestedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskSourceRequestedDeferral.ABI.makeIPrintTaskSourceRequestedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskSourceRequestedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskSourceRequestedDeferral.ABI.makeIPrintTaskSourceRequestedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskSourceRequestedDeferral> {
    public override fun getValue() = PrintTaskSourceRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: PrintTaskSourceRequestedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskSourceRequestedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskSourceRequestedDeferral {
      val address = segment.toRawLongValue()
      return PrintTaskSourceRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskSourceRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
