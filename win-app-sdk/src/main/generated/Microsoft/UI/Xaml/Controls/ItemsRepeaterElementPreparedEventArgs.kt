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

@ABIMarker(ItemsRepeaterElementPreparedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsRepeaterElementPreparedEventArgs;{612db572-c2e7-58fc-948a-b7dc0e1fc13a})")
@WinRTByReference(brClass = ItemsRepeaterElementPreparedEventArgs.ByReference::class)
public class ItemsRepeaterElementPreparedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemsRepeaterElementPreparedEventArgs.WithDefault, IWinRTObject {
  private val __2001494689_Interface: IItemsRepeaterElementPreparedEventArgs.WithDefault by lazy {
    as_2001494689()
  }


  public override val __2001494689_Ptr: JNAPointer? by lazy {
    __2001494689_Interface.__2001494689_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2001494689_Interface)

  private fun as_2001494689(): IItemsRepeaterElementPreparedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemsRepeaterElementPreparedEventArgs.ABI.makeIItemsRepeaterElementPreparedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsRepeaterElementPreparedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsRepeaterElementPreparedEventArgs.ABI.makeIItemsRepeaterElementPreparedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsRepeaterElementPreparedEventArgs> {
    public override fun getValue() = ItemsRepeaterElementPreparedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemsRepeaterElementPreparedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsRepeaterElementPreparedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemsRepeaterElementPreparedEventArgs {
      val address = segment.toRawLongValue()
      return ItemsRepeaterElementPreparedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemsRepeaterElementPreparedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
