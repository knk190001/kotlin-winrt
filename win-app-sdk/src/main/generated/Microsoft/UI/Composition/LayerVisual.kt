package Microsoft.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LayerVisual.ABI::class)
@Signature("rc(Microsoft.UI.Composition.LayerVisual;{64d05ca1-3bf6-5d4f-98a1-7500f2f23ebe})")
@WinRTByReference(brClass = LayerVisual.ByReference::class)
public class LayerVisual(
  ptr: JNAPointer? = NULL
) : ContainerVisual(ptr), ILayerVisual.WithDefault, ILayerVisual2.WithDefault, IWinRTObject {
  private val __1269651912_Interface: ILayerVisual.WithDefault by lazy {
    as_1269651912()
  }


  private val __704503558_Interface: ILayerVisual2.WithDefault by lazy {
    as_704503558()
  }


  public override val __1269651912_Ptr: JNAPointer? by lazy {
    __1269651912_Interface.__1269651912_Ptr
  }


  public override val __704503558_Ptr: JNAPointer? by lazy {
    __704503558_Interface.__704503558_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1269651912_Interface, __704503558_Interface)

  private fun as_1269651912(): ILayerVisual.WithDefault {
    if(pointer == NULL) {
      return(ILayerVisual.ABI.makeILayerVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayerVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayerVisual.ABI.makeILayerVisual(ref.value))
  }

  private fun as_704503558(): ILayerVisual2.WithDefault {
    if(pointer == NULL) {
      return(ILayerVisual2.ABI.makeILayerVisual2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayerVisual2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayerVisual2.ABI.makeILayerVisual2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LayerVisual> {
    public override fun getValue() = LayerVisual(pointer.getPointer(0))

    public fun setValue(value: LayerVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LayerVisual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LayerVisual {
      val address = segment.toRawLongValue()
      return LayerVisual(Pointer(address))
    }

    public override fun toNative(obj: LayerVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
