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

@ABIMarker(WebViewControlPermissionRequest.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlPermissionRequest;{e5bc836c-f22f-40e2-95b2-7729f840eb7f})")
@WinRTByReference(brClass = WebViewControlPermissionRequest.ByReference::class)
public class WebViewControlPermissionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlPermissionRequest.WithDefault, IWinRTObject {
  private val __1672945420_Interface: IWebViewControlPermissionRequest.WithDefault by lazy {
    as_1672945420()
  }


  public override val __1672945420_Ptr: JNAPointer? by lazy {
    __1672945420_Interface.__1672945420_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1672945420_Interface)

  private fun as_1672945420(): IWebViewControlPermissionRequest.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlPermissionRequest.ABI.makeIWebViewControlPermissionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlPermissionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlPermissionRequest.ABI.makeIWebViewControlPermissionRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlPermissionRequest> {
    public override fun getValue() = WebViewControlPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: WebViewControlPermissionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlPermissionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewControlPermissionRequest {
      val address = segment.toRawLongValue()
      return WebViewControlPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
