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

@ABIMarker(TreeViewCollapsedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewCollapsedEventArgs;{391db3b0-1e58-4539-9e93-387978f46cce})")
@WinRTByReference(brClass = TreeViewCollapsedEventArgs.ByReference::class)
public class TreeViewCollapsedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewCollapsedEventArgs.WithDefault,
    ITreeViewCollapsedEventArgs2.WithDefault, IWinRTObject {
  private val __453998559_Interface: ITreeViewCollapsedEventArgs.WithDefault by lazy {
    as_453998559()
  }


  private val __1189053491_Interface: ITreeViewCollapsedEventArgs2.WithDefault by lazy {
    as_1189053491()
  }


  public override val __453998559_Ptr: JNAPointer? by lazy {
    __453998559_Interface.__453998559_Ptr
  }


  public override val __1189053491_Ptr: JNAPointer? by lazy {
    __1189053491_Interface.__1189053491_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__453998559_Interface, __1189053491_Interface)

  private fun as_453998559(): ITreeViewCollapsedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewCollapsedEventArgs.ABI.makeITreeViewCollapsedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewCollapsedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewCollapsedEventArgs.ABI.makeITreeViewCollapsedEventArgs(ref.value))
  }

  private fun as_1189053491(): ITreeViewCollapsedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewCollapsedEventArgs2.ABI.makeITreeViewCollapsedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewCollapsedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewCollapsedEventArgs2.ABI.makeITreeViewCollapsedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewCollapsedEventArgs> {
    public override fun getValue() = TreeViewCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewCollapsedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewCollapsedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
