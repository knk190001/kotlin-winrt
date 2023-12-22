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

@ABIMarker(WebViewControlNavigationStartingEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlNavigationStartingEventArgs;{0c9057c5-0a08-41c7-863b-71e3a9549137})")
@WinRTByReference(brClass = WebViewControlNavigationStartingEventArgs.ByReference::class)
public class WebViewControlNavigationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlNavigationStartingEventArgs.WithDefault, IWinRTObject {
  private val __135068465_Interface: IWebViewControlNavigationStartingEventArgs.WithDefault by
      lazy {
    as_135068465()
  }


  public override val __135068465_Ptr: JNAPointer? by lazy {
    __135068465_Interface.__135068465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__135068465_Interface)

  private fun as_135068465(): IWebViewControlNavigationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlNavigationStartingEventArgs.ABI.makeIWebViewControlNavigationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlNavigationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlNavigationStartingEventArgs.ABI.makeIWebViewControlNavigationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlNavigationStartingEventArgs> {
    public override fun getValue() =
        WebViewControlNavigationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlNavigationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlNavigationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlNavigationStartingEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlNavigationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlNavigationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
