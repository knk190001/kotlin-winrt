package Windows.UI.Xaml

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Input.GettingFocusEventArgs
import Windows.UI.Xaml.Input.KeyTipPlacementMode
import Windows.UI.Xaml.Input.KeyboardNavigationMode
import Windows.UI.Xaml.Input.LosingFocusEventArgs
import Windows.UI.Xaml.Input.NoFocusCandidateFoundEventArgs
import Windows.UI.Xaml.Input.XYFocusKeyboardNavigationMode
import Windows.UI.Xaml.Input.XYFocusNavigationStrategy
import Windows.UI.Xaml.Media.XamlLight
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElement5.ABI::class)
@Signature("{8eed9bc2-a58c-4453-af0f-a92ee06d0317}")
@Guid("8eed9bc2a58c4453af0fa92ee06d0317")
@WinRTInterface("8eed9bc2a58c4453af0fa92ee06d0317")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement5.ByReference::class)
public interface IUIElement5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Lights(): IVector<XamlLight?>?

  @InterfaceMethod(1)
  public fun get_KeyTipPlacementMode(): KeyTipPlacementMode?

  @InterfaceMethod(2)
  public fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit

  @InterfaceMethod(3)
  public fun get_KeyTipHorizontalOffset(): Double

  @InterfaceMethod(4)
  public fun put_KeyTipHorizontalOffset(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_KeyTipVerticalOffset(): Double

  @InterfaceMethod(6)
  public fun put_KeyTipVerticalOffset(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_XYFocusKeyboardNavigation(): XYFocusKeyboardNavigationMode?

  @InterfaceMethod(8)
  public fun put_XYFocusKeyboardNavigation(value: XYFocusKeyboardNavigationMode?): Unit

  @InterfaceMethod(9)
  public fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(10)
  public fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(11)
  public fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(12)
  public fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(13)
  public fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(14)
  public fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(15)
  public fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(16)
  public fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(17)
  public fun get_HighContrastAdjustment(): ElementHighContrastAdjustment?

  @InterfaceMethod(18)
  public fun put_HighContrastAdjustment(value: ElementHighContrastAdjustment?): Unit

  @InterfaceMethod(19)
  public fun get_TabFocusNavigation(): KeyboardNavigationMode?

  @InterfaceMethod(20)
  public fun put_TabFocusNavigation(value: KeyboardNavigationMode?): Unit

  @InterfaceMethod(21)
  public fun add_GettingFocus(handler: TypedEventHandler<UIElement?, GettingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_GettingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_LosingFocus(handler: TypedEventHandler<UIElement?, LosingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_LosingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_NoFocusCandidateFound(handler: TypedEventHandler<UIElement?,
      NoFocusCandidateFoundEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_NoFocusCandidateFound(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun StartBringIntoView(): Unit

  @InterfaceMethod(28)
  public fun StartBringIntoView(options: BringIntoViewOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement5> {
    public override fun getValue() = ABI.makeIUIElement5(pointer.getPointer(0))

    public fun setValue(value: IUIElement5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement5 {
    public val __1021118239_Ptr: Pointer?

    public val _1021118239_VtblPtr: Pointer?
      get() = __1021118239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Lights(): IVector<XamlLight?>? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<XamlLight?>>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<XamlLight?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTipPlacementMode(): KeyTipPlacementMode? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTipPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTipPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_KeyTipHorizontalOffset(): Double {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_KeyTipHorizontalOffset(value: Double): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_KeyTipVerticalOffset(): Double {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_KeyTipVerticalOffset(value: Double): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_XYFocusKeyboardNavigation(): XYFocusKeyboardNavigationMode? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusKeyboardNavigationMode>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusKeyboardNavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_XYFocusKeyboardNavigation(value: XYFocusKeyboardNavigationMode?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?):
        Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_HighContrastAdjustment(): ElementHighContrastAdjustment? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementHighContrastAdjustment>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementHighContrastAdjustment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_HighContrastAdjustment(value: ElementHighContrastAdjustment?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_TabFocusNavigation(): KeyboardNavigationMode? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardNavigationMode>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardNavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_TabFocusNavigation(value: KeyboardNavigationMode?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_GettingFocus(handler: TypedEventHandler<UIElement?,
        GettingFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_GettingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_LosingFocus(handler: TypedEventHandler<UIElement?,
        LosingFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_LosingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_NoFocusCandidateFound(handler: TypedEventHandler<UIElement?,
        NoFocusCandidateFoundEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_NoFocusCandidateFound(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun StartBringIntoView(): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun StartBringIntoView(options: BringIntoViewOptions?): Unit {
      val fnPtr = _1021118239_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118239_Ptr, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8eed9bc2a58c4453af0fa92ee06d0317")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement5(ptr: Pointer?): WithDefault = IUIElement5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement5 {
      val address = segment.toRawLongValue()
      return makeIUIElement5(Pointer(address))
    }

    public override fun toNative(obj: IUIElement5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement5): Array<IUIElement5?> = (elements as
        Array<IUIElement5?>).castToImpl<IUIElement5,IUIElement5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement5?> =
        arrayOfNulls<IUIElement5_Impl>(size) as Array<IUIElement5?>
  }
}
