package Microsoft.UI.Xaml.Hosting

import Microsoft.UI.Content.DesktopChildSiteBridge
import Microsoft.UI.WindowId
import Microsoft.UI.Xaml.Media.SystemBackdrop
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

@ABIMarker(IDesktopWindowXamlSource.ABI::class)
@Signature("{553af92c-1381-51d6-bee0-f34beb042ea8}")
@Guid("553af92c138151d6bee0f34beb042ea8")
@WinRTInterface("553af92c138151d6bee0f34beb042ea8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopWindowXamlSource.ByReference::class)
public interface IDesktopWindowXamlSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIElement?

  @InterfaceMethod(1)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_HasFocus(): Boolean

  @InterfaceMethod(3)
  public fun get_SystemBackdrop(): SystemBackdrop?

  @InterfaceMethod(4)
  public fun put_SystemBackdrop(value: SystemBackdrop?): Unit

  @InterfaceMethod(5)
  public fun get_SiteBridge(): DesktopChildSiteBridge?

  @InterfaceMethod(6)
  public fun add_TakeFocusRequested(handler: TypedEventHandler<DesktopWindowXamlSource?,
      DesktopWindowXamlSourceTakeFocusRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_GotFocus(handler: TypedEventHandler<DesktopWindowXamlSource?,
      DesktopWindowXamlSourceGotFocusEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun NavigateFocus(request: XamlSourceFocusNavigationRequest?):
      XamlSourceFocusNavigationResult?

  @InterfaceMethod(11)
  public fun Initialize(parentWindowId: WindowId?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowXamlSource> {
    public override fun getValue() = ABI.makeIDesktopWindowXamlSource(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowXamlSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowXamlSource {
    public val __816601044_Ptr: Pointer?

    public val _816601044_VtblPtr: Pointer?
      get() = __816601044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _816601044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HasFocus(): Boolean {
      val fnPtr = _816601044_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SystemBackdrop(): SystemBackdrop? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdrop>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdrop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SystemBackdrop(value: SystemBackdrop?): Unit {
      val fnPtr = _816601044_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SiteBridge(): DesktopChildSiteBridge? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesktopChildSiteBridge>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesktopChildSiteBridge>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_TakeFocusRequested(handler: TypedEventHandler<DesktopWindowXamlSource?,
        DesktopWindowXamlSourceTakeFocusRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _816601044_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_GotFocus(handler: TypedEventHandler<DesktopWindowXamlSource?,
        DesktopWindowXamlSourceGotFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _816601044_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun NavigateFocus(request: XamlSourceFocusNavigationRequest?):
        XamlSourceFocusNavigationResult? {
      val fnPtr = _816601044_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationResult>()
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Initialize(parentWindowId: WindowId?): Unit {
      val fnPtr = _816601044_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__816601044_Ptr, marshalToNative(parentWindowId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDesktopWindowXamlSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __816601044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowXamlSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("553af92c138151d6bee0f34beb042ea8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowXamlSource(ptr: Pointer?): WithDefault =
        IDesktopWindowXamlSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopWindowXamlSource {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowXamlSource(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowXamlSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__816601044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowXamlSource):
        Array<IDesktopWindowXamlSource?> = (elements as
        Array<IDesktopWindowXamlSource?>).castToImpl<IDesktopWindowXamlSource,IDesktopWindowXamlSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopWindowXamlSource?> =
        arrayOfNulls<IDesktopWindowXamlSource_Impl>(size) as Array<IDesktopWindowXamlSource?>
  }
}
