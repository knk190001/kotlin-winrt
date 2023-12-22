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

@ABIMarker(TreeViewSelectionChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TreeViewSelectionChangedEventArgs;{664190f3-7133-5599-b41c-1d54cd2cb930})")
@WinRTByReference(brClass = TreeViewSelectionChangedEventArgs.ByReference::class)
public class TreeViewSelectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITreeViewSelectionChangedEventArgs.WithDefault, IWinRTObject {
  private val __2080012059_Interface: ITreeViewSelectionChangedEventArgs.WithDefault by lazy {
    as_2080012059()
  }


  public override val __2080012059_Ptr: JNAPointer? by lazy {
    __2080012059_Interface.__2080012059_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2080012059_Interface)

  private fun as_2080012059(): ITreeViewSelectionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewSelectionChangedEventArgs.ABI.makeITreeViewSelectionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewSelectionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewSelectionChangedEventArgs.ABI.makeITreeViewSelectionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewSelectionChangedEventArgs> {
    public override fun getValue() = TreeViewSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TreeViewSelectionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewSelectionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TreeViewSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return TreeViewSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TreeViewSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
