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

@ABIMarker(WebViewControlLongRunningScriptDetectedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlLongRunningScriptDetectedEventArgs;{2a6e5bba-98b4-45bc-bbeb-0f69ce49c599})")
@WinRTByReference(brClass = WebViewControlLongRunningScriptDetectedEventArgs.ByReference::class)
public class WebViewControlLongRunningScriptDetectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlLongRunningScriptDetectedEventArgs.WithDefault, IWinRTObject {
  private val __1118171579_Interface: IWebViewControlLongRunningScriptDetectedEventArgs.WithDefault
      by lazy {
    as_1118171579()
  }


  public override val __1118171579_Ptr: JNAPointer? by lazy {
    __1118171579_Interface.__1118171579_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1118171579_Interface)

  private fun as_1118171579(): IWebViewControlLongRunningScriptDetectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlLongRunningScriptDetectedEventArgs.ABI.makeIWebViewControlLongRunningScriptDetectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlLongRunningScriptDetectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlLongRunningScriptDetectedEventArgs.ABI.makeIWebViewControlLongRunningScriptDetectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlLongRunningScriptDetectedEventArgs> {
    public override fun getValue() =
        WebViewControlLongRunningScriptDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlLongRunningScriptDetectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlLongRunningScriptDetectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlLongRunningScriptDetectedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlLongRunningScriptDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlLongRunningScriptDetectedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
