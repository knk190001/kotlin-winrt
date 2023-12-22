package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.RoutedEventArgs
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
@Signature("rc(Microsoft.UI.Xaml.Documents.HyperlinkClickEventArgs;{f8f89552-873d-5ef5-82bf-c79a9509b07c})")
@WinRTByReference(brClass = HyperlinkClickEventArgs.ByReference::class)
public class HyperlinkClickEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IHyperlinkClickEventArgs.WithDefault, IWinRTObject {
  private val __1045767544_Interface: IHyperlinkClickEventArgs.WithDefault by lazy {
    as_1045767544()
  }


  public override val __1045767544_Ptr: JNAPointer? by lazy {
    __1045767544_Interface.__1045767544_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1045767544_Interface)

  private fun as_1045767544(): IHyperlinkClickEventArgs.WithDefault {
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
