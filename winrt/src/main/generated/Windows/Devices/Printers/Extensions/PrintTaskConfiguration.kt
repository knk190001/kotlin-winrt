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

@ABIMarker(PrintTaskConfiguration.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.PrintTaskConfiguration;{e3c22451-3aa4-4885-9240-311f5f8fbe9d})")
@WinRTByReference(brClass = PrintTaskConfiguration.ByReference::class)
public class PrintTaskConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskConfiguration.WithDefault, IWinRTObject {
  private val __728774528_Interface: IPrintTaskConfiguration.WithDefault by lazy {
    as_728774528()
  }


  public override val __728774528_Ptr: JNAPointer? by lazy {
    __728774528_Interface.__728774528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__728774528_Interface)

  private fun as_728774528(): IPrintTaskConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskConfiguration.ABI.makeIPrintTaskConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskConfiguration.ABI.makeIPrintTaskConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskConfiguration> {
    public override fun getValue() = PrintTaskConfiguration(pointer.getPointer(0))

    public fun setValue(value: PrintTaskConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskConfiguration {
      val address = segment.toRawLongValue()
      return PrintTaskConfiguration(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
