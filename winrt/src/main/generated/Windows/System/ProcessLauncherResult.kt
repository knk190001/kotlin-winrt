package Windows.System

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

@ABIMarker(ProcessLauncherResult.ABI::class)
@Signature("rc(Windows.System.ProcessLauncherResult;{544c8934-86d8-4991-8e75-ece8a43b6b6d})")
@WinRTByReference(brClass = ProcessLauncherResult.ByReference::class)
public class ProcessLauncherResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessLauncherResult.WithDefault, IWinRTObject {
  private val __1766730781_Interface: IProcessLauncherResult.WithDefault by lazy {
    as_1766730781()
  }


  public override val __1766730781_Ptr: JNAPointer? by lazy {
    __1766730781_Interface.__1766730781_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1766730781_Interface)

  private fun as_1766730781(): IProcessLauncherResult.WithDefault {
    if(pointer == NULL) {
      return(IProcessLauncherResult.ABI.makeIProcessLauncherResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessLauncherResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessLauncherResult.ABI.makeIProcessLauncherResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessLauncherResult> {
    public override fun getValue() = ProcessLauncherResult(pointer.getPointer(0))

    public fun setValue(value: ProcessLauncherResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessLauncherResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessLauncherResult {
      val address = segment.toRawLongValue()
      return ProcessLauncherResult(Pointer(address))
    }

    public override fun toNative(obj: ProcessLauncherResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
