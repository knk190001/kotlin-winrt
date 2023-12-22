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

@ABIMarker(CoreWebView2ServerCertificateErrorDetectedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ServerCertificateErrorDetectedEventArgs;{90fdc703-5a9e-56f6-a422-7c114c736420})")
@WinRTByReference(brClass = CoreWebView2ServerCertificateErrorDetectedEventArgs.ByReference::class)
public class CoreWebView2ServerCertificateErrorDetectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ServerCertificateErrorDetectedEventArgs.WithDefault, IWinRTObject
    {
  private val __1004901318_Interface:
      ICoreWebView2ServerCertificateErrorDetectedEventArgs.WithDefault by lazy {
    as_1004901318()
  }


  public override val __1004901318_Ptr: JNAPointer? by lazy {
    __1004901318_Interface.__1004901318_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1004901318_Interface)

  private fun as_1004901318(): ICoreWebView2ServerCertificateErrorDetectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ServerCertificateErrorDetectedEventArgs.ABI.makeICoreWebView2ServerCertificateErrorDetectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ServerCertificateErrorDetectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ServerCertificateErrorDetectedEventArgs.ABI.makeICoreWebView2ServerCertificateErrorDetectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ServerCertificateErrorDetectedEventArgs> {
    public override fun getValue() =
        CoreWebView2ServerCertificateErrorDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ServerCertificateErrorDetectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ServerCertificateErrorDetectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2ServerCertificateErrorDetectedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2ServerCertificateErrorDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ServerCertificateErrorDetectedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
