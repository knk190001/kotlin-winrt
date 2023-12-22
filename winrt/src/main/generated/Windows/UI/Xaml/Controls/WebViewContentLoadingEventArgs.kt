package Windows.UI.Xaml.Controls

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

@ABIMarker(WebViewContentLoadingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewContentLoadingEventArgs;{6e2980bb-98b8-413e-8129-971c6f7e4c8a})")
@WinRTByReference(brClass = WebViewContentLoadingEventArgs.ByReference::class)
public class WebViewContentLoadingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewContentLoadingEventArgs.WithDefault, IWinRTObject {
  private val __652575255_Interface: IWebViewContentLoadingEventArgs.WithDefault by lazy {
    as_652575255()
  }


  public override val __652575255_Ptr: JNAPointer? by lazy {
    __652575255_Interface.__652575255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__652575255_Interface)

  private fun as_652575255(): IWebViewContentLoadingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewContentLoadingEventArgs.ABI.makeIWebViewContentLoadingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewContentLoadingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewContentLoadingEventArgs.ABI.makeIWebViewContentLoadingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewContentLoadingEventArgs> {
    public override fun getValue() = WebViewContentLoadingEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewContentLoadingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewContentLoadingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewContentLoadingEventArgs {
      val address = segment.toRawLongValue()
      return WebViewContentLoadingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewContentLoadingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
