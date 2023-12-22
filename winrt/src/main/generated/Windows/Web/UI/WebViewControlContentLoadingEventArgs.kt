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

@ABIMarker(WebViewControlContentLoadingEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlContentLoadingEventArgs;{9a3fccb2-b9bb-404b-a22b-66dccd1250c6})")
@WinRTByReference(brClass = WebViewControlContentLoadingEventArgs.ByReference::class)
public class WebViewControlContentLoadingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlContentLoadingEventArgs.WithDefault, IWinRTObject {
  private val __660362336_Interface: IWebViewControlContentLoadingEventArgs.WithDefault by lazy {
    as_660362336()
  }


  public override val __660362336_Ptr: JNAPointer? by lazy {
    __660362336_Interface.__660362336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__660362336_Interface)

  private fun as_660362336(): IWebViewControlContentLoadingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlContentLoadingEventArgs.ABI.makeIWebViewControlContentLoadingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlContentLoadingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlContentLoadingEventArgs.ABI.makeIWebViewControlContentLoadingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlContentLoadingEventArgs> {
    public override fun getValue() = WebViewControlContentLoadingEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlContentLoadingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlContentLoadingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewControlContentLoadingEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlContentLoadingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlContentLoadingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
