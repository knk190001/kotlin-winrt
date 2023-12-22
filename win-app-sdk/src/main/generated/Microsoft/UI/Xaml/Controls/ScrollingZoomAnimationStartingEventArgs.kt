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

@ABIMarker(ScrollingZoomAnimationStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingZoomAnimationStartingEventArgs;{59bfb77b-47c9-5691-bdcd-536fbe8eb8c1})")
@WinRTByReference(brClass = ScrollingZoomAnimationStartingEventArgs.ByReference::class)
public class ScrollingZoomAnimationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingZoomAnimationStartingEventArgs.WithDefault, IWinRTObject {
  private val __758861580_Interface: IScrollingZoomAnimationStartingEventArgs.WithDefault by lazy {
    as_758861580()
  }


  public override val __758861580_Ptr: JNAPointer? by lazy {
    __758861580_Interface.__758861580_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__758861580_Interface)

  private fun as_758861580(): IScrollingZoomAnimationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingZoomAnimationStartingEventArgs.ABI.makeIScrollingZoomAnimationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingZoomAnimationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingZoomAnimationStartingEventArgs.ABI.makeIScrollingZoomAnimationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingZoomAnimationStartingEventArgs> {
    public override fun getValue() = ScrollingZoomAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingZoomAnimationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingZoomAnimationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ScrollingZoomAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingZoomAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingZoomAnimationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
