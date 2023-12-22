package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INavigationView2.ABI::class)
@Signature("{05b428cf-014c-56dd-896a-a3e7089d73b5}")
@Guid("05b428cf014c56dd896aa3e7089d73b5")
@WinRTInterface("05b428cf014c56dd896aa3e7089d73b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationView2.ByReference::class)
public interface INavigationView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBackButtonVisible(): NavigationViewBackButtonVisible?

  @InterfaceMethod(1)
  public fun put_IsBackButtonVisible(value: NavigationViewBackButtonVisible?): Unit

  @InterfaceMethod(2)
  public fun get_IsBackEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsBackEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PaneTitle(): String?

  @InterfaceMethod(5)
  public fun put_PaneTitle(value: String?): Unit

  @InterfaceMethod(6)
  public fun add_BackRequested(handler: TypedEventHandler<NavigationView?,
      NavigationViewBackRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_BackRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PaneClosed(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PaneClosed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PaneClosing(handler: TypedEventHandler<NavigationView?,
      NavigationViewPaneClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PaneClosing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_PaneOpened(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_PaneOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_PaneOpening(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_PaneOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun get_PaneDisplayMode(): NavigationViewPaneDisplayMode?

  @InterfaceMethod(17)
  public fun put_PaneDisplayMode(value: NavigationViewPaneDisplayMode?): Unit

  @InterfaceMethod(18)
  public fun get_PaneHeader(): UIElement?

  @InterfaceMethod(19)
  public fun put_PaneHeader(value: UIElement?): Unit

  @InterfaceMethod(20)
  public fun get_PaneCustomContent(): UIElement?

  @InterfaceMethod(21)
  public fun put_PaneCustomContent(value: UIElement?): Unit

  @InterfaceMethod(22)
  public fun get_ContentOverlay(): UIElement?

  @InterfaceMethod(23)
  public fun put_ContentOverlay(value: UIElement?): Unit

  @InterfaceMethod(24)
  public fun get_IsPaneVisible(): Boolean

  @InterfaceMethod(25)
  public fun put_IsPaneVisible(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_SelectionFollowsFocus(): NavigationViewSelectionFollowsFocus?

  @InterfaceMethod(27)
  public fun put_SelectionFollowsFocus(value: NavigationViewSelectionFollowsFocus?): Unit

  @InterfaceMethod(28)
  public fun get_TemplateSettings(): NavigationViewTemplateSettings?

  @InterfaceMethod(29)
  public fun get_ShoulderNavigationEnabled(): NavigationViewShoulderNavigationEnabled?

  @InterfaceMethod(30)
  public fun put_ShoulderNavigationEnabled(value: NavigationViewShoulderNavigationEnabled?): Unit

  @InterfaceMethod(31)
  public fun get_OverflowLabelMode(): NavigationViewOverflowLabelMode?

  @InterfaceMethod(32)
  public fun put_OverflowLabelMode(value: NavigationViewOverflowLabelMode?): Unit

  @InterfaceMethod(33)
  public fun add_Expanding(handler: TypedEventHandler<NavigationView?,
      NavigationViewItemExpandingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_Expanding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun add_Collapsed(handler: TypedEventHandler<NavigationView?,
      NavigationViewItemCollapsedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_Collapsed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun Expand(item: NavigationViewItem?): Unit

  @InterfaceMethod(38)
  public fun Collapse(item: NavigationViewItem?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationView2> {
    public override fun getValue() = ABI.makeINavigationView2(pointer.getPointer(0))

    public fun setValue(value: INavigationView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationView2 {
    public val __182036526_Ptr: Pointer?

    public val _182036526_VtblPtr: Pointer?
      get() = __182036526_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBackButtonVisible(): NavigationViewBackButtonVisible? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewBackButtonVisible>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewBackButtonVisible>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IsBackButtonVisible(value: NavigationViewBackButtonVisible?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsBackEnabled(): Boolean {
      val fnPtr = _182036526_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsBackEnabled(value: Boolean): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PaneTitle(): String? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PaneTitle(value: String?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_BackRequested(handler: TypedEventHandler<NavigationView?,
        NavigationViewBackRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_BackRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PaneClosed(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PaneClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_PaneClosing(handler: TypedEventHandler<NavigationView?,
        NavigationViewPaneClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PaneClosing(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_PaneOpened(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_PaneOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_PaneOpening(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_PaneOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PaneDisplayMode(): NavigationViewPaneDisplayMode? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewPaneDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewPaneDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_PaneDisplayMode(value: NavigationViewPaneDisplayMode?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PaneHeader(): UIElement? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_PaneHeader(value: UIElement?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_PaneCustomContent(): UIElement? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_PaneCustomContent(value: UIElement?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_ContentOverlay(): UIElement? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_ContentOverlay(value: UIElement?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsPaneVisible(): Boolean {
      val fnPtr = _182036526_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsPaneVisible(value: Boolean): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectionFollowsFocus(): NavigationViewSelectionFollowsFocus? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewSelectionFollowsFocus>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewSelectionFollowsFocus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectionFollowsFocus(value: NavigationViewSelectionFollowsFocus?):
        Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_TemplateSettings(): NavigationViewTemplateSettings? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_ShoulderNavigationEnabled(): NavigationViewShoulderNavigationEnabled? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewShoulderNavigationEnabled>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NavigationViewShoulderNavigationEnabled>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override
        fun put_ShoulderNavigationEnabled(value: NavigationViewShoulderNavigationEnabled?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun get_OverflowLabelMode(): NavigationViewOverflowLabelMode? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewOverflowLabelMode>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewOverflowLabelMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun put_OverflowLabelMode(value: NavigationViewOverflowLabelMode?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_Expanding(handler: TypedEventHandler<NavigationView?,
        NavigationViewItemExpandingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_Expanding(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun add_Collapsed(handler: TypedEventHandler<NavigationView?,
        NavigationViewItemCollapsedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _182036526_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_Collapsed(token: EventRegistrationToken?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun Expand(item: NavigationViewItem?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun Collapse(item: NavigationViewItem?): Unit {
      val fnPtr = _182036526_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__182036526_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __182036526_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05b428cf014c56dd896aa3e7089d73b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationView2(ptr: Pointer?): WithDefault = INavigationView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationView2 {
      val address = segment.toRawLongValue()
      return makeINavigationView2(Pointer(address))
    }

    public override fun toNative(obj: INavigationView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__182036526_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationView2): Array<INavigationView2?> = (elements as
        Array<INavigationView2?>).castToImpl<INavigationView2,INavigationView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationView2?> =
        arrayOfNulls<INavigationView2_Impl>(size) as Array<INavigationView2?>
  }
}
