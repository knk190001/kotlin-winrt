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

@ABIMarker(WebViewControlUnviewableContentIdentifiedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlUnviewableContentIdentifiedEventArgs;{4a9680db-88f2-4e20-b693-b4e2df4aa581})")
@WinRTByReference(brClass = WebViewControlUnviewableContentIdentifiedEventArgs.ByReference::class)
public class WebViewControlUnviewableContentIdentifiedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlUnviewableContentIdentifiedEventArgs.WithDefault, IWinRTObject
    {
  private val __1838337903_Interface:
      IWebViewControlUnviewableContentIdentifiedEventArgs.WithDefault by lazy {
    as_1838337903()
  }


  public override val __1838337903_Ptr: JNAPointer? by lazy {
    __1838337903_Interface.__1838337903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1838337903_Interface)

  private fun as_1838337903(): IWebViewControlUnviewableContentIdentifiedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlUnviewableContentIdentifiedEventArgs.ABI.makeIWebViewControlUnviewableContentIdentifiedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlUnviewableContentIdentifiedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlUnviewableContentIdentifiedEventArgs.ABI.makeIWebViewControlUnviewableContentIdentifiedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlUnviewableContentIdentifiedEventArgs> {
    public override fun getValue() =
        WebViewControlUnviewableContentIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlUnviewableContentIdentifiedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlUnviewableContentIdentifiedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlUnviewableContentIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlUnviewableContentIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlUnviewableContentIdentifiedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
