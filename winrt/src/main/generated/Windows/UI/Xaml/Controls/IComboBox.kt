package Windows.UI.Xaml.Controls

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.Primitives.ComboBoxTemplateSettings
import Windows.UI.Xaml.DataTemplate
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBox.ABI::class)
@Signature("{b9a8d05c-ac97-47f1-a5f4-3f9f4d4b116c}")
@Guid("b9a8d05cac9747f1a5f43f9f4d4b116c")
@WinRTInterface("b9a8d05cac9747f1a5f43f9f4d4b116c")
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
  public fun get_IsSelectionBoxHighlighted(): Boolean

  @InterfaceMethod(4)
  public fun get_MaxDropDownHeight(): Double

  @InterfaceMethod(5)
  public fun put_MaxDropDownHeight(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_SelectionBoxItem(): IUnknown?

  @InterfaceMethod(7)
  public fun get_SelectionBoxItemTemplate(): DataTemplate?

  @InterfaceMethod(8)
  public fun get_TemplateSettings(): ComboBoxTemplateSettings?

  @InterfaceMethod(9)
  public fun add_DropDownClosed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_DropDownClosed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_DropDownOpened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_DropDownOpened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBox> {
    public override fun getValue() = ABI.makeIComboBox(pointer.getPointer(0))

    public fun setValue(value: IComboBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBox {
    public val __1101053575_Ptr: Pointer?

    public val _1101053575_VtblPtr: Pointer?
      get() = __1101053575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDropDownOpen(): Boolean {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDropDownOpen(value: Boolean): Unit {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsEditable(): Boolean {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsSelectionBoxHighlighted(): Boolean {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxDropDownHeight(): Double {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxDropDownHeight(value: Double): Unit {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectionBoxItem(): IUnknown? {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectionBoxItemTemplate(): DataTemplate? {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TemplateSettings(): ComboBoxTemplateSettings? {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_DropDownClosed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_DropDownClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_DropDownOpened(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_DropDownOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1101053575_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1101053575_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1101053575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9a8d05cac9747f1a5f43f9f4d4b116c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBox(ptr: Pointer?): WithDefault = IComboBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBox {
      val address = segment.toRawLongValue()
      return makeIComboBox(Pointer(address))
    }

    public override fun toNative(obj: IComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1101053575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBox): Array<IComboBox?> = (elements as
        Array<IComboBox?>).castToImpl<IComboBox,IComboBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBox?> = arrayOfNulls<IComboBox_Impl>(size)
        as Array<IComboBox?>
  }
}
