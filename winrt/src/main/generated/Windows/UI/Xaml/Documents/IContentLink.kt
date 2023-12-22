package Windows.UI.Xaml.Documents

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.CoreCursorType
import Windows.UI.Text.ContentLinkInfo
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.ElementSoundMode
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.Input.XYFocusNavigationStrategy
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.RoutedEventHandler
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

@ABIMarker(IContentLink.ABI::class)
@Signature("{6c60c3e1-528c-42f8-92be-34b8c68be304}")
@Guid("6c60c3e1528c42f892be34b8c68be304")
@WinRTInterface("6c60c3e1528c42f892be34b8c68be304")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLink.ByReference::class)
public interface IContentLink : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Info(): ContentLinkInfo?

  @InterfaceMethod(1)
  public fun put_Info(value: ContentLinkInfo?): Unit

  @InterfaceMethod(2)
  public fun get_Background(): Brush?

  @InterfaceMethod(3)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_Cursor(): CoreCursorType?

  @InterfaceMethod(5)
  public fun put_Cursor(value: CoreCursorType?): Unit

  @InterfaceMethod(6)
  public fun get_XYFocusLeft(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_XYFocusLeft(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun get_XYFocusRight(): DependencyObject?

  @InterfaceMethod(9)
  public fun put_XYFocusRight(value: DependencyObject?): Unit

  @InterfaceMethod(10)
  public fun get_XYFocusUp(): DependencyObject?

  @InterfaceMethod(11)
  public fun put_XYFocusUp(value: DependencyObject?): Unit

  @InterfaceMethod(12)
  public fun get_XYFocusDown(): DependencyObject?

  @InterfaceMethod(13)
  public fun put_XYFocusDown(value: DependencyObject?): Unit

  @InterfaceMethod(14)
  public fun get_ElementSoundMode(): ElementSoundMode?

  @InterfaceMethod(15)
  public fun put_ElementSoundMode(value: ElementSoundMode?): Unit

  @InterfaceMethod(16)
  public fun get_FocusState(): FocusState?

  @InterfaceMethod(17)
  public fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(18)
  public fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(19)
  public fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(20)
  public fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(21)
  public fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(22)
  public fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(23)
  public fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(24)
  public fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(25)
  public fun get_IsTabStop(): Boolean

  @InterfaceMethod(26)
  public fun put_IsTabStop(value: Boolean): Unit

  @InterfaceMethod(27)
  public fun get_TabIndex(): Int

  @InterfaceMethod(28)
  public fun put_TabIndex(value: Int): Unit

  @InterfaceMethod(29)
  public fun add_Invoked(handler: TypedEventHandler<ContentLink?, ContentLinkInvokedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_Invoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun Focus(value: FocusState?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentLink> {
    public override fun getValue() = ABI.makeIContentLink(pointer.getPointer(0))

    public fun setValue(value: IContentLink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLink {
    public val __337794283_Ptr: Pointer?

    public val _337794283_VtblPtr: Pointer?
      get() = __337794283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Info(): ContentLinkInfo? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkInfo>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Info(value: ContentLinkInfo?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Background(): Brush? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Cursor(): CoreCursorType? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursorType>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursorType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Cursor(value: CoreCursorType?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusLeft(): DependencyObject? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_XYFocusLeft(value: DependencyObject?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_XYFocusRight(): DependencyObject? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_XYFocusRight(value: DependencyObject?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_XYFocusUp(): DependencyObject? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_XYFocusUp(value: DependencyObject?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_XYFocusDown(): DependencyObject? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_XYFocusDown(value: DependencyObject?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ElementSoundMode(): ElementSoundMode? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundMode>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ElementSoundMode(value: ElementSoundMode?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?):
        Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_IsTabStop(): Boolean {
      val fnPtr = _337794283_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun put_IsTabStop(value: Boolean): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_TabIndex(): Int {
      val fnPtr = _337794283_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun put_TabIndex(value: Int): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_Invoked(handler: TypedEventHandler<ContentLink?,
        ContentLinkInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_Invoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _337794283_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _337794283_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _337794283_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__337794283_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContentLink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __337794283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c60c3e1528c42f892be34b8c68be304")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLink(ptr: Pointer?): WithDefault = IContentLink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLink {
      val address = segment.toRawLongValue()
      return makeIContentLink(Pointer(address))
    }

    public override fun toNative(obj: IContentLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__337794283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLink): Array<IContentLink?> = (elements as
        Array<IContentLink?>).castToImpl<IContentLink,IContentLink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLink?> =
        arrayOfNulls<IContentLink_Impl>(size) as Array<IContentLink?>
  }
}
