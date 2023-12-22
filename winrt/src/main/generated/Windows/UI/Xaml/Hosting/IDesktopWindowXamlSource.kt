package Windows.UI.Xaml.Hosting

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.UIElement
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
@Signature("{d585bfe1-00ff-51be-ba1d-a1329956ea0a}")
@Guid("d585bfe100ff51beba1da1329956ea0a")
@WinRTInterface("d585bfe100ff51beba1da1329956ea0a")
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
  public fun add_TakeFocusRequested(handler: TypedEventHandler<DesktopWindowXamlSource?,
      DesktopWindowXamlSourceTakeFocusRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_GotFocus(handler: TypedEventHandler<DesktopWindowXamlSource?,
      DesktopWindowXamlSourceGotFocusEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun NavigateFocus(request: XamlSourceFocusNavigationRequest?):
      XamlSourceFocusNavigationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowXamlSource> {
    public override fun getValue() = ABI.makeIDesktopWindowXamlSource(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowXamlSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowXamlSource {
    public val __2082715543_Ptr: Pointer?

    public val _2082715543_VtblPtr: Pointer?
      get() = __2082715543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HasFocus(): Boolean {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun add_TakeFocusRequested(handler: TypedEventHandler<DesktopWindowXamlSource?,
        DesktopWindowXamlSourceTakeFocusRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_GotFocus(handler: TypedEventHandler<DesktopWindowXamlSource?,
        DesktopWindowXamlSourceGotFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun NavigateFocus(request: XamlSourceFocusNavigationRequest?):
        XamlSourceFocusNavigationResult? {
      val fnPtr = _2082715543_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationResult>()
      val hr = fn.invokeHR(arrayOf(__2082715543_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationResult>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopWindowXamlSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2082715543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowXamlSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d585bfe100ff51beba1da1329956ea0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowXamlSource(ptr: Pointer?): WithDefault =
        IDesktopWindowXamlSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopWindowXamlSource {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowXamlSource(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowXamlSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2082715543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowXamlSource):
        Array<IDesktopWindowXamlSource?> = (elements as
        Array<IDesktopWindowXamlSource?>).castToImpl<IDesktopWindowXamlSource,IDesktopWindowXamlSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopWindowXamlSource?> =
        arrayOfNulls<IDesktopWindowXamlSource_Impl>(size) as Array<IDesktopWindowXamlSource?>
  }
}
