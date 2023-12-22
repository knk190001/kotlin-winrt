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

@ABIMarker(CompositionGradientBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionGradientBrush;{9165d1fb-c738-5f44-addc-309ee071d588})")
@WinRTByReference(brClass = CompositionGradientBrush.ByReference::class)
public open class CompositionGradientBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionGradientBrush.WithDefault,
    ICompositionGradientBrush2.WithDefault, IWinRTObject {
  private val __981097095_Interface: ICompositionGradientBrush.WithDefault by lazy {
    as_981097095()
  }


  private val __349238823_Interface: ICompositionGradientBrush2.WithDefault by lazy {
    as_349238823()
  }


  public override val __981097095_Ptr: JNAPointer? by lazy {
    __981097095_Interface.__981097095_Ptr
  }


  public override val __349238823_Ptr: JNAPointer? by lazy {
    __349238823_Interface.__349238823_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__981097095_Interface, __349238823_Interface)

  private fun as_981097095(): ICompositionGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGradientBrush.ABI.makeICompositionGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGradientBrush.ABI.makeICompositionGradientBrush(ref.value))
  }

  private fun as_349238823(): ICompositionGradientBrush2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGradientBrush2.ABI.makeICompositionGradientBrush2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGradientBrush2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGradientBrush2.ABI.makeICompositionGradientBrush2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionGradientBrush> {
    public override fun getValue() = CompositionGradientBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionGradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionGradientBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionGradientBrush {
      val address = segment.toRawLongValue()
      return CompositionGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
