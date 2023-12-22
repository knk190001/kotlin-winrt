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

@ABIMarker(WebViewNavigationStartingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewNavigationStartingEventArgs;{94cb8668-8367-43d5-91bb-96eba37ec784})")
@WinRTByReference(brClass = WebViewNavigationStartingEventArgs.ByReference::class)
public class WebViewNavigationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewNavigationStartingEventArgs.WithDefault, IWinRTObject {
  private val __199673798_Interface: IWebViewNavigationStartingEventArgs.WithDefault by lazy {
    as_199673798()
  }


  public override val __199673798_Ptr: JNAPointer? by lazy {
    __199673798_Interface.__199673798_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__199673798_Interface)

  private fun as_199673798(): IWebViewNavigationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewNavigationStartingEventArgs.ABI.makeIWebViewNavigationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewNavigationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewNavigationStartingEventArgs.ABI.makeIWebViewNavigationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewNavigationStartingEventArgs> {
    public override fun getValue() = WebViewNavigationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewNavigationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewNavigationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewNavigationStartingEventArgs {
      val address = segment.toRawLongValue()
      return WebViewNavigationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewNavigationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
