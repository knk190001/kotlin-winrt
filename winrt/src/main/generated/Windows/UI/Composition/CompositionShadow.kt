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

@ABIMarker(CompositionShadow.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionShadow;{329e52e2-4335-49cc-b14a-37782d10f0c4})")
@WinRTByReference(brClass = CompositionShadow.ByReference::class)
public open class CompositionShadow(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionShadow.WithDefault, IWinRTObject {
  private val __1270264188_Interface: ICompositionShadow.WithDefault by lazy {
    as_1270264188()
  }


  public override val __1270264188_Ptr: JNAPointer? by lazy {
    __1270264188_Interface.__1270264188_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1270264188_Interface)

  private fun as_1270264188(): ICompositionShadow.WithDefault {
    if(pointer == NULL) {
      return(ICompositionShadow.ABI.makeICompositionShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionShadow.ABI.makeICompositionShadow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionShadow> {
    public override fun getValue() = CompositionShadow(pointer.getPointer(0))

    public fun setValue(value: CompositionShadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionShadow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionShadow {
      val address = segment.toRawLongValue()
      return CompositionShadow(Pointer(address))
    }

    public override fun toNative(obj: CompositionShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
