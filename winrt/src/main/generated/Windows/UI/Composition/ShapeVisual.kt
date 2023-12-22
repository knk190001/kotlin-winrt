package Windows.UI.Composition

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

@ABIMarker(ShapeVisual.ABI::class)
@Signature("rc(Windows.UI.Composition.ShapeVisual;{f2bd13c3-ba7e-4b0f-9126-ffb7536b8176})")
@WinRTByReference(brClass = ShapeVisual.ByReference::class)
public class ShapeVisual(
  ptr: JNAPointer? = NULL
) : ContainerVisual(ptr), IShapeVisual.WithDefault, IWinRTObject {
  private val __254614061_Interface: IShapeVisual.WithDefault by lazy {
    as_254614061()
  }


  public override val __254614061_Ptr: JNAPointer? by lazy {
    __254614061_Interface.__254614061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__254614061_Interface)

  private fun as_254614061(): IShapeVisual.WithDefault {
    if(pointer == NULL) {
      return(IShapeVisual.ABI.makeIShapeVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShapeVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShapeVisual.ABI.makeIShapeVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ShapeVisual> {
    public override fun getValue() = ShapeVisual(pointer.getPointer(0))

    public fun setValue(value: ShapeVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShapeVisual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShapeVisual {
      val address = segment.toRawLongValue()
      return ShapeVisual(Pointer(address))
    }

    public override fun toNative(obj: ShapeVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
