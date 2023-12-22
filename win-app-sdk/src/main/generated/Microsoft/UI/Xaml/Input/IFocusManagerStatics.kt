package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.FocusState
import Microsoft.UI.Xaml.UIElement
import Microsoft.UI.Xaml.XamlRoot
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
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

@ABIMarker(IFocusManagerStatics.ABI::class)
@Signature("{e73dce04-e23a-5fb3-96ab-7df04c51dff2}")
@Guid("e73dce04e23a5fb396ab7df04c51dff2")
@WinRTInterface("e73dce04e23a5fb396ab7df04c51dff2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics.ByReference::class)
public interface IFocusManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_GettingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_LosingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun TryFocusAsync(element: DependencyObject?, value: FocusState?):
      IAsyncOperation<FocusMovementResult?>?

  @InterfaceMethod(9)
  public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?):
      IAsyncOperation<FocusMovementResult?>?

  @InterfaceMethod(10)
  public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): IAsyncOperation<FocusMovementResult?>?

  @InterfaceMethod(11)
  public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): Boolean

  @InterfaceMethod(12)
  public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?): DependencyObject?

  @InterfaceMethod(13)
  public fun FindFirstFocusableElement(searchScope: DependencyObject?): DependencyObject?

  @InterfaceMethod(14)
  public fun FindLastFocusableElement(searchScope: DependencyObject?): DependencyObject?

  @InterfaceMethod(15)
  public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): DependencyObject?

  @InterfaceMethod(16)
  public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?):
      UIElement?

  @InterfaceMethod(17)
  public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?,
      hintRect: Rect?): UIElement?

  @InterfaceMethod(18)
  public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?): Boolean

  @InterfaceMethod(19)
  public fun GetFocusedElement(): IUnknown?

  @InterfaceMethod(20)
  public fun GetFocusedElement(xamlRoot: XamlRoot?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics> {
    public override fun getValue() = ABI.makeIFocusManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics {
    public val __1748841627_Ptr: Pointer?

    public val _1748841627_VtblPtr: Pointer?
      get() = __1748841627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_GettingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_LosingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun TryFocusAsync(element: DependencyObject?, value: FocusState?):
        IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(element),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?):
        IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): Boolean {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?):
        DependencyObject? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FindFirstFocusableElement(searchScope: DependencyObject?):
        DependencyObject? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(searchScope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindLastFocusableElement(searchScope: DependencyObject?):
        DependencyObject? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(searchScope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun FindNextElement(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): DependencyObject? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override
        fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?):
        UIElement? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override
        fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?,
        hintRect: Rect?): UIElement? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(hintRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection?): Boolean {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun GetFocusedElement(): IUnknown? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetFocusedElement(xamlRoot: XamlRoot?): IUnknown? {
      val fnPtr = _1748841627_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1748841627_Ptr, marshalToNative(xamlRoot), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1748841627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e73dce04e23a5fb396ab7df04c51dff2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics(ptr: Pointer?): WithDefault = IFocusManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1748841627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics): Array<IFocusManagerStatics?> =
        (elements as
        Array<IFocusManagerStatics?>).castToImpl<IFocusManagerStatics,IFocusManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics?> =
        arrayOfNulls<IFocusManagerStatics_Impl>(size) as Array<IFocusManagerStatics?>
  }
}
