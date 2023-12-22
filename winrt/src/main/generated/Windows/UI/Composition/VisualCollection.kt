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

@ABIMarker(VisualCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.VisualCollection;{8b745505-fd3e-4a98-84a8-e949468c6bcb})")
@WinRTByReference(brClass = VisualCollection.ByReference::class)
public class VisualCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IVisualCollection.WithDefault, IIterable<Visual?>, IWinRTObject {
  private val __714395052_Interface: IVisualCollection.WithDefault by lazy {
    as_714395052()
  }


  private val __1449643190_Interface: IIterable<Visual?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<Visual?>>()

  public override val __714395052_Ptr: JNAPointer? by lazy {
    __714395052_Interface.__714395052_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__714395052_Interface, __1449643190_Interface)

  private fun as_714395052(): IVisualCollection.WithDefault {
    if(pointer == NULL) {
      return(IVisualCollection.ABI.makeIVisualCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualCollection.ABI.makeIVisualCollection(ref.value))
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
      IByReference<VisualCollection> {
    public override fun getValue() = VisualCollection(pointer.getPointer(0))

    public fun setValue(value: VisualCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisualCollection {
      val address = segment.toRawLongValue()
      return VisualCollection(Pointer(address))
    }

    public override fun toNative(obj: VisualCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
