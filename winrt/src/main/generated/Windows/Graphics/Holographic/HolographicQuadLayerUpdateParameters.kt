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

@ABIMarker(HolographicQuadLayerUpdateParameters.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicQuadLayerUpdateParameters;{2b0ea3b0-798d-5bca-55c2-2c0c762ebb08})")
@WinRTByReference(brClass = HolographicQuadLayerUpdateParameters.ByReference::class)
public class HolographicQuadLayerUpdateParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicQuadLayerUpdateParameters.WithDefault,
    IHolographicQuadLayerUpdateParameters2.WithDefault, IWinRTObject {
  private val __439418818_Interface: IHolographicQuadLayerUpdateParameters.WithDefault by lazy {
    as_439418818()
  }


  private val __737081520_Interface: IHolographicQuadLayerUpdateParameters2.WithDefault by lazy {
    as_737081520()
  }


  public override val __439418818_Ptr: JNAPointer? by lazy {
    __439418818_Interface.__439418818_Ptr
  }


  public override val __737081520_Ptr: JNAPointer? by lazy {
    __737081520_Interface.__737081520_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__439418818_Interface, __737081520_Interface)

  private fun as_439418818(): IHolographicQuadLayerUpdateParameters.WithDefault {
    if(pointer == NULL) {
      return(IHolographicQuadLayerUpdateParameters.ABI.makeIHolographicQuadLayerUpdateParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicQuadLayerUpdateParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicQuadLayerUpdateParameters.ABI.makeIHolographicQuadLayerUpdateParameters(ref.value))
  }

  private fun as_737081520(): IHolographicQuadLayerUpdateParameters2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicQuadLayerUpdateParameters2.ABI.makeIHolographicQuadLayerUpdateParameters2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicQuadLayerUpdateParameters2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicQuadLayerUpdateParameters2.ABI.makeIHolographicQuadLayerUpdateParameters2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicQuadLayerUpdateParameters> {
    public override fun getValue() = HolographicQuadLayerUpdateParameters(pointer.getPointer(0))

    public fun setValue(value: HolographicQuadLayerUpdateParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicQuadLayerUpdateParameters, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicQuadLayerUpdateParameters {
      val address = segment.toRawLongValue()
      return HolographicQuadLayerUpdateParameters(Pointer(address))
    }

    public override fun toNative(obj: HolographicQuadLayerUpdateParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
