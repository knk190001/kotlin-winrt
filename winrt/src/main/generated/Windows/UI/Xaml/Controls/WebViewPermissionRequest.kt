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

@ABIMarker(WebViewPermissionRequest.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewPermissionRequest;{17b76332-66c4-4131-999e-df7de20a8c9c})")
@WinRTByReference(brClass = WebViewPermissionRequest.ByReference::class)
public class WebViewPermissionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewPermissionRequest.WithDefault, IWinRTObject {
  private val __601676483_Interface: IWebViewPermissionRequest.WithDefault by lazy {
    as_601676483()
  }


  public override val __601676483_Ptr: JNAPointer? by lazy {
    __601676483_Interface.__601676483_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__601676483_Interface)

  private fun as_601676483(): IWebViewPermissionRequest.WithDefault {
    if(pointer == NULL) {
      return(IWebViewPermissionRequest.ABI.makeIWebViewPermissionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewPermissionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewPermissionRequest.ABI.makeIWebViewPermissionRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewPermissionRequest> {
    public override fun getValue() = WebViewPermissionRequest(pointer.getPointer(0))

    public fun setValue(value: WebViewPermissionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewPermissionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewPermissionRequest {
      val address = segment.toRawLongValue()
      return WebViewPermissionRequest(Pointer(address))
    }

    public override fun toNative(obj: WebViewPermissionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
