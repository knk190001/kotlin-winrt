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

@ABIMarker(TreeViewExpandingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewExpandingEventArgs;{c5e1fa63-4154-49d2-a21f-c34176605e3a})")
@WinRTByReference(brClass = TreeViewExpandingEventArgs.ByReference::class)
public class TreeViewExpandingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewExpandingEventArgs.WithDefault,
    ITreeViewExpandingEventArgs2.WithDefault, IWinRTObject {
  private val __974849614_Interface: ITreeViewExpandingEventArgs.WithDefault by lazy {
    as_974849614()
  }


  private val __155567012_Interface: ITreeViewExpandingEventArgs2.WithDefault by lazy {
    as_155567012()
  }


  public override val __974849614_Ptr: JNAPointer? by lazy {
    __974849614_Interface.__974849614_Ptr
  }


  public override val __155567012_Ptr: JNAPointer? by lazy {
    __155567012_Interface.__155567012_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__974849614_Interface, __155567012_Interface)

  private fun as_974849614(): ITreeViewExpandingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewExpandingEventArgs.ABI.makeITreeViewExpandingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewExpandingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewExpandingEventArgs.ABI.makeITreeViewExpandingEventArgs(ref.value))
  }

  private fun as_155567012(): ITreeViewExpandingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewExpandingEventArgs2.ABI.makeITreeViewExpandingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewExpandingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewExpandingEventArgs2.ABI.makeITreeViewExpandingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewExpandingEventArgs> {
    public override fun getValue() = TreeViewExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewExpandingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewExpandingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewExpandingEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
