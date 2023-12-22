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

@ABIMarker(TabViewTabDragStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewTabDragStartingEventArgs;{97682812-1a7b-53fd-8b4e-c2f70d2ad250})")
@WinRTByReference(brClass = TabViewTabDragStartingEventArgs.ByReference::class)
public class TabViewTabDragStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITabViewTabDragStartingEventArgs.WithDefault, IWinRTObject {
  private val __662904353_Interface: ITabViewTabDragStartingEventArgs.WithDefault by lazy {
    as_662904353()
  }


  public override val __662904353_Ptr: JNAPointer? by lazy {
    __662904353_Interface.__662904353_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__662904353_Interface)

  private fun as_662904353(): ITabViewTabDragStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITabViewTabDragStartingEventArgs.ABI.makeITabViewTabDragStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewTabDragStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewTabDragStartingEventArgs.ABI.makeITabViewTabDragStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewTabDragStartingEventArgs> {
    public override fun getValue() = TabViewTabDragStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TabViewTabDragStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewTabDragStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TabViewTabDragStartingEventArgs {
      val address = segment.toRawLongValue()
      return TabViewTabDragStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TabViewTabDragStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
