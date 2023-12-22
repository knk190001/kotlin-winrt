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

@ABIMarker(PrintNotificationEventDetails.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.PrintNotificationEventDetails;{e00e4c8a-4828-4da1-8bb8-8672df8515e7})")
@WinRTByReference(brClass = PrintNotificationEventDetails.ByReference::class)
public class PrintNotificationEventDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintNotificationEventDetails.WithDefault, IWinRTObject {
  private val __1264411620_Interface: IPrintNotificationEventDetails.WithDefault by lazy {
    as_1264411620()
  }


  public override val __1264411620_Ptr: JNAPointer? by lazy {
    __1264411620_Interface.__1264411620_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1264411620_Interface)

  private fun as_1264411620(): IPrintNotificationEventDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintNotificationEventDetails.ABI.makeIPrintNotificationEventDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintNotificationEventDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintNotificationEventDetails.ABI.makeIPrintNotificationEventDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintNotificationEventDetails> {
    public override fun getValue() = PrintNotificationEventDetails(pointer.getPointer(0))

    public fun setValue(value: PrintNotificationEventDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintNotificationEventDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintNotificationEventDetails {
      val address = segment.toRawLongValue()
      return PrintNotificationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintNotificationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
