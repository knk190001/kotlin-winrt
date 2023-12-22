package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ItemCollection.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemCollection;pinterface({5917eb53-50b4-4a0d-b309-65862b3f1dbc};cinterface(IInspectable)))")
@WinRTByReference(brClass = ItemCollection.ByReference::class)
public class ItemCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IObservableVector<IUnknown?>, IVector<IUnknown?>, IIterable<IUnknown?>,
    IWinRTObject {
  private val __1493305514_Interface: IObservableVector<IUnknown?> by lazy {
    as_1493305514()
  }


  private val __1070388601_Interface: IVector<IUnknown?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<IUnknown?> by lazy {
    as_1449643190()
  }


  public override val __1493305514_Type: KType = typeOf<IObservableVector<IUnknown?>>()

  public override val __1070388601_Type: KType = typeOf<IVector<IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IUnknown?>>()

  public override val __1493305514_Ptr: JNAPointer? by lazy {
    __1493305514_Interface.__1493305514_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1493305514_Interface, __1070388601_Interface, __1449643190_Interface)

  private fun as_1493305514(): IObservableVector<IUnknown?> {
    if(pointer == NULL) {
      return(IObservableVector.ABI.makeIObservableVector<IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObservableVector<IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableVector.ABI.makeIObservableVector<IUnknown?>(ref.value))
  }

  private fun as_1070388601(): IVector<IUnknown?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IUnknown?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IUnknown?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemCollection>
      {
    public override fun getValue() = ItemCollection(pointer.getPointer(0))

    public fun setValue(value: ItemCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemCollection {
      val address = segment.toRawLongValue()
      return ItemCollection(Pointer(address))
    }

    public override fun toNative(obj: ItemCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
