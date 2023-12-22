package Windows.System.Diagnostics

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProcessDiagnosticInfo.ABI::class)
@Signature("rc(Windows.System.Diagnostics.ProcessDiagnosticInfo;{e830b04b-300e-4ee6-a0ab-5b5f5231b434})")
@WinRTByReference(brClass = ProcessDiagnosticInfo.ByReference::class)
public class ProcessDiagnosticInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessDiagnosticInfo.WithDefault, IProcessDiagnosticInfo2.WithDefault,
    IWinRTObject {
  private val __1044811693_Interface: IProcessDiagnosticInfo.WithDefault by lazy {
    as_1044811693()
  }


  private val __1970575935_Interface: IProcessDiagnosticInfo2.WithDefault by lazy {
    as_1970575935()
  }


  public override val __1044811693_Ptr: JNAPointer? by lazy {
    __1044811693_Interface.__1044811693_Ptr
  }


  public override val __1970575935_Ptr: JNAPointer? by lazy {
    __1970575935_Interface.__1970575935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1044811693_Interface, __1970575935_Interface)

  private fun as_1044811693(): IProcessDiagnosticInfo.WithDefault {
    if(pointer == NULL) {
      return(IProcessDiagnosticInfo.ABI.makeIProcessDiagnosticInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessDiagnosticInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessDiagnosticInfo.ABI.makeIProcessDiagnosticInfo(ref.value))
  }

  private fun as_1970575935(): IProcessDiagnosticInfo2.WithDefault {
    if(pointer == NULL) {
      return(IProcessDiagnosticInfo2.ABI.makeIProcessDiagnosticInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessDiagnosticInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessDiagnosticInfo2.ABI.makeIProcessDiagnosticInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessDiagnosticInfo> {
    public override fun getValue() = ProcessDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: ProcessDiagnosticInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessDiagnosticInfo, MemoryAddress> {
    public val IProcessDiagnosticInfoStatics_Instance: IProcessDiagnosticInfoStatics by lazy {
      createIProcessDiagnosticInfoStatics()
    }


    public val IProcessDiagnosticInfoStatics2_Instance: IProcessDiagnosticInfoStatics2 by lazy {
      createIProcessDiagnosticInfoStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProcessDiagnosticInfoStatics(): IProcessDiagnosticInfoStatics {
      val refiid = Guid.REFIID(IProcessDiagnosticInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.ProcessDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result =
          IProcessDiagnosticInfoStatics.ABI.makeIProcessDiagnosticInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIProcessDiagnosticInfoStatics2(): IProcessDiagnosticInfoStatics2 {
      val refiid = Guid.REFIID(IProcessDiagnosticInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.ProcessDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result =
          IProcessDiagnosticInfoStatics2.ABI.makeIProcessDiagnosticInfoStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProcessDiagnosticInfo {
      val address = segment.toRawLongValue()
      return ProcessDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: ProcessDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForProcesses() = ABI.IProcessDiagnosticInfoStatics_Instance.GetForProcesses()

    public fun GetForCurrentProcess() =
        ABI.IProcessDiagnosticInfoStatics_Instance.GetForCurrentProcess()

    public fun TryGetForProcessId(processId: WinDef.UINT) =
        ABI.IProcessDiagnosticInfoStatics2_Instance.TryGetForProcessId(processId)
  }
}
