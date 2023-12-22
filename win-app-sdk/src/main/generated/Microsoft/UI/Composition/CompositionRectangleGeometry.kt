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

@ABIMarker(CompositionRectangleGeometry.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionRectangleGeometry;{bd551fcf-2c7f-5125-ac44-50a4f1d8fa76})")
@WinRTByReference(brClass = CompositionRectangleGeometry.ByReference::class)
public class CompositionRectangleGeometry(
  ptr: JNAPointer? = NULL
) : CompositionGeometry(ptr), ICompositionRectangleGeometry.WithDefault, IWinRTObject {
  private val __95277840_Interface: ICompositionRectangleGeometry.WithDefault by lazy {
    as_95277840()
  }


  public override val __95277840_Ptr: JNAPointer? by lazy {
    __95277840_Interface.__95277840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__95277840_Interface)

  private fun as_95277840(): ICompositionRectangleGeometry.WithDefault {
    if(pointer == NULL) {
      return(ICompositionRectangleGeometry.ABI.makeICompositionRectangleGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionRectangleGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionRectangleGeometry.ABI.makeICompositionRectangleGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionRectangleGeometry> {
    public override fun getValue() = CompositionRectangleGeometry(pointer.getPointer(0))

    public fun setValue(value: CompositionRectangleGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionRectangleGeometry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionRectangleGeometry {
      val address = segment.toRawLongValue()
      return CompositionRectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: CompositionRectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
