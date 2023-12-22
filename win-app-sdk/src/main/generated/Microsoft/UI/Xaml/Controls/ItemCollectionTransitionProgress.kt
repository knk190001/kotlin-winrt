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

@ABIMarker(ItemCollectionTransitionProgress.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemCollectionTransitionProgress;{4da82dde-c778-57f6-a0e7-a767ef08591d})")
@WinRTByReference(brClass = ItemCollectionTransitionProgress.ByReference::class)
public class ItemCollectionTransitionProgress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemCollectionTransitionProgress.WithDefault, IWinRTObject {
  private val __981967962_Interface: IItemCollectionTransitionProgress.WithDefault by lazy {
    as_981967962()
  }


  public override val __981967962_Ptr: JNAPointer? by lazy {
    __981967962_Interface.__981967962_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__981967962_Interface)

  private fun as_981967962(): IItemCollectionTransitionProgress.WithDefault {
    if(pointer == NULL) {
      return(IItemCollectionTransitionProgress.ABI.makeIItemCollectionTransitionProgress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemCollectionTransitionProgress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemCollectionTransitionProgress.ABI.makeIItemCollectionTransitionProgress(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemCollectionTransitionProgress> {
    public override fun getValue() = ItemCollectionTransitionProgress(pointer.getPointer(0))

    public fun setValue(value: ItemCollectionTransitionProgress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemCollectionTransitionProgress, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemCollectionTransitionProgress {
      val address = segment.toRawLongValue()
      return ItemCollectionTransitionProgress(Pointer(address))
    }

    public override fun toNative(obj: ItemCollectionTransitionProgress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
