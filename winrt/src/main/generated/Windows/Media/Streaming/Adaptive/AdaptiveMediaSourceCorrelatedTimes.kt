package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceCorrelatedTimes.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCorrelatedTimes;{05108787-e032-48e1-ab8d-002b0b3051df})")
@WinRTByReference(brClass = AdaptiveMediaSourceCorrelatedTimes.ByReference::class)
public class AdaptiveMediaSourceCorrelatedTimes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceCorrelatedTimes.WithDefault, IWinRTObject {
  private val __1827291446_Interface: IAdaptiveMediaSourceCorrelatedTimes.WithDefault by lazy {
    as_1827291446()
  }


  public override val __1827291446_Ptr: JNAPointer? by lazy {
    __1827291446_Interface.__1827291446_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1827291446_Interface)

  private fun as_1827291446(): IAdaptiveMediaSourceCorrelatedTimes.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceCorrelatedTimes.ABI.makeIAdaptiveMediaSourceCorrelatedTimes(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceCorrelatedTimes>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceCorrelatedTimes.ABI.makeIAdaptiveMediaSourceCorrelatedTimes(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceCorrelatedTimes> {
    public override fun getValue() = AdaptiveMediaSourceCorrelatedTimes(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceCorrelatedTimes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceCorrelatedTimes, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSourceCorrelatedTimes {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceCorrelatedTimes(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceCorrelatedTimes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
