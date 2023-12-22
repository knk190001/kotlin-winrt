package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IFrameworkElementAutomationPeer.ABI::class)
@Signature("{7dab4f24-605c-51cb-87db-3eed1b9fb37b}")
@Guid("7dab4f24605c51cb87db3eed1b9fb37b")
@WinRTInterface("7dab4f24605c51cb87db3eed1b9fb37b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementAutomationPeer.ByReference::class)
public interface IFrameworkElementAutomationPeer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Owner(): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementAutomationPeer> {
    public override fun getValue() = ABI.makeIFrameworkElementAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementAutomationPeer {
    public val __733237254_Ptr: Pointer?

    public val _733237254_VtblPtr: Pointer?
      get() = __733237254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Owner(): UIElement? {
      val fnPtr = _733237254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__733237254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __733237254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7dab4f24605c51cb87db3eed1b9fb37b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementAutomationPeer(ptr: Pointer?): WithDefault =
        IFrameworkElementAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__733237254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementAutomationPeer):
        Array<IFrameworkElementAutomationPeer?> = (elements as
        Array<IFrameworkElementAutomationPeer?>).castToImpl<IFrameworkElementAutomationPeer,IFrameworkElementAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementAutomationPeer?> =
        arrayOfNulls<IFrameworkElementAutomationPeer_Impl>(size) as
        Array<IFrameworkElementAutomationPeer?>
  }
}
