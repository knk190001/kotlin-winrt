package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ItemsViewItemInvokedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsViewItemInvokedEventArgs;{5a2386e8-15b8-5f25-874b-7912f633ce21})")
@WinRTByReference(brClass = ItemsViewItemInvokedEventArgs.ByReference::class)
public class ItemsViewItemInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemsViewItemInvokedEventArgs.WithDefault, IWinRTObject {
  private val __13149180_Interface: IItemsViewItemInvokedEventArgs.WithDefault by lazy {
    as_13149180()
  }


  public override val __13149180_Ptr: JNAPointer? by lazy {
    __13149180_Interface.__13149180_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13149180_Interface)

  private fun as_13149180(): IItemsViewItemInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemsViewItemInvokedEventArgs.ABI.makeIItemsViewItemInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsViewItemInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsViewItemInvokedEventArgs.ABI.makeIItemsViewItemInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsViewItemInvokedEventArgs> {
    public override fun getValue() = ItemsViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemsViewItemInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsViewItemInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemsViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return ItemsViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemsViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
