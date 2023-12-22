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

@ABIMarker(CompositionProjectedShadowReceiverUnorderedCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionProjectedShadowReceiverUnorderedCollection;{02b3e3b7-27d2-599f-ac4b-ab787cdde6fd})")
@WinRTByReference(brClass =
    CompositionProjectedShadowReceiverUnorderedCollection.ByReference::class)
public class CompositionProjectedShadowReceiverUnorderedCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadowReceiverUnorderedCollection.WithDefault,
    IIterable<CompositionProjectedShadowReceiver?>, IWinRTObject {
  private val __1719999097_Interface:
      ICompositionProjectedShadowReceiverUnorderedCollection.WithDefault by lazy {
    as_1719999097()
  }


  private val __1449643190_Interface: IIterable<CompositionProjectedShadowReceiver?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType =
      typeOf<IIterable<CompositionProjectedShadowReceiver?>>()

  public override val __1719999097_Ptr: JNAPointer? by lazy {
    __1719999097_Interface.__1719999097_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1719999097_Interface, __1449643190_Interface)

  private fun as_1719999097(): ICompositionProjectedShadowReceiverUnorderedCollection.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadowReceiverUnorderedCollection.ABI.makeICompositionProjectedShadowReceiverUnorderedCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadowReceiverUnorderedCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadowReceiverUnorderedCollection.ABI.makeICompositionProjectedShadowReceiverUnorderedCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<CompositionProjectedShadowReceiver?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CompositionProjectedShadowReceiver?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CompositionProjectedShadowReceiver?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CompositionProjectedShadowReceiver?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadowReceiverUnorderedCollection> {
    public override fun getValue() =
        CompositionProjectedShadowReceiverUnorderedCollection(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadowReceiverUnorderedCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadowReceiverUnorderedCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CompositionProjectedShadowReceiverUnorderedCollection {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadowReceiverUnorderedCollection(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadowReceiverUnorderedCollection):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
