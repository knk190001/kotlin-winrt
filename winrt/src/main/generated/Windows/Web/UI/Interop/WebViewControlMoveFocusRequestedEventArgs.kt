package Windows.Web.UI.Interop

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

@ABIMarker(WebViewControlMoveFocusRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.Interop.WebViewControlMoveFocusRequestedEventArgs;{6b2a340d-4bd0-405e-b7c1-1e72a492f446})")
@WinRTByReference(brClass = WebViewControlMoveFocusRequestedEventArgs.ByReference::class)
public class WebViewControlMoveFocusRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlMoveFocusRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1979724565_Interface: IWebViewControlMoveFocusRequestedEventArgs.WithDefault by
      lazy {
    as_1979724565()
  }


  public override val __1979724565_Ptr: JNAPointer? by lazy {
    __1979724565_Interface.__1979724565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1979724565_Interface)

  private fun as_1979724565(): IWebViewControlMoveFocusRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlMoveFocusRequestedEventArgs.ABI.makeIWebViewControlMoveFocusRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlMoveFocusRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlMoveFocusRequestedEventArgs.ABI.makeIWebViewControlMoveFocusRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlMoveFocusRequestedEventArgs> {
    public override fun getValue() =
        WebViewControlMoveFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlMoveFocusRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlMoveFocusRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlMoveFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlMoveFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlMoveFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
