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

@ABIMarker(WebViewControlNewWindowRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Web.UI.WebViewControlNewWindowRequestedEventArgs;{3df44bbb-a124-46d5-a083-d02cacdff5ad})")
@WinRTByReference(brClass = WebViewControlNewWindowRequestedEventArgs.ByReference::class)
public class WebViewControlNewWindowRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlNewWindowRequestedEventArgs.WithDefault,
    IWebViewControlNewWindowRequestedEventArgs2.WithDefault, IWinRTObject {
  private val __1484141851_Interface: IWebViewControlNewWindowRequestedEventArgs.WithDefault by
      lazy {
    as_1484141851()
  }


  private val __1236242925_Interface: IWebViewControlNewWindowRequestedEventArgs2.WithDefault by
      lazy {
    as_1236242925()
  }


  public override val __1484141851_Ptr: JNAPointer? by lazy {
    __1484141851_Interface.__1484141851_Ptr
  }


  public override val __1236242925_Ptr: JNAPointer? by lazy {
    __1236242925_Interface.__1236242925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1484141851_Interface, __1236242925_Interface)

  private fun as_1484141851(): IWebViewControlNewWindowRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlNewWindowRequestedEventArgs.ABI.makeIWebViewControlNewWindowRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlNewWindowRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlNewWindowRequestedEventArgs.ABI.makeIWebViewControlNewWindowRequestedEventArgs(ref.value))
  }

  private fun as_1236242925(): IWebViewControlNewWindowRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlNewWindowRequestedEventArgs2.ABI.makeIWebViewControlNewWindowRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlNewWindowRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlNewWindowRequestedEventArgs2.ABI.makeIWebViewControlNewWindowRequestedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlNewWindowRequestedEventArgs> {
    public override fun getValue() =
        WebViewControlNewWindowRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewControlNewWindowRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlNewWindowRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebViewControlNewWindowRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewControlNewWindowRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlNewWindowRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
