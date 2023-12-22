package Windows.System.Diagnostics

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

@ABIMarker(DiagnosticActionResult.ABI::class)
@Signature("rc(Windows.System.Diagnostics.DiagnosticActionResult;{c265a296-e73b-4097-b28f-3442f03dd831})")
@WinRTByReference(brClass = DiagnosticActionResult.ByReference::class)
public class DiagnosticActionResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDiagnosticActionResult.WithDefault, IWinRTObject {
  private val __193522165_Interface: IDiagnosticActionResult.WithDefault by lazy {
    as_193522165()
  }


  public override val __193522165_Ptr: JNAPointer? by lazy {
    __193522165_Interface.__193522165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__193522165_Interface)

  private fun as_193522165(): IDiagnosticActionResult.WithDefault {
    if(pointer == NULL) {
      return(IDiagnosticActionResult.ABI.makeIDiagnosticActionResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiagnosticActionResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiagnosticActionResult.ABI.makeIDiagnosticActionResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiagnosticActionResult> {
    public override fun getValue() = DiagnosticActionResult(pointer.getPointer(0))

    public fun setValue(value: DiagnosticActionResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiagnosticActionResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DiagnosticActionResult {
      val address = segment.toRawLongValue()
      return DiagnosticActionResult(Pointer(address))
    }

    public override fun toNative(obj: DiagnosticActionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
