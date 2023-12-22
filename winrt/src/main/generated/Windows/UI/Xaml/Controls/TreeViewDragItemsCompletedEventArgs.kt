package Windows.UI.Xaml.Controls

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

@ABIMarker(TreeViewDragItemsCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewDragItemsCompletedEventArgs;{3ca8632c-4311-574e-8ab4-3b7aa5de7a88})")
@WinRTByReference(brClass = TreeViewDragItemsCompletedEventArgs.ByReference::class)
public class TreeViewDragItemsCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewDragItemsCompletedEventArgs.WithDefault, IWinRTObject {
  private val __976209511_Interface: ITreeViewDragItemsCompletedEventArgs.WithDefault by lazy {
    as_976209511()
  }


  public override val __976209511_Ptr: JNAPointer? by lazy {
    __976209511_Interface.__976209511_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__976209511_Interface)

  private fun as_976209511(): ITreeViewDragItemsCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewDragItemsCompletedEventArgs.ABI.makeITreeViewDragItemsCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewDragItemsCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewDragItemsCompletedEventArgs.ABI.makeITreeViewDragItemsCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewDragItemsCompletedEventArgs> {
    public override fun getValue() = TreeViewDragItemsCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewDragItemsCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewDragItemsCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewDragItemsCompletedEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewDragItemsCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewDragItemsCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
