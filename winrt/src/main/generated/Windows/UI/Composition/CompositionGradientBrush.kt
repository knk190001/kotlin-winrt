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

@ABIMarker(CompositionGradientBrush.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionGradientBrush;{1d9709e0-ffc6-4c0e-a9ab-34144d4c9098})")
@WinRTByReference(brClass = CompositionGradientBrush.ByReference::class)
public open class CompositionGradientBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionGradientBrush.WithDefault,
    ICompositionGradientBrush2.WithDefault, IWinRTObject {
  private val __414553614_Interface: ICompositionGradientBrush.WithDefault by lazy {
    as_414553614()
  }


  private val __33739804_Interface: ICompositionGradientBrush2.WithDefault by lazy {
    as_33739804()
  }


  public override val __414553614_Ptr: JNAPointer? by lazy {
    __414553614_Interface.__414553614_Ptr
  }


  public override val __33739804_Ptr: JNAPointer? by lazy {
    __33739804_Interface.__33739804_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__414553614_Interface, __33739804_Interface)

  private fun as_414553614(): ICompositionGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGradientBrush.ABI.makeICompositionGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGradientBrush.ABI.makeICompositionGradientBrush(ref.value))
  }

  private fun as_33739804(): ICompositionGradientBrush2.WithDefault {
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
