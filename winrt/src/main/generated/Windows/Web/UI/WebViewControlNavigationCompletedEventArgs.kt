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

@ABIMarker(WebViewControlNavigationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlNavigationCompletedEventArgs;{20409918-4a15-4c46-a55d-f79edb0bde8b})")
@WinRTByReference(brClass = WebViewControlNavigationCompletedEventArgs.ByReference::class)
public class WebViewControlNavigationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlNavigationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __2057738484_Interface: IWebViewControlNavigationCompletedEventArgs.WithDefault by
      lazy {
    as_2057738484()
  }


  public override val __2057738484_Ptr: JNAPointer? by lazy {
    __2057738484_Interface.__2057738484_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2057738484_Interface)

  private fun as_2057738484(): IWebViewControlNavigationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlNavigationCompletedEventArgs.ABI.makeIWebViewControlNavigationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlNavigationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlNavigationCompletedEventArgs.ABI.makeIWebViewControlNavigationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlNavigationCompletedEventArgs> {
    public override fun getValue() =
        WebViewControlNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlNavigationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlNavigationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
