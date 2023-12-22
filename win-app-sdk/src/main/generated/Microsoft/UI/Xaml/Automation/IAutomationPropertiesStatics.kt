package Microsoft.UI.Xaml.Automation

import Microsoft.UI.Xaml.Automation.Peers.AccessibilityView
import Microsoft.UI.Xaml.Automation.Peers.AutomationHeadingLevel
import Microsoft.UI.Xaml.Automation.Peers.AutomationLandmarkType
import Microsoft.UI.Xaml.Automation.Peers.AutomationLiveSetting
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVector
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
@Signature("{b1e3e0f3-112f-5966-87dc-7862d4ad50e5}")
@Guid("b1e3e0f3112f596687dc7862d4ad50e5")
@WinRTInterface("b1e3e0f3112f596687dc7862d4ad50e5")
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

  @InterfaceMethod(30)
  public fun get_AccessibilityViewProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun GetAccessibilityView(element: DependencyObject?): AccessibilityView?

  @InterfaceMethod(32)
  public fun SetAccessibilityView(element: DependencyObject?, value: AccessibilityView?): Unit

  @InterfaceMethod(33)
  public fun get_ControlledPeersProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun GetControlledPeers(element: DependencyObject?): IVector<UIElement?>?

  @InterfaceMethod(35)
  public fun get_PositionInSetProperty(): DependencyProperty?

  @InterfaceMethod(36)
  public fun GetPositionInSet(element: DependencyObject?): Int

  @InterfaceMethod(37)
  public fun SetPositionInSet(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(38)
  public fun get_SizeOfSetProperty(): DependencyProperty?

  @InterfaceMethod(39)
  public fun GetSizeOfSet(element: DependencyObject?): Int

  @InterfaceMethod(40)
  public fun SetSizeOfSet(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(41)
  public fun get_LevelProperty(): DependencyProperty?

  @InterfaceMethod(42)
  public fun GetLevel(element: DependencyObject?): Int

  @InterfaceMethod(43)
  public fun SetLevel(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(44)
  public fun get_AnnotationsProperty(): DependencyProperty?

  @InterfaceMethod(45)
  public fun GetAnnotations(element: DependencyObject?): IVector<AutomationAnnotation?>?

  @InterfaceMethod(46)
  public fun get_LandmarkTypeProperty(): DependencyProperty?

  @InterfaceMethod(47)
  public fun GetLandmarkType(element: DependencyObject?): AutomationLandmarkType?

  @InterfaceMethod(48)
  public fun SetLandmarkType(element: DependencyObject?, value: AutomationLandmarkType?): Unit

  @InterfaceMethod(49)
  public fun get_LocalizedLandmarkTypeProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun GetLocalizedLandmarkType(element: DependencyObject?): String?

  @InterfaceMethod(51)
  public fun SetLocalizedLandmarkType(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(52)
  public fun get_IsPeripheralProperty(): DependencyProperty?

  @InterfaceMethod(53)
  public fun GetIsPeripheral(element: DependencyObject?): Boolean

  @InterfaceMethod(54)
  public fun SetIsPeripheral(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(55)
  public fun get_IsDataValidForFormProperty(): DependencyProperty?

  @InterfaceMethod(56)
  public fun GetIsDataValidForForm(element: DependencyObject?): Boolean

  @InterfaceMethod(57)
  public fun SetIsDataValidForForm(element: DependencyObject?, value: Boolean): Unit

  @InterfaceMethod(58)
  public fun get_FullDescriptionProperty(): DependencyProperty?

  @InterfaceMethod(59)
  public fun GetFullDescription(element: DependencyObject?): String?

  @InterfaceMethod(60)
  public fun SetFullDescription(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(61)
  public fun get_LocalizedControlTypeProperty(): DependencyProperty?

  @InterfaceMethod(62)
  public fun GetLocalizedControlType(element: DependencyObject?): String?

  @InterfaceMethod(63)
  public fun SetLocalizedControlType(element: DependencyObject?, value: String?): Unit

  @InterfaceMethod(64)
  public fun get_DescribedByProperty(): DependencyProperty?

  @InterfaceMethod(65)
  public fun GetDescribedBy(element: DependencyObject?): IVector<DependencyObject?>?

  @InterfaceMethod(66)
  public fun get_FlowsToProperty(): DependencyProperty?

  @InterfaceMethod(67)
  public fun GetFlowsTo(element: DependencyObject?): IVector<DependencyObject?>?

  @InterfaceMethod(68)
  public fun get_FlowsFromProperty(): DependencyProperty?

  @InterfaceMethod(69)
  public fun GetFlowsFrom(element: DependencyObject?): IVector<DependencyObject?>?

  @InterfaceMethod(70)
  public fun get_CultureProperty(): DependencyProperty?

  @InterfaceMethod(71)
  public fun GetCulture(element: DependencyObject?): Int

  @InterfaceMethod(72)
  public fun SetCulture(element: DependencyObject?, value: Int): Unit

  @InterfaceMethod(73)
  public fun get_HeadingLevelProperty(): DependencyProperty?

  @InterfaceMethod(74)
  public fun GetHeadingLevel(element: DependencyObject?): AutomationHeadingLevel?

  @InterfaceMethod(75)
  public fun SetHeadingLevel(element: DependencyObject?, value: AutomationHeadingLevel?): Unit

  @InterfaceMethod(76)
  public fun get_IsDialogProperty(): DependencyProperty?

  @InterfaceMethod(77)
  public fun GetIsDialog(element: DependencyObject?): Boolean

  @InterfaceMethod(78)
  public fun SetIsDialog(element: DependencyObject?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics {
    public val __1516686453_Ptr: Pointer?

    public val _1516686453_VtblPtr: Pointer?
      get() = __1516686453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AcceleratorKeyProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAcceleratorKey(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetAcceleratorKey(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAccessKey(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetAccessKey(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AutomationIdProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetAutomationId(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetAutomationId(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_HelpTextProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetHelpText(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetHelpText(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsRequiredForFormProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetIsRequiredForForm(element: DependencyObject?): Boolean {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun SetIsRequiredForForm(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ItemStatusProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetItemStatus(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun SetItemStatus(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ItemTypeProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetItemType(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetItemType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_LabeledByProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetLabeledBy(element: DependencyObject?): UIElement? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun SetLabeledBy(element: DependencyObject?, value: UIElement?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_NameProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetName(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun SetName(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_LiveSettingProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetLiveSetting(element: DependencyObject?): AutomationLiveSetting? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLiveSetting>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLiveSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun SetLiveSetting(element: DependencyObject?, value: AutomationLiveSetting?):
        Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_AccessibilityViewProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun GetAccessibilityView(element: DependencyObject?): AccessibilityView? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccessibilityView>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccessibilityView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun SetAccessibilityView(element: DependencyObject?, value: AccessibilityView?):
        Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_ControlledPeersProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun GetControlledPeers(element: DependencyObject?): IVector<UIElement?>? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_PositionInSetProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun GetPositionInSet(element: DependencyObject?): Int {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun SetPositionInSet(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_SizeOfSetProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun GetSizeOfSet(element: DependencyObject?): Int {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun SetSizeOfSet(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_LevelProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun GetLevel(element: DependencyObject?): Int {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun SetLevel(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_AnnotationsProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun GetAnnotations(element: DependencyObject?):
        IVector<AutomationAnnotation?>? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_LandmarkTypeProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun GetLandmarkType(element: DependencyObject?): AutomationLandmarkType? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun SetLandmarkType(element: DependencyObject?, value: AutomationLandmarkType?):
        Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_LocalizedLandmarkTypeProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun GetLocalizedLandmarkType(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun SetLocalizedLandmarkType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_IsPeripheralProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun GetIsPeripheral(element: DependencyObject?): Boolean {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(54)
    public override fun SetIsPeripheral(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun get_IsDataValidForFormProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun GetIsDataValidForForm(element: DependencyObject?): Boolean {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(57)
    public override fun SetIsDataValidForForm(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_FullDescriptionProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun GetFullDescription(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun SetFullDescription(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun get_LocalizedControlTypeProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun GetLocalizedControlType(element: DependencyObject?): String? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun SetLocalizedControlType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun get_DescribedByProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun GetDescribedBy(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(66)
    public override fun get_FlowsToProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun GetFlowsTo(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun get_FlowsFromProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun GetFlowsFrom(element: DependencyObject?): IVector<DependencyObject?>? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun get_CultureProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun GetCulture(element: DependencyObject?): Int {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(72)
    public override fun SetCulture(element: DependencyObject?, value: Int): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(73)
    public override fun get_HeadingLevelProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun GetHeadingLevel(element: DependencyObject?): AutomationHeadingLevel? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(75)
    public override fun SetHeadingLevel(element: DependencyObject?, value: AutomationHeadingLevel?):
        Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun get_IsDialogProperty(): DependencyProperty? {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun GetIsDialog(element: DependencyObject?): Boolean {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(78)
    public override fun SetIsDialog(element: DependencyObject?, value: Boolean): Unit {
      val fnPtr = _1516686453_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1516686453_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516686453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1e3e0f3112f596687dc7862d4ad50e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516686453_Ptr))
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
