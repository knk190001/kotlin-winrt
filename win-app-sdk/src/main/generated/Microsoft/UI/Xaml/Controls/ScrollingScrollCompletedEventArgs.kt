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

@ABIMarker(ScrollingScrollCompletedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingScrollCompletedEventArgs;{9bdeae9c-972c-54ae-9c62-fc1a03ff3fa8})")
@WinRTByReference(brClass = ScrollingScrollCompletedEventArgs.ByReference::class)
public class ScrollingScrollCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingScrollCompletedEventArgs.WithDefault, IWinRTObject {
  private val __67071897_Interface: IScrollingScrollCompletedEventArgs.WithDefault by lazy {
    as_67071897()
  }


  public override val __67071897_Ptr: JNAPointer? by lazy {
    __67071897_Interface.__67071897_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__67071897_Interface)

  private fun as_67071897(): IScrollingScrollCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingScrollCompletedEventArgs.ABI.makeIScrollingScrollCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingScrollCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingScrollCompletedEventArgs.ABI.makeIScrollingScrollCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingScrollCompletedEventArgs> {
    public override fun getValue() = ScrollingScrollCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingScrollCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingScrollCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollingScrollCompletedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingScrollCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingScrollCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
