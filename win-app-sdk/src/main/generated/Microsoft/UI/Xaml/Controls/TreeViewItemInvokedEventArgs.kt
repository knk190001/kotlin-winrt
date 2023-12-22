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

@ABIMarker(TreeViewItemInvokedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TreeViewItemInvokedEventArgs;{1a05853c-b101-542c-9a1e-775a044c4652})")
@WinRTByReference(brClass = TreeViewItemInvokedEventArgs.ByReference::class)
public class TreeViewItemInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewItemInvokedEventArgs.WithDefault, IWinRTObject {
  private val __248457096_Interface: ITreeViewItemInvokedEventArgs.WithDefault by lazy {
    as_248457096()
  }


  public override val __248457096_Ptr: JNAPointer? by lazy {
    __248457096_Interface.__248457096_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__248457096_Interface)

  private fun as_248457096(): ITreeViewItemInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItemInvokedEventArgs.ABI.makeITreeViewItemInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItemInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItemInvokedEventArgs.ABI.makeITreeViewItemInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewItemInvokedEventArgs> {
    public override fun getValue() = TreeViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewItemInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewItemInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
