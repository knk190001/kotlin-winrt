package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Automation.Peers.AutomationControlType
import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ICommandBarFlyoutCommandBarAutomationPropertiesStatics.ABI::class)
@Signature("{c9957f75-c57f-5ba3-b867-f9d86b1d90b9}")
@Guid("c9957f75c57f5ba3b867f9d86b1d90b9")
@WinRTInterface("c9957f75c57f5ba3b867f9d86b1d90b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ICommandBarFlyoutCommandBarAutomationPropertiesStatics.ByReference::class)
public interface ICommandBarFlyoutCommandBarAutomationPropertiesStatics : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ControlTypeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetControlType(element: UIElement?): AutomationControlType?

  @InterfaceMethod(2)
  public fun SetControlType(element: UIElement?, value: AutomationControlType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBarAutomationPropertiesStatics> {
    public override fun getValue() =
        ABI.makeICommandBarFlyoutCommandBarAutomationPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBarAutomationPropertiesStatics {
    public val __864839169_Ptr: Pointer?

    public val _864839169_VtblPtr: Pointer?
      get() = __864839169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlTypeProperty(): DependencyProperty? {
      val fnPtr = _864839169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__864839169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetControlType(element: UIElement?): AutomationControlType? {
      val fnPtr = _864839169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationControlType>()
      val hr = fn.invokeHR(arrayOf(__864839169_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationControlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetControlType(element: UIElement?, value: AutomationControlType?): Unit {
      val fnPtr = _864839169_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__864839169_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __864839169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBarAutomationPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9957f75c57f5ba3b867f9d86b1d90b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBarAutomationPropertiesStatics(ptr: Pointer?):
        WithDefault = ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICommandBarFlyoutCommandBarAutomationPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBarAutomationPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBarAutomationPropertiesStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__864839169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBarAutomationPropertiesStatics):
        Array<ICommandBarFlyoutCommandBarAutomationPropertiesStatics?> = (elements as
        Array<ICommandBarFlyoutCommandBarAutomationPropertiesStatics?>).castToImpl<ICommandBarFlyoutCommandBarAutomationPropertiesStatics,ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICommandBarFlyoutCommandBarAutomationPropertiesStatics?> =
        arrayOfNulls<ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Impl>(size) as
        Array<ICommandBarFlyoutCommandBarAutomationPropertiesStatics?>
  }
}
