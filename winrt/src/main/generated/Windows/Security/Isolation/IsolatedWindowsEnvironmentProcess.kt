package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentProcess.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentProcess;{a858c3ef-8172-4f10-af93-cbe60af88d09})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentProcess.ByReference::class)
public class IsolatedWindowsEnvironmentProcess(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentProcess.WithDefault, IWinRTObject {
  private val __104570200_Interface: IIsolatedWindowsEnvironmentProcess.WithDefault by lazy {
    as_104570200()
  }


  public override val __104570200_Ptr: JNAPointer? by lazy {
    __104570200_Interface.__104570200_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__104570200_Interface)

  private fun as_104570200(): IIsolatedWindowsEnvironmentProcess.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentProcess.ABI.makeIIsolatedWindowsEnvironmentProcess(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentProcess>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentProcess.ABI.makeIIsolatedWindowsEnvironmentProcess(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentProcess> {
    public override fun getValue() = IsolatedWindowsEnvironmentProcess(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentProcess): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentProcess, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentProcess {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentProcess(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentProcess): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
