package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
import Windows.UI.Color
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

@ABIMarker(IColorPicker.ABI::class)
@Signature("{6232e371-5c64-43cb-8b35-7f82dde36740}")
@Guid("6232e3715c6443cb8b357f82dde36740")
@WinRTInterface("6232e3715c6443cb8b357f82dde36740")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPicker.ByReference::class)
public interface IColorPicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_PreviousColor(): IReference<Color?>?

  @InterfaceMethod(3)
  public fun put_PreviousColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(4)
  public fun get_IsAlphaEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAlphaEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsColorSpectrumVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_IsColorSpectrumVisible(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsColorPreviewVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_IsColorPreviewVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsColorSliderVisible(): Boolean

  @InterfaceMethod(11)
  public fun put_IsColorSliderVisible(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsAlphaSliderVisible(): Boolean

  @InterfaceMethod(13)
  public fun put_IsAlphaSliderVisible(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsMoreButtonVisible(): Boolean

  @InterfaceMethod(15)
  public fun put_IsMoreButtonVisible(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsColorChannelTextInputVisible(): Boolean

  @InterfaceMethod(17)
  public fun put_IsColorChannelTextInputVisible(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_IsAlphaTextInputVisible(): Boolean

  @InterfaceMethod(19)
  public fun put_IsAlphaTextInputVisible(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsHexInputVisible(): Boolean

  @InterfaceMethod(21)
  public fun put_IsHexInputVisible(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_MinHue(): Int

  @InterfaceMethod(23)
  public fun put_MinHue(value: Int): Unit

  @InterfaceMethod(24)
  public fun get_MaxHue(): Int

  @InterfaceMethod(25)
  public fun put_MaxHue(value: Int): Unit

  @InterfaceMethod(26)
  public fun get_MinSaturation(): Int

  @InterfaceMethod(27)
  public fun put_MinSaturation(value: Int): Unit

  @InterfaceMethod(28)
  public fun get_MaxSaturation(): Int

  @InterfaceMethod(29)
  public fun put_MaxSaturation(value: Int): Unit

  @InterfaceMethod(30)
  public fun get_MinValue(): Int

  @InterfaceMethod(31)
  public fun put_MinValue(value: Int): Unit

  @InterfaceMethod(32)
  public fun get_MaxValue(): Int

  @InterfaceMethod(33)
  public fun put_MaxValue(value: Int): Unit

  @InterfaceMethod(34)
  public fun get_ColorSpectrumShape(): ColorSpectrumShape?

  @InterfaceMethod(35)
  public fun put_ColorSpectrumShape(value: ColorSpectrumShape?): Unit

  @InterfaceMethod(36)
  public fun get_ColorSpectrumComponents(): ColorSpectrumComponents?

  @InterfaceMethod(37)
  public fun put_ColorSpectrumComponents(value: ColorSpectrumComponents?): Unit

  @InterfaceMethod(38)
  public fun add_ColorChanged(handler: TypedEventHandler<ColorPicker?, ColorChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_ColorChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorPicker> {
    public override fun getValue() = ABI.makeIColorPicker(pointer.getPointer(0))

    public fun setValue(value: IColorPicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPicker {
    public val __929630261_Ptr: Pointer?

    public val _929630261_VtblPtr: Pointer?
      get() = __929630261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _929630261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PreviousColor(): IReference<Color?>? {
      val fnPtr = _929630261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PreviousColor(value: IReference<Color?>?): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAlphaEnabled(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAlphaEnabled(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsColorSpectrumVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsColorSpectrumVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsColorPreviewVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsColorPreviewVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsColorSliderVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsColorSliderVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsAlphaSliderVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsAlphaSliderVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsMoreButtonVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsMoreButtonVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsColorChannelTextInputVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsColorChannelTextInputVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsAlphaTextInputVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsAlphaTextInputVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsHexInputVisible(): Boolean {
      val fnPtr = _929630261_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsHexInputVisible(value: Boolean): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_MinHue(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_MinHue(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_MaxHue(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_MaxHue(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_MinSaturation(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_MinSaturation(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_MaxSaturation(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_MaxSaturation(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_MinValue(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_MinValue(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_MaxValue(): Int {
      val fnPtr = _929630261_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_MaxValue(value: Int): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_ColorSpectrumShape(): ColorSpectrumShape? {
      val fnPtr = _929630261_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumShape>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrumShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_ColorSpectrumShape(value: ColorSpectrumShape?): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_ColorSpectrumComponents(): ColorSpectrumComponents? {
      val fnPtr = _929630261_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumComponents>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrumComponents>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_ColorSpectrumComponents(value: ColorSpectrumComponents?): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_ColorChanged(handler: TypedEventHandler<ColorPicker?,
        ColorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _929630261_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_ColorChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _929630261_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__929630261_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorPicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __929630261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6232e3715c6443cb8b357f82dde36740")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPicker(ptr: Pointer?): WithDefault = IColorPicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPicker {
      val address = segment.toRawLongValue()
      return makeIColorPicker(Pointer(address))
    }

    public override fun toNative(obj: IColorPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__929630261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPicker): Array<IColorPicker?> = (elements as
        Array<IColorPicker?>).castToImpl<IColorPicker,IColorPicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPicker?> =
        arrayOfNulls<IColorPicker_Impl>(size) as Array<IColorPicker?>
  }
}
