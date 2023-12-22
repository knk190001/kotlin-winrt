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

@ABIMarker(WebViewDOMContentLoadedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewDOMContentLoadedEventArgs;{c47eba15-dc6b-4b36-9d80-82fb8817b988})")
@WinRTByReference(brClass = WebViewDOMContentLoadedEventArgs.ByReference::class)
public class WebViewDOMContentLoadedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewDOMContentLoadedEventArgs.WithDefault, IWinRTObject {
  private val __652964802_Interface: IWebViewDOMContentLoadedEventArgs.WithDefault by lazy {
    as_652964802()
  }


  public override val __652964802_Ptr: JNAPointer? by lazy {
    __652964802_Interface.__652964802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__652964802_Interface)

  private fun as_652964802(): IWebViewDOMContentLoadedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewDOMContentLoadedEventArgs.ABI.makeIWebViewDOMContentLoadedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewDOMContentLoadedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewDOMContentLoadedEventArgs.ABI.makeIWebViewDOMContentLoadedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewDOMContentLoadedEventArgs> {
    public override fun getValue() = WebViewDOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewDOMContentLoadedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewDOMContentLoadedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewDOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewDOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewDOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
