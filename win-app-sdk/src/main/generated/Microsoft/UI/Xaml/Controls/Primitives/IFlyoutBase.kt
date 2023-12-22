package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.LightDismissOverlayMode
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.ElementSoundMode
import Microsoft.UI.Xaml.FrameworkElement
import Microsoft.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
import Microsoft.UI.Xaml.XamlRoot
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlyoutBase.ABI::class)
@Signature("{bb6603bf-744d-5c31-a87d-744394634d77}")
@Guid("bb6603bf744d5c31a87d744394634d77")
@WinRTInterface("bb6603bf744d5c31a87d744394634d77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase.ByReference::class)
public interface IFlyoutBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Placement(): FlyoutPlacementMode?

  @InterfaceMethod(1)
  public fun put_Placement(value: FlyoutPlacementMode?): Unit

  @InterfaceMethod(2)
  public fun get_Target(): FrameworkElement?

  @InterfaceMethod(3)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(4)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(6)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(7)
  public fun get_AllowFocusWhenDisabled(): Boolean

  @InterfaceMethod(8)
  public fun put_AllowFocusWhenDisabled(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_ShowMode(): FlyoutShowMode?

  @InterfaceMethod(10)
  public fun put_ShowMode(value: FlyoutShowMode?): Unit

  @InterfaceMethod(11)
  public fun get_InputDevicePrefersPrimaryCommands(): Boolean

  @InterfaceMethod(12)
  public fun get_AreOpenCloseAnimationsEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_AreOpenCloseAnimationsEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_ShouldConstrainToRootBounds(): Boolean

  @InterfaceMethod(15)
  public fun put_ShouldConstrainToRootBounds(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsConstrainedToRootBounds(): Boolean

  @InterfaceMethod(17)
  public fun get_ElementSoundMode(): ElementSoundMode?

  @InterfaceMethod(18)
  public fun put_ElementSoundMode(value: ElementSoundMode?): Unit

  @InterfaceMethod(19)
  public fun get_OverlayInputPassThroughElement(): DependencyObject?

  @InterfaceMethod(20)
  public fun put_OverlayInputPassThroughElement(value: DependencyObject?): Unit

  @InterfaceMethod(21)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(22)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(23)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  @InterfaceMethod(24)
  public fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_Opening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_Closing(handler: TypedEventHandler<FlyoutBase?, FlyoutBaseClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun ShowAt(placementTarget: FrameworkElement?): Unit

  @InterfaceMethod(33)
  public fun ShowAt(placementTarget: DependencyObject?, showOptions: FlyoutShowOptions?): Unit

  @InterfaceMethod(34)
  public fun Hide(): Unit

  @InterfaceMethod(35)
  public fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase> {
    public override fun getValue() = ABI.makeIFlyoutBase(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase {
    public val __1334661507_Ptr: Pointer?

    public val _1334661507_VtblPtr: Pointer?
      get() = __1334661507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Placement(): FlyoutPlacementMode? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Placement(value: FlyoutPlacementMode?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Target(): FrameworkElement? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_AllowFocusWhenDisabled(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_AllowFocusWhenDisabled(value: Boolean): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ShowMode(): FlyoutShowMode? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutShowMode>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutShowMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ShowMode(value: FlyoutShowMode?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_InputDevicePrefersPrimaryCommands(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_AreOpenCloseAnimationsEnabled(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AreOpenCloseAnimationsEnabled(value: Boolean): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ShouldConstrainToRootBounds(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ShouldConstrainToRootBounds(value: Boolean): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsConstrainedToRootBounds(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_ElementSoundMode(): ElementSoundMode? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundMode>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_ElementSoundMode(value: ElementSoundMode?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_OverlayInputPassThroughElement(): DependencyObject? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_OverlayInputPassThroughElement(value: DependencyObject?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_Opening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_Closing(handler: TypedEventHandler<FlyoutBase?,
        FlyoutBaseClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun ShowAt(placementTarget: FrameworkElement?): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(placementTarget),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun ShowAt(placementTarget: DependencyObject?, showOptions: FlyoutShowOptions?):
        Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(placementTarget),
          marshalToNative(showOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun Hide(): Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _1334661507_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1334661507_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1334661507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb6603bf744d5c31a87d744394634d77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase(ptr: Pointer?): WithDefault = IFlyoutBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1334661507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase): Array<IFlyoutBase?> = (elements as
        Array<IFlyoutBase?>).castToImpl<IFlyoutBase,IFlyoutBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase?> =
        arrayOfNulls<IFlyoutBase_Impl>(size) as Array<IFlyoutBase?>
  }
}
