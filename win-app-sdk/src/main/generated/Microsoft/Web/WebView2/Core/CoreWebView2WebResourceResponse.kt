package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2WebResourceResponse.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WebResourceResponse;{14621923-e485-5f44-8f5d-bd4243bc398f})")
@WinRTByReference(brClass = CoreWebView2WebResourceResponse.ByReference::class)
public class CoreWebView2WebResourceResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WebResourceResponse.WithDefault, IWinRTObject {
  private val __1466764316_Interface: ICoreWebView2WebResourceResponse.WithDefault by lazy {
    as_1466764316()
  }


  public override val __1466764316_Ptr: JNAPointer? by lazy {
    __1466764316_Interface.__1466764316_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1466764316_Interface)

  private fun as_1466764316(): ICoreWebView2WebResourceResponse.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebResourceResponse.ABI.makeICoreWebView2WebResourceResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebResourceResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebResourceResponse.ABI.makeICoreWebView2WebResourceResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WebResourceResponse> {
    public override fun getValue() = CoreWebView2WebResourceResponse(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WebResourceResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WebResourceResponse, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2WebResourceResponse {
      val address = segment.toRawLongValue()
      return CoreWebView2WebResourceResponse(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WebResourceResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
