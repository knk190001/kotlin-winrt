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

@ABIMarker(ProcessCpuUsage.ABI::class)
@Signature("rc(Windows.System.Diagnostics.ProcessCpuUsage;{0bbb2472-c8bf-423a-a810-b559ae4354e2})")
@WinRTByReference(brClass = ProcessCpuUsage.ByReference::class)
public class ProcessCpuUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessCpuUsage.WithDefault, IWinRTObject {
  private val __1094247753_Interface: IProcessCpuUsage.WithDefault by lazy {
    as_1094247753()
  }


  public override val __1094247753_Ptr: JNAPointer? by lazy {
    __1094247753_Interface.__1094247753_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1094247753_Interface)

  private fun as_1094247753(): IProcessCpuUsage.WithDefault {
    if(pointer == NULL) {
      return(IProcessCpuUsage.ABI.makeIProcessCpuUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessCpuUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessCpuUsage.ABI.makeIProcessCpuUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessCpuUsage> {
    public override fun getValue() = ProcessCpuUsage(pointer.getPointer(0))

    public fun setValue(value: ProcessCpuUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessCpuUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessCpuUsage {
      val address = segment.toRawLongValue()
      return ProcessCpuUsage(Pointer(address))
    }

    public override fun toNative(obj: ProcessCpuUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
