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

@ABIMarker(HolographicCameraRenderingParameters.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicCameraRenderingParameters;{8eac2ed1-5bf4-4e16-8236-ae0800c11d0d})")
@WinRTByReference(brClass = HolographicCameraRenderingParameters.ByReference::class)
public class HolographicCameraRenderingParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicCameraRenderingParameters.WithDefault,
    IHolographicCameraRenderingParameters2.WithDefault,
    IHolographicCameraRenderingParameters3.WithDefault,
    IHolographicCameraRenderingParameters4.WithDefault, IWinRTObject {
  private val __1672098314_Interface: IHolographicCameraRenderingParameters.WithDefault by lazy {
    as_1672098314()
  }


  private val __295440132_Interface: IHolographicCameraRenderingParameters2.WithDefault by lazy {
    as_295440132()
  }


  private val __295440131_Interface: IHolographicCameraRenderingParameters3.WithDefault by lazy {
    as_295440131()
  }


  private val __295440130_Interface: IHolographicCameraRenderingParameters4.WithDefault by lazy {
    as_295440130()
  }


  public override val __1672098314_Ptr: JNAPointer? by lazy {
    __1672098314_Interface.__1672098314_Ptr
  }


  public override val __295440132_Ptr: JNAPointer? by lazy {
    __295440132_Interface.__295440132_Ptr
  }


  public override val __295440131_Ptr: JNAPointer? by lazy {
    __295440131_Interface.__295440131_Ptr
  }


  public override val __295440130_Ptr: JNAPointer? by lazy {
    __295440130_Interface.__295440130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1672098314_Interface, __295440132_Interface, __295440131_Interface,
        __295440130_Interface)

  private fun as_1672098314(): IHolographicCameraRenderingParameters.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCameraRenderingParameters.ABI.makeIHolographicCameraRenderingParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCameraRenderingParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCameraRenderingParameters.ABI.makeIHolographicCameraRenderingParameters(ref.value))
  }

  private fun as_295440132(): IHolographicCameraRenderingParameters2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCameraRenderingParameters2.ABI.makeIHolographicCameraRenderingParameters2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCameraRenderingParameters2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCameraRenderingParameters2.ABI.makeIHolographicCameraRenderingParameters2(ref.value))
  }

  private fun as_295440131(): IHolographicCameraRenderingParameters3.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCameraRenderingParameters3.ABI.makeIHolographicCameraRenderingParameters3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCameraRenderingParameters3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCameraRenderingParameters3.ABI.makeIHolographicCameraRenderingParameters3(ref.value))
  }

  private fun as_295440130(): IHolographicCameraRenderingParameters4.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCameraRenderingParameters4.ABI.makeIHolographicCameraRenderingParameters4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCameraRenderingParameters4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCameraRenderingParameters4.ABI.makeIHolographicCameraRenderingParameters4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicCameraRenderingParameters> {
    public override fun getValue() = HolographicCameraRenderingParameters(pointer.getPointer(0))

    public fun setValue(value: HolographicCameraRenderingParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicCameraRenderingParameters, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicCameraRenderingParameters {
      val address = segment.toRawLongValue()
      return HolographicCameraRenderingParameters(Pointer(address))
    }

    public override fun toNative(obj: HolographicCameraRenderingParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
