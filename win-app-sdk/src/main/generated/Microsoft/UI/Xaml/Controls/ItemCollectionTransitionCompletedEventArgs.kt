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

@ABIMarker(ItemCollectionTransitionCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemCollectionTransitionCompletedEventArgs;{b43ca4f6-7ae5-576f-b74d-ec70b1c58488})")
@WinRTByReference(brClass = ItemCollectionTransitionCompletedEventArgs.ByReference::class)
public class ItemCollectionTransitionCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemCollectionTransitionCompletedEventArgs.WithDefault, IWinRTObject {
  private val __824920455_Interface: IItemCollectionTransitionCompletedEventArgs.WithDefault by
      lazy {
    as_824920455()
  }


  public override val __824920455_Ptr: JNAPointer? by lazy {
    __824920455_Interface.__824920455_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__824920455_Interface)

  private fun as_824920455(): IItemCollectionTransitionCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemCollectionTransitionCompletedEventArgs.ABI.makeIItemCollectionTransitionCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemCollectionTransitionCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemCollectionTransitionCompletedEventArgs.ABI.makeIItemCollectionTransitionCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemCollectionTransitionCompletedEventArgs> {
    public override fun getValue() =
        ItemCollectionTransitionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemCollectionTransitionCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemCollectionTransitionCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ItemCollectionTransitionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return ItemCollectionTransitionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemCollectionTransitionCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
