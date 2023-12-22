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

@ABIMarker(Print3DWorkflowPrinterChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.Print3DWorkflowPrinterChangedEventArgs;{45226402-95fc-4847-93b3-134dbf5c60f7})")
@WinRTByReference(brClass = Print3DWorkflowPrinterChangedEventArgs.ByReference::class)
public class Print3DWorkflowPrinterChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DWorkflowPrinterChangedEventArgs.WithDefault, IWinRTObject {
  private val __530874684_Interface: IPrint3DWorkflowPrinterChangedEventArgs.WithDefault by lazy {
    as_530874684()
  }


  public override val __530874684_Ptr: JNAPointer? by lazy {
    __530874684_Interface.__530874684_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__530874684_Interface)

  private fun as_530874684(): IPrint3DWorkflowPrinterChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DWorkflowPrinterChangedEventArgs.ABI.makeIPrint3DWorkflowPrinterChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DWorkflowPrinterChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DWorkflowPrinterChangedEventArgs.ABI.makeIPrint3DWorkflowPrinterChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DWorkflowPrinterChangedEventArgs> {
    public override fun getValue() = Print3DWorkflowPrinterChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: Print3DWorkflowPrinterChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DWorkflowPrinterChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DWorkflowPrinterChangedEventArgs {
      val address = segment.toRawLongValue()
      return Print3DWorkflowPrinterChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: Print3DWorkflowPrinterChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
