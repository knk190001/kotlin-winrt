package Windows.UI.WindowManagement

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.System.DispatcherQueue
import Windows.UI.UIContentRoot
import Windows.UI.UIContext
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppWindow.ABI::class)
@Signature("{663014a6-b75e-5dbd-995c-f0117fa3fb61}")
@Guid("663014a6b75e5dbd995cf0117fa3fb61")
@WinRTInterface("663014a6b75e5dbd995cf0117fa3fb61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindow.ByReference::class)
public interface IAppWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIContentRoot?

  @InterfaceMethod(1)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(2)
  public fun get_Frame(): AppWindowFrame?

  @InterfaceMethod(3)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(4)
  public fun get_PersistedStateId(): String?

  @InterfaceMethod(5)
  public fun put_PersistedStateId(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Presenter(): AppWindowPresenter?

  @InterfaceMethod(7)
  public fun get_Title(): String?

  @InterfaceMethod(8)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_TitleBar(): AppWindowTitleBar?

  @InterfaceMethod(10)
  public fun get_UIContext(): UIContext?

  @InterfaceMethod(11)
  public fun get_WindowingEnvironment(): WindowingEnvironment?

  @InterfaceMethod(12)
  public fun CloseAsync(): IAsyncAction?

  @InterfaceMethod(13)
  public fun GetPlacement(): AppWindowPlacement?

  @InterfaceMethod(14)
  public fun GetDisplayRegions(): IVectorView<DisplayRegion?>?

  @InterfaceMethod(15)
  public fun RequestMoveToDisplayRegion(displayRegion: DisplayRegion?): Unit

  @InterfaceMethod(16)
  public fun RequestMoveAdjacentToCurrentView(): Unit

  @InterfaceMethod(17)
  public fun RequestMoveAdjacentToWindow(anchorWindow: AppWindow?): Unit

  @InterfaceMethod(18)
  public fun RequestMoveRelativeToWindowContent(anchorWindow: AppWindow?, contentOffset: Point?):
      Unit

  @InterfaceMethod(19)
  public fun RequestMoveRelativeToCurrentViewContent(contentOffset: Point?): Unit

  @InterfaceMethod(20)
  public fun RequestMoveRelativeToDisplayRegion(displayRegion: DisplayRegion?,
      displayRegionOffset: Point?): Unit

  @InterfaceMethod(21)
  public fun RequestSize(frameSize: Size?): Unit

  @InterfaceMethod(22)
  public fun TryShowAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(23)
  public fun add_Changed(handler: TypedEventHandler<AppWindow?, AppWindowChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_Closed(handler: TypedEventHandler<AppWindow?, AppWindowClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_CloseRequested(handler: TypedEventHandler<AppWindow?,
      AppWindowCloseRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_CloseRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppWindow> {
    public override fun getValue() = ABI.makeIAppWindow(pointer.getPointer(0))

    public fun setValue(value: IAppWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindow {
    public val __741497130_Ptr: Pointer?

    public val _741497130_VtblPtr: Pointer?
      get() = __741497130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIContentRoot? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContentRoot>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContentRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Frame(): AppWindowFrame? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowFrame>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _741497130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PersistedStateId(): String? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PersistedStateId(value: String?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Presenter(): AppWindowPresenter? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowPresenter>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowPresenter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Title(): String? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_TitleBar(): AppWindowTitleBar? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowTitleBar>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowTitleBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_UIContext(): UIContext? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContext>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_WindowingEnvironment(): WindowingEnvironment? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironment>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CloseAsync(): IAsyncAction? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetPlacement(): AppWindowPlacement? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowPlacement>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetDisplayRegions(): IVectorView<DisplayRegion?>? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayRegion?>>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayRegion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RequestMoveToDisplayRegion(displayRegion: DisplayRegion?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(displayRegion),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun RequestMoveAdjacentToCurrentView(): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun RequestMoveAdjacentToWindow(anchorWindow: AppWindow?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(anchorWindow),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun RequestMoveRelativeToWindowContent(anchorWindow: AppWindow?,
        contentOffset: Point?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(anchorWindow),
          marshalToNative(contentOffset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun RequestMoveRelativeToCurrentViewContent(contentOffset: Point?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(contentOffset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun RequestMoveRelativeToDisplayRegion(displayRegion: DisplayRegion?,
        displayRegionOffset: Point?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(displayRegion),
          marshalToNative(displayRegionOffset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun RequestSize(frameSize: Size?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(frameSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun TryShowAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun add_Changed(handler: TypedEventHandler<AppWindow?,
        AppWindowChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_Closed(handler: TypedEventHandler<AppWindow?,
        AppWindowClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_CloseRequested(handler: TypedEventHandler<AppWindow?,
        AppWindowCloseRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _741497130_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_CloseRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _741497130_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__741497130_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __741497130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("663014a6b75e5dbd995cf0117fa3fb61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindow(ptr: Pointer?): WithDefault = IAppWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindow {
      val address = segment.toRawLongValue()
      return makeIAppWindow(Pointer(address))
    }

    public override fun toNative(obj: IAppWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__741497130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindow): Array<IAppWindow?> = (elements as
        Array<IAppWindow?>).castToImpl<IAppWindow,IAppWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindow?> = arrayOfNulls<IAppWindow_Impl>(size)
        as Array<IAppWindow?>
  }
}
