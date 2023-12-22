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

@ABIMarker(ScrollingZoomCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingZoomCompletedEventArgs;{c821207e-ab2a-5f6c-9074-411840a68d55})")
@WinRTByReference(brClass = ScrollingZoomCompletedEventArgs.ByReference::class)
public class ScrollingZoomCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingZoomCompletedEventArgs.WithDefault, IWinRTObject {
  private val __357731181_Interface: IScrollingZoomCompletedEventArgs.WithDefault by lazy {
    as_357731181()
  }


  public override val __357731181_Ptr: JNAPointer? by lazy {
    __357731181_Interface.__357731181_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__357731181_Interface)

  private fun as_357731181(): IScrollingZoomCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingZoomCompletedEventArgs.ABI.makeIScrollingZoomCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingZoomCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingZoomCompletedEventArgs.ABI.makeIScrollingZoomCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingZoomCompletedEventArgs> {
    public override fun getValue() = ScrollingZoomCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingZoomCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingZoomCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollingZoomCompletedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingZoomCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingZoomCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
