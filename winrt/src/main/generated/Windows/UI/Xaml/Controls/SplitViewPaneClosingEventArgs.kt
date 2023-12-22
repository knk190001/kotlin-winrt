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

@ABIMarker(SplitViewPaneClosingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SplitViewPaneClosingEventArgs;{93cf494e-7a95-44d8-9562-1b348248da9f})")
@WinRTByReference(brClass = SplitViewPaneClosingEventArgs.ByReference::class)
public class SplitViewPaneClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISplitViewPaneClosingEventArgs.WithDefault, IWinRTObject {
  private val __296588749_Interface: ISplitViewPaneClosingEventArgs.WithDefault by lazy {
    as_296588749()
  }


  public override val __296588749_Ptr: JNAPointer? by lazy {
    __296588749_Interface.__296588749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__296588749_Interface)

  private fun as_296588749(): ISplitViewPaneClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISplitViewPaneClosingEventArgs.ABI.makeISplitViewPaneClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitViewPaneClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitViewPaneClosingEventArgs.ABI.makeISplitViewPaneClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplitViewPaneClosingEventArgs> {
    public override fun getValue() = SplitViewPaneClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: SplitViewPaneClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitViewPaneClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SplitViewPaneClosingEventArgs {
      val address = segment.toRawLongValue()
      return SplitViewPaneClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SplitViewPaneClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
