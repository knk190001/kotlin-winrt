package Microsoft.UI.Xaml

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.CoreDispatcher
import Windows.UI.Core.CoreWindow
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

@ABIMarker(IWindow.ABI::class)
@Signature("{61f0ec79-5d52-56b5-86fb-40fa4af288b0}")
@Guid("61f0ec795d5256b586fb40fa4af288b0")
@WinRTInterface("61f0ec795d5256b586fb40fa4af288b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindow.ByReference::class)
public interface IWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(1)
  public fun get_Visible(): Boolean

  @InterfaceMethod(2)
  public fun get_Content(): UIElement?

  @InterfaceMethod(3)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_CoreWindow(): CoreWindow?

  @InterfaceMethod(5)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(6)
  public fun get_Dispatcher(): CoreDispatcher?

  @InterfaceMethod(7)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(8)
  public fun get_Title(): String?

  @InterfaceMethod(9)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_ExtendsContentIntoTitleBar(): Boolean

  @InterfaceMethod(11)
  public fun put_ExtendsContentIntoTitleBar(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun add_Activated(handler: TypedEventHandler<IUnknown?, WindowActivatedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_Activated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_Closed(handler: TypedEventHandler<IUnknown?, WindowEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_SizeChanged(handler: TypedEventHandler<IUnknown?, WindowSizeChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_SizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_VisibilityChanged(handler: TypedEventHandler<IUnknown?,
      WindowVisibilityChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun Activate(): Unit

  @InterfaceMethod(21)
  public fun Close(): Unit

  @InterfaceMethod(22)
  public fun SetTitleBar(titleBar: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindow> {
    public override fun getValue() = ABI.makeIWindow(pointer.getPointer(0))

    public fun setValue(value: IWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindow {
    public val __812057335_Ptr: Pointer?

    public val _812057335_VtblPtr: Pointer?
      get() = __812057335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Visible(): Boolean {
      val fnPtr = _812057335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Content(): UIElement? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CoreWindow(): CoreWindow? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindow>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Title(): String? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ExtendsContentIntoTitleBar(): Boolean {
      val fnPtr = _812057335_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ExtendsContentIntoTitleBar(value: Boolean): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_Activated(handler: TypedEventHandler<IUnknown?,
        WindowActivatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_Activated(token: EventRegistrationToken?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_Closed(handler: TypedEventHandler<IUnknown?, WindowEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_SizeChanged(handler: TypedEventHandler<IUnknown?,
        WindowSizeChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_SizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_VisibilityChanged(handler: TypedEventHandler<IUnknown?,
        WindowVisibilityChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _812057335_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun Activate(): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Close(): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SetTitleBar(titleBar: UIElement?): Unit {
      val fnPtr = _812057335_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__812057335_Ptr, marshalToNative(titleBar),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __812057335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61f0ec795d5256b586fb40fa4af288b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindow(ptr: Pointer?): WithDefault = IWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindow {
      val address = segment.toRawLongValue()
      return makeIWindow(Pointer(address))
    }

    public override fun toNative(obj: IWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__812057335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindow): Array<IWindow?> = (elements as
        Array<IWindow?>).castToImpl<IWindow,IWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindow?> = arrayOfNulls<IWindow_Impl>(size) as
        Array<IWindow?>
  }
}
