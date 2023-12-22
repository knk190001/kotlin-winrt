package Windows.Web.UI

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

@ABIMarker(WebViewControlDOMContentLoadedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlDOMContentLoadedEventArgs;{be8bc008-9541-4545-9ff2-2df585b29f7d})")
@WinRTByReference(brClass = WebViewControlDOMContentLoadedEventArgs.ByReference::class)
public class WebViewControlDOMContentLoadedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlDOMContentLoadedEventArgs.WithDefault, IWinRTObject {
  private val __334395271_Interface: IWebViewControlDOMContentLoadedEventArgs.WithDefault by lazy {
    as_334395271()
  }


  public override val __334395271_Ptr: JNAPointer? by lazy {
    __334395271_Interface.__334395271_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__334395271_Interface)

  private fun as_334395271(): IWebViewControlDOMContentLoadedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlDOMContentLoadedEventArgs.ABI.makeIWebViewControlDOMContentLoadedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlDOMContentLoadedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlDOMContentLoadedEventArgs.ABI.makeIWebViewControlDOMContentLoadedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlDOMContentLoadedEventArgs> {
    public override fun getValue() = WebViewControlDOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlDOMContentLoadedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlDOMContentLoadedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlDOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlDOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlDOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
