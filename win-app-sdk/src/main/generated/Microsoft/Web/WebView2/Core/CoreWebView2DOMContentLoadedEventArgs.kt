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

@ABIMarker(CoreWebView2DOMContentLoadedEventArgs.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2DOMContentLoadedEventArgs;{c474d0a3-24ac-59fc-b78b-da7562a6a052})")
@WinRTByReference(brClass = CoreWebView2DOMContentLoadedEventArgs.ByReference::class)
public class CoreWebView2DOMContentLoadedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2DOMContentLoadedEventArgs.WithDefault, IWinRTObject {
  private val __650618444_Interface: ICoreWebView2DOMContentLoadedEventArgs.WithDefault by lazy {
    as_650618444()
  }


  public override val __650618444_Ptr: JNAPointer? by lazy {
    __650618444_Interface.__650618444_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__650618444_Interface)

  private fun as_650618444(): ICoreWebView2DOMContentLoadedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2DOMContentLoadedEventArgs.ABI.makeICoreWebView2DOMContentLoadedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2DOMContentLoadedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2DOMContentLoadedEventArgs.ABI.makeICoreWebView2DOMContentLoadedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2DOMContentLoadedEventArgs> {
    public override fun getValue() = CoreWebView2DOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2DOMContentLoadedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2DOMContentLoadedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2DOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2DOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2DOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
