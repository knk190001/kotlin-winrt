package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
import Windows.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs
import Windows.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs
import Windows.UI.Xaml.Input.AccessKeyInvokedEventArgs
import Windows.UI.Xaml.Input.ContextRequestedEventArgs
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

@ABIMarker(IUIElement4.ABI::class)
@Signature("{69145cd4-199a-4657-9e57-e99e8f136712}")
@Guid("69145cd4199a46579e57e99e8f136712")
@WinRTInterface("69145cd4199a46579e57e99e8f136712")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement4.ByReference::class)
public interface IUIElement4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContextFlyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_ContextFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(2)
  public fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean

  @InterfaceMethod(3)
  public fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsAccessKeyScope(): Boolean

  @InterfaceMethod(5)
  public fun put_IsAccessKeyScope(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_AccessKeyScopeOwner(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun get_AccessKey(): String?

  @InterfaceMethod(9)
  public fun put_AccessKey(value: String?): Unit

  @InterfaceMethod(10)
  public fun add_ContextRequested(handler: TypedEventHandler<UIElement?,
      ContextRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ContextRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_ContextCanceled(handler: TypedEventHandler<UIElement?, RoutedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_ContextCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<UIElement?,
      AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<UIElement?,
      AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_AccessKeyInvoked(handler: TypedEventHandler<UIElement?,
      AccessKeyInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement4> {
    public override fun getValue() = ABI.makeIUIElement4(pointer.getPointer(0))

    public fun setValue(value: IUIElement4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement4 {
    public val __1021118238_Ptr: Pointer?

    public val _1021118238_VtblPtr: Pointer?
      get() = __1021118238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContextFlyout(): FlyoutBase? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContextFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsAccessKeyScope(): Boolean {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsAccessKeyScope(value: Boolean): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AccessKeyScopeOwner(): DependencyObject? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AccessKey(): String? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_AccessKey(value: String?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ContextRequested(handler: TypedEventHandler<UIElement?,
        ContextRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ContextRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_ContextCanceled(handler: TypedEventHandler<UIElement?,
        RoutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_ContextCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<UIElement?,
        AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<UIElement?,
        AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_AccessKeyInvoked(handler: TypedEventHandler<UIElement?,
        AccessKeyInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118238_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69145cd4199a46579e57e99e8f136712")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement4(ptr: Pointer?): WithDefault = IUIElement4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement4 {
      val address = segment.toRawLongValue()
      return makeIUIElement4(Pointer(address))
    }

    public override fun toNative(obj: IUIElement4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement4): Array<IUIElement4?> = (elements as
        Array<IUIElement4?>).castToImpl<IUIElement4,IUIElement4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement4?> =
        arrayOfNulls<IUIElement4_Impl>(size) as Array<IUIElement4?>
  }
}
