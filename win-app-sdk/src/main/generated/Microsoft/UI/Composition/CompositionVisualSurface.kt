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

@ABIMarker(CompositionVisualSurface.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionVisualSurface;{49e3624b-4d2e-53e7-9e02-f64831681134})")
@WinRTByReference(brClass = CompositionVisualSurface.ByReference::class)
public class CompositionVisualSurface(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionVisualSurface.WithDefault, ICompositionSurface.WithDefault,
    IWinRTObject {
  private val __805745444_Interface: ICompositionVisualSurface.WithDefault by lazy {
    as_805745444()
  }


  private val __310213500_Interface: ICompositionSurface.WithDefault by lazy {
    as_310213500()
  }


  public override val __805745444_Ptr: JNAPointer? by lazy {
    __805745444_Interface.__805745444_Ptr
  }


  public override val __310213500_Ptr: JNAPointer? by lazy {
    __310213500_Interface.__310213500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__805745444_Interface, __310213500_Interface)

  private fun as_805745444(): ICompositionVisualSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionVisualSurface.ABI.makeICompositionVisualSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionVisualSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionVisualSurface.ABI.makeICompositionVisualSurface(ref.value))
  }

  private fun as_310213500(): ICompositionSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurface.ABI.makeICompositionSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurface.ABI.makeICompositionSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionVisualSurface> {
    public override fun getValue() = CompositionVisualSurface(pointer.getPointer(0))

    public fun setValue(value: CompositionVisualSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionVisualSurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionVisualSurface {
      val address = segment.toRawLongValue()
      return CompositionVisualSurface(Pointer(address))
    }

    public override fun toNative(obj: CompositionVisualSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
