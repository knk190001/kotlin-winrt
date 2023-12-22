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

@ABIMarker(ItemsRepeaterElementIndexChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsRepeaterElementIndexChangedEventArgs;{38e3d613-48fb-5906-bf18-f7130301fcc3})")
@WinRTByReference(brClass = ItemsRepeaterElementIndexChangedEventArgs.ByReference::class)
public class ItemsRepeaterElementIndexChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemsRepeaterElementIndexChangedEventArgs.WithDefault, IWinRTObject {
  private val __2116558022_Interface: IItemsRepeaterElementIndexChangedEventArgs.WithDefault by
      lazy {
    as_2116558022()
  }


  public override val __2116558022_Ptr: JNAPointer? by lazy {
    __2116558022_Interface.__2116558022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2116558022_Interface)

  private fun as_2116558022(): IItemsRepeaterElementIndexChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemsRepeaterElementIndexChangedEventArgs.ABI.makeIItemsRepeaterElementIndexChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsRepeaterElementIndexChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsRepeaterElementIndexChangedEventArgs.ABI.makeIItemsRepeaterElementIndexChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsRepeaterElementIndexChangedEventArgs> {
    public override fun getValue() =
        ItemsRepeaterElementIndexChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemsRepeaterElementIndexChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsRepeaterElementIndexChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ItemsRepeaterElementIndexChangedEventArgs {
      val address = segment.toRawLongValue()
      return ItemsRepeaterElementIndexChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemsRepeaterElementIndexChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
