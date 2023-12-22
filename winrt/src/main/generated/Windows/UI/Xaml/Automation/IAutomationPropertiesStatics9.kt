package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.Automation.Peers.AutomationControlType
import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IAutomationPropertiesStatics9.ABI::class)
@Signature("{2f20b1d1-87b2-5562-8077-da593edafd2d}")
@Guid("2f20b1d187b255628077da593edafd2d")
@WinRTInterface("2f20b1d187b255628077da593edafd2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics9.ByReference::class)
public interface IAutomationPropertiesStatics9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutomationControlTypeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetAutomationControlType(element: UIElement?): AutomationControlType?

  @InterfaceMethod(2)
  public fun SetAutomationControlType(element: UIElement?, value: AutomationControlType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics9> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics9(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics9 {
    public val __445074937_Ptr: Pointer?

    public val _445074937_VtblPtr: Pointer?
      get() = __445074937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomationControlTypeProperty(): DependencyProperty? {
      val fnPtr = _445074937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAutomationControlType(element: UIElement?): AutomationControlType? {
      val fnPtr = _445074937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationControlType>()
      val hr = fn.invokeHR(arrayOf(__445074937_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationControlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetAutomationControlType(element: UIElement?,
        value: AutomationControlType?): Unit {
      val fnPtr = _445074937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074937_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f20b1d187b255628077da593edafd2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics9(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics9 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics9(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics9):
        Array<IAutomationPropertiesStatics9?> = (elements as
        Array<IAutomationPropertiesStatics9?>).castToImpl<IAutomationPropertiesStatics9,IAutomationPropertiesStatics9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics9?> =
        arrayOfNulls<IAutomationPropertiesStatics9_Impl>(size) as
        Array<IAutomationPropertiesStatics9?>
  }
}
