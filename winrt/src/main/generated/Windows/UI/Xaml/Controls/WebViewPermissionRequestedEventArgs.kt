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

@ABIMarker(WebViewPermissionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewPermissionRequestedEventArgs;{dadecfd0-6e1e-473f-b0be-b02404d6a86d})")
@WinRTByReference(brClass = WebViewPermissionRequestedEventArgs.ByReference::class)
public class WebViewPermissionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewPermissionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __503607787_Interface: IWebViewPermissionRequestedEventArgs.WithDefault by lazy {
    as_503607787()
  }


  public override val __503607787_Ptr: JNAPointer? by lazy {
    __503607787_Interface.__503607787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__503607787_Interface)

  private fun as_503607787(): IWebViewPermissionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewPermissionRequestedEventArgs.ABI.makeIWebViewPermissionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewPermissionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewPermissionRequestedEventArgs.ABI.makeIWebViewPermissionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewPermissionRequestedEventArgs> {
    public override fun getValue() = WebViewPermissionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewPermissionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewPermissionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewPermissionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewPermissionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewPermissionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
