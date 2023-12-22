package Windows.System.Diagnostics

import Windows.System.ProcessorArchitecture
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemDiagnosticInfo.ABI::class)
@Signature("rc(Windows.System.Diagnostics.SystemDiagnosticInfo;{a290fe05-dff3-407f-9a1b-0b2b317ca800})")
@WinRTByReference(brClass = SystemDiagnosticInfo.ByReference::class)
public class SystemDiagnosticInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemDiagnosticInfo.WithDefault, IWinRTObject {
  private val __1867300843_Interface: ISystemDiagnosticInfo.WithDefault by lazy {
    as_1867300843()
  }


  public override val __1867300843_Ptr: JNAPointer? by lazy {
    __1867300843_Interface.__1867300843_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1867300843_Interface)

  private fun as_1867300843(): ISystemDiagnosticInfo.WithDefault {
    if(pointer == NULL) {
      return(ISystemDiagnosticInfo.ABI.makeISystemDiagnosticInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemDiagnosticInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemDiagnosticInfo.ABI.makeISystemDiagnosticInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemDiagnosticInfo> {
    public override fun getValue() = SystemDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: SystemDiagnosticInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemDiagnosticInfo, MemoryAddress> {
    public val ISystemDiagnosticInfoStatics2_Instance: ISystemDiagnosticInfoStatics2 by lazy {
      createISystemDiagnosticInfoStatics2()
    }


    public val ISystemDiagnosticInfoStatics_Instance: ISystemDiagnosticInfoStatics by lazy {
      createISystemDiagnosticInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemDiagnosticInfoStatics2(): ISystemDiagnosticInfoStatics2 {
      val refiid = Guid.REFIID(ISystemDiagnosticInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.SystemDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result =
          ISystemDiagnosticInfoStatics2.ABI.makeISystemDiagnosticInfoStatics2(interfacePtr.value)
      return result
    }

    public fun createISystemDiagnosticInfoStatics(): ISystemDiagnosticInfoStatics {
      val refiid = Guid.REFIID(ISystemDiagnosticInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.SystemDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result =
          ISystemDiagnosticInfoStatics.ABI.makeISystemDiagnosticInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemDiagnosticInfo {
      val address = segment.toRawLongValue()
      return SystemDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsArchitectureSupported(type: ProcessorArchitecture) =
        ABI.ISystemDiagnosticInfoStatics2_Instance.IsArchitectureSupported(type)

    public fun get_PreferredArchitecture() =
        ABI.ISystemDiagnosticInfoStatics2_Instance.get_PreferredArchitecture()

    public fun GetForCurrentSystem() =
        ABI.ISystemDiagnosticInfoStatics_Instance.GetForCurrentSystem()
  }
}
