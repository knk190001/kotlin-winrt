package Windows.Web.UI.Interop

import Windows.Web.UI.IWebViewControl
import Windows.Web.UI.IWebViewControl2
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

@ABIMarker(WebViewControl.ABI::class)
@Signature("rc(Windows.Web.UI.Interop.WebViewControl;{3f921316-bc70-4bda-9136-c94370899fab})")
@WinRTByReference(brClass = WebViewControl.ByReference::class)
public class WebViewControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControl.WithDefault, IWebViewControlSite.WithDefault,
    IWebViewControl2.WithDefault, IWebViewControlSite2.WithDefault, IWinRTObject {
  private val __66234092_Interface: IWebViewControl.WithDefault by lazy {
    as_66234092()
  }


  private val __1834777748_Interface: IWebViewControlSite.WithDefault by lazy {
    as_1834777748()
  }


  private val __2053256802_Interface: IWebViewControl2.WithDefault by lazy {
    as_2053256802()
  }


  private val __1043535290_Interface: IWebViewControlSite2.WithDefault by lazy {
    as_1043535290()
  }


  public override val __66234092_Ptr: JNAPointer? by lazy {
    __66234092_Interface.__66234092_Ptr
  }


  public override val __1834777748_Ptr: JNAPointer? by lazy {
    __1834777748_Interface.__1834777748_Ptr
  }


  public override val __2053256802_Ptr: JNAPointer? by lazy {
    __2053256802_Interface.__2053256802_Ptr
  }


  public override val __1043535290_Ptr: JNAPointer? by lazy {
    __1043535290_Interface.__1043535290_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__66234092_Interface, __1834777748_Interface, __2053256802_Interface,
        __1043535290_Interface)

  private fun as_66234092(): IWebViewControl.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControl.ABI.makeIWebViewControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControl.ABI.makeIWebViewControl(ref.value))
  }

  private fun as_1834777748(): IWebViewControlSite.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlSite.ABI.makeIWebViewControlSite(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlSite>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlSite.ABI.makeIWebViewControlSite(ref.value))
  }

  private fun as_2053256802(): IWebViewControl2.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControl2.ABI.makeIWebViewControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControl2.ABI.makeIWebViewControl2(ref.value))
  }

  private fun as_1043535290(): IWebViewControlSite2.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlSite2.ABI.makeIWebViewControlSite2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlSite2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlSite2.ABI.makeIWebViewControlSite2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebViewControl>
      {
    public override fun getValue() = WebViewControl(pointer.getPointer(0))

    public fun setValue(value: WebViewControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewControl {
      val address = segment.toRawLongValue()
      return WebViewControl(Pointer(address))
    }

    public override fun toNative(obj: WebViewControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
