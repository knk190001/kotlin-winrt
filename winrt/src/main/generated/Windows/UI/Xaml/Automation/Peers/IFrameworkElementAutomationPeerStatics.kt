package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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

@ABIMarker(IFrameworkElementAutomationPeerStatics.ABI::class)
@Signature("{b9c0b997-2820-44a1-a5a8-9b801edc269e}")
@Guid("b9c0b997282044a1a5a89b801edc269e")
@WinRTInterface("b9c0b997282044a1a5a89b801edc269e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementAutomationPeerStatics.ByReference::class)
public interface IFrameworkElementAutomationPeerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromElement(element: UIElement?): AutomationPeer?

  @InterfaceMethod(1)
  public fun CreatePeerForElement(element: UIElement?): AutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementAutomationPeerStatics> {
    public override fun getValue() =
        ABI.makeIFrameworkElementAutomationPeerStatics(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementAutomationPeerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementAutomationPeerStatics {
    public val __841608650_Ptr: Pointer?

    public val _841608650_VtblPtr: Pointer?
      get() = __841608650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromElement(element: UIElement?): AutomationPeer? {
      val fnPtr = _841608650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__841608650_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreatePeerForElement(element: UIElement?): AutomationPeer? {
      val fnPtr = _841608650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__841608650_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementAutomationPeerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __841608650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementAutomationPeerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c0b997282044a1a5a89b801edc269e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementAutomationPeerStatics(ptr: Pointer?): WithDefault =
        IFrameworkElementAutomationPeerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementAutomationPeerStatics {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementAutomationPeerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementAutomationPeerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__841608650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementAutomationPeerStatics):
        Array<IFrameworkElementAutomationPeerStatics?> = (elements as
        Array<IFrameworkElementAutomationPeerStatics?>).castToImpl<IFrameworkElementAutomationPeerStatics,IFrameworkElementAutomationPeerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementAutomationPeerStatics?> =
        arrayOfNulls<IFrameworkElementAutomationPeerStatics_Impl>(size) as
        Array<IFrameworkElementAutomationPeerStatics?>
  }
}
