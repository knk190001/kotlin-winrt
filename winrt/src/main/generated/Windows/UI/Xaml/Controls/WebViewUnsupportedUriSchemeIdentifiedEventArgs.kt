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

@ABIMarker(WebViewUnsupportedUriSchemeIdentifiedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewUnsupportedUriSchemeIdentifiedEventArgs;{b9c9e1a7-620f-4895-935d-10fbac6fd29e})")
@WinRTByReference(brClass = WebViewUnsupportedUriSchemeIdentifiedEventArgs.ByReference::class)
public class WebViewUnsupportedUriSchemeIdentifiedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewUnsupportedUriSchemeIdentifiedEventArgs.WithDefault, IWinRTObject {
  private val __1536504803_Interface: IWebViewUnsupportedUriSchemeIdentifiedEventArgs.WithDefault by
      lazy {
    as_1536504803()
  }


  public override val __1536504803_Ptr: JNAPointer? by lazy {
    __1536504803_Interface.__1536504803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536504803_Interface)

  private fun as_1536504803(): IWebViewUnsupportedUriSchemeIdentifiedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewUnsupportedUriSchemeIdentifiedEventArgs.ABI.makeIWebViewUnsupportedUriSchemeIdentifiedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewUnsupportedUriSchemeIdentifiedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewUnsupportedUriSchemeIdentifiedEventArgs.ABI.makeIWebViewUnsupportedUriSchemeIdentifiedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewUnsupportedUriSchemeIdentifiedEventArgs> {
    public override fun getValue() =
        WebViewUnsupportedUriSchemeIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewUnsupportedUriSchemeIdentifiedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewUnsupportedUriSchemeIdentifiedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewUnsupportedUriSchemeIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewUnsupportedUriSchemeIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewUnsupportedUriSchemeIdentifiedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
