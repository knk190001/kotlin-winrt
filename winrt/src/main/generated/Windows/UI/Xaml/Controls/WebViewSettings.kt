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

@ABIMarker(WebViewSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewSettings;{1d50ad4d-abf6-4785-8df3-fdebc1270301})")
@WinRTByReference(brClass = WebViewSettings.ByReference::class)
public class WebViewSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewSettings.WithDefault, IWinRTObject {
  private val __935006144_Interface: IWebViewSettings.WithDefault by lazy {
    as_935006144()
  }


  public override val __935006144_Ptr: JNAPointer? by lazy {
    __935006144_Interface.__935006144_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__935006144_Interface)

  private fun as_935006144(): IWebViewSettings.WithDefault {
    if(pointer == NULL) {
      return(IWebViewSettings.ABI.makeIWebViewSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewSettings.ABI.makeIWebViewSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewSettings> {
    public override fun getValue() = WebViewSettings(pointer.getPointer(0))

    public fun setValue(value: WebViewSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewSettings {
      val address = segment.toRawLongValue()
      return WebViewSettings(Pointer(address))
    }

    public override fun toNative(obj: WebViewSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
