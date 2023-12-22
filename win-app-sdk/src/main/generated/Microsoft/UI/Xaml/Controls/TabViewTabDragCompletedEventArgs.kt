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

@ABIMarker(TabViewTabDragCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewTabDragCompletedEventArgs;{791fc623-c8f6-5102-81bd-1869cde82284})")
@WinRTByReference(brClass = TabViewTabDragCompletedEventArgs.ByReference::class)
public class TabViewTabDragCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITabViewTabDragCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1025092066_Interface: ITabViewTabDragCompletedEventArgs.WithDefault by lazy {
    as_1025092066()
  }


  public override val __1025092066_Ptr: JNAPointer? by lazy {
    __1025092066_Interface.__1025092066_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1025092066_Interface)

  private fun as_1025092066(): ITabViewTabDragCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITabViewTabDragCompletedEventArgs.ABI.makeITabViewTabDragCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewTabDragCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewTabDragCompletedEventArgs.ABI.makeITabViewTabDragCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewTabDragCompletedEventArgs> {
    public override fun getValue() = TabViewTabDragCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TabViewTabDragCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewTabDragCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TabViewTabDragCompletedEventArgs {
      val address = segment.toRawLongValue()
      return TabViewTabDragCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TabViewTabDragCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
