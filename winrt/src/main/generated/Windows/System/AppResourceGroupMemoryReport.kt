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

@ABIMarker(AppResourceGroupMemoryReport.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupMemoryReport;{2c8c06b1-7db1-4c51-a225-7fae2d49e431})")
@WinRTByReference(brClass = AppResourceGroupMemoryReport.ByReference::class)
public class AppResourceGroupMemoryReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupMemoryReport.WithDefault, IWinRTObject {
  private val __1287057172_Interface: IAppResourceGroupMemoryReport.WithDefault by lazy {
    as_1287057172()
  }


  public override val __1287057172_Ptr: JNAPointer? by lazy {
    __1287057172_Interface.__1287057172_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1287057172_Interface)

  private fun as_1287057172(): IAppResourceGroupMemoryReport.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupMemoryReport.ABI.makeIAppResourceGroupMemoryReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupMemoryReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupMemoryReport.ABI.makeIAppResourceGroupMemoryReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupMemoryReport> {
    public override fun getValue() = AppResourceGroupMemoryReport(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupMemoryReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupMemoryReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupMemoryReport {
      val address = segment.toRawLongValue()
      return AppResourceGroupMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
