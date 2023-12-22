package Microsoft.UI.Xaml.Automation.Peers

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView2AutomationPeer.ABI::class)
@Signature("{8e556eca-b000-5e51-810f-7b7d80c39d56}")
@Guid("8e556ecab0005e51810f7b7d80c39d56")
@WinRTInterface("8e556ecab0005e51810f7b7d80c39d56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView2AutomationPeer.ByReference::class)
public interface IWebView2AutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebView2AutomationPeer> {
    public override fun getValue() = ABI.makeIWebView2AutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IWebView2AutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView2AutomationPeer {
    public val __1536286677_Ptr: Pointer?

    public val _1536286677_VtblPtr: Pointer?
      get() = __1536286677_Ptr?.getPointer(0)
  }

  public class IWebView2AutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1536286677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView2AutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e556ecab0005e51810f7b7d80c39d56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView2AutomationPeer(ptr: Pointer?): WithDefault =
        IWebView2AutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView2AutomationPeer {
      val address = segment.toRawLongValue()
      return makeIWebView2AutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IWebView2AutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1536286677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView2AutomationPeer): Array<IWebView2AutomationPeer?>
        = (elements as
        Array<IWebView2AutomationPeer?>).castToImpl<IWebView2AutomationPeer,IWebView2AutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView2AutomationPeer?> =
        arrayOfNulls<IWebView2AutomationPeer_Impl>(size) as Array<IWebView2AutomationPeer?>
  }
}
