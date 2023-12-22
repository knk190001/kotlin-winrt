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

@ABIMarker(WebViewControlWebResourceRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlWebResourceRequestedEventArgs;{44d6524d-55a4-4d8b-891c-931d8e25d42e})")
@WinRTByReference(brClass = WebViewControlWebResourceRequestedEventArgs.ByReference::class)
public class WebViewControlWebResourceRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlWebResourceRequestedEventArgs.WithDefault, IWinRTObject {
  private val __172227895_Interface: IWebViewControlWebResourceRequestedEventArgs.WithDefault by
      lazy {
    as_172227895()
  }


  public override val __172227895_Ptr: JNAPointer? by lazy {
    __172227895_Interface.__172227895_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__172227895_Interface)

  private fun as_172227895(): IWebViewControlWebResourceRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlWebResourceRequestedEventArgs.ABI.makeIWebViewControlWebResourceRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlWebResourceRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlWebResourceRequestedEventArgs.ABI.makeIWebViewControlWebResourceRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlWebResourceRequestedEventArgs> {
    public override fun getValue() =
        WebViewControlWebResourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlWebResourceRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlWebResourceRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlWebResourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlWebResourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlWebResourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
