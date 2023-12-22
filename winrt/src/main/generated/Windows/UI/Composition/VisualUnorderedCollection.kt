package Windows.UI.Composition

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

@ABIMarker(VisualUnorderedCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.VisualUnorderedCollection;{338faa70-54c8-40a7-8029-c9ceeb0aa250})")
@WinRTByReference(brClass = VisualUnorderedCollection.ByReference::class)
public class VisualUnorderedCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVisualUnorderedCollection.WithDefault, IIterable<Visual?>, IWinRTObject
    {
  private val __2036622884_Interface: IVisualUnorderedCollection.WithDefault by lazy {
    as_2036622884()
  }


  private val __1449643190_Interface: IIterable<Visual?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<Visual?>>()

  public override val __2036622884_Ptr: JNAPointer? by lazy {
    __2036622884_Interface.__2036622884_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2036622884_Interface, __1449643190_Interface)

  private fun as_2036622884(): IVisualUnorderedCollection.WithDefault {
    if(pointer == NULL) {
      return(IVisualUnorderedCollection.ABI.makeIVisualUnorderedCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualUnorderedCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualUnorderedCollection.ABI.makeIVisualUnorderedCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<Visual?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<Visual?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<Visual?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<Visual?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualUnorderedCollection> {
    public override fun getValue() = VisualUnorderedCollection(pointer.getPointer(0))

    public fun setValue(value: VisualUnorderedCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualUnorderedCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisualUnorderedCollection {
      val address = segment.toRawLongValue()
      return VisualUnorderedCollection(Pointer(address))
    }

    public override fun toNative(obj: VisualUnorderedCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
