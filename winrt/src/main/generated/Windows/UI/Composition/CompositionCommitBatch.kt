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

@ABIMarker(CompositionCommitBatch.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionCommitBatch;{0d00dad0-ca07-4400-8c8e-cb5db08559cc})")
@WinRTByReference(brClass = CompositionCommitBatch.ByReference::class)
public class CompositionCommitBatch(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionCommitBatch.WithDefault, IWinRTObject {
  private val __780896615_Interface: ICompositionCommitBatch.WithDefault by lazy {
    as_780896615()
  }


  public override val __780896615_Ptr: JNAPointer? by lazy {
    __780896615_Interface.__780896615_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__780896615_Interface)

  private fun as_780896615(): ICompositionCommitBatch.WithDefault {
    if(pointer == NULL) {
      return(ICompositionCommitBatch.ABI.makeICompositionCommitBatch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionCommitBatch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionCommitBatch.ABI.makeICompositionCommitBatch(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionCommitBatch> {
    public override fun getValue() = CompositionCommitBatch(pointer.getPointer(0))

    public fun setValue(value: CompositionCommitBatch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionCommitBatch, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionCommitBatch {
      val address = segment.toRawLongValue()
      return CompositionCommitBatch(Pointer(address))
    }

    public override fun toNative(obj: CompositionCommitBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
