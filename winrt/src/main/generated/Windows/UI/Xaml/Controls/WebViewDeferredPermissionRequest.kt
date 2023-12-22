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

@ABIMarker(WebViewDeferredPermissionRequest.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewDeferredPermissionRequest;{a3dcc461-7350-4d3a-8fb9-40eeec2746c2})")
@WinRTByReference(brClass = WebViewDeferredPermissionRequest.ByReference::class)
public class WebViewDeferredPermissionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewDeferredPermissionRequest.WithDefault, IWinRTObject {
  private val __1628846500_Interface: IWebViewDeferredPermissionRequest.WithDefault by lazy {
    as_1628846500()
  }


  public override val __1628846500_Ptr: JNAPointer? by lazy {
    __1628846500_Interface.__1628846500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1628846500_Interface)

  private fun as_1628846500(): IWebViewDeferredPermissionRequest.WithDefault {
    if(pointer == NULL) {
      return(IWebViewDeferredPermissionRequest.ABI.makeIWebViewDeferredPermissionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewDeferredPermissionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewDeferredPermissionRequest.ABI.makeIWebViewDeferredPermissionRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewDeferredPermissionRequest> {
    public override fun getValue() = WebViewDeferredPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: WebViewDeferredPermissionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewDeferredPermissionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewDeferredPermissionRequest {
      val address = segment.toRawLongValue()
      return WebViewDeferredPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: WebViewDeferredPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
