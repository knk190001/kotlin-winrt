package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.ButtonBase
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Input.ICommand
import Microsoft.UI.Xaml.Style
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

@ABIMarker(IInfoBar.ABI::class)
@Signature("{c1c3a438-dd79-5d22-9e42-5a3cdf8113a9}")
@Guid("c1c3a438dd795d229e425a3cdf8113a9")
@WinRTInterface("c1c3a438dd795d229e425a3cdf8113a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBar.ByReference::class)
public interface IInfoBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(1)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Message(): String?

  @InterfaceMethod(5)
  public fun put_Message(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Severity(): InfoBarSeverity?

  @InterfaceMethod(7)
  public fun put_Severity(value: InfoBarSeverity?): Unit

  @InterfaceMethod(8)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(9)
  public fun put_IconSource(value: IconSource?): Unit

  @InterfaceMethod(10)
  public fun get_IsIconVisible(): Boolean

  @InterfaceMethod(11)
  public fun put_IsIconVisible(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsClosable(): Boolean

  @InterfaceMethod(13)
  public fun put_IsClosable(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CloseButtonStyle(): Style?

  @InterfaceMethod(15)
  public fun put_CloseButtonStyle(value: Style?): Unit

  @InterfaceMethod(16)
  public fun get_CloseButtonCommand(): ICommand?

  @InterfaceMethod(17)
  public fun put_CloseButtonCommand(value: ICommand?): Unit

  @InterfaceMethod(18)
  public fun get_CloseButtonCommandParameter(): IUnknown?

  @InterfaceMethod(19)
  public fun put_CloseButtonCommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun get_ActionButton(): ButtonBase?

  @InterfaceMethod(21)
  public fun put_ActionButton(value: ButtonBase?): Unit

  @InterfaceMethod(22)
  public fun get_Content(): IUnknown?

  @InterfaceMethod(23)
  public fun put_Content(value: IUnknown?): Unit

  @InterfaceMethod(24)
  public fun get_ContentTemplate(): DataTemplate?

  @InterfaceMethod(25)
  public fun put_ContentTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(26)
  public fun get_TemplateSettings(): InfoBarTemplateSettings?

  @InterfaceMethod(27)
  public fun add_CloseButtonClick(handler: TypedEventHandler<InfoBar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_Closing(handler: TypedEventHandler<InfoBar?, InfoBarClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_Closed(handler: TypedEventHandler<InfoBar?, InfoBarClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInfoBar> {
    public override fun getValue() = ABI.makeIInfoBar(pointer.getPointer(0))

    public fun setValue(value: IInfoBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBar {
    public val __3822370_Ptr: Pointer?

    public val _3822370_VtblPtr: Pointer?
      get() = __3822370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _3822370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Message(): String? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Message(value: String?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Severity(): InfoBarSeverity? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarSeverity>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarSeverity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Severity(value: InfoBarSeverity?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsIconVisible(): Boolean {
      val fnPtr = _3822370_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsIconVisible(value: Boolean): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsClosable(): Boolean {
      val fnPtr = _3822370_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsClosable(value: Boolean): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CloseButtonStyle(): Style? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_CloseButtonStyle(value: Style?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_CloseButtonCommand(): ICommand? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_CloseButtonCommand(value: ICommand?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CloseButtonCommandParameter(): IUnknown? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_CloseButtonCommandParameter(value: IUnknown?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ActionButton(): ButtonBase? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ButtonBase>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ButtonBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_ActionButton(value: ButtonBase?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Content(): IUnknown? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Content(value: IUnknown?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_ContentTemplate(): DataTemplate? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_ContentTemplate(value: DataTemplate?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_TemplateSettings(): InfoBarTemplateSettings? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun add_CloseButtonClick(handler: TypedEventHandler<InfoBar?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_CloseButtonClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_Closing(handler: TypedEventHandler<InfoBar?,
        InfoBarClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_Closed(handler: TypedEventHandler<InfoBar?, InfoBarClosedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _3822370_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _3822370_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3822370_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInfoBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __3822370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1c3a438dd795d229e425a3cdf8113a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBar(ptr: Pointer?): WithDefault = IInfoBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBar {
      val address = segment.toRawLongValue()
      return makeIInfoBar(Pointer(address))
    }

    public override fun toNative(obj: IInfoBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__3822370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBar): Array<IInfoBar?> = (elements as
        Array<IInfoBar?>).castToImpl<IInfoBar,IInfoBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBar?> = arrayOfNulls<IInfoBar_Impl>(size) as
        Array<IInfoBar?>
  }
}
