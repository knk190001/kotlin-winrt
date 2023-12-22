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

@ABIMarker(CoreWebView2WebResourceResponseReceivedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2WebResourceResponseReceivedEventArgs;{12424671-9711-54f4-bcdf-5f307add6ec2})")
@WinRTByReference(brClass = CoreWebView2WebResourceResponseReceivedEventArgs.ByReference::class)
public class CoreWebView2WebResourceResponseReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2WebResourceResponseReceivedEventArgs.WithDefault, IWinRTObject {
  private val __605745926_Interface: ICoreWebView2WebResourceResponseReceivedEventArgs.WithDefault
      by lazy {
    as_605745926()
  }


  public override val __605745926_Ptr: JNAPointer? by lazy {
    __605745926_Interface.__605745926_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__605745926_Interface)

  private fun as_605745926(): ICoreWebView2WebResourceResponseReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2WebResourceResponseReceivedEventArgs.ABI.makeICoreWebView2WebResourceResponseReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2WebResourceResponseReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2WebResourceResponseReceivedEventArgs.ABI.makeICoreWebView2WebResourceResponseReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2WebResourceResponseReceivedEventArgs> {
    public override fun getValue() =
        CoreWebView2WebResourceResponseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2WebResourceResponseReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2WebResourceResponseReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreWebView2WebResourceResponseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2WebResourceResponseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2WebResourceResponseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
