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

@ABIMarker(AppResourceGroupStateReport.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupStateReport;{52849f18-2f70-4236-ab40-d04db0c7b931})")
@WinRTByReference(brClass = AppResourceGroupStateReport.ByReference::class)
public class AppResourceGroupStateReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupStateReport.WithDefault, IWinRTObject {
  private val __1878133818_Interface: IAppResourceGroupStateReport.WithDefault by lazy {
    as_1878133818()
  }


  public override val __1878133818_Ptr: JNAPointer? by lazy {
    __1878133818_Interface.__1878133818_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1878133818_Interface)

  private fun as_1878133818(): IAppResourceGroupStateReport.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupStateReport.ABI.makeIAppResourceGroupStateReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupStateReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupStateReport.ABI.makeIAppResourceGroupStateReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupStateReport> {
    public override fun getValue() = AppResourceGroupStateReport(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupStateReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupStateReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupStateReport {
      val address = segment.toRawLongValue()
      return AppResourceGroupStateReport(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupStateReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
