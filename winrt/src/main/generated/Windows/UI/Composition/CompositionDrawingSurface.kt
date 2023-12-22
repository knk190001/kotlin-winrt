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

@ABIMarker(CompositionDrawingSurface.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionDrawingSurface;{a166c300-fad0-4d11-9e67-e433162ff49e})")
@WinRTByReference(brClass = CompositionDrawingSurface.ByReference::class)
public open class CompositionDrawingSurface(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionDrawingSurface.WithDefault,
    ICompositionDrawingSurface2.WithDefault, ICompositionSurface.WithDefault, IWinRTObject {
  private val __1240411915_Interface: ICompositionDrawingSurface.WithDefault by lazy {
    as_1240411915()
  }


  private val __201936249_Interface: ICompositionDrawingSurface2.WithDefault by lazy {
    as_201936249()
  }


  private val __1111408593_Interface: ICompositionSurface.WithDefault by lazy {
    as_1111408593()
  }


  public override val __1240411915_Ptr: JNAPointer? by lazy {
    __1240411915_Interface.__1240411915_Ptr
  }


  public override val __201936249_Ptr: JNAPointer? by lazy {
    __201936249_Interface.__201936249_Ptr
  }


  public override val __1111408593_Ptr: JNAPointer? by lazy {
    __1111408593_Interface.__1111408593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1240411915_Interface, __201936249_Interface, __1111408593_Interface)

  private fun as_1240411915(): ICompositionDrawingSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDrawingSurface.ABI.makeICompositionDrawingSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDrawingSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDrawingSurface.ABI.makeICompositionDrawingSurface(ref.value))
  }

  private fun as_201936249(): ICompositionDrawingSurface2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDrawingSurface2.ABI.makeICompositionDrawingSurface2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDrawingSurface2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDrawingSurface2.ABI.makeICompositionDrawingSurface2(ref.value))
  }

  private fun as_1111408593(): ICompositionSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurface.ABI.makeICompositionSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurface.ABI.makeICompositionSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionDrawingSurface> {
    public override fun getValue() = CompositionDrawingSurface(pointer.getPointer(0))

    public fun setValue(value: CompositionDrawingSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionDrawingSurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionDrawingSurface {
      val address = segment.toRawLongValue()
      return CompositionDrawingSurface(Pointer(address))
    }

    public override fun toNative(obj: CompositionDrawingSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
