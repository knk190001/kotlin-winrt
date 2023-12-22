package Windows.System.Diagnostics.TraceReporting

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

@ABIMarker(PlatformDiagnosticTraceRuntimeInfo.ABI::class)
@Signature("rc(Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticTraceRuntimeInfo;{3d4d5e2d-01d8-4768-8554-1eb1ca610986})")
@WinRTByReference(brClass = PlatformDiagnosticTraceRuntimeInfo.ByReference::class)
public class PlatformDiagnosticTraceRuntimeInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlatformDiagnosticTraceRuntimeInfo.WithDefault, IWinRTObject {
  private val __793142053_Interface: IPlatformDiagnosticTraceRuntimeInfo.WithDefault by lazy {
    as_793142053()
  }


  public override val __793142053_Ptr: JNAPointer? by lazy {
    __793142053_Interface.__793142053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__793142053_Interface)

  private fun as_793142053(): IPlatformDiagnosticTraceRuntimeInfo.WithDefault {
    if(pointer == NULL) {
      return(IPlatformDiagnosticTraceRuntimeInfo.ABI.makeIPlatformDiagnosticTraceRuntimeInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlatformDiagnosticTraceRuntimeInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlatformDiagnosticTraceRuntimeInfo.ABI.makeIPlatformDiagnosticTraceRuntimeInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlatformDiagnosticTraceRuntimeInfo> {
    public override fun getValue() = PlatformDiagnosticTraceRuntimeInfo(pointer.getPointer(0))

    public fun setValue(value: PlatformDiagnosticTraceRuntimeInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlatformDiagnosticTraceRuntimeInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlatformDiagnosticTraceRuntimeInfo {
      val address = segment.toRawLongValue()
      return PlatformDiagnosticTraceRuntimeInfo(Pointer(address))
    }

    public override fun toNative(obj: PlatformDiagnosticTraceRuntimeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
