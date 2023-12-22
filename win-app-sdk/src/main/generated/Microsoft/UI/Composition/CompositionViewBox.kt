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

@ABIMarker(CompositionViewBox.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionViewBox;{667e4071-addd-5ded-b6c0-09e03a14be7e})")
@WinRTByReference(brClass = CompositionViewBox.ByReference::class)
public class CompositionViewBox(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionViewBox.WithDefault, IWinRTObject {
  private val __1677321291_Interface: ICompositionViewBox.WithDefault by lazy {
    as_1677321291()
  }


  public override val __1677321291_Ptr: JNAPointer? by lazy {
    __1677321291_Interface.__1677321291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1677321291_Interface)

  private fun as_1677321291(): ICompositionViewBox.WithDefault {
    if(pointer == NULL) {
      return(ICompositionViewBox.ABI.makeICompositionViewBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionViewBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionViewBox.ABI.makeICompositionViewBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionViewBox> {
    public override fun getValue() = CompositionViewBox(pointer.getPointer(0))

    public fun setValue(value: CompositionViewBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionViewBox, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionViewBox {
      val address = segment.toRawLongValue()
      return CompositionViewBox(Pointer(address))
    }

    public override fun toNative(obj: CompositionViewBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
