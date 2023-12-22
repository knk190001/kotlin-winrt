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

@ABIMarker(CompositionSurfaceBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionSurfaceBrush;{616bb5a5-0a33-512d-b4b1-3d3734f04aca})")
@WinRTByReference(brClass = CompositionSurfaceBrush.ByReference::class)
public class CompositionSurfaceBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionSurfaceBrush.WithDefault,
    ICompositionSurfaceBrush2.WithDefault, ICompositionSurfaceBrush3.WithDefault, IWinRTObject {
  private val __1356334818_Interface: ICompositionSurfaceBrush.WithDefault by lazy {
    as_1356334818()
  }


  private val __903293652_Interface: ICompositionSurfaceBrush2.WithDefault by lazy {
    as_903293652()
  }


  private val __903293653_Interface: ICompositionSurfaceBrush3.WithDefault by lazy {
    as_903293653()
  }


  public override val __1356334818_Ptr: JNAPointer? by lazy {
    __1356334818_Interface.__1356334818_Ptr
  }


  public override val __903293652_Ptr: JNAPointer? by lazy {
    __903293652_Interface.__903293652_Ptr
  }


  public override val __903293653_Ptr: JNAPointer? by lazy {
    __903293653_Interface.__903293653_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1356334818_Interface, __903293652_Interface, __903293653_Interface)

  private fun as_1356334818(): ICompositionSurfaceBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurfaceBrush.ABI.makeICompositionSurfaceBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurfaceBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurfaceBrush.ABI.makeICompositionSurfaceBrush(ref.value))
  }

  private fun as_903293652(): ICompositionSurfaceBrush2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurfaceBrush2.ABI.makeICompositionSurfaceBrush2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurfaceBrush2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurfaceBrush2.ABI.makeICompositionSurfaceBrush2(ref.value))
  }

  private fun as_903293653(): ICompositionSurfaceBrush3.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurfaceBrush3.ABI.makeICompositionSurfaceBrush3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurfaceBrush3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurfaceBrush3.ABI.makeICompositionSurfaceBrush3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionSurfaceBrush> {
    public override fun getValue() = CompositionSurfaceBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionSurfaceBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionSurfaceBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionSurfaceBrush {
      val address = segment.toRawLongValue()
      return CompositionSurfaceBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionSurfaceBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
