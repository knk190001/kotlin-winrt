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

@ABIMarker(ScrollViewerView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ScrollViewerView;{64e9be01-4dc2-493e-abe8-cbd3c577490e})")
@WinRTByReference(brClass = ScrollViewerView.ByReference::class)
public class ScrollViewerView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollViewerView.WithDefault, IWinRTObject {
  private val __576810336_Interface: IScrollViewerView.WithDefault by lazy {
    as_576810336()
  }


  public override val __576810336_Ptr: JNAPointer? by lazy {
    __576810336_Interface.__576810336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__576810336_Interface)

  private fun as_576810336(): IScrollViewerView.WithDefault {
    if(pointer == NULL) {
      return(IScrollViewerView.ABI.makeIScrollViewerView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollViewerView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollViewerView.ABI.makeIScrollViewerView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollViewerView> {
    public override fun getValue() = ScrollViewerView(pointer.getPointer(0))

    public fun setValue(value: ScrollViewerView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollViewerView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollViewerView {
      val address = segment.toRawLongValue()
      return ScrollViewerView(Pointer(address))
    }

    public override fun toNative(obj: ScrollViewerView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
