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

@ABIMarker(HolographicFrameRenderingReport.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFrameRenderingReport;{05f32de4-e384-51b3-b934-f0d3a0f78606})")
@WinRTByReference(brClass = HolographicFrameRenderingReport.ByReference::class)
public class HolographicFrameRenderingReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFrameRenderingReport.WithDefault, IWinRTObject {
  private val __195299022_Interface: IHolographicFrameRenderingReport.WithDefault by lazy {
    as_195299022()
  }


  public override val __195299022_Ptr: JNAPointer? by lazy {
    __195299022_Interface.__195299022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__195299022_Interface)

  private fun as_195299022(): IHolographicFrameRenderingReport.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrameRenderingReport.ABI.makeIHolographicFrameRenderingReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrameRenderingReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrameRenderingReport.ABI.makeIHolographicFrameRenderingReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFrameRenderingReport> {
    public override fun getValue() = HolographicFrameRenderingReport(pointer.getPointer(0))

    public fun setValue(value: HolographicFrameRenderingReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFrameRenderingReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFrameRenderingReport {
      val address = segment.toRawLongValue()
      return HolographicFrameRenderingReport(Pointer(address))
    }

    public override fun toNative(obj: HolographicFrameRenderingReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
