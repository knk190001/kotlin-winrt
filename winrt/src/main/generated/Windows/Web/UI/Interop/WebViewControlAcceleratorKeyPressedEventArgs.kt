package Windows.Web.UI.Interop

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

@ABIMarker(WebViewControlAcceleratorKeyPressedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.Interop.WebViewControlAcceleratorKeyPressedEventArgs;{77a2a53e-7c74-437d-a290-3ac0d8cd5655})")
@WinRTByReference(brClass = WebViewControlAcceleratorKeyPressedEventArgs.ByReference::class)
public class WebViewControlAcceleratorKeyPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlAcceleratorKeyPressedEventArgs.WithDefault, IWinRTObject {
  private val __73754766_Interface: IWebViewControlAcceleratorKeyPressedEventArgs.WithDefault by
      lazy {
    as_73754766()
  }


  public override val __73754766_Ptr: JNAPointer? by lazy {
    __73754766_Interface.__73754766_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__73754766_Interface)

  private fun as_73754766(): IWebViewControlAcceleratorKeyPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlAcceleratorKeyPressedEventArgs.ABI.makeIWebViewControlAcceleratorKeyPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlAcceleratorKeyPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlAcceleratorKeyPressedEventArgs.ABI.makeIWebViewControlAcceleratorKeyPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlAcceleratorKeyPressedEventArgs> {
    public override fun getValue() =
        WebViewControlAcceleratorKeyPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlAcceleratorKeyPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlAcceleratorKeyPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlAcceleratorKeyPressedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlAcceleratorKeyPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlAcceleratorKeyPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
