package Microsoft.UI.Windowing

import Microsoft.UI.IconId
import Microsoft.UI.WindowId
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.PointInt32
import Windows.Graphics.RectInt32
import Windows.Graphics.SizeInt32
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

@ABIMarker(IAppWindow.ABI::class)
@Signature("{cfa788b3-643b-5c5e-ad4e-321d48a82acd}")
@Guid("cfa788b3643b5c5ead4e321d48a82acd")
@WinRTInterface("cfa788b3643b5c5ead4e321d48a82acd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindow.ByReference::class)
public interface IAppWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WindowId?

  @InterfaceMethod(1)
  public fun get_IsShownInSwitchers(): Boolean

  @InterfaceMethod(2)
  public fun put_IsShownInSwitchers(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(4)
  public fun get_OwnerWindowId(): WindowId?

  @InterfaceMethod(5)
  public fun get_Position(): PointInt32?

  @InterfaceMethod(6)
  public fun get_Presenter(): AppWindowPresenter?

  @InterfaceMethod(7)
  public fun get_Size(): SizeInt32?

  @InterfaceMethod(8)
  public fun get_Title(): String?

  @InterfaceMethod(9)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_TitleBar(): AppWindowTitleBar?

  @InterfaceMethod(11)
  public fun Destroy(): Unit

  @InterfaceMethod(12)
  public fun Hide(): Unit

  @InterfaceMethod(13)
  public fun Move(position: PointInt32?): Unit

  @InterfaceMethod(14)
  public fun MoveAndResize(rect: RectInt32?): Unit

  @InterfaceMethod(15)
  public fun MoveAndResize(rect: RectInt32?, displayarea: DisplayArea?): Unit

  @InterfaceMethod(16)
  public fun Resize(size: SizeInt32?): Unit

  @InterfaceMethod(17)
  public fun SetIcon(iconPath: String?): Unit

  @InterfaceMethod(18)
  public fun SetIcon(iconId: IconId?): Unit

  @InterfaceMethod(19)
  public fun SetPresenter(appWindowPresenter: AppWindowPresenter?): Unit

  @InterfaceMethod(20)
  public fun SetPresenter(appWindowPresenterKind: AppWindowPresenterKind?): Unit

  @InterfaceMethod(21)
  public fun Show(): Unit

  @InterfaceMethod(22)
  public fun Show(activateWindow: Boolean): Unit

  @InterfaceMethod(23)
  public fun add_Changed(handler: TypedEventHandler<AppWindow?, AppWindowChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_Closing(handler: TypedEventHandler<AppWindow?, AppWindowClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_Destroying(handler: TypedEventHandler<AppWindow?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_Destroying(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppWindow> {
    public override fun getValue() = ABI.makeIAppWindow(pointer.getPointer(0))

    public fun setValue(value: IAppWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindow {
    public val __77393216_Ptr: Pointer?

    public val _77393216_VtblPtr: Pointer?
      get() = __77393216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WindowId? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsShownInSwitchers(): Boolean {
      val fnPtr = _77393216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsShownInSwitchers(value: Boolean): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _77393216_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_OwnerWindowId(): WindowId? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Position(): PointInt32? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointInt32>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Presenter(): AppWindowPresenter? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowPresenter>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Size(): SizeInt32? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Title(): String? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TitleBar(): AppWindowTitleBar? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowTitleBar>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowTitleBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Destroy(): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Hide(): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Move(position: PointInt32?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(position),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun MoveAndResize(rect: RectInt32?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(rect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun MoveAndResize(rect: RectInt32?, displayarea: DisplayArea?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(rect),
          marshalToNative(displayarea),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun Resize(size: SizeInt32?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(size),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetIcon(iconPath: String?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(iconPath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun SetIcon(iconId: IconId?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(iconId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun SetPresenter(appWindowPresenter: AppWindowPresenter?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(appWindowPresenter),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun SetPresenter(appWindowPresenterKind: AppWindowPresenterKind?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(appWindowPresenterKind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Show(): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun Show(activateWindow: Boolean): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, activateWindow,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_Changed(handler: TypedEventHandler<AppWindow?,
        AppWindowChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_Closing(handler: TypedEventHandler<AppWindow?,
        AppWindowClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_Destroying(handler: TypedEventHandler<AppWindow?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _77393216_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_Destroying(token: EventRegistrationToken?): Unit {
      val fnPtr = _77393216_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__77393216_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __77393216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfa788b3643b5c5ead4e321d48a82acd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindow(ptr: Pointer?): WithDefault = IAppWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindow {
      val address = segment.toRawLongValue()
      return makeIAppWindow(Pointer(address))
    }

    public override fun toNative(obj: IAppWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__77393216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindow): Array<IAppWindow?> = (elements as
        Array<IAppWindow?>).castToImpl<IAppWindow,IAppWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindow?> = arrayOfNulls<IAppWindow_Impl>(size)
        as Array<IAppWindow?>
  }
}
