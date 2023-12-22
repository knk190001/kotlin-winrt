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

@ABIMarker(ProcessMemoryUsage.ABI::class)
@Signature("rc(Windows.System.Diagnostics.ProcessMemoryUsage;{f50b229b-827c-42b7-b07c-0e32627e6b3e})")
@WinRTByReference(brClass = ProcessMemoryUsage.ByReference::class)
public class ProcessMemoryUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessMemoryUsage.WithDefault, IWinRTObject {
  private val __865619586_Interface: IProcessMemoryUsage.WithDefault by lazy {
    as_865619586()
  }


  public override val __865619586_Ptr: JNAPointer? by lazy {
    __865619586_Interface.__865619586_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__865619586_Interface)

  private fun as_865619586(): IProcessMemoryUsage.WithDefault {
    if(pointer == NULL) {
      return(IProcessMemoryUsage.ABI.makeIProcessMemoryUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessMemoryUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessMemoryUsage.ABI.makeIProcessMemoryUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessMemoryUsage> {
    public override fun getValue() = ProcessMemoryUsage(pointer.getPointer(0))

    public fun setValue(value: ProcessMemoryUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessMemoryUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessMemoryUsage {
      val address = segment.toRawLongValue()
      return ProcessMemoryUsage(Pointer(address))
    }

    public override fun toNative(obj: ProcessMemoryUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
