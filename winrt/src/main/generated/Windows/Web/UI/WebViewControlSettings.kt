package Windows.Web.UI

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

@ABIMarker(WebViewControlSettings.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlSettings;{c9967fbf-5e98-4cfd-8cce-27b0911e3de8})")
@WinRTByReference(brClass = WebViewControlSettings.ByReference::class)
public class WebViewControlSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlSettings.WithDefault, IWinRTObject {
  private val __1482302807_Interface: IWebViewControlSettings.WithDefault by lazy {
    as_1482302807()
  }


  public override val __1482302807_Ptr: JNAPointer? by lazy {
    __1482302807_Interface.__1482302807_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1482302807_Interface)

  private fun as_1482302807(): IWebViewControlSettings.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlSettings.ABI.makeIWebViewControlSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlSettings.ABI.makeIWebViewControlSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlSettings> {
    public override fun getValue() = WebViewControlSettings(pointer.getPointer(0))

    public fun setValue(value: WebViewControlSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewControlSettings {
      val address = segment.toRawLongValue()
      return WebViewControlSettings(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
