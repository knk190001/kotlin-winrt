package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.reflect.typeOf

@ABIMarker(ItemsChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ItemsChangedEventArgs;{b2ba1610-0e96-538a-978f-ec0b37193228})")
@WinRTByReference(brClass = ItemsChangedEventArgs.ByReference::class)
public class ItemsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemsChangedEventArgs.WithDefault, IWinRTObject {
  private val __801969550_Interface: IItemsChangedEventArgs.WithDefault by lazy {
    as_801969550()
  }


  public override val __801969550_Ptr: JNAPointer? by lazy {
    __801969550_Interface.__801969550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__801969550_Interface)

  private fun as_801969550(): IItemsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemsChangedEventArgs.ABI.makeIItemsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsChangedEventArgs.ABI.makeIItemsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsChangedEventArgs> {
    public override fun getValue() = ItemsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemsChangedEventArgs {
      val address = segment.toRawLongValue()
      return ItemsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
