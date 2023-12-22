package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.FrameworkElement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControlStatics.ABI::class)
@Signature("{c3ae388d-aa36-5e10-acac-98415f47bcc7}")
@Guid("c3ae388daa365e10acac98415f47bcc7")
@WinRTInterface("c3ae388daa365e10acac98415f47bcc7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlStatics.ByReference::class)
public interface IControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFocusEngagementEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsFocusEngagedProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RequiresPointerProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FontSizeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_FontWeightProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_FontStyleProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_FontStretchProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_CharacterSpacingProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ForegroundProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_IsEnabledProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_TabNavigationProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_TemplateProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_PaddingProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_HorizontalContentAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_VerticalContentAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_BackgroundProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_DefaultStyleKeyProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_DefaultStyleResourceUriProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_IsTemplateFocusTargetProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun GetIsTemplateFocusTarget(element: FrameworkElement?): Boolean

  @InterfaceMethod(27)
  public fun SetIsTemplateFocusTarget(element: FrameworkElement?, value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_IsTemplateKeyTipTargetProperty(): DependencyProperty?

  @InterfaceMethod(29)
  public fun GetIsTemplateKeyTipTarget(element: DependencyObject?): Boolean

  @InterfaceMethod(30)
  public fun SetIsTemplateKeyTipTarget(element: DependencyObject?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlStatics> {
    public override fun getValue() = ABI.makeIControlStatics(pointer.getPointer(0))

    public fun setValue(value: IControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlStatics {
    public val __1035699503_Ptr: Pointer?

    public val _1035699503_VtblPtr: Pointer?
      get() = __1035699503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFocusEngagementEnabledProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsFocusEngagedProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RequiresPointerProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontSizeProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FontWeightProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FontStyleProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_FontStretchProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CharacterSpacingProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsEnabledProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_TabNavigationProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_TemplateProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_HorizontalContentAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_VerticalContentAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_DefaultStyleKeyProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_DefaultStyleResourceUriProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_IsTemplateFocusTargetProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun GetIsTemplateFocusTarget(element: FrameworkElement?): Boolean {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun SetIsTemplateFocusTarget(element: FrameworkElement?, value: Boolean): Unit {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_IsTemplateKeyTipTargetProperty(): DependencyProperty? {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun GetIsTemplateKeyTipTarget(element: DependencyObject?): Boolean {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(30)
    public override fun SetIsTemplateKeyTipTarget(element: DependencyObject?, value: Boolean):
        Unit {
      val fnPtr = _1035699503_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1035699503_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1035699503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3ae388daa365e10acac98415f47bcc7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlStatics(ptr: Pointer?): WithDefault = IControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlStatics {
      val address = segment.toRawLongValue()
      return makeIControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1035699503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlStatics): Array<IControlStatics?> = (elements as
        Array<IControlStatics?>).castToImpl<IControlStatics,IControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlStatics?> =
        arrayOfNulls<IControlStatics_Impl>(size) as Array<IControlStatics?>
  }
}
