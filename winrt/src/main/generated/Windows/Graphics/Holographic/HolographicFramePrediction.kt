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

@ABIMarker(HolographicFramePrediction.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFramePrediction;{520f4de1-5c0a-4e79-a81e-6abe02bb2739})")
@WinRTByReference(brClass = HolographicFramePrediction.ByReference::class)
public class HolographicFramePrediction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFramePrediction.WithDefault, IWinRTObject {
  private val __663530527_Interface: IHolographicFramePrediction.WithDefault by lazy {
    as_663530527()
  }


  public override val __663530527_Ptr: JNAPointer? by lazy {
    __663530527_Interface.__663530527_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__663530527_Interface)

  private fun as_663530527(): IHolographicFramePrediction.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFramePrediction.ABI.makeIHolographicFramePrediction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFramePrediction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFramePrediction.ABI.makeIHolographicFramePrediction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFramePrediction> {
    public override fun getValue() = HolographicFramePrediction(pointer.getPointer(0))

    public fun setValue(value: HolographicFramePrediction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFramePrediction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFramePrediction {
      val address = segment.toRawLongValue()
      return HolographicFramePrediction(Pointer(address))
    }

    public override fun toNative(obj: HolographicFramePrediction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
