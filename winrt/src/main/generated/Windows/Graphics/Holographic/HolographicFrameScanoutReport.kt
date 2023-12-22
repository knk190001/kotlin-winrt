package Windows.Graphics.Holographic

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

@ABIMarker(HolographicFrameScanoutReport.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFrameScanoutReport;{0ebbe606-03a0-5ca0-b46e-bba068d7233f})")
@WinRTByReference(brClass = HolographicFrameScanoutReport.ByReference::class)
public class HolographicFrameScanoutReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFrameScanoutReport.WithDefault, IWinRTObject {
  private val __1008726093_Interface: IHolographicFrameScanoutReport.WithDefault by lazy {
    as_1008726093()
  }


  public override val __1008726093_Ptr: JNAPointer? by lazy {
    __1008726093_Interface.__1008726093_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1008726093_Interface)

  private fun as_1008726093(): IHolographicFrameScanoutReport.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrameScanoutReport.ABI.makeIHolographicFrameScanoutReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrameScanoutReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrameScanoutReport.ABI.makeIHolographicFrameScanoutReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFrameScanoutReport> {
    public override fun getValue() = HolographicFrameScanoutReport(pointer.getPointer(0))

    public fun setValue(value: HolographicFrameScanoutReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFrameScanoutReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFrameScanoutReport {
      val address = segment.toRawLongValue()
      return HolographicFrameScanoutReport(Pointer(address))
    }

    public override fun toNative(obj: HolographicFrameScanoutReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
