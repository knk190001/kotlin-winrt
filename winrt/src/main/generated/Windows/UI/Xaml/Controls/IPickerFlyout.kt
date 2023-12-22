package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(IPickerFlyout.ABI::class)
@Signature("{a336ffdb-08d9-43e6-944e-f2e5c7cee630}")
@Guid("a336ffdb08d943e6944ef2e5c7cee630")
@WinRTInterface("a336ffdb08d943e6944ef2e5c7cee630")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyout.ByReference::class)
public interface IPickerFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIElement?

  @InterfaceMethod(1)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_ConfirmationButtonsVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_ConfirmationButtonsVisible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun add_Confirmed(handler: TypedEventHandler<PickerFlyout?, PickerConfirmedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Confirmed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun ShowAtAsync(target: FrameworkElement?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPickerFlyout>
      {
    public override fun getValue() = ABI.makeIPickerFlyout(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyout {
    public val __967495237_Ptr: Pointer?

    public val _967495237_VtblPtr: Pointer?
      get() = __967495237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _967495237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _967495237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ConfirmationButtonsVisible(): Boolean {
      val fnPtr = _967495237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ConfirmationButtonsVisible(value: Boolean): Unit {
      val fnPtr = _967495237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Confirmed(handler: TypedEventHandler<PickerFlyout?,
        PickerConfirmedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _967495237_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Confirmed(token: EventRegistrationToken?): Unit {
      val fnPtr = _967495237_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun ShowAtAsync(target: FrameworkElement?): IAsyncOperation<Boolean>? {
      val fnPtr = _967495237_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__967495237_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPickerFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __967495237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a336ffdb08d943e6944ef2e5c7cee630")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyout(ptr: Pointer?): WithDefault = IPickerFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyout {
      val address = segment.toRawLongValue()
      return makeIPickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__967495237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyout): Array<IPickerFlyout?> = (elements as
        Array<IPickerFlyout?>).castToImpl<IPickerFlyout,IPickerFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyout?> =
        arrayOfNulls<IPickerFlyout_Impl>(size) as Array<IPickerFlyout?>
  }
}
