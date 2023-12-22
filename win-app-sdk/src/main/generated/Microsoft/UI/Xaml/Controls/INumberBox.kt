package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.SolidColorBrush
import Microsoft.UI.Xaml.TextReadingOrder
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.NumberFormatting.INumberFormatter2
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INumberBox.ABI::class)
@Signature("{c18eb0e9-29fb-525d-abbc-d6b2110f542e}")
@Guid("c18eb0e929fb525dabbcd6b2110f542e")
@WinRTInterface("c18eb0e929fb525dabbcd6b2110f542e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberBox.ByReference::class)
public interface INumberBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Minimum(): Double

  @InterfaceMethod(1)
  public fun put_Minimum(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Maximum(): Double

  @InterfaceMethod(3)
  public fun put_Maximum(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Value(): Double

  @InterfaceMethod(5)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_SmallChange(): Double

  @InterfaceMethod(7)
  public fun put_SmallChange(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_LargeChange(): Double

  @InterfaceMethod(9)
  public fun put_LargeChange(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_Text(): String?

  @InterfaceMethod(11)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(13)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(14)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(15)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(16)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(17)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(18)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(19)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(20)
  public fun get_SelectionHighlightColor(): SolidColorBrush?

  @InterfaceMethod(21)
  public fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(22)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(23)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(24)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean

  @InterfaceMethod(25)
  public fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(27)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(28)
  public fun get_ValidationMode(): NumberBoxValidationMode?

  @InterfaceMethod(29)
  public fun put_ValidationMode(value: NumberBoxValidationMode?): Unit

  @InterfaceMethod(30)
  public fun get_SpinButtonPlacementMode(): NumberBoxSpinButtonPlacementMode?

  @InterfaceMethod(31)
  public fun put_SpinButtonPlacementMode(value: NumberBoxSpinButtonPlacementMode?): Unit

  @InterfaceMethod(32)
  public fun get_IsWrapEnabled(): Boolean

  @InterfaceMethod(33)
  public fun put_IsWrapEnabled(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_AcceptsExpression(): Boolean

  @InterfaceMethod(35)
  public fun put_AcceptsExpression(value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_NumberFormatter(): INumberFormatter2?

  @InterfaceMethod(37)
  public fun put_NumberFormatter(value: INumberFormatter2?): Unit

  @InterfaceMethod(38)
  public fun add_ValueChanged(handler: TypedEventHandler<NumberBox?,
      NumberBoxValueChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_ValueChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INumberBox> {
    public override fun getValue() = ABI.makeINumberBox(pointer.getPointer(0))

    public fun setValue(value: INumberBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberBox {
    public val __1067269083_Ptr: Pointer?

    public val _1067269083_VtblPtr: Pointer?
      get() = __1067269083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Minimum(): Double {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Minimum(value: Double): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Maximum(): Double {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Maximum(value: Double): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): Double {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SmallChange(): Double {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_SmallChange(value: Double): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_LargeChange(): Double {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_LargeChange(value: Double): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Text(): String? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SelectionHighlightColor(): SolidColorBrush? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_SelectionHighlightColor(value: SolidColorBrush?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocus(): Boolean {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_PreventKeyboardDisplayOnProgrammaticFocus(value: Boolean): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_ValidationMode(): NumberBoxValidationMode? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NumberBoxValidationMode>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NumberBoxValidationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_ValidationMode(value: NumberBoxValidationMode?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SpinButtonPlacementMode(): NumberBoxSpinButtonPlacementMode? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NumberBoxSpinButtonPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NumberBoxSpinButtonPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SpinButtonPlacementMode(value: NumberBoxSpinButtonPlacementMode?):
        Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_IsWrapEnabled(): Boolean {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_IsWrapEnabled(value: Boolean): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_AcceptsExpression(): Boolean {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_AcceptsExpression(value: Boolean): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_NumberFormatter(): INumberFormatter2? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INumberFormatter2>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INumberFormatter2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_NumberFormatter(value: INumberFormatter2?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_ValueChanged(handler: TypedEventHandler<NumberBox?,
        NumberBoxValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_ValueChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1067269083_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1067269083_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INumberBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1067269083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c18eb0e929fb525dabbcd6b2110f542e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberBox(ptr: Pointer?): WithDefault = INumberBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberBox {
      val address = segment.toRawLongValue()
      return makeINumberBox(Pointer(address))
    }

    public override fun toNative(obj: INumberBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1067269083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberBox): Array<INumberBox?> = (elements as
        Array<INumberBox?>).castToImpl<INumberBox,INumberBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberBox?> = arrayOfNulls<INumberBox_Impl>(size)
        as Array<INumberBox?>
  }
}
