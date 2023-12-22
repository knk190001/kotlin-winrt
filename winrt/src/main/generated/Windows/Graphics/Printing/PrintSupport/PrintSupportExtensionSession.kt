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

@ABIMarker(PrintSupportExtensionSession.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintSupport.PrintSupportExtensionSession;{eea45f1a-f4c6-54b3-a0b8-a559839aa4c3})")
@WinRTByReference(brClass = PrintSupportExtensionSession.ByReference::class)
public class PrintSupportExtensionSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintSupportExtensionSession.WithDefault, IWinRTObject {
  private val __867532831_Interface: IPrintSupportExtensionSession.WithDefault by lazy {
    as_867532831()
  }


  public override val __867532831_Ptr: JNAPointer? by lazy {
    __867532831_Interface.__867532831_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__867532831_Interface)

  private fun as_867532831(): IPrintSupportExtensionSession.WithDefault {
    if(pointer == NULL) {
      return(IPrintSupportExtensionSession.ABI.makeIPrintSupportExtensionSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintSupportExtensionSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintSupportExtensionSession.ABI.makeIPrintSupportExtensionSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintSupportExtensionSession> {
    public override fun getValue() = PrintSupportExtensionSession(pointer.getPointer(0))

    public fun setValue(value: PrintSupportExtensionSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintSupportExtensionSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintSupportExtensionSession {
      val address = segment.toRawLongValue()
      return PrintSupportExtensionSession(Pointer(address))
    }

    public override fun toNative(obj: PrintSupportExtensionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
