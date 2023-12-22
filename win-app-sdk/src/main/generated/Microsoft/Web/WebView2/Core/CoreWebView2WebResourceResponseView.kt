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

@ABIMarker(CoreWebView2WebResourceResponseView.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WebResourceResponseView;{33ee060b-b578-5698-b541-fef87fe7fe72})")
@WinRTByReference(brClass = CoreWebView2WebResourceResponseView.ByReference::class)
public class CoreWebView2WebResourceResponseView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WebResourceResponseView.WithDefault, IWinRTObject {
  private val __2084942623_Interface: ICoreWebView2WebResourceResponseView.WithDefault by lazy {
    as_2084942623()
  }


  public override val __2084942623_Ptr: JNAPointer? by lazy {
    __2084942623_Interface.__2084942623_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2084942623_Interface)

  private fun as_2084942623(): ICoreWebView2WebResourceResponseView.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebResourceResponseView.ABI.makeICoreWebView2WebResourceResponseView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebResourceResponseView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebResourceResponseView.ABI.makeICoreWebView2WebResourceResponseView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WebResourceResponseView> {
    public override fun getValue() = CoreWebView2WebResourceResponseView(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WebResourceResponseView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WebResourceResponseView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2WebResourceResponseView {
      val address = segment.toRawLongValue()
      return CoreWebView2WebResourceResponseView(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WebResourceResponseView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
