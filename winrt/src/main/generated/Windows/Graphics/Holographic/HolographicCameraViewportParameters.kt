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

@ABIMarker(HolographicCameraViewportParameters.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicCameraViewportParameters;{80cdf3f7-842a-41e1-93ed-5692ab1fbb10})")
@WinRTByReference(brClass = HolographicCameraViewportParameters.ByReference::class)
public class HolographicCameraViewportParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicCameraViewportParameters.WithDefault, IWinRTObject {
  private val __388360912_Interface: IHolographicCameraViewportParameters.WithDefault by lazy {
    as_388360912()
  }


  public override val __388360912_Ptr: JNAPointer? by lazy {
    __388360912_Interface.__388360912_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__388360912_Interface)

  private fun as_388360912(): IHolographicCameraViewportParameters.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCameraViewportParameters.ABI.makeIHolographicCameraViewportParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCameraViewportParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCameraViewportParameters.ABI.makeIHolographicCameraViewportParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicCameraViewportParameters> {
    public override fun getValue() = HolographicCameraViewportParameters(pointer.getPointer(0))

    public fun setValue(value: HolographicCameraViewportParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicCameraViewportParameters, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicCameraViewportParameters {
      val address = segment.toRawLongValue()
      return HolographicCameraViewportParameters(Pointer(address))
    }

    public override fun toNative(obj: HolographicCameraViewportParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
