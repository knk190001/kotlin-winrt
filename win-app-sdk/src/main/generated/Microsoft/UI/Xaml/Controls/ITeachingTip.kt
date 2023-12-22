package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
import Microsoft.UI.Xaml.Input.ICommand
import Microsoft.UI.Xaml.Style
import Microsoft.UI.Xaml.Thickness
import Microsoft.UI.Xaml.UIElement
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITeachingTip.ABI::class)
@Signature("{daebd5f7-3b47-5b12-b804-f4e1442b2113}")
@Guid("daebd5f73b475b12b804f4e1442b2113")
@WinRTInterface("daebd5f73b475b12b804f4e1442b2113")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTip.ByReference::class)
public interface ITeachingTip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Subtitle(): String?

  @InterfaceMethod(3)
  public fun put_Subtitle(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(5)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Target(): FrameworkElement?

  @InterfaceMethod(7)
  public fun put_Target(value: FrameworkElement?): Unit

  @InterfaceMethod(8)
  public fun get_TailVisibility(): TeachingTipTailVisibility?

  @InterfaceMethod(9)
  public fun put_TailVisibility(value: TeachingTipTailVisibility?): Unit

  @InterfaceMethod(10)
  public fun get_ActionButtonContent(): IUnknown?

  @InterfaceMethod(11)
  public fun put_ActionButtonContent(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_ActionButtonStyle(): Style?

  @InterfaceMethod(13)
  public fun put_ActionButtonStyle(value: Style?): Unit

  @InterfaceMethod(14)
  public fun get_ActionButtonCommand(): ICommand?

  @InterfaceMethod(15)
  public fun put_ActionButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(16)
  public fun get_ActionButtonCommandParameter(): IUnknown?

  @InterfaceMethod(17)
  public fun put_ActionButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun get_CloseButtonContent(): IUnknown?

  @InterfaceMethod(19)
  public fun put_CloseButtonContent(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun get_CloseButtonStyle(): Style?

  @InterfaceMethod(21)
  public fun put_CloseButtonStyle(value: Style?): Unit

  @InterfaceMethod(22)
  public fun get_CloseButtonCommand(): ICommand?

  @InterfaceMethod(23)
  public fun put_CloseButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(24)
  public fun get_CloseButtonCommandParameter(): IUnknown?

  @InterfaceMethod(25)
  public fun put_CloseButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(26)
  public fun get_PlacementMargin(): Thickness?

  @InterfaceMethod(27)
  public fun put_PlacementMargin(value: Thickness?): Unit

  @InterfaceMethod(28)
  public fun get_ShouldConstrainToRootBounds(): Boolean

  @InterfaceMethod(29)
  public fun put_ShouldConstrainToRootBounds(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_IsLightDismissEnabled(): Boolean

  @InterfaceMethod(31)
  public fun put_IsLightDismissEnabled(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_PreferredPlacement(): TeachingTipPlacementMode?

  @InterfaceMethod(33)
  public fun put_PreferredPlacement(value: TeachingTipPlacementMode?): Unit

  @InterfaceMethod(34)
  public fun get_HeroContentPlacement(): TeachingTipHeroContentPlacementMode?

  @InterfaceMethod(35)
  public fun put_HeroContentPlacement(value: TeachingTipHeroContentPlacementMode?): Unit

  @InterfaceMethod(36)
  public fun get_HeroContent(): UIElement?

  @InterfaceMethod(37)
  public fun put_HeroContent(value: UIElement?): Unit

  @InterfaceMethod(38)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(39)
  public fun put_IconSource(value: IconSource?): Unit

  @InterfaceMethod(40)
  public fun get_TemplateSettings(): TeachingTipTemplateSettings?

  @InterfaceMethod(41)
  public fun add_ActionButtonClick(handler: TypedEventHandler<TeachingTip?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(42)
  public fun remove_ActionButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(43)
  public fun add_CloseButtonClick(handler: TypedEventHandler<TeachingTip?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun add_Closing(handler: TypedEventHandler<TeachingTip?, TeachingTipClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_Closed(handler: TypedEventHandler<TeachingTip?, TeachingTipClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITeachingTip> {
    public override fun getValue() = ABI.makeITeachingTip(pointer.getPointer(0))

    public fun setValue(value: ITeachingTip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTip {
    public val __208521703_Ptr: Pointer?

    public val _208521703_VtblPtr: Pointer?
      get() = __208521703_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Subtitle(): String? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Subtitle(value: String?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _208521703_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Target(): FrameworkElement? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Target(value: FrameworkElement?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TailVisibility(): TeachingTipTailVisibility? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipTailVisibility>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipTailVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TailVisibility(value: TeachingTipTailVisibility?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ActionButtonContent(): IUnknown? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ActionButtonContent(value: IUnknown?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ActionButtonStyle(): Style? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ActionButtonStyle(value: Style?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ActionButtonCommand(): ICommand? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ActionButtonCommand(value: ICommand?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ActionButtonCommandParameter(): IUnknown? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ActionButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CloseButtonContent(): IUnknown? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_CloseButtonContent(value: IUnknown?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_CloseButtonStyle(): Style? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_CloseButtonStyle(value: Style?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CloseButtonCommand(): ICommand? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_CloseButtonCommand(value: ICommand?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CloseButtonCommandParameter(): IUnknown? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_CloseButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_PlacementMargin(): Thickness? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_PlacementMargin(value: Thickness?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_ShouldConstrainToRootBounds(): Boolean {
      val fnPtr = _208521703_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_ShouldConstrainToRootBounds(value: Boolean): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsLightDismissEnabled(): Boolean {
      val fnPtr = _208521703_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_IsLightDismissEnabled(value: Boolean): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_PreferredPlacement(): TeachingTipPlacementMode? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_PreferredPlacement(value: TeachingTipPlacementMode?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_HeroContentPlacement(): TeachingTipHeroContentPlacementMode? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipHeroContentPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipHeroContentPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_HeroContentPlacement(value: TeachingTipHeroContentPlacementMode?):
        Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_HeroContent(): UIElement? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_HeroContent(value: UIElement?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_TemplateSettings(): TeachingTipTemplateSettings? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun add_ActionButtonClick(handler: TypedEventHandler<TeachingTip?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun remove_ActionButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun add_CloseButtonClick(handler: TypedEventHandler<TeachingTip?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun add_Closing(handler: TypedEventHandler<TeachingTip?,
        TeachingTipClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_Closed(handler: TypedEventHandler<TeachingTip?,
        TeachingTipClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _208521703_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _208521703_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208521703_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITeachingTip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __208521703_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daebd5f73b475b12b804f4e1442b2113")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTip(ptr: Pointer?): WithDefault = ITeachingTip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTip {
      val address = segment.toRawLongValue()
      return makeITeachingTip(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__208521703_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTip): Array<ITeachingTip?> = (elements as
        Array<ITeachingTip?>).castToImpl<ITeachingTip,ITeachingTip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTip?> =
        arrayOfNulls<ITeachingTip_Impl>(size) as Array<ITeachingTip?>
  }
}
