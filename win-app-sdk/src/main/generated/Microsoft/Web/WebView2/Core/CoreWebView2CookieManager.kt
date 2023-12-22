package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2CookieManager.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2CookieManager;{9bcca0ea-7225-577a-bb23-c7c98023154e})")
@WinRTByReference(brClass = CoreWebView2CookieManager.ByReference::class)
public class CoreWebView2CookieManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2CookieManager_Manual.WithDefault,
    ICoreWebView2CookieManager.WithDefault, IWinRTObject {
  private val __438829789_Interface: ICoreWebView2CookieManager_Manual.WithDefault by lazy {
    as_438829789()
  }


  private val __426252706_Interface: ICoreWebView2CookieManager.WithDefault by lazy {
    as_426252706()
  }


  public override val __438829789_Ptr: JNAPointer? by lazy {
    __438829789_Interface.__438829789_Ptr
  }


  public override val __426252706_Ptr: JNAPointer? by lazy {
    __426252706_Interface.__426252706_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__438829789_Interface, __426252706_Interface)

  private fun as_438829789(): ICoreWebView2CookieManager_Manual.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CookieManager_Manual.ABI.makeICoreWebView2CookieManager_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CookieManager_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CookieManager_Manual.ABI.makeICoreWebView2CookieManager_Manual(ref.value))
  }

  private fun as_426252706(): ICoreWebView2CookieManager.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2CookieManager.ABI.makeICoreWebView2CookieManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2CookieManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2CookieManager.ABI.makeICoreWebView2CookieManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2CookieManager> {
    public override fun getValue() = CoreWebView2CookieManager(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2CookieManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2CookieManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2CookieManager {
      val address = segment.toRawLongValue()
      return CoreWebView2CookieManager(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2CookieManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
