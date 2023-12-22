package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Input.ICommand
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

@ABIMarker(IContentDialog.ABI::class)
@Signature("{38dc4404-d24e-40d8-9415-349464c1afdc}")
@Guid("38dc4404d24e40d89415349464c1afdc")
@WinRTInterface("38dc4404d24e40d89415349464c1afdc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialog.ByReference::class)
public interface IContentDialog : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Title(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_TitleTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_TitleTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_FullSizeDesired(): Boolean

  @InterfaceMethod(5)
  public fun put_FullSizeDesired(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_PrimaryButtonText(): String?

  @InterfaceMethod(7)
  public fun put_PrimaryButtonText(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_SecondaryButtonText(): String?

  @InterfaceMethod(9)
  public fun put_SecondaryButtonText(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_PrimaryButtonCommand(): ICommand?

  @InterfaceMethod(11)
  public fun put_PrimaryButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(12)
  public fun get_SecondaryButtonCommand(): ICommand?

  @InterfaceMethod(13)
  public fun put_SecondaryButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(14)
  public fun get_PrimaryButtonCommandParameter(): IUnknown?

  @InterfaceMethod(15)
  public fun put_PrimaryButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(16)
  public fun get_SecondaryButtonCommandParameter(): IUnknown?

  @InterfaceMethod(17)
  public fun put_SecondaryButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(18)
  public fun get_IsPrimaryButtonEnabled(): Boolean

  @InterfaceMethod(19)
  public fun put_IsPrimaryButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsSecondaryButtonEnabled(): Boolean

  @InterfaceMethod(21)
  public fun put_IsSecondaryButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun add_Closing(handler: TypedEventHandler<ContentDialog?,
      ContentDialogClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_Closed(handler: TypedEventHandler<ContentDialog?, ContentDialogClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_Opened(handler: TypedEventHandler<ContentDialog?, ContentDialogOpenedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_PrimaryButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_PrimaryButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_SecondaryButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_SecondaryButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun Hide(): Unit

  @InterfaceMethod(33)
  public fun ShowAsync(): IAsyncOperation<ContentDialogResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentDialog>
      {
    public override fun getValue() = ABI.makeIContentDialog(pointer.getPointer(0))

    public fun setValue(value: IContentDialog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialog {
    public val __1505079163_Ptr: Pointer?

    public val _1505079163_VtblPtr: Pointer?
      get() = __1505079163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): IUnknown? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: IUnknown?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TitleTemplate(): DataTemplate? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TitleTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FullSizeDesired(): Boolean {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FullSizeDesired(value: Boolean): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PrimaryButtonText(): String? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PrimaryButtonText(value: String?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SecondaryButtonText(): String? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SecondaryButtonText(value: String?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PrimaryButtonCommand(): ICommand? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PrimaryButtonCommand(value: ICommand?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_SecondaryButtonCommand(): ICommand? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_SecondaryButtonCommand(value: ICommand?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PrimaryButtonCommandParameter(): IUnknown? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PrimaryButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_SecondaryButtonCommandParameter(): IUnknown? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_SecondaryButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsPrimaryButtonEnabled(): Boolean {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsPrimaryButtonEnabled(value: Boolean): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsSecondaryButtonEnabled(): Boolean {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsSecondaryButtonEnabled(value: Boolean): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_Closing(handler: TypedEventHandler<ContentDialog?,
        ContentDialogClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_Closed(handler: TypedEventHandler<ContentDialog?,
        ContentDialogClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_Opened(handler: TypedEventHandler<ContentDialog?,
        ContentDialogOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_PrimaryButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_PrimaryButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_SecondaryButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_SecondaryButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun Hide(): Unit {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun ShowAsync(): IAsyncOperation<ContentDialogResult?>? {
      val fnPtr = _1505079163_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentDialogResult?>>()
      val hr = fn.invokeHR(arrayOf(__1505079163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContentDialogResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialog_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1505079163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38dc4404d24e40d89415349464c1afdc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialog(ptr: Pointer?): WithDefault = IContentDialog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialog {
      val address = segment.toRawLongValue()
      return makeIContentDialog(Pointer(address))
    }

    public override fun toNative(obj: IContentDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1505079163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialog): Array<IContentDialog?> = (elements as
        Array<IContentDialog?>).castToImpl<IContentDialog,IContentDialog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialog?> =
        arrayOfNulls<IContentDialog_Impl>(size) as Array<IContentDialog?>
  }
}
