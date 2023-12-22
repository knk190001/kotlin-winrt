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

@ABIMarker(ScrollingScrollAnimationStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingScrollAnimationStartingEventArgs;{7acb0423-6fc7-516b-ab67-03a4a4285a90})")
@WinRTByReference(brClass = ScrollingScrollAnimationStartingEventArgs.ByReference::class)
public class ScrollingScrollAnimationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingScrollAnimationStartingEventArgs.WithDefault, IWinRTObject {
  private val __134421486_Interface: IScrollingScrollAnimationStartingEventArgs.WithDefault by
      lazy {
    as_134421486()
  }


  public override val __134421486_Ptr: JNAPointer? by lazy {
    __134421486_Interface.__134421486_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__134421486_Interface)

  private fun as_134421486(): IScrollingScrollAnimationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingScrollAnimationStartingEventArgs.ABI.makeIScrollingScrollAnimationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingScrollAnimationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingScrollAnimationStartingEventArgs.ABI.makeIScrollingScrollAnimationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingScrollAnimationStartingEventArgs> {
    public override fun getValue() =
        ScrollingScrollAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingScrollAnimationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingScrollAnimationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ScrollingScrollAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingScrollAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingScrollAnimationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
