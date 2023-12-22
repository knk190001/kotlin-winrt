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

@ABIMarker(WebViewControlScriptNotifyEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlScriptNotifyEventArgs;{491de57b-6f49-41bb-b591-51b85b817037})")
@WinRTByReference(brClass = WebViewControlScriptNotifyEventArgs.ByReference::class)
public class WebViewControlScriptNotifyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlScriptNotifyEventArgs.WithDefault, IWinRTObject {
  private val __739412047_Interface: IWebViewControlScriptNotifyEventArgs.WithDefault by lazy {
    as_739412047()
  }


  public override val __739412047_Ptr: JNAPointer? by lazy {
    __739412047_Interface.__739412047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__739412047_Interface)

  private fun as_739412047(): IWebViewControlScriptNotifyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlScriptNotifyEventArgs.ABI.makeIWebViewControlScriptNotifyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlScriptNotifyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlScriptNotifyEventArgs.ABI.makeIWebViewControlScriptNotifyEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlScriptNotifyEventArgs> {
    public override fun getValue() = WebViewControlScriptNotifyEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlScriptNotifyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlScriptNotifyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewControlScriptNotifyEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlScriptNotifyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlScriptNotifyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
