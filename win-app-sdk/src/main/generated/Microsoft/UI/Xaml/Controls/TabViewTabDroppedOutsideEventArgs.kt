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

@ABIMarker(TabViewTabDroppedOutsideEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewTabDroppedOutsideEventArgs;{1f1f4d5d-0fb1-51ab-b66f-f7a322bf2d13})")
@WinRTByReference(brClass = TabViewTabDroppedOutsideEventArgs.ByReference::class)
public class TabViewTabDroppedOutsideEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITabViewTabDroppedOutsideEventArgs.WithDefault, IWinRTObject {
  private val __1979130480_Interface: ITabViewTabDroppedOutsideEventArgs.WithDefault by lazy {
    as_1979130480()
  }


  public override val __1979130480_Ptr: JNAPointer? by lazy {
    __1979130480_Interface.__1979130480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1979130480_Interface)

  private fun as_1979130480(): ITabViewTabDroppedOutsideEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITabViewTabDroppedOutsideEventArgs.ABI.makeITabViewTabDroppedOutsideEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewTabDroppedOutsideEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewTabDroppedOutsideEventArgs.ABI.makeITabViewTabDroppedOutsideEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewTabDroppedOutsideEventArgs> {
    public override fun getValue() = TabViewTabDroppedOutsideEventArgs(pointer.getPointer(0))

    public fun setValue(value: TabViewTabDroppedOutsideEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewTabDroppedOutsideEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TabViewTabDroppedOutsideEventArgs {
      val address = segment.toRawLongValue()
      return TabViewTabDroppedOutsideEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TabViewTabDroppedOutsideEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
