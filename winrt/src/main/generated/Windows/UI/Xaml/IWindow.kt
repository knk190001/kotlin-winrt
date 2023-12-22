package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
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

@ABIMarker(IWindow.ABI::class)
@Signature("{3276167d-c9f6-462d-9de2-ae4c1fd8c2e5}")
@Guid("3276167dc9f6462d9de2ae4c1fd8c2e5")
@WinRTInterface("3276167dc9f6462d9de2ae4c1fd8c2e5")
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
  public fun get_Dispatcher(): CoreDispatcher?

  @InterfaceMethod(6)
  public fun add_Activated(handler: WindowActivatedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Activated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_Closed(handler: WindowClosedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_SizeChanged(handler: WindowSizeChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_VisibilityChanged(handler: WindowVisibilityChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun Activate(): Unit

  @InterfaceMethod(15)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindow> {
    public override fun getValue() = ABI.makeIWindow(pointer.getPointer(0))

    public fun setValue(value: IWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindow {
    public val __1156965182_Ptr: Pointer?

    public val _1156965182_VtblPtr: Pointer?
      get() = __1156965182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Visible(): Boolean {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Content(): UIElement? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CoreWindow(): CoreWindow? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindow>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_Activated(handler: WindowActivatedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Activated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Closed(handler: WindowClosedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_SizeChanged(handler: WindowSizeChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_VisibilityChanged(handler: WindowVisibilityChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_VisibilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun Activate(): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun Close(): Unit {
      val fnPtr = _1156965182_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156965182_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156965182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3276167dc9f6462d9de2ae4c1fd8c2e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindow(ptr: Pointer?): WithDefault = IWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindow {
      val address = segment.toRawLongValue()
      return makeIWindow(Pointer(address))
    }

    public override fun toNative(obj: IWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156965182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindow): Array<IWindow?> = (elements as
        Array<IWindow?>).castToImpl<IWindow,IWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindow?> = arrayOfNulls<IWindow_Impl>(size) as
        Array<IWindow?>
  }
}
