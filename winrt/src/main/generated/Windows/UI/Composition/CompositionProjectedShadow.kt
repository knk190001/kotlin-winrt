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

@ABIMarker(CompositionProjectedShadow.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionProjectedShadow;{285b8e72-4328-523f-bcf2-5557c52c3b25})")
@WinRTByReference(brClass = CompositionProjectedShadow.ByReference::class)
public class CompositionProjectedShadow(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadow.WithDefault, IWinRTObject {
  private val __467980252_Interface: ICompositionProjectedShadow.WithDefault by lazy {
    as_467980252()
  }


  public override val __467980252_Ptr: JNAPointer? by lazy {
    __467980252_Interface.__467980252_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__467980252_Interface)

  private fun as_467980252(): ICompositionProjectedShadow.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadow.ABI.makeICompositionProjectedShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadow.ABI.makeICompositionProjectedShadow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadow> {
    public override fun getValue() = CompositionProjectedShadow(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionProjectedShadow {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadow(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
