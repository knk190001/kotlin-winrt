package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(PrintSupportSessionInfo.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintSupport.PrintSupportSessionInfo;{852149af-777d-53e9-9ee9-45d3f4b5be9c})")
@WinRTByReference(brClass = PrintSupportSessionInfo.ByReference::class)
public class PrintSupportSessionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintSupportSessionInfo.WithDefault, IWinRTObject {
  private val __1573915804_Interface: IPrintSupportSessionInfo.WithDefault by lazy {
    as_1573915804()
  }


  public override val __1573915804_Ptr: JNAPointer? by lazy {
    __1573915804_Interface.__1573915804_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1573915804_Interface)

  private fun as_1573915804(): IPrintSupportSessionInfo.WithDefault {
    if(pointer == NULL) {
      return(IPrintSupportSessionInfo.ABI.makeIPrintSupportSessionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintSupportSessionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintSupportSessionInfo.ABI.makeIPrintSupportSessionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintSupportSessionInfo> {
    public override fun getValue() = PrintSupportSessionInfo(pointer.getPointer(0))

    public fun setValue(value: PrintSupportSessionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintSupportSessionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintSupportSessionInfo {
      val address = segment.toRawLongValue()
      return PrintSupportSessionInfo(Pointer(address))
    }

    public override fun toNative(obj: PrintSupportSessionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
