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

@ABIMarker(WebViewLongRunningScriptDetectedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewLongRunningScriptDetectedEventArgs;{f3f020ab-a46c-42b0-9efe-69764d5cffa6})")
@WinRTByReference(brClass = WebViewLongRunningScriptDetectedEventArgs.ByReference::class)
public class WebViewLongRunningScriptDetectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewLongRunningScriptDetectedEventArgs.WithDefault, IWinRTObject {
  private val __1167473380_Interface: IWebViewLongRunningScriptDetectedEventArgs.WithDefault by
      lazy {
    as_1167473380()
  }


  public override val __1167473380_Ptr: JNAPointer? by lazy {
    __1167473380_Interface.__1167473380_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1167473380_Interface)

  private fun as_1167473380(): IWebViewLongRunningScriptDetectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewLongRunningScriptDetectedEventArgs.ABI.makeIWebViewLongRunningScriptDetectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewLongRunningScriptDetectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewLongRunningScriptDetectedEventArgs.ABI.makeIWebViewLongRunningScriptDetectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewLongRunningScriptDetectedEventArgs> {
    public override fun getValue() =
        WebViewLongRunningScriptDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewLongRunningScriptDetectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewLongRunningScriptDetectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewLongRunningScriptDetectedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewLongRunningScriptDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewLongRunningScriptDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
