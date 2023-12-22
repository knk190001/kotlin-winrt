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

@ABIMarker(ScrollingBringingIntoViewEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollingBringingIntoViewEventArgs;{09760d99-d60c-5c76-8033-127b2085358c})")
@WinRTByReference(brClass = ScrollingBringingIntoViewEventArgs.ByReference::class)
public class ScrollingBringingIntoViewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollingBringingIntoViewEventArgs.WithDefault, IWinRTObject {
  private val __1849797460_Interface: IScrollingBringingIntoViewEventArgs.WithDefault by lazy {
    as_1849797460()
  }


  public override val __1849797460_Ptr: JNAPointer? by lazy {
    __1849797460_Interface.__1849797460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1849797460_Interface)

  private fun as_1849797460(): IScrollingBringingIntoViewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollingBringingIntoViewEventArgs.ABI.makeIScrollingBringingIntoViewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollingBringingIntoViewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollingBringingIntoViewEventArgs.ABI.makeIScrollingBringingIntoViewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollingBringingIntoViewEventArgs> {
    public override fun getValue() = ScrollingBringingIntoViewEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollingBringingIntoViewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollingBringingIntoViewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollingBringingIntoViewEventArgs {
      val address = segment.toRawLongValue()
      return ScrollingBringingIntoViewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollingBringingIntoViewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
