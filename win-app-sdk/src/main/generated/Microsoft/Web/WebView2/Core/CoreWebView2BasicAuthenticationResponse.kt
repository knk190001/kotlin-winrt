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

@ABIMarker(CoreWebView2BasicAuthenticationResponse.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2BasicAuthenticationResponse;{08df33b9-6e38-5962-9ffd-caab3c30fbc1})")
@WinRTByReference(brClass = CoreWebView2BasicAuthenticationResponse.ByReference::class)
public class CoreWebView2BasicAuthenticationResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2BasicAuthenticationResponse.WithDefault, IWinRTObject {
  private val __1869150688_Interface: ICoreWebView2BasicAuthenticationResponse.WithDefault by lazy {
    as_1869150688()
  }


  public override val __1869150688_Ptr: JNAPointer? by lazy {
    __1869150688_Interface.__1869150688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1869150688_Interface)

  private fun as_1869150688(): ICoreWebView2BasicAuthenticationResponse.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2BasicAuthenticationResponse.ABI.makeICoreWebView2BasicAuthenticationResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2BasicAuthenticationResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2BasicAuthenticationResponse.ABI.makeICoreWebView2BasicAuthenticationResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2BasicAuthenticationResponse> {
    public override fun getValue() = CoreWebView2BasicAuthenticationResponse(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2BasicAuthenticationResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2BasicAuthenticationResponse, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2BasicAuthenticationResponse {
      val address = segment.toRawLongValue()
      return CoreWebView2BasicAuthenticationResponse(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2BasicAuthenticationResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
