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

@ABIMarker(WebViewNavigationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewNavigationCompletedEventArgs;{11e6f20b-eba7-44c0-889b-edeb6a064ddd})")
@WinRTByReference(brClass = WebViewNavigationCompletedEventArgs.ByReference::class)
public class WebViewNavigationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewNavigationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __450153251_Interface: IWebViewNavigationCompletedEventArgs.WithDefault by lazy {
    as_450153251()
  }


  public override val __450153251_Ptr: JNAPointer? by lazy {
    __450153251_Interface.__450153251_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__450153251_Interface)

  private fun as_450153251(): IWebViewNavigationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewNavigationCompletedEventArgs.ABI.makeIWebViewNavigationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewNavigationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewNavigationCompletedEventArgs.ABI.makeIWebViewNavigationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewNavigationCompletedEventArgs> {
    public override fun getValue() = WebViewNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewNavigationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewNavigationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
