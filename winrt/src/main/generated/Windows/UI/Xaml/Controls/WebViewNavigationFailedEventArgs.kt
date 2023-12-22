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

@ABIMarker(WebViewNavigationFailedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewNavigationFailedEventArgs;{af09609a-129c-4170-9e9c-e2cdf025dca4})")
@WinRTByReference(brClass = WebViewNavigationFailedEventArgs.ByReference::class)
public class WebViewNavigationFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewNavigationFailedEventArgs.WithDefault, IWinRTObject {
  private val __1027254231_Interface: IWebViewNavigationFailedEventArgs.WithDefault by lazy {
    as_1027254231()
  }


  public override val __1027254231_Ptr: JNAPointer? by lazy {
    __1027254231_Interface.__1027254231_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1027254231_Interface)

  private fun as_1027254231(): IWebViewNavigationFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewNavigationFailedEventArgs.ABI.makeIWebViewNavigationFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewNavigationFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewNavigationFailedEventArgs.ABI.makeIWebViewNavigationFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewNavigationFailedEventArgs> {
    public override fun getValue() = WebViewNavigationFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewNavigationFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewNavigationFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewNavigationFailedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewNavigationFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewNavigationFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
