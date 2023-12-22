package Windows.UI.Core

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
import Windows.System.VirtualKey
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

@ABIMarker(ICoreWindow.ABI::class)
@Signature("{79b9d5f2-879e-4b89-b798-79e47598030c}")
@Guid("79b9d5f2879e4b89b79879e47598030c")
@WinRTInterface("79b9d5f2879e4b89b79879e47598030c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindow.ByReference::class)
public interface ICoreWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutomationHostProvider(): IUnknown?

  @InterfaceMethod(1)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(2)
  public fun get_CustomProperties(): IPropertySet?

  @InterfaceMethod(3)
  public fun get_Dispatcher(): CoreDispatcher?

  @InterfaceMethod(4)
  public fun get_FlowDirection(): CoreWindowFlowDirection?

  @InterfaceMethod(5)
  public fun put_FlowDirection(value: CoreWindowFlowDirection?): Unit

  @InterfaceMethod(6)
  public fun get_IsInputEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsInputEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_PointerCursor(): CoreCursor?

  @InterfaceMethod(9)
  public fun put_PointerCursor(value: CoreCursor?): Unit

  @InterfaceMethod(10)
  public fun get_PointerPosition(): Point?

  @InterfaceMethod(11)
  public fun get_Visible(): Boolean

  @InterfaceMethod(12)
  public fun Activate(): Unit

  @InterfaceMethod(13)
  public fun Close(): Unit

  @InterfaceMethod(14)
  public fun GetAsyncKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates?

  @InterfaceMethod(15)
  public fun GetKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates?

  @InterfaceMethod(16)
  public fun ReleasePointerCapture(): Unit

  @InterfaceMethod(17)
  public fun SetPointerCapture(): Unit

  @InterfaceMethod(18)
  public fun add_Activated(handler: TypedEventHandler<CoreWindow?, WindowActivatedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_Activated(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_AutomationProviderRequested(handler: TypedEventHandler<CoreWindow?,
      AutomationProviderRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_AutomationProviderRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_CharacterReceived(handler: TypedEventHandler<CoreWindow?,
      CharacterReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_CharacterReceived(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_Closed(handler: TypedEventHandler<CoreWindow?, CoreWindowEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_Closed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_InputEnabled(handler: TypedEventHandler<CoreWindow?, InputEnabledEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_InputEnabled(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_KeyDown(handler: TypedEventHandler<CoreWindow?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_KeyDown(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_KeyUp(handler: TypedEventHandler<CoreWindow?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_KeyUp(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_PointerCaptureLost(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_PointerCaptureLost(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_PointerEntered(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(36)
  public fun add_PointerExited(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(37)
  public fun remove_PointerExited(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(38)
  public fun add_PointerMoved(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(40)
  public fun add_PointerPressed(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(41)
  public fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(42)
  public fun add_PointerReleased(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(43)
  public fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(44)
  public fun add_TouchHitTesting(handler: TypedEventHandler<CoreWindow?,
      TouchHitTestingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(45)
  public fun remove_TouchHitTesting(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(46)
  public fun add_PointerWheelChanged(handler: TypedEventHandler<CoreWindow?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(47)
  public fun remove_PointerWheelChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(48)
  public fun add_SizeChanged(handler: TypedEventHandler<CoreWindow?, WindowSizeChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(49)
  public fun remove_SizeChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(50)
  public fun add_VisibilityChanged(handler: TypedEventHandler<CoreWindow?,
      VisibilityChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_VisibilityChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreWindow> {
    public override fun getValue() = ABI.makeICoreWindow(pointer.getPointer(0))

    public fun setValue(value: ICoreWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindow {
    public val __937522826_Ptr: Pointer?

    public val _937522826_VtblPtr: Pointer?
      get() = __937522826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomationHostProvider(): IUnknown? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CustomProperties(): IPropertySet? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FlowDirection(): CoreWindowFlowDirection? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowFlowDirection>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowFlowDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FlowDirection(value: CoreWindowFlowDirection?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsInputEnabled(): Boolean {
      val fnPtr = _937522826_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsInputEnabled(value: Boolean): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PointerCursor(): CoreCursor? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursor>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PointerCursor(value: CoreCursor?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PointerPosition(): Point? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Visible(): Boolean {
      val fnPtr = _937522826_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun Activate(): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Close(): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun GetAsyncKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreVirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreVirtualKeyStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreVirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreVirtualKeyStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun ReleasePointerCapture(): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetPointerCapture(): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_Activated(handler: TypedEventHandler<CoreWindow?,
        WindowActivatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_Activated(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_AutomationProviderRequested(handler: TypedEventHandler<CoreWindow?,
        AutomationProviderRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_AutomationProviderRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_CharacterReceived(handler: TypedEventHandler<CoreWindow?,
        CharacterReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_CharacterReceived(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_Closed(handler: TypedEventHandler<CoreWindow?, CoreWindowEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_Closed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_InputEnabled(handler: TypedEventHandler<CoreWindow?,
        InputEnabledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_InputEnabled(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_KeyDown(handler: TypedEventHandler<CoreWindow?, KeyEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_KeyDown(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_KeyUp(handler: TypedEventHandler<CoreWindow?, KeyEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_KeyUp(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_PointerCaptureLost(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_PointerCaptureLost(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_PointerEntered(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun add_PointerExited(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun remove_PointerExited(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_PointerMoved(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun add_PointerPressed(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun add_PointerReleased(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun add_TouchHitTesting(handler: TypedEventHandler<CoreWindow?,
        TouchHitTestingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun remove_TouchHitTesting(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun add_PointerWheelChanged(handler: TypedEventHandler<CoreWindow?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun remove_PointerWheelChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun add_SizeChanged(handler: TypedEventHandler<CoreWindow?,
        WindowSizeChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun remove_SizeChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun add_VisibilityChanged(handler: TypedEventHandler<CoreWindow?,
        VisibilityChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _937522826_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_VisibilityChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _937522826_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__937522826_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __937522826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79b9d5f2879e4b89b79879e47598030c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindow(ptr: Pointer?): WithDefault = ICoreWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindow {
      val address = segment.toRawLongValue()
      return makeICoreWindow(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__937522826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindow): Array<ICoreWindow?> = (elements as
        Array<ICoreWindow?>).castToImpl<ICoreWindow,ICoreWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindow?> =
        arrayOfNulls<ICoreWindow_Impl>(size) as Array<ICoreWindow?>
  }
}
