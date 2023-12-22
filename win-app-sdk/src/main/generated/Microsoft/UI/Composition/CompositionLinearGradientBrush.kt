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

@ABIMarker(CompositionLinearGradientBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionLinearGradientBrush;{f726fb52-270c-58b1-a902-89576772dedc})")
@WinRTByReference(brClass = CompositionLinearGradientBrush.ByReference::class)
public class CompositionLinearGradientBrush(
  ptr: JNAPointer? = NULL
) : CompositionGradientBrush(ptr), ICompositionLinearGradientBrush.WithDefault, IWinRTObject {
  private val __1651334380_Interface: ICompositionLinearGradientBrush.WithDefault by lazy {
    as_1651334380()
  }


  public override val __1651334380_Ptr: JNAPointer? by lazy {
    __1651334380_Interface.__1651334380_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1651334380_Interface)

  private fun as_1651334380(): ICompositionLinearGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionLinearGradientBrush.ABI.makeICompositionLinearGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionLinearGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionLinearGradientBrush.ABI.makeICompositionLinearGradientBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionLinearGradientBrush> {
    public override fun getValue() = CompositionLinearGradientBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionLinearGradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionLinearGradientBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionLinearGradientBrush {
      val address = segment.toRawLongValue()
      return CompositionLinearGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionLinearGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
