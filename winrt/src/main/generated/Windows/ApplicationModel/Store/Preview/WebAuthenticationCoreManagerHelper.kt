package Windows.ApplicationModel.Store.Preview

import Windows.Security.Authentication.Web.Core.WebTokenRequest
import Windows.Security.Credentials.WebAccount
import Windows.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(WebAuthenticationCoreManagerHelper.ABI::class)
@WinRTByReference(brClass = WebAuthenticationCoreManagerHelper.ByReference::class)
public class WebAuthenticationCoreManagerHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAuthenticationCoreManagerHelper> {
    public override fun getValue() = WebAuthenticationCoreManagerHelper(pointer.getPointer(0))

    public fun setValue(value: WebAuthenticationCoreManagerHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAuthenticationCoreManagerHelper, MemoryAddress> {
    public val IWebAuthenticationCoreManagerHelper_Instance: IWebAuthenticationCoreManagerHelper by
        lazy {
      createIWebAuthenticationCoreManagerHelper()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAuthenticationCoreManagerHelper(): IWebAuthenticationCoreManagerHelper {
      val refiid = Guid.REFIID(IWebAuthenticationCoreManagerHelper.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.WebAuthenticationCoreManagerHelper".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationCoreManagerHelper.ABI.makeIWebAuthenticationCoreManagerHelper(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebAuthenticationCoreManagerHelper {
      val address = segment.toRawLongValue()
      return WebAuthenticationCoreManagerHelper(Pointer(address))
    }

    public override fun toNative(obj: WebAuthenticationCoreManagerHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestTokenWithUIElementHostingAsync(request: WebTokenRequest, uiElement: UIElement)
        =
        ABI.IWebAuthenticationCoreManagerHelper_Instance.RequestTokenWithUIElementHostingAsync(request,
        uiElement)

    public fun RequestTokenWithUIElementHostingAsync(
      request: WebTokenRequest,
      webAccount: WebAccount,
      uiElement: UIElement
    ) =
        ABI.IWebAuthenticationCoreManagerHelper_Instance.RequestTokenWithUIElementHostingAsync(request,
        webAccount, uiElement)
  }
}
