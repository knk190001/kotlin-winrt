package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IWebView2Factory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebView2.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.WebView2;{2b2c76c2-997c-5069-a8f0-9b84cd7e624b})")
@WinRTByReference(brClass = WebView2.ByReference::class)
public open class WebView2(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IWebView2.WithDefault, IWinRTObject {
  private val __1022989824_Interface: IWebView2.WithDefault by lazy {
    as_1022989824()
  }


  public override val __1022989824_Ptr: JNAPointer? by lazy {
    __1022989824_Interface.__1022989824_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022989824_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1022989824(): IWebView2.WithDefault {
    if(pointer == NULL) {
      return(IWebView2.ABI.makeIWebView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView2.ABI.makeIWebView2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebView2> {
    public override fun getValue() = WebView2(pointer.getPointer(0))

    public fun setValue(value: WebView2): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebView2, MemoryAddress> {
    public val IWebView2Statics_Instance: IWebView2Statics by lazy {
      createIWebView2Statics()
    }


    public val IWebView2Factory_Instance: IWebView2Factory by lazy {
      createIWebView2Factory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebView2Statics(): IWebView2Statics {
      val refiid = Guid.REFIID(IWebView2Statics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.WebView2".toHandle(),refiid,interfacePtr)
      val result = IWebView2Statics.ABI.makeIWebView2Statics(interfacePtr.value)
      return result
    }

    public fun createIWebView2Factory(): IWebView2Factory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.WebView2".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebView2Factory.ABI.makeIWebView2Factory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IWebView2Factory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebView2 {
      val address = segment.toRawLongValue()
      return WebView2(Pointer(address))
    }

    public override fun toNative(obj: WebView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.IWebView2Statics_Instance.get_SourceProperty()

    public fun get_CanGoForwardProperty() = ABI.IWebView2Statics_Instance.get_CanGoForwardProperty()

    public fun get_CanGoBackProperty() = ABI.IWebView2Statics_Instance.get_CanGoBackProperty()

    public fun get_DefaultBackgroundColorProperty() =
        ABI.IWebView2Statics_Instance.get_DefaultBackgroundColorProperty()
  }
}
