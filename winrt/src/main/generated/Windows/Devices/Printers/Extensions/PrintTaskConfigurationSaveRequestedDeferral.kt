package Windows.Devices.Printers.Extensions

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

@ABIMarker(PrintTaskConfigurationSaveRequestedDeferral.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral;{e959d568-f729-44a4-871d-bd0628696a33})")
@WinRTByReference(brClass = PrintTaskConfigurationSaveRequestedDeferral.ByReference::class)
public class PrintTaskConfigurationSaveRequestedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskConfigurationSaveRequestedDeferral.WithDefault, IWinRTObject {
  private val __1040153252_Interface: IPrintTaskConfigurationSaveRequestedDeferral.WithDefault by
      lazy {
    as_1040153252()
  }


  public override val __1040153252_Ptr: JNAPointer? by lazy {
    __1040153252_Interface.__1040153252_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1040153252_Interface)

  private fun as_1040153252(): IPrintTaskConfigurationSaveRequestedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskConfigurationSaveRequestedDeferral.ABI.makeIPrintTaskConfigurationSaveRequestedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskConfigurationSaveRequestedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskConfigurationSaveRequestedDeferral.ABI.makeIPrintTaskConfigurationSaveRequestedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskConfigurationSaveRequestedDeferral> {
    public override fun getValue() =
        PrintTaskConfigurationSaveRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: PrintTaskConfigurationSaveRequestedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskConfigurationSaveRequestedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PrintTaskConfigurationSaveRequestedDeferral {
      val address = segment.toRawLongValue()
      return PrintTaskConfigurationSaveRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskConfigurationSaveRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
