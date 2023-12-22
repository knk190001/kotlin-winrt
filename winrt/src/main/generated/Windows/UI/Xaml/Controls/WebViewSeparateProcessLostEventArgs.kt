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

@ABIMarker(WebViewSeparateProcessLostEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewSeparateProcessLostEventArgs;{a405700a-c482-40b5-aaea-e10cfa9f5abe})")
@WinRTByReference(brClass = WebViewSeparateProcessLostEventArgs.ByReference::class)
public class WebViewSeparateProcessLostEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewSeparateProcessLostEventArgs.WithDefault, IWinRTObject {
  private val __1152214148_Interface: IWebViewSeparateProcessLostEventArgs.WithDefault by lazy {
    as_1152214148()
  }


  public override val __1152214148_Ptr: JNAPointer? by lazy {
    __1152214148_Interface.__1152214148_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1152214148_Interface)

  private fun as_1152214148(): IWebViewSeparateProcessLostEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewSeparateProcessLostEventArgs.ABI.makeIWebViewSeparateProcessLostEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewSeparateProcessLostEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewSeparateProcessLostEventArgs.ABI.makeIWebViewSeparateProcessLostEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewSeparateProcessLostEventArgs> {
    public override fun getValue() = WebViewSeparateProcessLostEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewSeparateProcessLostEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewSeparateProcessLostEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewSeparateProcessLostEventArgs {
      val address = segment.toRawLongValue()
      return WebViewSeparateProcessLostEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewSeparateProcessLostEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
