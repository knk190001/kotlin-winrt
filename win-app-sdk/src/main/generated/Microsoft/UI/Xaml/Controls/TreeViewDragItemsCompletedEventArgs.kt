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

@ABIMarker(TreeViewDragItemsCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TreeViewDragItemsCompletedEventArgs;{e5b8547e-f839-55db-9c26-2a95f57a60dc})")
@WinRTByReference(brClass = TreeViewDragItemsCompletedEventArgs.ByReference::class)
public class TreeViewDragItemsCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewDragItemsCompletedEventArgs.WithDefault,
    ITreeViewDragItemsCompletedEventArgs2.WithDefault, IWinRTObject {
  private val __779890674_Interface: ITreeViewDragItemsCompletedEventArgs.WithDefault by lazy {
    as_779890674()
  }


  private val __1593192932_Interface: ITreeViewDragItemsCompletedEventArgs2.WithDefault by lazy {
    as_1593192932()
  }


  public override val __779890674_Ptr: JNAPointer? by lazy {
    __779890674_Interface.__779890674_Ptr
  }


  public override val __1593192932_Ptr: JNAPointer? by lazy {
    __1593192932_Interface.__1593192932_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__779890674_Interface, __1593192932_Interface)

  private fun as_779890674(): ITreeViewDragItemsCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewDragItemsCompletedEventArgs.ABI.makeITreeViewDragItemsCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewDragItemsCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewDragItemsCompletedEventArgs.ABI.makeITreeViewDragItemsCompletedEventArgs(ref.value))
  }

  private fun as_1593192932(): ITreeViewDragItemsCompletedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewDragItemsCompletedEventArgs2.ABI.makeITreeViewDragItemsCompletedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewDragItemsCompletedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewDragItemsCompletedEventArgs2.ABI.makeITreeViewDragItemsCompletedEventArgs2(ref.value))
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
