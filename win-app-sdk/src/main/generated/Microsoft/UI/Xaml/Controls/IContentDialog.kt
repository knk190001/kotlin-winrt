package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Input.ICommand
import Microsoft.UI.Xaml.Style
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
@Signature("{ac2145a3-4a32-5305-a81d-47509515bfce}")
@Guid("ac2145a34a325305a81d47509515bfce")
@WinRTInterface("ac2145a34a325305a81d47509515bfce")
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
  public fun get_CloseButtonText(): String?

  @InterfaceMethod(11)
  public fun put_CloseButtonText(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_PrimaryButtonCommand(): ICommand?

  @InterfaceMethod(13)
  public fun put_PrimaryButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(14)
  public fun get_SecondaryButtonCommand(): ICommand?

  @InterfaceMethod(15)
  public fun put_SecondaryButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(16)
  public fun get_CloseButtonCommand(): ICommand?

  @InterfaceMethod(17)
  public fun put_CloseButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(18)
  public fun get_PrimaryButtonCommandParameter(): IUnknown?

  @InterfaceMethod(19)
  public fun put_PrimaryButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun get_SecondaryButtonCommandParameter(): IUnknown?

  @InterfaceMethod(21)
  public fun put_SecondaryButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(22)
  public fun get_CloseButtonCommandParameter(): IUnknown?

  @InterfaceMethod(23)
  public fun put_CloseButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(24)
  public fun get_IsPrimaryButtonEnabled(): Boolean

  @InterfaceMethod(25)
  public fun put_IsPrimaryButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_IsSecondaryButtonEnabled(): Boolean

  @InterfaceMethod(27)
  public fun put_IsSecondaryButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_PrimaryButtonStyle(): Style?

  @InterfaceMethod(29)
  public fun put_PrimaryButtonStyle(value: Style?): Unit

  @InterfaceMethod(30)
  public fun get_SecondaryButtonStyle(): Style?

  @InterfaceMethod(31)
  public fun put_SecondaryButtonStyle(value: Style?): Unit

  @InterfaceMethod(32)
  public fun get_CloseButtonStyle(): Style?

  @InterfaceMethod(33)
  public fun put_CloseButtonStyle(value: Style?): Unit

  @InterfaceMethod(34)
  public fun get_DefaultButton(): ContentDialogButton?

  @InterfaceMethod(35)
  public fun put_DefaultButton(value: ContentDialogButton?): Unit

  @InterfaceMethod(36)
  public fun add_Closing(handler: TypedEventHandler<ContentDialog?,
      ContentDialogClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(37)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(38)
  public fun add_Closed(handler: TypedEventHandler<ContentDialog?, ContentDialogClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(40)
  public fun add_Opened(handler: TypedEventHandler<ContentDialog?, ContentDialogOpenedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(41)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(42)
  public fun add_PrimaryButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(43)
  public fun remove_PrimaryButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(44)
  public fun add_SecondaryButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(45)
  public fun remove_SecondaryButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(46)
  public fun add_CloseButtonClick(handler: TypedEventHandler<ContentDialog?,
      ContentDialogButtonClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(47)
  public fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(48)
  public fun Hide(): Unit

  @InterfaceMethod(49)
  public fun ShowAsync(): IAsyncOperation<ContentDialogResult?>?

  @InterfaceMethod(50)
  public fun ShowAsync(placement: ContentDialogPlacement?): IAsyncOperation<ContentDialogResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContentDialog>
      {
    public override fun getValue() = ABI.makeIContentDialog(pointer.getPointer(0))

    public fun setValue(value: IContentDialog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialog {
    public val __877014202_Ptr: Pointer?

    public val _877014202_VtblPtr: Pointer?
      get() = __877014202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): IUnknown? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: IUnknown?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TitleTemplate(): DataTemplate? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TitleTemplate(value: DataTemplate?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FullSizeDesired(): Boolean {
      val fnPtr = _877014202_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FullSizeDesired(value: Boolean): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PrimaryButtonText(): String? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PrimaryButtonText(value: String?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SecondaryButtonText(): String? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SecondaryButtonText(value: String?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CloseButtonText(): String? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CloseButtonText(value: String?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_PrimaryButtonCommand(): ICommand? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_PrimaryButtonCommand(value: ICommand?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_SecondaryButtonCommand(): ICommand? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_SecondaryButtonCommand(value: ICommand?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_CloseButtonCommand(): ICommand? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_CloseButtonCommand(value: ICommand?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PrimaryButtonCommandParameter(): IUnknown? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_PrimaryButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SecondaryButtonCommandParameter(): IUnknown? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_SecondaryButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CloseButtonCommandParameter(): IUnknown? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_CloseButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsPrimaryButtonEnabled(): Boolean {
      val fnPtr = _877014202_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsPrimaryButtonEnabled(value: Boolean): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsSecondaryButtonEnabled(): Boolean {
      val fnPtr = _877014202_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_IsSecondaryButtonEnabled(value: Boolean): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_PrimaryButtonStyle(): Style? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_PrimaryButtonStyle(value: Style?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SecondaryButtonStyle(): Style? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SecondaryButtonStyle(value: Style?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_CloseButtonStyle(): Style? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_CloseButtonStyle(value: Style?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_DefaultButton(): ContentDialogButton? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogButton>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_DefaultButton(value: ContentDialogButton?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun add_Closing(handler: TypedEventHandler<ContentDialog?,
        ContentDialogClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_Closed(handler: TypedEventHandler<ContentDialog?,
        ContentDialogClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun add_Opened(handler: TypedEventHandler<ContentDialog?,
        ContentDialogOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun add_PrimaryButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun remove_PrimaryButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun add_SecondaryButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun remove_SecondaryButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun add_CloseButtonClick(handler: TypedEventHandler<ContentDialog?,
        ContentDialogButtonClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun Hide(): Unit {
      val fnPtr = _877014202_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun ShowAsync(): IAsyncOperation<ContentDialogResult?>? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentDialogResult?>>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContentDialogResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun ShowAsync(placement: ContentDialogPlacement?):
        IAsyncOperation<ContentDialogResult?>? {
      val fnPtr = _877014202_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContentDialogResult?>>()
      val hr = fn.invokeHR(arrayOf(__877014202_Ptr, marshalToNative(placement), result))
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
    public override val __877014202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac2145a34a325305a81d47509515bfce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialog(ptr: Pointer?): WithDefault = IContentDialog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialog {
      val address = segment.toRawLongValue()
      return makeIContentDialog(Pointer(address))
    }

    public override fun toNative(obj: IContentDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__877014202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialog): Array<IContentDialog?> = (elements as
        Array<IContentDialog?>).castToImpl<IContentDialog,IContentDialog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialog?> =
        arrayOfNulls<IContentDialog_Impl>(size) as Array<IContentDialog?>
  }
}
