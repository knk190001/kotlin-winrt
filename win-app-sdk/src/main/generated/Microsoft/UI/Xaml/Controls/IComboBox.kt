package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.ComboBoxTemplateSettings
import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Style
import Windows.Foundation.EventHandler
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBox.ABI::class)
@Signature("{c77da58b-4fd7-51e0-a431-f84658a83e9e}")
@Guid("c77da58b4fd751e0a431f84658a83e9e")
@WinRTInterface("c77da58b4fd751e0a431f84658a83e9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBox.ByReference::class)
public interface IComboBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDropDownOpen(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDropDownOpen(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsEditable(): Boolean

  @InterfaceMethod(3)
  public fun put_IsEditable(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsSelectionBoxHighlighted(): Boolean

  @InterfaceMethod(5)
  public fun get_MaxDropDownHeight(): Double

  @InterfaceMethod(6)
  public fun put_MaxDropDownHeight(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_SelectionBoxItem(): IUnknown?

  @InterfaceMethod(8)
  public fun get_SelectionBoxItemTemplate(): DataTemplate?

  @InterfaceMethod(9)
  public fun get_TemplateSettings(): ComboBoxTemplateSettings?

  @InterfaceMethod(10)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(11)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(13)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(14)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(15)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(17)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(18)
  public fun get_IsTextSearchEnabled(): Boolean

  @InterfaceMethod(19)
  public fun put_IsTextSearchEnabled(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_SelectionChangedTrigger(): ComboBoxSelectionChangedTrigger?

  @InterfaceMethod(21)
  public fun put_SelectionChangedTrigger(value: ComboBoxSelectionChangedTrigger?): Unit

  @InterfaceMethod(22)
  public fun get_PlaceholderForeground(): Brush?

  @InterfaceMethod(23)
  public fun put_PlaceholderForeground(value: Brush?): Unit

  @InterfaceMethod(24)
  public fun get_Text(): String?

  @InterfaceMethod(25)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(26)
  public fun get_TextBoxStyle(): Style?

  @InterfaceMethod(27)
  public fun put_TextBoxStyle(value: Style?): Unit

  @InterfaceMethod(28)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(29)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(30)
  public fun add_DropDownClosed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_DropDownClosed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_DropDownOpened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_DropDownOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_TextSubmitted(handler: TypedEventHandler<ComboBox?,
      ComboBoxTextSubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_TextSubmitted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBox> {
    public override fun getValue() = ABI.makeIComboBox(pointer.getPointer(0))

    public fun setValue(value: IComboBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBox {
    public val __908208092_Ptr: Pointer?

    public val _908208092_VtblPtr: Pointer?
      get() = __908208092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDropDownOpen(): Boolean {
      val fnPtr = _908208092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDropDownOpen(value: Boolean): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsEditable(): Boolean {
      val fnPtr = _908208092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsEditable(value: Boolean): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsSelectionBoxHighlighted(): Boolean {
      val fnPtr = _908208092_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_MaxDropDownHeight(): Double {
      val fnPtr = _908208092_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_MaxDropDownHeight(value: Double): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SelectionBoxItem(): IUnknown? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SelectionBoxItemTemplate(): DataTemplate? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TemplateSettings(): ComboBoxTemplateSettings? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsTextSearchEnabled(): Boolean {
      val fnPtr = _908208092_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsTextSearchEnabled(value: Boolean): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SelectionChangedTrigger(): ComboBoxSelectionChangedTrigger? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxSelectionChangedTrigger>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxSelectionChangedTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_SelectionChangedTrigger(value: ComboBoxSelectionChangedTrigger?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_PlaceholderForeground(): Brush? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_PlaceholderForeground(value: Brush?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_Text(): String? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_TextBoxStyle(): Style? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_TextBoxStyle(value: Style?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_DropDownClosed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_DropDownClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_DropDownOpened(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_DropDownOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_TextSubmitted(handler: TypedEventHandler<ComboBox?,
        ComboBoxTextSubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _908208092_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_TextSubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _908208092_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908208092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __908208092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c77da58b4fd751e0a431f84658a83e9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBox(ptr: Pointer?): WithDefault = IComboBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBox {
      val address = segment.toRawLongValue()
      return makeIComboBox(Pointer(address))
    }

    public override fun toNative(obj: IComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__908208092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBox): Array<IComboBox?> = (elements as
        Array<IComboBox?>).castToImpl<IComboBox,IComboBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBox?> = arrayOfNulls<IComboBox_Impl>(size)
        as Array<IComboBox?>
  }
}
