package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.Automation.Peers.AutomationLiveSetting
import Windows.UI.Xaml.DependencyObject
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPropertiesStatics.ABI::class)
@Signature("{b618fd7b-32d0-4970-9c42-7c039ac7be78}")
@Guid("b618fd7b32d049709c427c039ac7be78")
@WinRTInterface("b618fd7b32d049709c427c039ac7be78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics.ByReference::class)
public interface IAutomationPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AcceleratorKeyProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetAcceleratorKey(element: DependencyObject?): String?

  @InterfaceMethod(2)
  public fun SetAcceleratorKey(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(3)
  public fun get_AccessKeyProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetAccessKey(element: DependencyObject?): String?

  @InterfaceMethod(5)
  public fun SetAccessKey(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(6)
  public fun get_AutomationIdProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetAutomationId(element: DependencyObject?): String?

  @InterfaceMethod(8)
  public fun SetAutomationId(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(9)
  public fun get_HelpTextProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetHelpText(element: DependencyObject?): String?

  @InterfaceMethod(11)
  public fun SetHelpText(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(12)
  public fun get_IsRequiredForFormProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetIsRequiredForForm(element: DependencyObject?): Boolean

  @InterfaceMethod(14)
  public fun SetIsRequiredForForm(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_ItemStatusProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun GetItemStatus(element: DependencyObject?): String?

  @InterfaceMethod(17)
  public fun SetItemStatus(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(18)
  public fun get_ItemTypeProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun GetItemType(element: DependencyObject?): String?

  @InterfaceMethod(20)
  public fun SetItemType(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(21)
  public fun get_LabeledByProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun GetLabeledBy(element: DependencyObject?): UIElement?

  @InterfaceMethod(23)
  public fun SetLabeledBy(element: DependencyObject?, value: UIElement?): Unit

  @InterfaceMethod(24)
  public fun get_NameProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun GetName(element: DependencyObject?): String?

  @InterfaceMethod(26)
  public fun SetName(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(27)
  public fun get_LiveSettingProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun GetLiveSetting(element: DependencyObject?): AutomationLiveSetting?

  @InterfaceMethod(29)
  public fun SetLiveSetting(element: DependencyObject?, value: AutomationLiveSetting?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics {
    public val __1954019904_Ptr: Pointer?

    public val _1954019904_VtblPtr: Pointer?
      get() = __1954019904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AcceleratorKeyProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAcceleratorKey(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetAcceleratorKey(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAccessKey(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetAccessKey(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AutomationIdProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetAutomationId(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetAutomationId(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_HelpTextProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetHelpText(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetHelpText(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsRequiredForFormProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetIsRequiredForForm(element: DependencyObject?): Boolean {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun SetIsRequiredForForm(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ItemStatusProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetItemStatus(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun SetItemStatus(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ItemTypeProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetItemType(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetItemType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_LabeledByProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetLabeledBy(element: DependencyObject?): UIElement? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun SetLabeledBy(element: DependencyObject?, value: UIElement?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_NameProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetName(element: DependencyObject?): String? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun SetName(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_LiveSettingProperty(): DependencyProperty? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetLiveSetting(element: DependencyObject?): AutomationLiveSetting? {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLiveSetting>()
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLiveSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun SetLiveSetting(element: DependencyObject?, value: AutomationLiveSetting?):
        Unit {
      val fnPtr = _1954019904_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1954019904_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1954019904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b618fd7b32d049709c427c039ac7be78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1954019904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics):
        Array<IAutomationPropertiesStatics?> = (elements as
        Array<IAutomationPropertiesStatics?>).castToImpl<IAutomationPropertiesStatics,IAutomationPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics?> =
        arrayOfNulls<IAutomationPropertiesStatics_Impl>(size) as
        Array<IAutomationPropertiesStatics?>
  }
}
