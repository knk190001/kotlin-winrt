package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.CompositionObject
import Windows.Foundation.Collections.IIterable
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CompositionInteractionSourceCollection.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.CompositionInteractionSourceCollection;{9aa1b86b-b002-5e2e-bb2b-0e2c547445e1})")
@WinRTByReference(brClass = CompositionInteractionSourceCollection.ByReference::class)
public class CompositionInteractionSourceCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionInteractionSourceCollection.WithDefault,
    IIterable<ICompositionInteractionSource?>, IWinRTObject {
  private val __1917098091_Interface: ICompositionInteractionSourceCollection.WithDefault by lazy {
    as_1917098091()
  }


  private val __1449643190_Interface: IIterable<ICompositionInteractionSource?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<ICompositionInteractionSource?>>()

  public override val __1917098091_Ptr: JNAPointer? by lazy {
    __1917098091_Interface.__1917098091_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1917098091_Interface, __1449643190_Interface)

  private fun as_1917098091(): ICompositionInteractionSourceCollection.WithDefault {
    if(pointer == NULL) {
      return(ICompositionInteractionSourceCollection.ABI.makeICompositionInteractionSourceCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionInteractionSourceCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionInteractionSourceCollection.ABI.makeICompositionInteractionSourceCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<ICompositionInteractionSource?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<ICompositionInteractionSource?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<ICompositionInteractionSource?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<ICompositionInteractionSource?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionInteractionSourceCollection> {
    public override fun getValue() = CompositionInteractionSourceCollection(pointer.getPointer(0))

    public fun setValue(value: CompositionInteractionSourceCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionInteractionSourceCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionInteractionSourceCollection {
      val address = segment.toRawLongValue()
      return CompositionInteractionSourceCollection(Pointer(address))
    }

    public override fun toNative(obj: CompositionInteractionSourceCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
