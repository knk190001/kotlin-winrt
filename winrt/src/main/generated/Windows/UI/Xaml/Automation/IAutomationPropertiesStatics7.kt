package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.Automation.Peers.AutomationHeadingLevel
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IAutomationPropertiesStatics7.ABI::class)
@Signature("{f7e98bf3-8f91-4068-a4ad-b7b402d10a2c}")
@Guid("f7e98bf38f914068a4adb7b402d10a2c")
@WinRTInterface("f7e98bf38f914068a4adb7b402d10a2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics7.ByReference::class)
public interface IAutomationPropertiesStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeadingLevelProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetHeadingLevel(element: DependencyObject?): AutomationHeadingLevel?

  @InterfaceMethod(2)
  public fun SetHeadingLevel(element: DependencyObject?, value: AutomationHeadingLevel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics7> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics7(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics7 {
    public val __445074935_Ptr: Pointer?

    public val _445074935_VtblPtr: Pointer?
      get() = __445074935_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeadingLevelProperty(): DependencyProperty? {
      val fnPtr = _445074935_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetHeadingLevel(element: DependencyObject?): AutomationHeadingLevel? {
      val fnPtr = _445074935_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__445074935_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetHeadingLevel(element: DependencyObject?, value: AutomationHeadingLevel?):
        Unit {
      val fnPtr = _445074935_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074935_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074935_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7e98bf38f914068a4adb7b402d10a2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics7(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics7 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics7(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074935_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics7):
        Array<IAutomationPropertiesStatics7?> = (elements as
        Array<IAutomationPropertiesStatics7?>).castToImpl<IAutomationPropertiesStatics7,IAutomationPropertiesStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics7?> =
        arrayOfNulls<IAutomationPropertiesStatics7_Impl>(size) as
        Array<IAutomationPropertiesStatics7?>
  }
}
