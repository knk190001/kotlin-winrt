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

@ABIMarker(CompositionScopedBatch.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionScopedBatch;{d31ca572-99ce-5969-b042-6c2d330a3859})")
@WinRTByReference(brClass = CompositionScopedBatch.ByReference::class)
public class CompositionScopedBatch(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionScopedBatch.WithDefault, IWinRTObject {
  private val __1350452185_Interface: ICompositionScopedBatch.WithDefault by lazy {
    as_1350452185()
  }


  public override val __1350452185_Ptr: JNAPointer? by lazy {
    __1350452185_Interface.__1350452185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1350452185_Interface)

  private fun as_1350452185(): ICompositionScopedBatch.WithDefault {
    if(pointer == NULL) {
      return(ICompositionScopedBatch.ABI.makeICompositionScopedBatch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionScopedBatch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionScopedBatch.ABI.makeICompositionScopedBatch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionScopedBatch> {
    public override fun getValue() = CompositionScopedBatch(pointer.getPointer(0))

    public fun setValue(value: CompositionScopedBatch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionScopedBatch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionScopedBatch {
      val address = segment.toRawLongValue()
      return CompositionScopedBatch(Pointer(address))
    }

    public override fun toNative(obj: CompositionScopedBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
