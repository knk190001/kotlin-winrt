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

@ABIMarker(CompositionEffectFactory.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionEffectFactory;{c50f407a-0231-5ed2-b7a7-ca66d3e14b3b})")
@WinRTByReference(brClass = CompositionEffectFactory.ByReference::class)
public class CompositionEffectFactory(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionEffectFactory.WithDefault, IWinRTObject {
  private val __1561308728_Interface: ICompositionEffectFactory.WithDefault by lazy {
    as_1561308728()
  }


  public override val __1561308728_Ptr: JNAPointer? by lazy {
    __1561308728_Interface.__1561308728_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1561308728_Interface)

  private fun as_1561308728(): ICompositionEffectFactory.WithDefault {
    if(pointer == NULL) {
      return(ICompositionEffectFactory.ABI.makeICompositionEffectFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionEffectFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionEffectFactory.ABI.makeICompositionEffectFactory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionEffectFactory> {
    public override fun getValue() = CompositionEffectFactory(pointer.getPointer(0))

    public fun setValue(value: CompositionEffectFactory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionEffectFactory, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionEffectFactory {
      val address = segment.toRawLongValue()
      return CompositionEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: CompositionEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
