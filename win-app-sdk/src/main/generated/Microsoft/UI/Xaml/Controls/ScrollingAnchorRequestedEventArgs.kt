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

@ABIMarker(ScrollingAnchorRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingAnchorRequestedEventArgs;{6a46cb4b-ab26-55b2-aa76-9b337a4f8e8e})")
@WinRTByReference(brClass = ScrollingAnchorRequestedEventArgs.ByReference::class)
public class ScrollingAnchorRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingAnchorRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1182349452_Interface: IScrollingAnchorRequestedEventArgs.WithDefault by lazy {
    as_1182349452()
  }


  public override val __1182349452_Ptr: JNAPointer? by lazy {
    __1182349452_Interface.__1182349452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1182349452_Interface)

  private fun as_1182349452(): IScrollingAnchorRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingAnchorRequestedEventArgs.ABI.makeIScrollingAnchorRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingAnchorRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingAnchorRequestedEventArgs.ABI.makeIScrollingAnchorRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingAnchorRequestedEventArgs> {
    public override fun getValue() = ScrollingAnchorRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingAnchorRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingAnchorRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollingAnchorRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingAnchorRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingAnchorRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
