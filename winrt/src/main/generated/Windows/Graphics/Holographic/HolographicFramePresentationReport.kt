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

@ABIMarker(HolographicFramePresentationReport.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFramePresentationReport;{80baf614-f2f4-4c8a-8de3-065c78f6d5de})")
@WinRTByReference(brClass = HolographicFramePresentationReport.ByReference::class)
public class HolographicFramePresentationReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFramePresentationReport.WithDefault, IWinRTObject {
  private val __1043341760_Interface: IHolographicFramePresentationReport.WithDefault by lazy {
    as_1043341760()
  }


  public override val __1043341760_Ptr: JNAPointer? by lazy {
    __1043341760_Interface.__1043341760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1043341760_Interface)

  private fun as_1043341760(): IHolographicFramePresentationReport.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFramePresentationReport.ABI.makeIHolographicFramePresentationReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFramePresentationReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFramePresentationReport.ABI.makeIHolographicFramePresentationReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFramePresentationReport> {
    public override fun getValue() = HolographicFramePresentationReport(pointer.getPointer(0))

    public fun setValue(value: HolographicFramePresentationReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFramePresentationReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFramePresentationReport {
      val address = segment.toRawLongValue()
      return HolographicFramePresentationReport(Pointer(address))
    }

    public override fun toNative(obj: HolographicFramePresentationReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
