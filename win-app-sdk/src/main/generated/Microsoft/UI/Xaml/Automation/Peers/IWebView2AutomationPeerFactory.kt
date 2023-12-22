package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.WebView2
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView2AutomationPeerFactory.ABI::class)
@Signature("{68512210-e61e-5b56-a6af-c4fb14677155}")
@Guid("68512210e61e5b56a6afc4fb14677155")
@WinRTInterface("68512210e61e5b56a6afc4fb14677155")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView2AutomationPeerFactory.ByReference::class)
public interface IWebView2AutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: WebView2?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): WebView2AutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebView2AutomationPeerFactory> {
    public override fun getValue() = ABI.makeIWebView2AutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IWebView2AutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView2AutomationPeerFactory {
    public val __1709399925_Ptr: Pointer?

    public val _1709399925_VtblPtr: Pointer?
      get() = __1709399925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: WebView2?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): WebView2AutomationPeer? {
      val fnPtr = _1709399925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebView2AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1709399925_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebView2AutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IWebView2AutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1709399925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView2AutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68512210e61e5b56a6afc4fb14677155")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView2AutomationPeerFactory(ptr: Pointer?): WithDefault =
        IWebView2AutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView2AutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIWebView2AutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebView2AutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1709399925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView2AutomationPeerFactory):
        Array<IWebView2AutomationPeerFactory?> = (elements as
        Array<IWebView2AutomationPeerFactory?>).castToImpl<IWebView2AutomationPeerFactory,IWebView2AutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView2AutomationPeerFactory?> =
        arrayOfNulls<IWebView2AutomationPeerFactory_Impl>(size) as
        Array<IWebView2AutomationPeerFactory?>
  }
}
