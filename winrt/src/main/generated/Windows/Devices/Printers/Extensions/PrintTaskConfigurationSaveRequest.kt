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

@ABIMarker(PrintTaskConfigurationSaveRequest.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest;{eeaf2fcb-621e-4b62-ac77-b281cce08d60})")
@WinRTByReference(brClass = PrintTaskConfigurationSaveRequest.ByReference::class)
public class PrintTaskConfigurationSaveRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskConfigurationSaveRequest.WithDefault, IWinRTObject {
  private val __533549746_Interface: IPrintTaskConfigurationSaveRequest.WithDefault by lazy {
    as_533549746()
  }


  public override val __533549746_Ptr: JNAPointer? by lazy {
    __533549746_Interface.__533549746_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__533549746_Interface)

  private fun as_533549746(): IPrintTaskConfigurationSaveRequest.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskConfigurationSaveRequest.ABI.makeIPrintTaskConfigurationSaveRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskConfigurationSaveRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskConfigurationSaveRequest.ABI.makeIPrintTaskConfigurationSaveRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskConfigurationSaveRequest> {
    public override fun getValue() = PrintTaskConfigurationSaveRequest(pointer.getPointer(0))

    public fun setValue(value: PrintTaskConfigurationSaveRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskConfigurationSaveRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskConfigurationSaveRequest {
      val address = segment.toRawLongValue()
      return PrintTaskConfigurationSaveRequest(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskConfigurationSaveRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
