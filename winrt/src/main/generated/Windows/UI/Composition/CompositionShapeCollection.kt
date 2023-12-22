package Windows.UI.Composition

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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

@ABIMarker(CompositionShapeCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionShapeCollection;pinterface({913337e9-11a1-4345-a3a2-4e7f956e222d};rc(Windows.UI.Composition.CompositionShape;{b47ce2f7-9a88-42c4-9e87-2e500ca8688c})))")
@WinRTByReference(brClass = CompositionShapeCollection.ByReference::class)
public class CompositionShapeCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVector<CompositionShape?>, IIterable<CompositionShape?>, IWinRTObject {
  private val __1070388601_Interface: IVector<CompositionShape?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<CompositionShape?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<CompositionShape?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<CompositionShape?>>()

  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1070388601_Interface, __1449643190_Interface)

  private fun as_1070388601(): IVector<CompositionShape?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<CompositionShape?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<CompositionShape?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<CompositionShape?>(ref.value))
  }

  private fun as_1449643190(): IIterable<CompositionShape?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CompositionShape?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CompositionShape?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CompositionShape?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionShapeCollection> {
    public override fun getValue() = CompositionShapeCollection(pointer.getPointer(0))

    public fun setValue(value: CompositionShapeCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionShapeCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionShapeCollection {
      val address = segment.toRawLongValue()
      return CompositionShapeCollection(Pointer(address))
    }

    public override fun toNative(obj: CompositionShapeCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
