package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.RoutedEventArgs
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HyperlinkClickEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.HyperlinkClickEventArgs;{c755916b-7bdc-4be7-b373-9240a503d870})")
@WinRTByReference(brClass = HyperlinkClickEventArgs.ByReference::class)
public class HyperlinkClickEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IHyperlinkClickEventArgs.WithDefault, IWinRTObject {
  private val __2058664755_Interface: IHyperlinkClickEventArgs.WithDefault by lazy {
    as_2058664755()
  }


  public override val __2058664755_Ptr: JNAPointer? by lazy {
    __2058664755_Interface.__2058664755_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2058664755_Interface)

  private fun as_2058664755(): IHyperlinkClickEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHyperlinkClickEventArgs.ABI.makeIHyperlinkClickEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlinkClickEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlinkClickEventArgs.ABI.makeIHyperlinkClickEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HyperlinkClickEventArgs> {
    public override fun getValue() = HyperlinkClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: HyperlinkClickEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HyperlinkClickEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HyperlinkClickEventArgs {
      val address = segment.toRawLongValue()
      return HyperlinkClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HyperlinkClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
