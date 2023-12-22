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

@ABIMarker(TreeViewDragItemsStartingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewDragItemsStartingEventArgs;{7bdb7ec4-e125-5773-9a3f-6695233d6250})")
@WinRTByReference(brClass = TreeViewDragItemsStartingEventArgs.ByReference::class)
public class TreeViewDragItemsStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewDragItemsStartingEventArgs.WithDefault, IWinRTObject {
  private val __1013988234_Interface: ITreeViewDragItemsStartingEventArgs.WithDefault by lazy {
    as_1013988234()
  }


  public override val __1013988234_Ptr: JNAPointer? by lazy {
    __1013988234_Interface.__1013988234_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1013988234_Interface)

  private fun as_1013988234(): ITreeViewDragItemsStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewDragItemsStartingEventArgs.ABI.makeITreeViewDragItemsStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewDragItemsStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewDragItemsStartingEventArgs.ABI.makeITreeViewDragItemsStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewDragItemsStartingEventArgs> {
    public override fun getValue() = TreeViewDragItemsStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewDragItemsStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewDragItemsStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewDragItemsStartingEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewDragItemsStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewDragItemsStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
