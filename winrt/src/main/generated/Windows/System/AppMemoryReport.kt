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

@ABIMarker(AppMemoryReport.ABI::class)
@Signature("rc(Windows.System.AppMemoryReport;{6d65339b-4d6f-45bc-9c5e-e49b3ff2758d})")
@WinRTByReference(brClass = AppMemoryReport.ByReference::class)
public class AppMemoryReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppMemoryReport.WithDefault, IAppMemoryReport2.WithDefault, IWinRTObject {
  private val __129518343_Interface: IAppMemoryReport.WithDefault by lazy {
    as_129518343()
  }


  private val __279898613_Interface: IAppMemoryReport2.WithDefault by lazy {
    as_279898613()
  }


  public override val __129518343_Ptr: JNAPointer? by lazy {
    __129518343_Interface.__129518343_Ptr
  }


  public override val __279898613_Ptr: JNAPointer? by lazy {
    __279898613_Interface.__279898613_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__129518343_Interface, __279898613_Interface)

  private fun as_129518343(): IAppMemoryReport.WithDefault {
    if(pointer == NULL) {
      return(IAppMemoryReport.ABI.makeIAppMemoryReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppMemoryReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppMemoryReport.ABI.makeIAppMemoryReport(ref.value))
  }

  private fun as_279898613(): IAppMemoryReport2.WithDefault {
    if(pointer == NULL) {
      return(IAppMemoryReport2.ABI.makeIAppMemoryReport2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppMemoryReport2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppMemoryReport2.ABI.makeIAppMemoryReport2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppMemoryReport> {
    public override fun getValue() = AppMemoryReport(pointer.getPointer(0))

    public fun setValue(value: AppMemoryReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppMemoryReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppMemoryReport {
      val address = segment.toRawLongValue()
      return AppMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: AppMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
