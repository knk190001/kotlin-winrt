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

@ABIMarker(CoreWebView2ClientCertificate.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ClientCertificate;{faefefc2-20c3-5d86-8a74-f6d87d6ff8fa})")
@WinRTByReference(brClass = CoreWebView2ClientCertificate.ByReference::class)
public class CoreWebView2ClientCertificate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), CoreWebView2ClientCertificate_Manual.WithDefault,
    ICoreWebView2ClientCertificate.WithDefault, IWinRTObject {
  private val __50090187_Interface: CoreWebView2ClientCertificate_Manual.WithDefault by lazy {
    as_50090187()
  }


  private val __297355589_Interface: ICoreWebView2ClientCertificate.WithDefault by lazy {
    as_297355589()
  }


  public override val __50090187_Ptr: JNAPointer? by lazy {
    __50090187_Interface.__50090187_Ptr
  }


  public override val __297355589_Ptr: JNAPointer? by lazy {
    __297355589_Interface.__297355589_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__50090187_Interface, __297355589_Interface)

  private fun as_50090187(): CoreWebView2ClientCertificate_Manual.WithDefault {
    if(pointer == NULL) {
      return(CoreWebView2ClientCertificate_Manual.ABI.makeCoreWebView2ClientCertificate_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<CoreWebView2ClientCertificate_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(CoreWebView2ClientCertificate_Manual.ABI.makeCoreWebView2ClientCertificate_Manual(ref.value))
  }

  private fun as_297355589(): ICoreWebView2ClientCertificate.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ClientCertificate.ABI.makeICoreWebView2ClientCertificate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ClientCertificate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ClientCertificate.ABI.makeICoreWebView2ClientCertificate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ClientCertificate> {
    public override fun getValue() = CoreWebView2ClientCertificate(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ClientCertificate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ClientCertificate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2ClientCertificate {
      val address = segment.toRawLongValue()
      return CoreWebView2ClientCertificate(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ClientCertificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
