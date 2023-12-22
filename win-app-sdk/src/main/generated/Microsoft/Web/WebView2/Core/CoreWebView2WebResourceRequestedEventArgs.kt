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

@ABIMarker(CoreWebView2WebResourceRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WebResourceRequestedEventArgs;{577f1fc4-c943-54a9-9700-bd469b48bd41})")
@WinRTByReference(brClass = CoreWebView2WebResourceRequestedEventArgs.ByReference::class)
public class CoreWebView2WebResourceRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WebResourceRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1984364772_Interface: ICoreWebView2WebResourceRequestedEventArgs.WithDefault by
      lazy {
    as_1984364772()
  }


  public override val __1984364772_Ptr: JNAPointer? by lazy {
    __1984364772_Interface.__1984364772_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1984364772_Interface)

  private fun as_1984364772(): ICoreWebView2WebResourceRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebResourceRequestedEventArgs.ABI.makeICoreWebView2WebResourceRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebResourceRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebResourceRequestedEventArgs.ABI.makeICoreWebView2WebResourceRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WebResourceRequestedEventArgs> {
    public override fun getValue() =
        CoreWebView2WebResourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WebResourceRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WebResourceRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2WebResourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2WebResourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WebResourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
