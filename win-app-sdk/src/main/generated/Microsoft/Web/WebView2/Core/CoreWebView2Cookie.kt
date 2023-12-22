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

@ABIMarker(CoreWebView2Cookie.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Cookie;{52f670fe-8ca2-5aad-aedb-25f7903b7038})")
@WinRTByReference(brClass = CoreWebView2Cookie.ByReference::class)
public class CoreWebView2Cookie(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2Cookie.WithDefault, IWinRTObject {
  private val __117798005_Interface: ICoreWebView2Cookie.WithDefault by lazy {
    as_117798005()
  }


  public override val __117798005_Ptr: JNAPointer? by lazy {
    __117798005_Interface.__117798005_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__117798005_Interface)

  private fun as_117798005(): ICoreWebView2Cookie.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Cookie.ABI.makeICoreWebView2Cookie(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Cookie>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Cookie.ABI.makeICoreWebView2Cookie(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Cookie> {
    public override fun getValue() = CoreWebView2Cookie(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Cookie): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Cookie, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Cookie {
      val address = segment.toRawLongValue()
      return CoreWebView2Cookie(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Cookie): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
