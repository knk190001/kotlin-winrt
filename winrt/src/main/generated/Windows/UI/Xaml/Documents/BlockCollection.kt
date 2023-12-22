package Windows.UI.Xaml.Documents

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(BlockCollection.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.BlockCollection;pinterface({913337e9-11a1-4345-a3a2-4e7f956e222d};rc(Windows.UI.Xaml.Documents.Block;{4bce0016-dd47-4350-8cb0-e171600ac896})))")
@WinRTByReference(brClass = BlockCollection.ByReference::class)
public class BlockCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVector<Block?>, IIterable<Block?>, IWinRTObject {
  private val __1070388601_Interface: IVector<Block?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<Block?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<Block?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<Block?>>()

  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1070388601_Interface, __1449643190_Interface)

  private fun as_1070388601(): IVector<Block?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<Block?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<Block?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<Block?>(ref.value))
  }

  private fun as_1449643190(): IIterable<Block?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<Block?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<Block?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<Block?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BlockCollection> {
    public override fun getValue() = BlockCollection(pointer.getPointer(0))

    public fun setValue(value: BlockCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BlockCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BlockCollection {
      val address = segment.toRawLongValue()
      return BlockCollection(Pointer(address))
    }

    public override fun toNative(obj: BlockCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
