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

@ABIMarker(ScrollViewerViewChangingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ScrollViewerViewChangingEventArgs;{4dd04f7f-7a11-4b2e-9933-577df39252b6})")
@WinRTByReference(brClass = ScrollViewerViewChangingEventArgs.ByReference::class)
public class ScrollViewerViewChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollViewerViewChangingEventArgs.WithDefault, IWinRTObject {
  private val __354083306_Interface: IScrollViewerViewChangingEventArgs.WithDefault by lazy {
    as_354083306()
  }


  public override val __354083306_Ptr: JNAPointer? by lazy {
    __354083306_Interface.__354083306_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__354083306_Interface)

  private fun as_354083306(): IScrollViewerViewChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewerViewChangingEventArgs.ABI.makeIScrollViewerViewChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewerViewChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewerViewChangingEventArgs.ABI.makeIScrollViewerViewChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollViewerViewChangingEventArgs> {
    public override fun getValue() = ScrollViewerViewChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollViewerViewChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollViewerViewChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollViewerViewChangingEventArgs {
      val address = segment.toRawLongValue()
      return ScrollViewerViewChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollViewerViewChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
