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

@ABIMarker(CoreWebView2ClientCertificateRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ClientCertificateRequestedEventArgs;{93287b55-31f9-55a0-b68b-d9841d7e1bf4})")
@WinRTByReference(brClass = CoreWebView2ClientCertificateRequestedEventArgs.ByReference::class)
public class CoreWebView2ClientCertificateRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ClientCertificateRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1220410606_Interface: ICoreWebView2ClientCertificateRequestedEventArgs.WithDefault
      by lazy {
    as_1220410606()
  }


  public override val __1220410606_Ptr: JNAPointer? by lazy {
    __1220410606_Interface.__1220410606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1220410606_Interface)

  private fun as_1220410606(): ICoreWebView2ClientCertificateRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ClientCertificateRequestedEventArgs.ABI.makeICoreWebView2ClientCertificateRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ClientCertificateRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ClientCertificateRequestedEventArgs.ABI.makeICoreWebView2ClientCertificateRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ClientCertificateRequestedEventArgs> {
    public override fun getValue() =
        CoreWebView2ClientCertificateRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ClientCertificateRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ClientCertificateRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2ClientCertificateRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2ClientCertificateRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ClientCertificateRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
